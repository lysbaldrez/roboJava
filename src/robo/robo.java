package robo;

import java.util.Scanner; // 1. importando a classe Scanner

public class robo { 
	public static void main (String[] args) {
		
		int horizontal1 = 5;
		int horizontal2 = 6;
		int horizontal3 = 9;
		int sobraHorizontal1;
		int sobraHorizontal2;
		
		int vertical1 = 9; 
		int sobraVertical;
		
		
		int carga1, distancia1, distancia2, distancia3, distancia4, distancia5;
		String direcao1, direcao2, direcao3, direcao4, direcao5;
	    Scanner ler = new Scanner(System.in);
	    System.out.printf("Informe a carga da bateria do rob� \n");
	    carga1 = ler.nextInt();
	    System.out.printf("Informe a 1� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	    direcao1 = ler.next();
	    
	    if(carga1 >= 33) {
	    if (direcao1.equals("DIREITA")) {
		    System.out.printf("Informe a distance, em cm, que o rob� andar� na 1� dire��o \n");
		    distancia1 = ler.nextInt();
	    	if (distancia1 >=3 && distancia1 <=5) { // PRIMEIRO MOVIMENTO Horizontal
	    	    System.out.printf("Informe a 2� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	    	    direcao2 = ler.next();
	    	    sobraHorizontal1 = horizontal1 - distancia1;
	    	    
	    		if (direcao2.equals("FRENTE"))  {
	    			System.out.printf("Informe a distance, em cm, que o rob� andar� na 2� dire��o \n");
	    			distancia2 = ler.nextInt();
	    			
	    			if (distancia2 >=7 && distancia2 <=9) {
		    			System.out.printf("Informe a 3� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	   					direcao3 = ler.next();
	    				sobraVertical = vertical1 - distancia2;
	    				
	    				if (direcao3.equals("DIREITA")) {
	    					System.out.printf("Informe a distance, em cm, que o rob� andar� na 3� dire��o \n");
	    					distancia3 = ler.nextInt();
	    					if ((distancia3 -sobraHorizontal1) >= 2 || (distancia3 - sobraHorizontal1) <= 4) { // SEGUNDO MOVIMENTO Horizontal	    						sobraHorizontal2 = horizontal2 - distancia3;
	    						if(sobraHorizontal1 == 0)
	    							sobraHorizontal2 = horizontal2 - distancia3 -2;
	    						else if(sobraHorizontal1 == 1)
	    							sobraHorizontal2 = horizontal2 - distancia3 -1;
								else
									sobraHorizontal2 = horizontal2 - distancia3;
	    						System.out.printf("Informe a 4� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	    						direcao4 = ler.next();	    						
	    						if (direcao4.equals("TR�S")) {
	    							System.out.printf("Informe a dist�ncia, em cm, que o rob� andar� na 4� dire��o \n");
	    							distancia4 = ler.nextInt();
	    						
	    							if (distancia4 >= 6 || distancia4 < 10 && (sobraVertical + distancia4 == 8)) {
	    								System.out.printf("Informe a 5� dire��o em que o rob� andar� (FRENTE, TR�S, ESQUERDA, DIREITA) \n");
	    								direcao5 = ler.next();
	    								if (direcao5.equals("DIREITA")) {
		    								System.out.printf("Informe a dist�ncia, em cm, que o rob� andar� na 5� dire��o \n");
		    								distancia5 = ler.nextInt();
    										if ((sobraHorizontal1 - sobraHorizontal2) == (distancia5 - horizontal3) || (sobraHorizontal2 - sobraHorizontal1) == (distancia5 - horizontal3)) {
												System.out.println("PARAB�NS!!! Voc� ganhou o pr�mio!");
											}
	    								} else {
	    									System.out.println("Finalizado, ele n�o ganhou o pr�mio");
	    								}
	    							} else {
    									System.out.println("Finalizado, ele n�o ganhou o pr�mio");
    								}
	    						} else {
									System.out.println("Finalizado, ele n�o ganhou o pr�mio");
								}
	    					} else {
								System.out.println("Finalizado, ele n�o ganhou o pr�mio");
							}
	    				} else {
							System.out.println("Finalizado, ele n�o ganhou o pr�mio");
						}
	    			} else {
						System.out.println("Finalizado, ele n�o ganhou o pr�mio");
					}
	    		} else {
					System.out.println("Finalizado, ele n�o ganhou o pr�mio");
				}
	    	} else {
				System.out.println("Finalizado, ele n�o ganhou o pr�mio");
			}
	    } else {
			System.out.println("Finalizado, ele n�o ganhou o pr�mio");
		}
	    }
	    System.out.println("Fim");
	
	}	
}
