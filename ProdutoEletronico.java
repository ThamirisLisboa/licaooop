

//3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
//referentes esta classe, em seguida crie um objeto produto eletr�nico,//
//defina as instancias deste objeto e apresente as informa��es deste objeto//
//no console.//
package fundamentoseletronico;

public class ProdutoEletronico {
 
	String marca, cor,ram, memoria;
    boolean senha;
   
    
    public void senha (){
     if (senha == true) {
      System.out.println( " ola de volta ");
     }
     else {
    	 System.out.println("Esse celular esta bloqueado, coloque a senha");
     }
    }
    public void marca() {
    	this.marca = marca ; 
    }
    public void cor() {
    	this.cor = cor ;
    }
    
    
    public void ram () {
    	this.ram = ram ;
    }
    public void memoria () {
     this.memoria = memoria;
}
    public void imprimir() {
    	{
    		System.out.println("marca: " + this.marca);
    		System.out.println("cor : " + this.cor);
    		
    		System.out.println("memoria:" + this.memoria);
    	}
}
}
