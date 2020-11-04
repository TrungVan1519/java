package package6_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//// Chuyen Date sang String
		System.out.println("==> Chuyen Date sang String");
		convertDateToString();
		
		//// Chuyen String sang Date
		System.out.println("\n==> Chuyen String sang Date");
		convertStringToDate();
	}

	private static void convertDateToString() {
		//// Nhap du lieu la Date
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println("Date ban dau: " + date);
		String string = null;
		
		//// Chuyen Date sang String
		// Cach 1: Chuyen String bat ky
		SimpleDateFormat stringFormater1 = new SimpleDateFormat();
		stringFormater1.applyPattern("dd-MM-yyyy");
		string = stringFormater1.format(date);
		System.out.println("Kieu 1: " + string);
		
		// Cach 2: Chuyen String chua ngay, thang, nam va gio, phut, giay tinh theo
		//		thuoc do 24h
		SimpleDateFormat stringFormater2 = new SimpleDateFormat();
		stringFormater2.applyPattern("dd/MM/yyyy HH:mm:ss");
		string = stringFormater2.format(date);
		System.out.println("Kieu 2: " + string);
		// > Su dung "HH" thi se lay theo thuoc do 24h
		
		// Cach 3: Chuyen String chua ngay, thang, nam va gio, phut, giay tinh theo
		//		thuoc do 12h
		SimpleDateFormat stringFormater3 = new SimpleDateFormat();
		stringFormater3.applyPattern("dd/MM/yyyy hh:mm:ss aaa");
		string = stringFormater3.format(date);
		System.out.println("Kieu 3: " + string);
		// > Su dung "hh" thi se lay theo thuoc do 12h
		// > Su dung "aaa" thi se phan biet PM, AM
	}

	private static void convertStringToDate() {
		//// Nhap du lieu la String
		System.out.println("Nhap ngay sinh theo dinh dang (dd/MM/yyyy):");
		String string = s.nextLine();
		Date date = null;
		
		//// Chuyen String sang Date
		// Cach 1: Su dung new SimpleDateFormat() co doi so truyen vao
		SimpleDateFormat dateFormater1 = new SimpleDateFormat("dd/MM/yyyy");
		try {
			// Chuyen String sang Date
			date = dateFormater1.parse(string); 
			System.out.println("Cach 1: " + date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Cach 2: Su dung new SimpleDateFormat() khong co doi so truyen vao
		//		va su dung applyPattern()
		SimpleDateFormat dateFormater2 = new SimpleDateFormat();
		dateFormater2.applyPattern("dd/MM/yyyy");
		try {
			// Chuyen String sang Date
			date = dateFormater2.parse(string);
			System.out.println("Cach 2: " + date);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
