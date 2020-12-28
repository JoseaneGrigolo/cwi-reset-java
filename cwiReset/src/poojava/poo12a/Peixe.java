package poojava.poo12a;

import java.sql.SQLOutput;

public class Peixe extends Animal{

    @Override
    public void locomover() {
        System.out.println("Nadando.. 0o0o0o");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias...glub-glub");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som.... ???");
    }

    public void soltarBolha(){
        System.out.println("Soltou uma bolha..O O O O ");
    }
}
