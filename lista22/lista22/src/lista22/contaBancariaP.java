package lista22;

public class contaBancariaP {

		 public static void main(String[] args) {
		  contaBancaria conta = new contaBancaria();
		  conta.titular = "João Silva";
		  conta.saldo = 1000.0;

		  conta.depositar(500);
		  conta.sacar(300);
		  conta.mostrarSaldo();
		    }
		}


	

