package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapping.EnterpriseJobMapper;
import com.model.EnterpriseJob;
@Service
@Transactional
public class EnterpriseJobService {
	@Autowired
	private EnterpriseJobMapper enterpriseJobMapper;
	
	
	public void addEnterpriseJob(EnterpriseJob enterpriseJob) {
		enterpriseJobMapper.addEnterpriseJob(enterpriseJob);
	}
	public List<EnterpriseJob> findByEid(int eid){
		return enterpriseJobMapper.findByEid(eid);
	}
	
	public EnterpriseJob findByJid(int jid){
		return enterpriseJobMapper.findByJid(jid);
	}
	
	/*public List<EnterpriseJob> findByState(String state){
		return enterpriseJobMapper.findByState(state);
	}*/
	//不根据状态查活动，所有都查
	public List<EnterpriseJob> findByState(){
		return enterpriseJobMapper.findByState();
	}
}
