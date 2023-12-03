
public class Simbolo {
	String nomeVar;
	String tipoVar;
	String valorVar;
	//demais infos considerar
	
	public Simbolo(String _nome, String _valor, String _tipo) {
		nomeVar= _nome;
		valorVar=_valor;
		tipoVar=_tipo;
	}
	
	@Override
	public String toString() {
		return "["+nomeVar+","+tipoVar+"]";
	}
	
	public String geraCodigo() {
		if(tipoVar.equals("integer")==true) {  // Nome [integer]
			return " int "+nomeVar+";\n" ;
		}
		else {
			return " float "+nomeVar+";\n" ;
		}
	}
}
