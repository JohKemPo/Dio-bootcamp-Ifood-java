import java.util.*;
/**
 * 
 * 
Desafio
Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.

Retorne qualquer array que satisfaça essa condição.
 
Entrada
A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array. As linhas seguintes deverão conter os valores que esse array receberá.

Saída
A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares.
*/

public class Desafio9 {
    public static void main(String args[]) {
          
        Scanner teclado = new Scanner(System.in);
         int i, aux;
         //System.out.println("Digite o tamanho do Array: ");
         int N = teclado.nextInt();
         int [] numeros = new int[N];
         teclado.close();     		
   
        for (i = 0; i < N; i++) numeros[i] = teclado.nextInt();
          	
        for (i = 0; i < N; i++){
            if (numeros[i] % 2 != 0){
                for (int j = (i+1); j < N; j++){
                    if (numeros[j] % 2 == 0) {
                        aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                        j = N;
                    }					
                }
            }
        }
         
        for (i = 0; i < N; i++) System.out.println(numeros[i]);
    }
         
}
