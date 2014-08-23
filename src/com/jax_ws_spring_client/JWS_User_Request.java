package com.jax_ws_spring_client;

import java.util.Calendar;
import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class JWS_User_Request implements KvmSerializable
{

	private static final int INDEX_ID = 0;
	private static final int INDEX_FIRSTNAME = 1;
	private static final int INDEX_LASTNAME = 2;
	private static final int INDEX_EMAIL = 3;
	private static final int INDEX_USERNAME = 4;
	private static final int INDEX_PASSWORD = 5;
	private static final int INDEX_CREATEDBY = 6;
	private static final int INDEX_CREATEDTIME = 7;
	private static final int INDEX_UPDATEDBY = 8;
	private static final int INDEX_UPDATEDTIME = 9;
	
	public static Class JWS_USER_CLASS = JWS_User_Request.class;
	
	public static String NAMESPACE = "http://dz.com/";
	

	private Integer ID;
	private String firstName;	
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private Integer createdBy;
	private Calendar createdTime;
	private Integer updatedBy;
	private Calendar updatedTime;

	
	@Override
	public Object getProperty(int arg0)
	{
		Object obj = null;
		switch (arg0) {
		case INDEX_ID:
			obj = this.getID();
			break;
		case INDEX_FIRSTNAME:
			obj = this.getFirstName();
			break;
		case INDEX_LASTNAME:
			obj = this.getLastName();
			break;
		case INDEX_EMAIL:
			obj = this.getEmail();
			break;
		case INDEX_USERNAME:
			obj = this.getUserName();
			break;
		case INDEX_PASSWORD:
			obj = this.getPassword();
			break;
		case INDEX_CREATEDBY:
			obj = this.getCreatedBy();
			break;
		case INDEX_CREATEDTIME:
			obj = this.getCreatedTime();
			break;
		case INDEX_UPDATEDBY:
			obj = this.getUpdatedBy();
			break;
		case INDEX_UPDATEDTIME:
			obj = this.getUpdatedTime();
			break;

		default:
			break;
		}
		return obj;

	}

	@Override
	public int getPropertyCount() {
		return 10;
	}

	@Override
	public void getPropertyInfo(int arg0, Hashtable arg1, PropertyInfo prop)
	{
		switch (arg0) {
		case INDEX_ID:
			//第二种写法
			prop.setName("id");
			prop.setType(PropertyInfo.INTEGER_CLASS);
			prop.setValue(this.ID);
			break;
		case INDEX_FIRSTNAME:
			prop.setName("firstName");
			prop.setType(PropertyInfo.STRING_CLASS);
			prop.setValue(this.firstName);
		case INDEX_LASTNAME:
			prop.setName("lastName");
			prop.setType(PropertyInfo.STRING_CLASS);
			prop.setValue(this.lastName);
		case INDEX_EMAIL:
			prop.setName("email");
			prop.setType(PropertyInfo.STRING_CLASS);
			prop.setValue(this.email);
		case INDEX_USERNAME:
			prop.setName("userName");
			prop.setType(PropertyInfo.STRING_CLASS);
			prop.setValue(this.userName);
		case INDEX_PASSWORD:
			prop.setName("password");
			prop.setType(PropertyInfo.STRING_CLASS);
			prop.setValue(this.password);
		case INDEX_CREATEDBY:
			prop.setName("createdBy");
			prop.setType(PropertyInfo.INTEGER_CLASS);
			prop.setValue(this.createdBy);
//		case INDEX_CREATEDTIME:
//			prop.setName("createdTime");
//			prop.setType(PropertyInfo.OBJECT_CLASS);
//			prop.setValue(this.createdTime);
		case INDEX_UPDATEDBY:
			prop.setName("updatedBy");
			prop.setType(PropertyInfo.INTEGER_CLASS);
			prop.setValue(this.updatedBy);
//		case INDEX_UPDATEDTIME:
//			prop.setName("updatedTime");
//			prop.setType(PropertyInfo.OBJECT_CLASS);
//			prop.setValue(this.updatedTime);

		default:
			break;
		}
		
	}

	@Override
	public void setProperty(int arg0, Object arg1)
	{
		switch (arg0) {
		case INDEX_ID:
			//第二种写法
			this.setID((Integer)arg1);
			break;
		case INDEX_FIRSTNAME:
			this.setFirstName( arg1.toString() );
			break;
		case INDEX_LASTNAME:
			this.setLastName( arg1.toString() );
			break;
		case INDEX_EMAIL:
			this.setEmail( arg1.toString() );
			break;
		case INDEX_USERNAME:
			this.setUserName( arg1.toString() );
			break;
		case INDEX_PASSWORD:
			this.setPassword( arg1.toString() );
			break;
		case INDEX_CREATEDBY:
			this.setCreatedBy( (Integer)arg1 );
			break;
//		case INDEX_CREATEDTIME:
//			prop.setName("createdTime");
//			prop.setType(PropertyInfo.OBJECT_CLASS);
//			prop.setValue(this.createdTime);
		case INDEX_UPDATEDBY:
			this.setUpdatedBy( (Integer)arg1 );
			break;
//		case INDEX_UPDATEDTIME:
//			prop.setName("updatedTime");
//			prop.setType(PropertyInfo.OBJECT_CLASS);
//			prop.setValue(this.updatedTime);

		default:
			break;
		}
		
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Calendar getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Calendar createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Calendar getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Calendar updatedTime) {
		this.updatedTime = updatedTime;
	}

}
