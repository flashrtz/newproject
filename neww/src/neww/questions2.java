package neww;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class questions2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					questions2 window = new questions2();
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
	public questions2() {
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
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Highly");
		rdbtnNewRadioButton.setBounds(34, 138, 90, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFairly = new JRadioButton("Fairly");
		rdbtnFairly.setBounds(142, 138, 90, 25);
		frame.getContentPane().add(rdbtnFairly);
		
		JRadioButton rdbtnNotAtAll = new JRadioButton("Not at all");
		rdbtnNotAtAll.setBounds(256, 138, 90, 25);
		frame.getContentPane().add(rdbtnNotAtAll);
		
		JRadioButton rdbtnAbove = new JRadioButton("Rather Not Say");
		rdbtnAbove.setBounds(370, 138, 124, 25);
		frame.getContentPane().add(rdbtnAbove);
		
		JLabel lblNewLabel_1 = new JLabel("6.How motivated are you?");
		lblNewLabel_1.setBounds(34, 100, 806, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JRadioButton rdbtnEmployedFulltime = new JRadioButton("Poor");
		rdbtnEmployedFulltime.setBounds(34, 221, 148, 25);
		frame.getContentPane().add(rdbtnEmployedFulltime);
		
		JLabel lblwhatIsYour = new JLabel("7.How well do you know others?");
		lblwhatIsYour.setBounds(34, 183, 806, 29);
		frame.getContentPane().add(lblwhatIsYour);
		
		JLabel lblwhatIsYour_1 = new JLabel("8.Working Time");
		lblwhatIsYour_1.setBounds(34, 265, 806, 29);
		frame.getContentPane().add(lblwhatIsYour_1);
		
		JRadioButton rdbtnHours = new JRadioButton("4 hours");
		rdbtnHours.setBounds(34, 303, 90, 25);
		frame.getContentPane().add(rdbtnHours);
		
		JRadioButton rdbtnHours_1 = new JRadioButton("6 hours");
		rdbtnHours_1.setBounds(142, 303, 116, 25);
		frame.getContentPane().add(rdbtnHours_1);
		
		JRadioButton rdbtnAbove_1 = new JRadioButton("12 hours");
		rdbtnAbove_1.setBounds(400, 303, 115, 25);
		frame.getContentPane().add(rdbtnAbove_1);
		
		JLabel lblLocationWhereYou = new JLabel("9.Are you a happy worker?");
		lblLocationWhereYou.setBounds(34, 348, 806, 29);
		frame.getContentPane().add(lblLocationWhereYou);
		
		JRadioButton rdbtnColombo = new JRadioButton("Yes");
		rdbtnColombo.setBounds(34, 386, 90, 25);
		frame.getContentPane().add(rdbtnColombo);
		
		JRadioButton rdbtnGampaha = new JRadioButton("No");
		rdbtnGampaha.setBounds(142, 386, 90, 25);
		frame.getContentPane().add(rdbtnGampaha);
		
		JLabel lblnumberOfEmployees = new JLabel("10.How would you rate your progress upto now.");
		lblnumberOfEmployees.setBounds(34, 441, 806, 29);
		frame.getContentPane().add(lblnumberOfEmployees);
		
		JRadioButton rdbtnStars = new JRadioButton("2 stars");
		rdbtnStars.setBounds(34, 479, 90, 25);
		frame.getContentPane().add(rdbtnStars);
		
		JRadioButton rdbtnStars_1 = new JRadioButton("3 stars");
		rdbtnStars_1.setBounds(142, 479, 90, 25);
		frame.getContentPane().add(rdbtnStars_1);
		
		JRadioButton rdbtnStars_2 = new JRadioButton("4 stars");
		rdbtnStars_2.setBounds(256, 479, 90, 25);
		frame.getContentPane().add(rdbtnStars_2);
		
		JRadioButton rdbtnAbove_2 = new JRadioButton("5 stars");
		rdbtnAbove_2.setBounds(370, 479, 107, 25);
		frame.getContentPane().add(rdbtnAbove_2);
		
		JRadioButton rdbtnEmployedParttime = new JRadioButton("Good");
		rdbtnEmployedParttime.setBounds(198, 221, 148, 25);
		frame.getContentPane().add(rdbtnEmployedParttime);
		
		JRadioButton rdbtnJobSeeking = new JRadioButton("Average");
		rdbtnJobSeeking.setBounds(367, 221, 148, 25);
		frame.getContentPane().add(rdbtnJobSeeking);
		
		JRadioButton rdbtnRetired = new JRadioButton("Almost All");
		rdbtnRetired.setBounds(537, 221, 148, 25);
		frame.getContentPane().add(rdbtnRetired);
		
		JRadioButton rdbtnHours_2 = new JRadioButton("8 hours");
		rdbtnHours_2.setBounds(271, 303, 116, 25);
		frame.getContentPane().add(rdbtnHours_2);
		
		JButton btnNext = new JButton("SUBMIT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNext.setBounds(743, 551, 97, 25);
		frame.getContentPane().add(btnNext);
	}
}