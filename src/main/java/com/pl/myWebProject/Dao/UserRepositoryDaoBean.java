package com.pl.myWebProject.Dao;

import com.pl.myWebProject.domain.User;
import com.pl.myWebProject.repository.UserRepository;

import java.math.BigInteger;
import java.util.List;

public class UserRepositoryDaoBean implements UserRepositoryDao {
    @Override
    public void addUser(User user) {
        UserRepository.getRepository().add(user);
    }

    @Override
    public User getUserById(int id) {
        List<User> userList = UserRepository.getRepository();
        for (User user : userList) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User getUserByTelefon(BigInteger mobile) {
        List<User> userList = UserRepository.getRepository();
        for (User user : userList) {
            if (user.getMobile() == mobile) {
                return user;
            }
        }

        return null;
    }

    @Override
    public List<User> getUserList() {
        return UserRepository.getRepository();
    }
}
