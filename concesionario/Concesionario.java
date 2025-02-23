/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionario;
import java.util.ArrayList;
/**
 * @see 
 * @author edela
 */
public class Concesionario {
    
    /**
     * @param args the command line arguments
     */
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Venta> ventas;
    private Inventario inventario;

    public Concesionario() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventario = new Inventario();
    }
    
    // Método para agregar clientes:
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    // Método get para ver los clientes:
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
    // Método para agregar Vendedores:
    public void agregarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    
    // Método get para ver vendedores:
    public ArrayList<Vendedor> getVendedores(){
        return vendedores;
    }
    
    // Métodos para gestión de inventarios:
    public void agregarVehiculo(Vehiculo vehiculo){
        inventario.agregarVehiculo(vehiculo);
    }
    
    public void eliminarVehiculo(Vehiculo vehiculo){
        inventario.eliminarVehiculo(vehiculo);
    }
    
    public ArrayList<Vehiculo> getInventario(){
        return inventario.getVehiculos();
    }
    
    // Gestion de ventas:
    public void registrarVenta(Vendedor vendedor, Cliente cliente, Vehiculo vehiculo, String fecha_venta){
        Venta venta = new Venta(vendedor, cliente, vehiculo, fecha_venta);
        ventas.add(venta);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Instanciar clases:        
        Concesionario concesionario = new Concesionario();
        
        // Crear objetos Cliente, Vendedor, Vehiculo:
        Cliente cliente1 = new Cliente("c001", "21345678", "Eder Lara T", "Calle 2 # 1-1", "311578999");
        Vendedor vendedor1 = new Vendedor("v001", "32678345", "Franklin Pacheco", "Cra 2 # 1-1", "311573999");
        Vehiculo vehiculo1 = new Vehiculo("Ford",2025,"Renegade",300000000.00);
        
        // Agregar estos objetos a sus clases:
        concesionario.agregarCliente(cliente1);
        concesionario.agregarVendedor(vendedor1);
        concesionario.agregarVehiculo(vehiculo1);
        
        // Registramos la venta:
        String fecha_venta = "2025-02-23";
        concesionario.registrarVenta(vendedor1,cliente1,vehiculo1,fecha_venta);
        
        // Imprimimos el objeto concesionario:
        System.out.println(concesionario);
    }

    @Override
    public String toString() {
        return "El dia de "+ " el cliente " + clientes + " Nos compró a través del vendedor "+  vendedores + ventas  + inventario;
    }
    
}
