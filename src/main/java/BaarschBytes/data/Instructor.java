package BaarschBytes.data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Instructor extends Person {
    private String displayName;
    private String emailAddress;

    public Instructor() {
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "displayName='" + displayName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
