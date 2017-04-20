/*
Faça um fluxograma que leia o número de litros de leite produzidos por uma 
fazenda em um dado mês e a quantidade de litros vendidos por esta fazenda. 
Calcule e mostre o valor total da venda, sabendo que o litro custará 
R$ 2.20 caso a produção alcance 1000 litros no mês, e R$ 2.50 caso a 
produção não alcance esta quantidade.
 */
package ex012;
import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //..:: DÚVIDA ::..
        // Se eu utilizar um número negativo somente em uma das entradas
        // o sistema calcula negativo. Como fazer com que ele entre no
        // último ELSE quando o usuário informar algum número negativo
        // em uma das duas entradas?
        
        
        Scanner sc = new Scanner (System.in);
        
        float ltProd, ltVen, total;
        
        System.out.println("Infome o a Quantidade de Litros de Leite Produzidos no Mês: ");
        ltProd = sc.nextFloat();
        
        System.out.println("Infome o a Quantidade de Litros Vendidos no Mês: ");
        ltVen = sc.nextFloat();
        
        if ((ltProd >= 1000) && (ltVen >= 0)) {
            total = (float) (ltVen * 2.20);
            System.out.println("O valor total da Venda do Leite foi: " + total);
        } else {
            if ((ltProd >= 0) && (ltVen >= 0)) {
                total = (float) (ltVen * 2.50);
                System.out.println("O valor total da Venda do Leite foi: " + total);
            } else {
                System.out.println("Digite um valor Válido.");
            }
        }
        
    }
    
}
