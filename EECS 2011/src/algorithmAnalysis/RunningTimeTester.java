package algorithmAnalysis;

public class RunningTimeTester {
	static long startTime;
	static long endTime;
	static long elapsed;

	public static String repeat1(char c, int n) 
	{
		String answer = "";
		startTime = System.currentTimeMillis( );
		for (int j=0; j < n; j++)
		{
			answer += c;
		}
		endTime = System.currentTimeMillis( );
		elapsed = endTime - startTime;
		return answer;
	}
	
	public static String repeat2(char c, int n) {
		StringBuilder sb = new StringBuilder( );
		startTime = System.currentTimeMillis( );
	for (int j=0; j < n; j++){
	sb.append(c);
	}
	endTime = System.currentTimeMillis( );
	elapsed = endTime - startTime;
	return sb.toString( );
	 }
	
	
	public static void main(String[] args) {
		
		System.out.println(repeat1('*', 40));
		System.out.println(startTime);
		System.out.println(endTime);
		System.out.println(elapsed);
		
		/*The first Program took more some times less running time than the second program
		 * It took 1538011912159 running time.
		 * */
		
		System.out.println(repeat2('*', 40));
		System.out.println(startTime);
		System.out.println(endTime);
		System.out.println(elapsed);
		
		/*
		 * The second program now takes more running time.
		 * 1538012123400
		 * 1538012123400
		 * 0
		 */
		
	}

}
