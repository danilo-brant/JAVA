package primeiroProjeto;

import java.util.Scanner;

public class lista05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//1
		 double idade;
		 System.out.println("Qual sua idade");
		idade = scanner.nextDouble();
		 if(idade  <=12) {
			 System.out.println("Criança");
		 }else if (idade <=17) {
			 System.out.println("Adolescente");
		 }else if (idade <=59){
			 System.out.println("Adulto");
		 }else {
			 System.out.println("Idoso");
		 }
		 
		 //2
		 double temperatura;
		 System.out.println("Qual é temperatura?");
		 temperatura = scanner.nextDouble();
		 if (temperatura <= 10) {
			 System.out.println("Muito frio");
		 }else if (temperatura <=20) {
			 System.out.println("Frio");
		 }else if (temperatura <=30) {
			 System.out.println("Agradável");
		 }else  {
			 System.out.println("Muito Quente ");
		 }
		 //3
		 double nota ;
		 System.out.println("Qual foi sua nota");
		 nota = scanner.nextDouble();
		 if (nota >= 90) {
			 System.out.println("A");
		 }else if (nota >=80) {
			 System.out.println("B");
		 }else if (nota >=70) {
			 System.out.println("C");
		 }else if (nota >=60) {
			 System.out.println("D");
		 }else {
			 System.out.println("F");
		 }
		 
		 //4
		 
		 System.out.println("Digite sua senha");
		 String senha =scanner.next();
		 if (senha == "admin") {
			 System.out.println("Acesso permitido");
		 }else {
			 System.out.println("Acessor negado");
		 }
		 //5
		 String nome1 =scanner.next();
		 String nome2 =scanner.next();
		 if(nome1.equals(nome2)) {
			 System.out.println("Os nomes são iguais ");
		 }else {
			 System.out.println("Os nomes são diferentes");
		 }
		 //6
		 System.out.println("Informe sua cor favorita cor: ");
			String cor = scanner.next();
			if (cor.equalsIgnoreCase("azul")) {
				System.out.println("Boa escolha!");
			}else if (cor.equalsIgnoreCase("vermelho")) {
				System.out.println("A cor vibrante!");
			}else {
				System.out.println("Cor não cadastrada");
			}
			//7
			System.out.println("Digite a letra: ");
			String letra = scanner.next();
			if (letra.equalsIgnoreCase("a")) {
				System.out.println("É uma vogal.");
			}else if (letra.equalsIgnoreCase("e")) {
				System.out.println("É uma vogal.");
			}else if (letra.equalsIgnoreCase("i")) {
				System.out.println("É uma vogal.");
			}else if (letra.equalsIgnoreCase("o")) {
				System.out.println("É uma vogal.");
			}else if (letra.equalsIgnoreCase("u")) {
				System.out.println("É uma vogal.");
			}else {
				System.out.println("Não é uma vogal.");
			}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
			 
	}

}
