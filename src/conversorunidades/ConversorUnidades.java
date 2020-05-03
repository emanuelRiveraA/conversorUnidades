/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

import javax.swing.JOptionPane;

/**
 *
 * @author Idalia
 */
public class ConversorUnidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] options = {"Celsius-Farenheit", "Dolar-M.N.", "Metros-Yardas", "Metro2-Milla2"};
        int x = JOptionPane.showOptionDialog(null, "Escoje a que unidad quieres convertir",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        
        if (x == 0) {
            Temperatura t = new Temperatura(5);//se instancia la clase temperatura y se le manda un valor al contructor
            JOptionPane.showMessageDialog(null, "La temperatura en Farenheit es: "+ t.convertir());//se muestra el resultado del metodo convertir
        } else if(x == 1){
            MonedaNacional mn = new MonedaNacional(6);//se instancia la clase MonedaNacional y se le manda un valor al contructor
            JOptionPane.showMessageDialog(null, "La el resultado en pesos es: "+ mn.convertir());///se muestra el resultado del metodo convertir 
        } else if(x == 2){
            Yardas y = new Yardas(7);//se instancia la clase Yardas y se le manda un valor al contructor
            JOptionPane.showMessageDialog(null, "La longitud en yardas es: "+ y.convertir());///se muestra el resultado del metodo convertir
        } else if(x == 3){
            Millas m = new Millas(8);//se instancia la clase Millas y se le manda un valor al contructor
            JOptionPane.showMessageDialog(null, "La superficie en millas2 es: "+ m.convertir());///se muestra el resultado del metodo convertir 
        }
        
        
    }
    
}
