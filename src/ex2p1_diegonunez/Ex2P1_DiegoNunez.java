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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Let's Make Music");
        System.out.println("0. Salir");
        int juego = entrada.nextInt();
        char respuesta = 'n';
        if (juego == 1) {
            respuesta = 's';
            System.out.println("Comencemos haciendo tu primer Musico:");
            MusicM Diego = crearMusicos();
            Principal(Diego);
        }

    }

    public static void playSong() {
        System.out.println("Parabola...\n"
                + "We barely remember\n"
                + "Who or what came before this precious moment\n"
                + "We are choosing to be here right now\n"
                + "Hold on, stay inside\n"
                + "\n"
                + "This holy reality\n"
                + "This holy experience\n"
                + "Choosing to be here in\n"
                + "\n"
                + "This body, this body holding me\n"
                + "Be my reminder here that I am not alone in\n"
                + "This body, this body holding me\n"
                + "Feeling eternal, all this pain is an illusion\n"
                + "\n"
                + "Alive\n"
                + "\n"

                + "In this holy reality\n"
                + "In this holy experience\n"
                + "Choosing to be here in\n"
                + "\n"
                + "This body, this body holding me\n"
                + "Be my reminder here that I am not alone in\n"
                + "This body, this body holding me\n"
                + "Feeling eternal, all this pain is an illusion\n"

                + "Twirling 'round with this familiar parable\n"
                + "Spinning, weaving 'round each new experience\n"
                + "Recognize this as a holy gift and\n"
                + "Celebrate this chance to be alive and breathing\n"
                + "A chance to be alive and breathing\n"
                + "\n"
                + "This body holding me reminds me of my own mortality\n"
                + "Embrace this moment, remember\n"
                + "We are eternal, all this pain is an illusion"
                + "\n");
    }

    public static MusicM crearMusicos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre ");
        String nombre = entrada.next();
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el dni");
        int dni = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el instrumento: ");
        String instrumento = entrada.next();

        MusicM Musico = new MusicM();
        Musico.nombre = nombre;
        Musico.edad = edad;
        Musico.instrumento = instrumento;
        Musico.dni = dni;
        return (Musico);
    }

    public static void Principal(MusicM Persona) {

        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> ID = new ArrayList<>();
        ArrayList<Integer> edad = new ArrayList<>();
        ArrayList<String> instrumento = new ArrayList<String>();
        String nombre = "";
        int dni = 0;
        String instrumentos = "";
        int edades = 0;

        Scanner entrada = new Scanner(System.in);

        char respuesta = 's';
        nombres.add(Persona.nombre);
        ID.add(Persona.dni);
        edad.add(Persona.edad);
        instrumento.add(Persona.instrumento);

        while (respuesta == 's') {
            System.out.println("1. Ingresar Musico");
            System.out.println("2. Listar Detalles del Musico");
            System.out.println("3. Play Song");
            System.out.println("4. Eliminar Musico");
            System.out.println("5. Reset");
            System.out.println("Ingrese una opcion:");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese el nombre ");
                String nombrel = entrada.next();
                System.out.println("Ingrese la edad");
                int edads = entrada.nextInt();
                System.out.println("Ingrese el dni");
                int Dni = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese el instrumento: ");
                String instrumentol = entrada.next();

                nombres.add(nombrel);
                ID.add(Dni);
                edad.add(edads);
                instrumento.add(instrumentol);
                System.out.println("Se ingreso el musico correctamente");
            } else if (opcion == 2) {
                
                if (nombres.size()>=1) {
                System.out.println("Ingrese la posicion del miembro:");
                
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println("->" + nombres.get(i));
                }
                int posicion = entrada.nextInt();
                System.out.println(nombres.get(posicion));
                System.out.println(ID.get(posicion));
                System.out.println(edad.get(posicion));
                System.out.println(instrumento.get(posicion));
                } else {
                    System.out.println("no hay miembros que seleccionar");
                }
                
            } else if (opcion == 3) {
                if (nombres.size()>=1) {
                System.out.println(nombres.get(0) + " esta usando el/la " + instrumento.get(0) + "para la siguiente cancion:");
                playSong();
                } else {
                    System.out.println("No hay miembros que puedan cantar.");
                }
            } else if (opcion == 4) {
                if (nombres.size()>=1) {
                System.out.println("Miembros de la banda:");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println("->" + nombres.get(i));
                }
                System.out.println("Ingrese la posicion del miembro");
                int posicion = entrada.nextInt();
                nombres.remove(posicion);
                ID.remove(posicion);
                edad.remove(posicion);
                instrumento.remove(posicion);
                System.out.println("Se elimino el miembro de la banda.");
                } else {
                    System.out.println("No hay miembros que eliminar.");
                }
            } else if (opcion == 5) {
                nombres.clear();
                instrumento.clear();
                edad.clear();
                ID.clear();
                System.out.println("Los elementos fueron eliminados.");
            }

            System.out.print("Desea seguir editando? [s/n]:");
            respuesta = entrada.next().charAt(0);
            if (respuesta != 's') {
                System.out.println("1. Let's Make Music");
        System.out.println("0. Salir");
        int juego = entrada.nextInt();
        if (juego == 1) {
            continue;
        } else {
            break;
        }
            }
        }

    }
}
