import java. util.*;
public class StudentGrade {


	public static void main(String[] args) {

		Double[] grade = new Double[8];
		Double[] weight = new Double[8];
		Double[] res = new Double[8];

		int i;
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < 8; i++) {
			grade[i] = sc.nextDouble();
		}
		for (i = 0; i < 8; i++) {
			weight[i] = sc.nextDouble();
		}

		Double sum = 0.0;
		for(i = 0; i < 8; i++){
			res[i] = grade[i]*(weight[i]/100);
			sum += res[i];
		}

		if(sum >= 90){
			System.out.print("A");
		}
		else if (sum >= 80){
			System.out.print("B");
		}
		else if(sum >= 70){
			System.out.print("C");
		}
		else if(sum >= 60){
			System.out.print("D");
		}
		else{
			System.out.print("F");
		}
		sc.close();
	}
}
