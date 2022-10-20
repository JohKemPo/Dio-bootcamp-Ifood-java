import java.util.*;

public class Desafio3 {
    public class Main {

        public static void main(String[] args) {
    
            Scanner numero = new Scanner(System.in);
            int N;
            N = numero.nextInt();
            System.out.println(somatorio(N));
            numero.close();
        }
        
        static int somatorio(int numero) {
            if (numero == 0) {
                return 0;
            } else return numero + somatorio(numero - 1);
            
        }
    }
}
