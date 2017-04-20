/*
Ler a velocidade (em km/h) máxima permitida para uma avenida qualquer, e a 
velocidade (em km/h) com que um motorista estava dirigindo nela. Calcule a 
multa que o motorista receberá, sabendo que:  
a) Multa de R$ 50,00 caso a velocidade do motorista ultrapasse em até 10 km/h a velocidade permitida 
b) Multa de R$ 100,00 caso a velocidade do motorista ultrapasse entre 11 km/h e 30 km/h a velocidade permitida 
c) Multa de R$ 200,00 caso a velocidade do motorista esteja igual ou acima de 31/km 
*/
package ex4;
import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner sc = new Scanner (System.in);
         
        float velMax, velCond;
        float velCalc = 0;
        
        System.out.println("Informe a velocidade máxima da pista: ");
        velMax = sc.nextInt();
        
        System.out.println("Informe a velocidade do condutor: ");
        velCond = sc.nextInt();
        
        velCalc = velCond - velMax;
        
        if ((velCalc > 0) & (velCalc <= 10)) {
            System.out.println("Você ultrapassou em " + velCalc + "km/h o limite de velocidade. \n Multa de R$ 50,00.");
        } else {
            if ((velCalc > 10) & (velCalc <= 30)) {
                System.out.println("Você ultrapassou em " + velCalc + "km/h o limite de velocidade. \n Multa de R$ 100,00.");
            } else {
                if (velCalc > 30) {
                    System.out.println("Você ultrapassou em " + velCalc + "km/h o limite de velocidade. \n Multa de R$ 200,00.");
                } else {
                    System.out.println("Você não tem multas.");
                }
            }
        }
        
        
    }
    
}
