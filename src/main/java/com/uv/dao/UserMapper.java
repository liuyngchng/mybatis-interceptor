package com.uv.dao;


/**
 *
 */

import com.uv.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    void insertUser(@Param("name") String name,@Param("age") int age,@Param("sex") String sex);
    List<User> getUsers();
}
