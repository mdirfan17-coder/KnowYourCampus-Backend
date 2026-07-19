package knowyourcampus.model;

public class User {

    private String username;
    private String password;
    private String fullName;
    private String college;
    private String branch;
    private String year;

    public User() {
    }

    public User(String username, String password, String fullName,
                String college, String branch, String year) {

        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.college = college;
        this.branch = branch;
        this.year = year;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isProfileComplete() {
        return username != null &&
                password != null &&
                fullName != null &&
                college != null &&
                branch != null &&
                year != null;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", college='" + college + '\'' +
                ", branch='" + branch + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}