import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class windows extends JFrame
{
	private static final int  WIDTH = 600;
	private static final int  HEIGH = 400;
	//private static final String EXIT_ON_CLOSE = null;
	
	private JLabel lengthL,widthL,areaL,perimeterL;
	private JTextField legthTF,widthTF,areaTF,perimeterTF;
	private JButton calculateB,exitB;
	private CalculateButton cbCalculate;
	private ExitButton cbexit;
	public windows()
	{
		//setTitle("Area and Perimeter");
		
		lengthL = new JLabel("Enter the length:",SwingConstants.RIGHT);
		widthL = new JLabel("Enter the width:",SwingConstants.RIGHT);
		areaL = new JLabel("Area:",SwingConstants.RIGHT);
		perimeterL = new JLabel ("Perimeter:",SwingConstants.RIGHT);
		
		legthTF = new JTextField(10);
		widthTF = new JTextField(10);
		areaTF = new JTextField(10);
		perimeterTF = new JTextField(10);
		
		calculateB = new JButton("Calcualte");
		cbCalculate = new CalculateButton();
		calculateB.addActionListener(cbCalculate);
		
		exitB = new JButton("Exit");
		cbexit = new ExitButton();
		exitB.addActionListener(cbexit);
		
		
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(5,2));
		
		pane.add(lengthL);
		pane.add(legthTF);
		pane.add(widthL);
		pane.add(widthTF);
		pane.add(areaL);
		pane.add(areaTF);
		pane.add(perimeterL);
		pane.add(perimeterTF);
		pane.add(calculateB);
		pane.add(exitB);
		
		setTitle("JIALAI");
		setSize(WIDTH,HEIGH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		windows rectObject = new windows();
	}
	private class CalculateButton implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double width,length,area,perimeter;
			
			length = Double.parseDouble(legthTF.getText());
			width = Double.parseDouble(widthTF.getText());
			area = length*width;
			perimeter =2*(length+width);
			
			areaTF.setText(""+area);
			perimeterTF.setText(""+perimeter);
		}
	}
	
	private class ExitButton implements ActionListener 
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
			
			
		}
	}
}
