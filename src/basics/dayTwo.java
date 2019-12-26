package basics;

public class dayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	Person raj = new Person();
//		raj.age = 29;
//		raj.name =" Raj jain";
//		
//		System.out.println(raj.age);
//		System.out.println(raj.name);
//		
//		Person amit = new Person();
//		System.out.println(amit.age);
//		System.out.println(amit.name);
//		
//		amit.age = 28 ;
//		amit.name = "amit";
//		
//		System.out.println("-----"+amit.age);
//		System.out.println("-----"+amit.name);
//		
//		
//		
//		OverLoadingC bh = new OverLoadingC();
//		
//		bh.search(10, 19);
//		
//		bh.search("c", "D", "M");
//		
//		bh.search("Stri", 2);
		
		
		
		Car a = new Car();
		
		System.out.println(a.color);
		System.out.println(a.wheel);
		a.start();
		a.stop();
		
		Maruti xy = new Maruti();
		
		xy.start();
		System.out.println(xy.model);
		xy.stop();
		xy.MarutiMethod();
		
		
		
	}

}
