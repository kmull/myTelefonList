package com.pl.myWebProject.repository;

import com.pl.myWebProject.domain.Gender;
import com.pl.myWebProject.domain.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class UserRepository {


    @PersistenceContext(unitName = "pUnit")
    private EntityManager entityManager;

    public boolean addUser(User user) {
        entityManager.persist(user);
        System.out.println("User " + user + " added");
        return true;
    }


//    private static List<User> userRepository = new ArrayList<>();
//
//    public static List<User> getRepository() {
//        if (userRepository.size() == 0) {
//            fillRepositoryWithDefaults();
//        }
//        return userRepository;
//    }
//
//    private static void fillRepositoryWithDefaults() {
//        User user = new User();
//        user.setId(1);
//        user.setName("Patrycja");
//        user.setSurname("Lipinska");
//        user.setAge(26);
//        user.setGender(Gender.WOMAN);
//        user.setTelephone(new BigInteger("585620444"));
//        user.setMobile(new BigInteger("403717442"));
//        user.setAddress("Rzeczna 10, 83-200 Starogard Gdanski");
//        userRepository.add(user);
//
//        user = new User();
//        user.setId(2);
//        user.setName("Krzysztof");
//        user.setSurname("Muller");
//        user.setAge(32);
//        user.setGender(Gender.MAN);
//        user.setTelephone(new BigInteger("585620333"));
//        user.setMobile(new BigInteger("503818442"));
//        user.setAddress("Krag 38A, 83-200 Starogard Gdanski");
//        userRepository.add(user);
//
//        user = new User();
//        user.setId(3);
//        user.setName("Tadeusz");
//        user.setSurname("Haller");
//        user.setAge(43);
//        user.setGender(Gender.MAN);
//        user.setTelephone(new BigInteger("52555011"));
//        user.setMobile(new BigInteger("609609609"));
//        user.setAddress("Rokitki 7, 81-400 Tczew");
//        userRepository.add(user);
//
//        user = new User();
//        user.setId(4);
//        user.setName("Maria");
//        user.setSurname("Barlecka");
//        user.setAge(57);
//        user.setGender(Gender.WOMAN);
//        user.setTelephone(new BigInteger("000000000"));
//        user.setMobile(new BigInteger("702702702"));
//        user.setAddress("Kolobrzeska 20C, 80-600 Gdansk");
//        userRepository.add(user);
//    }
}
