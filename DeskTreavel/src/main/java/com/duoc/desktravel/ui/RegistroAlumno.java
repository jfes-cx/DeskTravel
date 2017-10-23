/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.desktravel.ui;

import com.duoc.desktravel.controller.CursoController;
import com.duoc.desktravel.model.Colegio;
import com.duoc.desktravel.model.Curso;
import com.duoc.desktravel.util.HibernateUtil;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Agustín
 */
public class RegistroAlumno extends javax.swing.JInternalFrame {
    private CursoController cursocon = new CursoController();
    private Curso curso;

    /**
     * Creates new form RegistrarCurso
     */
    public RegistroAlumno() {
        initComponents();
    }
    
    /**
     * Creates new form RegistrarCurso
     */
    public RegistroAlumno(Curso curso) {
        initComponents();
        iniciarComponentes(curso);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTerminar = new javax.swing.JButton();
        pnlRegistro = new javax.swing.JPanel();
        lblRegistroAl = new javax.swing.JLabel();
        lblNomAlumno = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDirAlumno = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblCorrAlumno = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblTelAlumno = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(852, 456));

        btnTerminar.setText("Terminar");
        btnTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminarActionPerformed(evt);
            }
        });

        lblRegistroAl.setText("Registro de Alumno");

        lblNomAlumno.setText("Nombre:");

        lblDirAlumno.setText("Dirección:");

        lblCorrAlumno.setText("Correo:");

        lblTelAlumno.setText("Telefono:");

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblAlumnos);

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistroLayout = new javax.swing.GroupLayout(pnlRegistro);
        pnlRegistro.setLayout(pnlRegistroLayout);
        pnlRegistroLayout.setHorizontalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNomAlumno)
                        .addGroup(pnlRegistroLayout.createSequentialGroup()
                            .addComponent(lblTelAlumno)
                            .addGap(18, 18, 18)
                            .addComponent(txtTel))
                        .addGroup(pnlRegistroLayout.createSequentialGroup()
                            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDirAlumno)
                                .addComponent(lblCorrAlumno))
                            .addGap(18, 18, 18)
                            .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(lblRegistroAl))
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE))
        );
        pnlRegistroLayout.setVerticalGroup(
            pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistroAl)
                .addGap(18, 18, 18)
                .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRegistroLayout.createSequentialGroup()
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomAlumno)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDirAlumno)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorrAlumno)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelAlumno)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)
                        .addContainerGap())
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(751, Short.MAX_VALUE)
                .addComponent(btnTerminar)
                .addContainerGap())
            .addComponent(pnlRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTerminar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminarActionPerformed
         String query = "from Comuna";        
         List res = executeHQLQuery(query);
         //rsltArea.setText(res.toString());
                 

        /*
        // start transaction
        session.beginTransaction();

        // create invitation Object
        Colegio col = new Colegio();
        //col.setComuna();
        col.setDireccion("Nuena imperial 555");
        col.setNombre("Colegio Nuevo");
        col.setTelefono(new BigDecimal(5569));

        // Save the colitation to database
        session.save(col);

        // Commit the transaction
        session.getTransaction().commit();*/
    }//GEN-LAST:event_btnTerminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private List executeHQLQuery(String hql) {
    try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query q = session.createQuery(hql);
        List resultList = q.list();
        //displayResult(resultList);
        session.getTransaction().commit();
        return resultList;
    } catch (HibernateException he) {
        List lst = new ArrayList();
        lst.add(he);
        return lst;
    }
}
    
    private void displayResult(List resultList) {
    Vector<String> tableHeaders = new Vector<String>();
    Vector tableData = new Vector();
    tableHeaders.add("Comuna"); 
    tableHeaders.add("Direccion");
    tableHeaders.add("IdColegio");
    tableHeaders.add("Nombre");

    for(Object o : resultList) {
        Colegio colegio = (Colegio)o;
        Vector<Object> oneRow = new Vector<Object>();
        oneRow.add(colegio.getComuna());
        oneRow.add(colegio.getDireccion());
        oneRow.add(colegio.getIdcolegio());
        oneRow.add(colegio.getNombre());
        tableData.add(oneRow);
    }
    //tblResultado.setModel(new DefaultTableModel(tableData, tableHeaders));
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnTerminar;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCorrAlumno;
    private javax.swing.JLabel lblDirAlumno;
    private javax.swing.JLabel lblNomAlumno;
    private javax.swing.JLabel lblRegistroAl;
    private javax.swing.JLabel lblTelAlumno;
    private javax.swing.JPanel pnlRegistro;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    private void iniciarComponentes(Curso curso) {
        lblRegistroAl.setText(lblRegistroAl.getText()+" "+curso.getNombre());
        cursocon.cargarTablaAlumnos(curso.getIdcurso(),tblAlumnos);
    }
}
