
public class Calculadora{
	private double memoria;
	private String cor;
	
	//Construtor
	public Calculadora (double memoria,String cor) {
		this.memoria= memoria;
		this.cor= cor;
	}
	//fazendo um get para acessar as informações
	public double getMemoria() {
		return memoria;
	}
	
	public String getCor() {
		return cor;
	}

	//fazendo o set agora 
	
	public void setMemoria(double memoria) {
		this.memoria=memoria;
	}
	public void setCor(String cor) {
		this.cor=cor;
	}
	//operações
	
	public double somar(double a,double b) {
		return a + b;
	}
	public double subtrair(double a,double b) {
		return a - b;
		
	}
	public double multiplicar(double a,double b) {
		return a * b;
	}
	public double dividir(double a,double b) {
		if(b!=0) {
			return a /b;
		}else {
			System.out.println("Não é possivel realizar a divisão.");
			return 0;
		}
	}
	public int elevaraoquadrado(int a) {
		return a * a;
	}
	public int elevaraocubo(int a) {
		return a * a * a;
	}
	
	public void imprimirinfo() {
		System.out.println("\n -----Informações Calculadora------");
		System.out.println("Memoria:" + memoria);
		System.out.println("Cor:" + cor);

	}
}	
	

	
