import java.lang.*;
import java.util.*;

/**
 * The faculty is an abstract class that contains general information about the subjects and teachers of the faculty
 */
public class Faculty {
    /**
     */
    public static String facultyName;

    /**
     */
    private Vector<Teacher> listOfTeachers;
    
    private Vector<Student> listOfStudents;
    
    private Vector<Specialty> listOfSpecialties;
    /**
     */
    private static Teacher dean;

    /**
     * @param faculty 
     */
    public void shutFaculty(Faculty faculty) {
    }

    /**
     * @return 
     */
    public String getFacultyName() {
        return facultyName;
    }

    /**
     * @param facultyName 
     */
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    /**
     * @return 
     */
    public Staff getDean() {
        return dean;
    }

    /**
     * @param dean 
     */
    public void setDean(Staff dean) {
        this.dean = dean;
    }

    /**
     * @return 
     */
    public Collection getListOfTeachers() {
        return listOfTeachers;
    }

    /**
     * @param teacher 
     */
    public void setTeacher(Teacher teacher) {
    }
}

