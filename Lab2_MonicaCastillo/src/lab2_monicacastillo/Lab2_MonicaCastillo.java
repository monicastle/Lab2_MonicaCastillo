/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_monicacastillo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Monica
 */
public class Lab2_MonicaCastillo {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList casas = new ArrayList();
    static boolean valid;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("***MENU***");
            System.out.println("1) Registro de Casas");
            System.out.println("2) Manejo de Estados");
            System.out.println("3) Login");
            System.out.println("4) Salida");
            System.out.print("Ingrese la opcion deseada: ");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    if (valid == true) {
                        System.out.println(" ***MENU CASAS***");
                        System.out.println("1) Crear Casas");
                        System.out.println("2) Listar Casas");
                        System.out.println("3) Modificar Casas");
                        System.out.println("4) Borrar Casas");
                        System.out.print("Ingrese la opcion deseada: ");
                        int opcion2 = entrada.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.print("Ingrese el numero de casa: ");
                                int numcasa = entrada.nextInt();
                                System.out.print("Ingrese el numero de bloque: ");
                                int numbloque = entrada.nextInt();
                                System.out.print("Ingrese el color de la casa: ");
                                String color = entrada.next();
                                System.out.print("Ingrese el ancho: ");
                                double ancho = entrada.nextDouble();
                                System.out.print("Ingrese el largo: ");
                                double largo = entrada.nextDouble();
                                System.out.print("Ingrese si la casa ya fue vendida o no (si/No): ");
                                String vendida = entrada.next();
                                System.out.print("Ingrese el numero de pisos: ");
                                int numpisos = entrada.nextInt();
                                System.out.print("Ingrese el numero de baños:");
                                int numbaños = entrada.nextInt();
                                System.out.print("Ingrese el numero de cuartos: ");
                                int numcuartos = entrada.nextInt();
                                String dueño;
                                if (vendida.equals("si")) {
                                    System.out.print("Ingrese el dueño: ");
                                    dueño = entrada.next();
                                } else {
                                    dueño = null;
                                }// Fin If
                                System.out.print("Ingrese el estado (Lista, En Construccion, Construccion en Espera, En Espera de Demolicion): ");
                                String estado = entrada.nextLine();
                                System.out.print("Ingrese el nombre del ingeniero: ");
                                String ingeniero = entrada.next();
                                casas.add(new Casa(numcasa, numbloque, color, ancho, largo, vendida, numpisos, numbaños, numcuartos, dueño, estado, ingeniero));
                                System.out.println("¡Su casa se ha agregado exitosamente!");
                                break;
                            case 2:
                                for (Object o : casas) {
                                    System.out.println(casas.indexOf(o) + " = " + o);
                                } // Fin For
                                break;
                            case 3:
                                System.out.println("Ingrese la posicion de la casa que desea modificar: ");
                                int pos = entrada.nextInt();
                                casas.get(pos);
                                break;
                            case 4:
                                for (Object o : casas) {
                                    System.out.println(o);
                                } // Fin For
                                break;
                            default:
                                System.out.println("¡Entrada no valida!");
                        } // Fin Switch
                    } else {
                        System.out.println("¡Debe ingresar al login primero!");
                    } // Fin If
                    break;
                case 2:
                    if (valid == true) {

                    } else {
                        System.out.println("¡Debe ingresar al login primero!");
                    } // Fin If
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de usuario: ");
                    String usuario = entrada.next();
                    System.out.print("Ingrese la contraseña: ");
                    String contraseña = entrada.next();
                    while (!usuario.equals("leobanegas") && !contraseña.equals("99")) {
                        System.out.println("El nombre de usuario o la contraseña es incorrecto");
                        System.out.print("Ingrese el nombre de usuario: ");
                        usuario = entrada.next();
                        System.out.print("Ingrese la contraseña: ");
                        contraseña = entrada.next();
                    } // Fin While Validacion
                    System.out.println("¡Bienvenido a la inmobiliaria Black Floyd!");
                    valid = true;
                    break;
                case 4:
                    resp = 'n';
                    break;
                default:
                    System.out.println("¡Entrada no valida!");
            } // Fin Switch
        } // Fin While Respuesta
    } // Fin Main

} // Fin Class
