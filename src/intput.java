import java.io.*;
import javax.swing.JOptionPane;
public class intput {
	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException
	{
		int a,b;
		//double c,d;
		System.out.println("please enter the a:");
		a = Integer.parseInt(keyboard.readLine());
		System.out.println("a= "+a);
		JOptionPane.showMessageDialog(null,"the answer is:"+a,"Hello word",JOptionPane.ERROR_MESSAGE);
		System.out.println("please enter the b4:");
		b = Integer.parseInt(keyboard.readLine());
		System.out.println("b="+b);
		System.exit(0);
		
	}
}
