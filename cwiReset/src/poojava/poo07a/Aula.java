package poojava.poo07a;

/*
Aula 07 - relacionamento entre classes / objetos compostos
Aula 08 - relacionamento de agregação / agregação entre objetos
 */
public class Aula {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[5];
        Luta UEC01 = new Luta();

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75,
                68.9, 11, 2, 1);
        //l[0].ganharLuta();
        //l[0].apresentar()

        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68,
                57.8, 14, 2, 3);
        //l[1].status();

        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65,
                80.9, 12, 2, 1);
        //l[2].status();

        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93,
                81.6, 13, 0, 2);
        //l[3].status();

        l[4] = new Lutador("Nerdhard", "EUA", 30, 1.81,
                105.7, 12, 2, 4);
        //l[4].status();

        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();

    }


}
