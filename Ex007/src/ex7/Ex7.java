/*
 O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
escrever um algoritmo que leia o custo de fábrica de um carro e escreva o 
custo ao consumidor. 
 */
package ex7;
import java.util.Scanner;


/**
 *
 * @author Julio Batista
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        float cFab, pDist, imp, totCarro = 0;
        
        System.out.println("Digite o valor do custo de Fábrica do Carro: ");
        cFab = sc.nextFloat();
        
        pDist = (float) (cFab * 0.28);
        imp = (float) (cFab * 0.45);
        
        totCarro = (cFab + pDist + imp);
        
        System.out.println("O valor do carro com a porcentagem do distribuidor e Impostos é: R$" + totCarro);
        
    }
}
