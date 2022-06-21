package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mapping.EnterpriseArcMapper;
import com.model.EnterpriseArc;
@Service
@Transactional
public class EnterpriseArcService {
	@Autowired
	private EnterpriseArcMapper enterpriseArcMapper;
	
	public void insert(EnterpriseArc enterpriseArc) {
		enterpriseArcMapper.addEnterpriseArc(enterpriseArc);
	}
	
	public EnterpriseArc findById(int eid) {
		return enterpriseArcMapper.findByEid(eid);
	}
	
	public List<EnterpriseArc> findByCode(String code) {
		return enterpriseArcMapper.findByCode(code);
	}
	
	public void update(EnterpriseArc enterpriseArc) {
		enterpriseArcMapper.updateEnterpriseArc(enterpriseArc);
	}
	
	public List<EnterpriseArc> findByState(String state){
		return enterpriseArcMapper.findByState(state);
	} 
	
	public List<EnterpriseArc> findAll(){
		return  enterpriseArcMapper.findAll();
	}
	public void audit(EnterpriseArc enterpriseArc) {
		enterpriseArcMapper.audit(enterpriseArc);
	}
}
