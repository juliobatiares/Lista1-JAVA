/*
Utilizando as estruturas de Repetição para Imprimir o Nome 10 Vezes.
Aula de Lógica de Programação.
Dia 17/04/2017
 */
package er002;

/**
 *
 * @author Julio Batista
 */
public class ER002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 1;
 //       USANDO FOR 
 //       for (i=0; i < 10; i++) {
 //           System.out.println("Julio");
 //       }       
 //      USANDO WHILE
 //       while (i <= 10) {
 //           System.out.println(i + " - Julio");
 //           i++;
 //     USANDO DO WHILE
        do {
            System.out.println(i + " - Julio");
            i++;
        } while (i <= 10);
    }
    
}
