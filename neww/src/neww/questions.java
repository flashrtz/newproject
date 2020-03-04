package neww;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class questions {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questions window = new questions();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public questions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 255));
		frame.setBounds(100, 100, 914, 653);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JOB SATISFACTION");
		lblNewLabel.setForeground(new Color(204, 204, 51));
		lblNewLabel.setBackground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(0, 0, 896, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("18-24");
		rdbtnNewRadioButton.setBounds(34, 138, 90, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("25-34");
		radioButton.setBounds(142, 138, 90, 25);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("35-50");
		radioButton_1.setBounds(256, 138, 90, 25);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton rdbtnAbove = new JRadioButton("above 50");
		rdbtnAbove.setBounds(370, 138, 90, 25);
		frame.getContentPane().add(rdbtnAbove);
		
		JLabel lblNewLabel_1 = new JLabel("1.Which of the following describes your age?");
		lblNewLabel_1.setBounds(34, 100, 806, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnEmployedFulltime = new JRadioButton("Employed FullTime");
		rdbtnEmployedFulltime.setBounds(34, 221, 148, 25);
		frame.getContentPane().add(rdbtnEmployedFulltime);
		
		JLabel lblwhatIsYour = new JLabel("2.What is your current employment status?");
		lblwhatIsYour.setBounds(34, 183, 806, 29);
		frame.getContentPane().add(lblwhatIsYour);
		
		JLabel lblwhatIsYour_1 = new JLabel("3.How much do you earn?");
		lblwhatIsYour_1.setBounds(34, 265, 806, 29);
		frame.getContentPane().add(lblwhatIsYour_1);
		
		JRadioButton radioButton_6 = new JRadioButton("0-25,000");
		radioButton_6.setBounds(34, 303, 90, 25);
		frame.getContentPane().add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("25,000-50,000");
		radioButton_7.setBounds(142, 303, 116, 25);
		frame.getContentPane().add(radioButton_7);
		
		JRadioButton rdbtnAbove_1 = new JRadioButton("above 75,000");
		rdbtnAbove_1.setBounds(400, 303, 115, 25);
		frame.getContentPane().add(rdbtnAbove_1);
		
		JLabel lblLocationWhereYou = new JLabel("4.Location where you work?");
		lblLocationWhereYou.setBounds(34, 348, 806, 29);
		frame.getContentPane().add(lblLocationWhereYou);
		
		JRadioButton rdbtnColombo = new JRadioButton("Colombo");
		rdbtnColombo.setBounds(34, 386, 90, 25);
		frame.getContentPane().add(rdbtnColombo);
		
		JRadioButton rdbtnGampaha = new JRadioButton("Gampaha");
		rdbtnGampaha.setBounds(142, 386, 90, 25);
		frame.getContentPane().add(rdbtnGampaha);
		
		JRadioButton rdbtnKandy = new JRadioButton("Kandy");
		rdbtnKandy.setBounds(256, 386, 90, 25);
		frame.getContentPane().add(rdbtnKandy);
		
		JRadioButton rdbtnOther = new JRadioButton("Other");
		rdbtnOther.setBounds(370, 386, 90, 25);
		frame.getContentPane().add(rdbtnOther);
		
		JLabel lblnumberOfEmployees = new JLabel("5.Number of employees in your company?");
		lblnumberOfEmployees.setBounds(34, 441, 806, 29);
		frame.getContentPane().add(lblnumberOfEmployees);
		
		JRadioButton radioButton_14 = new JRadioButton("0-50");
		radioButton_14.setBounds(34, 479, 90, 25);
		frame.getContentPane().add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("50-100");
		radioButton_15.setBounds(142, 479, 90, 25);
		frame.getContentPane().add(radioButton_15);
		
		JRadioButton radioButton_16 = new JRadioButton("100-1000");
		radioButton_16.setBounds(256, 479, 90, 25);
		frame.getContentPane().add(radioButton_16);
		
		JRadioButton rdbtnAbove_2 = new JRadioButton("above 1000");
		rdbtnAbove_2.setBounds(370, 479, 107, 25);
		frame.getContentPane().add(rdbtnAbove_2);
		
		JRadioButton rdbtnEmployedParttime = new JRadioButton("Employed PartTime");
		rdbtnEmployedParttime.setBounds(198, 221, 148, 25);
		frame.getContentPane().add(rdbtnEmployedParttime);
		
		JRadioButton rdbtnJobSeeking = new JRadioButton("Job Seeking");
		rdbtnJobSeeking.setBounds(367, 221, 148, 25);
		frame.getContentPane().add(rdbtnJobSeeking);
		
		JRadioButton rdbtnRetired = new JRadioButton("Retired");
		rdbtnRetired.setBounds(537, 221, 148, 25);
		frame.getContentPane().add(rdbtnRetired);
		
		JRadioButton radioButton_2 = new JRadioButton("50,000-75,000");
		radioButton_2.setBounds(271, 303, 116, 25);
		frame.getContentPane().add(radioButton_2);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(743, 551, 97, 25);
		frame.getContentPane().add(btnNext);
	}
}
