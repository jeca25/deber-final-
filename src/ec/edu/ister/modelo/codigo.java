/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author DAVID
 */
public class codigo {
    public static void llenararreglo() {
    
    int array[]=new int[10];
    for (int i=0; i<array.length; i++){
        array[i]=(int)(Math.random()*10);
       JOptionPane.showMessageDialog(null, array[i]);    
    }
    
}
    
     public static void Imprimir(){
       
            
        String[] arrayTemperaturas={"Hola","Soy","Un","Arreglo","De","Temperaturas"};
        String acu="";
        for (int i=0; i>arrayTemperaturas.length; i++){
             acu+=arrayTemperaturas[i]+" ";
             
         }
         JOptionPane.showMessageDialog(null, acu);
             
     }
     
     public static void ordenar(){
         
         int array[]=new int[10];
    for (int i=0; i<array.length; i++){
        array[i]=(int)(Math.random()*10);
        Arrays.sort(array);
       JOptionPane.showMessageDialog(null, array[i]);    
     }
     }
     
     public static void maximo(){
        
              int array[]=new int[10];
    for (int i=0; i<array.length; i++){
        array[i]=(int)(Math.random()*10);
         List<Integer>arr=new ArrayList();
        
         arr=Arrays.asList(array[i]);
         Integer max=Collections.max(arr);
         JOptionPane.showMessageDialog(null, max);}
         
     }
     
     public static void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("INGRESE EL NUMERO DE LA OPCION A REALIZAR\n\n"
               + "MENU OPCIONES\n\n"
               + "1) Llenar el arreglo\n"
               + "2) Imprimir arreglo String\n"
               + "3) Ordenar arreglo\n"
               + "4) Hallar el maximo de un arreglo\n"
               + "5) SALIR--->\n\n"));
       
        
       switch(op){
           
           case 1:
               llenararreglo();
               break;
           case 2:
               Imprimir();
               break;
           case 3:
               ordenar();
               break;
           case 4:
               maximo();
               break;
                
       }
    } while (op!=5);
}
}
    
