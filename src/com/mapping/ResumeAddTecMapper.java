package com.mapping;

import com.model.ResumeAddTec;
import com.model.StudentRes;

public interface ResumeAddTecMapper {
	void addResumeAddTec(ResumeAddTec resumeAddTec);
	ResumeAddTec findByTid(int tid);
	ResumeAddTec findByRes(StudentRes res);
}
