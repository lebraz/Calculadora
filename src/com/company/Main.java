package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args)

    {
        Scanner input = new Scanner(System.in);

        float numero1;
        float numero2;
        int operacao;
        float resultado;

        System.out.println("Digite dois números que deseja calcular e depois a operação.\n");

        System.out.println("Digite o primeiro número: ");

        numero1 = input.nextFloat();

        System.out.println("Digite o segundo número: ");

        numero2 = input.nextFloat();

        System.out.println("Escolha a opção da operação: \n\n" +
                "1. Somar \n" +
                "2. Subtrair\n" +
                "3. Multiplicar\n" +
                "4. Dividir\n" +
                "5. Resto da Divisão\n\n" +
                "Digite a operação escolhida:");

        operacao = input.nextInt();

        if(operacao == 1){
            resultado=numero1+numero2;
            System.out.println("O resultado da soma dos dois números é: "+resultado);
        }else if(operacao == 2){
            resultado = numero1-numero2;
            System.out.println("O resultado da subtração dos dois números é: "+resultado);
        }else if(operacao == 3){
            resultado = numero1*numero2;
            System.out.println("O resultado da multiplicação dos dois números é: "+resultado);
        }else if(operacao == 4){
            resultado = numero1/numero2;
            System.out.println("O resultado da divisão dos dois números é: "+resultado);
        }else if(operacao == 5){
            resultado = numero1%numero2;
            System.out.println("O resto da divisão entre os dois números é: "+resultado);
        }else{

        }

    }
}