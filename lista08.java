package primeiroProjeto;

import java.util.Scanner;



public class lista08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um número de 1 a 7");
		int dia = scanner.nextInt();
		switch (dia) {
		
		case 1:
			System.out.println("Fim de Semana");
			break;
		case 2:
			System.out.println("Dia útil");
			break;
		case 3:
			System.out.println("Dia útlil");
			break;
		case 4:
			System.out.println("Dia últil");
		break;
		case 5:
			System.out.println("Dia últil");
			break;
		case 6:
			System.out.println("Dia últil");
			break;
		case 7 :
			System.out.println("Fim de Semana");
			break;
			default:
				System.out.println("Dia Inválido");
		}
		
		System.out.println("====================================");
		
		//2
		System.out.println("Informe o código da babida");
		int bedida ;
		bedida = scanner.nextInt();
		switch(bedida) {
		
		case 1:
			System.out.println("Café ........ R$5,00");
			break;
		case 2:
			System.out.println("Chá ........3,50");
			break;
		case 3:
			System.out.println("Suco ........4,00");
			break;
		case 4:
			System.out.println("Refrigeramte ........4,50");
			default:
				System.out.println("Código inválido");
		}
				
				//3
				
				
				System.out.println("Informe um código ");
				int car;
				car = scanner.nextInt();
				switch (car) {
				
				case 1:
					System.out.println("Carro ........leve");
					break;
				case 2:
					System.out.println("Moto........ Motocicleta");
					break;
				case 3:
					System.out.println("Caminhão........Pesado");
					break;
					default:
						System.out.println("Veiculo inválido");
						
				}
			
				//4
				System.out.println("Informe um código");
				String cod = scanner.next();
				switch (cod.toLowerCase()) {
				case "Básico":
					System.out.println("Básico........Acesso limitado");
					break;
				case "Intermediário" :
					System.out.println("Intermediário ........ Acesso padrão + suporte");
					break;
				case "Premium":
					System.out.println("Premium........Acesso total + suporte prioritário");
		
						break;
						default:
							System.out.println("Plano inválido");
			

			
				}
				
				
				//5
				System.out.println("Informe um número de 1 a 12");
				int num = scanner.nextInt();
				switch (num) {
				    case 12: case 1: case 2:
				        System.out.println("Verão");
				        break;
				    case 3: case 4: case 5:
				        System.out.println("Outono");
				        break;
				    case 6: case 7: case 8:
				        System.out.println("Inverno");
				        break;
				    case 9: case 10: case 11:
				        System.out.println("Primavera");
				        break;
				    default:
				        System.out.println("Mês inválido");
				}
				
				
				
		
			
				 // 6 - 
		        System.out.println("Informe o código do ingresso (1 = Inteira, 2 = Meia-entrada, 3 = VIP)");
		        int ingresso = scanner.nextInt();
		        switch (ingresso) {
		            case 1:
		                System.out.println("Inteira = R$50,00");
		                break;
		            case 2:
		                System.out.println("Meia-entrada = R$25,00");
		                break;
		            case 3:
		                System.out.println("VIP = R$100,00");
		                break;
		            default:
		                System.out.println("Ingresso inválido");
		        }
		        
		      
		        
		        // 7 - 
		        System.out.println("Informe o código do idioma (1 = Português, 2 = Inglês, 3 = Espanhol)");
		        int idioma = scanner.nextInt();
		        switch (idioma) {
		            case 1:
		                System.out.println("Olá!");
		                break;
		            case 2:
		                System.out.println("Hello!");
		                break;
		            case 3:
		                System.out.println("Hola!");
		                break;
		            default:
		                System.out.println("Idioma inválido");
		        }
		        
		       
		        // 8 - o
		        System.out.println("Informe o código de nível (1 = Usuário, 2 = Moderador, 3 = Administrador)");
		        int nivel = scanner.nextInt();
		        switch (nivel) {
		            case 1:
		                System.out.println("Acesso básico");
		                break;
		            case 2:
		                System.out.println("Acesso básico + edição");
		                break;
		            case 3:
		                System.out.println("Acesso total");
		                break;
		            default:
		                System.out.println("Nível inválido");
		        }
		        
		       
		        
		        // 9 
		        System.out.println("Informe o código de pagamento (1 = Dinheiro, 2 = Cartão de Crédito, 3 = Pix)");
		        int pagamento = scanner.nextInt();
		        switch (pagamento) {
		            case 1:
		                System.out.println("Pagamento em dinheiro confirmado");
		                break;
		            case 2:
		                System.out.println("Pagamento com cartão processado");
		                break;
		            case 3:
		                System.out.println("Pagamento via Pix realizado");
		                break;
		            default:
		                System.out.println("Método inválido");
		        }
	
				
				
				
		
		
		

	}

}
