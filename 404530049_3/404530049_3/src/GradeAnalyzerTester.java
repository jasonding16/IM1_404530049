/*
 * [A]100
 * [TA's Advise]
 * 1. 沒什麼太大問題, good!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {
		GradeAnalyzer a = new GradeAnalyzer();
		String score;
		while (true) {
			score = JOptionPane.showInputDialog(null, "：：：Please insert one score：：：");

			if (score.equals("Q") || score.equals("q")) {
				break;
			} else {
				try {
					a.addGrade(Double.parseDouble(score));

				} catch (Exception e) {
					System.out.println("error");
				}
			}
		}
		if (a.totalNum >= 2) {
			a.analyzeGrades();
			System.out.println(a.toString());
		}

	}

}
