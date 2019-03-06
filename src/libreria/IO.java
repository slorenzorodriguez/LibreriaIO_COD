/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author slorenzorodriguez
 */


public class IO {
    /**
     * datos object used to implement variables
     */
    static class datos{
         int numeroI;
         float numeroF;
         double numeroD;
         String texto; 
    }
    
    static datos obx = new datos();
    
    public static final int CONSOLA=0; // CONSOLA: Selecciona salida por consola.
    public static final int VENTANA=1; // VENTANA: Selecciona salida por ventana.
    private static String mensaje; // MENSAJE: Texto en ventana o en consola.

    
    public static final int INT=2; // INT: selecciona variable int
    public static final int FLOAT=3; // FLOAT: selecciona variable float
    public static final int DOUBLE=4; // DOUBLE: selecciona variable double
    public static final int STRING=5; // STRING: selecciona variable String.

    
    /*Tipo*/
    /**
     * 
     * @param tipo: Selecciona el tipo de dato a introducir. 
     * @param selector: Selecciona modo de visualización; VENTANA o CONSOLA
     * @param mensaje: Mensaje a imprimir. 
     */
    public static void Introducir(int tipo,int selector,String mensaje){
        switch(tipo){
            case INT: selectorIntroI(selector,mensaje);
                          break;
            case FLOAT:  selectorIntroF(selector,mensaje);
                          break;
            case DOUBLE: selectorIntroD(selector,mensaje);
                          break;
            case STRING: selectorIntroS(selector,mensaje);
                          break;
        }

    }
    /*Int*/
    private static void pconsolaI(){
        Scanner ler=new Scanner(System.in);
        obx.numeroI=ler.nextInt();
    }
    private static void pventanaI(){;
        obx.numeroI=Integer.parseInt(JOptionPane.showInputDialog(null,mensaje));
    }
    
    /**
     * 
     * @param selector  Selecciona modo de visualización; VENTANA o CONSOLA
     * @param mensaje Mensaje a imprimir.
     */
    private static void selectorIntroI(int selector,String mensaje){
        switch (selector){
            case CONSOLA: System.out.println(mensaje);
                          pconsolaI();
                          break;
            case VENTANA: IO.mensaje=mensaje;
                          pventanaI();
                          break;
        }
    }
    /**
     * 
     * @param selector Selecciona modo de visualización; VENTANA o CONSOLA
     * @param numero Variable data
     */
    public static void impri(int selector,int numero){
        switch (selector){
            case CONSOLA: System.out.println(numero);
            break;
            case VENTANA: JOptionPane.showMessageDialog(null, numero);
            break;
        }
        
    }
    
    
    /*String*/
    private static void pconsolaS(){
        Scanner ler=new Scanner(System.in);
        obx.texto=ler.next();
    }
    private static void pventanaS(){
        obx.texto=JOptionPane.showInputDialog(null,mensaje);
    }
    
    /**
     * 
     * @param selector if you put 0 in the selector you select consola and if you put 1 you select ventana.
     * @param mensaje Mensaje a imprimir.
     */
    private static void selectorIntroS(int selector,String mensaje){
        switch (selector){
            case CONSOLA: System.out.println(mensaje);
                          pconsolaS();
                          break;
            case VENTANA: IO.mensaje=mensaje;
                          pventanaS();
                          break;
    }
    }
    /**
     * 
     * @param selector Selecciona modo de visualización; VENTANA o CONSOLA
     * @param texto Variable data
     */
    
   public static void impri(int selector,String texto){
        switch (selector){
            case CONSOLA: System.out.println(texto);
            break;
            case VENTANA: JOptionPane.showMessageDialog(null, texto);
            break;
        }
   }

    /*Float*/
    private static void pconsolaF(){
        Scanner ler=new Scanner(System.in);
        obx.numeroF=ler.nextFloat();
    }
    private static void pventanaF(){
        obx.numeroF=Float.parseFloat(JOptionPane.showInputDialog(null,mensaje));
    }
    
    /**
     * 
     * @param selector: 0 -->  seleccionará consola //  1 -->  seleccionará vetana.
     * @param mensaje Mensaje a imprimir.
     */
    private static void selectorIntroF(int selector,String mensaje){
        switch (selector){
            case CONSOLA: System.out.println(mensaje);
                          pconsolaF();
                          break;
            case VENTANA: IO.mensaje=mensaje;
                          pventanaF();
                          break;
        }
    }
    
    /**
     * 
     * @param selector Selecciona modo de visualización; VENTANA o CONSOLA
     * @param numero Variable data
     */
    
    public static void impri(int selector, float numero){
        switch (selector){
            case CONSOLA: System.out.println(numero);
            break;
            case VENTANA: JOptionPane.showMessageDialog(null, numero);
            break;
        }
    }
  
    /*Double*/
    private static void pconsolaD(){
        Scanner ler=new Scanner(System.in);
        obx.numeroD=ler.nextFloat();
    }
    private static void pventanaD(){
        obx.numeroD=Double.parseDouble(JOptionPane.showInputDialog(null,mensaje));
    }
    
    /**
     * 
     * @param selector 0 -->  seleccionará consola //  1 -->  seleccionará vetana.
     * @param mensaje Mensaje a imprimir.
     */
    private static void selectorIntroD(int selector,String mensaje){
        switch (selector){
            case CONSOLA: System.out.println(mensaje);
                          pconsolaD();
                          break;
            case VENTANA: IO.mensaje=mensaje;
                          pventanaD();
                          break;
        }
    }
    
    /**
     * 
     * @param selector Selecciona modo de visualización; VENTANA o CONSOLA
     * @param numero Variable data
     */
    
    public static void impri(int selector, double numero){
        switch (selector){
            case CONSOLA: System.out.println(numero);
            break;
            case VENTANA: JOptionPane.showMessageDialog(null, numero);
            break;
        }
    }
}

