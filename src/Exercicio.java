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
        System.out.println("=== Todos os números inteiros entre " + num1 + " e " + num2+ " ===");
        while (num1 < num2 - 1) {
            num1 ++;
            System.out.println(num1);
        }
        System.out.println("===");

        //Ex.4 Crie uma função que receba um número inteiro e retorne seu fatorial. Teste no main.

        System.out.println("\n=== Digite um número inteiro para saber o seu fatorial ===");
        int numFatorial = scanner.nextInt();

        System.out.println("O fatorial de " + numFatorial + " equivale a " + calcularFatorial(numFatorial));

        System.out.println("Escreva um número inteiro para a tabuada");
        int numTabuada = scanner.nextInt();
        tabuada(numTabuada);


        scanner.close();    //Fechando Scanner
    }

    static int calcularFatorial (int numero ) {
        if (numero == 0 ) {
            return 1;
        }
        if (numero < 0 ) {
            return -1;
        }
        int resultado = 1;
        for ( int numfatorado = 1;  numfatorado <= numero ; numfatorado++){
            resultado *= numfatorado;
        }
        return resultado;
    }

    //Ex.06 Crie uma função que receba um número inteiro e mostre a tabuada desse número até 10.
    static void tabuada (int numeroInt) {
        for ( int i = 1; i <= 10; i++) {
            int calculoTabuada = i * numeroInt;
            System.out.println( i + " X " + numeroInt + " = " + calculoTabuada );
            }
        }
}