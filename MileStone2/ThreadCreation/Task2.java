package com.wipro.ThreadCreation;
import java.util.*;
public class Task2 implements Runnable{
public static void main(String[] args) {
	Task2 task = new Task2();
	Thread thread = new Thread(task);
	thread.start();
}
	public void run()
	{
		Random r = new Random();
		String col[] = {"white","blue","black","green","red","yellow"};
		int i;
		//int p;
		//p = ;
		while((i = r.nextInt(6)) != 4)
		{
			System.out.println(col[i]);
		}
	}
}

