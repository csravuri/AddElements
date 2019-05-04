package com.example.addelements;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class SumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Sum of Elements");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 100);
		
		JButton button = new JButton("Sum");
		JTextField textBox1 = new JTextField(10);
		JTextField textBox2 = new JTextField(10);
		JLabel label = new JLabel();
		
		JPanel panel = new JPanel();
		panel.add(textBox1);
		panel.add(textBox2);
		panel.add(button);		
		panel.add(label);
		
		frame.getContentPane().add(panel);
		
		frame.setVisible(true);
		
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				double text1=0, text2=0;
				try
				{
					text1 = Double.parseDouble(textBox1.getText());
				}
				catch(Exception err)
				{
					label.setText("Only Numbers allowed");
				}
				
				try
				{
					text2 = Double.parseDouble(textBox2.getText());
				}
				catch(Exception err)
				{
					label.setText("Only Numbers allowed");
				}
				
				if(text1 > 0 || text2 > 0)
				{
					label.setText(String.valueOf(text1 + text2));
				}

			}
		});
		

	}

}
