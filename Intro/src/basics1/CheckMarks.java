package basics1;
public class CheckMarks {

	public static void main(String[] args) {
		gradeStudent(65);
	}

	static void gradeStudent(int score) {
		// if studentScore is 65-75 print grade C
		if (score >= 65 && score < 75) {
			System.out.println("grade C");
		}

		// if studentScore is 76-85 print grade B
		else if (score >= 76 && score < 85) {
			System.out.println("grade B");
		}

		// if studentScore is 86-100 print grade A
		else if (score >= 86 && score < 100) {
			System.out.println("grade A");
		}

	}

}