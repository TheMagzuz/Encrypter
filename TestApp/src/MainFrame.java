import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	private DetailsPanel detailsPanel;
	
	private OutputPanel outputPanel;
	
	public static JTextArea text;
	
	MainFrame(String title){
		super(title);
		
		setLayout(new BorderLayout());
		
		JTextArea textArea = new JTextArea();
		JTextArea key = new JTextArea();
		JLabel msgLabel = new JLabel("Encrypted Message: ");
		JLabel keyLabel = new JLabel ("Encryption key: ");
		JButton button = new JButton("Button!");
		
		text = textArea;
		
		detailsPanel = new DetailsPanel();
		outputPanel = new OutputPanel();
		
		Container c = getContentPane();
		/*textArea.setEditable(false);
		key.setEditable(false);
		
		c.add(msgLabel, BorderLayout.EAST);
		c.add(textArea, BorderLayout.EAST);
		c.add(keyLabel, BorderLayout.EAST);
		c.add(key, BorderLayout.EAST);*/
		c.add(detailsPanel, BorderLayout.WEST);
		c.add(outputPanel, BorderLayout.EAST);
		
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				App.close();
			}
			
		});
	}
	
}
