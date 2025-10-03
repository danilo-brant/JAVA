package primeiroProjeto;

public class lista17 {

    public static void main(String[] args) {
        mensagem();  
        frase();
        contagem();
        vogal();
        quadrado();
        par();
        contagemRegressiva();
        triangulo();
        
    }

   //1
    public static void mensagem() {
        for (int i = 0; i < 8; i++) {
            System.out.println("danilo");
        }
        
    }        
        
    //2
    public static void frase() {
    	System.out.println("O impossível é só um ponto de vista; levante-se, tente de novo e surpreenda a si mesmo.");
    	
    	
    }
        
        
     //3
    public static void contagem() {
    	for (int i =1; i <=10;i++) {
    		System.out.println(i);
    	}
    }
    
        //4 
    public static void vogal() {
    	char [] vogais = {'A', 'E', 'I','O','U'};
    	System.out.println(vogais);
    }
        
        //5
    public static void quadrado() {
    	int quadrado = 5;
    	 for (int i = 0; i < 5; i++) {
    		 System.out.println("*********");
    		 
    }
    }   
        
        
        //6
    public static void par() {
    	 for (int i = 2; i <= 20; i+=2) {
    	System.out.println(i);
    }
    
    }
        
    //7
    
 
    public static void contagemRegressiva() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim!");
    }

    //8
    public static void triangulo() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //9 
    public static void diasDaSemana() {
        String[] dias = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira",
                         "Quinta-feira", "Sexta-feira", "Sábado"};
        for(String dia : dias) {
            System.out.println(dia);
        }
        
        
        
        
        
    }
}
   

