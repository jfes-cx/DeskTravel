/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duoc.desktravel.controller;

import com.duoc.desktravel.model.Colegio;
import com.duoc.desktravel.model.Curso;
import com.duoc.desktravel.util.HibernateUtil;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import oracle.jdbc.OracleTypes;
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
    
    public LoginController() {
        this.cursoModel = new Curso();
    }

    public int autenticar(String user,String password) {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
//        Query query = session.createSQLQuery( 
//        "CALL SP_LOGIN()")
//        .setParameter("nom", user)
//        .setParameter("pass", password); 
//
//        List result = query.list(); 
//        session.getTransaction().commit();
//        System.out.println("result: "+ result.toString());
        
        String usuarioRef = "Juanfra";
        String contraRef = "1234"; 
        
        if (user.equals(usuarioRef) && password.equals(password)) {
            return 1;
        }else{
            return -1;
        }
    }


}
