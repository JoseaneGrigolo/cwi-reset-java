package algoritmosemjava.moduloV;

import java.util.Scanner;
/*
Aula 01 - 02
 */

public class Aula01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("Estruturas de repetição: ");
        System.out.println("Qual seu nome? ");
        nome = sc.nextLine();
        System.out.println("Qual sua idade? ");
        idade = sc.nextInt();

        if (idade >= 18) {
            mostra(nome + " você é maior de idade!");
        } else {
            mostra(nome + " você é menor de idade jovem!");
        }

        sc.close();
    }

    public static void mostra(String texto) {
        System.out.println(texto);
    }
}
