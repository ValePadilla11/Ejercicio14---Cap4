/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14.cap4;

import java.util.Scanner;

public class Ejercicio14Cap4 {

    public static void main(String[] args) {
        double VD1, VD2, VD3, SALAR, TOTVEN,PORVEN,SALAR1,SALAR2,SALAR3;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ventas del depto 1: ");
        VD1 = entrada.nextDouble();
        System.out.print("Ventas del depto 2: ");
        VD2 = entrada.nextDouble();
        System.out.print("Ventas del depto 3: ");
        VD3 = entrada.nextDouble();
        System.out.print("Salario que recibe cada vendedor: ");
        SALAR = entrada.nextDouble();
        
        TOTVEN = VD1 + VD2 + VD3;
        PORVEN = 0.33 * TOTVEN;
        
        if (VD1>PORVEN){
            SALAR1 = SALAR + 0.2 * SALAR;               
        } else {
            SALAR1 = SALAR;
        }
        if (VD2>PORVEN){
            SALAR2 = SALAR + 0.2 * SALAR;               
        } else {
            SALAR2 = SALAR;
        }
        if (VD3>PORVEN){
            SALAR3 = SALAR + 0.2 * SALAR;               
        } else {
            SALAR3 = SALAR;
        }
        System.out.println("SALARIO VENDEDORES DEPTO. 1, " +(int) SALAR1+ ", SALARIO VENDEDORES DEPTO. 2, "+(int) SALAR2+ ", SALARIO VENDEDORES DEPTO. 3, "+(int) SALAR3);
    }
    
}
