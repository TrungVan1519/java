package package5_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		//// Khoi tao
		Calendar calendar = Calendar.getInstance();
		// > Chu y: Dung nham lan su dung "new", obj Calendar khong khoi tao bang "new"
		
		//// Lay nam, thang, ngay
		System.out.println("==> Lay ngay, thang, nam roi rac");
		System.out.println("+ Nam hien tai: " + calendar.get(Calendar.YEAR));
		System.out.println("+ Thang hien tai: " + (calendar.get(Calendar.MONTH) + 1));
		// > Khi lay thang tu luon tinh tu 0, nen phai +1
		System.out.println("+ Ngay hien tai trong thang: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		//// Lay ngay, thang, nam, gio, phut, giay cung luc
		System.out.println("\n==> Lay ngay, thang, nam, gio, phut, giay cung luc");
		Date date = calendar.getTime();
		System.out.println(date);
		
		//// Lay ngay, thang, nam cung luc nhung khong lay gio, phut, giay
		System.out.println("\n==> Lay ngay, thang, nam cung luc nhung khong lay gio, phut, giay");
		date = calendar.getTime(); // > Van lay ngay, thang, nam, gio, phut, giay
		SimpleDateFormat dateFormater = new SimpleDateFormat("dd/MM/yyyy"); // > Sau do phai format
		System.out.println(dateFormater.format(date));
		// > Phan nay se noi ro hon trong package6_simpledateformat
	}
}
