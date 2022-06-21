package com.mapping;

import java.util.List;

import com.model.EnterpriseArc;

public interface EnterpriseArcMapper {

		void addEnterpriseArc(EnterpriseArc enterpriseArc);
		EnterpriseArc findByEid(int eid);
		List<EnterpriseArc> findByCode(String code);
		void updateEnterpriseArc(EnterpriseArc enterpriseArc);
		List<EnterpriseArc> findByState(String state);
		List<EnterpriseArc> findAll();
		void audit(EnterpriseArc enterpriseArc) ;
}
