/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.desktravel.ui;

import com.duoc.desktravel.entity.Colegio;
import com.duoc.desktravel.util.HibernateUtil;
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
public class RegistrarCurso extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarCurso
     */
    public RegistrarCurso() {
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

        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultado = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        rsltArea = new javax.swing.JTextArea();

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        tblResultado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblResultado);

        rsltArea.setColumns(20);
        rsltArea.setRows(5);
        jScrollPane2.setViewportView(rsltArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
         String query = "from Comuna";        
         List res = executeHQLQuery(query);
         rsltArea.setText(res.toString());
                 

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
    }//GEN-LAST:event_btnEnviarActionPerformed

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
    tblResultado.setModel(new DefaultTableModel(tableData, tableHeaders));
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea rsltArea;
    private javax.swing.JTable tblResultado;
    // End of variables declaration//GEN-END:variables
}