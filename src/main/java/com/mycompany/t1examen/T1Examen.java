/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.t1examen;

import java.util.Scanner;

/**
 *
 * @author UCC20324
 */
public class T1Examen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Controlador ctrl = new Controlador();

        int opcion;

        do {
            System.out.println("1. Agregar trabajador");
            System.out.println("2. Listar trabajadores");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            try {
                if (opcion == 1) {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Tipo Doc (DNI/CE): ");
                    String tipo = sc.nextLine();

                    System.out.print("Numero Doc: ");
                    String num = sc.nextLine();

                    System.out.print("Regimen (728/LOCACION): ");
                    String reg = sc.nextLine();

                    System.out.print("Pension (INTEGRA/PRIMA/HABITAT/ONP): ");
                    String pen = sc.nextLine();

                    System.out.print("Sueldo: ");
                    double sueldo = sc.nextDouble();

                    System.out.print("Hijos: ");
                    int hijos = sc.nextInt();

                    System.out.print("Turno noche (true/false): ");
                    boolean noche = sc.nextBoolean();

                    Trabajador t = new Trabajador(nombre, tipo, num, reg, pen, sueldo, hijos, noche);
                    ctrl.agregar(t);

                    System.out.println(" Trabajador agregado correctamente");

                } else if (opcion == 2) {
                    ctrl.listar();
                }

            } catch (Exception e) {
                System.out.println(" Error: " + e.getMessage());
                sc.nextLine();
            }

        } while (opcion != 0);

        sc.close();
    }
}
