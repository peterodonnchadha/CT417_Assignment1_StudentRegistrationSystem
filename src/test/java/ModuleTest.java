/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package StudentRegistrationSystem;
import StudentRegistrationSystem.CourseProgramme;
import StudentRegistrationSystem.Student;
import StudentRegistrationSystem.Module;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author peter
 */
public class ModuleTest {
    
    public ModuleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getModuleName method, of class Module.
     */
    @Test
    public void testGetModuleName() {
        System.out.println("** ModuleTest: testGetModuleName");
        Module instance = new Module("Maths", "MA101", null, null);
        String expResult = "Maths";
        String result = instance.getModuleName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Module.
     */
    @Test
    public void testGetId() {
        System.out.println("** ModuleTest: testGetId");
        Module instance =  new Module("Maths", "MA101", null, null);
        String expResult = "MA101";
        String result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStudents method, of class Module.
     */
    @Test
    public void testGetStudents() {
        System.out.println("** ModuleTest: testGetStudents");
        List<Student> students = Arrays.asList(new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906), new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906), new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906));
        Module instance =  new Module("Maths", "MA101", students, null);
        List<Student> expResult = students;
        List<Student> result = instance.getStudents();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCourses method, of class Module.
     */
    @Test
    public void testGetCourses() {
        System.out.println("** ModuleTest: testGetCourses");
        List<CourseProgramme> courses = Arrays.asList(new CourseProgramme(null, null, null, null, null), new CourseProgramme(null, null, null, null, null), new CourseProgramme(null, null, null, null, null));
        Module instance = new Module("Maths", "MA101", null, courses);
        List<CourseProgramme> expResult = courses;
        List<CourseProgramme> result = instance.getCourses();
        assertEquals(expResult, result);
    }

    /**
     * Test of setModuleName method, of class Module.
     */
    @Test
    public void testSetModuleName() {
        System.out.println("** ModuleTest: testSetModuleName");
        String moduleName = "Maths";
        Module instance = new Module(null, null, null, null);
        instance.setModuleName(moduleName);
    }

    /**
     * Test of setId method, of class Module.
     */
    @Test
    public void testSetId() {
        System.out.println("** ModuleTest: testSetId");
        String id = "MA125";
        Module instance = new Module(null, null, null, null);
        instance.setId(id);
    }

    /**
     * Test of setStudents method, of class Module.
     */
    @Test
    public void testSetStudents() {
        System.out.println("** ModuleTest: testSetStudents");
        List<Student> students = Arrays.asList(new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906), new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906), new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906));
        Module instance = new Module(null, null, null, null);
        instance.setStudents(students);
    }

    /**
     * Test of setCourses method, of class Module.
     */
    @Test
    public void testSetCourses() {
        System.out.println("** ModuleTest: testSetCourses");
        List<CourseProgramme> courses = Arrays.asList(new CourseProgramme("Engineering", null, null, null, null), new CourseProgramme("Medicine", null, null, null, null), new CourseProgramme("Business", null, null, null, null));
        Module instance = new Module(null, null, null, null);
        instance.setCourses(courses);
    }
    
}
