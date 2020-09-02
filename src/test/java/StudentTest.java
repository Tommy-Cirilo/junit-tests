import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

   /* @Before
    public void setUp() {
        this.grades = new ArrayList<>();
        this.grades.add(99);
    }

    @Test
    @DisplayName("This is the test that sets both the name and id property, and " +
            "initializes the grades property as an empty array list")
    public void setNameandId () {
        String studentName;
        long studentId;
        assertNotNull(this.grades);
    }

    @Test
    public void initializeGrades() {

    }*/
   @Test
   public void testCreateStudent(){
       Student fer = new Student(1L, "fer");
       Student ryan = null;
       assertNull(ryan);
       assertNotNull(fer);
   }

    @Test
    public void testStudentFields(){
        Student fer = new Student(1L, "fer");
        assertSame(1L, fer.getId());
        assertSame("fer", fer.getName());
        assertSame(0, fer.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        assertSame(100, fer.getGrades().get(0));
        fer.addGrade(80);
        assertSame(80, fer.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student fer = new Student(1L, "fer");
        fer.addGrade(100);
        fer.addGrade(80);
        assertEquals(90, fer.getGradeAverage(), 0);
    }




}
