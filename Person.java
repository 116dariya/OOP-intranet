import java.lang.*;

/**
 */
public abstract class Person {
    /**
     */
    private String name;

    /**
     */
    private String email;

    /**
     */
    private String surname;

    /**
     */
    private String phoneNumber;

    /**
     */
    private boolean isWorking;

    /**
     */
    private boolean isTeaching;

    /**
     */
    public void loginToIntranet() {
    }

    /**
     */
    public void loginToOR() {
    }

    /**
     * @return 
     */
    public boolean getIsTeaching() {
        return false;
    }

    /**
     * @param isTeaching 
     */
    public void setIsTeaching(boolean isTeaching) {
    }

    /**
     * @return 
     */
    public boolean getIsWorking() {
        return false;
    }

    /**
     * @param isWorking 
     */
    public void setIsWorking(boolean isWorking) {
    }

    /**
     * @return 
     */
    public String getPhoneNumber() {
        return null;
    }

    /**
     * @param phoneNumber 
     */
    public void setPhoneNumber(String phoneNumber) {
    }

    /**
     * @return 
     */
    public String getSurname() {
        return null;
    }

    /**
     * @param surname 
     */
    public void setSurname(String surname) {
    }

    /**
     * @return 
     */
    public String getEmail() {
        return null;
    }

    /**
     * @param email 
     */
    public void setEmail(String email) {
    }

    /**
     * @return 
     */
    public String getName() {
        return null;
    }

    /**
     * @param name 
     */
    public void setName(String name) {
    }
}

