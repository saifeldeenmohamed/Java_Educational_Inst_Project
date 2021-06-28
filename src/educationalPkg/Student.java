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
public class Student extends Person{
    private int ID;
    private Subject[] courses;

//    public Student(int ID, Subject[] courses) {
//        this.ID = ID;
//        this.courses = courses;
//    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Subject[] getCourses() {
        return courses;
    }

    public int TotalGrades() {
        int x = 0;
        for(int index = 0 ;index < courses.length ;index++){
            x = courses[index].getGrade() + x;
        }
        return x;
    }
    
}
