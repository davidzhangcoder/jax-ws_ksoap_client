package com;

import java.util.Hashtable;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;

public class WMSMD_Message_Response implements KvmSerializable
{

	private static final int INDEX_MESSAGE = 0;
	private static final int INDEX_RESULT = 1;
	private static final int INDEX_SUCCESS = 2;
	public static Class WMSMD_Message_CLASS = WMSMD_Message_Response.class;
	
	// 返回 操作信息
	private String message;
	
	//是否 成功 （状态 ）
	private Boolean success;
	
	//返回操作对象
	private Object result;
	//getter and setter
	//......
	
	
	
	
	/**重写KvmSerializable的方法**/
	@Override
	public Object getProperty(int index) {
		// TODO Auto-generated method stub
		Object obj = null;
		switch (index) {
		case INDEX_MESSAGE:
			obj = getMessage();
			break;
		case INDEX_SUCCESS:
			obj = getSuccess();
			break;
		case INDEX_RESULT:
			obj = getResult();
			break;
		default:
			break;
		}
		return obj;
	}

	@Override
	public int getPropertyCount() {
		// TODO Auto-generated method stub
		return 3;
	}

	@Override
	public void getPropertyInfo(int index, Hashtable arg1, PropertyInfo prop) {
		// TODO Auto-generated method stub
		switch (index) {
		case INDEX_MESSAGE:
			//第一种写法
			prop.name = "message";
			prop.type = PropertyInfo.STRING_CLASS;
			prop.setValue(this.message);
			break;
		case INDEX_SUCCESS:
			//第二种写法
			prop.setName("success");
			prop.setType(PropertyInfo.BOOLEAN_CLASS);
			prop.setValue(this.success);
			break;
		case INDEX_RESULT:
			prop.setName("result");
			prop.setType(PropertyInfo.OBJECT_CLASS);
			prop.setValue(this.result);
			break;
		default:
			break;
		}
	}

	@Override
	public void setProperty(int index, Object objVal) {
		// TODO Auto-generated method stub
		switch (index) {
		case INDEX_MESSAGE:
			setMessage(objVal.toString());
			break;
		case INDEX_SUCCESS:
			setSuccess(Boolean.parseBoolean(objVal.toString()));
			break;
		case INDEX_RESULT:
			SoapObject objectResult = (SoapObject)objVal;
			WMSMD_User_Request response = new WMSMD_User_Request();
			for(int i=0;i<objectResult.getPropertyCount();i++){
				response.setProperty(i, objectResult.getProperty(i));
			}
			setResult(response);
			break;
		default:
			break;
		}
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}	
	
	

}
