package test3;

import java.util.Scanner;

public class ExamProgram {
		
	
	public static void main(String[] args) {
		Exam exam = new Exam();
		//Exam exam = new Exam(30, 50 ,80);
		
		// 1. 성적 입력
		exam.input();
		 
		// 2. 성적 출력
		exam.print();
		
	}
}
