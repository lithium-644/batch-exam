package com.ktdsuniversity.edu.batch.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.edu.batch.vo.AdminTierVO;
import com.ktdsuniversity.edu.batch.vo.GeneralMemberVO;

@Repository
public class AdminTierDAO extends SqlSessionDaoSupport {

	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
	
	public List<GeneralMemberVO> selectAdminTierList() {
		return getSqlSession().selectList("selectAdminTierList");
	}
	
	public int deleteAdminTierList() {
		return getSqlSession().delete("deleteAdminTierList");
	}
	
	public int insertAdminTierList(AdminTierVO adminTierVO) {
		return getSqlSession().insert("insertAdminTierList", adminTierVO);
	}
	
}
