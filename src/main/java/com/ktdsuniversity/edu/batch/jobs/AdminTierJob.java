package com.ktdsuniversity.edu.batch.jobs;

import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ktdsuniversity.edu.batch.beans.Beans;
import com.ktdsuniversity.edu.batch.service.AdminTierService;
import com.ktdsuniversity.edu.batch.vo.GeneralMemberVO;

public class AdminTierJob implements Job{

	private static final Logger logger = LoggerFactory.getLogger(AdminTierJob.class);

	private AdminTierService adminTierService;
	
	public AdminTierJob() {
		adminTierService = Beans.getInstance().getBean("adminTierService");
	}

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		logger.info("Admin Tier Batch Start");
		
		adminTierService.doDeleteAdminTierList();
		List<GeneralMemberVO> memberList = adminTierService.getAdminTierMemberList();
		
		adminTierService.adminTierService(memberList);
		
		logger.info("Admin Tier Batch End");
		
	}
}
