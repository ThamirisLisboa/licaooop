package fundamentoseletronico;

public class EletronicoMain {
 public static void main(String []args) {
	 ProdutoEletronico celular = new ProdutoEletronico();
	 System.out.println();
	 celular.marca = "Apple";
	 celular.cor = "preto";
	 celular.senha = false;
	 celular.ram = "4g";
	 celular.memoria = "64g";
	 
	 celular.imprimir();
	 celular.senha();
			 
}
}