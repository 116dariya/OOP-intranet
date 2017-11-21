import java.lang.*;

/**
 */
public class Student extends Person {
    /**
     */
    private double gpa;

    /**
     */
    private String ID;

    /**
     */
    private String intranetLogin;

    /**
     */
    private DEGREE LevelOfEducation;

    /**
     */
    private HashMap<Course, MarkAttendance> attestation;

    /**
     */
    private DATABASE Schedule;

    /**
     * @param course 
     */
    public void registerForCourse(Course course) {
    }

    /**
     */
    public void viewTranscript() {
    }

    /**
     * @param course 
     */
    public void dropCourse(Course course) {
    }

    /**
     * @return 
     */
    public String getIntranetLogin() {
        return null;
    }

    /**
     * @param intranetLogin 
     */
    public void setIntranetLogin(String intranetLogin) {
    }

    /**
     * @return 
     */
    public double getGpa() {
        return 0;
    }

    /**
     * @param gpa 
     */
    public void setGpa(double gpa) {
    }

    /**
     * @return 
     */
    public DEGREE getLevelOfEducation() {
        return null;
    }

    /**
     * @param LevelOfEducation 
     */
    public void setLevelOfEducation(DEGREE LevelOfEducation) {
    }

    /**
     * @return 
     */
    public HashMap<Course, MarkAttendance> getAttestation() {
        return null;
    }

    /**
     * @param attestation 
     */
    public void setAttestation(HashMap<Course, MarkAttendance> attestation) {
    }
}

