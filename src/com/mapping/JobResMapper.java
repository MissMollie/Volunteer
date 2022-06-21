package com.mapping;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.JobRes;

public interface JobResMapper {
	
	void addJobRes(JobRes jobRes);
	JobRes findByJidAndSid(@Param("jid")int jid,@Param("sid")int sid);
	List<JobRes> findByJid(@Param("jid")int jid);

}
