package a;

public class Course {
	 private String coursename;
	int courseid;
	float  credit;
	 float time;
	 String place;
	 public Courses(String coursename,int courseid,String place,float time,float credit){
		 this.courseid=courseid;
		 this.time=time;
		 this.place=place;
		 this.coursename=coursename;
		 this.credit=credit;
	 }	 
//显示已选课程
	 public String toString(){
		 return '课程名称'+courseaname+'课程编号:'+courseid+'课程时间'+time+'教室:'+place+'学分'+credit;
		 
	 }
}
