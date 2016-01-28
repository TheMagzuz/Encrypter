import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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
	public static JTextField typeOut;
	
	public JLabel keyLabel;
	public JLabel msgLabel;
	public JLabel typeLabel;
	
	
	public OutputPanel(){
		// Size setup
		Dimension size =  this.getPreferredSize();
		size.width = 250;
		this.setPreferredSize(size);
		
		// Border setup
		this.setBorder(BorderFactory.createTitledBorder("Output"));
		
		// Component instantiation
		keyOut = new JTextField(10);
		msgOut = new JTextField(10);
		typeOut = new JTextField(10);
		
		keyLabel = new JLabel("Encryption key: ");
		msgLabel = new JLabel("Encrypted Message: ");
		typeLabel = new JLabel("Type key: ");
		
		// Layout setup
		this.setLayout(new GridBagLayout());
		
		// Constraints Setup
		GridBagConstraints gc = new GridBagConstraints();
		
		// First column
		gc.anchor = GridBagConstraints.LINE_END;
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		
		// First element
		gc.gridx = 0;
		gc.gridy = 0;
		this.add(msgLabel, gc);
		
		// Second element
		gc.gridy = 1;
		this.add(keyLabel, gc);
		
		// Third element
		gc.gridy = 2;
		this.add(typeLabel, gc);
		
		// Second column
		gc.anchor = GridBagConstraints.LINE_START;
		
		// First element
		gc.gridx = 1;
		gc.gridy = 0;
		this.add(msgOut, gc);
		
		// Second element
		gc.gridy = 1;
		this.add(keyOut, gc);
		
		// Third element
		gc.gridy = 2;
		this.add(typeOut, gc);
	}
	
	
}
