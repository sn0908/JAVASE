package day05.method;

public class MainClass02 {
	private static String name; // 전역변수 name 선언
	
	public static void main(String[] args) {
		setName("잠만보");
		
		String name = getName();
		
		System.out.println("name " + name);
		
		int[] nums = {1, 2, 3};
		int resultSum = sum(nums);
		System.out.println(resultSum);
		
		int resultSum2 = sum(1,2,3);
		System.out.println(resultSum2);
	}
	
	// 인자 X 리턴 O
	public static String getName() {
		return name;
		// return "안녕하세요";
	}
	
	public static void setName(String name) {
		MainClass02.name = name;
	}
	
	// 인자 O 리턴 O 
	public static int sum(int[] agrs) {
		int sum = 0;
		for(int agr : agrs) {
			sum += agr;
		}
		return sum;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
