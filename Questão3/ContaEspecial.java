package Questão3;
public class ContaEspecial extends ContaBancaria {

    ContaEspecial(String nomeTitular, int numConta, int saldo, boolean epecial) {
        super(nomeTitular, numConta, saldo, epecial);

    }

    public void depositar(int valor){
        this.saldo=  getSaldo() + valor;
    }

    public void sacar(int valor) {
        setSaldo(this.saldo - valor);
        System.out.println(" ");
        System.out.println("Realização de saque no valor de  " + valor);
    }

    public void extrato() {
        System.out.println("-- Extrato --");
        System.out.println("Titular:" + getNomeTitular());
        System.out.println("Conta: " + getNumConta());
        if (getSaldo() < 0) {
            System.out.println("Atenção Saldo NEGATIVO!");
        }
        System.out.println("Saldo: " + getSaldo());

    }

}
