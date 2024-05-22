package com.ingramcontent.dataverse.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Xformer implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String pipelineCode;
	private java.lang.String taskName;
	private java.lang.String fileName;
	private java.lang.Boolean isInitialLoad;
	private java.lang.String createdDate;

	private java.lang.String conatinerId;

	private java.lang.String dataverseProcessId;

	private long processId;

	private java.lang.String requestType;

	private java.lang.String signalName;

	public Xformer() {
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

	public java.lang.String getConatinerId() {
		return this.conatinerId;
	}

	public void setConatinerId(java.lang.String conatinerId) {
		this.conatinerId = conatinerId;
	}

	public java.lang.String getDataverseProcessId() {
		return this.dataverseProcessId;
	}

	public void setDataverseProcessId(java.lang.String dataverseProcessId) {
		this.dataverseProcessId = dataverseProcessId;
	}

	public long getProcessId() {
		return this.processId;
	}

	public void setProcessId(long processId) {
		this.processId = processId;
	}

	public java.lang.String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(java.lang.String requestType) {
		this.requestType = requestType;
	}

	public java.lang.String getSignalName() {
		return this.signalName;
	}

	public void setSignalName(java.lang.String signalName) {
		this.signalName = signalName;
	}

	public Xformer(java.lang.String pipelineCode, java.lang.String taskName,
			java.lang.String fileName, java.lang.Boolean isInitialLoad,
			java.lang.String createdDate, java.lang.String conatinerId,
			java.lang.String dataverseProcessId, long processId,
			java.lang.String requestType, java.lang.String signalName) {
		this.pipelineCode = pipelineCode;
		this.taskName = taskName;
		this.fileName = fileName;
		this.isInitialLoad = isInitialLoad;
		this.createdDate = createdDate;
		this.conatinerId = conatinerId;
		this.dataverseProcessId = dataverseProcessId;
		this.processId = processId;
		this.requestType = requestType;
		this.signalName = signalName;
	}

}