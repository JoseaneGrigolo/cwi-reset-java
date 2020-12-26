package algoritmosemjava.moduloV;

import java.util.Scanner;
/*
Aula 03 - 04
 */

public class Aula03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int peso;
        double altura, imc;

        mostra("Calcular IMC²: ");
        mostra("Qual o seu nome?");
        nome = sc.nextLine();
        mostra("Qual sua altura?");
        altura = sc.nextDouble();
        mostra("Qual seu peso?");
        peso = sc.nextInt();

        imc = peso / Math.pow(altura, 2);

        if (imc < 20) {
            mostra(nome + ", você está Magro.");
        } else if (imc >= 20 && imc <= 24) {
            mostra(nome + ", você está Normal.");
        } else if (imc >= 25 && imc <= 29) {
            mostra(nome + ", você está Acima do peso.");
        } else if (imc >= 30 && imc <= 34) {
            mostra(nome + ", você está obeso.");
        } else {
            mostra(nome + ", você está muito obeso.");
        }

        sc.close();

    }

    public static void mostra(String texto) {
        System.out.println(texto);
    }
}
