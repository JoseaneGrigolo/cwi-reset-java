package poojava.poo04a;

public class ContaBanco {

    private int numConta;
    protected String tipo;
    private String dono;
    private Double saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    //CONSTRUTOR
    public ContaBanco() {
        this.saldo = 0.0;
        this.status = false;
    }

    //METODOS ESPECIAIS
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //METODOS PERSONALIZADOS
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC") {
            this.setSaldo(50.0);
        } else if (t == "CP") {
            this.setSaldo(150.0);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta ainda com dinheiro.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta ainda em debito.");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(double v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }

    public void sacar(Double v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Impossivel sacar em uma conta fechada.");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossivel pagar em uma conta fechada.");

        }
    }

}
