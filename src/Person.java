import java.util.ArrayList;

public class Person {
    String firstName;
    private String lastName;
    private ArrayList<Long> a;
    private String email;

    Person(String firstName, String lastName, ArrayList<Long> a, String email) {
        this.a = a;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getA() {
        String b = "";
        int c = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            b = b + a.get(i) + ",";
        }
        return b + a.get(a.size() - 1);
    }

    public void setA(ArrayList<Long> a) {
        this.a = a;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        lastName = lastName;
    }

}
