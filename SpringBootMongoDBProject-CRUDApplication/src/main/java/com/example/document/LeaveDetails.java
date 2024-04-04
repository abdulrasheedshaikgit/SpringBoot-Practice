package com.example.document;







import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class LeaveDetails {
	@Id
	private Integer leaveId;
	private String leaveType;
	private Date startDate;
	private Date endDate;
	private boolean status;
	public Integer getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LeaveDetails(Integer leaveId, String leaveType, Date startDate, Date endDate, boolean status) {
		super();
		this.leaveId = leaveId;
		this.leaveType = leaveType;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}
	public LeaveDetails() {
		super();
	}
	@Override
	public String toString() {
		return "LeaveDetails [leaveId=" + leaveId + ", leaveType=" + leaveType + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", status=" + status + "]";
	}
	
	
	

}
