package algoritmosemjava.moduloV;

import java.util.Scanner;

public class Aula06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numI, numII, numIII, numAuxiliar;

        mostra("Ordenando números: ");
        mostra("Digite o primeiro número: ");
        numI = sc.nextInt();
        mostra("Digite o segundo número: ");
        numII = sc.nextInt();
        mostra("Digite o terceiro número: ");
        numIII = sc.nextInt();

        //EX: 6 9 3
        if(numI > numII){ // 6 > 9 : false
            numAuxiliar = numII;
            numII = numI;
            numI = numAuxiliar;
        }
        if(numII > numIII){ // 9 > 3 : true
            numAuxiliar = numIII; // numAuxiliar = 3
            numIII = numII; // numIII = 9
            numII = numAuxiliar; // numII = 3
        }
        if(numII < numI){ // 3 < 6 : true
            numAuxiliar = numII; // numAuxiliar = 3
            numII = numI; // numII = 6
            numI = numAuxiliar; // numI = 3
        }
        //numI = 3 numII = 6 numIII = 9
        mostra("O menor número é " + numI + "\nO número do meio é " + numII + "\nO maior número é " + numIII);

        sc.close();
    }
    public static void mostra(String texto) {
        System.out.println(texto);
    }
}
