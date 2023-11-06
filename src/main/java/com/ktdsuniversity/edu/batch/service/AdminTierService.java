package com.ktdsuniversity.edu.batch.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ktdsuniversity.edu.batch.dao.AdminTierDAO;
import com.ktdsuniversity.edu.batch.vo.AdminTierListVO;
import com.ktdsuniversity.edu.batch.vo.AdminTierVO;
import com.ktdsuniversity.edu.batch.vo.GeneralMemberVO;

@Service
public class AdminTierService {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminTierService.class);
	
	@Autowired
	private AdminTierDAO tierDao;


	public List<GeneralMemberVO> getAdminTierMemberList() {
		List<GeneralMemberVO> memberList = tierDao.selectAdminTierList();
		return memberList;
	}
	
	@Transactional
	public boolean doDeleteAdminTierList() {
		int tierDeleteCount = tierDao.deleteAdminTierList();
		return tierDeleteCount > 0;
	}
	
	@Transactional
	public int adminTierService (List<GeneralMemberVO> memberList) {
		
		if (!memberList.isEmpty()) {
			AdminTierVO adminTierVO = new AdminTierVO();
			
			for (GeneralMemberVO member : memberList) {
				adminTierVO.setMemberEmail(member.getGeneralMemberEmail());
				adminTierVO.setScore(member.getTierScore());
				adminTierVO.setNowTier(member.tierVO.getTierId());
				adminTierVO.setNextTier(member.getTierIdTemp());
				
				tierDao.insertAdminTierList(adminTierVO);
			}
		}
		
		return 0;
	}

}
