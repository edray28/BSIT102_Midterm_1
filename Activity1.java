import java.util.Calendar;
import java.util.GregorianCalendar; 
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Activity1 {
    
    public static void main(String[] args) throws Exception {
   Date date =new Date();
   Scanner in =new Scanner(System.in);
   SimpleDateFormat format=new  SimpleDateFormat("dd-M-yyyy");
   
    Calendar cal =new GregorianCalendar();
    
   System.out.println("Enter your Birthdate");
   String input_bday = in.nextLine();
    
   Date bday = format.parse(input_bday);
    
   int year = cal.get(Calendar.YEAR);
   cal.setTime(bday);
    
   int byear = cal.get(Calendar.YEAR);
   int age = year - byear;
   
   System.out.println("My Age is " +age);
  
    
  }
}
