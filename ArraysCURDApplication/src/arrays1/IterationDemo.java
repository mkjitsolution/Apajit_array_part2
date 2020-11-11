package arrays1;

// Objective print 1 to 10

public class IterationDemo {

	public static void main(String[] args) {
		new IterationDemo().way1();
		System.out.println(" ----------------- way 2 ---------------");
		new IterationDemo().way2();
		
	}
	
	public void way1()
	{
		int count = 0;
		for (int i = 0; i < 100000; i++) {
			count++;
			System.out.println(count+" - "+(i+1));
			
		}
	}
	
	public void way2()
	{
		int count = 0;
		int x = 0;
		for(int i = 0;true;)
		{ 
			count++;
			System.out.print("\n"+count+" - "+(++x)+" "+(++x));
			if(x==100000) break;
		}
		
	}
	
}
