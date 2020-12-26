package algoritmosemjava.moduloIV;
/*
//Op relacionais - exercitando metodos
Aula 13 - 15 - 16 - 17 - 18

 */
public class Aula13 {
    public static void main(String[] args) {

        int valber = 3;
        int ana = 20;
        int sofia = 2;

        mostra("É verdade que Sofia é mais velha que Ana? ");
        operadorMaiorQue(sofia, ana);
        mostra("É verdade que Valber é mais velho que Ana? ");
        operadorMaiorQue(valber, ana);
        mostra("A idade de Ana é igual a de Sofia? ");
        operadorIgualdade(ana, sofia);
        mostra("Ana possui idade maior ou igual a Sofia? ");
        operadorMaiorIgualQue(ana, sofia);
        mostra("Ana possui idade diferente de Sofia? ");
        operadorMaiorIgualQue(ana, sofia);
    }

    public static void mostra(String texto){
        System.out.println(texto);
    }

    public static void operadorMaiorQue(int x, int y){
        boolean z;
        z = x > y;
        mostra(">>> " + z);
    }

    public static void operadorIgualdade(int b, int c){
        boolean d;
        d = b == c;
        mostra(">>> " + d);
    }
    public static void operadorMaiorIgualQue(int z, int t){
        boolean resultado;
        resultado = z >= t;
        mostra(">>> " + resultado);

    }

    public static void diferente(int x, int y){
        boolean a;
        a = x != y;
        mostra(">>> " + a);

    }
}
