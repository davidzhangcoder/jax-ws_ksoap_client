package com.jax_ws_spring_client;

import java.io.IOException;

import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class JWS_USER_MARSHAL implements Marshal
{
	
	private static String DATACONTRACT = "http://dz.com/";
	private static String CLASSNAME = "JWS_User_Request";

	
	//gr1
	//fr1
	
	
	@Override
	public Object readInstance(XmlPullParser parser, String arg1, String arg2,
			PropertyInfo arg3) throws IOException, XmlPullParserException
	{
		// TODO Auto-generated method stub
		
		return parser.nextText();
		//return WMSMD_User_Request.fromString(parser.nextText());
	}

	@Override
	public void register(SoapSerializationEnvelope envelope)
	{
		// TODO Auto-generated method stub
		envelope.addMapping(DATACONTRACT, CLASSNAME, JWS_User_Request.JWS_USER_CLASS, this);
	}

	@Override
	public void writeInstance(XmlSerializer writer, Object obj)
	throws IOException
	{
		JWS_User_Request user = (JWS_User_Request)obj;
		writer.startTag("", "password");
		writer.text(user.getPassword());
		writer.endTag("", "password");
		
		writer.startTag("", "userName");
		writer.text(user.getUserName());
		writer.endTag("", "userName");
	}

}
