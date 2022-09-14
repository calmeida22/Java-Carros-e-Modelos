
public class Carro {
	private int ano;
	private String modelo;
	private double preco;

	public Carro(int ano, String modelo, double preco) {
		if (ano < 1891) {
			System.out.println("Não é possível cadastrar anos anteriores a 1891. Será atribuído 9999.");
			this.ano = 9999;
			return;
		}  
		this.ano = ano;
		
		if (modelo == null) {
			System.out.println("Não é possível cadastrar modelo vazio.");
			this.modelo = "PADRAO";
			return;
		}
		this.modelo = modelo;
		
				
		if (preco <= 0) {
			System.out.println("Não é possível cadastrar preço menor ou igual a zero. Será atribuído 99");
			this.preco = 99;
			return;
		}
		this.preco = preco;			
	}

	public Carro (String modelo, double preco) {
		this(2022,modelo,preco); //Para utilizar as condições do outro construtor, sem ter que inserir todos aqui. this () faz referência a outro construtor.
	}
	
	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
