/*
 Um posto está vendendo combustíveis com a seguinte tabela de descontos: 
álcool com 3% de desconto para até 20 litros abastecidos e 5% para acima 
de 20 litros. Já a gasolina está com 4% de desconto até 20 litros 
abastecidos e 6% acima de 20 litros.  Escreva um fluxograma que leia o 
número de litros vendidos e o tipo de combustível (álcool = 1, gasolina = 2). 
Calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do 
litro da gasolina é R$ 3,29 e o preço do litro do álcool é R$ 1,99. 
 */
package ex9;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        float tpComb, ltComb, totComb, vlrComb, perc;

        System.out.println("Digite a quantidade em Litro(s) de Combustivel Abastecido: ");
        ltComb = sc.nextFloat();

        System.out.println("Informe o Tipo de Combustivel:\n(1) Alcool (R$ 1,99 L)\n(2) Gasolina (R$ 3,29 L)");
        tpComb = sc.nextInt();

        if ((tpComb == 1) && (ltComb > 20)) {
            vlrComb = (float) ((float) ltComb * 1.99);
            perc = (float) ((float) vlrComb * 0.05);
            totComb = vlrComb - perc;
            System.out.println("Valor a ser pago com 5% de desconto: R$" + totComb);
        } else {
            if ((tpComb == 1) && (ltComb <= 20)) {
                vlrComb = (float) ((float) ltComb * 1.99);
                perc = (float) ((float) vlrComb * 0.03);
                totComb = vlrComb - perc;
                System.out.println("Valor a ser pago com 3% de desconto: R$" + totComb);
            } else {
                if ((tpComb == 2) && (ltComb > 20)) {
                    vlrComb = (float) ((float) ltComb * 3.29);
                    perc = (float) ((float) vlrComb * 0.06);
                    totComb = vlrComb - perc;
                    System.out.println("Valor a ser pago com 6% de desconto: R$" + totComb);
                } else {
                    if ((tpComb == 2) && (ltComb <= 20)) {
                        vlrComb = (float) ((float) ltComb * 3.29);
                        perc = (float) ((float) vlrComb * 0.04);
                        totComb = vlrComb - perc;
                        System.out.println("Valor a ser pago com 4% de desconto: R$" + totComb);
                    } else {
                        System.out.println("Por favor, digite um valor válido.");
                    }
                }
            }
        }
    }
}
