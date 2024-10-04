package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        {
            double mediaexpediente;
            String continuar = "si";
            while (continuar.equalsIgnoreCase("si")) {

                System.out.println("nota primer trimestre");
                int nota1 = entrada.nextInt();
                System.out.println("nota segundo trimestre");
                int nota2 = entrada.nextInt();
                System.out.println("nota tercer trimestre");
                int nota3 = entrada.nextInt();
                mediaexpediente = (nota1 + nota2 + nota3) / 3.0;
                System.out.println("La nota media es =" + mediaexpediente);
                System.out.println("quieres introducir mas notas?");
                continuar = entrada.next();
            }
        }
    }
}