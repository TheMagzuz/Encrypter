import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OutputPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JTextField keyOut;
	public static JTextField msgOut;
	
	public JLabel keyLabel;
	public JLabel msgLabel;
	
	public OutputPanel(){
		// Size setup
		Dimension size =  this.getPreferredSize();
		size.width = 250;
		this.setPreferredSize(size);
		
		// Border setup
		this.setBorder(BorderFactory.createTitledBorder("Output"));
		
		// Component setup
		keyOut = new JTextField();
		msgOut = new JTextField();
		
		keyLabel = new JLabel();
	}
	
	
}
