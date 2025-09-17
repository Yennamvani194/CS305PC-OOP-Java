class Lab3P41{
	public static void main(String...args){
	

	Lab3P41 l = new Lab3P41();
	l.display();l.display(10);l.display("String");l.display(10,"String");
	
	} 
	public void show(){
		System.out.println("method without params");
	}
	public void show(int x){
		System.out.println("method with int params"+x);
	}
        public void show(string s){
                System.out.println("method with string params"+s);
        }
        public void show(int x,string s){
                System.out.println("method with two int and string params"+ x +" "+ s);
        }
}
