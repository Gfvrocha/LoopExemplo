package br.senai.sp.jandira;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] carros = {"x1", "fusca", "ferrari", "uno"};

        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");
        System.out.println("=0         BEM VINDO                 0=");
        System.out.println("=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=");

        for (int i=0; i<carros.length; i++){
            System.out.println("Carro " + (i+1) + ": " + carros[i]);
        }

        System.out.println("Escolha seu Carro: ");

        String opcaoUsuario = scanner.nextLine();

        boolean validaCarro = false;

        for (int i=0; i<carros.length; i++){
            if (opcaoUsuario.equalsIgnoreCase(carros[i])){
                System.out.println("Este veiculo está disponivel");
                validaCarro = true;
            }
        }

        if (!validaCarro){
            System.out.println("Veiculo indisponivel");
        }





          // Exemplo For
        for (int i=0; i<10; i++){
            System.out.println("Vai Corinthians!");
        }

        // Exemplo While
        boolean testeWhile = true;

        while (testeWhile){
            System.out.println("S . C . C . P");
            testeWhile = false;
        }

        // Exemplo Loop doWhile
        boolean testeDo = false;

        do{
            System.out.println("1910");
        }while (testeDo);






    }


}
