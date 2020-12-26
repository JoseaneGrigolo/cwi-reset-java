package algoritmosemjava.moduloV;

import java.util.Scanner;
/*
Aula 11 - 12
 */
public class Aula11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        int contador = 0;

        while (contador != 1) {
            System.out.println("Qual seu nome? ");
            nome = sc.nextLine();
            System.out.println("Qual sua idade? ");
            idade = sc.nextInt();

            if (idade >= 18) {
                mostra(nome + " você é maior de idade!");
            } else {
                mostra(nome + " você é menor de idade jovem!");
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


