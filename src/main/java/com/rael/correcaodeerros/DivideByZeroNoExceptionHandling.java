
package com.rael.correcaodeerros;

import java.util.Scanner;
// Figura 11.2: DivideByZeroNoExceptionHandling.java
// Divisão de inteiro sem tratamento de exceção.

public class DivideByZeroNoExceptionHandling {
    public static int quociente(int numerador, int denominador){
        return numerador/denominador; //possivel divisão por zero
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, infomr um numerador: ");
        int numerador = scanner.nextInt();
        System.out.println("Por favor, informar um denominador: ");
        int denominador = scanner.nextInt();
        
        int result = quociente (numerador, denominador);
        System.out.printf("%nResult: %d / %d = %d%n" , numerador, denominador,result);
    }
}
