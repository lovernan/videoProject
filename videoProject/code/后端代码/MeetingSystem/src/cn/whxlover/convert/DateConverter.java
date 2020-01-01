package cn.whxlover.convert;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date> {

	public Date convert(String source) {
		// TODO Auto-generated method stub
		try {
			if(null != source){//2015-01-23 15:02
				System.out.println(source);
				DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				System.out.println("xxxxxx"+df.parse(source));
				return df.parse(source);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
