/*
Receba três números inteiros e os apresente na tela na ordem crescente de valor,
ou seja, do menor até o maior. Se houver números iguais, apresente uma mensagem
“Os números X e Y são iguais”, onde o X e o Y são os valores armazenados nas 
variáveis.
*/
package ex5;
import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        int n1, n2, n3 = 0;
        
        System.out.println("Digite o primeiro número inteiro: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        n2 = sc.nextInt();
        
        System.out.println("Digite o terceiro número inteiro: ");
        n3 = sc.nextInt();
        
        if ((n1 > n2) && (n2 > n3)) {
            System.out.println(n3 + ", " + n2 + ", " + n1);
        } else {
            if ((n1 > n2) && (n1 < n3)) {
                System.out.println(n2 + ", " + n1 + ", " + n3);
            } else {
                if ((n2 > n1) && (n3 > n2)) {
                    System.out.println(n1 + ", " + n2 + ", " + n3);
                } else {
                    if ((n2 > n3) && (n3 < n1)) {
                        System.out.println(n3 + ", " + n1 + ", " + n2);
                    }
                } 
            }
        }
        
        if ((n1 == n2) || (n2 == n1)) {
            System.out.println("Os valores " + n1 + " e " + n2 + " são iguais.\nPor favor, verifique!");
        } else {
            if ((n1 == n3) || (n3 == n1)) {
                System.out.println("Os valores " + n1 + " e " + n3 + " são iguais.\nPor favor, verifique!");
            } else {
                if (( n2 == n3) || (n3 == n2)) {
                    System.out.println("Os valores " + n2 + " e " + n3 + " são iguais.\nPor favor, verifique!");
                }
            }
        }
    }
    
}
