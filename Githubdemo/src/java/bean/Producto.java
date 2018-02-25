/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author imac
 */
public class Producto {
    private String idproducto;
    private int cantidad;
    private boolean guardado;

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setGuardado(boolean guardado){
        this.guardado=guardado;
    }
    
    public boolean getGuardado(){
        return this.guardado;
    }
    
}
