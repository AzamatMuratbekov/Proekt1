package company.service.impl;

import company.dao.UserDao;
import company.model.MyExseption;
import company.model.User;
import company.service.UserService;
public final class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();

    @Override
    public void AddUser(User user) {
        userDao.setUsers(user);
    }

    @Override
    public User findById(int id) {
        for (int i = 0; i < userDao.getUsers().size(); i++) {
            if (userDao.getUsers().get(i).getId() == id) {
                return userDao.getUsers().get(i);
            }
        }
        throw new MyExseption("Пользователь с таким id не найдена");
    }

    @Override
    public String deleteById(int id) {
        for (User deleteById : userDao.getUsers()) {
            if (deleteById.getId() == id) {
                userDao.getUsers().remove(deleteById);
                return "Пользователь "+ deleteById.getName()+ " Удален";
            }
        }
        throw new MyExseption("Пользователь не найден");
    }

    @Override
    public void getAllUser() {
        for (User allUsers : userDao.getUsers()) {
            System.out.println(allUsers);
        }
    }
}