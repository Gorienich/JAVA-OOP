package Judo;

public class Date {
private int day;
private int month;
private int year;

//ctor
public Date (int day, int month, int year) {
	this.day = day;
	this.month = month;
	this.year = year;
}

//copy ctor
public Date(Date other) {
	this.day = other.day;
	this.month = other.month;
	this.year = other.year;
}
//methodology

public Date() {
	this.day = 0;
	this.month =0;
	this.year = 0;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}
//overwriting
public String toString() {
	return Integer.toString(this.day) + " / " + Integer.toString(this.month) +
		   " / " + Integer.toString(this.year);
}
}
