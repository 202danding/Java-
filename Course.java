package a;

public class Course {
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
//��ʾ��ѡ�γ�
	 public void displayCourse();{
		 System.out.println("ѧ��"+this.sname+"��ѡ�γ��У�");
		 
	 }
}
