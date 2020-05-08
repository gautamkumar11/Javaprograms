class Employee
{
	int id;
	String name;
	double sal;
	public Employee(int id, String name, double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	@Override
	public int hashCode()
	{
		return id;
	}
	@Override
	public String toString()
	{
		return name;
	}
	@Override
	public boolean equals(Object obj)
	{
		return this.hashCode()==obj.hashCode();
	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
		Employee emp1 = new Employee(1,"Gautam", 20000);
		Employee emp2 = new Employee(2,"Rakesh", 30000);
		Employee emp3=emp1;
		System.out.println(emp1.id);
		System.out.println(emp2);
		System.out.println(emp1);
		System.out.println(emp1.equals(emp3));
		System.out.println(emp3.hashCode());
		System.out.println(emp1.toString());
	}
}