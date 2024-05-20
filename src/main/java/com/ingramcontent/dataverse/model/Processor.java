package com.ingramcontent.dataverse.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Processor implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String pipelineCode;
	private java.lang.String taskName;
	private java.lang.String fileName;
	private java.lang.Boolean isInitialLoad;
	private java.lang.String createdDate;

	public Processor() {
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

	public java.lang.String getFileName() {
		return this.fileName;
	}

	public void setFileName(java.lang.String fileName) {
		this.fileName = fileName;
	}

	public java.lang.Boolean getIsInitialLoad() {
		return this.isInitialLoad;
	}

	public void setIsInitialLoad(java.lang.Boolean isInitialLoad) {
		this.isInitialLoad = isInitialLoad;
	}

	public java.lang.String getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(java.lang.String createdDate) {
		this.createdDate = createdDate;
	}

	public Processor(java.lang.String pipelineCode, java.lang.String taskName,
			java.lang.String fileName, java.lang.Boolean isInitialLoad,
			java.lang.String createdDate) {
		this.pipelineCode = pipelineCode;
		this.taskName = taskName;
		this.fileName = fileName;
		this.isInitialLoad = isInitialLoad;
		this.createdDate = createdDate;
	}

}