package algoritmosemjava.moduloIII;

public class Aula04 {
    //constantes
    static final float PI = 3.14159265f;

    public static void main(String[] args) {

        float raio = 25f;
        float comprimento = raio * 2 * PI;
        float area = (raio * raio) * PI;
        System.out.println("Dados de um circulo de " + raio + "cm:\n"
                + "comprimento: " + comprimento + "cm\n"
                + "Area: " + area + "cm²");

    }
}
