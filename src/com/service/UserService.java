package com.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapping.UserMapper;
import com.model.StudentArc;
import com.model.User;
@Service
@Transactional
public class UserService {
		@Autowired
		private UserMapper userMapper;
		
		public User login(String username,String password,String role) {
			
			 return userMapper.findByNameAndPassword(username,password,role);
		}
		
		
		public void register(User user) {
			userMapper.addUser(user);
		}
		
		public User findByName(String username) {
			return userMapper.findByName(username);
		}
		
		public void updateStudentArcOldId(int sid,String username) {
			userMapper.updateStudentArcOldId(sid, username);
		}
		//更新学生用户原始流水号
		
		public void updatePassword(User user) {
			userMapper.updatePassword(user);
		}
		public List<User> findByRole() {
			return  userMapper.findByRole();
		}
	
}
