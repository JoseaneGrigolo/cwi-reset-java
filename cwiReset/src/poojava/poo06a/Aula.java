package poojava.poo06a;
/*
Aula 06 - encapsulamento
Aula 07 - prática
 */

public class Aula {

    public static void main(String[] args) {

        ControleRemoto c = new ControleRemoto();
        c.ligar();
        //c.setVolume = 60; Erro, privado.
        c.maisVolume(); //Encapsulamento mais rigido.
        c.play();
        c.ligarMudo();
        c.abrirMenu();
        c.fecharMenu();

    }
}
