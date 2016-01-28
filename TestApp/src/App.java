import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static MainFrame _frame;
	
	public static void main(String[] args){
		
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				HandleAppId();
				JFrame frame = new MainFrame("Encrypter v0.1 by TheMagzuz");
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

	private static void HandleAppId(){
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("Hello.txt"), "utf-8"))) {
	   writer.write("something");
	} catch(Exception e){
		close();
	}
	}
	
}
