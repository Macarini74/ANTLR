
public class ComandoAtribuicao extends Comandos{
	String nomeVar;
	String expArit;
	
	public ComandoAtribuicao(String _nomeVar, String _expArit) {
		nomeVar=_nomeVar;
		expArit=_expArit;
	}
	
	@Override
	public String geraCodigo() {
		return " "+nomeVar+" = "+expArit+";\n";
	}
	
}
