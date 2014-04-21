package com;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;


public class KSoapTester
{
	private static final String stringMethodName = "queryStringInfo";
	private static final String stringMethodName2 = "LoginUserInfo";
	private static final String stringNamespace = "http://jaxws_web.com/";
	private static final String stringURL = "http://localhost:8080/jax-ws_web/test";

	public static void main( String[] args )
	{
		SoapObject soapObject = new SoapObject(KSoapTester.stringNamespace,	KSoapTester.stringMethodName2);
		//set property
		WMSMD_User_Request model =  new WMSMD_User_Request();
		model.setUserName("kitty");
		model.setPasswd("123456");
		PropertyInfo propertyInfo = new PropertyInfo();
		propertyInfo.setName("LoginUserInfo");
		propertyInfo.setValue(model);
		propertyInfo.setType(WMSMD_User_Request.class);
		soapObject.addProperty(propertyInfo);
		//end
		
		/**
		 * 生成调用WebService方法的SOAP请求信息。
		 * 创建SoapSerializationEnvelope对象时需要通过SoapSerializationEnvelope类的构造方法设置SOAP协议的版本号。
		 * 该版本号需要根据服务端WebService的版本号设置。
		 * 在创建SoapSerializationEnvelope对象后，不要忘了设置SOAPSoapSerializationEnvelope类的bodyOut属性，
		 * 该属性的值就是在第一步创建的SoapObject对象。
		 */
		SoapSerializationEnvelope soapSerializationEnvelope = new SoapSerializationEnvelope( SoapEnvelope.VER11);
		soapSerializationEnvelope.dotNet = false;
		soapSerializationEnvelope.encodingStyle = "UTF-8";
		//set bodyOut
		soapSerializationEnvelope.setOutputSoapObject(soapObject);
		//add Mapping
		soapSerializationEnvelope.addMapping(KSoapTester.stringNamespace,WMSMD_User_Request.WMSMD_USER_CLASS.getSimpleName(),WMSMD_User_Request.class);
		
		/**
		 *　关键地方在这里：是否传递复杂数据对象．
		 *　如果要使用复杂对象传递数据在这里去register．
		 *         前面数据封装见  set property  部分
		 *    如果是基本数据类型
		 *　　　soapObject.addProperty("in0", "测试WebService接口.");
		 */
		new WMSMD_USER_MARSHAL().register(soapSerializationEnvelope);
		try {
			/**
			 * 创建HttpTransportsSE对象。
			 *  AndroidHttpTransport ht = new AndroidHttpTransport(URL);
			 *  default timeout:20000
			 *  HttpTransportSE(String url, int timeout){}
			 */
			HttpTransportSE httpTransportSE = new HttpTransportSE(
					KSoapTester.stringURL);
			httpTransportSE.debug = true;

			/**
			 * 使用call方法调用WebService方法
			 * <pre>
			 * 这里的第一个参数根据<wsdlsoap:operation soapAction=""/>
			 * 中soapAction来决定是否为空。
			 * </pre>
			 * 第2个参数就是在第3步创建的SoapSerializationEnvelope对象。
			 * <pre>
			 * <p>这里要访问网络还需要权限：AndroidManifest.xml </p>
			 * <uses-permission android:name="android.permission.INTERNET"></uses-permission>
			 * </pre>
			 */
			httpTransportSE.call(null, soapSerializationEnvelope);

			/**
			 * 获得WebService方法的返回结果
			 *
			 * 有两种方法：
			 *
			 * 1、使用getResponse方法获得返回数据。
			 * envelope.getResponse();
			 * 2、使用 bodyIn 及 getProperty。
			 * SoapObject result = (SoapObject)envelope.bodyIn;
			 * result.getProperty("XXX");
			 */

			SoapObject objectResult = (SoapObject) soapSerializationEnvelope.getResponse();
			WMSMD_Message_Response response = new WMSMD_Message_Response();
			for(int i=0;i<objectResult.getPropertyCount();i++){
				response.setProperty(i, objectResult.getProperty(i));
			}
			
			System.out.println( response );
			//System.out.println(JSON.toJSONString(response));
			
			soapSerializationEnvelope.getInfo(WMSMD_Message_Response.class, null);
			//WMSMD_Message_Response [] res = (WMSMD_Message_Response [])soapSerializationEnvelope.getInfo(WMSMD_Message_Response.class, null);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}
}
