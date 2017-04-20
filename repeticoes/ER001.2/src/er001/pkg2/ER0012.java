/*
Utilizando a estrutura de Repetição WHILE.
Aula de Lógica de Programação.
Dia 17/04/2017
 */
package er001.pkg2;
import java.util.Scanner;
/**
 *
 * @author Julio Batista
 */
public class ER0012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        
        float n1, n2;
        float parcial, exame, media = 0;
        int i = 0;
        
        while (i < 5) {
        System.out.println();
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
        i++;
        }
    }
    
}
