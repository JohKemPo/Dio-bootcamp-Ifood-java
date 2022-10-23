import java.util.*;

public class Desafio5 {
    static int posicao(int numero, int[] elementos, int pos) {
        for (int i = 0; i < elementos.length; i++){
            if(numero == elementos[i]){
                pos = i;
            }
        }
        return pos;
    }
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int num, pos = -1;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        num = leitor.nextInt();

        pos = posicao(num, elementos, pos);

        if (pos == -1){
            System.out.println("Numero " + num + " nao encontrado!");
        } else System.out.println("Achei " + num + " na posicao " + pos);
        
        leitor.close();

    }
}
