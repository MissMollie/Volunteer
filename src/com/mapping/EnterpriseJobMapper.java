package com.mapping;

import java.util.List;

import com.model.EnterpriseJob;

public interface EnterpriseJobMapper {
	
	void addEnterpriseJob(EnterpriseJob enterpriseJob);
	List<EnterpriseJob> findByEid(int eid);
	List<EnterpriseJob> findByJid(int jid);
	List<EnterpriseJob> findByState(String state);

}
