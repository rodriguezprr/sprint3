/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodriguezprr
 */
public class producto {
    
    private String nombre;
    private double precio;
    private String categoria;
    private double valorDeDescuento;
    
    public producto(String nombre,double precio,String categoria,double valorDeDescuento){
        
        this.nombre=nombre;
        this.precio=precio;
        this.categoria = categoria;
        this.valorDeDescuento = valorDeDescuento;
    }
    
    public double precioConDescuento(){
        double precioDescuento;
        precioDescuento= precio*(1-valorDeDescuento);
        return precioDescuento;
    }
    
}
