package poojava.poo04a;

public class Caneta {

    public String modelo;
    private Double ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, Double ponta, String cor) {
        this.modelo = modelo;
        this.setPonta(ponta);
        this.cor = cor;
        this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPonta() {
        return this.ponta;
    }

    public void setPonta(Double ponta) {
        this.ponta = ponta;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
