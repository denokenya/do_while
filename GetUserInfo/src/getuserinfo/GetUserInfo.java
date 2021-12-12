/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getuserinfo;

import java.util.Scanner;

/**
 *
 * @author Dennis
 */
public class GetUserInfo {

   
    public static void main(String[] args) {
        
        String name;
        int age;
        String number;
        
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("Please enter your name >> ");
        name = inputDevice.nextLine();
        System.out.print("Please input your Mobile Number>>");
        number=inputDevice.nextLine();
        
        System.out.print("Please enter your age >>");
        age =inputDevice.nextInt();
       
        
        
        System.out.println("Your name is "+name + " Your age is "+age + " years old" +number+ "Your mobile mumber is");
        
        
    }
    
}
