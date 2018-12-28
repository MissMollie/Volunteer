package com.mapping;

import org.apache.ibatis.annotations.Param;

import com.model.User;

public interface UserMapper {

	void addUser(User user);
	User findByNameAndPassword(@Param("username") String username,@Param("password") String password);
	User findByName(String username);
	void updateStudentArcOldId(@Param("id")int id,@Param("username")String username);
	void updatePassword(User user);
	
	
}
