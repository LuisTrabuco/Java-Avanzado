/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author alumno-202
 */
public class Almacen {

    Map<String, Producto> listasDeProductos = new Hashtable<String, Producto>();
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public void menu() throws IOException {
        int opcion = 0;
        while (opcion != 6) {

            System.out.print("\tMENU DE OPCIÓN \n");
            System.out.print("\t==== == ====== \n");
            System.out.print(" \n");
            System.out.print("1-> Agregar Producto \n");
            System.out.print("2-> Actualizar PRODUCTO  \n");
            System.out.print("3-> Eliminar PRODUCTO por Director \n");
            System.out.print("4-> Ordenar CANTIDAD DESCENDENTE \n");
            System.out.print("5-> Mostrar DATOS de Pelicula por Pelicula \n");
            System.out.print("6-> Salir \n");
            opcion = Integer.parseInt(entrada.readLine());
            switch (opcion) {
                case 1:
                    agregarPorducto();
                    break;
                case 2:
                    modificarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    ordenarProducto();
                    break;
                case 5:
                    buscarProducto();
                    break;
                case 6:
                    System.out.print("\n ***** FIN DEL PROGRAMA *****");
                    break;
                default:
                    System.err.print("\n La opción ingresada no es valida");
                    break;
            }
        }

    }

    private void agregarPorducto() throws IOException, InputMismatchException {
        String codProducto;
        System.out.print("\n ***** AGREGANDO PRODUCTOS ***** \n");
        System.out.print("\nCódigo Producto: ");
        codProducto = entrada.readLine();
        if (listasDeProductos.containsKey(codProducto)) {
            System.out.print("\nProducto ya existe en la lista");
        }
        listasDeProductos.put(codProducto, cargarObjeto());
    }

    private void modificarProducto() throws IOException {
        String codProducto;
        System.out.print("\n ***** AGREGANDO PRODUCTOS ***** \n");
        System.out.print("\nCódigo Producto: ");
        codProducto = entrada.readLine();
        Set<String> lista = listasDeProductos.keySet();
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            if(listasDeProductos.containsKey(codProducto)){
                 String codProAct = it.next();
                  Producto productoviejo=listasDeProductos.get(codProAct);
                  Producto productonuevo=cargarObjeto();
                  listasDeProductos.replace(codProAct, productoviejo, productonuevo);
            }   
        }
    }

    private void eliminarProducto() {

    }

    private void ordenarProducto() {

    }

    private void buscarProducto() {

    }

    private Producto cargarObjeto() throws IOException, InputMismatchException {
        //ATRIBUTOS DEL OBJETO 
        String nombre;
        String fabricante;
        Integer anhoFabricacion;
        Integer precioUnitario;
        Integer cantidad;
        //NOMBRE DEL OBJETO
        Producto producto;
        System.out.print("\nNombre Producto:");
        nombre = entrada.readLine();
        System.out.print("\nFabricante Producto:");
        fabricante = entrada.readLine();
        System.out.print("\nAño de Fabricación Producto:");
        anhoFabricacion = Integer.parseInt(entrada.readLine());
        System.out.print("\nPrecio Producto:");
        precioUnitario = Integer.parseInt(entrada.readLine());
        System.out.print("\nCantidad Producto:");
        cantidad = Integer.parseInt(entrada.readLine());
        return producto = new Producto(nombre, fabricante, anhoFabricacion, precioUnitario, cantidad);

    }

}
