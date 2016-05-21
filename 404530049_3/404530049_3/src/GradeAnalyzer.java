import java.util.ArrayList;

public class GradeAnalyzer {
	int totalNum = 0;
	double avg = 0, standDev = 0, sum = 0, sumSquare = 0;
	ArrayList<Double> GradeList = new ArrayList<Double>();
	int[] grades = new int[11];

	boolean isValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0)
			return true;
		else
			return false;
	}

	void addGrade(double aGrade) {
		if (isValidGrade(aGrade)) {
			sum += aGrade;
			totalNum++;
			GradeList.add(aGrade);
			if (aGrade >= 98) {
				grades[0]++;
			} else if (aGrade >= 92 && aGrade < 98) {
				grades[1]++;
			} else if (aGrade >= 90 && aGrade < 92) {
				grades[2]++;
			} else if (aGrade >= 88 && aGrade < 90) {
				grades[3]++;
			} else if (aGrade >= 82 && aGrade < 88) {
				grades[4]++;
			} else if (aGrade >= 80 && aGrade < 82) {
				grades[5]++;
			} else if (aGrade >= 78 && aGrade < 80) {
				grades[6]++;
			} else if (aGrade >= 72 && aGrade < 78) {
				grades[7]++;
			} else if (aGrade >= 70 && aGrade < 72) {
				grades[8]++;
			} else if (aGrade >= 60 && aGrade < 70) {
				grades[9]++;
			} else {
				grades[10]++;
			}
		}
	}

	public void analyzeGrades() {
		avg = sum / totalNum;
		for (int i = 0; i < GradeList.size(); i++) {
			sumSquare += (GradeList.get(i) - avg) * (GradeList.get(i) - avg);
		}
		standDev = Math.sqrt(sumSquare / totalNum);
	}

	public String toString() {
		String rlt = "";
		rlt += "You entered " + totalNum + " valid grades from 0 to 110.Invalid grades are ignore!";
		rlt += "\nThe average = " + avg + " with a standard deviation = " + standDev;
		rlt += "\nThe grade distribution is¡G" + "\nA+ = " + grades[0] + "\nA = " + grades[1] + "\nA- = " + grades[2]
				+ "\nB+ = " + grades[3] + "\nB = " + grades[4] + "\nB- = " + grades[5] + "\nC+ = " + grades[6]
				+ "\nC = " + grades[7] + "\nC- = " + grades[8] + "\nD = " + grades[9] + "\nF = " + grades[10];
		return rlt;
	}
}