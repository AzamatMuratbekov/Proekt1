import company.model.gender.Gender;
import company.model.User;
import company.service.impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl Users = new UserServiceImpl();
        Users.AddUser(new User(1,"Max",30, Gender.MALE));
        Users.AddUser(new User(2,"Liza",18,Gender.FEMALE));
        Users.AddUser(new User(3,"Aleksey",25,Gender.MALE));
        System.out.println(Users.findById(1));
        Users.getAllUser();
        System.out.println(Users.deleteById(2));
        Users.getAllUser();
    }
}