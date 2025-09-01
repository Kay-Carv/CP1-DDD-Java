import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        //1. Escreva um programa que leia um número em metros e converta para centímetros e milímetros.
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Programa de conversão de metros para centímetros e milímetros ===\n");
        System.out.println("Digite o número de metros para serem transformado em centímetros e milímetros");
        double metros = 20;//scanner.nextDouble();
        double centrimetros = metros * 100;
        double milimetros = centrimetros * 10;

        System.out.println(metros + " metro(s) equivalem a " + centrimetros + " centímetros e " + milimetros + " milímetros");

        //2. Crie um programa que leia a idade de uma pessoa e diga se ela pode votar (idade ≥ 16).
        int idade = 33;

        if ( idade >= 16 ) {
            System.out.println("Você já tem idade suficiente para votar");
        } else if (idade < 16 && idade > 0) {
            System.out.println("Você ainda não tem idade o suficiente para votar. A idade minima é de 16 anos");
        } else {
            System.out.println("Idade inválida");
        }

        //3. Escreva um programa que leia dois números e mostre todos os números inteiros entre eles.
        int num1 = 10;
        int num2 = 20;
        System.out.println("=== Quantidade de números inteiros entre " + num1 + " e " + num2+ " ===");
        while (num1 < num2 - 1) {
            num1 ++;
            System.out.println(num1);
        }
        System.out.println("\n===");

        //Crie uma função que receba um número inteiro e retorne seu fatorial. Teste no main.

        scanner.close();
    }
}
