package com.wipro.Encapsulation;
class Author
{
	String name;
	String email;
	char gender;
	Author()
	{
		name = "Wipro";
		email = "Wipro@gmail.com";
		gender = 'M';
	}
}
class Book
{
	String name;
	String author;
	double price;
	int qtyInStock;
	Author a = new Author();
	Book()
	{
		name = "Talent";
	}
	void setprice()
	{
		price = 100;
	}
	void setqtyInstock()
	{
		qtyInStock = 5;
	}
	double getprice()
	{
		return price;
	}
	int getqtyInStock()
	{
		return qtyInStock;
	}
	String getname()
	{
		return name;
	}
	void getAuthor()
	{
		System.out.println("The name of the author is: " + a.name);
		System.out.println("The emailid of the author is: " + a.email);
		System.out.println("His gender is: " + a.gender);
	}
}
public class BookAuthor {
public static void main(String[] args) {
	Book book = new Book();
	System.out.println("The name of the book is: " + book.getname());
	System.out.println("The price per book is: " + book.getprice());
	System.out.println("The total quantity of books in the stock is: " + book.getqtyInStock());
	book.getAuthor();
}
}
