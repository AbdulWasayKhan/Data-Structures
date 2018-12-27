package algorithmAnalysis;

public class Testing1 {
	
//	public static void guessWhat1(int N) {
//		for (int i=N; i>0; i=i/2) {
//		for (int j=0; j<i*2; j+=1) {
//		System.out.println("Hello World");
//		}
//	}
//}

	public static void main(String[] args) {
//		System.out.println(guessWhat1(20));
//		guessWhat1(6);
		
		
		int[] A = {24,34,2,22,16,18};
		int currentMin = A[0];
		for(int i = 1; i < A.length; i++)
		{
			if(A[i] < currentMin){
				currentMin = A[i];
			}
		}
		System.out.println("The minimum from the array is: " + currentMin);
	}

}
