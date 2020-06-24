package com.wipro.Encapsulation;
class Author
{
	public static String name;
	public static String email;
	public static char gender;
	Author(String na, String em, char gen)
	{
		name = na;
		email = em;
		gender = gen;
	}
}
class Book
{
	String name1;
	String author;
	double price;
	int qtyInStock;
	//Author a = new Author();
	Book(String nam)
	{
		name1 = nam;
	}
	void setPrice()
	{
		price = 100.0;
	}
	void setQtyInstock()
	{
		qtyInStock = 5;
	}
	double getPrice()
	{
		return price;
	}
	int getQtyInStock()
	{
		return qtyInStock;
	}
	String getName()
	{
		return name1;
	}
	void getAuthor()
	{
		System.out.println("The name of the author is: " + Author.name);
		System.out.println("The emailid of the author is: " + Author.email);
		System.out.println("His gender is: " + Author.gender);
	}
}
public class BookAuthor {
public static void main(String[] args) {
	Book book = new Book("Java");
	Author auth = new Author("Wipro","wipro@wipro.in",'F');
	System.out.println("The name of the book is: " + book.getName());
	System.out.println("The price per book is: " + book.getPrice());
	System.out.println("The total quantity of books in the stock is: " + book.getQtyInStock());
	book.getAuthor();
}
}
