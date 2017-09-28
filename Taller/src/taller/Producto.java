/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.Objects;
import java.util.logging.Logger;

/**
 *
 * @author alumno-202
 */
public class Producto implements Comparable<Producto>{
    String nombre; 
    String fabricante; 
    Integer anhoFabricacion; 
    Integer precioUnitario;
    Integer cantidad;

    public Producto(){
    }

    public Producto(String nombre, String fabricante, Integer anhoFabricacion, Integer precioUnitario, Integer cantidad) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.anhoFabricacion = anhoFabricacion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Integer getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public void setAnhoFabricacion(Integer anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", fabricante=" + fabricante + ", anhoFabricacion=" + anhoFabricacion + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.nombre);
        hash = 37 * hash + Objects.hashCode(this.fabricante);
        hash = 37 * hash + Objects.hashCode(this.anhoFabricacion);
        hash = 37 * hash + Objects.hashCode(this.precioUnitario);
        hash = 37 * hash + Objects.hashCode(this.cantidad);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.anhoFabricacion, other.anhoFabricacion)) {
            return false;
        }
        if (!Objects.equals(this.precioUnitario, other.precioUnitario)) {
            return false;
        }
        if (!Objects.equals(this.cantidad, other.cantidad)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Producto o) {
         if(this.getPrecioUnitario().compareTo(o.getPrecioUnitario())<1){
             return 1;
         }else if(this.getPrecioUnitario().compareTo(o.getPrecioUnitario())>1){
             return -1;
         }else{
             return 0;
         }
             
    }
    
    
}
