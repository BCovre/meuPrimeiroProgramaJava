/**
 * 
 */
package meuPrimeiroProgramaJava;

/**
 * @author bcovr
 *
 */
public class Principal {
	public static void main(String[] args) {
		
		//Salda��o e pergunta o nome
		System.out.println("Ol� amigo!\nQual � o seu nome?");

		// Ler o nome
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
				
		// Salda��o espec�fica para o nome lido
		System.out.printf("Ol� %s!", nome);
				
		//Nota: Implementar leitura de idade e exibi-la
	}

}
