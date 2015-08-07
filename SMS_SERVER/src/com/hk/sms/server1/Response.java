package com.hk.sms.server1;

import java.util.HashMap;
import java.util.Map;


public class Response implements java.io.Serializable{
	/**
 	* 正常状态，响应得到正确结果
 	*/
	public static final int OK_STATE=201;

	/**
 	* 验证错误状态，验证未通过
 	*/
	public static final int VALI_ERROR_STATE=301;

	/**
	 * 业务错误状态，根据响应参数不能得到正确结果（业务异常情况）
	 */
	public static final int BUSS_ERROR_STATE=302;

	/**
	 * 系统错误状态，响应导致一个系统错误或异常
	 */
	public static final int SYS_ERROR_STATE=401;
	
	/**
	 * 比较版本响应
	 */
	public static final int COMPARE_PROGRAM_VERSION_RESPONSE = 0x1;
	/**
	 * 更新业务数据响应
	 */
	public static final int UPDATE_BUSINESS_DATA_RESPONSE = 0x2;
	/**
	  * 　登录响应
	 */
	public static final int LOGIN_RESPONSE = 0x3;
	/**
	 * 注册用户响应
	 */
	public static final int REGISTE_RESPONSE=0x4;
	/**
	 * 查询航班响应
	 */
	public static final int SEARCH_FLIGHT_RESPONSE=0x5;
	/**
	 * 订票响应
	 */
	public static final int ORDER_RESPONSE=0x6;
	/**
	 * 支付响应
	 */
	public static final int PAYMENT_RESPONSE=0x7;
	/**
	 * 查询订单响应
	 */
	public static final int FIND_ORDER_RESPONSE=0x8;
	/**
	 * 删除订单响应
	 */
	public static final int DELETE_ORDER_RESPONSE=0x9;
	/**
	 * 添加乘客响应
	 */
	public static final int ADD_PASSENGER_RESPONSE=0xa;
	/**
	 * 修改乘客响应
	 */
	public static final int MODIFY_PASSENGER_RESPONSE=0xb;

	/**
	 * 删除乘客响应
	 */
	public static final int REMOVE_PASSENGER_RESPONSE=0xc;
	/**
	 * 添加联系人响应
	 */
	public static final int ADD_CONTACT_RESPONSE=0xd;
	/**
	 * 修改联系人响应
	 */
	public static final int MODFY_CONTACT_RESPONSE=0xe;
	/**
	 * 删除联系人响应
	 */
	public static final int REMOVE_CONTACT_RESPONSE=0xf;
	/**
	 * 查找会员里程信息响应
	 */
	public static final int FIND_MEMBER_MILEAGE_RESPONSE=0x10;
	/**
	 * 修改用户信息响应
	 */
	public static final int MODIFY_USER_RESPONSE=0x11;
	/**
	 * 修改用户密码响应
	 */
	public static final int MODIFY_USER_PASSWORD_RESPONSE=0x12;
	/**
	 * 设置订阅信息响应
	 */
	public static final int SET_SUBSCRIPTION_RESPONSE=0x13;
	/**
	 * 退出响应 
	 */
	public static final int QUIT_RESPONSE =0x14;
	/**
	 * 查询乘机人
	 */
	public static final int SEARCH_PASSANGER_RESPONSE =0x15;
	/**
	 * 查询联系人
	 */
	public static final int SEARCH_CONTACT_RESPONSE =0x16;
	/**
	 *增加订单
	 */
	public static final int INSERT_ORDER_RESPONSE =0x17;
	/**
	 * 查询订单明细
	 */
	public static final int FIND_ORDER_MINGXI_RESPONSE =0x18;
	
	/**
	 * 查询网点
	 */
	public static final int FIND_BRANCH_RESPONSE =0x19;
	
	/**
	 * 查找会员号
	 */
	public static final int Search_VIP_RESPONSE = 0x21;
	
	/**
	 * 获取优惠信息响应
	 */
	public static final int GET_PROVILIEGE_RESPONSE = 0x22;
	
	/**
	 * 反馈信息应答
	 */
	public static final int FEEDBACK_RESPONSE = 0x23;
	
	/**
	 * 查找机场回复
	 */
	public static final int FIND_AIRPORT_RESPONSE = 0x40;

	/**
	 * 查找航线回复
	 */
	public static final int FIND_ROUTE_RESPONSE = 0x41;

	/**
	 * 查找机型回复
	 */
	public static final int FIND_PLANE_RESPONSE = 0x42;
	/**
	 * 应答类型,不同的应答类型对应着不同的参数列表
	 */
	private int type;

	/**
	 * 参数列表
	 */
	private Map<String,Object> parameters;

	/**
	 * 应答状态
	 */
	private int status;

	/**
	 * 异常信息
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