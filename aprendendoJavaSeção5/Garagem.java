public class Garagem {
    String nomeLoja;
    static final double taxaDeLucro = 0.10;
    double totalLucroAcumulado;

void realizarTransacao(Veiculo v1){
    if(v1!= null && v1.status.equalsIgnoreCase("Disponivel")){
    this.totalLucroAcumulado += v1.precoBaseDeCompra + taxaDeLucro;
    v1.status = "Vendido/Indisponivel";
    System.out.println("Veiculo vendido!");
    System.out.println("O lucro total da loja foi: " + totalLucroAcumulado);
}
else{
    System.out.println("Ou o veiculo não existe, ou ja foi vendido!");
}
  }

}
