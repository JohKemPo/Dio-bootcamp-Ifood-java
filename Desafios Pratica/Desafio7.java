import java.util.*;
/*
Desafio
Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é válida. 

Entrada
Uma string é considerada válida se:

Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente. Uma string vazia é considerada válida. 

Saída
A saída corresponde a um valor Booleano 
*/
public class Desafio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // System.out.println("Digite a string: ");

        boolean caracter = ehValido(scanner.nextLine());
        
        System.out.println(caracter);
        scanner.close();
    }

    public static boolean ehValido(String s) {
        String[] letras = s.split("");
        String[] tags = {"(",")","{","}","[","]"};
        boolean bool = false;

        for(int i = 0; i < tags.length; i++){
            if (letras[0].equals(tags[i]) && letras[letras.length-1].equals(tags[i + 1])) bool = true ;
            
        }
        return bool;
        
    }
}
