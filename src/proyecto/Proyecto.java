/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author fatii
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException  {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ProyectoMain[] Menu;
        int tam = 0;
        int num = 1;//para iniciar en 1 el arreglo
        int num2 = 0;//para contar a las personas ingresadas
        int num3 = 0;//almacena la suma del contador 1

        System.out.print("De que tamaño es la agenda:");
        tam = sc.nextInt();
        Menu= new ProyectoMain[tam];
        int tam2 = tam;
        System.out.println("El espacio restante de la agenda es: " + tam2);
        //inicializar cada posicion del arreglo
        for (int i = 0; i < Menu.length; i++) {
            Menu[i] = new ProyectoMain();
        }
        int resp = 0;
        int opc2 = 0;
        do {
            System.out.println("---------------Menu---------------------");
            System.out.println("El espacio restante de la agenda es: " + tam2);
            System.out.println("1) Agregar al cliente");
            System.out.println("2) Mostrar informacion de todos los clientes ");
            System.out.println("3) Buscar al cliente");
            System.out.println("4) Salir");
            System.out.print("Elige una opcion:");
            resp = sc.nextInt();

            switch (resp) {
                case 1:
                    if (num3 < tam) {
                        num3 += num;
                        for (int i = num2; i < num3; i++) {
                            System.out.print("ID: ");
                            Menu[i].setId(sc.nextInt());
                            System.out.print("Nombre: ");
                            Menu[i].setNombre(bf.readLine());
                            System.out.print("Apellido Paterno: ");
                            Menu[i].setApellidoP(bf.readLine());
                            System.out.print("Apellido Materno: ");
                            Menu[i].setApellidoM(bf.readLine());
                            System.out.print("Telefono: ");
                            Menu[i].setTelefono(bf.readLine());
                            System.out.print("Direccion: ");
                            Menu[i].setDireccion(bf.readLine());
                            System.out.print("Edad: ");
                            Menu[i].setEdad(bf.readLine());
                            i++;
                            num2++;
                        }
                        tam2--;
                    } else {
                        System.out.println("No hay espacio en la cartera: ");
                    }
                    break;
                case 2:
                    System.out.println("----Lista de los clientes------");
                    for (ProyectoMain menu : Menu) {
                        System.out.println("ID: " + menu.getId());
                        System.out.println("Nombre: " + menu.getNombre());
                        System.out.println("Apellido Paterno: " + menu.getApellidoP());
                        System.out.println("Apellido Materno: " + menu.getApellidoM());
                        System.out.println("Telefono: " + menu.getTelefono());
                        System.out.println("Direccion: " + menu.getDireccion());
                        System.out.println("Edad: " + menu.getEdad());
                    }
                    System.out.println("------------------------------------");
                    break;
                case 3:

                    System.out.println("----------Buscar al cliente------");
                    System.out.println("1) Buscar por codigo: ");
                    System.out.println("2) Buscar por nombre: ");
                    System.out.println("0) Regresar");
                    System.out.print("Elige una opcion: ");
                    opc2 = sc.nextInt();

                    switch (opc2) {
                        case 1:
                            System.out.print("Codigo a buscar: ");
                            int buscar = sc.nextInt();
                            if (buscar >= 0 && buscar <= tam) {
                                System.out.println("El cliente se ha encontrado: ");
                                System.out.println("ID: " + Menu[buscar - 1].getId());
                                System.out.println("Nombre: " + Menu[buscar - 1].getNombre());
                                System.out.println("Apellido Paterno: " + Menu[buscar - 1].getApellidoP());
                                System.out.println("Apellido Materno: " + Menu[buscar - 1].getApellidoM());
                                System.out.println("Telefono: " + Menu[buscar - 1].getTelefono());
                                System.out.println("Direccion: " + Menu[buscar - 1].getDireccion());
                                System.out.println("Edad: " + Menu[buscar - 1].getEdad());
                            } else {
                                System.out.println("No se ha encontrado ese codigo: ");

                            }
                            break;

                        case 2:
                            int posicion = -1;
                            System.out.print("Ingresa el nombre a buscar: ");
                            String buscador = bf.readLine();

                             {
                                for (int i = 0; i < Menu.length; i++) {
                                    if (buscador.equals(Menu[i].getNombre())) {
                                        posicion = i;
                                        System.out.println("El cliente se ha encontado: ");
                                        System.out.println("Nombre: " + Menu[i].getNombre());
                                        System.out.println("Apellido Paterno: " + Menu[i].getApellidoP());
                                        System.out.println("Apellido Materno: " + Menu[i].getApellidoM());
                                        System.out.println("Telefono: " + Menu[i].getTelefono());
                                        System.out.println("Direccion: " + Menu[i].getDireccion());
                                        System.out.println("Edad: " + Menu[i].getEdad());
                                    }
                                }
                                if (posicion == -1) {
                                    System.out.println("El cliente no se ha encontado: ");
                                }
                            }
                        case 0:
                            System.out.println("Gracias por usar el sub menu");
                    }
                    break;
                case 4:
                    System.out.println("VUELVE PRONTO, FUE UN PLACER AYUDARTE");
                    break;
            }
        } 
        while (resp != 0);
    }
    private static boolean nombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

