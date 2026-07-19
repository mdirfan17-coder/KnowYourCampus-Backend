package knowyourcampus.model;

public class Admin extends User {

    public Admin() {
    }

    public Admin(String username,
                 String password,
                 String fullName,
                 String college,
                 String branch,
                 String year) {

        super(username, password, fullName, college, branch, year);
    }
}