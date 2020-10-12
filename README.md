 # Java1-
Java课程作业项目仓库

# 阅读程序

## 实验目的
用类描述计算机中CPU的速度和硬盘的容量

## 实验过程
1.  新建四个类，Test--主类，CPU，HardDisk，PC
2.  按题目要求，编写程序
1） Test类：在main方法中依次newCPU，HardDisk，PC对象，且设置speed为2200，disk的amount设置为200。在最后PC对象中调用setCPU（CPU c）,setHardDisk(HardDisk h),show()方法。
2） CPU类：创建构造方法getSpeed(),setSpeed()，getspeed返回speed的值，setSpeed方法将m赋值给speed
3） HardDisk类：创建构造方法getAmount(),setAmount()，getAmount（）返回amount值，setAmount（）方法将m赋值给amount，注意成员变量和全局变量的区别.
4） PC类：创建构造方法setCPU(),setHardDisk(),show()，setCPU（）将c赋值给CPU，setHardDisk（）将h赋值给HD，show()就能显示cpu的速度和容量了。

## 核心方法
1. 方法1 先构建出框架，写出变量，方法
2. 方法2 按照题目创建构造方法
3. 方法3 核心代码
 public class Test {
	 public static void main(String[] args) {
	 	CPU cpu=new CPU();
	 	HardDisk HD=new HardDisk();
	 	cpu.setSpeed(2200);
	 	HD.setAmount(200);
	 	PC pc=new PC();
	 	pc.setCPU(cpu);
	 	pc.setHardDisk(HD);
	 	pc.show();
 	}}

## 实验结果
 CPU速度:2200
 硬盘容量:200
## 实验感想
这次实验，我更深一步了解了类与方法的区别以及应用，java程序的流程，对修饰符也有了了解。而且这是自己在学习java的第一个程序代码，拥有了小小的成就感。
