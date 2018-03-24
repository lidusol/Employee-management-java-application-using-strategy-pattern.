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
public class Finance implements Duty{
    public Finance(){
        
    }
    @Override
    public String getTask(){
//        System.out.println("Duty: Manange transactions");
        return "Manages transactions";
    }
    

}
