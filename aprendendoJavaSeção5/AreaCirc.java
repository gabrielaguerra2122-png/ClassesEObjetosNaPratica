public class AreaCirc {
    double raio;
    static final double PI= 3.14;

    AreaCirc(double raioInicial){/*construtor que vai exigir um parametro pra criar um objeto */
        raio = raioInicial;
      
    }
    double area(){/*metodo de instancia(so vai poder usar esse se tiver um objeto) */
    return PI * raio * raio;
    }
    static double area(double raio){/*esse metodo pertence a classe, ou seja, eu posso usar ele
        sem precisar criar um objeto, pq ele vai usar os parametros pedidos.
        detalhe eh q metodo de classe NAO usa atributos de instancia, apenas estaticos q nem ele
        ou parametros colocados nas (), ou seja o raio em questao q vai servir como dados
        vai ser recebido como parametro diretamente pelo metodo */
        return PI * Math.pow(raio, 2) ;
    }

}
