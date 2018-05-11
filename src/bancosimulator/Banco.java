package bancosimulator;
import bancosimulator.Conta;

public class Banco{

    public static void main(String[] args) {
        // TODO code application logic here
        
        //try{
            
        Conta minhaConta = new Conta(Cliente.pedro, 01, 1000.0, 50000.0);
        
        System.out.println(minhaConta.getTitular());
        System.out.println(minhaConta.getSaldo());
        minhaConta.depositar(500.50);
        System.out.println(minhaConta.getSaldo());
        //}
        //catch(java.lang.UnsupportedOperationException e){

        //}
    }

}


