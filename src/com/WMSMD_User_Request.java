package com;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class WMSMD_User_Request implements KvmSerializable
{
	private static final int INDEX_USERNAME = 0;
	private static final int INDEX_PASSWORD = 1;
	public static Class WMSMD_USER_CLASS = WMSMD_User_Request.class;
	
	public static String NAMESPACE = "http://jaxws_web.com/";
	

	//h2-1
	//h1-1
	//h2-2
	
	//wp1-1
	//wp-1
	//wp1-2
	//wp-2
	//wp1-3
	
	//wp-branch:wp_b_1
	//wp-branch:wp_b_2
	//wp-branch:wp_b_3
	//wp-branch:wp_b_4
	//master-branch:m_b_1
	//master-branch:m_b_2
	//master-branch:m_b_3
	//master-branch:m_b_4

	
	private String passwd;
	private String userName;
	
	//fb1
	//fb2
	//ga1
	//ga2
	
	//gr1
	//fr1
	
	//h1-r1
	//h2-r1
	@Override
	public Object getProperty(int arg0)
	{
		Object obj = null;
		switch (arg0) {
		case INDEX_USERNAME:
			obj = this.getUserName();
			break;
		case INDEX_PASSWORD:
			obj = this.getPasswd();
			break;

		default:
			break;
		}
		return obj;
	}
	
	@Override
	public int getPropertyCount()
	{
		return 2;
	}
	
	@Override
	public void getPropertyInfo(int arg0, Hashtable arg1, PropertyInfo prop)
	{
		switch (arg0) {
		case INDEX_USERNAME:
			//第一种写法
			prop.name = "userName";
			prop.type = PropertyInfo.STRING_CLASS;
			prop.setValue(this.userName);
			break;
		case INDEX_PASSWORD:
			//第二种写法
			prop.setName("passwd");
			prop.setType(PropertyInfo.STRING_CLASS);
			prop.setValue(this.passwd);
			break;
		default:
			break;
		}
		
	}
	
	@Override
	public void setProperty(int arg0, Object arg1)
	{
		// TODO Auto-generated method stub
		switch (arg0) {
		case INDEX_USERNAME:
			setUserName(arg1.toString());
			break;
		case INDEX_PASSWORD:
			setPasswd(arg1.toString());
			break;
		default:
			break;
		}
		
	}
	
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
