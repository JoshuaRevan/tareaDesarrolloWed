/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.swing.controlnotas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author verri
 */
public class ControlNotas extends javax.swing.JFrame {
     
    /**
     * Creates new form ControlNotas
     */
    public ControlNotas() {
       initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNombre = new javax.swing.JTextField();
        tfCUM = new javax.swing.JTextField();
        lbMateria = new javax.swing.JLabel();
        lbUV = new javax.swing.JLabel();
        lbNota = new javax.swing.JLabel();
        cbCarrera = new javax.swing.JComboBox<>();
        cbCiclo = new javax.swing.JComboBox<>();
        cbMateria1 = new javax.swing.JComboBox<>();
        cbUV1 = new javax.swing.JComboBox<>();
        tfNota1 = new javax.swing.JTextField();
        lbMensaje = new javax.swing.JLabel();
        lbEstado1 = new javax.swing.JLabel();
        cbMateria2 = new javax.swing.JComboBox<>();
        cbMateria3 = new javax.swing.JComboBox<>();
        cbMateria4 = new javax.swing.JComboBox<>();
        cbMateria5 = new javax.swing.JComboBox<>();
        cbUV2 = new javax.swing.JComboBox<>();
        cbUV3 = new javax.swing.JComboBox<>();
        cbUV4 = new javax.swing.JComboBox<>();
        cbUV5 = new javax.swing.JComboBox<>();
        tfNota2 = new javax.swing.JTextField();
        tfNota3 = new javax.swing.JTextField();
        tfNota4 = new javax.swing.JTextField();
        tfNota5 = new javax.swing.JTextField();
        lbEstado2 = new javax.swing.JLabel();
        lbEstado3 = new javax.swing.JLabel();
        lbEstado4 = new javax.swing.JLabel();
        lbEstado5 = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();
        lbNombre = new javax.swing.JLabel();
        lbCarrera = new javax.swing.JLabel();
        lbCiclo = new javax.swing.JLabel();
        lbCUM = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombreActionPerformed(evt);
            }
        });
        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombreKeyTyped(evt);
            }
        });

        tfCUM.setEditable(false);

        lbMateria.setText("Materia");

        lbUV.setText("UV");

        lbNota.setText("Nota");

        cbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "Ing. En Sistemas Computacionales" }));
        cbCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCarreraActionPerformed(evt);
            }
        });

        cbCiclo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "Ciclo 02" }));

        cbMateria1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "Base de Datos II", "Desarro de Software I", "Electronica", "Investigación de Operaciones I", "Legislación Aplicada a la Empresa" }));

        cbUV1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "3", "4" }));

        tfNota1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNota1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNota1KeyTyped(evt);
            }
        });

        lbEstado1.setText("Estado");

        cbMateria2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "Base de Datos II", "Desarro de Software I", "Electronica", "Investigación de Operaciones I", "Legislación Aplicada a la Empresa" }));

        cbMateria3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "Base de Datos II", "Desarro de Software I", "Electronica", "Investigación de Operaciones I", "Legislación Aplicada a la Empresa" }));

        cbMateria4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "Base de Datos II", "Desarro de Software I", "Electronica", "Investigación de Operaciones I", "Legislación Aplicada a la Empresa" }));

        cbMateria5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "Base de Datos II", "Desarro de Software I", "Electronica", "Investigación de Operaciones I", "Legislación Aplicada a la Empresa" }));

        cbUV2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "3", "4" }));

        cbUV3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "3", "4" }));

        cbUV4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "3", "4" }));

        cbUV5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir una opción", "3", "4" }));

        tfNota2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNota2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNota2KeyTyped(evt);
            }
        });

        tfNota3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNota3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNota3KeyTyped(evt);
            }
        });

        tfNota4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNota4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNota4KeyTyped(evt);
            }
        });

        tfNota5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNota5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNota5KeyTyped(evt);
            }
        });

        lbEstado2.setText("Estado");

        lbEstado3.setText("Estado");

        lbEstado4.setText("Estado");

        lbEstado5.setText("Estado");

        lbTitulo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbTitulo.setText("Control de Notas");

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        lbNombre.setText("Nombre");

        lbCarrera.setText("Carrera");

        lbCiclo.setText("Ciclo");

        lbCUM.setText("CUM");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(282, 91));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(lbMateria)
                                        .addGap(113, 113, 113)
                                        .addComponent(lbUV)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tfCUM, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(lbNota))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbUV1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbUV2, 0, 1, Short.MAX_VALUE)
                                                    .addComponent(cbUV3, 0, 1, Short.MAX_VALUE))))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfNota1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                                .addComponent(tfNota2))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbUV4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbUV5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbEstado1)
                                    .addComponent(lbEstado2)
                                    .addComponent(lbEstado3)
                                    .addComponent(lbEstado4)
                                    .addComponent(lbEstado5)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(lbNombre)
                .addGap(99, 99, 99)
                .addComponent(lbCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCiclo)
                .addGap(95, 95, 95)
                .addComponent(lbCUM)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(lbCarrera)
                    .addComponent(lbCiclo)
                    .addComponent(lbCUM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfCUM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCiclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbUV)
                                        .addComponent(lbNota))
                                    .addComponent(lbMateria))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbUV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEstado1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbEstado2)
                                    .addComponent(tfNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbUV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMateria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbMateria3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbUV3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEstado3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbMateria4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbUV4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbEstado4)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMateria5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUV5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEstado5))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(lbMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        // TODO add your handling code here:
        String carrera = "";
        String ciclo = "";
        String nota = "";
        int uv1,uv2,uv3,uv4,uv5;
        int reprobado=0,aprobado=0;
        float cum;
        float nota1,nota2,nota3,nota4,nota5;
        
        String carreraSeleccionada = (String) cbCarrera.getSelectedItem();
        String cicloSeleccionado = (String) cbCiclo.getSelectedItem();
        String materia1 = (String) cbMateria1.getSelectedItem();
        String materia2 = (String) cbMateria2.getSelectedItem();
        String materia3 = (String) cbMateria3.getSelectedItem();
        String materia4 = (String) cbMateria4.getSelectedItem();
        String materia5 = (String) cbMateria5.getSelectedItem();
        String num1 = tfNota1.getText();
        String num2 = tfNota2.getText();
        String num3 = tfNota3.getText();
        String num4 = tfNota4.getText();
        String num5 = tfNota5.getText();
        String nombre = tfNombre.getText();
        String UVmateria1 = (String) cbUV1.getSelectedItem();
        String UVmateria2 = (String) cbUV2.getSelectedItem();
        String UVmateria3 = (String) cbUV3.getSelectedItem();
        String UVmateria4 = (String) cbUV4.getSelectedItem();
        String UVmateria5 = (String) cbUV5.getSelectedItem();
       
        // Llenar los campos que se piden
        if("Elegir una opción".equals(carreraSeleccionada) || "Elegir una opción".equals(cicloSeleccionado) 
                ||"Elegir una opción".equals(materia1) || "Elegir una opción".equals(materia2) || "Elegir una opción".equals(materia3)
                || "Elegir una opción".equals(materia4) || "Elegir una opción".equals(materia5) || "Elegir una opción".equals(UVmateria1)
                || "Elegir una opción".equals(UVmateria2) || "Elegir una opción".equals(UVmateria3) || "Elegir una opción".equals(UVmateria4)
                || "Elegir una opción".equals(UVmateria5) ||num1.isEmpty() || num2.isEmpty() || num3.isEmpty() || num4.isEmpty() || num5.isEmpty() || nombre.isEmpty()) {
            carrera = "-1";
            ciclo = "-1";
            
            JOptionPane.showMessageDialog(this, "Llene todos los campos solicitados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        // Convertir string a int y a float con un parseo
        nota1 = Float.parseFloat(num1); 
        nota2 = Float.parseFloat(num2); 
        nota3 = Float.parseFloat(num3); 
        nota4 = Float.parseFloat(num4); 
        nota5 = Float.parseFloat(num5); 
        uv1 = Integer.parseInt(UVmateria1);
        uv2 = Integer.parseInt(UVmateria2);
        uv3 = Integer.parseInt(UVmateria3);
        uv4 = Integer.parseInt(UVmateria4);
        uv5 = Integer.parseInt(UVmateria5);
        
        
        //Validar que las notas sean mayores a 0 y menores a 10
        if(!(nota1 <= 10) || !(nota1 >= 0) || !(nota2 <= 10) || !(nota2 >= 0) || !(nota3 <= 10) || !(nota3 >= 0) || !(nota4 <= 10) || !(nota4 >= 0)
                || !(nota5 <= 10) || !(nota5 >= 0)){
           nota = "-1";
           JOptionPane.showMessageDialog(this, "Ingrese un dato válido en notas.", "Error", JOptionPane.ERROR_MESSAGE);
        }
       
        // Mostrar Resultado 
        if(!"-1".equals(carrera) && !"-1".equals(ciclo) && !"-1".equals(nota)){
            
            //Le quitamos lo transparente que tiene por defecto a JLabel.
            lbEstado1.setOpaque(true);
            lbEstado2.setOpaque(true);
            lbEstado3.setOpaque(true);
            lbEstado4.setOpaque(true);
            lbEstado5.setOpaque(true);
            
             // Cambiar estado a Reprobado o Aprobado
        if(nota1 < 6){
            lbEstado1.setText("Reprobado");
            lbEstado1.setBackground(Color.red);
            reprobado++;
        }else{
            lbEstado1.setText("Aprobado");
            lbEstado1.setBackground(Color.green);
            aprobado++;
        }
        if(nota2 < 6){
            lbEstado2.setText("Reprobado");
            lbEstado2.setBackground(Color.red);
            reprobado++;
        }else{
            lbEstado2.setText("Aprobado");
            lbEstado2.setBackground(Color.green);
            aprobado++;
        }
        if(nota3 < 6){
            lbEstado3.setText("Reprobado");
            lbEstado3.setBackground(Color.red);
            reprobado++;
        }else{
            lbEstado3.setText("Aprobado");
            lbEstado3.setBackground(Color.green);
            aprobado++;
        }
        if(nota4 < 6){
            lbEstado4.setText("Reprobado");
            lbEstado4.setBackground(Color.red);
            reprobado++;
        }else{
            lbEstado4.setText("Aprobado");
            lbEstado4.setBackground(Color.green);
            aprobado++;
        }
        if(nota5 < 6){
            lbEstado5.setText("Reprobado");
            lbEstado5.setBackground(Color.red);
            reprobado++;
        }else{
            lbEstado5.setText("Aprobado");
            lbEstado5.setBackground(Color.green);
            aprobado++;
        }
        
        //Cálculo del CUM
        cum = ((nota1*uv1)+(nota2*uv2)+(nota3*uv3)+(nota4*uv4)+(nota5*uv5))/(uv1+uv2+uv3+uv4+uv5);
        
        // Convertir double e int a string
        String TotalCum = Float.toString(cum);
        String MateriasAprobadas = Integer.toString(aprobado);
        String MateriasReprobadas = Integer.toString(reprobado);
        
            tfCUM.setText(TotalCum);
            
            lbMensaje.setText(this.tfNombre.getText()
                + " su estado actual es de "
                + MateriasAprobadas
                + " materias aprobadas y "
                + MateriasReprobadas
                + " reprobadas y su CUM actual es de "
                + this.tfCUM.getText());
        }
    }//GEN-LAST:event_btCalcularActionPerformed
    
    // Validaciones para que solo se puedan ingresar numeros o letras en el campo correspondiente
 
    private void tfNota1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNota1KeyTyped
        // TODO add your handling code here:
        // Cada vez que el usuario presione una tecla se genera un evento y se almacena en evt
        char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_tfNota1KeyTyped

    private void tfNota2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNota2KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_tfNota2KeyTyped

    private void tfNota3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNota3KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_tfNota3KeyTyped

    private void tfNota4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNota4KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_tfNota4KeyTyped

    private void tfNota5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNota5KeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_tfNota5KeyTyped

    private void tfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyTyped
       
        // KeyTyped = evento de tecla
         char c = evt.getKeyChar(); // obteniendo el carácter ingresado desde el evento de tecla (evt). getKeyChar()
                                    // Devuelve el caracter de la tecla que se presionó
        if((c<'a' || c>'z') && (c<'A' || c>'Z') //Verifica si el carácter está fuera del rango de letras minúsculas y mayúsculas.
                && !(Character.isSpaceChar(c))) //Verifica si el carácter no es un espacio.
            evt.consume(); // Si el carácter ingresado no es una letra ni un espacio, este comando consume el evento de tecla
                           // así que no se mostrará en el campo de texto
    }//GEN-LAST:event_tfNombreKeyTyped

    private void cbCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCarreraActionPerformed

    private void tfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JComboBox<String> cbCarrera;
    private javax.swing.JComboBox<String> cbCiclo;
    private javax.swing.JComboBox<String> cbMateria1;
    private javax.swing.JComboBox<String> cbMateria2;
    private javax.swing.JComboBox<String> cbMateria3;
    private javax.swing.JComboBox<String> cbMateria4;
    private javax.swing.JComboBox<String> cbMateria5;
    private javax.swing.JComboBox<String> cbUV1;
    private javax.swing.JComboBox<String> cbUV2;
    private javax.swing.JComboBox<String> cbUV3;
    private javax.swing.JComboBox<String> cbUV4;
    private javax.swing.JComboBox<String> cbUV5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCUM;
    private javax.swing.JLabel lbCarrera;
    private javax.swing.JLabel lbCiclo;
    private javax.swing.JLabel lbEstado1;
    private javax.swing.JLabel lbEstado2;
    private javax.swing.JLabel lbEstado3;
    private javax.swing.JLabel lbEstado4;
    private javax.swing.JLabel lbEstado5;
    private javax.swing.JLabel lbMateria;
    private javax.swing.JLabel lbMensaje;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNota;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUV;
    private javax.swing.JTextField tfCUM;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNota1;
    private javax.swing.JTextField tfNota2;
    private javax.swing.JTextField tfNota3;
    private javax.swing.JTextField tfNota4;
    private javax.swing.JTextField tfNota5;
    // End of variables declaration//GEN-END:variables

    private boolean isNumeric(float nota1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}