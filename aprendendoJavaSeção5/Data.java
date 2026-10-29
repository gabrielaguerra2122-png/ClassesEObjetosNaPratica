public class Data {
    int dia;
    int mes;
    int ano;


    @Override
    public String toString() {
        
        return String.format("%d/%d/%d",this.dia, this.mes,this.ano);




    }
    
   //

        /*voce tb tem como fazer assim:*/
      final int b=0;  
    String dataFormatad2(){
    return String.format(("%d/%d/%d"), dia,mes,ano);
        } 
        //ouuu

    void imprimirComSysoDataFormatada(){
        System.out.printf("%d/%d/%d\n", dia, mes, ano);}/*esse tipo de metodo(nao usar o return e sim algum print)
        nao vai funcionar em tudocomo em web, desktop.. por padrao, use o return.
        
        Alem disso tem como utilizar metodo dentro de outro metodo:
        */
    void imprimirComMetodoDentroDeMetodo(){
        System.out.printf(dataFormatad2());
    }
    


    Data(){//construtor padrao, mas que se eu nao definir os novos valores dos atributos, ele tem valores padroes guardados.
    
    }
    Data(int dia, int mes, int ano){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;

        String a = null;
        System.out.println(a.format("%s", null));
    /*nesse caso o metodo format é estatico, ou seja, eu nao preciso de um objeto para acessar ele
    entao mesmo o valor sendo nulo, ele executa a variavel A por ela ser string, ou seja
        é como se eu tivesse um String.format(..) pq o format em si, E ESTATICO, ent ele executou
        pq eu chamei a CLASSE STRING em si.
        
         */



    }
}


