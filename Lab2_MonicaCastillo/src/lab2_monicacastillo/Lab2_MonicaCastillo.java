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
    static ArrayList listas = new ArrayList();
    static ArrayList construccion = new ArrayList();
    static ArrayList construccionespera = new ArrayList();
    static ArrayList demolicion = new ArrayList();
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
                                System.out.print("Ingrese si la casa ya fue vendida o no (Si/No): ");
                                String vendida = entrada.next();
                                System.out.print("Ingrese el numero de pisos: ");
                                int numpisos = entrada.nextInt();
                                System.out.print("Ingrese el numero de baños: ");
                                int numbaños = entrada.nextInt();
                                System.out.print("Ingrese el numero de cuartos: ");
                                int numcuartos = entrada.nextInt();
                                String dueño;
                                if (vendida.equalsIgnoreCase("Si")) {
                                    System.out.print("Ingrese el dueño: ");
                                    dueño = entrada.nextLine();
                                    dueño = entrada.nextLine();
                                } else {
                                    dueño = "Sin dueño";
                                }// Fin If
                                System.out.print("Ingrese el nombre del ingeniero: ");
                                String ingeniero = entrada.nextLine();
                                ingeniero = entrada.nextLine();
                                System.out.print("Ingrese el estado (Lista, En Construccion, Construccion en Espera, En Espera de Demolicion): ");
                                String estado = entrada.nextLine();
                                int c = 0,
                                 c2 = 0;
                                if (estado.equalsIgnoreCase("Lista")) {
                                    listas.add(new Casa(numcasa, numbloque, color, ancho, largo, vendida, numpisos, numbaños, numcuartos, dueño, estado, ingeniero));
                                } else if (estado.equalsIgnoreCase("Construccion en Espera")) {
                                    construccionespera.add(new Casa(numcasa, numbloque, color, ancho, largo, vendida, numpisos, numbaños, numcuartos, dueño, estado, ingeniero));
                                } else if (estado.equalsIgnoreCase("En Construccion")) {
                                    c++;
                                    if (c <= 5) {
                                        construccion.add(new Casa(numcasa, numbloque, color, ancho, largo, vendida, numpisos, numbaños, numcuartos, dueño, estado, ingeniero));
                                    } else {
                                        System.out.println("¡Ha sobrepasado el maximo de casas en construccion!");
                                    } // Fin If
                                } else if (estado.equalsIgnoreCase("En espera de demolicion")) {
                                    c2++;
                                    if (c <= 3) {
                                        demolicion.add(new Casa(numcasa, numbloque, color, ancho, largo, vendida, numpisos, numbaños, numcuartos, dueño, estado, ingeniero));
                                    } else {
                                        System.out.println("¡Ha sobrepasado el maximo de casas en demolicion!");
                                    }// Fin If
                                } // Fin If
                                casas.add(new Casa(numcasa, numbloque, color, ancho, largo, vendida, numpisos, numbaños, numcuartos, dueño, estado, ingeniero));
                                System.out.println("¡Su casa se ha agregado exitosamente!");
                                break;

                            case 2:
                                System.out.println("Listar Casas: ");
                                for (Object o : casas) {
                                    System.out.println(casas.indexOf(o) + " = " + o);
                                } // Fin For
                                break;
                            case 3:
                                for (Object o : casas) {
                                    System.out.println(casas.indexOf(o) + " = " + o);
                                } // Fin For
                                System.out.print("Ingrese la posicion de la casa que desea modificar: ");
                                int pos = entrada.nextInt();
                                System.out.println("Atributos: ");
                                System.out.println("1. Numero de casa");
                                System.out.println("2. Numero de bloque");
                                System.out.println("3. Color");
                                System.out.println("4. Ancho");
                                System.out.println("5. Largo");
                                System.out.println("6. Fue vendida o no");
                                System.out.println("7. Numero de pisos");
                                System.out.println("8. Numero de baños");
                                System.out.println("9. Numero de cuartos");
                                System.out.println("10. Nombre del dueño");
                                System.out.println("11. Nombre del ingeniero");
                                System.out.print("Ingrese la posicion del atributo que desea modificar: ");
                                int pos3 = entrada.nextInt();
                                switch (pos3) {
                                    case 1:
                                        System.out.print("Ingrese el nuevo numero de casa: ");
                                        numcasa = entrada.nextInt();
                                        ((Casa) casas.get(pos)).setNumcasa(numcasa);
                                        break;
                                    case 2:
                                        System.out.print("Ingrese el nuevo numero de bloque: ");
                                        numbloque = entrada.nextInt();
                                        ((Casa) casas.get(pos)).setNumbloque(numbloque);
                                        break;
                                    case 3:
                                        System.out.print("Ingrese el nuevo color: ");
                                        color = entrada.next();
                                        ((Casa) casas.get(pos)).setColor(color);
                                        break;
                                    case 4:
                                        System.out.print("Ingrese el nuevo ancho: ");
                                        ancho = entrada.nextDouble();
                                        ((Casa) casas.get(pos)).setAncho(ancho);
                                        break;
                                    case 5:
                                        System.out.print("Ingrese el nuevo largo: ");
                                        largo = entrada.nextDouble();
                                        ((Casa) casas.get(pos)).setLargo(largo);
                                        break;
                                    case 6:
                                        System.out.print("Ingrese si la casa fue vendida o no (Si/No): ");
                                        vendida = entrada.next();
                                        ((Casa) casas.get(pos)).setVendida(vendida);
                                        break;
                                    case 7:
                                        System.out.print("Ingrese el nuevo numero de pisos: ");
                                        numpisos = entrada.nextInt();
                                        ((Casa) casas.get(pos)).setNumpisos(numpisos);
                                        break;
                                    case 8:
                                        System.out.print("Ingrese el nuevo numero de baños: ");
                                        numbaños = entrada.nextInt();
                                        ((Casa) casas.get(pos)).setNumbaños(numbaños);
                                        break;
                                    case 9:
                                        System.out.print("Ingrese el nuevo numero de cuartos: ");
                                        numcuartos = entrada.nextInt();
                                        ((Casa) casas.get(pos)).setNumcuartos(numcuartos);
                                        break;
                                    case 10:
                                        System.out.print("Ingrese el nuevo dueño: ");
                                        dueño = entrada.nextLine();
                                        dueño = entrada.nextLine();
                                        ((Casa) casas.get(pos)).setDueño(dueño);
                                        break;
                                    case 11:
                                        System.out.print("Ingrese el nuevo nombre del ingeniero: ");
                                        ingeniero = entrada.nextLine();
                                        ((Casa) casas.get(pos)).setIngeniero(ingeniero);
                                        break;
                                    default:
                                        System.out.println("¡Entrada no valida!");
                                } // Fin Switch
                                System.out.println("¡Se ha hecho la modificacion exitosamente!");
                                break;
                            case 4:
                                for (Object o : casas) {
                                    System.out.println(casas.indexOf(o) + " = " + o);
                                } // Fin For
                                System.out.print("Ingrese la posicion de la casa que desea eliminar: ");
                                int pos2 = entrada.nextInt();
                                casas.remove(pos2);
                                System.out.println("¡La casa se ha eliminado exitosamente!");
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
                        System.out.println("Casas Listas: ");
                        for (Object o : listas) {
                            System.out.println(listas.indexOf(o) + " = " + o);
                        } // Fin For
                        System.out.println("Casas En Construccion:");
                        for (Object o : construccion) {
                            System.out.println(construccion.indexOf(o) + " = " + o);
                        } // Fin For
                        System.out.println("Casas en Construccion es Espera");
                        for (Object o : construccionespera) {
                            System.out.println(construccionespera.indexOf(o) + " = " + o);
                        } // Fin For
                        System.out.println("Casas En Espera de Demolicion: ");
                        for (Object o : demolicion) {
                            System.out.println(demolicion.indexOf(o) + " = " + o);
                        } // Fin For
                        System.out.println("1. Lista");
                        System.out.println("2. En Construccion");
                        System.out.println("3. Construccion en Espera");
                        System.out.print("Ingrese el estado que desea modificar : ");
                        int pos = entrada.nextInt();
                        switch (pos) {
                            case 1:
                                ((Casa) casas.get(pos)).setEstado("Espera de demolicion");
                                break;
                            case 2:
                                ((Casa) casas.get(pos)).setEstado("En Construccion");
                        }
                        System.out.print("Ingrese el nuevo estado:");
                        String estadonuevo = entrada.nextLine();
                        estadonuevo = entrada.nextLine();
                        ((Casa) casas.get(pos)).setEstado(estadonuevo);
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
