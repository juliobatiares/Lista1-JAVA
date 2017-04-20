/*
*  Solicitar ao usuário informar duas notas, referentes às avaliações Parcial 
*  e Exame. Calcular e imprimir a média ponderada do aluno, sendo que a 
*  parcial tem peso de 40% e a exame de 60%. Informar se o mesmo está aprovado
*  (nota acima de 7), reprovado (abaixo de 5) ou em recuperação (entre 5 e 6,9). 
*/
package ex2;
import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        float n1, n2;
        float parcial, exame, media = 0;
        
        System.out.println("Informe a nota Parcial: ");
        n1 = sc.nextFloat();
        
        System.out.println("Informe a nota Exame: ");
        n2 = sc.nextFloat();
        
        parcial = (float) (n1 * 0.4);
        exame   = (float) (n2 * 0.6);
        
        media = parcial + exame;
        
        if (media >= 7) {
            System.out.println("Parabéns, você foi APROVADO com a nota: " + media);
        }
        else
            if (media >= 5) {
                System.out.println("Hmmm.. \nVocê entrou em RECUPERAÇÃO. Sua nota é: " + media);
            }
            else
                if (media < 5) {
                    System.out.println("Você foi REPROVADO. Sua nota é: " + media);
                }
    }
    
}
