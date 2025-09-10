import java.util.Scanner;
class Lab2P1{
	public static void main(String...args){
	        Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		s.nextline();
		
		String op=s.nextLine();
		
		switch(op){
			case "++" :
					system.out.println("post:"+ (a++));
					system.out.println("pre:"+ (++a));
					break;
					
			case "--" :
					system.out.println("post:"+ (a--));
					system.out.println("pre:"+ (--a));
					break;
					
			case "+" : 
					a = +a;
					system.out.println("Unary+: "+(a));
					break;
			
			case "-" :
					a = -a;
					system.out.println("Unary+: "+(a));
					break;
									
			case "-" : 
					a = ~a;
					system.out.println("Unary+:" +(~a));
					break;
					
			default:
					System.out.println("enter correct unary operator");
					break;		
							
			}							
		}
}
