
public class ProdutoTeste {/*so pra servir de obervação, quando criamos uma classe e dentro do mesmo pacote testamos ela, 
    nao precisamos usar o import, mas se fosse fora do mesmo pacote, ai sim eu usaria o import 'nome do pacote'.'nome da classe'
    essa eh a msm regra do java.lang, se esta dentro do java.lang eu n preciso importar, se n, eu importo.

    */
    public static void main(String[] args) {
       /*uma classe define um tipo, se eu criei uma classe Produto, agora eu tenho um tipo produto(como um tipo string,
       q tb eh uma classe) */
       Produto p1 = new Produto();
       p1.nome = "Amora";//alterei o valor dessa variavel
       p1.preco = 34.90;
       

       var p2 = new Produto("Ovo da pascoa", 9485.0);
       /*outra maneira de instanciar um objeto a partir da minha classe personalizada */
       p2.nome = "Notebook";//como eh variavel, eu posso mudar
       p2.preco = 5687.90;
      /* p2.desconto = 0.35;no java a gnt pega o valor do desconto(35%) e divide pr 100, que da 0.35, com  0
       antes do numero indica exatamente a parte fracionaria do valor.*/
       System.out.println(p2.nome);

       System.out.println("Desconto p1: "+ p1.preco * (1 - Produto.desconto));/*essa conta representa uma conta rapida de porcentagem, como em java
       ele utiliza de valores decimais pra desconto, entao decifrando essa sentça é :
       p1= 34.90 * (100% - 10%), 100% é representado por 1.0, blz e pq q subtrai? Pq o valor total sem desconto(100%)
       menos o desconto dado(10%), da a porcentagem do preço final, no caso ele ja aplicou os 10% de desconto, e agora
       ele multiplica pelos 90% q vc vai pagar(q antes era 100%) */
    /*usando a notação ponto, eu acesso os atributos e metodos, e tbm posso utilizar os valores e usar eles, como
no caso desse calculo do desconto */
double precofinal = p2.precoComDesconto();
System.out.printf("O preço do p2 com desconto é %.2f ", precofinal);
/*QUANDOO vc chama algo com o . se vier com () no final, eh um metodo, sem () eh um atributo */
}

    
}
