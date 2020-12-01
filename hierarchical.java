import java.util.Scanner;

class Person{
	String name;
	int phno;
	public void per(){
		Scanner s = new Scanner(System.in);

		System.out.print("Enter your name :- ");
		name = s.nextLine();
		
		System.out.print("Enter phno    :- ");
		phno = s.nextInt();

		System.out.println("Name  : " + name);
		System.out.println("Ph no : " + phno);		
	}
}

class Employee extends Person{
	int id;
	int sal;
	public void emp(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Id :- ");
		id = sc.nextInt();
		System.out.print("Enter your Salary :- ");
		sal = sc.nextInt();

		System.out.println("Name    : " + name);
		System.out.println("Phone   : " + phno);
		System.out.println("Emp. Id : " + id);
		System.out.println("Salary  : " + sal);
	}
}

class Bank extends Person{
	int accno;
	public void acc(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an Account no. :- ");
		accno = sc.nextInt();
		System.out.println("Name     : " + name + "\nPhone    : " + phno + "\nAccount  : " + accno);
	}
}

class Hierarchy{
	public static void main(String []args){
		Employee emp = new Employee();
		Bank b = new Bank();

		emp.per();
		emp.emp();
		b.per();
		b.acc();
	}
}