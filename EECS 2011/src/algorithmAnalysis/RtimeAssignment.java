package algorithmAnalysis;

public class RtimeAssignment {

	public static void main(String[] args) throws InterruptedException{
		for (int N=100; N<=1000000; N=N*5) {
		long start = System.currentTimeMillis();
		for (int i = 1; i <= N; i++) {
		for (int j = 1; j <= Math.pow(N,1.5); j++) {
		i = i*2;
		j = j*2;
		Thread.sleep(10); } }
		long stop = System.currentTimeMillis();
		long elapsed = (long)(stop - start);
		System.out.println();
		System.out.println("For N=" + N + " RT in msec: "+elapsed); }
		}	
//		for (int N=200; N<=1000000; N=N*5) 
//			{
//				int sum=0;
//				long start = System.currentTimeMillis();
//			 	for (int i = 1; i <= N; i++) {
//				for (int j = 1; j <= N; j++) {
//				sum=sum+1;}}
//				long stop = System.currentTimeMillis();
//				long elapsed = (long)(stop - start);
//				System.out.println();
//				System.out.println("For N=" + N + " RT in msec=" + elapsed);
//			 }
		
		

	}


