package algoritmosemjava.moduloIV;
/*
Aula 20 - 21
Op. lógico
 */

public class Aula20 {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean d = true;

        System.out.println("Op lógico - &&: ");
        System.out.println(a && b);
        System.out.println(a && d);

        System.out.println("\nOp lógico - ! (negação): ");
        System.out.println(!a);
        System.out.println(!(b || d));
    }
}
