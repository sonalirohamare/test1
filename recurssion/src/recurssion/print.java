package recurssion;

public class print {
	
	public int p(int a) {
		if(a==10) return 10;
		else {
			System.out.println(a);
			return p(a+1);
		}
	}
	
	public static void main(String args[]) {
		print pr = new print();
		pr.p(1);
	}

}
