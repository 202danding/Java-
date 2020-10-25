package a;
import java.url.Scanner;
public class Test {
  public static void main(String[] args){ 
    Scanner in=new Scannwe(System.in);
    COurse a=null;
    Student b=new Student(2019311181,'张三'，'M');
    System.out.println('学生信息')；
    System.out.println(b);
    Teacher c=new Teacher(10,'李四','M','英语');
    Teacher d=new Teacher(11,'王五','W','语文');
    System.out.println('教师信息');
    System.out.println(c);
    System.out.println(d);
    Course e=new COurse('语文',1,'101',7.50,3);
    Course f=new COurse('英语',2,'102',9.40,4);
    System.out.println('课程信息');
    System.out.println(e);
    System.out.println(f);
    System.out.println('输入序号1，2选课');
    int x=in.nextInt();
    if (x==1){
    a=e;
    System.out.println('已选课程信息'+e);
    System.out.println(d);
    }else if{(x==2){
    a=f;
    System.out.println('已选课程信息'+f);
     System.out.println(c);
    }else{
    System.out.println('未查到该课程');
    }
    System.out.println(w);
    System.out.println('已选课程信息'+a);
    System.out.println('输入序号1，2选课');
    int y=in.nextInt();
    while(x==1)
      if(y==1){
      a=e;
    System.out.println('已退课程信息'+e);
    System.out.println(d);
      break;
      }else{
      System.out.prirntln('未查到该课程')；
      break;
      }
       while(x==2)
      if(y==2){
      a=f;
    System.out.println('已退课程信息'+f);
    System.out.println(c);
      break;
      }else{
      System.out.prirntln('未查到该课程')；
      break;
}

    }
    
  }


