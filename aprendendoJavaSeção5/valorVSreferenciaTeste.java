public class valorVSreferenciaTeste {
    public static void main(String[] args) {
        Data d1 = new Data(1, 2, 2343);
        System.out.println(d1.dataFormatada());
       d1= ValorVsReferencia.mudarEndereco(d1);//atribui
        System.out.println(d1.dataFormatada());

        Data d2 = new Data(1, 2, 2343);
        System.out.println(d2.dataFormatada());

       ValorVsReferencia.mudarEndereco(d2);/*chamei meu metodo, mas como esse metodo modifica o endereço da variavel
       que foi usada pra armazenar a copia do endereço, no caso a variavel do metodo, eu tenho que atribuir o valor
       pra variavel original assim como eu fiz em cima pra ele se modificar, se n msm passando o d2 como parametro 
       ele nao vai passar um novo endereço pra ele e sim pra variavel.
       
       Nesses casos eh so pra prestar atenção, nao faz sentido querer atribuir um novo endereço pra um objeto
       por meio de um metodo pq sempre vai confundir e dar complicaçoes. */
        System.out.println(d2.dataFormatada());

        d2 = new Data();
        System.out.println(d2);
        
        int a = 3;
        ValorVsReferencia.alterarPrimitivoVoid(a);/*aqui ele alterou a copia do valor de a, mas como eh void ele n
        retornou nada, entao nao tem como atribuir isso para a variavel original */
        System.out.println(a);

       ;/*ja esse metodo retorna um int, eu consigo atribuir a
       modificação da copia ao valor original, sem atribuir o valor original continua o msm pq oq mudou
       foi a copia do valor */
        System.out.println(ValorVsReferencia.alterarPrimitivoSemVoid(a));
        System.out.println(a);
    }
}
