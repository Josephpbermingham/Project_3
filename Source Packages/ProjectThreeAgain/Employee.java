

package ProjectThreeAgain;

public class Employee {
    private String firstName;
    private String lastName;
    private String userType;
    private String username;
    private String phoneNumber;
    private String password;
    private String email;


    String getUserType(){
        return userType;
    }
    
    String getPhoneNumber(){
        return phoneNumber;
    }
    
    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getUsername() {
        return username;
    }

    String getPassword(boolean a) {
        if (a)
            return password;
        else
            return "";
    }

    String getEmail() {
        return email;
    }

    void setPassword(String password) {
        this.password = password;
    }

    public Employee(String fName, String lName, String uType, String uName, String Pword, String Email, String pNumber) {
        this.firstName = fName;
        this.lastName = lName;
        this.userType = uType;
        this.username = uName;
        this.password = Pword;
        this.email = Email;
        this.phoneNumber = pNumber;
    }

    public Employee() {
        this.firstName = "John";
        this.lastName = "doe";
        this.username = "SysAdmin";
        this.password = "A";
        this.email = "J@J.com";
        this.phoneNumber = "867-867-5309";
    }
    
    @Override
    public String toString(){
        return firstName + "," + lastName + "," + username+ "," + password + "," + email + "," + phoneNumber;
    }
    
}