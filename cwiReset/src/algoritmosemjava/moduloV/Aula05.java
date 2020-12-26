package algoritmosemjava.moduloV;

import java.util.Scanner;

/*
Aula 05
 */
public class Aula05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double notaI, notaII, notaIII, notaIV, media;
        String nome;

        mostra("Calculo da Média: ");
        mostra("Qual o nome do aluno que deseja calcular a media? ");
        nome = sc.nextLine();
        mostra("Digite a primeira nota: ");
        notaI = sc.nextDouble();
        mostra("Digite a segunda nota: ");
        notaII = sc.nextDouble();
        mostra("Digite a terceira nota: ");
        notaIII = sc.nextDouble();
        mostra("Digite a quarta nota: ");
        notaIV = sc.nextDouble();

        media = (notaI + notaII + notaIII + notaIV) / 4;
        if (media >= 7) {
            mostra(nome + ", você foi aprovado! Média: " + media);
        } else if (media >= 5 && media < 7) {
            mostra(nome + ", você está de recuperação. Média: " + media);
        } else {
            mostra(nome + ", você foi reaprovado. Média: " + media);
        }

        sc.close();
    }

    public static void mostra(String texto) {
        System.out.println(texto);
    }
}
