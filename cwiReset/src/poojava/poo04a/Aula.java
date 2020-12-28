package poojava.poo04a;

/*
Aula 04 - métodos especiais
Aula 05 - Métodos Getter, Setter e Construtor
Aula teórica

 */
public class Aula {

    public static void main(String[] args) {

        //Caneta c1 = new Caneta("BIC",0.4, "Amarela");
        //c1.status();

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(100.00);
        p1.fecharConta();
        p1.estadoAtual();

        System.out.println("---------------------------");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(500.00);
        p2.sacar(1000.00);
        p2.estadoAtual();

    }

}
