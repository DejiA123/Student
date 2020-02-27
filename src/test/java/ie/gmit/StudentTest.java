package ie.gmit;


import static org.junit.jupiter.api.Assertions. *;
import org.junit.jupiter.api.Test;


import java.nio.channels.CancelledKeyException;


public class StudentTest {

    Student myStudent;

    @Test
    void testStudent(){
        myStudent = new Student("david",  "david@yahoo.com" );

    }

    @Test
    void testName()
    {

        assertEquals(1, myStudent.getname());
    }

    @Test
    void testEmail()
    {
        assertEquals(1, myStudent.getemail());

    }


}
