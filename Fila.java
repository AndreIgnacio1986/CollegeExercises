/* Alunos:	André Ferreira Ignacio
 * 			Matheus Sadanori Guibo
 * 			Renan Leite
 * 
 * Tarefa:	Atividade Prática sobre SINGLETON
 * 
 * Responda as perguntas:
 * 		1-)Qual “Design Pattern” deveria ser usado para resolver este problema?
 * 			R: SINGLETON
 * 		2-)Qual propósito deste Pattern?
 * 			R: impedir múltiplas instâncias de uma mesma classe
 * 		3-)O que é “lazy initialization”?
 * 			R: é a criação do objeto (único) apenas quando for ser utilizado.
 * 		4-)Implemente a classe descrita no diagrama usando o “pattern” identificado no item “a”. Certifique-se
*			que apenas uma instância da classe “Fila” pode ser criada. Esta classe deve ser preferencialmente
*			implementada em Java mas podem ser usadas outras linguagens orientadas a objeto de sua
*			preferência. Sua versão desta classe deve ser colocada em um repositório publico do GitHub cujo o
*			link deve ser submetido como resposta desta atividade.
 * */



public class Fila {
	private static Fila instancia;
	
	private Fila() {}
	
	public static Fila getInstancia() {
		if(instancia == null) {
			instancia = new Fila();
		}
		return instancia;
	}
	
	public void ImprimeDocumento() {
        // Code
    }

    public void RemoveDocumento() {
        // Code
    }

    public void RemoveTodosDocumentos() {
        // Code
    }
}
