import java.util.Scanner;

public class testescomuns {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    String sla = entrada.nextLine();
    switch(sla){
        case "oi":
           System.out.println("ola pra vc tb"); 
            break;
            default:
                System.out.println("vai falar oi nao bxg");
    }
    
    
  

  entrada.close();
}
}
