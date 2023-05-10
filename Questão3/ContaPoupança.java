package Questão3;
public class ContaPoupança extends ContaBancaria{

   ContaPoupança(String nomeTitular, int numConta, int saldo, boolean epecial) {
      super(nomeTitular, numConta, saldo, epecial);
   }

   public void reajustar(int percentual){
      int saldoAtual= this.getSaldo();
      int reajuste= saldoAtual*percentual;
      this.depositar(reajuste);
   }

   public void depositar(int valor){
        this.saldo=  getSaldo() + valor;

   }

   public void sacar(int valor){
      if(valor <= this.getSaldo()){
         this.saldo= getSaldo()- valor;
      }
      else{
         System.out.println("Tentativa de saque fracassada! Voçê não possui este saldo. Por favor realize uma operação válida.");
      }
   }

   public void extrato(){
        System.out.println("-- Extrato --");
        System.out.println("Titular: " + getNomeTitular());
        System.out.println("Conta: " + getNumConta());
        System.out.println("Saldo: " + getSaldo());
    }
}
