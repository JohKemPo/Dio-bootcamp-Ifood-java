
import java.util.*;

/*
Desafio  
Dado um inteiro n, retorne o menor número de números quadrados perfeitos cuja soma seja n. Um quadrado perfeito é um inteiro que é o quadrado de um inteiro; em outras palavras, é o produto de algum inteiro consigo mesmo. Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são. 

Entrada
A entrada consiste em um número inteiro n, representando o valor total. 

Saída
A saída consiste em retornar o menor número de números quadrados perfeitos. 
*/
public class Desafio8 {
    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
        int res, count, contador;
        int[] d = new int[n + 1];

        for (int i = 1; i < d.length; i++) {
            if (i * i <= n) d[i] = i * i;
             else i = d.length - 1;
        }

        contador = 1000;
        
        for (int i = d.length - 1; i> 0 && i <= n; i--) {

            if (i >0 && d[i] > 0) {

                res = n;
                count = 0;

                for (int j = i; j > 0; j--) {
                    while (res > 0) {
                        if (res >= d[j]) {
                            res = res - d[j];
                            count++;
                        } else j--;
                    }
                }                

                if (contador > count) contador = count;
            }            
        }

        System.out.println(contador);
 
        
    }
}
