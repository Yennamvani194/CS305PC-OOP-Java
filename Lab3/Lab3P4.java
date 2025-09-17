import java.util.Scanner;

class Lab3P4{
	
	public int sum(int x,int y){
		return(x + y);
	}
	public int sum(int x,int y,int z){
		return(x + y);
	}
	public double sum(double x,double y){
		return(x + y);
	}
	public  static void main(String...args){
		
		Lab3P4 s = new Lab3P4();
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(10,20,30));
		System.out.println(s.sum(10.5,20.3));
	}
}		
		
