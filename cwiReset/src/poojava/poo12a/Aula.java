package poojava.poo12a;
/*
Aula 12 - polimorfismo
Aula 13 - polimorfismo sobrecarga
Aula 14 - questões concurso
 */
public class Aula {

    public static void main(String[] args) {

        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Lobo x = new Lobo();

        x.emitirSom();

        Canguru c = new Canguru();
        Cachorro k = new Cachorro();

        //m.setPeso(85.3);
        //m.setIdade(2);
        //m.setMembros(4);
        //m.emitirSom();

        //c.setPeso(5.3);
        //c.setIdade(3);
        //c.setMembros(4);
        //c.locomover();

        //k.setPeso(3);
        //k.setIdade(5);
        //k.setMembros(4);
        //k.locomover();
        //k.emitirSom();
        k.reagir("Olá");
        k.reagir(false);
        k.reagir(9,50);

        //p.setPeso(1.3);
        //p.setIdade(1);
        //p.setMembros(2);
        //p.emitirSom();
        //p.locomover();

        //r.locomover();
        //r.alimentar();

        //a.fazerNinho();
    }
}
