/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newproject;



import java.util.Scanner;


/**
 *
 * @author LutoAvelaMfabane
 */
public class Newproject {

    
    public static void main(String[] args) {
//getting input from user
        Scanner Sc = new Scanner(System.in);
        try{
        //STRING NAME
        System.out.println("Please enter your name:");
        String name = Sc.nextLine();
       
        //int age 
        System.out.println("Please enter your age:");
        int age  = Sc.nextInt();
        
        //double balance 
        System.out.println("Please enter your balance:");
        double balance  = Sc.nextDouble();
        
        //float amount 
        System.out.println("Please enter your target amount:");
        float amount  = (float)Sc.nextDouble();
        
        System.out.println(name + age + balance + amount);
        
        
        }
        catch(Exception e){
         System.out.println(e); 
        }    
      
}
}