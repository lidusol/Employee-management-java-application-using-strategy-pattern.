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
public class WageLevel_B implements Payment{
    private double salaryAmount = 4125;
    
    @Override
    public double getSalary(){
//        System.out.println("Salary: " + this.salaryAmount + " birr.");
        return salaryAmount;
    }
}
