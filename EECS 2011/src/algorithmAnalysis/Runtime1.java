package algorithmAnalysis;

public class Runtime1 {

	static long start;
	static long stop;
	static long elapsed;
	public static void main(String[] args)throws InterruptedException{
		for (int N=100; N<=1000000; N=N*5) {
		start = System.currentTimeMillis();
		for (int i = 0; i <= 2*N; i++) {
			if(i == N)
			{
				for(int j = 0; j < i; j++)
				{
					for(int k = 0; k < i; k++){
//						System.out.println("Hi, What's up?");
						System.out.println("For N=" + N + " RT in msec: "+ elapsed);
					}
				}
			}
			else
			{
				for(int j = 0; j < i; j++)
				{
//					System.out.println("You didn't tell me yet, Whats going on?");
					System.out.println("For N=" + N + " RT in msec: "+ elapsed);
				}
			}
		Thread.sleep(10); }
		stop = System.currentTimeMillis();
		elapsed = (long)(stop - start);
		System.out.println();
		System.out.println("For N=" + N + " RT in msec: "+ elapsed); }}
		
}	
