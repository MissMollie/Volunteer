package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapping.StudentResMapper;
import com.model.StudentArc;
import com.model.StudentRes;
@Service
@Transactional
public class StudentResService {
	@Autowired
	private StudentResMapper studentResMapper;
	
	public void  insert(StudentRes studentRes) {
		studentResMapper.addStudentRes(studentRes);
	}
	
	public StudentRes findById(int rid) {
		return studentResMapper.findByRid(rid);
	}
	
	public StudentRes findByStu(StudentArc stu) {
		
		return studentResMapper.findByStu(stu.getSid());
	}

}
