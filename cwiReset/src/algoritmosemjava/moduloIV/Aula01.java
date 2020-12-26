package algoritmosemjava.moduloIV;
/*
 Aula 01 - 02 - 03 - 04 - 05
 */

import java.sql.SQLOutput;

public class Aula01 {

    public static void main(String[] args) {

        System.out.println("Operadores Aritméticos: ");
        int quatro = 2 + 2;
        int tres = 5 - 2;
        int oito = 4 * 2;
        int dezessete = 64/4;
        int um = 5%2;

        System.out.println("2 + 2 = " + quatro);
        System.out.println("5 - 2 = " + tres);
        System.out.println("4 * 2 = " + oito);
        System.out.println("64 / 4 = " + dezessete);
        System.out.println("5 % 2 = " + um + "\n");

        System.out.println("Calcular Consumo de combustivel: ");
        int litros = 20;
        int distancia = 380;
        int consumo;
        consumo = distancia / litros;
        System.out.println("O consumo de gasolina foi: " + consumo + "\n");

        System.out.println("Calcular IMC²: ");
        int peso = 56;
        double altura = 1.60;
        double imc = peso/(altura * altura);
        System.out.printf("Meu IMC é: %.2f", imc);

        System.out.println("\n\nCalcular Media de idades: ");
        int valber = 30;
        int ana = 20;
        int sofia = 2;
        int rebeca = 14;

        int total = valber + ana + sofia + rebeca;
        int media = total / 4;
        System.out.println("A media de idade é: " + media);


    }
}
