package com.bean.service;

import com.bean.repository.UserRepository;
import com.bean.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by mac on 2017. 6. 18..
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Object findAll() {
        return userRepository.findAll();
    }

    public User findById(String userid) {
        return userRepository.findOne(userid);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void delete(String userid) {
        userRepository.delete(userid);
    }

}
