/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistrationSystem;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author peter
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        System.out.println("** StudentTest: testGetUsername()");
        Student instance = new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18339906);
        String expResult = "podonnchadha18339906";
        String result = instance.getUsername();
        //assertEquals(expResult, result);
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("** StudentTest: testGetName");
        Student instance = new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906);
        String expResult = "Peter O Donnchadha";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDob method, of class Student.
     */
    @Test
    public void testGetDob() {
        System.out.println("** StudentTest: testGetDob");
        Student instance = new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906);
        String expResult = "20/05/00";
        String result = instance.getDob();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourses method, of class Student.
     */
    @Test
    public void testGetCourses() {
        System.out.println("** StudentTest: testGetCourses");
        List<CourseProgramme> courses = Arrays.asList(new CourseProgramme("Engineering", null, null, null, null), new CourseProgramme("Medicine", null, null, null, null), new CourseProgramme("Business", null, null, null, null));
        Student instance = new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", courses, null, 21, 18229906);
        List<CourseProgramme> expResult = courses;
        List<CourseProgramme> result = instance.getCourses();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModules method, of class Student.
     */
    @Test
    public void testGetModules() {
        System.out.println("** StudentTest: testGetModules");
        List<Module> modules = Arrays.asList(new Module("Maths", "MA101", null, null), new Module("Maths", "MA101", null, null), new Module("Maths", "MA101", null, null));
        Student instance = new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, modules, 21, 18229906);
        List<Module> expResult = modules;
        List<Module> result = instance.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAge method, of class Student.
     */
    @Test
    public void testGetAge() {
        System.out.println("** StudentTest: testGetAge");
        Student instance = new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906);
        int expResult = 21;
        int result = instance.getAge();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("** StudentTest: testGetId");
        Student instance = new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18339906);
        long expResult = 18339906;
        long result = instance.getId();
        assertEquals(new BigDecimal(expResult),new BigDecimal(result));
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("** StudentTest: testSetName");
        String name = "Peter O Donnchadha";
        Student instance = new Student(null, null, null, null, null, 21, 18339906);
        instance.setName(name);
    }

    /**
     * Test of setDob method, of class Student.
     */
    @Test
    public void testSetDob() {
        System.out.println("** StudentTest: testSetDob");
        String dob = "20/05/2000";
        Student instance = new Student(null, null, null, null, null, 21, 18339906);
        instance.setDob(dob);
    }

    /**
     * Test of setCourses method, of class Student.
     */
    @Test
    public void testSetCourses() {
        System.out.println("** StudentTest: testSetCourses");
        List<CourseProgramme> courses = Arrays.asList(new CourseProgramme("Engineering", null, null, null, null), new CourseProgramme("Medicine", null, null, null, null), new CourseProgramme("Business", null, null, null, null));
        Student instance = new Student(null, null, null, null, null, 21, 18339906);
        instance.setCourses(courses);
    }

    /**
     * Test of setModules method, of class Student.
     */
    @Test
    public void testSetModules() {
        System.out.println("** StudentTest: testSetModules");
        List<Module> modules = Arrays.asList(new Module("Maths", "MA101", null, null), new Module("Maths", "MA101", null, null), new Module("Maths", "MA101", null, null));
        Student instance = new Student(null, null, null, null, null, 21, 18339906);
        instance.setModules(modules);
    }

    /**
     * Test of setAge method, of class Student.
     */
    @Test
    public void testSetAge() {
        System.out.println("** StudentTest: testSetAge");
        int age = 10;
        Student instance = new Student(null, null, null, null, null, 21, 18339906);
        instance.setAge(age);
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("** StudentTest: testSetId");
        long id = 12345678;
        Student instance = new Student(null, null, null, null, null, 21, 18339906);
        instance.setId(id);
    }
    
}
