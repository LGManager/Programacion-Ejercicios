/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovanny Loor
 */
public class Ejercicio11
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int x, y;
        x = 1;
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Ancho de la Matriz, dado que el"
                + " largo de la misma es 1:"));
        int valor;
        int matriz[][] = new int [x][y];
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor en la Pos.: " 
                        + i + ", " + j));
                matriz[i][j] = valor;
            }
        }
        int dimen = x * y, a = 0;
        int vectorcontndr[] = new int[dimen];
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                vectorcontndr[a] = matriz[i][j];
                a++;
            }
        }
        ArrayList matriz1 = new ArrayList();
        ArrayList cant = new ArrayList();
        Arrays.sort(vectorcontndr);
        matriz1.add(vectorcontndr);
        int cc=0;
        for (int i = 0; i < vectorcontndr.length; i++)
        {
            if(vectorcontndr[i] != vectorcontndr[cc + 1])
            {
               matriz1.add(vectorcontndr[cc + 1]);  
            } 
        }
        int numTemp, cantRepite = 0, numRepite = -1; 
        for (int i = 0; i < vectorcontndr.length - 1; i++)
        {
            numTemp = 1;
            for(int j = i + 1 ; j < vectorcontndr.length; j++)
            {
                if(vectorcontndr[i] == vectorcontndr[j])
                    numTemp ++;                
            }
            if(numTemp > cantRepite)
            {
                cantRepite = numTemp;
                numRepite = vectorcontndr[i];
            }
        }
        JOptionPane.showMessageDialog(null, "El # que mas se repite es él: " + numRepite + 
                " Porque se repite " + cantRepite+" veces en la matriz");        
    }
}
