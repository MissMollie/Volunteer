package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapping.ResumePraTecMapper;
import com.model.ResumePraTec;
import com.model.StudentRes;
@Service
@Transactional
public class ResumePraTecService {
	@Autowired
	private ResumePraTecMapper resumePraTecMapper;
	public void  insert(ResumePraTec resumePraTec) {
		resumePraTecMapper.addResumePraTec(resumePraTec);
	}
	public ResumePraTec findById(int pid) {
		return resumePraTecMapper.findByPid(pid);
	}
	public ResumePraTec findByRes(StudentRes res) {
		return resumePraTecMapper.findByRes(res);
	}
}
