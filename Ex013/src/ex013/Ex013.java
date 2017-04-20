/*
 Faça um fluxograma que determine o preço com desconto para entradas de cinema. 
 Estudantes recebem 50% de desconto, aposentados, 30%. Os demais clientes 
 pagam o valor integral.  Para isso, deverá ser fornecido pelo usuário o valor 
 integral do ingresso e o tipo do cliente: 
  E (para Estudantes); 
  A (para Aposentados); 
  O (para Outros). 
 */
package ex013;

import java.util.Scanner;

public class Ex013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        int Continuar = 0;
        float perc, vlrIng, total = 0;
        String tpCli;

        do {
            System.out.println("Digite o valor Integral do Ingresso: ");
            vlrIng = input.nextFloat();
            System.out.println();

            System.out.println("Digite o Tipo de Cliente: ");
            System.out.println("(e) Estudante\n(a) Aposentados\n(o) Outros");
            tpCli = input.next();

            if ((tpCli.equals("e")) || (tpCli.equals("E"))) {
                total = (float) (vlrIng - (vlrIng * 0.50));
                System.out.println("O valor a ser pago com 50% de desconto é: R$" + total);
            } else {
                if ((tpCli.equals("a")) || (tpCli.equals("A"))) {
                    total = (float) (vlrIng - (vlrIng * 0.30));
                    System.out.println("O valor a ser pago com 30% de desconto é: R$" + total);
                } else {
                    if ((tpCli.equals("o")) || (tpCli.equals("O"))) {
                        total = vlrIng;
                        System.out.println("O valor a ser pago é: R$" + total);
                    } else {
                        System.out.println("Digite um valor válido.");
                    }
                }
            }
        
        System.out.println("Deseja Continuar?\n1. Sim \n2. Não");
        Continuar = input.nextInt();
        
        System.out.println();  
            
        } while (Continuar == 1);
    }
}
