package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaTeclado= new Scanner(System.in);

        String cedulaAsistente;
        String nombreAsistente;
        String apellidosAsistente;
        Short edadAsistente;
        String ciudadAsistente;
        Integer numeroBoletas;

        System.out.println("Por favor digite su cedula: ");
        cedulaAsistente = entradaTeclado.nextLine();

        System.out.println("Por favor digite su nombre: ");
        nombreAsistente = entradaTeclado.nextLine();

        System.out.println("Por favor digite sus apellidos: ");
        apellidosAsistente = entradaTeclado.nextLine();

        System.out.println("Por favor digite su edad: ");
        edadAsistente = entradaTeclado.nextShort();

        System.out.print("Por favor digite su ciudad: ");
        ciudadAsistente = entradaTeclado.nextLine();
        entradaTeclado.nextLine();
        System.out.println("Por favor digite el numero de boletas que desea adquirir: ");
        numeroBoletas = entradaTeclado.nextInt();

        Integer precioBoletas=450000;

        Integer costoTotal=precioBoletas*numeroBoletas;

        System.out.println("");

        if (numeroBoletas > 4){

            System.out.println("NO PUEDES COMPRAR MAS DE 4 BOLETAS!!!!");

        } else if (edadAsistente <18){

            System.out.println("ERES MENOR DE EDAD, NO PUEDES ASISTIR AL EVENTO");


        } else {

            System.out.println("\u001B[36m Disfrute del evento!!! El costo total de su compra es de:   \u001B[0m"+"$"+costoTotal);

        }




    }
}