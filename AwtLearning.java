import java.awt.*;
import java.awt.event.*;
public class AwtLearning implements ActionListener{
	
	Frame f;
	Button button;
	TextArea txtArea;
	Label label;
	AwtLearning(){
		f = new Frame();
		txtArea = new TextArea("",60,60,1);
		button = new Button("Count");
		label = new Label("");
		
		
		// BOUNDS OPERATIONS
		
		label.setBounds(150,80,200,40);
		txtArea.setBounds(150,130,350,300);
		button.setBounds(250,500,80,40);
		
		/* **************************************** */
		
		
		//** ACTION EVENTS
		button.addActionListener(this);
		
		
		// ADDING OPERATIONS
		add(txtArea);
		add(button);
		add(label);
		/* *************************************** */
		f.setTitle("Awt Learning Notepad+");
		f.setSize(600,600);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == button){
			String getText = txtArea.getText();
			int characters = getText.length();
			String words[] = getText.split("\\s");
			label.setText("Characters : "+characters+"     Words : "+words.length);
		}
	
	}
	
	
	private void add(Component c) {
		f.add(c);
	}
	
	
	
	
	
	public static void main(String[] args) {
		AwtLearning a = new AwtLearning();
	}
	
}
