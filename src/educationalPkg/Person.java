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
public class Person {
    private String name;

//    public Person() { // default const.
//        
//        name= new String("default");
//    
//    }
//
//    public Person(String name) { //parameterized const.
//        this.name = name;
//    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name; 
        
    }
}
