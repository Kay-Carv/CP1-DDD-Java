import java.util.Scanner;

// 5. Escreva um programa que leia 10 números inteiros e calcule quantos são pares e quantos são ímpares.

public class Ex5calculoParImpar {

    public static void main(String[] args) {
        System.out.println("=== Sistema para contabilizar a quantidade de números impares e pares ===");
        Scanner scanner = new Scanner(System.in);

        int pares = 0;
        int impares = 0;
        int qtd_numeros = 10;

        for (int i = 1; i <=  qtd_numeros; i++){
            System.out.println("Escreva o " + i + "° número");
            int numero = scanner.nextInt();
            if (numero % 2 == 0){
               pares ++;
            } else {
                impares ++;
            }
        }

        System.out.println("\n Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números impares " + impares);

        scanner.close();
    }
}
