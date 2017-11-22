import java.lang.*;

public class Student extends Person {
  
    private double gpa;

    private String ID;

    private String intranetLogin;

  
    private DEGREE LevelOfEducation;

   
    private HashMap<Course, MarkAttendance> attestation;

    private DATABASE Schedule;

    public void registerForCourse(Course course) {
    }


    public void viewTranscript() {
    }

    
    public void dropCourse(Course course) {
    }

  
    public String getIntranetLogin() {
        return intranetLogin;
    }


    public void setIntranetLogin(String intranetLogin) {
        this.intranetLogin = intranetLogin;
    }

    public double getGpa() {
        return gpa;
    }


    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public DEGREE getLevelOfEducation() {
        return  LevelOfEducation;
    }


    public void setLevelOfEducation(DEGREE LevelOfEducation) {
        this.LevelOfEducation = LevelOfEducation;
    }


    public HashMap<Course, MarkAttendance> getAttestation() {
        return null;
    }

    public void setAttestation(HashMap<Course, MarkAttendance> attestation) {
    }
}

