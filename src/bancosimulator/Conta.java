package bancosimulator;
import bancosimulator.Cliente;

class Conta extends bancosimulator.Cliente{

    private bancosimulator.Cliente titular = new bancosimulator.Cliente();
    private int numero;
    private double limite;
    private double saldo;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getTitular() {
        return titular.nome;
    }

    public void setTitular(bancosimulator.Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }


    Conta(bancosimulator.Cliente titular, int numero, double limite, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.limite = limite;
        this.saldo = saldo;
    }

    public boolean sacar(double valor) {
        double novoSaldo;
        novoSaldo = getSaldo();
        if (valor < 0 && valor > novoSaldo) {
            System.out.println("Problema ao sacar !");
            return false;
        } else {
            novoSaldo -= valor;
            setSaldo(novoSaldo);
            System.out.println("Saque efetuado com sucesso");
            return true;
        }
    }

    public void depositar(double valor) {
        double novoSaldo;
        if (valor > 0) {
            novoSaldo = getSaldo();
            novoSaldo += valor;
            setSaldo(novoSaldo);
            System.out.println("Deposito efetuado com sucesso");
        } else {
            System.out.println("Problema ao depositar !");
        }
    }
    
    public boolean transferePara(Conta destino, double valor){
        boolean retirou = this.sacar(valor);
        if(retirou){
            destino.depositar(valor);
            return true;
        }
        else{
            System.out.println("Falha ao sacar de sua conta.");
            return false;
        }
    }
}
