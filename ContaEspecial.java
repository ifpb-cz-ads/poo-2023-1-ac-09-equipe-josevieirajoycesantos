public class ContaEspecial extends Conta {
    private double limite;

    // Questão 01)
    // ContaEspecial(int numero, String nome_Titular, double saldo){
    //     super(numero,nome_Titular,saldo);
    //     this.limite = limite;
    // }

    ContaEspecial(int numero, Cliente titular, double saldo){
        super(numero, titular, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor){
        if(valor <= this.limite + this.saldo){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }
}
