package com.service;

import java.util.List;

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
		
		public List<StudentArc> findBystudentId(String studentId) {
			 return studentArcMapper.findBystudentId(studentId);
		}
		
		public StudentArc findBySid(int sid) {
			 return studentArcMapper.findBySid(sid);
		}
		
		public void update(StudentArc studentArc) {
			 studentArcMapper.update(studentArc);
		}
		public List<StudentArc> findByState(String state) {
			return  studentArcMapper.findByState(state);
		}
		public List<StudentArc> findByStateToUser() {
			return  studentArcMapper.findByStateToUser();
		}
		public List<StudentArc> findAll(){
			return studentArcMapper.findAll();
		}
		public void audit(StudentArc studentArc) {
			studentArcMapper.audit(studentArc);
		}
		public void updateState(StudentArc studentArc) {
			studentArcMapper.updateState(studentArc);
		}
}
