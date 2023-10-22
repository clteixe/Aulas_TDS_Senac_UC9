package uc9.Aula04.TratamentoExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws InterruptedException {
        //exemplo01();
        //exemplo02();
        exemplo03();
    }

    public static void exemplo01() {
        try {
            String nome = null;
            System.out.println(nome.length());
            System.out.println("Resultado");
        } catch (NullPointerException e) {
            System.out.println("Mensagem de erro! " + e);
        }
        System.out.println("Proxima tarefa... 1");
        System.out.println("Proxima tarefa... 2");
        System.out.println("Proxima tarefa... 3");
    }

    private static void exemplo02() {

        int numerador;
        int denominador;
        int resultado;

        try {
            Scanner lerTeclado = new Scanner(System.in);
            System.out.println("Informe o numerador:");
            numerador = lerTeclado.nextInt();
            System.out.println("Informe o denominador:");
            denominador = lerTeclado.nextInt();
            resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisao por zero!");
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("Erro! Digitado uma letra!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Erro desconhecido!");
            System.out.println(e);
        } finally {
            System.out.println("ESTOU SENDO EXECUTADO!");
        }

    }

    private static void exemplo03() throws InterruptedException {
        exemplo04();
    }

    private static void exemplo04() throws InterruptedException {

        try {
            int[] vetor = {3, 4, 5, 2, 1};
            System.out.println(vetor[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            Thread.sleep(2000);
            System.out.println("Operação não realizada!");
            System.out.println(e);
        }
        
    }

}

// divisao por zero 
// Letra no lugar de numero

