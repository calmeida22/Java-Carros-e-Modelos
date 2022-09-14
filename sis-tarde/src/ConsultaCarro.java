
public class ConsultaCarro {

	public static void main(String[] args) {
		
		//testando criar objeto.
		Carro c1 = new Carro(2022,"Mod01",25000.00);
		System.out.println("MODELO: "+c1.getModelo()+" ANO: "+c1.getAno()+" PREÇO: R$"+c1.getPreco());
		
		System.out.println();

		//testando métodos Set.
		c1.setAno(2000);
		System.out.println("ANO: "+c1.getAno());
		c1.setModelo("Mod001");
		System.out.println("MODELO: "+c1.getModelo());
		c1.setPreco(26000);
		System.out.println("PREÇO: "+c1.getPreco());
		
		System.out.println();
		
		//testando criar objeto diferentes de 2022 e funcionalidades Get.
		Carro c2 = new Carro(1999,"Mod02",10000);
		System.out.println("ANO: "+c2.getAno());
		System.out.println("MODELO: "+c2.getModelo());
		System.out.println("PREÇO: "+c2.getPreco());
		
		System.out.println();
		
		//testando criar objetos apenas de 2022.
		Carro c3 = new Carro("Mod02",10000);
		System.out.println("ANO: "+c3.getAno());
		System.out.println("MODELO: "+c3.getModelo());
		System.out.println("PREÇO: "+c3.getPreco());
		
		System.out.println();
		Carro c4 = new Carro(1891,"Mod04",-20000);
		System.out.println("MODELO: "+c4.getModelo()+" ANO: "+c4.getAno()+" PREÇO: R$"+c4.getPreco());
		
		System.out.println();
		Carro c5 = new Carro(1890,"Mod05",20000);
		System.out.println("MODELO: "+c5.getModelo()+" ANO: "+c5.getAno()+" PREÇO: R$"+c5.getPreco());
		
		System.out.println();
		Carro c6 = new Carro(1891,null,20000);
		System.out.println("MODELO: "+c6.getModelo()+" ANO: "+c6.getAno()+" PREÇO: R$"+c6.getPreco());
		
		

	}

}
