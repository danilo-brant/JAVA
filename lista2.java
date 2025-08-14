package primeiroProjeto;

public class lista2 {

	public static void main(String[] args) {
		//1 - Resultado de dois números
				Scanner scanner =  new Scanner(System.in);
				int numero11;
				int numero21;
				System.out.print("Informe um número: ");
				numero11 = scanner.nextInt();
				System.out.print("Informe outro número que seja maior que 0: ");
				numero21 = scanner.nextInt();
				double soma = numero11 + numero21;
				double sub = numero11 - numero21;
				double div = numero11 / numero21;
				double mult = numero11 * numero21;
				System.out.println("A soma é: "+ soma);
				System.out.println("A subtração é: "+ sub);
				System.out.println("A divisão é: "+ div);
				System.out.println("A multiplicação é: "+ mult);
				
				System.out.println("\n");
				
				//2 - Cálculo de temperatura
				double temp1;
				System.out.print("Informe a temperatura em Celsius: ");
				temp1 = scanner.nextDouble();
				double multi = temp1 * 1.8;
				double soma1 = multi + 32;
				System.out.println("A temperatura em Celsius é: "+ temp1);
				System.out.println("A temperatura convertida em Fahrenheit é: "+ soma1);
				
				System.out.println("\n");
				
				//3 - Conversão de valor
				double real1;
				System.out.print("Informe o valor em reais: ");
				real1 = scanner.nextDouble();
				double conta = real1 / 5.70;
				System.out.println("O valor em dólar é: "+ conta);
				
				System.out.println("\n");
			
				//4 - Área do retângulo
				double base;
				double altura;
				System.out.print("Informe o valor da base do retângulo: ");
				base = scanner.nextDouble();
				System.out.print("Informe o valor da altura: ");
				altura = scanner.nextDouble();
				double area = base * altura;
				System.out.println("A área do retângulo é: "+ area);
				
				System.out.println("\n");
				
				//5 - Conversor de idade
				int idade;
				System.out.print("Informe a sua idade em anos: ");
				idade = scanner.nextInt();
				int meses = idade * 12;
				System.out.println("Sua idade em meses é "+ meses +" meses.");
				
				System.out.println("\n");
				
				//6 - Conversor de minutos para segundos
				int minutos;
				System.out.print("Informe o tempo em minutos: ");
				minutos = scanner.nextInt();
				double segundos = minutos * 60;
				System.out.println("O tempo informado possui "+ segundos +" segundos.");
				
				System.out.println("\n");
				
				//7 - Custo da compra
				int preco;
				int comprado;
				System.out.print("Qual o preço do produto comprado? ");
				preco = scanner.nextInt();
				System.out.print("Qual foi a quantidade comprada? ");
				comprado = scanner.nextInt();
				double total2 = preco * comprado;
				System.out.println("O total da compra é de "+ total2 +" reais.");
				
				System.out.println("\n");
				
				//8 - Divisão de uma conta de restaurante
				double conta1;
				int pessoas;
				System.out.print("Qual valor total da conta? ");
				conta1 = scanner.nextDouble();
				System.out.print("Informe a quantidade de pessoas que irão dividir: ");
				pessoas = scanner.nextInt();
				double valor1 = conta1 / pessoas;
				System.out.println("Cada pessoa deve pagar R$"+ valor1+".");
				
				System.out.println("\n");
				
				//9 - Cálculo de troco
				double compra1;
				double cliente;
				System.out.print("Qual valor da compra? ");
				compra1 = scanner.nextDouble();
				System.out.print("Qual foi o valor pago por você? ");
				cliente = scanner.nextDouble();
				double troco = cliente - compra1;
				System.out.println("O valor de troco é: "+ troco);
				
				
				System.out.println("\n");
	
	}

}
