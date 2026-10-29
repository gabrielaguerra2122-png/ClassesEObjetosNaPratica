public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;/*atribuição por valor pq eu to trabalhando com tipo primitivo,
         ou seja, na memoria foi criado uma copia do valor de a(2),
        para o valor de b, logo as duas sao independentes e separadas(n tem relaçao) */
        //de tal forma q se eu fizer:
        a++;
        b--;
        System.out.println(a + " e " + b);


        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1; /*atribuição por refencia pq eu to trabalhando com objeto.
        ou seja, no caso de atribuição dos objetos, eu n atribuo um valor e sim a referencia
        do endereço da memoria de onde o objeto criado no d1 esta, e agora tanto o d1
        quanto o d2, vao apontar pro mesmo local da memoria, pro mesmo objeto.
        tanto q se eu alterar algo no d2, o d1 eh afetado pq fazem referencia ao msm objeto */
        /*As duas variaveis apontam pro mesmo objeto em memoria */

        d1.dia = 31;//mexi no dia do d1, e impactou no dia do d2
        d2.mes = 12;//mexi no mes do d2, e impactou no mes do d1
        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.dataFormatada());
        System.out.println(d2.dataFormatada());

        int c = 5;/*nesse caso, ele pegou o c, copiou o valor dele(5), e fez o encremento, mas como eu imprimi 
        o valor da variavel original, o C, ele imprimiu 5, pq oq se tornou 6 foi a copia dele q esta armazenada
        numa variavel invisivel q o metodo criou, e q qnd o metodo acabar esa variavel e o valor sao
        excluidos pq n foram atribuidos */
        alterarPrimitivo(c);
        System.out.println(c);

        alterarPrimitivo(6);/*como o metodo eh void, ele nao retorna nada, mesmo que eu coloque o
        sysstem.out.println pra tentar imprimir, n da certo pq o metodo em si
        nao me devolve nenhum valor, apenas altera ele */
        
    }
    
    
    /*quando voce passa um OBJETO como parametro pra um metodo, esse metodo recebe a referencia
    em memoria de onde esse objeto esta, e copia essa referencia, oq consequentemente faz o metodo
    criar uma variavel invisivel pra armazenar essa copia da referencia, e ai o metodo vai ate ele usando a copia da
    mesmaaaa referencia dada,
    e faz a modificação q eh pra fzr.
    ou seja, quando vc passa um objeto como parametro pra um metodo, eu passo a referencia, e pelo
    fato de eu ter passado a referencia, eu consigo alterar esse objeto a partir desse metodo.
    Mas tem uma pegadinha, se eu pr um motivo usasse o metodo pra atribuir um novo endereço(
    static Data novoEndereco(Data d){
    return d = new Data();
    }) o objeto de fora E QUE SERVIU DE PARAMETRO pro metodo, NAO seria afetado.
     Por que isso acontece? Quando se passa um objeto como parametro pra qlqr metodo, o metodo copia a referencia de onde o objeto
     original ta e armazena numa variavel invisivel q so tem no metodo, pra ai eu conseguir modificar o objeto, e 
     dps jogar a variavel invisivel fora qnd o metodo acabar. Se eu usar um new Data();, ou seja, atribuo um novo 
     endereço pra aquele objeto, na realidade eu mudei o endereço da VARIAVEL DO METODO, pq as duas apontavam pro mesmo objeto
    mas o metodo so utiliza a varivel q ta dentro dele, ent qnd eu atribuo um novo endereço, 
    qm pega esse endereço eh a variavel invisivel. Mas se eu quiser eu poderia atribuir esse novo endereço para a variavel original
    se eu atribuisse o sla, d1 = novoEndereço(d1);  se eu imprimisse isso daria certo pq agr alem do metodo retornar algo
    eu atribui o valor alterado que foi armazenado so na variavel do metodo para a variavel original.
    SO LEMBRANDOOOO q se o metodo eh void, ele n retorna nada ent nao tem nem como atribuir, eu tenho q retornar
    exatamente aquilo que o metodo vai executar, como eu retorno um novo obj Data nesse exemplo, o tipo do metodo eh Data.
               */
    static void voltarDataParaValorPadrao(Data d){/*​O método VOID não retorna nada, mas altera o objeto original.
    ​Isso funciona porque a variável "invisível" (criada pra armazenar a copia da referencia do parâmetro) guarda uma 
    cópia do endereço que aponta para o mesmo objeto..
    ​O método vai até esse objeto, modifica os atributos dele (não cria um objeto novo) e guarda as alterações direto nele.
    ​Quando o método termina, a variável "invisível" é apagada pelo Garbage Collector, mas o objeto continua modificado na memória.
    ​Por isso, a variável original de fora enxerga as mudanças sem precisar de atribuição (d1 = ...). */
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    /*quando voce passa um valor primitivo pra um metodo, acontece a mesma coisa q acontece
    qnd vc atribui um valor primitivo a outro, ele vai criar uma copia do valor do primitivo
    e o metodo vai usar esse valor copiado, e nao a variavel em si.
    ou seja, se eu atribuo o int c = 5 pro metodo, ele apenas copia o 5, ele nao vai mexer no
    valor real da variavel pq nao vai mexer com a variavel, a menos que logo em seguida eu
    atribuisse o valor do metodo para a variavel, e ai ela passaria a ter o valor la*/
    static void alterarPrimitivoVoid(int a){
       ++a;/*se o metodo fosse um que retornasse um valor, teria q ser ++a por causa da 
       ordem de execução, 1 ele encrementa e dps ve o valor p retornar*/
    }
    static Data mudarEndereco(Data d){
      return d = new Data();
    }

 static int alterarPrimitivoSemVoid(int a){
      return ++a;
 }}