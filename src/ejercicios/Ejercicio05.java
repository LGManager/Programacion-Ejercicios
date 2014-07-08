/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Geovanny Loor
 */
public class Ejercicio05
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Rango del Vector:"));
        int[] arreglo = new int[n];
        int c = 0;
        for (int i = 0; i < arreglo.length; i++)
        {    
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Número:"));
            arreglo[i] = numero;
        }
        System.out.println("Arreglo Desordenado:");
        for (int i = 0; i < arreglo.length; i++)
        {
            System.out.print(arreglo[i] + ", ");
        }
        System.out.println("\n");
        int i, j, aux;
        for(i = 0; i < arreglo.length-1; i++)
            for(j = 0; j < arreglo.length-i-1; j++)
                if(arreglo[j+1] < arreglo[j])
                {
                    aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux;
                } 
                System.out.println("Arreglo Ordenado:");
                for ( i = 0; i < arreglo.length; i++)
                {
                System.out.print(arreglo[i] + ", ");
                }
                System.out.println("\n");
                System.out.println("Arreglo Sin Números Repetidos:");
                int a1;
                for ( i = 0; i < arreglo.length; i++) {
                if (i == 0) {
                System.out.print(arreglo[i] + ", ");
                }
                else
                {
                a1 = (i - 1);
                aux = arreglo[i];
                if (aux == arreglo[a1])
                {
                 
                }
                else
                {
                System.out.print(arreglo[i] + ", ");
                }
            }
        }
        System.out.println("\n");
    }
}
