/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorunidades;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Idalia
 */
public class Pantalla extends javax.swing.JFrame {

    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_unidad = new javax.swing.JTextField();
        btn_f = new javax.swing.JButton();
        btn_M = new javax.swing.JButton();
        btn_Y = new javax.swing.JButton();
        btn_milla = new javax.swing.JButton();
        txt_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESA LA UNIDAD A CONVERTIR");

        txt_unidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_f.setText("Celsius - farenheith");

        btn_M.setText("Dollar - M.N");

        btn_Y.setText("Metros - yardas");

        btn_milla.setText("M2 - Milla2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txt_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_Y, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_f, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_milla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_M, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txt_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_unidad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_f)
                    .addComponent(btn_M))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Y)
                    .addComponent(btn_milla))
                .addGap(18, 18, 18)
                .addComponent(txt_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtn_M() {
        return btn_M;
    }

    public void setBtn_M(JButton btn_M) {
        this.btn_M = btn_M;
    }

    public JButton getBtn_Y() {
        return btn_Y;
    }

    public void setBtn_Y(JButton btn_Y) {
        this.btn_Y = btn_Y;
    }

    public JButton getBtn_f() {
        return btn_f;
    }

    public void setBtn_f(JButton btn_f) {
        this.btn_f = btn_f;
    }

    public JButton getBtn_milla() {
        return btn_milla;
    }

    public void setBtn_milla(JButton btn_milla) {
        this.btn_milla = btn_milla;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getTxt_resultado() {
        return txt_resultado;
    }

    public void setTxt_resultado(JLabel txt_resultado) {
        this.txt_resultado = txt_resultado;
    }

    public JTextField getTxt_unidad() {
        return txt_unidad;
    }

    public void setTxt_unidad(JTextField txt_unidad) {
        this.txt_unidad = txt_unidad;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_M;
    private javax.swing.JButton btn_Y;
    private javax.swing.JButton btn_f;
    private javax.swing.JButton btn_milla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txt_resultado;
    private javax.swing.JTextField txt_unidad;
    // End of variables declaration//GEN-END:variables
}
