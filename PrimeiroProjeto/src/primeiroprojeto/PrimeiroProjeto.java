/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiroprojeto;

import javax.swing.JOptionPane;

/**
 *
 * @author almei
 */
public class PrimeiroProjeto {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
    
        NovaClasse nc = new NovaClasse();
        
        nc.num = 5; 
        nc.dou = 5.5;
        nc.boo = true; 
        nc.cha = 'c';
        nc.st = "ola";   
        
        String str = nc.toString(); //aparecer classe e local da str
        System.out.println(str);
        JOptionPane.showMessageDialog(null, str); //aparecer cx de mensagem 
        
   }
}
