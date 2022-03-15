
package com.rael.correcaodeerros;
import java.util.InputMismatchException;
import java.util.Scanner;


public class DivideByZeroWithExceptionHandling {
    // demonstra o lançamento de uma exceção quando ocorre uma divisão por zero
    public static int quociente (int numerador, int denominador)
            throws ArithmeticException
    {
        return numerador / denominador;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true; // determina se mais entradas são necessárias

        do {            
            try { // lê dois números e calcula o quociente 
                System.out.println("Por favor digite um valor de numerador: ");
                int numerador = scanner.nextInt();
                
                System.out.println("Por favor digite um valor de denominador: ");
                int denominador = scanner.nextInt();
                

                int resultado = quociente(numerador, denominador);
                
                System.out.printf("%nResult: %d / %d = %d%n", numerador, denominador, resultado);
                continueLoop = false; // entrada bem-sucedida; fim do loop
                
                
            } catch (InputMismatchException inputMismatchException) {
                
                System.err.printf("%nException: %s%n",inputMismatchException);
                scanner.nextLine(); // descarta entrada para o usuário tentar de novo
                System.out.printf("Você precisa digitar numero inteiro. Por favor tente novamente.%n%n");
  
            } catch (ArithmeticException arithmeticException) {

                System.err.printf("%nException: %s%n",arithmeticException);
                System.out.printf("0 é denominador invalido. Por favor tente novamente.%n%n");
  
            }
            
        } while (continueLoop);       
    }
} // fim da classe DivideByZeroWithExceptionHandling
