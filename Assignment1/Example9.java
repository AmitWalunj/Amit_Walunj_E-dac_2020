//09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
//Now convert the entered days into complete years, months and days and print them.

import java.util.Scanner;
public class Example9
{
    public static void main(String args[])
    {
        int x, year, month, day;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        x = s.nextInt();
        year = x / 365;
        month = ((x/365)/30);
        day = ((x%365)/30);
        System.out.println("Year: "+year);
        System.out.println("Month :"+month);
        System.out.println("day :"+day);
    }
}