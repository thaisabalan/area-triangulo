import java.util.Scanner;

//Declare as variaveis: base, altura e area
//Peça para a pessoa inserir as variaveis: base e altura
//Leia as informações dadas: base e altura
//Calcule a area: multiplicando a base pela altura 
//Divida o resultado por 2
//Printe ao usuario o resultado da area

class CalculoTriangulo {
	public static void main(String args[]){
		
    		Double base, altura, area;
    
    		Scanner lerTeclado = new Scanner(System.in);
			
			System.out.print("Digite o numero da sua base \n");
    		base = lerTeclado.nextDouble();
			
			System.out.print("Digite o numero da sua altura \n");
    		altura = lerTeclado.nextDouble();
			
			area = (base * altura) / 2;
			
			System.out.print("A area do seu triangulo e de " + area);

		
	}

}
