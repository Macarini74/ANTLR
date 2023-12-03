import java.util.ArrayList;

public class ComandoCondicao extends Comandos {
	public String condicao;
	public ArrayList<Comandos> lstTrue;
	public ArrayList<Comandos> lstFalse;
	
	public ComandoCondicao(String _cond, ArrayList<Comandos> _lstTrue, ArrayList<Comandos> _lstFalse) {
		condicao=_cond;
		lstTrue=_lstTrue;
		lstFalse=_lstFalse;
	}
	
	public String geraCodigo() {
		String str="\n if("+condicao+"){ \n";
		
		for(Comandos cmd: lstTrue) {
			str+=" "+cmd.geraCodigo();
		}
		str+=" }\n";
		
		if(lstFalse.isEmpty()==false) {
			str+=" else{ \n";
			for(Comandos cmd: lstFalse) {
				str+=" "+cmd.geraCodigo();
			}					
			str+=" } \n";				
		}		
		return str;
	}

}
