package com.pl.myWebProject.DaoUser;

import com.pl.myWebProject.domain.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UserRepositoryDao {
    public boolean addUser(User user);
    public List<User> getUserList();


//    public User getUserById(int id);
//    public User getUserByTelefon(BigInteger mobile);
//    public List<User> getUserList();
}
