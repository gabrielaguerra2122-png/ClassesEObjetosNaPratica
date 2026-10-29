public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();/*criei a instancia d1, alterei os dados */
        
        System.out.println(d1.dataFormatad2());
        var d2 = new Data(30, 03, 2026);/*criei a instancia d2, completamente diferente ou 
        seja outro espaço de memoria, defini seus valores*//*e usei um dos contrutores q eu personalizei)*/

        System.out.println(d2.dataFormatad2());
       /*imprimi as 3 datas(d1, d2, d3) cada com seu proprio valor de forma
        independente */
        
        
    
        Data d3  = new Data();
        d3.dia = 03;// o java interpreta inteiros iniciados com '0' como base OCTAL (base 8), e não decimal.
        d3.mes = 8;
        d3.ano = 2003;
        System.out.println(d3.dataFormatad2());
    
    /* */
    
    
    /*Embora os atributos estejam dentro do corpo da classe, sao atributos que pertencem a cada um das instancias q sao criadas, ou
    seja, sempre  q eu crio uma nova instancia, vai ter um novo espaço de memoria que esta reservada pros
    atributos dessa instancia, e seus respectivos valores. */

    /*  Inteiros:
    int a = 03;  // Válido (é 3 em octal)
    int b = 08;  // ERRO DE COMPILAÇÃO! (8 não existe em octal)
    
    // Ponto Flutuante:
    double c = 03.5; // Válido (o Java ignora o 0 e lê como 3.5)
    double d = 08.5; // Válido! (o Java ignora o 0 e lê como 8.5)*/

/*Nos flutuantes basicamente ele so ignora, n da erro apenas ignora
 */
String a = String.format("%d e %d e %d", d1.ano, d1.mes, d1.dia);/*so pra testar pq eu n lembrava dessa 
funçao de formatar diretamente na string*/
System.out.println(a);

Data d11 = new Data(1,1,2098);
System.out.println(d11);
}
}
