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
public class Unidad {//se crea la clase Unidad donde se integran los atributos y sus metodos
    
    protected double unidad;//se declara la variable con encapsulamiento protected y de dato double

    public Unidad(double unidad) {//se crea un constructor con parametros
        this.unidad = unidad;
    }

    public double getUnidad() {//metod get
        return unidad;
    }

    public void setUnidad(double unidad){ //metodo set
        this.unidad = unidad;
    }

    public double convertir(){
        return 0;
    }
}
