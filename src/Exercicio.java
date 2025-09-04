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

    //7)	Crie uma função que receba dois números e retorne o maior deles.
    public static class Exercicio7  {
        public static void main(String[] args) {
            int numero1 = 10;
            int numero2 = 13;

            int maiorNumero = comparaDoisNum(numero1, numero2);

            System.out.println("Entre " + numero1 + " e " + numero2+ " o maior número é o " + maiorNumero);
        }
        public static int comparaDoisNum(int num1, int num2){
            if (num1 > num2) {
                return num1;
            } else {
                return num2;
            }
        }
    }

    // Ex.8	Escreva um programa que leia a altura e o peso de uma pessoa e calcule seu IMC. Mostre também a classificação conforme a tabela:
    public static class exercicio8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\n===Programa para cálculo de IMC===");
            System.out.println("Insira a altura");
            double altura = scanner.nextDouble();

            System.out.println("Insira o valor de KG da pessoa");
            double peso = scanner.nextDouble();

            calcularIMC(altura, peso);

            scanner.close();
        }

        public static void calcularIMC( double altura, double peso ){
            double imc = peso / Math.pow(altura, 2);

            System.out.println("Com a altura de " + altura + " metros e o peso de " + peso + "kg o seu IMC é de " + imc);
            if (imc <= 18.5 ) {
                System.out.println("Está abaixo do peso ideal");
            } else if ( imc > 18.5 && imc <= 24.9) {
                System.out.println("Está com o peso normal");
            } else if ( imc > 24.9 && imc < 30 ) {
                System.out.println("Está com sobre peso");
            } else if (imc >= 30) {
                System.out.println("Está com obesidade");
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

            System.out.println("A média desses valores é igual a: " + calcularMediraAritimetrica(num1, num2, num3));

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
            Scanner scanner = new Scanner(System.in);
            double valor = 2000;
            System.out.println("O valor da compra é de " + valor + " reais");
            System.out.println("Selecione a forma de pagamento (digite um número entre 1 e 3 para selecionar):\n Digite ( 1 ) para pagamento a vista;\n Digite ( 2 ) para parcelar em 2 vezes;\n Digite ( 3 ) para parcelar em 4 vezes com 8% de juros;");
            int opcao = scanner.nextInt();
            boolean looping = true;

            while (looping) {
                switch (opcao) {
                    case 1 -> {
                        System.out.println("O valor de " + valor + " a vista terá um descosto de 10% e será pago por " + valor * 0.9 + " reais");
                        looping = false;
                    }
                    case 2 -> {
                        System.out.println("O valor de " + valor + " será pago em 2 vezes de " + (double)valor/2 + " reais sem juros");
                        looping = false;
                    }
                    case 3 -> {
                        System.out.println("O valor de " + valor + " será pago em 4 vezes de " + (double)(valor * 1.08)/4 + " reais com juros de " + (valor * 0.08 /4) + " reais por parcela.");
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
}