/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package er004;

/**
 *
 * @author Julio Batista
 */
public class ER004 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 12;
        int calc;
        
        
        
        for (i = 0; i < 100; i++) {
            
            calc = i%2;
            
            if (calc == 0) {
               System.out.println(i);
            }
        }
    }
    
}
