import java.util.ArrayList;
import java.util.*;
class Student implements Comparable<Student>{
  private String name;
  private int id;
  private String department;
  private String college;
  Student(String name,int id,String department,String college){
    this.name=name;
    this.id=id;
    this.department=department;
    this.college=college;
  }
  public int compareTo(Student st){
    return department.compareTo(st.department);
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
}
class StudentDemo1{
  public static void main(String args[]){
    ArrayList<Student> students=new ArrayList<Student>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<2;i++){
      students.add(new Student(sc.next(),sc.nextInt(),sc.next(),sc.next()));
    }
    Collections.sort(students);
     for(Student st:students){
      System.out.println(st.getName()+" "+st.getId()+" "+st.getDepartment()+" "+st.getCollege());
  }
}
}