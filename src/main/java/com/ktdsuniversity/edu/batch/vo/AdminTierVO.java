package com.ktdsuniversity.edu.batch.vo;

public class AdminTierVO {
	
	private String memberEmail;
	private int score;
	private String nowTier;
	private String nextTier;
	
	
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getNowTier() {
		return nowTier;
	}
	public void setNowTier(String nowTier) {
		this.nowTier = nowTier;
	}
	public String getNextTier() {
		return nextTier;
	}
	public void setNextTier(String nextTier) {
		this.nextTier = nextTier;
	}
	
}
