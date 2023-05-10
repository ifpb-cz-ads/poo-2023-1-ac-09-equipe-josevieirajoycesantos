public class ContaPoupança extends Conta {
    // Questão 01
    // ContaPoupança(int numero, String nome_Titular, double saldo){
    // super(numero,nome_Titular,saldo);
    // }

    ContaPoupança(int numero, Cliente titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
