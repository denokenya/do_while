/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatementexample;

/**
 *
 * @author Dennis
 */
public class IfStatementExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declare the variables
             int num = 1000;
             int buying_price =200;
        
        
        //write the condition
        
        if(num < 100){
            
            System.out.println("number is less than 100");
        } 
        if (num>=1000){
            System.out.println("Number is bigger than or equal to 1000");
            
        }
        if (buying_price>=200){
            System.out.println("You have won 300 bonus");
        }
      
    }
   
    
}
