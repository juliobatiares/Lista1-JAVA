/*
IMPRIMIR OS NÚMEROS PARES ENTRE 12 E 21.
 */
package er003;

/**
 *
 * @author Julio Batista
 */
public class ER003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 0;
        int result;
        int incr = 2;
        
        do {
            result = incr + i;
            System.out.println(result);
            i++;
            incr++;
        } while (i < 50);
    }
    
}
