/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.desktravel.controller;

import com.duoc.desktravel.model.Alumno;
import com.duoc.desktravel.model.Colegio;
import com.duoc.desktravel.model.Comuna;
import com.duoc.desktravel.model.Conector;
import com.duoc.desktravel.model.Curso;
import com.duoc.desktravel.model.Region;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Integer
 */
public class AlumnoController {
    
  
    private Curso cursoModel;
    private Colegio colegioModel;
    private Connection conn;
    
    public AlumnoController(JInternalFrame frame) {
        this.cursoModel = new Curso();
        Conector conect = new Conector();
        this.conn = conect.getDBConnection();
    }
    public AlumnoController() {
        this.cursoModel = new Curso();
        Conector conect = new Conector();
        this.conn = conect.getDBConnection();
    }

    public Boolean cargarTablaAlumnos(BigDecimal idCurso, JTable tblAlumnos){
        Object[][] data = {{}};
        String[] columnNames = {"Nombre","RUT","Correo","Apoderado"};
       DefaultTableModel defTableModel = new DefaultTableModel(data,columnNames);
        String command = "{call OBTENER_ALUMNO_BYCUR(?,?)}";
        CallableStatement cstmt;
        try {
            cstmt = conn.prepareCall(command);
            cstmt.registerOutParameter(1,OracleTypes.CURSOR);
            cstmt.setInt(2,idCurso.intValueExact());
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) { 
                Object[] newRowData = {rs.getString("NOMBRE"),rs.getString("RUT"),rs.getString("CORREOELECTRONICO"),rs.getString("NOMBREAPODERADO")};
                defTableModel.addRow(newRowData);
            }
            cstmt.close();
            tblAlumnos.setModel(defTableModel);
            return true;
        
        } catch (SQLException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;
    }

    public Boolean actualizarTablaAlumnos(String nombre, String direccion, String telefono, String correo, String rut,BigDecimal idCurso, JTable tblAlumnos) {
        
        String command = "{call INSERT_ALUMNO(?,?,?,?,?,?,?,?)}";
        CallableStatement cstmt;
        try {
            cstmt = conn.prepareCall(command);
            cstmt.registerOutParameter(1,OracleTypes.NUMBER);
            cstmt.setString(2,nombre);
            cstmt.setString(3,direccion);
            cstmt.setString(4,telefono);
            cstmt.setString(5,correo);
            cstmt.setString(6,rut);
            cstmt.setInt(7,21);
            cstmt.setInt(8,idCurso.intValueExact());
            cstmt.execute();
            BigDecimal rs = cstmt.getBigDecimal(1);
            cstmt.close();
            Object[] newRowData = {nombre,rut,correo,"Mario Valderrama"};
            DefaultTableModel defTableModel = (DefaultTableModel)  tblAlumnos.getModel();
            defTableModel.addRow(newRowData);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;
    }

}
