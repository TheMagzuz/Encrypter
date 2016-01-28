import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;
import java.util.Random;

import javax.swing.JFrame;

import org.apache.commons.codec.binary.Base32;

public class ButtonListener implements ActionListener{

	private JFrame frame = App._frame;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		

		if (command.contains("encrypt")){
			String msg = DetailsPanel.msg.getText();
			OutputPanel.msgOut.setText("");
			int layers;
			try {
				layers = Integer.parseInt(DetailsPanel._layers.getValue().toString());
			} catch (Exception er){
				System.out.println(er.getMessage());
				App.close();
				return;
			}
			String out = "";

			
			
			
			for (int i = 0; i < layers; i++){
				if (i == 0){
					out = msg;
				}
				byte[] msgB = out.getBytes();

				Base32 base32 = new Base32();
				
				Random r = new Random();
				int type = //2;
						r.nextInt(3);

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
				// BASE32
				case 2:						
						out =  new String(base32.encode(msgB));
					
						break;
				default: out = "Something went wrong! Problem: Undefined encryption id"; 
						break;
				}
				System.out.println("Type id: " + type + " New message: " + out);
				
				
			}
			
			OutputPanel.msgOut.setText(out);
		}
		
		
	}

	
	
}
