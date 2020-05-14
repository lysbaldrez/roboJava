package robo;

import java.util.Scanner; // 1. importando a classe Scanner

public class robo { 
	public static void main (String[] args) {
		int carga1, distancia1, distancia2, distancia3, distancia4, distancia5;
		String direcao1, direcao2, direcao3, direcao4, direcao5;
	    Scanner ler = new Scanner(System.in);
	    System.out.printf("Informe a carga da bateria do robô \n");
	    carga1 = ler.nextInt();
	    System.out.printf("Informe a 1º direção em que o robô andará (FRENTE, TRÁS, ESQUERDA, DIREITA) \n");
	    direcao1 = ler.next();
	    System.out.printf("Informe a distância, em cm, que o robô andará na 1ª direção \n");
	    distancia1 = ler.nextInt();
	    System.out.printf("Informe a 2º direção em que o robô andará (FRENTE, TRÁS, ESQUERDA, DIREITA) \n");
	    direcao2 = ler.next();
	    System.out.printf("Informe a distância, em cm, que o robô andará na 2ª direção \n");
	    distancia2 = ler.nextInt();
	    System.out.printf("Informe a 3º direção em que o robô andará (FRENTE, TRÁS, ESQUERDA, DIREITA) \n");
	    direcao3 = ler.next();
	    System.out.printf("Informe a distância, em cm, que o robô andará na 3ª direção \n");
	    distancia3 = ler.nextInt();
	    System.out.printf("Informe a 4º direção em que o robô andará (FRENTE, TRÁS, ESQUERDA, DIREITA) \n");
	    direcao4 = ler.next();
	    System.out.printf("Informe a distância, em cm, que o robô andará na 4ª direção \n");
	    distancia4 = ler.nextInt();
	    System.out.printf("Informe a 5º direção em que o robô andará (FRENTE, TRÁS, ESQUERDA, DIREITA) \n");
	    direcao5 = ler.next();
	    System.out.printf("Informe a distância, em cm, que o robô andará na 5ª direção \n");
	    distancia5 = ler.nextInt();
	    if (direcao1 == "DIREITA") {
	    	if (distancia1 >=3 || distancia1 <=5) {
	    		if (direcao2 == "FRENTE")  {
	    			if (distancia2 >=7 || distancia2 <=9 ) {
	    				if (direcao3 == "DIREITA" ) {
	    					if (distancia3 >= 3 || distancia3 <7) {
	    						if (direcao4 == "TRÁS") {
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
