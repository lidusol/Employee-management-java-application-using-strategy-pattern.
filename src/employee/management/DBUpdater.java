/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee.management;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class DBUpdater {
    String conString = "jdbc:mysql://localhost/employeesData";
    String username = "root";
    String password = "root";
    
    public Boolean addEmployee(String name, String duty, double payment){
        String sql = "INSERT INTO employeesData.employees(name, duty, payment) VALUES ('" + name + "', '" + duty + "', '" + payment + "')";
        try{
            Connection con = DriverManager.getConnection(conString, username, password);
            Statement s = con.prepareStatement(sql);
            s.executeUpdate(sql);
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    public DefaultTableModel getData(){
        DefaultTableModel de = new DefaultTableModel();
        de.addColumn("Id");
        de.addColumn("Name");
        de.addColumn("Duty");
        de.addColumn("Payment");
        String sql = "select * from employeesData.employees";
        try{
            Connection con = DriverManager.getConnection(conString, username, password);
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()){
                String id = rs.getString(1);
                String name = rs.getString(2);
                String duty = rs.getString(3);
                String payment = rs.getString(4);
                de.addRow(new String[]{id, name, duty, payment});
            }
            return de;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
//     public Boolean update(int id, String name, String duty, String payment) {
//
//        String sql = "update employeesData.employees set name = '" + name + "', duty = '" + duty + "', payment = '" + payment + "' where id = '" + id + "'";
//
//         try {
//            Connection con = DriverManager.getConnection(conString, username, password);
//            Statement s = con.prepareStatement(sql);
//            s.executeUpdate(sql);
//            return true;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
     public Boolean delete(String id) {
        String sql = "delete from employeesData.employees where id = '" + id + "'";
        try {
            Connection con = DriverManager.getConnection(conString, username, password);
            Statement s = con.prepareStatement(sql);
            s.executeUpdate(sql);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
