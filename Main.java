import java.io.IOException;
import java.util.HashMap;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CharStream cs= CharStreams.fromFileName("programa11.gyh");
		GramaticaLexer lexer= new GramaticaLexer(cs);

		
		CommonTokenStream tokens= new CommonTokenStream(lexer);
		GramaticaParser parser= new GramaticaParser(tokens);
		parser.programa();
		/*
		Token t;
		while((t=lexer.nextToken()).getType()!=Token.EOF) {
			System.out.println("<"+ lexer.VOCABULARY.getSymbolicName(t.getType())+", "+t.getText()+">");			
		}
		*/
		
/*		
		
		HashMap<Integer, String> carro = new HashMap<Integer, String>();
		       //key, informação
		carro.put(101, "SW4");
		carro.put(100, "Gol");
		carro.put(200, "Jeep");
		carro.put(500, "Celta");
		carro.put(356, "Yaris");
		System.out.println(carro.get(200));
		
		
		/*
		for(String c: carro.values()) {
			System.out.println(c);
		}
		*/
		
		
		
		
		
		
	}

}
