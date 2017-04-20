/*
  Uma empresa paga ao corretor uma comissão calculada de acordo com o valor de 
suas vendas. Se o valor da venda do corretor for maior que R$ 50.000.00 a 
comissão será de 12% do valor vendido. Se o valor da venda do corretor estiver 
entre R$ 30.000.00 e R$ 50.000.00 (incluindo extremos) a comissão será de 9.5%. 
Em qualquer outro caso, a comissão será de 7%. Escreva um fluxograma que 
permita a entrada do valor da venda do corretor. Ao final deverá ser 
apresentada a comissão calculada. 
 
 */
package ex14;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        
        float vlrVen, total;
        int continuar;
        
        do {
            System.out.println("Digite o valor total de Vendas: ");
            vlrVen = input.nextFloat();
            
            if (vlrVen > 50000) {
                total = (float) (vlrVen * 0.12);
                System.out.println("Parabéns! Você recebeu 12% de comissão: " + total);
            } else {
                if (vlrVen >= 30000) {
                    total = (float) (vlrVen * 0.095);
                    System.out.println("Parabéns! Você recebeu 9,5% de comissão: " + total);
                } else {
                    total = (float) (vlrVen * 0.07);
                    System.out.println("Parabéns! Você recebeu 7% de comissão: " + total);
                }
            }
            
            System.out.println("Deseja Continuar?\n1. SIM\n2. NÃO");
            continuar = input.nextInt();
            
        } while (continuar == 1);
        
    }
    
}
