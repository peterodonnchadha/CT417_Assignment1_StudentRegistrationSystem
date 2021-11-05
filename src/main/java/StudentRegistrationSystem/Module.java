/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistrationSystem;

import java.util.List;

/** Student Name: Peter O Donnchadha
 *  Student id: 18339906**/
public class Module {
    private String moduleName, id;
    private List<Student> students;
    private List<CourseProgramme> courses;

    public Module(String moduleName, String id, List<Student> students, List<CourseProgramme> courses) {
        this.moduleName = moduleName;
        this.id = id;
        this.students = students;
        this.courses = courses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<CourseProgramme> getCourses() {
        return courses;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setCourses(List<CourseProgramme> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Module{" + "moduleName=" + moduleName + ", id=" + id + ", students=" + students.toString() + '}';
    }
    
}
