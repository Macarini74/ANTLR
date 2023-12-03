import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class GeraCodigo {
	public TabelaSimbolos tabela;
	public ArrayList<Comandos> lst;

	public ArrayList<Comandos> getLst() {
		return lst;
	}

	public void setLst(ArrayList<Comandos> lst) {
		this.lst = lst;
	}

	public TabelaSimbolos getTabela() {
		return tabela;
	}

	public void setTabela(TabelaSimbolos tabela) {
		this.tabela = tabela;
	}
	
	public void gerador() {
		
		StringBuilder str=new StringBuilder();
		str.append("#include <stdio.h>\n");
		str.append("#include <stdlib.h>\n");
		str.append("#include <stdbool.h>\n\n\n");
		
		str.append("int main(void) {\n\n");
		for(Simbolo simbolo: tabela.getAll()) {
			str.append(simbolo.geraCodigo());
		}
		
		for(Comandos cmd: lst) {
			str.append(cmd.geraCodigo());
		}
		
		str.append("\n return 0;\n}");
		
		FileWriter file;
		try {
			file = new FileWriter(new File("codigoGyh.c"));
			file.write(str.toString());
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
