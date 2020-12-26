package algoritmosemjava.moduloV;

import java.util.Scanner;
/*
Estrutura de repetição While
Aula 08 - 09
 */

public class Aula08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anoCopa = 1930;
        int anoLimite;

        mostra("Qual ano limite? ");
        anoLimite = sc.nextInt();

        while (anoCopa <= anoLimite) {
            mostra(anoCopa + " tem copa!");
            anoCopa += 4;

        }
        mostra("Esses foram os anos da copa até " + anoLimite);
        sc.close();
    }

    public static void mostra(String texto) {
        System.out.println(texto);
    }
}
