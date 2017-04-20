/*
Uma companhia de carros paga a seus empregados um salário de R$ 1.000,00 
por mês mais uma comissão de R$ 100,00 para cada carro vendido pelo vendedor
e mais 5% do valor geral das vendas do mês. Elabore um fluxograma para 
calcular e mostrar na tela o salário total do vendedor em um dado mês 
recebendo como dados de entrada o número de carros vendidos pelo vendedor e o
valor total das vendas da empresa no mês. 
 */
package ex011;
import java.util.Scanner;
/**
 *
 * @author Julio Batista
 */
public class Ex011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        int crVen;
        float comis, perc, totVendas, salTotal;
        
        System.out.println("Digite a quantidade de Carros Vendidos: ");
        crVen = sc.nextInt();
        
        System.out.println("Digite o valor total de Vendas no mês: ");
        totVendas = sc.nextFloat();
        System.out.println();
        
        comis = (float) (crVen * 100);
        perc = (float) (totVendas * 0.05);
        
        salTotal = (1000 + comis + perc);
        
        System.out.println("Seu Salário total é: R$" + salTotal);
        
    }
    
}
