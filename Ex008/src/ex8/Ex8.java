/*
 Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a 
quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo 
cliente. 
 */
package ex8;
import java.util.Scanner;
/**
 *
 * @author Julio Batista
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        
        float kgMr, kgMc, totFrutasKG, totFrutasRS, percentual, total = 0;
        
        System.out.println("Digite a quantidade em kg de Morangos comprados: ");
        kgMr = sc.nextFloat();
        
        System.out.println("Digite a quantidade em kg de Maçãs compradas: ");
        kgMc = sc.nextFloat();
        
        //Considerando que o valor do kg de Morango é: 3.90
        //Considerando que o valor do kg de Maça é: 2.50
        
        totFrutasKG = (kgMr + kgMc);
        
        totFrutasRS = (float) ((kgMr * 3.90) + (kgMc * 2.50));
        
        if ((totFrutasKG >= 8) || (totFrutasRS >= 25)) {
            percentual = (float) ((float)totFrutasRS * 0.10);
            total = (totFrutasRS - percentual);
            System.out.println("Compras a partir de R$25,00 tem desconto de 10%!!\nO valor total a ser pago é: R$" + total);
        } else {
            total = totFrutasRS;
            System.out.println("O valor total a ser pago é: R$" + total);
        }       
    }
    
}
