import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class App {

	public static MainFrame _frame;
	
	public static void main(String[] args){
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				JFrame frame = new MainFrame("Hello word");
				_frame = (MainFrame) frame;
				frame.setSize(800, 600);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		

	}
	public static void close(){
		System.exit(1);
	}

}
