package algoritmosemjava.moduloV;

import java.util.Scanner;

public class Aula07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numPensadoDecimal = Math.random() * 2;
        double numPensado = Math.round(numPensadoDecimal);
        double chute;

        mostra("Jogo da Adivinhação! ");
        mostra("Digite um número: ");
        chute = sc.nextDouble();

        if (chute == numPensado) {
            mostra("Uau! Você acertou, pois eu pensei no " + numPensado);
        } else {
            mostra("Você errou, pensei no número " + numPensado);
        }
        sc.close();

    }

    public static void mostra(String texto) {
        System.out.println(texto);
    }
}
