import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

//    This creates a test that creates a student object with an id and name property
    @Test
    public void testCreateStudent() {
        Student fer = new Student(1L, "fer");
        Student ryan = null;
        assertNull(ryan);
        assertNotNull(fer);
    }

//    This test the student object by getting the assigned properties to that object
    @Test
    public void testStudentFields() {
        Student fer = new Student(1L, "fer");
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(0, fer.getGrades().size());
    }


//    This creates a new student object and adds a grade into the list, and tests by grabbing index
    @Test
    public void testAddGrade() {
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
    }

//    creates a new student object and gets the avergae of the two grades
    @Test
    public void testAverageGrade() {
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
    }
}