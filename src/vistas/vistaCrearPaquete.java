/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.ControladorOT;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author Rocío
 */
public class vistaCrearPaquete extends javax.swing.JFrame {
    private final ControladorOT control;

    /**
     * Creates new form vistaCrearPaquete
     */
    public vistaCrearPaquete(ControladorOT control) {
        initComponents();
        this.control = control;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboPais = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboProvincia = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        comboCiudad = new javax.swing.JComboBox();
        botonOrigen = new javax.swing.JButton();
        botonDestino = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDestinos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCupo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comboRubro = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        comboServicio = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        comboPrestador = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        comboServiciosPrestados = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        txtDesde = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtHasta = new javax.swing.JTextField();
        botonAgregarSer = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        campoItinerario = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        campoDias = new javax.swing.JTextField();
        campoNoches = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        botonCP = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        comboPF = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Paquete");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 19, -1, -1));
        getContentPane().add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 16, 68, -1));

        jLabel2.setText("Descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 19, -1, -1));
        getContentPane().add(campoDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 11, 206, 48));

        jLabel3.setText("Pais");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        comboPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPaisItemStateChanged(evt);
            }
        });
        getContentPane().add(comboPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 117, -1));

        jLabel4.setText("Provincia");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        comboProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProvinciaItemStateChanged(evt);
            }
        });
        comboProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProvinciaActionPerformed(evt);
            }
        });
        getContentPane().add(comboProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 100, -1));

        jLabel5.setText("Ciudad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        comboCiudad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 120, -1));

        botonOrigen.setText("Origen");
        botonOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOrigenActionPerformed(evt);
            }
        });
        getContentPane().add(botonOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 80, -1, -1));

        botonDestino.setText("Destino");
        botonDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDestinoActionPerformed(evt);
            }
        });
        getContentPane().add(botonDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, -1, -1));

        jLabel6.setText("Origen");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 157, -1, -1));
        getContentPane().add(lblOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 157, 116, 20));

        tablaDestinos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDestinos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 93));

        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaServicios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, -1, 93));

        jLabel7.setText("Destinos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        jLabel8.setText("Servicios");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 302, -1, -1));

        jLabel9.setText("Cupo");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 335, -1, -1));
        getContentPane().add(txtCupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 332, 62, -1));

        jLabel10.setText("Precio");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 335, -1, -1));
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 332, 62, -1));

        jLabel11.setText("Rubro");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        comboRubro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRubro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboRubroItemStateChanged(evt);
            }
        });
        getContentPane().add(comboRubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        jLabel12.setText("Tipo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        getContentPane().add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        jLabel13.setText("Servicio");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        comboServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 370, -1, -1));

        jLabel14.setText("Prestador");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 53, -1));

        comboPrestador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPrestador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPrestadorItemStateChanged(evt);
            }
        });
        comboPrestador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPrestadorActionPerformed(evt);
            }
        });
        getContentPane().add(comboPrestador, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, -1));

        jLabel15.setText("Servicios Prestados");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        comboServiciosPrestados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboServiciosPrestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboServiciosPrestadosActionPerformed(evt);
            }
        });
        getContentPane().add(comboServiciosPrestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, -1, -1));

        jLabel16.setText("Desde");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 335, -1, -1));
        getContentPane().add(txtDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 332, 62, -1));

        jLabel17.setText("Hasta");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 335, -1, -1));
        getContentPane().add(txtHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 332, 63, -1));

        botonAgregarSer.setText("Agregar");
        botonAgregarSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarSerActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregarSer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, -1));

        jLabel18.setText("Itinerario");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));
        getContentPane().add(campoItinerario, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 11, 192, 48));

        jLabel19.setText("Dias");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        getContentPane().add(campoDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 60, -1));
        getContentPane().add(campoNoches, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 68, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 294, 827, -1));

        jLabel21.setText("Noches");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        botonCP.setText("Crear Paquete");
        botonCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCPActionPerformed(evt);
            }
        });
        getContentPane().add(botonCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, -1, -1));

        jLabel22.setText("Condiciones comerciales");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));
        getContentPane().add(txtCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 130, -1));

        jLabel23.setText("Pasos Fronterizos");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, -1, -1));

        comboPF.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(comboPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(877, 110, 110, -1));

        jMenu1.setText("Crear Paquete");

        jMenuItem1.setText("Crear salida");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem4.setText("Modificar Paquete");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Modificar Salida");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem2.setText("Cambiar estado de Salida");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Salir");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPaisItemStateChanged
       if(comboPais.getSelectedIndex()>-1){
           control.ponerProvincias(comboPais.getSelectedIndex());
       }
       if(comboPais.getSelectedIndex()>-1){
           control.ponerPF(comboPais.getSelectedIndex());
       }
    }//GEN-LAST:event_comboPaisItemStateChanged

    private void comboProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProvinciaItemStateChanged
       if(comboProvincia.getSelectedIndex()>-1){
           control.ponerCiudades(comboPais.getSelectedIndex(), comboProvincia.getSelectedIndex());
       }
    }//GEN-LAST:event_comboProvinciaItemStateChanged

    private void botonOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOrigenActionPerformed
       control.ciudadOrigen(comboPais.getSelectedIndex(),comboProvincia.getSelectedIndex(),comboCiudad.getSelectedIndex());
    }//GEN-LAST:event_botonOrigenActionPerformed

    private void botonDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDestinoActionPerformed
         control.ciudadDestino(comboPais.getSelectedIndex(),comboProvincia.getSelectedIndex(),comboCiudad.getSelectedIndex(),comboPF.getSelectedIndex());
    }//GEN-LAST:event_botonDestinoActionPerformed

    private void comboRubroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboRubroItemStateChanged
       if(comboRubro.getSelectedIndex()>-1){
           control.ponerTipos(comboRubro.getSelectedIndex());
       }
    }//GEN-LAST:event_comboRubroItemStateChanged

    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
       if(comboTipo.getSelectedIndex()>-1){
           control.ponerServicios(comboRubro.getSelectedIndex(), comboTipo.getSelectedIndex());
       }
    }//GEN-LAST:event_comboTipoItemStateChanged

    public int getCupo(){
        return Integer.parseInt(txtCupo.getText());
    }
    
    public float getPrecio(){
     return Float.parseFloat(txtPrecio.getText());   
    }
    
    public int getDesde(){
        return Integer.parseInt(txtDesde.getText());
    }
    
    public int getHasta(){
        return Integer.parseInt(txtHasta.getText());
    }
    
    public int getServicioPrestadoIndex(){
        return comboServiciosPrestados.getSelectedIndex();
    }
    
    public int getPrestadorIndex(){
        return comboPrestador.getSelectedIndex();
    }
   
    public int getRubroIndex(){
        return comboRubro.getSelectedIndex();
    }
    
    public int getTipoIndex(){
        return comboTipo.getSelectedIndex();
    }
    
    public int getServicioIndex(){
        return comboServicio.getSelectedIndex();
    }
    
    private void botonAgregarSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarSerActionPerformed
        control.agregarServicio();
    }//GEN-LAST:event_botonAgregarSerActionPerformed

    private void botonCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCPActionPerformed
       control.CrearPaquete(txtCC.getText());
       JOptionPane.showMessageDialog(this, "Paquete creado, estado Activo");
       //volver aqui
    }//GEN-LAST:event_botonCPActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        control.mostrarVistaSalida();
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        control.mostrarVistaMP();

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       JOptionPane.showMessageDialog(this, "Modificar Salida");
       control.mostrarVistaMS();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        control.mostrarVistaCES();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void comboProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboProvinciaActionPerformed

    private void comboServiciosPrestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboServiciosPrestadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboServiciosPrestadosActionPerformed

    private void comboPrestadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPrestadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboPrestadorActionPerformed

    private void comboPrestadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPrestadorItemStateChanged
      if(comboPrestador.getSelectedIndex()>-1){
           control.ponerServiciosPrestados(comboPrestador.getSelectedIndex());
       }
    }//GEN-LAST:event_comboPrestadorItemStateChanged

    public String getNombre(){
        return campoNombre.getText();
    }
    
    public String getDescripcion(){
        return campoDescripcion.getText();
    }
    
    public String getItinerario(){
        return campoItinerario.getText();
    }
    
    public int getDias(){
        return Integer.parseInt(campoDias.getText());
    }
    
    public int getNoches(){
        return Integer.parseInt(campoNoches.getText());
    }
    
    public String getCC(){
        return txtCC.getText();
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(vistaCrearPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(vistaCrearPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(vistaCrearPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(vistaCrearPaquete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new vistaCrearPaquete().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarSer;
    private javax.swing.JButton botonCP;
    private javax.swing.JButton botonDestino;
    private javax.swing.JButton botonOrigen;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JTextField campoDias;
    private javax.swing.JTextField campoItinerario;
    private javax.swing.JTextField campoNoches;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox comboCiudad;
    private javax.swing.JComboBox comboPF;
    private javax.swing.JComboBox comboPais;
    private javax.swing.JComboBox comboPrestador;
    private javax.swing.JComboBox comboProvincia;
    private javax.swing.JComboBox comboRubro;
    private javax.swing.JComboBox comboServicio;
    private javax.swing.JComboBox comboServiciosPrestados;
    private javax.swing.JComboBox comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JTable tablaDestinos;
    private javax.swing.JTable tablaServicios;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtCupo;
    private javax.swing.JTextField txtDesde;
    private javax.swing.JTextField txtHasta;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    public void ponerPaises(ArrayList<Pais> paises) {
        comboPais.removeAllItems();
        for (Pais p : paises){
            comboPais.addItem(p.getNombre());
        }
        comboPais.setSelectedIndex(0);
       // ponerProvincias();
    }

    public void ponerProvincias(ArrayList<Provincia> provincias) {
       comboProvincia.removeAllItems();
        for (Provincia p : provincias){
            comboProvincia.addItem(p.getNombre());
        }
        comboProvincia.setSelectedIndex(0);
    }
    public void ponerPF(ArrayList<PasoFronterizo> pasosFronterizos) {
        comboPF.removeAllItems();
        for(PasoFronterizo pf : pasosFronterizos){
            comboPF.addItem(pf.getNombre());
        }
        comboPF.setSelectedIndex(0);
    }
    public void ponerCiudades(ArrayList<Ciudad> ciudades) {
        comboCiudad.removeAllItems();
       for (Ciudad c : ciudades){
           comboCiudad.addItem(c.getNombre());
       }
    }
    
 
    public void ponerOrigen(String nombre) {
        lblOrigen.setText(nombre);
    }

    public void mostrarDestinos(DefaultTableModel m) {
       tablaDestinos.setModel(m);
    }

    public void ponerRubros(ArrayList<Rubro> rubros) {
        comboRubro.removeAllItems();
        for(Rubro r : rubros){
            comboRubro.addItem(r.getDescripcion());        
        }
        comboRubro.setSelectedIndex(0);
    }

    public void ponerTipos(ArrayList<Tipo> tipos) {
        comboTipo.removeAllItems();
        for(Tipo t : tipos){
            comboTipo.addItem(t.getDescripcion());
        }
        comboTipo.setSelectedIndex(0);
    }

    public void ponerServicios(ArrayList<Servicio> servicios) {
        comboServicio.removeAllItems();
        for(Servicio s : servicios){
            comboServicio.addItem(s.getDescripcion());
        }
        comboServicio.setSelectedIndex(0);
    }

    public void ponerPrestadores(ArrayList<Prestador> prestadores) {
        comboPrestador.removeAllItems();
        for(Prestador p : prestadores){
            comboPrestador.addItem(p.getRazonSocial());  
        }
        comboPrestador.setSelectedIndex(0);
    }

    public void ponerServiciosPrestados(ArrayList<ServicioPrestado> serviciosPrestados) {
        comboServiciosPrestados.removeAllItems();
        for(ServicioPrestado sp : serviciosPrestados){
            comboServiciosPrestados.addItem(sp.getNombre());
        }
        comboServiciosPrestados.setSelectedIndex(0);
    }

    public void limpiar() {
        txtCupo.setText("");
        txtPrecio.setText("");
        txtDesde.setText("");
        txtHasta.setText("");
    }

    public void mostrarServicios(ArrayList<ServicioPaquete> serviciosPaq) {
        DefaultTableModel matriz = new DefaultTableModel();
        matriz.addColumn("Rubro");
        matriz.addColumn("Tipo");
        matriz.addColumn("Servicio");
        matriz.addColumn("Desde");
        matriz.addColumn("Hasta");
        matriz.addColumn("Cupo");
        matriz.addColumn("Precio");
        matriz.addColumn("Servicio Prestado");
        matriz.addColumn("Prestador");
        for(ServicioPaquete s : serviciosPaq){
            matriz.addRow(new Object[]{
                s.getServicio().getTipo().getRubro().getDescripcion(),
                s.getServicio().getTipo().getDescripcion(),
                s.getServicio().getDescripcion(),
                s.getDesde(),
                s.getHasta(),
                s.getServicioSalida().getCupo(),
                s.getServicioSalida().getPrecio(),
                s.getServicioSalida().getServicioPrestado().getNombre(),
                s.getServicioSalida().getServicioPrestado().getPrestador().getRazonSocial(),
            });
        }
        tablaServicios.setModel(matriz);
    }


}
