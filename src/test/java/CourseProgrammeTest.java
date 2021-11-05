/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentRegistrationSystem;

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
public class CourseProgrammeTest {
    
    public CourseProgrammeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getModules method, of class CourseProgramme.
     */
    @Test
    public void testGetModules() {
        System.out.println("** CourseProgrammeTest: testGetModules");
        List<Module> modules = Arrays.asList(new Module("Maths", "MA101", null, null), new Module("Maths", "MA101", null, null), new Module("Maths", "MA101", null, null));
        CourseProgramme instance = new CourseProgramme("Engineering", modules, null, null, null);
        List<Module> expResult = modules;
        List<Module> result = instance.getModules();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnrolledStudents method, of class CourseProgramme.
     */
    @Test
    public void testGetEnrolledStudents() {
        System.out.println("** CourseProgrammeTest: testGetEnrolledStudents");
        List<Student> students = Arrays.asList(new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906), new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906), new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906));
        CourseProgramme instance = new CourseProgramme("Engineering", null, students, null, null);
        List expResult = students;
        List result = instance.getEnrolledStudents();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAcademicStartDate method, of class CourseProgramme.
     */
    @Test
    public void testGetAcademicStartDate() {
        System.out.println("** CourseProgrammeTest: testGetAcademicStartDate");
        DateTime startDate = new DateTime(2020, 1, 20, 0, 0, 0, 0);
        CourseProgramme instance = new CourseProgramme("Engineering", null, null, startDate, null);
        DateTime expResult = startDate;
        DateTime result = instance.getAcademicStartDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAcademicEndDate method, of class CourseProgramme.
     */
    @Test
    public void testGetAcademicEndDate() {
        System.out.println("** CourseProgrammeTest: testGetAcademicEndDate");
        DateTime endDate = new DateTime(2020, 1, 20, 0, 0, 0, 0);
        CourseProgramme instance = new CourseProgramme("Engineering", null, null, null, endDate);
        DateTime expResult = endDate;
        DateTime result = instance.getAcademicEndDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class CourseProgramme.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("** CourseProgrammeTest: testSetCourseName");
        String courseName = "Maths";
        CourseProgramme instance = new CourseProgramme(null, null, null, null, null);
        instance.setCourseName(courseName);
    }

    /**
     * Test of setModules method, of class CourseProgramme.
     */
    @Test
    public void testSetModules() {
        System.out.println("** CourseProgrammeTest: testSetModules");
        List<Module> modules = Arrays.asList(new Module("Maths", "MA101", null, null), new Module("Maths", "MA101", null, null), new Module("Maths", "MA101", null, null));;
        CourseProgramme instance = new CourseProgramme(null, null, null, null, null);
        instance.setModules(modules);
    }

    /**
     * Test of setEnrolledStudents method, of class CourseProgramme.
     */
    @Test
    public void testSetEnrolledStudents() {
        System.out.println("** CourseProgrammeTest: testSetEnrolledStudents");
        List<Student> enrolledStudents = Arrays.asList(new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906), new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906), new Student("Peter O Donnchadha", "20/05/00", "podonnchadha", null, null, 21, 18229906));
        CourseProgramme instance = new CourseProgramme(null, null, null, null, null);
        instance.setEnrolledStudents(enrolledStudents);
    }

    /**
     * Test of setAcademicStartDate method, of class CourseProgramme.
     */
    @Test
    public void testSetAcademicStartDate() {
        System.out.println("** CourseProgrammeTest: testSetAcademicStartDate");
        DateTime academicStartDate = new DateTime(2020, 1, 20, 0, 0, 0, 0);
        CourseProgramme instance = new CourseProgramme(null, null, null, null, null);
        instance.setAcademicStartDate(academicStartDate);
    }

    /**
     * Test of setAcademicEndDate method, of class CourseProgramme.
     */
    @Test
    public void testSetAcademicEndDate() {
        System.out.println("** CourseProgrammeTest: testSetAcademicEndDate");
        DateTime academicEndDate = new DateTime(2020, 1, 20, 0, 0, 0, 0);
        CourseProgramme instance = new CourseProgramme(null, null, null, null, null);
        instance.setAcademicEndDate(academicEndDate);
    }
    
}
