package a;
//子类
public class Student extends Person{
	String major;
	//Course course;
	
		
	}
	public Student(int id,String name,char sex，String major){
		super(id,name,sex);
		this.major=major;
	public String toString(){
		return '学生信息：'姓名'+name+'学号'+id+'性别'+sex;
	}



}
