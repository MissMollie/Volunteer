package com.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.model.EnterpriseJob;

public interface EnterpriseJobMapper {
	
	void addEnterpriseJob(EnterpriseJob enterpriseJob);
	List<EnterpriseJob> findByEid(int eid);
	EnterpriseJob findByJid(@Param("jid")int jid);
	//List<EnterpriseJob> findByState(String state);//不根据状态查活动，所有都查
	List<EnterpriseJob> findByState();
}
