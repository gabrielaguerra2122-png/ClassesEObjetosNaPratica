public class ValorNulo {
    public static void main(String[] args) {/*objeto vazio é diferente de objeto nulo */
        String s1 = "";//eu criei m objeto, mas ele esta vazio, entretanto a variavel guardou a referencia de onde esse obj ta
        System.out.println(s1.concat("!!!!"));

       // Data d1 = null;
       // d1.mes = 3;//eu nao posso acessar atributos 
        //e metodos de alguma varaivel que esta nulo, que nao aponta pra um objeto real na memoria


/*Esses 2 casos de codigo abaixo, estao simulando um caso real em que eu nao sei quando uma variavel de 
objeto vai ter uma referência atribuida ou vai ser null, e oq eu poderia fzr pra garantir que quando
eu acessar os atributos e metodos desse objeto, nao de erro(vai garantir que so acesse se existir um objeto
referente à variavel, se for null ele nao temta acessar) */

        Data d2 = Math.random() > 0.5 ? new Data() : null;
        if(d2 != null){
            System.out.println(d2.dataFormatad2()); /*como eu nao atribui nenhum valor
            ao dia, mes e ano, o terminal vai imprimir os valores padroes do tipo do
            atributo definido na classe(int), q vai ser 0 */
        }
        String s2 =  Math.random() > 0.5 ? new String() : null;/*sobre o novo endereço new String, podia ser so um 
        valor string literal: Basicamente, se eu coloco uma literal string ou seja ja atribuo um valor literal(uma palavra)
        pra aquela variavel do tipo string, ele automaticamente cria meu objeto na memoria, ou seja, a variavel do tipo
        string agora guarda a referência do objeto, e esse objeto tem nele a palavra q eu atribui antes(literal string) */
        
        if(s2 != null){
          System.out.println(s2.concat("!!!!"));
      }
     // int a; //como estamos num metodo(main), ent criamos variaveis locais onde eu obrigatoriamente
     // System.out.println(a); //tenho q atribuir um valor(inicializar ela).
    }
}
