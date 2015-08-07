package com.hk.sms.server1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Request implements Serializable
{
	private static final long serialVersionUID = 1L;
	/**
	 * �Ƚϰ汾����
	 */
	public static final int COMPARE_PROGRAM_VERSION_REQUEST = 0x1;
	/**
	 * ����ҵ����������
	 */
	public static final int UPDATE_BUSINESS_DATA_REQUEST = 0x2;
	/**
	  * ����¼����
	 */
	public static final int LOGIN_REQUEST = 0x3;
	/**
	 * ע���û�����
	 */
	public static final int REGISTE_REQUEST=0x4;
	/**
	 * ��ѯ��������
	 */
	public static final int SEARCH_FLIGHT_REQUEST=0x5;
	/**
	 * ��Ʊ����
	 */
	public static final int ORDER_REQUEST=0x6;
	/**
	 * ֧������
	 */
	public static final int PAYMENT_REQUEST=0x7;
	/**
	 * ��ѯ��������
	 */
	public static final int FIND_ORDER_REQUEST=0x8;
	/**
	 * ɾ����������
	 */
	public static final int DELETE_ORDER_REQUEST=0x9;
	/**
	 * ��ӳ˿�����
	 */
	public static final int ADD_PASSENGER_REQUEST=0xa;
	/**
	 * �޸ĳ˿�����
	 */
	public static final int MODIFY_PASSENGER_REQUEST=0xb;

	/**
	 * ɾ���˿�����
	 */
	public static final int REMOVE_PASSENGER_REQUEST=0xc;
	/**
	 * �����ϵ������
	 */
	public static final int ADD_CONTACT_REQUEST=0xd;
	/**
	 * �޸���ϵ������
	 */
	public static final int MODFY_CONTACT_REQUEST=0xe;
	/**
	 * ɾ����ϵ������
	 */
	public static final int REMOVE_CONTACT_REQUEST=0xf;
	/**
	 * ���һ�Ա�����Ϣ����
	 */
	public static final int FIND_MEMBER_MILEAGE_REQUEST=0x10;
	/**
	 * �޸��û���Ϣ����
	 */
	public static final int MODIFY_USER_REQUEST=0x11;
	/**
	 * �޸��û���������
	 */
	public static final int MODIFY_USER_PASSWORD_REQUEST=0x12;
	/**
	 * ���ö�����Ϣ����
	 */
	public static final int SET_SUBSCRIPTION_REQUEST=0x13;
	/**
	 * �˳����� 
	 */
	public static final int QUIT_REQUEST =0x14;

	/**
	 * ��ѯ�˻���
	 */
	public static final int SEARCH_PASSANGER_REQUEST =0x15;
	/**
	 * ��ѯ��ϵ��
	 */
	public static final int SEARCH_CONTACT_REQUEST =0x16;
	/**
	 *���Ӷ���
	 */
	public static final int INSERT_ORDER_REQUEST =0x17;
	/**
	 * ��ѯ������ϸ
	 */
	public static final int FIND_ORDER_MINGXI_REQUEST =0x18;
	
	/**
	 * ��ѯ����
	 */
	public static final int FIND_BRANCH_REQUEST =0x19;
	
	/**
	 * ���һ�Ա��
	 */
	public static final int Search_VIP_REQUEST = 0x21;
	
	/**
	 * ��ȡ�Ż���Ϣ����
	 */
	public static final int GET_PROVILIEGE_REQUEST = 0x22;
	
	/**
	 * ������Ϣ����
	 */
	public static final int FEEDBACK_REQUEST = 0x23;
	
	/**
	 * ���һ�������
	 */
	public static final int FIND_AIRPORT_REQUEST = 0x40;

	/**
	 * ���Һ�������
	 */
	public static final int FIND_ROUTE_REQUEST = 0x41;

	/**
	 * ���һ�������
	 */
	public static final int FIND_PLANE_REQUEST = 0x42;
	/**
	 * Ӧ������,��ͬ��Ӧ�����Ͷ�Ӧ�Ų�ͬ�Ĳ����б�
	 */
	private int type;

	/**
	 * �����б�
	 */
	private Map<String,Object> parameters;

	/**
	 * �����Ӧ�û��Ự���
	 */
	
	private UUID sessionID;



	public  Request()
    {
		parameters=new HashMap<String,Object>();
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public UUID getSessionID()
	{
		return sessionID;
	}

	public void setSessionID(UUID sessionID)
	{
		this.sessionID = sessionID;
	}
	
}
