package com.hh.sms.info;

import java.io.Serializable;

	//�������Ͳ���
	//����ʵ�����л��ӿ�
	public class AskParams implements Serializable {
	  private static final long serialVersionUID = 1L;
	  private String auth;
	  public String getAuth() {
	    return auth;
	  }
	  public void setAuth(String auth) {
	    this.auth = auth;
	  }
	  private void sayWorld() {
		// TODO Auto-generated method stub
		  System.out.println("World");
	}
	}