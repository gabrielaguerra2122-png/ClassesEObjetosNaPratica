public class Produto {
String nome;
double preco;
static double desconto = 0.25 ;
/*nao preciso colocar nenhum parametro nesse metodo pq o objeto ja tem esses dados
predefinidos pela classe, mas se eu n tivesse eu precisaria receber isso de fora */
double precoComDesconto(){/*em metodos de instancia eu posso acessar valores estaticos numa boa */
    return preco * (1.0 - desconto);
    }
    //defini de forma explicita um construtor padrao do java
    Produto() {
    }
    //defini de forma explicita um construtor que vai exigir q eu adicione os valores dos atributos logo de cara     
    Produto(String nomeIncial, double precoIncial){//agr eu tenho um construtor q vai pedir logo de cara o nome do produto
        nome = nomeIncial;//e que qnd vc passar esse parametro, vai armazenar na variavel nome, mas vc ainda pode mudar dps pq como o nome
        //diz, eh uma variavel.
        preco = precoIncial;/*eu tenho que definir aqui logo dentro da classe que o nome, desconto e preco, respectivamente
        vao receber o valores nomeInicial, descontoInicial e precoInicial, se eu n fizesse isso, o parametro adicionado
        nao serviria de nada, pq ele nao ia ser armazenado e consequentemente, sumiria */
       
    }

static double precoComDesconto(double preco){/*em metodos estaticos eu so posso acessar o proprio parametro q ele pede
    ou outros atributos e metodos contanto q sejam estaticos tb */
    return preco * (1.0 - desconto);
    }




}

