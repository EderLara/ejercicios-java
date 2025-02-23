/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author edela
 */
public abstract class Persona {
    private String cedula;
    private String nombre_completo;
    private String direccion;
    private String telefono;

    public Persona(String cedula, String nombre_completo, String direccion, String telefono) {
        this.cedula = cedula;
        this.nombre_completo = nombre_completo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Hemos agregado a la persona con " + "cedula=" + cedula + ", nombre_completo=" + nombre_completo + ", direccion=" + direccion + ", telefono=" + telefono;
    }
}
