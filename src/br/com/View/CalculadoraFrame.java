package br.com.View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraFrame extends JFrame {

	/**
	 * @author Renato Pijanowski
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfDisplay;
	private double number1,number2;
	private double result=0;
	private double percentage=0;
	private String operationType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraFrame frame = new CalculadoraFrame();
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
					SwingUtilities.updateComponentTreeUI(frame);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void clear(){
		tfDisplay.setText("");
	}
	public void num(){
		number1=0;
		number2=0;
		result=0;
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraFrame() {
		setTitle("Simple Calculator");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 383, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(12, 12, 360, 269);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tfDisplay = new JTextField();
		tfDisplay.setEditable(false);
		tfDisplay.setFont(new Font("Dialog", Font.PLAIN, 20));
		tfDisplay.setBounds(12, 16, 338, 58);
		panel.add(tfDisplay);
		tfDisplay.setColumns(10);
		
		JButton bt7 = new JButton("7");
		bt7.setBounds(22, 134, 43, 35);
		bt7.setToolTipText("Seven");
		panel.add(bt7);
		
		JButton bt8 = new JButton("8");
		bt8.setBounds(77, 134, 43, 35);
		bt8.setToolTipText("Eight");
		panel.add(bt8);
		
		JButton bt9 = new JButton("9");
		bt9.setBounds(132, 134, 43, 35);
		bt9.setToolTipText("Nine");
		panel.add(bt9);
		
		JButton bt4 = new JButton("4");
		bt4.setBounds(22, 181, 43, 35);
		bt4.setToolTipText("Four");
		panel.add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.setBounds(77, 181, 43, 35);
		bt5.setToolTipText("Five");
		panel.add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.setBounds(132, 181, 43, 35);
		bt6.setToolTipText("6");
		panel.add(bt6);
		
		JButton bt1 = new JButton("1");
		bt1.setBounds(22, 228, 43, 35);
		bt1.setToolTipText("One");
		panel.add(bt1);
		
		JButton bt2 = new JButton("2");
		bt2.setToolTipText("Two");
		bt2.setBounds(77, 228, 43, 35);
		panel.add(bt2);
		
		JButton bt3 = new JButton("3");
		bt3.setBounds(132, 228, 43, 35);
		bt3.setToolTipText("Three");
		panel.add(bt3);
		
		JButton bt0 = new JButton("0");
		bt0.setBounds(187, 228, 43, 35);
		bt0.setToolTipText("Zero");
		panel.add(bt0);
		
		JButton btDot = new JButton(".");
		btDot.setBounds(187, 181, 43, 35);
		//btDot.setToolTipText("Dot");
		panel.add(btDot);
		
		JButton btEqual = new JButton("=");
		btEqual.setBounds(302, 134, 43, 35);
		btEqual.setToolTipText("Enter");
		panel.add(btEqual);
		
		JButton btPercentage = new JButton("%");
		btPercentage.setBounds(242, 134, 43, 35);
		btPercentage.setToolTipText("(percentage)(of)");
		panel.add(btPercentage);
		
		JButton btDivision = new JButton("/");
		btDivision.setBounds(302, 181, 43, 35);
		btDivision.setToolTipText("Divide");
		panel.add(btDivision);
		
		JButton btMulti = new JButton("*");
		btMulti.setBounds(242, 228, 43, 35);
		btMulti.setToolTipText("Multiply");
		panel.add(btMulti);
		
		JButton btMinus = new JButton("-");
		btMinus.setBounds(242, 181, 43, 35);
		btMinus.setToolTipText("Subtract");
		panel.add(btMinus);
		
		JButton btSqrt = new JButton("Sqrt");
		btSqrt.setBounds(22, 83, 72, 27);
		btSqrt.setToolTipText("Square Root");
		panel.add(btSqrt);
		
		JButton btAc = new JButton("AC");
		btAc.setForeground(Color.RED);
		btAc.setToolTipText("Clear All");
		btAc.setBounds(112, 83, 72, 27);
		panel.add(btAc);
		
		JButton btC = new JButton("C");
		btC.setForeground(Color.RED);
		btC.setToolTipText("Clear Display");
		btC.setBounds(196, 83, 72, 27);
		panel.add(btC);
		
		JButton btPow = new JButton("POW");
		btPow.setForeground(Color.BLACK);
		btPow.setToolTipText("Power");
		btPow.setBounds(277, 83, 72, 27);
		panel.add(btPow);
		
		JButton btAddition = new JButton("+");
		btAddition.setBounds(187, 134, 43, 35);
		btAddition.setToolTipText("Sum");
		panel.add(btAddition);
		
		JButton btOff = new JButton("Q");
		btOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btOff.setForeground(Color.RED);
		btOff.setBounds(302, 228, 43, 35);
		panel.add(btOff);
		
		btAc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				num();
			}
		});
		btC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clear();
			}
		});
		
		bt0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"0");
			}
		});
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"1");
			}
		});
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"2");
			}
		});
		bt3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"3");
			}
		});
		bt4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"4");
			}
		});
		bt5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"5");
			}
		});
		bt6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"6");
			}
		});
		bt7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"7");
			}
		});
		bt8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"8");
			}
		});
		bt9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+"9");
			}
		});
		btDot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tfDisplay.setText(tfDisplay.getText()+".");
			}
		});
		btAddition.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfDisplay.getText().equals("")){
					return;
				}
				else{
					operationType = "addition";
					number1 = Double.parseDouble(tfDisplay.getText());
					clear();
				}
			}
		});
		btMinus.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfDisplay.getText().equals("")){
					return;
				}
				else{
					operationType = "minus";
					number1 = Double.parseDouble(tfDisplay.getText());
					clear();
				}
			}
		});
		btDivision.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfDisplay.getText().equals("")){
					return;
				}
				else{
					operationType = "division";
					number1 = Double.parseDouble(tfDisplay.getText());
					clear();
				}
			}
		});
		btMulti.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfDisplay.getText().equals("")){
					return;
				}
				else{
					operationType = "multiplication";
					number1 = Double.parseDouble(tfDisplay.getText());
					clear();
				}
			}
		});
		btSqrt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfDisplay.getText().equals("")){
					return;
				}
				else{
					number1 = Double.parseDouble(tfDisplay.getText());
					clear();
					tfDisplay.setText(String.valueOf(Math.sqrt(number1)));num();
				}
			}
		});
		btPow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfDisplay.getText().equals("")){
					return;
				}
				else{
					operationType = "pow";
					number1 = Double.parseDouble(tfDisplay.getText());
					clear();
				}
			}
		});
		btPercentage.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfDisplay.getText().equals("")){
					return;
				}
				else{
					operationType="percentage";
					number1 = Double.parseDouble(tfDisplay.getText());
					percentage += number1/100;
					clear();
				}
			}
		});
		btEqual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tfDisplay.getText().equals("")){
					return;
				}
				if(operationType=="percentage"){
					number2 = Double.parseDouble(tfDisplay.getText());
					result += number2 * percentage;
					tfDisplay.setText(Double.toString(result));num();
				}
				if(operationType=="addition"){
					number2 = Double.parseDouble(tfDisplay.getText());
					clear();
					result+=number1+number2;
					tfDisplay.setText(Double.toString(result));num();
				}
				if(operationType=="minus"){
					number2 = Double.parseDouble(tfDisplay.getText());
					clear();
					result+=number1-number2;
					tfDisplay.setText(Double.toString(result));num();
				}
				if(operationType=="multiplication"){
					number2 = Double.parseDouble(tfDisplay.getText());
					clear();
					result+=number1*number2;
					tfDisplay.setText(Double.toString(result));num();
				}
				if(operationType=="division"){
					number2 = Double.parseDouble(tfDisplay.getText());
					clear();
					result+=number1/number2;
					tfDisplay.setText(Double.toString(result));num();
				}
				if(operationType=="pow"){
					number2 = Double.parseDouble(tfDisplay.getText());
					clear();
					tfDisplay.setText(String.valueOf(Math.pow(number1, number2)));
					num();
				}
			}
		});
	}
}