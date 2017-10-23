/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.duoc.desktravel.controller;

import com.duoc.desktravel.model.Colegio;
import com.duoc.desktravel.model.Conector;
import com.duoc.desktravel.model.Curso;
import com.duoc.desktravel.util.HibernateUtil;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import static java.security.spec.MGF1ParameterSpec.SHA1;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Convert;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import static javax.xml.crypto.dsig.DigestMethod.SHA1;
import oracle.jdbc.OracleTypes;
import org.apache.commons.codec.binary.Hex;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;

/**
 *
 * @author Integer
 */
public class LoginController {
    
    private Curso cursoModel;
    private Colegio colegioModel;
    private Connection conn;
    
    public LoginController() {
        this.cursoModel = new Curso();
        Conector conect = new Conector();
        this.conn = conect.getDBConnection();
    }
    
    public ArrayList autenticar(String user,String password) {
        String command = "{call OBTENER_CUENTA_BYNOM(?,?)}";
        CallableStatement cstmt;
        try {
            ArrayList arr = new ArrayList<>();
            cstmt = conn.prepareCall(command);
            cstmt.registerOutParameter(1,OracleTypes.CURSOR);
            cstmt.setString(2,user);
            cstmt.execute();
            ResultSet rs = (ResultSet) cstmt.getObject(1);
            String pass = "";
            String perfil = "";
            while (rs.next()) {
                pass = rs.getString("CONTRASENA");
                perfil = rs.getString("DESCRIPCION");
            }
            cstmt.close();
            arr.add(0, user);
            arr.add(1, perfil);
//            String key = "123456";
//            MessageDigest cript = MessageDigest.getInstance("SHA-1");
//              cript.reset();
//              cript.update(key.getBytes("utf8"));
//              key = new String(cript.digest());
//            String trap = new String(Hex.encodeHex(key.digest()),
//                             CharSet.forName("UTF-8"));
//            System.out.println("Contra : "+pass);
            
            if (!password.equals(pass)) {
                arr.add(2,1);
                return arr;
            }else{
                arr.add(2,-1);
                return arr;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(CursoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList();
        }
    }
    
  
    
    
    
    
}
