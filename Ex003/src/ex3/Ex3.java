/*
 Elabore um algoritmo utilizando a técnica de pseudocódigo, que lê a idade de um
jogador de futebol e classifica-o em uma das seguintes categorias,escrevendo a 
categoria no qual o jogador se enquadra: “Fraldinha = 5 - 9 anos”, 
“Juvenil = 10 - 13 anos”, “Junior = 14 - 17 anos”, “Amador = 18 - 20 anos” e 
“Profissional = acima de 20 anos”. Qualquer idade diferente das apresentadas 
anteriormente deve ser apresentada ao usuário que não há categoria para a idade
informada. 
 */
package ex3;

import java.util.Scanner;

/**
 *
 * @author Julio Batista
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);

        int Idade;

        System.out.println("Olá, informe a sua idade: ");
        Idade = sc.nextInt();

        if (Idade >= 20) {
            System.out.println("Profissional.");
        } else {
            if (Idade >= 18) {
                System.out.println("Amador");
            } else {
                if (Idade >= 14) {
                    System.out.println("Júnior.");
                } else {
                    if (Idade >= 10) {
                        System.out.println("Juvenil.");
                    } else {
                        if (Idade >= 5) {
                            System.out.println("Fraldinha.");
                        } else {
                            System.out.println("Não há categoria para a idade informada.");
                        }
                    }
                }
            }
        }
    }
}
