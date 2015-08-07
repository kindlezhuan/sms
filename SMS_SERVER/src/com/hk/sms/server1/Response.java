package com.hk.sms.server1;

import java.util.HashMap;
import java.util.Map;


public class Response implements java.io.Serializable{
	/**
 	* ����״̬����Ӧ�õ���ȷ���
 	*/
	public static final int OK_STATE=201;

	/**
 	* ��֤����״̬����֤δͨ��
 	*/
	public static final int VALI_ERROR_STATE=301;

	/**
	 * ҵ�����״̬��������Ӧ�������ܵõ���ȷ�����ҵ���쳣�����
	 */
	public static final int BUSS_ERROR_STATE=302;

	/**
	 * ϵͳ����״̬����Ӧ����һ��ϵͳ������쳣
	 */
	public static final int SYS_ERROR_STATE=401;
	
	/**
	 * �Ƚϰ汾��Ӧ
	 */
	public static final int COMPARE_PROGRAM_VERSION_RESPONSE = 0x1;
	/**
	 * ����ҵ��������Ӧ
	 */
	public static final int UPDATE_BUSINESS_DATA_RESPONSE = 0x2;
	/**
	  * ����¼��Ӧ
	 */
	public static final int LOGIN_RESPONSE = 0x3;
	/**
	 * ע���û���Ӧ
	 */
	public static final int REGISTE_RESPONSE=0x4;
	/**
	 * ��ѯ������Ӧ
	 */
	public static final int SEARCH_FLIGHT_RESPONSE=0x5;
	/**
	 * ��Ʊ��Ӧ
	 */
	public static final int ORDER_RESPONSE=0x6;
	/**
	 * ֧����Ӧ
	 */
	public static final int PAYMENT_RESPONSE=0x7;
	/**
	 * ��ѯ������Ӧ
	 */
	public static final int FIND_ORDER_RESPONSE=0x8;
	/**
	 * ɾ��������Ӧ
	 */
	public static final int DELETE_ORDER_RESPONSE=0x9;
	/**
	 * ��ӳ˿���Ӧ
	 */
	public static final int ADD_PASSENGER_RESPONSE=0xa;
	/**
	 * �޸ĳ˿���Ӧ
	 */
	public static final int MODIFY_PASSENGER_RESPONSE=0xb;

	/**
	 * ɾ���˿���Ӧ
	 */
	public static final int REMOVE_PASSENGER_RESPONSE=0xc;
	/**
	 * �����ϵ����Ӧ
	 */
	public static final int ADD_CONTACT_RESPONSE=0xd;
	/**
	 * �޸���ϵ����Ӧ
	 */
	public static final int MODFY_CONTACT_RESPONSE=0xe;
	/**
	 * ɾ����ϵ����Ӧ
	 */
	public static final int REMOVE_CONTACT_RESPONSE=0xf;
	/**
	 * ���һ�Ա�����Ϣ��Ӧ
	 */
	public static final int FIND_MEMBER_MILEAGE_RESPONSE=0x10;
	/**
	 * �޸��û���Ϣ��Ӧ
	 */
	public static final int MODIFY_USER_RESPONSE=0x11;
	/**
	 * �޸��û�������Ӧ
	 */
	public static final int MODIFY_USER_PASSWORD_RESPONSE=0x12;
	/**
	 * ���ö�����Ϣ��Ӧ
	 */
	public static final int SET_SUBSCRIPTION_RESPONSE=0x13;
	/**
	 * �˳���Ӧ 
	 */
	public static final int QUIT_RESPONSE =0x14;
	/**
	 * ��ѯ�˻���
	 */
	public static final int SEARCH_PASSANGER_RESPONSE =0x15;
	/**
	 * ��ѯ��ϵ��
	 */
	public static final int SEARCH_CONTACT_RESPONSE =0x16;
	/**
	 *���Ӷ���
	 */
	public static final int INSERT_ORDER_RESPONSE =0x17;
	/**
	 * ��ѯ������ϸ
	 */
	public static final int FIND_ORDER_MINGXI_RESPONSE =0x18;
	
	/**
	 * ��ѯ����
	 */
	public static final int FIND_BRANCH_RESPONSE =0x19;
	
	/**
	 * ���һ�Ա��
	 */
	public static final int Search_VIP_RESPONSE = 0x21;
	
	/**
	 * ��ȡ�Ż���Ϣ��Ӧ
	 */
	public static final int GET_PROVILIEGE_RESPONSE = 0x22;
	
	/**
	 * ������ϢӦ��
	 */
	public static final int FEEDBACK_RESPONSE = 0x23;
	
	/**
	 * ���һ����ظ�
	 */
	public static final int FIND_AIRPORT_RESPONSE = 0x40;

	/**
	 * ���Һ��߻ظ�
	 */
	public static final int FIND_ROUTE_RESPONSE = 0x41;

	/**
	 * ���һ��ͻظ�
	 */
	public static final int FIND_PLANE_RESPONSE = 0x42;
	/**
	 * Ӧ������,��ͬ��Ӧ�����Ͷ�Ӧ�Ų�ͬ�Ĳ����б�
	 */
	private int type;

	/**
	 * �����б�
	 */
	private Map<String,Object> parameters;

	/**
	 * Ӧ��״̬
	 */
	private int status;

	/**
	 * �쳣��Ϣ
	 */
	private ErrorMessage errormsg;

	private static final long serialVersionUID=1740286903134427908L;

	public Response(){
		parameters=new HashMap<String,Object>();
	}

	public ErrorMessage getErrorMessage() {
		return errormsg;
	}

	public void setErrorMessage(ErrorMessage errormsg) {
		this.errormsg = errormsg;
	}

	public Map<String,Object> getParameters() {
		return parameters;
	}

	public Object getParameter(String name) {
		return parameters.get(name);
	}

	public void addParameter(String name,Object value){
		parameters.put(name,value);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}