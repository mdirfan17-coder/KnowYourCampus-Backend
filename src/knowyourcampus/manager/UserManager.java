package knowyourcampus.manager;
import java.util.ArrayList;
import java.util.List;
import knowyourcampus.model.User;
public class UserManager {
    final private List<User>users=new ArrayList<>();
    public boolean registerUser(User user){
        for(User s:users){
            if(s.getUsername().equals(user.getUsername())) return false;
        }
        users.add(user);
        return true;
    }
    public User findUserByUsername(String name){
        for(User user:users){
            if(user.getUsername().equals(name)) return user;
        }
   return null;
    }
    public boolean userExists(String username){
        User user=findUserByUsername(username);
        return user!=null;
    }
    public boolean updateUser(User updateduser){
        User user=findUserByUsername(updateduser.getUsername());
        if(user==null) return false;
            user.setUsername(updateduser.getUsername());
            user.setPassword(updateduser.getPassword());
            user.setFullName(updateduser.getFullName());
            user.setCollege(updateduser.getCollege());
            user.setBranch(updateduser.getBranch());
            user.setYear(updateduser.getYear());
        
        return true;
    }
    public void deleteUser(String username){
    User user=findUserByUsername(username);
    if(user==null) return;
    users.remove(user);
    }
    public List<User> searchByCollege(String college){
        List<User>collegeStudents=new ArrayList<>();
        for(User user:users){
            if(user.getCollege().equals(college)){
                collegeStudents.add(user);
            }
        }
      return collegeStudents;
    }
    public List<User> searchByBranch(String branch){
        List<User>BranchStudents=new ArrayList<>();
        for(User user:users){
            if(user.getBranch().equals(branch)){
                BranchStudents.add(user);
            }
        }
      return BranchStudents;
    }
      public List<User> searchByYear(String year){
        List<User>YearStudents=new ArrayList<>();
        for(User user:users){
            if(user.getYear().equals(year)){
                YearStudents.add(user);
            }
        }
      return YearStudents;
    }
    public List<User> getAllUsers(){
        return users;
    }
    public int getTotalUsers(){
        return users.size();
    }
    public void clearAllUsers(){
        users.clear();
    }



    
}
