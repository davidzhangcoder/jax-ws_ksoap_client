package com;

import java.io.IOException;

import org.ksoap2.serialization.Marshal;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

public class WMSMD_USER_MARSHAL implements Marshal
{
	
	private static String DATACONTRACT = "http://jaxws_web.com/";
	private static String CLASSNAME = "WMSMD_User_Request";

	
	//gr1
	//fr1
	
	//fb-11
	
	
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
		envelope.addMapping(DATACONTRACT, CLASSNAME, WMSMD_User_Request.class, this);
	}

	@Override
	public void writeInstance(XmlSerializer writer, Object obj)
	throws IOException
	{
		WMSMD_User_Request user = (WMSMD_User_Request)obj;
		writer.startTag(DATACONTRACT, "passwd");
		writer.text(user.getPasswd());
		writer.endTag(DATACONTRACT, "passwd");
		
		writer.startTag(DATACONTRACT, "userName");
		writer.text(user.getUserName());
		writer.endTag(DATACONTRACT, "userName");
	}

}
