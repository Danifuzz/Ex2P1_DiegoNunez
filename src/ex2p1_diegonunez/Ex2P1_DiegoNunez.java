/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_diegonunez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nunez
 */
public class Ex2P1_DiegoNunez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> ID = new ArrayList<>();
        ArrayList<Integer> edad = new ArrayList<>();
        ArrayList<String> instrumento = new ArrayList<String>();

        Scanner entrada = new Scanner  (System.in);
        System.out.println("1. Let's Make Music");
        System.out.println("0. Salir");
        int juego = entrada.nextInt();
        char respuesta = 'n';
        if (juego == 1) {
        respuesta = 's';
        } 
            
        while (respuesta == 's') {
            System.out.println("1. Ingresar Musico");
            System.out.println("2. Listar Detalles del Musico");
            System.out.println("3. Play Song");
            System.out.println("4. Eliminar Musico");
            System.out.println("5. Reset");
            System.out.println("Ingrese una opcion:");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese el nombre de el Musico:");
                String nombre = entrada.next();
                nombres.add(nombre);
                System.out.println("");
                System.out.println("Ingrese la Identidad:");
                int dni = entrada.nextInt();
                ID.add(dni);
                System.out.println("");
                System.out.println("Ingrese la edad:");
                int edades = entrada.nextInt();
                edad.add(edades);
                System.out.println("Ingrese el instrumento:");
                String instrumentos = entrada.next();
                instrumento.add(instrumentos);
                System.out.println("Se ingreso el musico correctamente");
            } else if (opcion == 2) {
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println("->"+nombres.get(i));
                }
            }
             
            
            System.out.print("Desea seguir editando? [s/n]:");
            respuesta = entrada.next().charAt(0);
        }
        
    
    }
public static void Micancion() {
         System.out.println("\n" +
"We barely remember\n" +
"Who or what came before this precious moment\n" +
"We are choosing to be here right now\n" +
"Hold on, stay inside\n" +
"\n" +
"[Pre-Chorus]\n" +
"This holy reality\n" +
"This holy experience\n" +
"Choosing to be here in\n" +
"\n" +

"This body, this body holding me\n" +
"Be my reminder here that I am not alone in\n" +
"This body, this body holding me\n" +
"Feeling eternal, all this pain is an illusion\n" +
"\n" +

"Alive\n" +
"\n" +
"[Pre-Chorus]\n" +
"In this holy reality\n" +
"In this holy experience\n" +
"Choosing to be here in\n" +
"\n" +

"This body, this body holding me\n" +
"Be my reminder here that I am not alone in\n" +
"This body, this body holding me\n" +
"Feeling eternal, all this pain is an illusion\n" +
"See Tool Live\n" +
"Get tickets as low as $12\n" +
"You might also like\n" +
"Parabol\n" +
"Tool\n" +
"Schism\n" +
"Tool\n" +
"Lateralus\n" +
"Tool\n" +

"Twirling 'round with this familiar parable\n" +
"Spinning, weaving 'round each new experience\n" +
"Recognize this as a holy gift and\n" +
"Celebrate this chance to be alive and breathing\n" +
"A chance to be alive and breathing\n" +
"\n" +

"This body holding me reminds me of my own mortality\n" +
"Embrace this moment, remember\n" +
"We are eternal, all this pain is an illusion");   
        }

}

    

