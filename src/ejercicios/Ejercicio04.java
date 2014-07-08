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
public class Ejercicio04
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        String cadena1 = "";
        String cadena2 = "";
        cadena1 = (JOptionPane.showInputDialog("Ingrese Cadena 1:"));
        cadena2 = (JOptionPane.showInputDialog("Ingrese Cadena 2:"));
        int longitud1 = cadena1.length();
        int longitud2 = cadena2.length();
        char[] frase1 = cadena1.toCharArray();
        char[] frase2 = cadena2.toCharArray();
        for (int i = 0; i < longitud1; i++)
        {
            for (int j = 0; j < longitud2; j++) 
            {
                if (frase1[i] == frase2[j]) 
                {
                    frase1[i] = ' ';
                }
            }
        }
        for (int i = 0; i < frase1.length; i++)
            if (frase1[i] != ' ')
            {
                System.out.print(frase1[i]);
            }
        System.out.println(" ");
    }
}
