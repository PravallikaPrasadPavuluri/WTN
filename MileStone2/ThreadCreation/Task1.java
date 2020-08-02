package com.wipro.ThreadCreation;
public class Task1 {
public static void main(String[] args) {
	Thread thread1 = new Thread("Scooby")
			{
				public void run()
				{
					System.out.println(Thread.currentThread().getName());
				}
			};
			
	Thread thread2 = new Thread("Shabby")
	{
		public void run()
		{
			System.out.println(Thread.currentThread().getName());
		}
	};
	thread1.start();
	thread2.start();
}
}
