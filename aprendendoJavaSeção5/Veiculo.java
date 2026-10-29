public class Veiculo {
    String marca;
    String modelo;
    int anoFabricacao;
    int kmRodado;
    double precoBaseDeCompra;
    String status;

    Veiculo( String marca, String modelo, int anoFabricacao, int kmRodado, double precoBaseDeCompra, String status){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.kmRodado = kmRodado;
        this.precoBaseDeCompra = precoBaseDeCompra;
        this.status = status;
    }
    Veiculo(String marca, String modelo, double precoBaseDeCompra){
 
        this(marca, modelo, 2026, 0, precoBaseDeCompra, "Disponivel");
    }

    void registrarViagem(int valorKmAMais){
        if(valorKmAMais>0){
            this.kmRodado+=valorKmAMais;
            System.out.println("Km rodado atual do carro: " + this.kmRodado);
        }
    }
void calcularValorVenda(){
    double desconto = 0;
    if(this.kmRodado>50000){
         desconto = this.precoBaseDeCompra * 0.20;//this.precoBaseDeCompra *= 2/100;
         this.precoBaseDeCompra -= desconto; 
        System.out.println("O preço do carro com a desvalorização é: " + this.precoBaseDeCompra); }
    else{System.out.println("O carro continua com seu preço original: "+ 
    this.precoBaseDeCompra);
        } 

}
void venderVeiculo(Veiculo v1){
   if(v1.status.equalsIgnoreCase("Disponivel")){
     v1.status = "Vendido";         
}
    else if(v1.status.equalsIgnoreCase("Vendido")){
        System.out.println("Não é possivel vender um carro ja vendido!");
    }
}










}
