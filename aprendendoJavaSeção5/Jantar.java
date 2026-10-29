public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Britney";
        p1.peso = 45.8;

       Comida c1 = new Comida("Feijão", 0.230);
       Comida c2 = new Comida();
       c2.nomeComida = "Arroz";
       c2.pesoComida = 0.223;
 
       p1.comer(c2);
       p1.comer(c1);
    }
}
