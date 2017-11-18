package com.cg.uas.bat;

public class Batch {
	private String batchId;
	private String batchTime;
	private String facultyName;

	public Batch() {
	}

	public Batch(String batchId, String batchTime, String facultyName) {
		this.batchId = batchId;
		this.batchTime = batchTime;
		this.facultyName = facultyName;
	}

	public String dispBatchInfo() {
		return "Batch [batchId=" + batchId + ", batchTime=" + batchTime
				+ ", facultyName=" + facultyName + "]";
	}

}
