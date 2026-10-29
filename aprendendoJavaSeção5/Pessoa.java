public class Pessoa {
    String nome;
    double peso;

    /*double comer(Comida a){//metodo que vai servir como somatorio de pesos
        System.out.printf("O peso de %s antes de comer é: %.2f\n", this.nome, this.peso);
        double soma = this.peso += a.pesoComida;
        System.out.printf("O peso de %s depois de comer é: %.2f\n\n", this.nome, this.peso);
        return soma;*/
        //logica da IA
    
    void comer(Comida a){//metodo que vai servir como somatorio de pesos
        if(a!=null){/*metodo de segurança que so executa o metodo se tiver uma variavel com uma referencia de endereço
            de algum objeto(comida no caso), e essa trava de segurança ai foi ideia do meu professor, no geral o metodo foi eu.*/
        System.out.printf("O peso de %s antes de comer é: %.2f kgs\n", this.nome, this.peso);
        this.peso += a.pesoComida;
        System.out.printf("O peso de %s depois de comer é: %.2f kgs\n\n", this.nome, this.peso);
     }}   //Minha logica original
       
    }
    

