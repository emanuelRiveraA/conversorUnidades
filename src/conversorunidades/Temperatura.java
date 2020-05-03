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
public class Temperatura extends Unidad{

    public Temperatura(double unidad) {//constructor donde se hereda la variable unidad.
        super(unidad);
    }     
    
    @Override
    public double convertir(){//metodo heredado donde se realiza la conversion de Temperaturas (Celsius < - > Farenheit)
        return ((unidad - 32)*.5555555556);
    }
    
}
