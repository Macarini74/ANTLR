
public class ComandoEscrita extends Comandos{
	public String id; //conteudo a ser impresso

	public ComandoEscrita(String _id) {
		id=_id;
	}
	
	@Override
	public String geraCodigo() {
		// TODO Auto-generated method stub
		return " printf(\" %d\","+id+"); \n"; //printf("%d", id);
	}
	

}
