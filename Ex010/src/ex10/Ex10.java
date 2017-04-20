/*
 Faça um fluxograma que leia o número de garrafas d’água compradas por uma 
pessoa, calcule e mostre o custo total da compra, sabendo que as garrafas 
custam R$ 2.50 cada se forem compradas menos de uma dúzia, e se forem 
compradas pelo menos 12 unidades, o custo total da compra terá um desconto 
de 10%.  
 */
package ex10;
import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        int qtdeGar;
        float mult, perc, total;
        
        System.out.println("Digite a quantidade de Garrafas Compradas: ");
        qtdeGar = sc.nextInt();
        System.out.println();
        
        if ((qtdeGar > 0) && (qtdeGar < 12)) {
            total = (float) (qtdeGar * 2.50);
            System.out.println("Valor total a ser pago é: R$" + total);
        } else {
            if (qtdeGar >= 12) {
                mult = (float) (qtdeGar * 2.50);
                perc = (float) (mult * 0.10);
                total = mult - perc;
                System.out.println("Valor total a ser pago com desconto de 10% é: R$" + total);
            } else {
                System.out.println("Digite um valor válido.");
            }
        }       
    }    
}
