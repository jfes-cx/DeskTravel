/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.desktravel.controller;

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
import oracle.jdbc.OracleTypes;

/**
 *
 * @author Integer
 */
public class CursoController {
    
  
    private Curso cursoModel;
    private Colegio colegioModel;
    private Connection conn;
    
    public CursoController(JInternalFrame frame) {
        this.cursoModel = new Curso();
        Conector conect = new Conector();
        this.conn = conect.getDBConnection();
    }
    public CursoController() {
        this.cursoModel = new Curso();
        Conector conect = new Conector();
        this.conn = conect.getDBConnection();
    }

    public void cargarListaColegios(JList<Colegio> list) {
        DefaultListModel<Colegio> listModel = new DefaultListModel<>();
        String command = "{call GET_COLEGIOS(?)}";
        CallableStatement cstmt;
        try {
            cstmt = conn.prepareCall(command);
            cstmt.registerOutParameter(1,OracleTypes.CURSOR);
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) { 
                Colegio col  =  new Colegio();
                col.setNombre(rs.getString("NOMBRE"));
                col.setDireccion(rs.getString("DIRECCION"));
                col.setTelefono(rs.getBigDecimal("TELEFONO"));
                col.setIdcolegio(rs.getBigDecimal("IDCOLEGIO"));
                listModel.addElement(col);
            }
            cstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.setModel(listModel);
    }

    public void cargarListaCursos(JList<Curso> list,BigDecimal idColegio){
        DefaultListModel<Curso> listModel = new DefaultListModel<>();
        String command = "{call OBTENER_CURSO_BYCOL(?,?)}";
        CallableStatement cstmt;
        try {
            cstmt = conn.prepareCall(command);
            cstmt.registerOutParameter(1,OracleTypes.CURSOR);
            cstmt.setInt(2,idColegio.intValueExact());
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) { 
                Curso cur  =  new Curso();
                cur.setNombre(rs.getString("NOMBRE"));
                cur.setIdcurso(rs.getBigDecimal("IDCURSO"));
                cur.setProfesorjefe(rs.getString("PROFESORJEFE"));
                listModel.addElement(cur);
            }
            cstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        list.setModel(listModel);
    }
    
    public void cargarComboRegion(JComboBox<Region> cmbRegion){
        DefaultComboBoxModel<Region> cmbModel = new DefaultComboBoxModel<>();
        String command = "{call OBTENER_REGION(?)}";
        CallableStatement cstmt;
        try {
            cstmt = conn.prepareCall(command);
            cstmt.registerOutParameter(1,OracleTypes.CURSOR);
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) { 
                Region reg = new Region();
                reg.setIdregion(rs.getBigDecimal("IDREGION"));
                reg.setNombre(rs.getString("NOMBRE"));
                cmbModel.addElement(reg);
            }
            cstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        cmbRegion.setModel(cmbModel);
    }
    
    public Boolean actualizarListaColegio(String nombre,String direccion, String telefono,Comuna comuna,JList<Colegio> lista){
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);
        try {
            BigDecimal tel = (BigDecimal) decimalFormat.parse(telefono);
            String command = "{call INSERT_COLEGIO(?,?,?,?,?)}";
        CallableStatement cstmt;
        try {
            cstmt = conn.prepareCall(command);
            cstmt.registerOutParameter(1,OracleTypes.NUMBER);
            cstmt.setString(2,nombre);
            cstmt.setString(3,direccion);
            cstmt.setString(4,telefono);
            cstmt.setInt(5,comuna.getIdcomuna().intValueExact());
            cstmt.execute();
            BigDecimal rs = cstmt.getBigDecimal(1);
            cstmt.close();
            Colegio col  =  new Colegio();
            col.setNombre(nombre);
            col.setDireccion(nombre);
            col.setTelefono(tel);
            col.setComuna(comuna);
            col.setIdcolegio(rs);
            System.out.println("ID COLEGIO: "+rs);
            ((DefaultListModel)lista.getModel()).addElement(col);
        } catch (SQLException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return true;
        } catch (ParseException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public void actualizarComunas(BigDecimal idregion, JComboBox<Comuna> cmbComuna) {
       DefaultComboBoxModel<Comuna> cmbModel = new DefaultComboBoxModel<>();
       String command = "{call OBTENER_COMUNA_BYREG(?,?)}";
        CallableStatement cstmt;
        try {
            System.out.println("ID REGION :"+idregion);
            cstmt = conn.prepareCall(command);
            cstmt.registerOutParameter(1,OracleTypes.CURSOR);
            cstmt.setInt(2,idregion.intValueExact());
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            while (rs.next()) { 
                Comuna com = new Comuna();
                com.setIdcomuna(rs.getBigDecimal("IDCOMUNA"));
                System.out.println("IDCOMUNA :"+rs.getBigDecimal("IDCOMUNA"));
                com.setNombre(rs.getString("NOMBRE"));
                System.out.println("NOMBRE :"+rs.getString("NOMBRE"));
                cmbModel.addElement(com);
            }
            cstmt.close();
            cmbComuna.removeAllItems();
            cmbComuna.setModel(cmbModel);
        } catch (SQLException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    public Boolean actualizarListaCurso(String nombre, String profeJefe,Colegio colegio ,JList<Curso> listCursos) {

        String command = "{call INSERT_CURSO(?,?,?,?)}";
        CallableStatement cstmt;
        try {
            cstmt = conn.prepareCall(command);
            cstmt.registerOutParameter(1,OracleTypes.NUMBER);
            cstmt.setString(2,nombre);
            cstmt.setString(3,profeJefe);
            cstmt.setInt(4,colegio.getIdcolegio().intValueExact());
            cstmt.execute();
            BigDecimal rs = cstmt.getBigDecimal(1);
            cstmt.close();
            Curso cur =  new Curso();
            cur.setNombre(nombre);
            cur.setProfesorjefe(profeJefe);
            cur.setColegio(colegio);
            cur.setIdcurso(rs);
            System.out.println("ID Curso: "+rs);
            ((DefaultListModel)listCursos.getModel()).addElement(cur);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return false;
    }
}
