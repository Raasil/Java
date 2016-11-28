package ktbytepractice;

public class Aggregating {
	/* public static void main(String[] args){
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
} */
	
/*	public static void main(String[] args){
		int sum = 0;
		for(int i = 1; i*i < 1000 ; i++) {
			sum += i*i;
		}
		System.out.println(sum);
	} */
	
	/*public static void main(String[] args) {
		double money = 1000;
		for(int i = 0; i < 100 ; i++) {
			money *= 1.05;
		} 
		System.out.println(money);
	}*/
	
	public static void main(String[] args){
		int year = 0;
		for(double money = 1; money < 2; year++){
			money *= 1.05;
		}
		System.out.println(year);
		}
}
