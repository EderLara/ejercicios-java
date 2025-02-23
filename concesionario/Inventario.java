/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;
import java.util.ArrayList;
/**
 *
 * @author edela
 */
public class Inventario {
    private ArrayList<Vehiculo> vehiculos;
    
    // Constructor:
    public Inventario(){
        this.vehiculos = new ArrayList<>();
    }
    
    // M�todo para agregar vehiculo:
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    // M�todo para eliminar vehiculo:
    public void eliminarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
    
    // Getter:
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Se ha agregado al Inventario el vehiculo =" + vehiculos;
    }
    
    
}
