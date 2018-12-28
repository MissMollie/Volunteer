package com.mapping;


import com.model.ResumePraTec;
import com.model.StudentRes;

public interface ResumePraTecMapper {
	void addResumePraTec(ResumePraTec resumePraTec);
	ResumePraTec findByPid(int pid);
	ResumePraTec findByRes(StudentRes res);
}
