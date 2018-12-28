package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapping.ResumeAddTecMapper;
import com.model.ResumeAddTec;
import com.model.StudentRes;
@Service
@Transactional
public class ResumeAddTecService {
	@Autowired
	private ResumeAddTecMapper resumeAddTecMapper;
	public void  insert(ResumeAddTec resumeAddTec) {
		resumeAddTecMapper.addResumeAddTec(resumeAddTec);
	}
	public ResumeAddTec findById(int tid) {
		return resumeAddTecMapper.findByTid(tid);
	}
	public ResumeAddTec findByRes(StudentRes res) {
		return resumeAddTecMapper.findByRes(res);
	}
	
}
