package a;
//子类
public class Teacher extends Person {
	String course;
	public Teacher(int id,String name,char sex,String course){
		super(id,name,sex)
		this.course = course;
	}
	public String toString(){
		return'教师信息：'+'教师编号'+id+'教师姓名'+'name'+'性别'+sex+'课程'+course;
		
		
	}
	
	


}
