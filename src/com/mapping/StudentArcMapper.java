package com.mapping;


import java.util.List;

import com.model.StudentArc;



public interface StudentArcMapper {

	void addStudentArc(StudentArc studentArc);
		List<StudentArc> findByState(String state);
		List<StudentArc> findByStateToUser();
		List<StudentArc> findBystudentId(String studentId);
		void update(StudentArc studentArc);
		StudentArc findBySid(int sid);
		List<StudentArc> findAll();
		void audit(StudentArc studentArc);
		void updateState(StudentArc studentArc);
}
