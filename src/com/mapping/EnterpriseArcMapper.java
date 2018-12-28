package com.mapping;

import com.model.EnterpriseArc;

public interface EnterpriseArcMapper {

		void addEnterpriseArc(EnterpriseArc enterpriseArc);
		EnterpriseArc findByEid(int eid);
		EnterpriseArc findByCode(String code);
		void updateEnterpriseArc(EnterpriseArc enterpriseArc);
}
