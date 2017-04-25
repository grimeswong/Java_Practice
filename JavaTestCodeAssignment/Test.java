
import java.io.*;
import java.util.*;
import java.text.*;

public class Test {

	public static void main(String[] args) {
	double a = 3.145645;	
	String out = String.format("abc = %.2f",a);
	System.out.println(out);
	//double a = 3.1645456;
	//System.out.printf("a = %.2f", a);
	//double area = 2*(((Math.pow(3,4))+(Math.pow(4,4))+(Math.pow(5,4))));
	//double area =(Math.pow((Math.pow(3,2))+(Math.pow(4,2))+(Math.pow(5,2)),2));
	//System.out.println(" Area = " + area);
	
	Calendar cal = Calendar.getInstance();
	System.out.println(cal.getTime());
	
	//System.out.println(time.toString());
	
	//Date() + SimpleDate Format()
	//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48
	
	//Calender() + SimpleDateFormat()
	//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	//Calendar cal = Calendar.getInstance();
	System.out.println(dateFormat.format(cal.getTime())); //2014/08/06 16:00:22
	Calendar cal2 = Calendar.getInstance();
	System.out.println(cal.compareTo(cal2));
	}

}
