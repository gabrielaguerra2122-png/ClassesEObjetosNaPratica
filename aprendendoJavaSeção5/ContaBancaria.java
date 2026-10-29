public class ContaBancaria {
    int numeroDaConta;
    String nomeTitular;
    double saldo;
    static double taxaDeTransferencia = 3.5;

    ContaBancaria(String nomeTitular, double saldo){
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
   }
ContaBancaria(){/*construtor padrao, mas, com parametros padroes definidos com outro construtor */
    this("Nome não informado", 0.0);

}

double depositar(double valor){
    double encremento = 0;/*criei uma variavel pra retornar */
    if(valor>0){//se o valor for positivo
        encremento = this.saldo += valor;/*eu atribuo o novo deposito no saldo do objeto o qual eu chamei o metodo
        e adiciono na variavel pra retornar */
}
    return encremento;
}
void sacar(double valor){

    if(valor<this.saldo){
        this.saldo-=valor;}
       //subtrai o valor do saque do meu saldo
}

void transferir(double valor, ContaBancaria a){
   double saldoNovo = 0;
   if(a!=null){//se a variavel realmente apontar pra algum objeto, eu executo
    this.saldo -= taxaDeTransferencia;/*saldo do objeto o qual eu chamei o metodo menos a taxa */
    this.saldo -= valor;/*saldo do objeto menos o valor da transferencia */
     saldoNovo = a.saldo += valor;
    System.out.println("O saldo da conta que recebeu a transferência é de: " + saldoNovo);}/*atribuição aditiva do valor transferido, pra conta do objeto passado por parametro
     e armazenado numa variavel pra dps eu retornar e nao da um erro de runtime tentando acessar algum atributo/metodo */
   else{
    System.out.println("A conta a qual voce ia transferir nao existe.");
    System.out.println("Seu saldo continua: " + this.saldo);
   }
   /*se eu tentasse colocar System.out.println("O saldo da conta que receberia a transferencia continua: " + a.saldo);
   daria erro de compilação. MAS POR QUE? O if so vai ser executa se o objeto atribuido como parametro for diferente
   de nulo, ou seja, se for igual a nulo ele vai pular pro else.. se eu colocasse o else pra acessar o saldo
   da suposta contaBancaria de algo que esta NULO, daria erro de compilação pq nao tem como acessar um atributo
   de algo q n ta na memoria(n existe).
   Entao, eu informo q a conta nula a qual eu ia transferir o dinheiro nao existe*/
}












}
