import java.util.*;

public class Desafio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a, b;
        a = teclado.nextInt();
        b = teclado.nextInt();
        
        if(a == b){
          System.out.println("Sao iguais!");
        }else System.out.println("Nao sao iguais!");
        teclado.close();
    }
}