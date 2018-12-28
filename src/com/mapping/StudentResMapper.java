package com.mapping;

import com.model.StudentRes;

public interface StudentResMapper {
		void addStudentRes(StudentRes studentRes);
		StudentRes findByRid(int rid);
		StudentRes findByStu(int sid) ;
}
