package com.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.EnterpriseJob;

public interface EnterpriseJobMapper {
	
	void addEnterpriseJob(EnterpriseJob enterpriseJob);
	List<EnterpriseJob> findByEid(int eid);
	EnterpriseJob findByJid(@Param("jid")int jid);
	//List<EnterpriseJob> findByState(String state);//������״̬�������ж���
	List<EnterpriseJob> findByState();
}
