package com.kh.day04.run;

import java.util.Scanner;

import com.kh.day03.array.exercise.Exercise_Array1;
import com.kh.day04.dimarray.exercise.Exercise_DimArray;
import com.kh.day04.myexception.exercise.Exercise_Exception;

public class Run {
	public static void main(String[]args) {
		Exercise_Exception excp = new Exercise_Exception();
//		excp.exercise1();
//		excp.exercise2();
//		excp.exercise3();
//		excp.exercise4();
		
		Exercise_Array1 exarr = new Exercise_Array1();
//		exarr.exercise1();
//		exarr.exercise2();
//		exarr.arryCopyExercise();
		exarr.lottoExercise();
		
		Exercise_DimArray dimArr = new Exercise_DimArray(); 
//		dimArr.exercise1();
//		dimArr.exercise2();
//		dimArr.exercise3();
//		dimArr.exercise4();
//		dimArr.exercise5();
		
	}
}
