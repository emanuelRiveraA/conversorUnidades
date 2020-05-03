/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

/**
 *
 * @author Idalia
 */
public class MonedaNacional extends Unidad{
    
    public MonedaNacional(double unidad) {
        super(unidad);
    }
    
    public double convertir(){//metodo donde se realiza la conversion de Moneda (Dolar < - > M.N.)
        return (unidad*19.08);
    }
    
    
}
