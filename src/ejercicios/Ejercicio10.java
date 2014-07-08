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
public class Ejercicio10
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int x, y, a = 0, n = -1;
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Valor Entero para 'X':"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Valor Entero para 'Y':"));
        if ((x > 0) && (y > 0))
        {
            for (int i = 0; i <= y; i++)
            {
                a = a + i;
                if ((a > x) && (a < y))
                {
                    n = a;
                }
            }   
        }
        JOptionPane.showMessageDialog(null, "El Resultado es:   " + n);
    }
}
