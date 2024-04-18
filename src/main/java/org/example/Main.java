package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Local de declaração de variáveis
        Scanner scanner = new Scanner(System.in);
        int menu = 0;


//Secção do layout do menu
        System.out.println("---------------------------------------------------------------");
        System.out.println("|                   Programa de resolução                     |");
        System.out.println("|                       de cálculos                           |");
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("Bem vindo ao programa de resolução de cálculos");
        System.out.println("1 - conversor de moedas");
        System.out.println("2 - conversor de medidas");
        System.out.println("3 - conversor de temperatura");
//Lê a entrada do teclado do úsuario
        System.out.print("Opção: ");
        menu = scanner.nextInt();
        System.out.println("A opção escolhida é a " + menu);

        switch (menu) {
            case 1:
                System.out.println("Entrou no conversão de moeda");
                break;
            case 2:
                System.out.println("Entrou no conversão de medida");
                break;
            case 3:
                System.out.println("Entrou no conversão de temperatura");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }


        //Execução do menu do nível complicado
        //if (menu == 1) {
        //System.out.println("Entrou no conversor de moeda");
        //} else {
        //if(menu == 2) {
        //System.out.println("Entrou no conversor de medidas");
        //} else {
        //if (menu == 3) {
        //System.out.println("Entrou no conversor de temperatura");
        //} else {
        //se não digita o valor 3, executa isso
        //System.out.println("Opção inválida");
        //  }
        //  }
        //}
    }
}
