// Seja bem-vindo! Esse código contém a resolução da lista de 15 exercícios presentes no README

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        //1. Escreva um programa que leia um número em metros e converta para centímetros e milímetros.
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Programa de conversão de metros para centímetros e milímetros ===\n");
        System.out.println("Digite o número de metros para serem transformado em centímetros e milímetros");
        double metros = scanner.nextDouble();
        double centrimetros = metros * 100;
        double milimetros = centrimetros * 10;

        System.out.println(metros + " metro(s) equivalem a " + centrimetros + " centímetros e " + milimetros + " milímetros");

        scanner.close();    //Fechando Scanner
    }

    //Ex. 2 Crie um programa que leia a idade de uma pessoa e diga se ela pode votar (idade ≥ 16).
    public static class exercicio2 {
        public static void main(String[] args) {
            System.out.println("=== Validação de idade para votar ===");
            System.out.println("Digite a idade a ser verificada");
            Scanner scanner = new Scanner(System.in);

            int idade = scanner.nextInt();
            if ( idade >= 16 ) {
                System.out.println("Já tem idade suficiente para votar");
            } else if ( idade > 0) {
                System.out.println("Ainda não tem idade o suficiente para votar. A idade minima é de 16 anos");
            } else {
                System.out.println("Idade inválida");
            }

            scanner.close();
        }
    }

    //Ex. 3 Escreva um programa que leia dois números e mostre todos os números inteiros entre eles
    public static class exercicio3 {
        public static void main (String[] args) {
            System.out.println("===Programa para lista números entre dois valores===");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();

           int maior = Math.max(num1, num2);
           int menor = Math.min(num1, num2);

            System.out.println("=== Todos os números inteiros entre " + menor + " e " + maior+ " ===");
            while (menor < maior - 1) {
                menor ++;
                System.out.println(menor);
            }
            System.out.println("===");
            scanner.close();
        }
    }


    //Ex.4 Crie uma função que receba um número inteiro e retorne seu fatorial. Teste no main.
    public static class exercicio4 {
        public static void main (String[] args) {
            System.out.println("\n=== Digite um número inteiro para saber o seu fatorial ===");
            Scanner scanner = new Scanner(System.in);
            int numFatorial = scanner.nextInt();

            System.out.println("O fatorial de " + numFatorial + " equivale a " + calcularFatorial(numFatorial));
            scanner.close();
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
    }

    // 5. Escreva um programa que leia 10 números inteiros e calcule quantos são pares e quantos são ímpares.
    public static class exercicio5 {
        public static void main(String[] args) {
            System.out.println("=== Sistema para contabilizar a quantidade de números impares e pares ===");
            Scanner scanner = new Scanner(System.in);

            int pares = 0;
            int impares = 0;
            int qtd_numbers = 10;

            for (int i = 1; i <=  qtd_numbers; i++){
                System.out.println("Escreva o " + i + "° número");
                int numero = scanner.nextInt();
                if (numero % 2 == 0){
                    pares ++;
                } else {
                    impares ++;
                }
            }

            System.out.println("\nQuantidade de números pares: " + pares);
            System.out.println("Quantidade de números impares: " + impares);

            scanner.close();
        }
    }

    //Ex.06 Crie uma função que receba um número inteiro e mostre a tabuada desse número até 10.

    public static class exercicio6 {
        public static void main(String[] args) {
            System.out.println("=== Tabuada de um número inteiro ===");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um número inteiro para a tabuada: ");
            int numTabuada = scanner.nextInt();
            tabuada(numTabuada);

            scanner.close();
        }
        static void tabuada (int numeroInt) {
            for ( int i = 1; i <= 10; i++) {
                int calculoTabuada = i * numeroInt;
                System.out.println( i + " X " + numeroInt + " = " + calculoTabuada );
                }
            }
    }

    // Ex.7	Crie uma função que receba dois números e retorne o maior deles.
    public static class Exercicio7  {
        public static void main(String[] args) {
            int numero1 = 10;
            int numero2 = 13;

            int maiorNumero = comparaDoisNum(numero1, numero2);

            System.out.println("Entre " + numero1 + " e " + numero2+ " o maior número é o " + maiorNumero);
        }
        public static int comparaDoisNum(int num1, int num2){
            int max = Math.max(num1, num2);
            return max;
        }
    }

    // Ex.8	Escreva um programa que leia a altura e o peso de uma pessoa e calcule seu IMC. Mostre também a classificação conforme a tabela:
    public static class exercicio8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n===Programa para cálculo de IMC===");
            System.out.println("Insira a altura em metros: ");
            double altura = scanner.nextDouble();

            System.out.println("Insira o valor de KG da pessoa: ");

            double peso = scanner.nextDouble();

            calcularIMC(altura, peso);

            scanner.close();
        }

        public static void calcularIMC(double altura, double peso) {
            DecimalFormat df = new DecimalFormat("#.##");

            double imc = peso / Math.pow(altura, 2);
            String imcFormatado = df.format(imc);

            System.out.println("\n--- Resultado do IMC ---");
            System.out.println("Altura: " + altura + "m | Peso: " + peso + "kg");
            System.out.println("Seu IMC é: " + imcFormatado);

            System.out.print("Classificação: ");
            if (imc <= 18.5) {
                System.out.println("Abaixo do peso ideal");
            } else if (imc > 18.5 && imc <= 24.9) {
                System.out.println("Peso normal");
            } else if (imc > 24.9 && imc < 30) {
                System.out.println("Sobrepeso");
            } else { // Simplificado para capturar IMC >= 30
                System.out.println("Obesidade");
            }
        }
    }

    //Ex.9	Crie uma função que receba três números e retorne a média aritmética.
    public static class exercicio9 {
        public static void main(String[] args) {
            System.out.println("===Sistema para calcular a média de 3 valores===");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro valor: ");
            int num1 = scanner.nextInt();
            System.out.println("Digite o segundo valor: ");
            int num2 = scanner.nextInt();
            System.out.println("Digite o terceiro valor: ");
            int num3 = scanner.nextInt();

            double media = calcularMediraAritimetrica(num1, num2, num3);
            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("A média desses valores é igual a: " + df.format(media));

            scanner.close();
        }

        public static double calcularMediraAritimetrica(int num1, int num2, int num3){
            return (double) (num1 + num2 + num3) / 3;
        }
    }

    //Ex.10 Escreva um programa que leia o preço de um produto e a forma de pagamento, mostrando o valor final a pagar, conforme a tabela:
    public static class exercicio10 {
        public static void main(String[] args) {
            System.out.println("===Programa para calcular desconto===");
            DecimalFormat df = new DecimalFormat("#.00");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o valor da compra: ");
            double valor = scanner.nextDouble();
            System.out.println("O valor da compra é de " + valor + " reais");
            System.out.println("Selecione a forma de pagamento (digite um número entre 1 e 3 para selecionar):\n Digite ( 1 ) para pagamento a vista;\n Digite ( 2 ) para parcelar em 2 vezes;\n Digite ( 3 ) para parcelar em 4 vezes com 8% de juros;");
            int opcao = scanner.nextInt();
            boolean looping = true;

            while (looping) {
                switch (opcao) {
                    case 1 -> {
                        System.out.println("\nPagamento a vista (10% de desconto): ");
                        System.out.println("O valor de R$" + df.format(valor));
                        System.out.println("Desconto de 10%: R$" + df.format(valor * 0.1));
                        System.out.println("Valor final: R$" + df.format(valor * 0.9 ));
                        looping = false;
                    }
                    case 2 -> {
                        System.out.println("\nPagamento em 2 parcelas:");
                        System.out.println("O valor de R$" + df.format(valor) + " será pago em 2 vezes de R$" + df.format(valor / 2) + " sem juros");
                        System.out.println("Valor final: R$" + df.format(valor));
                        looping = false;
                    }
                    case 3 -> {
                        System.out.println("\nPagamento em 4 parcelas:");
                        System.out.println("O valor de R$" + df.format(valor) + " será pago em 4 vezes de R$" + df.format(valor * 1.08 /4) + " com juros de R$" + df.format(valor * 0.08 /4) + " por parcela.");
                        System.out.println("Valor final: R$" + df.format(valor * 1.08));
                        looping = false;
                    }
                    default -> {
                        System.out.println("Opção inválida.\n Digite ( 1 ) para pagamento a vista;\n Digite ( 2 ) para parcelar em 2 vezes;\n Digite ( 3 ) para parcelar em 4 vezes com 8% de juros;");
                        opcao = scanner.nextInt();
                    }
                }
            }
        }
    }
    //Ex.11	Crie um programa que leia o nome e a idade de 3 pessoas. Ao final, mostre o nome da pessoa mais velha.
    public static class exercicio11 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("===Sistema para saber a pessoa mais velha dentre 3===\n");
            String[] nomes = new String[3];
            int[] idades = new int[3];

            for (int i = 0; i < 3; i++) {
                System.out.println("Digite o nome da "+ (1+ i) + "° pessoa!");
                nomes[i] = scanner.nextLine();

                System.out.println("Digite a idade da "+ (1+ i) + "° pessoa!");
                idades[i] = scanner.nextInt();
                scanner.nextLine();
            }
            int idadeMaisVelha = -1;
            String nomeMaisVelho = "";

            for (int i = 0; i < 3; i++) {
                if (idades[i] > idadeMaisVelha) {
                    idadeMaisVelha = idades[i];
                    nomeMaisVelho = nomes[i];
                }
            }

            System.out.println("\n--------------------");
            System.out.println("A pessoa mais velha é: " + nomeMaisVelho);
            System.out.println("Com a idade de: " + idadeMaisVelha + " anos");
            scanner.close();
        }
    }

    //Ex.12 Escreva um programa que leia a altura, o comprimento e a largura de uma caixa, e calcule o seu volume
    public static class exercicio12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("===Calcular volume de uma caixa===");

            System.out.println("Digite a altura: ");
            double altura = scanner.nextDouble();
            System.out.println("Digite o comprimento: ");
            double comprimento = scanner.nextDouble();
            System.out.println("Digite a largura: ");
            double largura = scanner.nextDouble();

            System.out.println("O volume da caixa é: "+ calcularVolume(altura, comprimento, largura));

            scanner.close();
        }

        public static double calcularVolume(double a, double b, double c){
            return a * b * c;
        }
    }

    //13)	Crie uma classe chamada Car com os atributos: brand, model, year. No main, crie dois objetos da classe e exiba as informações.

    static class Car {
        String brand, model;
        int year;
    }
    public static class exercicio13{
        public static void main(String[] args) {
            Car car1 = new Car();
            car1.brand = "Mercedes-Benz";
            car1.model = "CLS 450";
            car1.year = 2019;

            Car car2 = new Car();
            car2.brand = "HONDA";
            car2.model = "Civic Type R";
            car2.year = 2025;

            System.out.println("Carros 1: ");
            System.out.println("Marca: " + car1.brand);
            System.out.println("Modelo: "+ car1.model);
            System.out.println("Ano: " + car1.year);

            System.out.println("\nCarro 2: ");
            System.out.println("Marca: " + car2.brand);
            System.out.println("Modelo: "+ car2.model);
            System.out.println("Ano: " + car2.year);
        }
    }


    //Ex.14 Escreva uma função que receba a temperatura em Fahrenheit e retorne em Celsius.
    public static class exercicio14 {
        public static void main(String[] args) {
            System.out.println("===Sistema para converter Fahrenheit em Celsius===");
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nEscreva a temperatura em Fahrenheit ( F° ) que será convertida em Celsius ( C° ): ");
            double fahrenheit = scanner.nextDouble();

            double celsius = converterFahrenheit(fahrenheit);

            //Definindo formato do decimal
            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println(fahrenheit + "F° equivalem a " + df.format(celsius) + "°C");

            scanner.close();
        }
        public static double converterFahrenheit(double f){
            return ((f- 32) * 5 / 9);
        }
    }
    //Ex.15 Crie um programa que leia um número inteiro e exiba uma contagem regressiva até 0.

    public static class exercicio15 {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("===Sistema de contagem regressiva===");
            System.out.println("\nEscreva um número para a contagem regressiva: \n");
            int num = scanner.nextInt();

            for (int i = num; i >= 0; i--) {
                System.out.println(i);
            }
            System.out.println("\n-----------");
        }
    }
}