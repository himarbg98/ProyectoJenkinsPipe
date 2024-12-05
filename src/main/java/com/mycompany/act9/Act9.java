/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act9;

/**
 *
 * @author himar
 */
import java.util.Scanner;
public class Act9 {
    public static boolean dia_laboral(String dia) {
        switch(dia) {
            case "Lunes":
            return true;
            case "Martes":
            return true;
            case "Miercoles":
            return true;
            case "Jueves":
            return true;
            case "Viernes":
            return true;
            case "Sabado":
            return false;
            case "Domingo":
            return false;
            default:
            return false;
        }
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana:");
        String dia = scanner.nextLine();

        if (dia_laboral(dia)) {
            System.out.println(dia + " es dia laboral.");
        } else if (dia.equals("Sabado") || dia.equals("Domingo")) {
            System.out.println(dia + " no es dia laboral.");
        } else {
            System.out.println("Esto no es un dia.");
        }
    }
}
