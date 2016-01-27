import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings("serial")
public class DetailsPanel extends JPanel {

	public static JTextField msg;
	
	public static JSpinner _layers;
	
	public DetailsPanel(){
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		setBorder(BorderFactory.createTitledBorder("Input"));
		
		JLabel nameLabel = new JLabel("Message: ");
		JLabel layersLabel = new JLabel ("Layers of encryption: ");
		
		
		JTextField nameField = new JTextField(10);
		msg = nameField;
		SpinnerModel layersModel = new SpinnerNumberModel(1, 1, 10, 1);
		JSpinner layers = new JSpinner(layersModel);
		_layers = layers;
		JButton addBtn = new JButton("Encrypt");
		addBtn.addActionListener(new ButtonListener());

		
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		///// First column!
		
		gc.anchor = GridBagConstraints.LINE_END;
		gc.weightx = 0.5;
		gc.weighty = 0.5;
		
		
		gc.gridx = 0;
		gc.gridy = 0;
		
		add(nameLabel, gc);
		
		gc.gridx = 0;
		gc.gridy = 1;
		add(layersLabel, gc);
		// Second column!
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
		add(nameField, gc);
		
		gc.gridx = 1;
		gc.gridy = 1;
		add(layers, gc);
		
		// Final row!
		gc.weighty = 10;
		
		gc.anchor = GridBagConstraints.FIRST_LINE_START;
		gc.gridx = 1;
		gc.gridy = 2;
		add(addBtn, gc);
		addBtn.setActionCommand("encrypt");
	}
	
}
