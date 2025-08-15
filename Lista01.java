package primeiroProjeto;

public class Lista01 {

	public static void main(String[] args) {
		// 1 - Cálculo para empresa
		   double instalacao = 300.00;
		   double limpeza = 150.00;
		   double manutencao = 499.99;
		   double pagar = instalacao + limpeza + manutencao;
		   System.out.println("O cliente deverá pagar " + pagar + "\n");
		   
		   // 2 - Cálculo de salário
		   double joaquim = 35.00;
		   int hours = 8;
		   double work = joaquim * hours;
		   System.out.println("No final do dia ele deve receber " + work + "\n");
		   
		   // 3 - Caixas de bombons
		   int unidad = 27;
		   int bombom = 16;
		   int quantbmbm = unidad * bombom;
		   System.out.println("A quantidade de bombons que ela tem é " + quantbmbm + "\n");
		   
		   // 4 - Garrafas de água
		   int garrafa = 300;
		   int caixa = 20;
		   int soma = garrafa / caixa;
		   System.out.println("A quantidade de caixas usadas foi de " + soma + "\n");
		   
		   // 5 - Cálculo para camisetas
		   int compradas = 120;
		   int vendidas = 80;
		   int compradas2 = 50;
		   int restante = (compradas - vendidas) + compradas2;
		   double preco = 30.00;
		   double faturamento = vendidas * preco;
		   System.out.println("Camisetas no estoque: " + restante);
		   System.out.println("Faturamento: " + faturamento + "\n");
		   
		   // 6 - Dobro e Metade
		   int dem = 14;
		   double dobro = dem * 2;
		   double metade = dem / 2;
		   System.out.println("Dobro: " + dobro );
		   System.out.println("Metade: " + metade );

	}

}
