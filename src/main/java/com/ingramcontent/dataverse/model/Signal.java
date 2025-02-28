package com.ingramcontent.dataverse.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Signal implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String pipelineCode;
	private java.lang.String taskName;
	private java.util.List<java.lang.String> fileName;

	private java.util.List<java.lang.Integer> totalRecord;

	public Signal() {
	}

	public java.lang.String getPipelineCode() {
		return this.pipelineCode;
	}

	public void setPipelineCode(java.lang.String pipelineCode) {
		this.pipelineCode = pipelineCode;
	}

	public java.lang.String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(java.lang.String taskName) {
		this.taskName = taskName;
	}

	public java.util.List<java.lang.String> getFileName() {
		return this.fileName;
	}

	public void setFileName(java.util.List<java.lang.String> fileName) {
		this.fileName = fileName;
	}

	public java.util.List<java.lang.Integer> getTotalRecord() {
		return this.totalRecord;
	}

	public void setTotalRecord(java.util.List<java.lang.Integer> totalRecord) {
		this.totalRecord = totalRecord;
	}

	public Signal(java.lang.String pipelineCode, java.lang.String taskName,
			java.util.List<java.lang.String> fileName,
			java.util.List<java.lang.Integer> totalRecord) {
		this.pipelineCode = pipelineCode;
		this.taskName = taskName;
		this.fileName = fileName;
		this.totalRecord = totalRecord;
	}

}