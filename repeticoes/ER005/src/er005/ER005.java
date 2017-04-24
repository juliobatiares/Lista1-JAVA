/*

USANDO A ESTRUTURA DE REPETIÇÃO "DO WHILE"

CALCULADORA
1. SOMAR
2. SUBTRAIR
3. MULTIPLICAR
4. DIVIDIR
5. VERIFICA SE O NÚMERO É PAR OU ÍMPAR

* LER 2 NÚMEROS
* FAZER O CÁLCULO
* MOSTRAR O RESULTADO
* DESEJA REALIZAR OUTRA OPERAÇÃO?

 */
package er005;
import java.util.Scanner;
/**
 *
 * @author Julio Batista
 */
public class ER005 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        float n1, n2, resultado, resultado2;
        int tpOper, Continuar = 0;
        
        do {
            
            System.out.println("Digite o primeiro número: ");
            n1 = input.nextFloat();
            System.out.println("Digite o segundo número: ");
            n2 = input.nextFloat();
            
            System.out.println("Escolha o tipo de Operação: ");
            System.out.println("(1) SOMA\n(2) SUBTRAÇÃO\n(3) MULTIPLICAÇÃO\n(4) DIVISÃO\n(5) PAR ou IMPAR");
            tpOper = input.nextInt();
            
            if (tpOper == 1) {
                resultado = n1 + n2;
                System.out.println("A soma é: " + resultado);
            } else {
                if (tpOper == 2) {
                    resultado = n1 - n2;
                    System.out.println("A subtração é: " + resultado);
                } else {
                    if (tpOper == 3) {
                        resultado = n1 * n2;
                        System.out.println("A multiplicação é: " + resultado);
                    } else {
                        if (tpOper == 4) {
                            resultado = n1 / n2;
                            System.out.println("A divisão é: " + resultado);
                        } else {
                            if (tpOper == 5) {
                                
                                resultado = n1 % 2;
                                resultado2 = n2 % 2;
                                
                                if (resultado == 0) {
                                    System.out.println("O número " + n1 + " é par.");
                                } else {
                                    System.out.println("O número " + n1 + " é ímpar.");
                                }
                                if (resultado2 == 0) {
                                    System.out.println("O número " + n2 + " é par.");
                                } else {
                                    System.out.println("O número " + n2 + " é ímpar.");
                                }
                            }
                        }
                    }
                }
            }
            System.out.println();
            System.out.println("Deseja Continuar?");
            System.out.println("(1) Sim\n(2) Não");
            Continuar = input.nextInt();
            System.out.println();
        } while (Continuar == 1);

    }
    
}
