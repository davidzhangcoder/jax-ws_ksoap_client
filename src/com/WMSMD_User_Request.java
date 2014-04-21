package com;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class WMSMD_User_Request implements KvmSerializable
{
	private static final int INDEX_USERNAME = 0;
	private static final int INDEX_PASSWORD = 1;
	public static Class WMSMD_USER_CLASS = WMSMD_User_Request.class;

	private String passwd;
	private String userName;
	
	//fr1
	//fr2
	//fr3
	//fr4
	@Override
	public Object getProperty(int arg0) {
		return null;
	}
	@Override
	public int getPropertyCount() {
		return 0;
	}
	@Override
	public void getPropertyInfo(int arg0, Hashtable arg1, PropertyInfo arg2) {
		
	}
	@Override
	public void setProperty(int arg0, Object arg1) {
		
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
