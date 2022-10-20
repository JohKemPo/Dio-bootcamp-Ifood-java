import java.util.Scanner;
public class Desafio2 {
    public class Main {
        public static void main(String[] args) {
            int A, N, acumulador = 0;
            
            Scanner input = new Scanner(System.in);
            A = input.nextInt();
            N = input.nextInt();
    
            for(int i = 0; i <= N; i++){
                if(i % A == 0){
                    acumulador += i;
                }
            }
            System.out.println(acumulador);
            input.close();
        }
    }
}
