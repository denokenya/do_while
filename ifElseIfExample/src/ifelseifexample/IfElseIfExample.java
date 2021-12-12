/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseifexample;

/**
 *
 * @author Dennis
 */
public class IfElseIfExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare the variable
        int num = 1234;
        
        if (num < 100 && num>=1){
            System.out.println("It's a two digit number");
        }
        
        else if (num < 1000 && num>=100){
            System.out.println("It's a three digit number");
           
        }
       
        
        else if (num <10000 && num>=1000){
            System.out.println("It's a four digit number");
            
        }
       else if (num<100000 && num>=10000){
            System.out.println("It's a five digit number");
            
       }
        
       else{
            System.out.println("number is not between 1 and 9999");
       }
    }
    
}
