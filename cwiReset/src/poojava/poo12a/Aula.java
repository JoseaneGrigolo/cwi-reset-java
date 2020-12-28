package poojava.poo12a;
/*
Aula 12 - polimorfismo
 */
public class Aula {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(85.3);
        m.setIdade(2);
        m.setMembros(4);
        m.emitirSom();

        p.setPeso(1.3);
        p.setIdade(1);
        p.setMembros(2);
        p.emitirSom();

        r.locomover();
        r.alimentar();

        a.fazerNinho();

    }
}
