import java.util.ArrayList;
import java.util.HashMap;

public class TabelaSimbolos {
	HashMap<String,Simbolo> table=new HashMap<String,Simbolo>();
	
	public void add(String chave, Simbolo simb) {
		if(table.containsKey(chave)==true) {
			System.out.println("\n\nErro semantico: redeclaração de variável "+chave);
			System.exit(0);
		}
		else table.put(chave, simb);
	}
	
	public void imprime() {
		for(Simbolo s: table.values()) {
			System.out.println(s.toString());
		}
	}
	
	public ArrayList<Simbolo> getAll(){
		ArrayList<Simbolo> list= new ArrayList<Simbolo>();
		for(Simbolo simbolo: table.values()) {
			list.add(simbolo);
		}
		return list;
	}
}
