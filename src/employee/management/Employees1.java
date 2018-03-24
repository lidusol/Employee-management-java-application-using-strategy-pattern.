/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee.management;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Employees1 extends Employee{
//    public String name;
//    Duty duty;
//    Payment payment;
    public ArrayList EmployeesList;
    
    
    public Employees1(String name, Duty duty, Payment payment){
       this.name = name;
       this.duty = duty;
       this.payment = payment;
       EmployeesList = new ArrayList<>();
       
    }
    @Override
    public void getEmployeeName(){
        System.out.println("Name: " + this.name);
    }
    public void addEmployee(){
        EmployeesList.add(this);
    }
    
}
