import java.util.Scanner;
class Lab3P5{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	Lab3P5 l = new Lab3P5();
	Lab3P5 l1 = new Lab3P5(10);
	Lab3P5 l2 = new Lab3P5("String");
	Lab3P5 l3 = new Lab3P5(10,"String");
	//l.show();l.show(10);l.show("string");l.show(10,"string");
	
	} 
	Lab3P5(){
		System.out.println("constructor without params");
	}
	Lab3P5(int x){
		System.out.println("constructor with int params"+ x);
	}
        Lab3P5(String s){
                System.out.println("constructor with string params"+ s);
        }
        Lab3P5(int x,String s){
                System.out.println("constructor with two int and string params"+ x +" "+ s);
        }
}
