/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistrationSystem;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/** Student Name: Peter O Donnchadha
 *  Student id: 18339906**/
public class CourseProgramme {
    
    private String courseName; // account password
    private List<Module> modules;
    private List<Student> enrolledStudents;
    //DateTime academicStartDate = new DateTime(2018,9,1,0,0,0);
    DateTime academicStartDate;
    DateTime academicEndDate;

    public CourseProgramme(String courseName, List<Module> modules, List<Student> enrolledStudents,DateTime academicStartDate, DateTime academicEndDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.enrolledStudents = enrolledStudents;
        this.academicStartDate = academicStartDate;
        this.academicEndDate = academicEndDate;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public DateTime getAcademicStartDate() {
        return academicStartDate;
    }

    public DateTime getAcademicEndDate() {
        return academicEndDate;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public void setAcademicStartDate(DateTime academicStartDate) {
        this.academicStartDate = academicStartDate;
    }
    
    @Override
    public String toString() {
        return "CourseProgramme{" + "courseName=" + courseName + ", modules=" + modules + ", enrolledStudents=" + enrolledStudents + ", academicStartDate=" + academicStartDate + ", academicEndDate=" + academicEndDate + '}';
    }

    public void setAcademicEndDate(DateTime academicEndDate) {
        this.academicEndDate = academicEndDate;
    }
}
