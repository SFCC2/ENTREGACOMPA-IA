/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega;

import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus-PC
 */

public class ListaEstudiante {
    public static void main(String[] args) {
        ListaEstudiante admin= new ListaEstudiante();
        try {
            int num= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad total de estudiantes"));
       RandomAccessFile raf = new RandomAccessFile("test.txt", "rw");
            admin.agregar(num,raf);
        } catch (Exception e) {
        }
    }
    
    public void agregar(int a,RandomAccessFile raf){
        try {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < 48; j++) {
                    if(j<4){
                        
                    }else if(i>=5 && i<43){
                        
                    }else if(i>=44){
                        
                    }
                }
                
            }
        } catch (Exception e) {
        }
    }
}
