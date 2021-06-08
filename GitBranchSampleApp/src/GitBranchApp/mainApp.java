package GitBranchApp;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 這是第一個版本
		System.out.println("1st Version");
		Math cMath = new Math();
		System.out.println();
		System.out.println(cMath.add(10, 20));
	}

}
class Math{
	int add(int a, int b) {
		return a+b;
	}
}