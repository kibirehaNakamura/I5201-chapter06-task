public class EX6_ArraySalary {
	public static void main(String[] args) {
		String[] arrayName = { "小暮次郎", "川村麻衣", "北上義徳", "佐野洋子", "松原雅彦" };
		int[] arraySalary = { 184000, 175000, 261000, 163000, 226000 };
		int[] arrayRatio = new int[arrayName.length];
		int salarySum = 0;
		
		for(int i = 0; i < arrayName.length; i++) {
			salarySum += arraySalary[i];
		}
		
		for(int i = 0; i < arrayName.length; i++) {
			arrayRatio[i] = arraySalary[i] * 100 / salarySum;
		}
		
		System.out.println("★　給料の状況　★");
		for(int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i] + "\t" + arraySalary[i] + "\t約" + arrayRatio[i] + "%");
		}
		System.out.println("給料合計\t" + salarySum);
	}
}