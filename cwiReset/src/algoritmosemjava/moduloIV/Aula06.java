package algoritmosemjava.moduloIV;
//metodo

public class Aula06 {

    public static void main(String[] args) {

        mostra("Calcular Consumo de combustivel: ");

        int litros = 49;
        int distancia = 495;
        int consumo = distancia / litros;

        mostra("O consumo de gasolina foi: " + consumo + "\n");

    }

    public static void mostra(String texto){
        System.out.println(texto);

    }

}
