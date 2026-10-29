public class Biblioteca {
    String cadastrarLivro(Livro a){/*ele retorna pra mim uma string formatada, e pega como parametro um livro
        pra poder acessar o titulo dele */
      return String.format("Cadastro do livro %s feito com sucesso!", a.titulo);}
   
   
      static String cadastrarLivroSemObjeto(Livro a){/*ele retorna pra mim uma string formatada, e pega como parametro um livro
        pra poder acessar o titulo dele */
        System.out.println("xuxuuu");
      return String.format("Cadastro do livro %s feito com sucesso!", a.titulo);}

     
      static void cadastroConfuso(Livro a){
        System.out.printf("Cadastro do livro %s feio com sucesso!", a.titulo);
      }
      

    }


