
package com.rael.correcaodeerros;

import java.util.Scanner;


public class ErroArrayOutOfBounds {
    public static void main (String [] args){
        
       Scanner t = new Scanner(System.in);
       
       
        int [] vetor = new int [3];
        boolean loop = true;
        
        do{
           
            try{
            System.out.println("Digite a posição que deseja visualizar ");
            int p = t.nextInt();
            
            System.out.println("Digite um valor a armazenar ");
            vetor[p] = t.nextInt();
            
            System.out.printf("Posição %d: %d\n", p, vetor[p]);

            
            loop = false; 
            
            }catch(ArrayIndexOutOfBoundsException exception){
                System.out.printf("Numero fora da matriz, não da não parceiro, tenta ai denovo \n" ,exception);

            }
        } while(loop); 
    
    }
}
