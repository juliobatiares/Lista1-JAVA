/*
  As maçãs custam R$ 1,30 cada, se forem compradas menos de uma dúzia, e R$ 1,00
  se forem compradas pelo menos 12. Escreva um fluxograma que leia o número de 
  maçãs compradas, calcule e escreva o custo total da compra. 
 */
package ex6;
import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        int qtdeMacas;
        float vlrMacas = 0, vlrTotal;
        
        System.out.println("Digite a quantidade de Maças compradas: ");
        qtdeMacas = sc.nextInt();
        
        // Não entendi pq eu tenho que colocar a condição < 12 sendo que já
        // especifiquei no outro if >= 12 
        
        if ((qtdeMacas > 0) && (qtdeMacas < 12)) {
            vlrMacas = (float) 1.30;
            vlrTotal = qtdeMacas * vlrMacas;
            System.out.println("O valor total a ser pago é: R$" + vlrTotal);
        } else {
            if (qtdeMacas >= 12) {
                vlrMacas = (float) 1.00;
                vlrTotal = qtdeMacas * vlrMacas;
                System.out.println("O valor total a ser pago é: R$" + vlrTotal);
            } else {
                System.out.println("Por favor, digite um valor válido.");
            }
        }        
    }
    
}
