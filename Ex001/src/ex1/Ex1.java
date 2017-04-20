/*
* Exercício 1
* 1 – Solicitar ao usuário informar duas notas, referentes às avaliações 
* Parcial e Exame. Calcular e imprimir a média ponderada do aluno, sendo 
* que a parcial tem peso de 40% e a exame de 60%. Informar se o mesmo 
* está aprovado ou reprovado, sabendo que a média é 5. 
*/

package ex1;
import java.util.Scanner;


/**
 *
 * @author Julio Batista
 */
public class Ex1 {

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
        
        if (media >= 5)
            System.out.println("Parabéns, você foi aprovado com a nota: " + media);
        else
            System.out.println("Você foi reprovado. Sua nota é: " + media);
    }
    
}
