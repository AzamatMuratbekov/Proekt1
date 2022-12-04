package company.dao;
import company.model.User;
import java.util.ArrayList;
public class UserDao {
    ArrayList<User>users = new ArrayList<>();
    public ArrayList<User> getUsers(){
        return users;
    }
    public void setUsers(User users){
        this.users.add(users);
    }
}
