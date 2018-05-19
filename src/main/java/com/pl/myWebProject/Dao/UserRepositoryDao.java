package com.pl.myWebProject.Dao;

import com.pl.myWebProject.domain.User;

import javax.ejb.Local;
import java.math.BigInteger;
import java.util.List;

@Local
public interface UserRepositoryDao {
    public void addUser(User user);
    public User getUserById(int id);
    public User getUserByTelefon(BigInteger mobile);
    public List<User> getUserList();
}
