# javapractice

StaticTest.java

class Circle {
	static double pi=3.14;
	static int objectNo=0;
	int radius;
	Circle(int r){
		radius=r;
		objectNo++;
	}
	Circle(){
		radius=2;
		objectNo++;
	}
	double getArea(){
		return pi*radius*radius;
	}
	static void setPI(double p){
		pi=p;
	}
	void setRadius(int r){
		radius=r;
	}
	static void displayNo(){
		System.out.println("当前圆对象个数是："+objectNo);
	}
}

public class StaticTest {
	public static void main(String args[])
	{
		Circle cir1=new Circle(5);
		System.out.println("cir1圆周率是："+Circle.pi);
		System.out.println("cir1的半径是："+cir1.radius);
		System.out.println("cir1的面积是："+cir1.getArea());
		cir1.displayNo();
		cir1.setRadius(10);
		Circle cir2=new Circle();
		cir2.setPI(3.1415);
		System.out.println("cir1圆周率是："+cir1.pi);
		System.out.println("cir1的半径是："+cir1.radius);
		System.out.println("cir2的半径是："+cir2.radius);
		System.out.println("cir2的面积是："+cir2.getArea());
		cir2.displayNo();
		Circle[] cirs=new Circle[5];
		for(int i=0;i<cirs.length;i++){
			cirs[i]=new Circle();
		}
	}
}



Overload.java



class Overload {
	int m,n;
	Overload(){
		m=0;
		n=0;
	}
	Overload(int a,int b){
		m=a;
		n=b;
	}
	int add(){
		System.out.println("无参加法"+m+"+"+n+"="+(m+n));
		return m+n;
	}
	int add(int a,int b){
		System.out.println("整形加法"+a+"+"+b+"="+(a+b));
		return a+b;
	}
	double add(double a,double b){
		System.out.println("实型加法"+a+"+"+b+"="+(a+b));
		return a+b;
	}
	double add(int a,int b,double c){
		System.out.println("混合加法"+a+"+"+b+"+"+c+"="+(a+b+c));
		return a+b+c;
	}
	//double add(int a,int b){
	//	System.out.println("整型加法但返回实型值"+a+"+"+b+"="+(a+b));
	//	return (double)(a+b);
	//}
	
	public static void main(String[] aygs)
	{
		int ix,iy;
		double dx,dy;
		Overload ov=new Overload();
		ix=ov.add();
		iy=ov.add(3,6);
		dx=ov.add(2.1,5.3);
		dy=ov.add(3,6,2.2);
	}
}

Clock.java

package packone;

public class Clock{
    public int hour;
    private int minute;
    protected int second;
    public Clock(int i,int j,int k){
        setAll(i,j,k);
   }
   void setAll(int i,int j,int k){
	   hour=i;
	   minute=j;
	   second=k;
   }
   public int getHour(){
	   return hour;
   }
   public int getMinute(){
	   return minute;
   }
   public int getSecond(){
	   return second;
   }
}

A.java

package packone;
class A {
	public static void main(String[] args){
		Clock c=new Clock(5,20,10);
		System.out.println("从类A中访问Clock hour="+c.hour);
		System.out.println("从类A中访问Clock minute="+c.minute);
		System.out.println("从类A中访问Clock second="+c.second);
	}
}

B.java

package packtwo;
import packone.*;
class B {
	public static void main(){
		Clock c=new Clock(8,30,5);
		System.out.println("从类B中访问Clock hour="+c.getHour());
		System.out.println("从类B中访问Clock minute="+c.getMinute());
		System.out.println("从类B中访问Clock second="+c.getSecond());
	}
}
