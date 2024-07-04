package dao.impl;

import dao.UserDao;
import db.DataBase;
import exception.MyException;
import models.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private DataBase dataBase;
    private Long userID=1L;

    public UserDaoImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public User addUser(User user) {
        try{
            for (User user1:dataBase.getUsers()){
                if (user1.getEmail().equals(user.getEmail())){
                    throw new MyException("User email "+ user.getEmail()+" is already exist");
                }
            }
            user.setId(userID++);
            dataBase.getUsers().add(user);
            return user;
        }catch (MyException myException){
            System.out.println(myException.getMessage());
        }
        return null;
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public String updateUser(Long id, User user) {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public String deleteUser(Long id) {
        return null;
    }

    @Override
    public User getUserByEmail(String userEmail) {
        return null;
    }
}
