
public class Main{
	public static void main(String[] args) {
		Calculadora cal= new Calculadora(0,"Vermelho");
		
		double resultadosoma=cal.somar(10.5,12.5);
		cal.setMemoria(resultadosoma);
		
		double resultadomulti= cal.multiplicar(3.5,6.0);
		cal.setMemoria(resultadomulti); 
		
		cal.imprimirinfo();
		
		System.out.println("Resultado soma: " + resultadosoma);
		System.out.println("Resultado multiplicação: " + resultadomulti);
		System.out.println("Resultado quadrado de 8: " + cal.elevaraoquadrado(8));
		System.out.println("Resultado cubo de 3: " + cal.elevaraocubo(3));
		
		
	}
}	