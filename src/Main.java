import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Main {

	private JFrame frame;
	private JTextField txt1;
	private JTextField txt2;

	Canvas canvas = new Canvas();
	JLabel label = new JLabel("1");
	JLabel label_1 = new JLabel("2");
	JLabel label_2 = new JLabel("10");
	JLabel label_3 = new JLabel("87");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(25, 80, 86, 20);
		frame.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setBounds(25, 104, 86, 20);
		frame.getContentPane().add(txt2);
		txt2.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text1=txt1.getText();
				String text2=txt2.getText();
				
				canvas.setBounds(185, 24, 180, 100);
				label.setBounds(158, 11, 46, 14);
				label_1.setBounds(348, 11, 46, 14);
				label_2.setBounds(348, 127, 46, 14);
				label_3.setBounds(158, 127, 46, 14);
				label.setText("1");
				label_1.setText("2");
				label_2.setText("3");
				label_3.setText("4");
				
				if(text1.equals("r1")||text1.equals("R1")){
					
					//YAN
					
					canvas.setBounds(185, 24, 100, 180);
					
					String gecici=label.getText();
					label.setText(label_1.getText());
					label_1.setText(label_2.getText());
					label_2.setText(label_3.getText());
					label_3.setText(gecici);
					
					label_1.setBounds(348-80, 11, 46, 14);
					label_2.setBounds(348-80, 127+80, 46, 14);
					label_3.setBounds(158, 127+80, 46, 14);
				}
				else if (text1.equals("r2")||text1.equals("R2")) {
					
					//DÜZ
					
					canvas.setBounds(185, 24, 180, 100);
					String gecici=label.getText();
					String gecici1=label_1.getText();
					label.setText(label_2.getText());
					label_1.setText(label_3.getText());
					label_2.setText(gecici);
					label_3.setText(gecici1);
					
					label_1.setBounds(348, 11, 46, 14);
					label_2.setBounds(348, 127, 46, 14);
					label_3.setBounds(158, 127, 46, 14);
					
				}
				else if (text1.equals("r3")||text1.equals("R3")) {
					canvas.setBounds(185, 24, 100, 180);
					
					String gecici=label_3.getText();
					label_3.setText(label_2.getText());
					label_2.setText(label_1.getText());
					label_1.setText(label.getText());
					label.setText(gecici);
					
					label_1.setBounds(348-80, 11, 46, 14);
					label_2.setBounds(348-80, 127+80, 46, 14);
					label_3.setBounds(158, 127+80, 46, 14);
				}
				else if (text1.equals("m0")||text1.equals("M0")) {
					String gecici=label.getText();
					String gecici1=label_2.getText();
					label.setText(label_1.getText());
					label_1.setText(gecici);
					label_2.setText(label_3.getText());
					label_3.setText(gecici1);
				}
				else if (text1.equals("m1")||text1.equals("M1")){
					String gecici=label.getText();
					String gecici1=label_2.getText();
					label_2.setText(label_1.getText());
					label.setText(label_3.getText());
					label_1.setText(gecici1);
					label_3.setText(gecici);
				}
				else if (text1.equals("m2")||text1.equals("M2")){
					String gecici=label.getText();
					label.setText(label_2.getText());
					label_2.setText(gecici);
				}
				else if (text1.equals("m3")||text1.equals("M3")){
					String gecici=label_1.getText();
					label_1.setText(label_3.getText());
					label_3.setText(gecici);
				}
				
				
				
				if(text2.equals("r1")||text2.equals("R1")){
					
					//YAN
					

									
					String gecici=label.getText();
					label.setText(label_1.getText());
					label_1.setText(label_2.getText());
					label_2.setText(label_3.getText());
					label_3.setText(gecici);
					if (text1.equals("r1")||text1.equals("R1")||text1.equals("r3")||text1.equals("R3")) {
						canvas.setBounds(185, 24, 180, 100);
						label_1.setBounds(348, 11, 46, 14);
						label_2.setBounds(348, 127, 46, 14);
						label_3.setBounds(158, 127, 46, 14);
					}else{
						canvas.setBounds(185, 24, 100, 180);
						label_1.setBounds(348-80, 11, 46, 14);
						label_2.setBounds(348-80, 127+80, 46, 14);
						label_3.setBounds(158, 127+80, 46, 14);
					}				
				}
				else if (text2.equals("r2")||text2.equals("R2")) {
					
					//DÜZ
					
					canvas.setBounds(185, 24, 180, 100);
					String gecici=label.getText();
					String gecici1=label_1.getText();
					label.setText(label_2.getText());
					label_1.setText(label_3.getText());
					label_2.setText(gecici);
					label_3.setText(gecici1);
					
					label_1.setBounds(348, 11, 46, 14);
					label_2.setBounds(348, 127, 46, 14);
					label_3.setBounds(158, 127, 46, 14);
					
				}
				else if (text2.equals("r3")||text2.equals("R3")) {					
					String gecici=label_3.getText();
					label_3.setText(label_2.getText());
					label_2.setText(label_1.getText());
					label_1.setText(label.getText());
					label.setText(gecici);
					
					if (text1.equals("r1")||text1.equals("R1")||text1.equals("r3")||text1.equals("R3")){
						canvas.setBounds(185, 24, 180, 100);
						label_1.setBounds(348, 11, 46, 14);
						label_2.setBounds(348, 127, 46, 14);
						label_3.setBounds(158, 127, 46, 14);
					}else{
						canvas.setBounds(185, 24, 100, 180);
						label_1.setBounds(348-80, 11, 46, 14);
						label_2.setBounds(348-80, 127+80, 46, 14);
						label_3.setBounds(158, 127+80, 46, 14);
					}
					
				}
				else if (text2.equals("m0")||text2.equals("M0")) {
					String gecici=label.getText();
					String gecici1=label_2.getText();
					label.setText(label_1.getText());
					label_1.setText(gecici);
					label_2.setText(label_3.getText());
					label_3.setText(gecici1);
				}
				else if (text2.equals("m1")||text2.equals("M1")){
					String gecici=label.getText();
					String gecici1=label_2.getText();
					label_2.setText(label_1.getText());
					label.setText(label_3.getText());
					label_1.setText(gecici1);
					label_3.setText(gecici);
				}
				else if (text2.equals("m2")||text2.equals("M2")){
					String gecici=label.getText();
					label.setText(label_2.getText());
					label_2.setText(gecici);
				}
				else if (text2.equals("m3")||text2.equals("M3")){
					String gecici=label_1.getText();
					label_1.setText(label_3.getText());
					label_3.setText(gecici);
				}
			}
		});
		btnNewButton.setBounds(22, 135, 89, 45);
		frame.getContentPane().add(btnNewButton);
		
		canvas.setBackground(Color.BLACK);
		canvas.setBounds(185, 24, 180, 100);
		frame.getContentPane().add(canvas);
		
		
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(158, 11, 46, 14);
		frame.getContentPane().add(label);
		
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(348, 11, 46, 14);
		frame.getContentPane().add(label_1);
		
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(348, 127, 46, 14);
		frame.getContentPane().add(label_2);

		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(158, 127, 46, 14);
		frame.getContentPane().add(label_3);
	}
}
