package algoritmosemjava.moduloV;

import java.util.Scanner;

public class Aula13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int peso;
        double altura, imc;
        int contador = 0;

        mostra("Calcular IMC² ideal: ");

        while (contador != 1) {
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
            mostra("Digite o número 1 caso queira fechar o programa! Ou zero para continuar: ");
            contador = sc.nextInt();
            nome = sc.nextLine();
        }
        mostra("Programa finalizado com sucesso!");
        sc.close();

    }

    public static void mostra(String texto) {
        System.out.println(texto);
    }
}

