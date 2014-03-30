import javax.swing.JOptionPane;
public class input {
	public static void main(String[]args)
	{
		double fist,second;
		String s;
		s = JOptionPane.showInputDialog("hellow,friend\nPlease input the first date");
		fist= Double.parseDouble(s);
		s = JOptionPane.showInputDialog("plesase input the second date");
		second = Double.parseDouble(s);
		s = "the ammount is"+fist+second;
		JOptionPane.showMessageDialog(null,"the answer is:"+s,"Hello word",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null,fist,"Circle",JOptionPane.QUESTION_MESSAGE);
		System.exit(0);
	}
}
