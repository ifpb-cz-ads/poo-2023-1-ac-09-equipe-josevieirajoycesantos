public abstract class Conta {
    private int numero;
    // private String nome_Titular; -> referente a questão 01
    private Cliente titular;
    protected double saldo;

    public Conta(int numero, Cliente titular, double saldo){
        this.numero= numero;
        // this.nome_Titular= nome_Titular;
        this.titular = titular;
        this.saldo= saldo;
    }

    public Conta(int numero, Cliente titular){
        this.numero= numero;
        // this.nome_Titular= nome_Titular;
        this.titular = titular;
        this.saldo= 0;
    }

    public Conta(int numero, String nomeTitular, String cpfTitular){
        this.numero= numero;
        // this.nome_Titular= nome_Titular;
        this.titular = new Cliente(nomeTitular, cpfTitular);
        saldo= 0;
    }

    public Cliente getTitular(){
        // return this.nome_Titular;
        return titular;
    }
    public void setTitular(Cliente titular){
        // this.nome_Titular= nome;
        this.titular = titular;
    }

    public int getNumConta(){
        return this.numero;
    }
    public void setNumConta(int conta){
        this.numero= conta;
    }
    public double getSaldo(){
        return this.saldo;
    }   
    public void setSaldo(int deposito){
        this.saldo= deposito;
    }
    
    public abstract boolean sacar(double valor);

}
