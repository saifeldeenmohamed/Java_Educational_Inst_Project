/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educationalPkg;

/**
 *
 * @author SaiF El-deen
 */
public class MainClass {
    
    public static void main(String[] arga){
        
        
        Person p1 = new Person();
        p1.setName("Saif");
        System.out.println("my name is "+p1.getName());
        
        Adminst a1 = new Adminst("021515","ai");
        a1.setContact(" 01122334455");
        a1.setRole("Ai engineer");
        System.out.println("Contact number ="+a1.getContact());
        System.out.println("My role is "+a1.getRole());
        
        OfficeHours o1 = new OfficeHours();
        o1.setDate("16/6/2021");
        o1.setFrom("1 PM");
        o1.setTo("5 PM");
        
        Instructor i1 = new Instructor();
        i1.setName("MOHAMED");
        System.out.println("Instructor : "+i1.getName()+" is available on "+o1.getDate()+" from "+o1.getFrom()+" to "+o1.getTo());
        
   
       
                }
                }