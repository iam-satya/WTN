
package com.wtn.Inheritance;

 class Person1 
{
private String name;

public Person1(String n)
{ 
	name=n; 
} 
public void setName(String n) 
{ 
	name=n; 
} 
public String getName() 
{ 
	return name;
} 
public String toString()
{
	return name; 
} 
}




class Employee extends Person1 
{
	private double annual_salary; 
	private int emp_yr; 
	private String insurance_no;
	public Employee(String n,double a, int y, String i)
	{ 
		super(n); 
		annual_salary=a; 
		emp_yr=y; 
		insurance_no=i;
		} 
	public void setSalary(double a)
	{ 
		annual_salary=a;
		}
	public void setYear(int y) 
	{
      emp_yr=y; 
} 
	public void setInsurance_no(String i)
	{ 
		insurance_no=i;
		} 
	public double getSalary() 
	{
		return annual_salary; 
		} 
	public int getYear() 
	{
		return emp_yr;
		} 
	public String getInsurance_no()
	{
		return insurance_no;
		}
	public String toString() {
		return super.toString()+" "+annual_salary+" "+emp_yr+" "+insurance_no;
		} 
	} 

class Person 
{
	public static void main(String[] args)
	{
		Person1 p= new Person1("abc");
		Employee e=new Employee("abc",10000, 2015, "abcd"); 
		System.out.println(p); 
		System.out.println(e); 
		}
	}







