grammar Gramatica;

@header{
	import java.util.ArrayList;
}
/*
@members{
	//Comando Atribuicao
	public String  _nomeVar;
	public String  _tipoVar;
	public String  _valorVar;
	public Simbolo _simbolo;
	
	public TabelaSimbolos _tabela = new TabelaSimbolos();
	
	public GeraCodigo programa= new GeraCodigo();
	
	//Condicional
	public String _condicao;
	public ArrayList<Comandos> _lstTrue = new ArrayList<Comandos>();
	public ArrayList<Comandos> _lstFalse = new ArrayList<Comandos>();
	
	//Lista de Comandos
	public ArrayList<Comandos> cmdList= new ArrayList<Comandos>(); //lista auxiliar
	public ArrayList<Comandos> cmdListFim= new ArrayList<Comandos>(); //lista definitiva
	
	
}
*/

programa: IniDelim PCDec FimDelim listaDeclaracoes IniDelim PCProg FimDelim listaComandos;


listaDeclaracoes returns [int qtdeDec]: {$qtdeDec=0;} 
										(declaracao {$qtdeDec++;})+
										{System.out.println("A qtde de variaveis declaradas eh: "+$qtdeDec);};


declaracao: Var IniDelim tipoVar FimDelim;
						 
listaComandos: (comando)+;  

expressaoAritmetica: termoAritmetico expressaoAritmetica2 | termoAritmetico;
expressaoAritmetica2: OpAritSoma termoAritmetico expressaoAritmetica | OpAritSub termoAritmetico expressaoAritmetica;

termoAritmetico: fatorAritmetico termoAritmetico2 | fatorAritmetico;
termoAritmetico2: OpAritMult fatorAritmetico termoAritmetico | OpAritDiv fatorAritmetico termoAritmetico;

fatorAritmetico: tipoVar | Var | AbrePar expressaoAritmetica FechaPar;

comando: comandoCondicao | comandoAtribuicao | comandoEntrada | comandoSaida | comandoRepeticao | subAlgoritmo;

comandoAtribuicao: Var Atrib expressaoAritmetica;

comandoEntrada: PCLer Var;

comandoSaida: PCImprimir Var | PCImprimir Cadeia;

comandoCondicao: PCSe comandoCondicao2;
comandoCondicao2: expressaoRel PCEntao comando | expressaoRel PCEntao comando PCSenao comando;

comandoRepeticao: PCEnqto expressaoRel PCEntao comando;

subAlgoritmo: PCIni listaComandos PCFim;

expressaoRel:  termoRelacional expressaoRel2 | termoRelacional;
expressaoRel2: operadorBooleano termoRelacional expressaoRel;

termoRelacional: expressaoAritmetica opRel expressaoAritmetica | AbrePar expressaoRel FechaPar;

opRel: OpRelMaior | OpRelMaiorIgual | OpRelMenor | OpRelMenorIgual | OpRelDif | OpRelIgual;

operadorBooleano: OpBoolE | OpBoolOu;

tipoVar: PCInt | PCReal;

Atrib: '<<';

IniDelim:'[';
FimDelim: ']';

OpRelMaior: '>';
OpRelMaiorIgual: '>=';
OpRelMenor: '<';
OpRelMenorIgual: '<=';
OpRelDif: '<>';
OpRelIgual: '==';

OpAritMult: '*';
OpAritDiv: '/';
OpAritSoma: '+';
OpAritSub: '-';

OpBoolE: 'and';
OpBoolOu: 'or';

AbrePar: '(';
FechaPar: ')';

PCDec: 'dec';
PCImprimir: 'print';
PCSe: 'if';
PCEntao: 'then';
PCSenao: 'else';
PCEnqto: 'while';
PCIni: 'start';
PCFim: 'end';
PCProg: 'prog';
PCInt: 'integer';
PCReal: 'float'; 
PCLer: 'read';

Var: [A-Z] ([A-Z] | [a-z] | [0-9])*;
Cadeia:'"'([A-Z] | [a-z] | [0-9] | '!' | ' ' | '&')*'"';

NumInt: [0-9]+;
NumReal: [0-9]+'.'[0-9]*;

Coment: ('#' ([A-Z] | [a-z] | [0-9] | '!' | ' ' | '@' | '%' | '&' |'#' | '\t' | '\r' | 'á' | 'é' | 'í' | 'ó' | 'ú' | 'ç' | 'ã' | 'õ' | '+' | '-' | '*' )*) ->skip;

EspBranco:('\n' | '\t' | '\r' |' ')->skip;
