package com.hh.sms.info;

public class ReplyServerBody extends ReplyBody {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String serverInfo;
	  public ReplyServerBody(String serverInfo) {
	    this.serverInfo = serverInfo;
	  }
	  public String getServerInfo() {
	    return serverInfo;
	  }
	  public void setServerInfo(String serverInfo) {
	    this.serverInfo = serverInfo;
	  }
	}