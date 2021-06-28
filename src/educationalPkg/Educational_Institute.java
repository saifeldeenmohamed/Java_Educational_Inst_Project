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

public class Educational_Institute {
    private String name;
    private Person[] students = new Person [10];
    private Person[] instructors = new Person [3];
    private Person[] admins = new Person [2];

    public Educational_Institute(String name, Person[] students, Person[] instructors, Person[] admins) {
        this.name = name;
        this.students = students;
        this.instructors = instructors;
        this.admins = admins;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person[] getStudents() {
        return students;
    }

    public Person[] getInstructors() {
        return instructors;
    }

    public Person[] getAdmins() {
        return admins;
    }

    @Override
    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
          return "our institue has{name=" + name + " and Students = " + students + " and Instractors = " + instructors  + " and Admins = " + admins ;
    }
    
    
    
}
