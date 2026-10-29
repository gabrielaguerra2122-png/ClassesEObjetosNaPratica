public class VeiculoTeste{
public static void main(String[] args) {
 
    Garagem loja = new Garagem();
    Veiculo v1 = new Veiculo("Honda", "Civic", 2024, 60000, 202800, "Disponivel");

    Veiculo v2 = new Veiculo("Jeep", "Renegade", 118290);
   
v1.calcularValorVenda();

loja.realizarTransacao(v1);


v2.registrarViagem(60000);

v2.calcularValorVenda();

loja.realizarTransacao(v2);

loja.realizarTransacao(v1);



}}