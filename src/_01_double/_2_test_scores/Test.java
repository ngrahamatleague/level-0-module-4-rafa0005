package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test {


public static void main(String[] args) {
	String math = JOptionPane.showInputDialog("What is your math test score (In numbers) ");
	double mathD = Double.parseDouble(math);
	if(mathD > 95) {
		JOptionPane.showMessageDialog(null, "You are a nerd");
	}
	else if( mathD > 60) {
		JOptionPane.showMessageDialog(null, "You are smart");
	}
	else {
		JOptionPane.showMessageDialog(null, "You failed");
}
}
}
