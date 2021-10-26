/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistrationSystem;

import java.util.List;
import java.util.ArrayList;
/** Student Name: Peter O Donnchadha
 *  Student id: 18339906**/
public class Student {
    private String name, dob, username; // account password
    private List<Module> modules;
    private List<CourseProgramme> courses;
    private int age;
    private long id;

    public Student(String name, String dob, String username, List<CourseProgramme> courses, List<Module> modules, int age, long id) {
        this.name = name;
        this.dob = dob;
        this.username = username;
        this.courses = courses;
        this.modules = modules;
        this.age = age;
        this.id = id;
    }

    public String getUsername() {
        String username0 = username + String.valueOf(id);
        return username0;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public List<CourseProgramme> getCourses() {
        return courses;
    }

    public List<Module> getModules() {
        return modules;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setCourses(List<CourseProgramme> courses) {
        this.courses = courses;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", dob=" + dob + ", username=" + username + ", age=" + age + ", id=" + id + '}';
    }
    
}
