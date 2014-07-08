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
public class Ejercicio03
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {    
        int x, y, r, proceso;
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Valor Entero para 'X':"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Valor Entero para 'Y':"));
        if ((x <= 0) || (x > 255))
        {
            r = -1;
            JOptionPane.showMessageDialog(null, "Resultado: " + r);
        }
        else
        {
            int[] arreglo = new int[y];
            arreglo[0] = x;
            for (int i = 1; i <arreglo.length; i++) 
            {
               proceso = x / (i+1);
               arreglo[i] = proceso;           
            }
            for (int i = 0; i < arreglo.length; i++) 
            { 
              if(i == (y-1))
                {
                    
                    JOptionPane.showMessageDialog(null, "Resultado: " + arreglo[i]);
                }  
            }
        }
    }
}
