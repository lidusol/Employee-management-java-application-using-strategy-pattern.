/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package employee.management;
/**
 *
 * @author user
 */
public abstract class Employee {
    public String name;
    Duty duty;
    Payment payment;
    
    public abstract void getEmployeeName();
    
    public void getDuty(){
        duty.getTask();
    }
    public void setDuty(Duty d){
        duty = d;
    }
    public void conductWage(){
        payment.getSalary();
    }
    public void setWage(Payment p){
        payment = p;
    }
}
