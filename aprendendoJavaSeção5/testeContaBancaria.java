public class testeContaBancaria {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("Nikki", 1000.0);
         ContaBancaria c2 = new ContaBancaria();
         c2.nomeTitular = "Daphne";

         System.out.println(c1.saldo);
         System.out.println(c2.saldo);


         c1.transferir(200.0, c2);
        
         System.out.println(c1.saldo);
         System.out.println(c2.saldo);
         ContaBancaria c3 = null;

         c1.transferir(300, c3);
         System.out.println(c1.saldo);
    }
}
