package com.hk.sms.server1;

import java.io.Serializable;

public class ErrorMessage implements Serializable
{
  /**
   * 错误�?
   */
	private String errorCode;
	
	/**
	 * 错误名称
	 */
	private String errorName;
	
	/**
	 * 错误详情
	 */
	private String detailMessage;


	public ErrorMessage()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ErrorMessage(String errorCode, String errorName, String detailMessage)
	{
		super();
		this.errorCode = errorCode;
		this.errorName = errorName;
		this.detailMessage = detailMessage;
	}

	public ErrorMessage(String errorCode, String errorName)
	{
		super();
		this.errorCode = errorCode;
		this.errorName = errorName;
	}

	public ErrorMessage(String errorCode)
	{
		super();
		this.errorCode = errorCode;
	}

	public String getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	public String getErrorName()
	{
		return errorName;
	}

	public void setErrorName(String errorName)
	{
		this.errorName = errorName;
	}

	public String getDetailMessage()
	{
		return detailMessage;
	}

	public void setDetailMessage(String detailMessage)
	{
		this.detailMessage = detailMessage;
	}

	@Override
	public String toString()
	{
		return "ErrorMessage [errorCode=" + errorCode + ", errorName="
				+ errorName + ", detailMessage=" + detailMessage + "]";
	}
	
}
