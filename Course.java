package a;

public class Courses {
	 private String coursename;
	 int courseid;
	 Teacher teacher;
	 float  credit;
	 Student student;
	 public Course(int courseid,String coursename,Teacher teacher,float credit){
		 super();
		 this.courseid=courseid;
		 this.coursename=coursename;
		 this.teacher=teacher;
		 this.credit=credit;
	 }	 
//显示已选课程
	 public void displayCourse();{
		 System.out.println("学生"+this.sname+"所选课程有：");
		 
	 }
}
