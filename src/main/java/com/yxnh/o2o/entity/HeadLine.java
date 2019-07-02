package com.yxnh.o2o.entity;

import java.util.Date;

public class HeadLine {
	private Long lineId;
	private String lineName;
	private String lindLink;
	private String lineImg;
	private Integer priority;
	//0.不可用 1.可用
	private Integer enableStatus;
	private Date creattTime;
	private Date lastEditTime;

	public Long getLineId() {
		return lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

	public String getLindLink() {
		return lindLink;
	}

	public void setLindLink(String lindLink) {
		this.lindLink = lindLink;
	}

	public String getLineImg() {
		return lineImg;
	}

	public void setLineImg(String lineImg) {
		this.lineImg = lineImg;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public Date getCreattTime() {
		return creattTime;
	}

	public void setCreattTime(Date creattTime) {
		this.creattTime = creattTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}
}
