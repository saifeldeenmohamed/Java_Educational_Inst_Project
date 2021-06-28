/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educationalPkg;

//import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
//import java.util.Date;
/**
 *
 * @author SaiF El-deen
 */
public class Instructor extends Person {
    private OfficeHours officeHours;
    private Subject[] courses;

//    public Instructor(Date OfficeHours, Subject[] courses) {
//        this.OfficeHours = OfficeHours;
//        this.courses = courses;
//    }

    public OfficeHours getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }


    public Subject[] getCourses() {
        return courses;
    }

    public void setCourses(Subject[] Courses) {
        this.courses = courses;
    }
    
    public void DisplayInfo(){
        System.out.println("name is "+super.getName());
        System.out.println("number of office ours ="+getOfficeHours());
        
    }

}
