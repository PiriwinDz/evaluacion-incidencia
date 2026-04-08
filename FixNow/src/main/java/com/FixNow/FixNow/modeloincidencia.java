package com.FixNow.FixNow;

import java.util.List;

public class modeloincidencia {
    private int id;
    private String descripcion;
    private String estado;
    private int prioridad;
    private String fecha;

    
    public modeloincidencia() {
    }





    public modeloincidencia(int id, String descripcion, String estado, int prioridad, String fecha) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.fecha = fecha;
    }





    public int getId() {
        return id;
    }





    public void setId(int id) {
        this.id = id;
    }





    public String getDescripcion() {
        return descripcion;
    }





    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }





    public String getEstado() {
        return estado;
    }





    public void setEstado(String estado) {
        this.estado = estado;
    }





    public int getPrioridad() {
        return prioridad;
    }





    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }





    public String getFecha() {
        return fecha;
    }





    public void setFecha(String fecha) {
        this.fecha = fecha;
    }





    @Override
    public String toString() {
        return "modeloincidencia{id=" + id + ", descripcion='" + descripcion + "', estado='" + estado + "', prioridad=" + prioridad + ", fecha='" + fecha + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        modeloincidencia that = (modeloincidencia) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
