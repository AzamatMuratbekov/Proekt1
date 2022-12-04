package company.service;

import company.model.User;

public interface UserService {
    void AddUser(User user);
    User findById(int id);
    String deleteById(int id);
    void getAllUser();
}
