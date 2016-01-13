package Request;

/**
 * Created by Симон on 22.12.2015.
 */
public class Worker {
    private String firstName;
    private String secondName;
    private String position;

    public Worker(String firstName, String secondName, String position) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
