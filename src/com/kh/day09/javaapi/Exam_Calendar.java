package com.kh.day09.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar openDate = Calendar.getInstance();
		Calendar closeDate = Calendar.getInstance();
		Exam_Calendar ex = new Exam_Calendar();
		// 개강일
		openDate.clear();
		openDate.set(2023, 4, 15, 9, 0);
		// 종강일
		closeDate.clear();
		closeDate.set(2023, 9, 26, 5, 50);
		closeDate.set(Calendar.HOUR_OF_DAY, 17);
		
		ex.printCalendar("현재", today); // 객체만든다음호출
		ex.printCalendar("개강일", openDate);
		ex.printCalendar("종강일", closeDate);
		
//		new Exam_Calendar().printCalendar("현재", today);
//		new Exam_Calendar().printCalendar("개강일", openDate);
//		new Exam_Calendar().printCalendar("종강일", closeDate);
		// 객체를 호출해서 사용하는 방법
//		printCalendar("현재", openDate);
		// Cannot make a static reference to the non-static method printCalendar(String, Calendar) from the type Exam_Calendar
		// method를 static을 주어야 사용할 수 있다.
		
//		openDate.set(Calendar.HOUR_OF_DAY, 9);
//		openDate.set(Calendar.MINUTE, 0);
		// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
		
		
	}
	// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
	public void printCalendar(String title, Calendar cal) {
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.print(title + " ");
		System.out.print(cal.get(Calendar.YEAR) + "/" + 
						  (cal.get(Calendar.MONTH)+1) + "/" +
						   cal.get(Calendar.DAY_OF_MONTH) + "/");
		
		switch(dayOfWeek) {
			case 1 : System.out.print("일요일"); break;
			case 2 : System.out.print("월요일"); break;
			case 3 : System.out.print("화요일"); break;
			case 4 : System.out.print("수요일"); break;
			case 5 : System.out.print("목요일"); break;
			case 6 : System.out.print("금요일"); break;
			case 7 : System.out.print("토요일"); break;
		}
		
		System.out.print("(" +cal.get(Calendar.HOUR_OF_DAY)+"시) " +
						   cal.get(Calendar.HOUR)+"시 "+
					   	   cal.get(Calendar.MINUTE)+ "분 " +
						   cal.get(Calendar.SECOND)+ "초 " +
					   	   cal.get(Calendar.MILLISECOND)+ "밀리초");
		System.out.println();
	}
}
