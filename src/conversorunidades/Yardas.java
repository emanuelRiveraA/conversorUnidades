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
public class Yardas extends Unidad{
    
    public Yardas(double unidad) {
        super(unidad);
    }
    
    @Override
    public double convertir(){//metodo donde se realiza la conversion de Longitud (Metros < - > Yardas)
        return (unidad*1.09361329834);
    }
    
}
