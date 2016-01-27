import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;
import java.util.Random;

import javax.swing.JFrame;

public class ButtonListener implements ActionListener{

	private JFrame frame = App._frame;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		

		if (command.contains("encrypt")){
			String msg = DetailsPanel.msg.getText();
			MainFrame.text.setText("");
			int layers;
			try {
				layers = Integer.parseInt(DetailsPanel._layers.getValue().toString());
			} catch (Exception er){
				System.out.println(er.getMessage());
				App.close();
				return;
			}
			String out = "";

			byte[] msgB = msg.getBytes();
			
			
			for (int i = 0; i < layers; i++){
				Random r = new Random();
				int type = 2;
						//r.nextInt(2);
				
				char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
				
				// The key for the ceasar cipher
				int cKey = r.nextInt(alphabet.length);
				switch(type){

				// Binary
				case 0:String o = "";
						for (byte b : msgB){
							String str = Integer.toBinaryString(b);
					
							for ( ; str.length() < 8; ){
								str = "0" + str;
							}
							o = o + str;
						}
						out = o;
						msgB = out.getBytes();
						break;
				// BASE64
				case 1: 
						msgB = Base64.getEncoder().encode(msgB);
						out = new String(msgB);
						break;
				// Ceasar
				case 2:
						o = "";
						for (char c : msg.toCharArray()){
							o = o + (alphabet[(c+cKey)%alphabet.length]);
						}
						out = o;
						break;
				default: out = "Something went wrong!"; 
						break;
				}
				System.out.println(type);
				
				
			}
			
			MainFrame.text.setText(out);
		}
		
		
	}

	
	
}
