package com.hk.sms.server1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Request implements Serializable
{
	private static final long serialVersionUID = 1L;
	/**
	 * 比较版本请求
	 */
	public static final int COMPARE_PROGRAM_VERSION_REQUEST = 0x1;
	/**
	 * 更新业务数据请求
	 */
	public static final int UPDATE_BUSINESS_DATA_REQUEST = 0x2;
	/**
	  * 　登录请求
	 */
	public static final int LOGIN_REQUEST = 0x3;
	/**
	 * 注册用户请求
	 */
	public static final int REGISTE_REQUEST=0x4;
	/**
	 * 查询航班请求
	 */
	public static final int SEARCH_FLIGHT_REQUEST=0x5;
	/**
	 * 订票请求
	 */
	public static final int ORDER_REQUEST=0x6;
	/**
	 * 支付请求
	 */
	public static final int PAYMENT_REQUEST=0x7;
	/**
	 * 查询订单请求
	 */
	public static final int FIND_ORDER_REQUEST=0x8;
	/**
	 * 删除订单请求
	 */
	public static final int DELETE_ORDER_REQUEST=0x9;
	/**
	 * 添加乘客请求
	 */
	public static final int ADD_PASSENGER_REQUEST=0xa;
	/**
	 * 修改乘客请求
	 */
	public static final int MODIFY_PASSENGER_REQUEST=0xb;

	/**
	 * 删除乘客请求
	 */
	public static final int REMOVE_PASSENGER_REQUEST=0xc;
	/**
	 * 添加联系人请求
	 */
	public static final int ADD_CONTACT_REQUEST=0xd;
	/**
	 * 修改联系人请求
	 */
	public static final int MODFY_CONTACT_REQUEST=0xe;
	/**
	 * 删除联系人请求
	 */
	public static final int REMOVE_CONTACT_REQUEST=0xf;
	/**
	 * 查找会员里程信息请求
	 */
	public static final int FIND_MEMBER_MILEAGE_REQUEST=0x10;
	/**
	 * 修改用户信息请求
	 */
	public static final int MODIFY_USER_REQUEST=0x11;
	/**
	 * 修改用户密码请求
	 */
	public static final int MODIFY_USER_PASSWORD_REQUEST=0x12;
	/**
	 * 设置订阅信息请求
	 */
	public static final int SET_SUBSCRIPTION_REQUEST=0x13;
	/**
	 * 退出请求 
	 */
	public static final int QUIT_REQUEST =0x14;

	/**
	 * 查询乘机人
	 */
	public static final int SEARCH_PASSANGER_REQUEST =0x15;
	/**
	 * 查询联系人
	 */
	public static final int SEARCH_CONTACT_REQUEST =0x16;
	/**
	 *增加订单
	 */
	public static final int INSERT_ORDER_REQUEST =0x17;
	/**
	 * 查询订单明细
	 */
	public static final int FIND_ORDER_MINGXI_REQUEST =0x18;
	
	/**
	 * 查询网点
	 */
	public static final int FIND_BRANCH_REQUEST =0x19;
	
	/**
	 * 查找会员号
	 */
	public static final int Search_VIP_REQUEST = 0x21;
	
	/**
	 * 获取优惠信息请求
	 */
	public static final int GET_PROVILIEGE_REQUEST = 0x22;
	
	/**
	 * 反馈信息请求
	 */
	public static final int FEEDBACK_REQUEST = 0x23;
	
	/**
	 * 查找机场请求
	 */
	public static final int FIND_AIRPORT_REQUEST = 0x40;

	/**
	 * 查找航线请求
	 */
	public static final int FIND_ROUTE_REQUEST = 0x41;

	/**
	 * 查找机型请求
	 */
	public static final int FIND_PLANE_REQUEST = 0x42;
	/**
	 * 应答类型,不同的应答类型对应着不同的参数列表
	 */
	private int type;

	/**
	 * 参数列表
	 */
	private Map<String,Object> parameters;

	/**
	 * 请求对应用户会话编号
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
