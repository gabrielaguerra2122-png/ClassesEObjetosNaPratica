public class Livro {
    String titulo;
 
    void pedirCadastroConfuso(){/*um metodo dentro de outro, é desnecessario. */
        Biblioteca.cadastroConfuso(this);
    }
    
    public static void main(String[] args) {
        Livro a = new Livro();
        a.titulo = "orgulho e preconceito";

        Biblioteca b = new Biblioteca();
        System.out.println(b.cadastrarLivro(a));/*metodo de instancia, tive q criar uma biblioteca pra chamar o metodo e 
        cadastrar o livro */
        
        System.out.println(Biblioteca.cadastrarLivroSemObjeto(a));/*metodo estatico, so chamei o metodo a partir da classe e passei
        o livro */
        a.pedirCadastroConfuso();
    }
}/*Sobre o return dos metodos:
tudo oq retornar algo tem que ser impresso se nao, nao é mostrado o resultado.
um void q tem um syso ou um retorn q tbm tem, so vai imprimir aquele syso se vc chamar ele, mas se o resultado
nao for estar nql syso, tem q ser impresso sim */
