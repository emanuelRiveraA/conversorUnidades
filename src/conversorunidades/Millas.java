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
public class Millas extends Unidad{
    
    public Millas(double unidad) {
        super(unidad);
    }

    @Override
    public double convertir() {
        return (unidad*3.49528613968);//metodo donde se realiza la conversion de Superficie (Metro2 < - > Milla2  )
    }
    
    
    
}
