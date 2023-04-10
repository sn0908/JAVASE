package day09.innerclass;
/*
 * [[ ���� Ŭ���� (InnerClass) ]]
 * 	Ŭ���� ���ο� �ٸ� Ŭ������ �����ϴ� ���� ���Ѵ�.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		new MainClass01.InnerClass().doSomething();
		new InnerClass().doSomething();
	}
	
	static class InnerClass {
		public void doSomething() {
			System.out.println("���𰡸� �ؿ�!");
		}
	}
	

}
