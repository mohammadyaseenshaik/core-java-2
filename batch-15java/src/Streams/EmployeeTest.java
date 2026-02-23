package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {
int id;
String name;
String dept;
long salary;
String city;
public EmployeeTest(int id, String name, String dept, long salary, String city) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
	this.city = city;	
}
@Override
public String toString() {
	return "EmployeeTest [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", city=" + city
			+ "]";
}
public static void main(String[] args) {
	EmployeeTest a=new EmployeeTest(1, "yaseen", "java", 10000, "guntur");
	EmployeeTest a1=new EmployeeTest(2, "manjith", "sql", 11000, "vjwda");
	EmployeeTest a2=new EmployeeTest(4, "raju", "devops", 14000, "guntur");
	EmployeeTest a3=new EmployeeTest(6, "sai", "sql", 17000, "atchampet");
	EmployeeTest a4=new EmployeeTest(8, "nagendra", "sql", 15000, "vjwda");
	EmployeeTest a5=new EmployeeTest(9, "yesu", "devops", 16000, "guntur");
	EmployeeTest a6=new EmployeeTest(5, "nazeer", "devops", 19000, "atchampet");
	EmployeeTest a7=new EmployeeTest(3, "barath", "java", 34000, "guntur");
	EmployeeTest a8=new EmployeeTest(7, "tarun", "sql", 65000, "atchampet");
	EmployeeTest a9=new EmployeeTest(11, "chandra", "java", 30000, "vjwda");
	List<EmployeeTest> list=Arrays.asList(a,a1,a2,a3,a4,a5,a6,a7,a8,a9);
	list.stream()
	    .filter(x->x.dept=="devops")
	    .map(x->x.salary*1.5)
	    .sorted()
	    .distinct()
	    .limit(2)
	    .skip(1)
	    .forEach(x->System.out.println(x));
	System.out.println("============================");
	
	List<Object> list1=list.stream().filter(x->x.city=="guntur").collect(Collectors.toList());
	System.out.println("only guntur city employees ::"+list1);
	
	System.out.println("========count=============");
	long count=list.stream().count();
	System.out.println(count);
	
	long min=list.stream().mapToLong(x->x.salary).min().getAsLong();
	System.out.println("min::"+min);
	
	long max=list.stream().mapToLong(x->x.salary).max().getAsLong();
	System.out.println(max);
	
	long sum=list.stream().mapToLong(x->x.salary).sum();
	System.out.println(sum);
	
	List<Double> empsalary=list.stream().filter(x->x.dept=="sql").map(x->x.salary*1.5).collect(Collectors.toList());
	System.out.println(empsalary);
	System.out.println("=========match operations======");
	boolean anymatch=list.stream().anyMatch(x->x.dept=="java");
	System.out.println(anymatch);
	boolean allmatch=list.stream().allMatch(x->x.dept=="devops");
	System.out.println(allmatch);
	Optional<EmployeeTest> findany=list.stream().findAny();
	System.out.println(findany);
System.out.println("======second hihest salary======");

long hsalary=list.stream()
                 .map(x->x.salary)
                  .distinct()
                   .sorted(Comparator.reverseOrder())
                   .skip(1)
                   .findFirst().get();
                  System.out.println(hsalary);



long count1=list.stream().filter(x->x.dept.equals("java")).count();
System.out.println(count1);


long deptcount=list.stream().map(x->x.dept).distinct().count();
                  System.out.println("deptcount::"+deptcount);
                  
        
}

}
