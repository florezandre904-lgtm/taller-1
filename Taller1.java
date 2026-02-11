/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author UIS
 */
public class Taller1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio4 ();
        
    
    }
    public static void ejercicio1 () {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("escribe la nota del parcial 1 (el numero debe ser entero)"));
        int n2= Integer.parseInt(JOptionPane.showInputDialog("escribe la nota del parcial 2 (el numero debe ser entero)"));
        int n3= Integer.parseInt(JOptionPane.showInputDialog("escribe la nota del parcial 3 (el numero debe ser entero)"));
        int n4= Integer.parseInt(JOptionPane.showInputDialog("escribe la nota de los quizes (el numero debe ser entero)"));
        int n5= Integer.parseInt(JOptionPane.showInputDialog("escribe la nota del proyecto (el numero debe ser entero)"));
        JOptionPane.showMessageDialog(null, "su nota final es: "+ ((n1*0.20)+(n2*0.25)+(n3*0.25)+(n4*0.10)+(n5*0.20)));
    }
    public static void ejercicio2 () {
        float x1= Float.parseFloat(JOptionPane.showInputDialog("escribe la nota del parcial"));
        float x2 = Float.parseFloat(JOptionPane.showInputDialog(" escriba su nota de quizes"));
        float x3 = Float.parseFloat(JOptionPane.showInputDialog("escriba su nota del proyecto final "));
        JOptionPane.showMessageDialog(null, "su nota final es:" + ((x1*0.55)+(x2*0.30)+(x3*0.15)));
    }
    public static void ejercicio3 () {
        String nom = JOptionPane.showInputDialog("escribe el nombre del empleado");
        float hrs = Float.parseFloat(JOptionPane.showInputDialog("ingrese el numero de horas trabajadas"));
        float pg = Float.parseFloat(JOptionPane.showInputDialog("ingrese el pago de por hora"));
        JOptionPane.showMessageDialog(null, "el sueldo de " + nom + " es de: " + (hrs * pg));
    }
    public static void ejercicio4 () {
        float x1= Float.parseFloat(JOptionPane.showInputDialog("ingrese un numero"));
        if (x1 % 2 == 0) {
            JOptionPane.showInputDialog(" el numero" + x1 + "es par ");
        }
        else { 
            JOptionPane.showInputDialog(" el numero" + x1 + "es impar ");
        }
        
    }}