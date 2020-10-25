package a;

public class Course {
	 private String coursename;
	 int courseid;
	// Teacher teacher;
	 float  credit;
	 float time;
	 String place;
	//Student student;
	 public Courses(int courseid,String coursename,float time,String place,float credit){
		 //super();
		 this.courseid=courseid;
		 this.time=time;
		 this.place=place;
		 this.coursename=coursename;
		 //this.teacher=teacher;
		 this.credit=credit;
	 }	 
//显示已选课程
	 public String toString(){
		 return '课程名称'+courseaname+'课程编号:'+courseid+'课程时间'+time+'教室:'+place+'学分'+credit;
		 
	 }
}
