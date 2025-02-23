/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author edela
 */
public class Vendedor extends Persona {
    private String codigo_vendedor;
   

    public Vendedor(String codigo_vendedor, String cedula, String nombre_completo, String direccion, String telefono) {
        super(cedula, nombre_completo, direccion, telefono);
        this.codigo_vendedor = codigo_vendedor;
    }

    public void setCodigo_vendedor(String codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public String getCodigo_vendedor() {
        return codigo_vendedor;
    }

    /**
     *
     * @return Retorna el valor del objeto
     */
    @Override
    public String toString() {
        return "Hemos creado un Vendedor con codigo_vendedor=" + codigo_vendedor;
    }
    
    
}
