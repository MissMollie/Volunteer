package com.mapping;


import com.model.StudentArc;



public interface StudentArcMapper {

	void addStudentArc(StudentArc studentArc);
		StudentArc findByState(String state);
		StudentArc findBystudentId(String studentId);
		void update(StudentArc studentArc);
		StudentArc findBySid(int sid);
}
