package poojava.poo02a;
/*
Aula 01 - POO
Aula 02 - criando classes
Aula 03 - visibilidade
 */
public class Aula {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.modelo = "BIC 01";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.destampar();
        c1.status();
        c1.rabiscar();



    }
}
