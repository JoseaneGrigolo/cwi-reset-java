package algoritmosemjava.moduloV;

import java.util.Scanner;

public class Aula10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multiplicador = 1;

        while(multiplicador <= 10){
            mostra("7 vezes " + multiplicador + " é igual a "
            + 7 * multiplicador);
            multiplicador += 1;
        }

        sc.close();
    }
    public static void mostra(String texto) {
        System.out.println(texto);
    }
}
