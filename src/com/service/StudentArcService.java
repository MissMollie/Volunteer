package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapping.StudentArcMapper;
import com.model.StudentArc;
@Service
@Transactional
public class StudentArcService {
		@Autowired
		private StudentArcMapper studentArcMapper;
		
		public void register(StudentArc studentArc) {
			studentArcMapper.addStudentArc(studentArc);
		}
		
		public StudentArc findBystudentId(String studentId) {
			 return studentArcMapper.findBystudentId(studentId);
		}
		
		public StudentArc findBySid(int sid) {
			 return studentArcMapper.findBySid(sid);
		}
		
		public void update(StudentArc studentArc) {
			 studentArcMapper.update(studentArc);
		}
}
