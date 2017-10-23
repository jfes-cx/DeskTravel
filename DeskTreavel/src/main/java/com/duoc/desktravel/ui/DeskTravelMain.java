/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.desktravel.ui;

import java.awt.event.ComponentEvent;

/**
 *
 * @author Agustín
 */
public class DeskTravelMain extends javax.swing.JFrame {

    /**
     * Creates new form deskTravelMain
     */
    public DeskTravelMain() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public DeskTravelMain(int idUsuario) {   
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraEstado = new javax.swing.JPanel();
        lblEstadoCuenta = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        btnDesconectar = new javax.swing.JButton();
        barraMenuSuperior = new javax.swing.JMenuBar();
        mMantenedores = new javax.swing.JMenu();
        miRegistrarCurso = new javax.swing.JMenuItem();
        miClientes = new javax.swing.JMenuItem();
        miDestinos = new javax.swing.JMenuItem();
        miTipos = new javax.swing.JMenuItem();
        mContratos = new javax.swing.JMenu();
        mSeguros = new javax.swing.JMenu();
        mReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(905, 580));

        lblEstadoCuenta.setText("Bienvenido Administrador - Juan Francisco ");

        javax.swing.GroupLayout barraEstadoLayout = new javax.swing.GroupLayout(barraEstado);
        barraEstado.setLayout(barraEstadoLayout);
        barraEstadoLayout.setHorizontalGroup(
            barraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraEstadoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblEstadoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraEstadoLayout.setVerticalGroup(
            barraEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEstadoCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        escritorio.setPreferredSize(new java.awt.Dimension(905, 580));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 905, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnDesconectar.setText("Desconectar");
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });

        mMantenedores.setText("Mantenedores");

        miRegistrarCurso.setText("Registrar Curso");
        miRegistrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRegistrarCursoActionPerformed(evt);
            }
        });
        mMantenedores.add(miRegistrarCurso);

        miClientes.setText("Clientes");
        miClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesActionPerformed(evt);
            }
        });
        mMantenedores.add(miClientes);

        miDestinos.setText("Destinos");
        miDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDestinosActionPerformed(evt);
            }
        });
        mMantenedores.add(miDestinos);

        miTipos.setText("Tipos");
        miTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miTiposActionPerformed(evt);
            }
        });
        mMantenedores.add(miTipos);

        barraMenuSuperior.add(mMantenedores);

        mContratos.setText("Contratos");
        barraMenuSuperior.add(mContratos);

        mSeguros.setText("Seguros");
        barraMenuSuperior.add(mSeguros);

        mReportes.setText("Reportes");
        barraMenuSuperior.add(mReportes);

        setJMenuBar(barraMenuSuperior);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDesconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barraEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDesconectar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miRegistrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRegistrarCursoActionPerformed
        RegistrarCurso regcur = new RegistrarCurso(escritorio);
        escritorio.add(regcur);
        regcur.setVisible(true);
    }//GEN-LAST:event_miRegistrarCursoActionPerformed

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
        MantenedorClientes mancli = new MantenedorClientes(escritorio);
        escritorio.add(mancli);
        mancli.setVisible(true);
    }//GEN-LAST:event_miClientesActionPerformed

    private void miDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDestinosActionPerformed
        MantenedorDestinos mandest = new MantenedorDestinos(escritorio);
        escritorio.add(mandest);
        mandest.setVisible(true);
    }//GEN-LAST:event_miDestinosActionPerformed

    private void miTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miTiposActionPerformed
        MantenedorTipos mantipos = new MantenedorTipos(escritorio);
        escritorio.add(mantipos);
        mantipos.setVisible(true);
    }//GEN-LAST:event_miTiposActionPerformed

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDesconectarActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraEstado;
    private javax.swing.JMenuBar barraMenuSuperior;
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel lblEstadoCuenta;
    private javax.swing.JMenu mContratos;
    private javax.swing.JMenu mMantenedores;
    private javax.swing.JMenu mReportes;
    private javax.swing.JMenu mSeguros;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miDestinos;
    private javax.swing.JMenuItem miRegistrarCurso;
    private javax.swing.JMenuItem miTipos;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables



}
