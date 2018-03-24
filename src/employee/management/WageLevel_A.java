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
public class WageLevel_A implements Payment{
    private double salaryAmount = 4681;
    
    @Override
    public double getSalary(){
//        System.out.println("Salary: " + this.salaryAmount + " birr.");
        return salaryAmount;
    }
}
