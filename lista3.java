package primeiroProjeto;

import java.util.Scanner;

public class lista3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		//1
		double  num1;
		double  num2;
	   System.out.println("fale um número");
		num1=scanner.nextDouble();
	   System.out.println("fale outro número");
	   num2=scanner.nextDouble();
	   double soma =num1+num2;
	   System.out.println("seu valor é "+soma);
	  //2
	   double num3;
	   double num4;
	   System.out.println("Fale um número");
	   num3=scanner.nextDouble();
	   System.out.println("Fale outro número ");
	   num4=scanner.nextDouble();
	   double div = num3/num4;
	   System.out.println("O resultado é "+div);
	   //3
	   double lado1;
	   double lado2;
	   double lado3;
	   System.out.println("Informe o valor do lado 1  ");
	   lado1=scanner.nextDouble();
	   System.out.println("Valor do lado2");
	   lado2=scanner.nextDouble();
	   System.out.println("Valor do lado3");
	   lado3=scanner.nextDouble();
	   double trin =lado1+lado2+lado3;
	   System.out.println("O valor do perimetro é "+trin);
	   //4
	   double conta;
	   double gorjeta;
	   System.out.println("Informe o valor da conta");
	   conta=scanner.nextDouble();
	   System.out.println("Informe o valor da % gorjeta");
	   gorjeta=scanner.nextDouble();
	   double total= conta * gorjeta/100;
	   double total1= conta +  total;
	   System.out.println("O valor da gorjeta será"+total+"\nO valor total a pagar será"+total1);
	   
	   //5
	   double raio1;
	  
	   System.out.println("Informe o valor do raio , para calcular o valor da área do circulo");
	   raio1=scanner.nextDouble();
	   double area= 3.14159 *raio1 *raio1;
	   System.out.println("O valor total da area será "+area);
	   
	   //6
	   double idade;
	   System.out.println("Informe sua idade");
	   idade=scanner.nextDouble();
	   double meses = idade*12;
	   double dias = (idade*365)+(meses*30);
	   System.out.println("Voçê viveu "+dias);
	   
	   //7
	   double horas;
		double valor;
		System.out.print("Informe o número de horas trabalhadas: ");
		horas = scanner.nextDouble();
		System.out.print("Informe o valor pago por hora: ");
		valor = scanner.nextDouble();
		double salarioB = horas * valor;
		double imposto = salarioB *0.10;
		double salarioL = salarioB - imposto;
		System.out.println("O salário bruto será R$"+salarioB+". O imposto R$"+imposto+" e o salário líquido será R$"+salarioL);
			   
	   
	   

	}

}
