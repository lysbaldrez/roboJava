package robo;

import java.util.Scanner; // 1. importando a classe Scanner

public class robo { 
	public static void main (String[] args) {
		int carga1, distancia1, distancia2, distancia3, distancia4, distancia5;
		String direcao1, direcao2, direcao3, direcao4, direcao5;
	    Scanner ler = new Scanner(System.in);
	    System.out.printf("Informe a carga da bateria do rob� \n");
	    carga1 = ler.nextInt();
	    System.out.printf("Informe a 1� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	    direcao1 = ler.next();
	    System.out.printf("Informe a dist�ncia, em cm, que o rob� andar� na 1� dire��o \n");
	    distancia1 = ler.nextInt();
	    System.out.printf("Informe a 2� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	    direcao2 = ler.next();
	    System.out.printf("Informe a dist�ncia, em cm, que o rob� andar� na 2� dire��o \n");
	    distancia2 = ler.nextInt();
	    System.out.printf("Informe a 3� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	    direcao3 = ler.next();
	    System.out.printf("Informe a dist�ncia, em cm, que o rob� andar� na 3� dire��o \n");
	    distancia3 = ler.nextInt();
	    System.out.printf("Informe a 4� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	    direcao4 = ler.next();
	    System.out.printf("Informe a dist�ncia, em cm, que o rob� andar� na 4� dire��o \n");
	    distancia4 = ler.nextInt();
	    System.out.printf("Informe a 5� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	    direcao5 = ler.next();
	    System.out.printf("Informe a dist�ncia, em cm, que o rob� andar� na 5� dire��o \n");
	    distancia5 = ler.nextInt();
	    if (direcao1 == "DIREITA") {
	    	if (distancia1 >=3 || distancia1 <=5) {
	    		if (direcao2 == "FRENTE")  {
	    			if (distancia2 >=7 || distancia2 <=9 ) {
	    				if (direcao3 == "DIREITA" ) {
	    					if (distancia3 >= 3 || distancia3 <7) {
	    						if (direcao4 == "TR�S") {
	    							if (distancia4 >= 6 || distancia4 < 10) {
	    								if (direcao5 == "DIREITA") {
	    									if (distancia5 >= 7 || distancia5 <11) {	
	    									}
	    								}
	    							}
	    						}
	    					}
	    				}
	    			}
	    		}
	    	}
	    }	    
	}	
}
