
package Fundamentospoo;

public class Exercicio1 {

     String nome;
     boolean cadastro;
	 int idade;
	 double saldo;
	 
	 public void entrada() {
		 if (cadastro == false) {
				System.out.println(" Não há cadastro deste cliente");
			}
			else {
				System.out.println("Bem-vindo a sua conta!");
			}
		}
		
		public void cadastrar() {
			this.cadastro = true;		
		}
		public void desistencia() {
			this.cadastro = false;
			
		}
		public void status() {
			
			System.out.println("nome: " + this.nome);
			System.out.println("idade: " + this.idade);
			System.out.printf("saldo: %.2f" , this.saldo );
		}
		
}
	


	

