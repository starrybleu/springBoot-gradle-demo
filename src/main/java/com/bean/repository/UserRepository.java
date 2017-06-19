package com.bean.repository;

import com.bean.vo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mac on 2017. 6. 18..
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {

}