package com.ktdsuniversity.edu.batch.vo;

public class GeneralMemberVO {
            
	private String GeneralMemberEmail;
	private String JobId;
	private String Region;
	private String SelfIntro;
	private String GithubUrl;
	private String AdditionalEmail;
	private String BlogUrl;
	private String TierId;
	private int TierScore;
	private String TierDate;
	private String TierIdTemp;
	
	public TierVO tierVO;
	
	
	public String getGeneralMemberEmail() {
		return GeneralMemberEmail;
	}
	public void setGeneralMemberEmail(String generalMemberEmail) {
		GeneralMemberEmail = generalMemberEmail;
	}
	public String getJobId() {
		return JobId;
	}
	public void setJobId(String jobId) {
		JobId = jobId;
	}
	public String getRegion() {
		return Region;
	}
	public void setRegion(String region) {
		Region = region;
	}
	public String getSelfIntro() {
		return SelfIntro;
	}
	public void setSelfIntro(String selfIntro) {
		SelfIntro = selfIntro;
	}
	public String getGithubUrl() {
		return GithubUrl;
	}
	public void setGithubUrl(String githubUrl) {
		GithubUrl = githubUrl;
	}
	public String getAdditionalEmail() {
		return AdditionalEmail;
	}
	public void setAdditionalEmail(String additionalEmail) {
		AdditionalEmail = additionalEmail;
	}
	public String getBlogUrl() {
		return BlogUrl;
	}
	public void setBlogUrl(String blogUrl) {
		BlogUrl = blogUrl;
	}
	public String getTierId() {
		return TierId;
	}
	public void setTierId(String tierId) {
		TierId = tierId;
	}
	public int getTierScore() {
		return TierScore;
	}
	public void setTierScore(int tierScore) {
		TierScore = tierScore;
	}
	public String getTierDate() {
		return TierDate;
	}
	public void setTierDate(String tierDate) {
		TierDate = tierDate;
	}
	public TierVO getTierVO() {
		return tierVO;
	}
	public void setTierVO(TierVO tierVO) {
		this.tierVO = tierVO;
	}
	public String getTierIdTemp() {
		return TierIdTemp;
	}
	public void setTierIdTemp(String tierIdTemp) {
		TierIdTemp = tierIdTemp;
	}

}           
