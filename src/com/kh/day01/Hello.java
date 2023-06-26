package com.kh.day01;

public class Hello {
	
	public static int sum(int num1, int num2) {
		// This method must return a result of type int
		// 위와 같은 메세지가 뜨면 리턴을 썼는지 확인해볼것
		return num1 + num2;
	}
	public static void main(String[] args)
	{
		//int int = 20;
		//Syntax error on token "int", invalid VariableDeclaratorId
		//식별자로 키워드를 사용하면 위와 같은 오류가 나온다. 
		int i = 20;
		int s;   
		char a;
		// 노란줄은 실행에 영향을 미치지 않음
		// 선언하고 쓰이지 않았다고 얘기하는것
		
		a = '?';
		s = sum(i, 10);
		System.out.println(s);
		System.out.println(a);
		System.out.println("Hello");
	}
}
