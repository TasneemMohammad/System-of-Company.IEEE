/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.of.company;


public class SystemOfCompany {

    
    public static void main(String[] args) {
        FlutterEmployees f1 = new FlutterEmployees("Ahmed","designer", 20 , 2) ;
        System.out.println("Salary of Ahmed is : " +  f1.getSalary());
        FlutterEmployees f2 = new FlutterEmployees("Mohamed","designer", 20 , 11) ;
        System.out.println("Salary of Mohamed is : " +  f2.getSalary());
        
        System.out.println("*******************");
  
        
         AndroidEmployees A1 = new AndroidEmployees("Amin","designer", 20 , 2) ;
        System.out.println("Salary of Amin is : " +  A1.getSalary());
        AndroidEmployees A2 = new AndroidEmployees("seif","designer", 20 , 13) ;
        System.out.println("Salary of seif is : " +  A2.getSalary());
       
    }
    
}
