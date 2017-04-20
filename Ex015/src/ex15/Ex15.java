/*
  Construa um fluxograma que permita a entrada da quantidade de diárias de um 
hotel desejadas pelo cliente e ao final mostre o total de sua conta. 
Esse hotel cobra R$ 60.00 a diária e mais uma taxa de serviços, conforme tabela
abaixo: 
- R$ 5.50 por diária, se o número de diárias for maior que 15; 
- R$ 6.00 por diária, se o número de diárias for igual a 15; 
- R$ 8.00 por diária, se o número de diárias for menor que 15. 
 */
package ex15;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        int qtdeDia = 0;
        float total;
        int continuar = 0;
        do {
        System.out.println("Digite a quantidade de Diárias: ");
        qtdeDia = input.nextInt();
        
        if (qtdeDia > 15) {
            total = (float) ((qtdeDia * 60) + (qtdeDia * 5.50));
            System.out.println("Valor Total: R$" + total);
        } else {
            if (qtdeDia == 15) {
                total = (float) ((qtdeDia * 60) + (qtdeDia * 6));
                System.out.println("Valor Total: R$" + total);
            } else {
                if (qtdeDia > 0) {
                    total = (float) ((qtdeDia * 60) + (qtdeDia * 8));
                    System.out.println("Valor Total: R$" + total);
                } else {
                    System.out.println("Digite um valor válido.");
                }
            }
        }
        
        System.out.println("Deseja Continuar?\n1. SIM\n2. NÃO");
        continuar = input.nextInt();
      } while (continuar == 1);
    }
    
}
