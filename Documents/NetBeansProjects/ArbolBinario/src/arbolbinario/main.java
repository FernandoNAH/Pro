/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

import java.util.Scanner;

/**
 *
 * @author Fer
 */
public class main {

    public static void main(String[] args) {
        ArbolBinario Calificaciones = new ArbolBinario();
        Scanner objTeclado = new Scanner(System.in);

        Calificaciones.Insertar(15);
        Calificaciones.Insertar(7);
        Calificaciones.Insertar(25);
        Calificaciones.Insertar(3);
        Calificaciones.Insertar(18);
        Calificaciones.Insertar(5);
        Calificaciones.Insertar(50);
               // Calificaciones.Insertar(60);
        // Calificaciones.Insertar(60);

        System.out.println("Mostar en PREORDEN");
        Calificaciones.Mostrar_Preorden();
        System.out.println("");
        System.out.println("Mostar en PREORDEN");
        Calificaciones.Mostrar_PostOrden();
        System.out.println("");
        System.out.println("Mostar en INORDEN");
        Calificaciones.Mostrar_InOrden();
        System.out.println("");
        //System.out.println("La suma es > " + Calificaciones.Sumar_InOrden());
        //System.out.println("El numero de nodos es  > " + Calificaciones.Contar_InOrden());
       // System.out.println("El numero el promedio es   > " + Calificaciones.Promediar());
        //System.out.println("El las hojas son   > " + Calificaciones.ContarHojas());
        System.out.println("Mayor valor del árbol   > " + Calificaciones.Mayor());

        /*  
        int op, fin;
        double val, valo;

        do {
            System.out.println("Menu.....");
            System.out.println("Insertar - -> 1");
            System.out.println("Mostrar- -> 2");
            System.out.println("Sumar - -> 3");
            System.out.println("Promedio - -> 4");
            System.out.println("Eliminar - -> 5");
            System.out.println("Mayor - -> 6");
            System.out.println(".....");
            System.out.print("Opcion = ");

            op = objTeclado.nextInt();

            switch (op) {
                case 1:
                    int in,
                     cont = 1;
                    do {

                        System.out.println("Inserta el valor " + cont + " del arreglo");
                        valo = objTeclado.nextDouble();
                        Calificaciones.Insertar(valo);
                        cont++;
                        System.out.println("Deseas insertar otro valor ?? " + "... SI = 1  NO = 2");
                        in = objTeclado.nextInt();
                    } while (in == 1);

                    break;
                case 2:
                    System.out.print("Los valores de la cola son =  ");
                    Calificaciones.Mostrar_Preorden();
                    System.out.println("  ");

                    break;
                case 3:
                  System.out.print("Los valores de la cola son =  ");
                    Calificaciones.Mostrar_InOrden();
                    System.out.println("  ");
                    break;
                case 4:
                   System.out.print("Los valores de la cola son =  ");
                    Calificaciones.Mostrar_PostOrden();
                    System.out.println("  ");
                    break;
                case 5:
                   //    Calificaciones.Eliminar();
                       System.out.print("Eliminacion correcta ");
                    System.out.println("  ");
                    break;
                    case 6:
                    // Calificaciones.Promediar();
               // System.out.print("El Numero mayor de la cola es  =   " + Calificaciones.Mayor());
                    System.out.println("  ");
                    break;

                default:

                    break;
            }

        } while (op > 0 && op < 7);*/
    }
}
