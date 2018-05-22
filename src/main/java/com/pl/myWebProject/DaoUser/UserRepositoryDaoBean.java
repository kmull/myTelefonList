package com.pl.myWebProject.DaoUser;

import com.pl.myWebProject.domain.User;
import com.pl.myWebProject.repository.UserRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class UserRepositoryDaoBean implements UserRepositoryDao {

    @Inject
    protected UserRepository userRepository;

    @Override
    public boolean addUser(User user) {
        userRepository.addUser(user);
        return true;
    }

    @Override
    public List<User> getUserList() {
        return userRepository.userList();
    }


//    @Override
//    public void addUser(User user) {
//        UserRepository.getRepository().add(user);
//    }
//
//    @Override
//    public User getUserById(int id) {
//        List<User> userList = UserRepository.getRepository();
//        for (User user : userList) {
//            if (user.getId() == id) {
//                return user;
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public User getUserByTelefon(BigInteger mobile) {
//        List<User> userList = UserRepository.getRepository();
//        for (User user : userList) {
//            if (user.getMobile() == mobile) {
//                return user;
//            }
//        }
//
//        return null;
//    }
//
//    @Override
//    public List<User> getUserList() {
//        return UserRepository.getRepository();
//    }
}
