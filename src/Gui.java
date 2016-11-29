import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.Border;



public class Gui extends JFrame implements ActionListener{

	private JButton newAddress;
	private	JButton addBuddy;
	private JButton save;
	private AddressBook aBook;
	private BuddyInfo buddyInfo;
	private JTextField textField;
	private String string;
	private JLabel label;
	private JTextArea textArea;
	private JPanel panel;
	private JPanel p1;
	public Gui() {
		super("Address Book");
		this.setSize(500, 400);
		this.getContentPane().setLayout(new BorderLayout());
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		string = "Add a friend";
		newAddress = new JButton("Create an Adress Book");
		addBuddy = new JButton(string);
		label = new JLabel("Enter name and Age");
		textField = new JTextField();
		textArea = new JTextArea("Current Address Book");
		this.add(label, BorderLayout.WEST);
		save = new JButton("save");
		newAddress.addActionListener(this);
		addBuddy.addActionListener(this);
		textField.addActionListener(this);
		save.addActionListener(this);
		panel = new JPanel(new BorderLayout());
		panel.add(newAddress, BorderLayout.WEST);
		panel.add(addBuddy, BorderLayout.EAST);
		panel.add(save, BorderLayout.CENTER );
		this.add(panel, BorderLayout.SOUTH);
		this.add(textField, BorderLayout.CENTER);
		this.add(textArea, BorderLayout.EAST);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() instanceof JTextField) {
			String string = textField.getText();
			int age = Integer.parseInt(string.replaceAll("\\D+",""));
			String name = string.replaceAll("\\d","");
			buddyInfo = new BuddyInfo(name, age);
		} else if( e.getSource() instanceof JButton) {
			JButton button = (JButton) e.getSource();
			if(button.getText().equals(string)) {
				aBook.addBuddy(buddyInfo);
				
				textArea.append("\n" + buddyInfo.getName()+ " " + buddyInfo.getAge());
			} else if(button.getText().equals("save")) {
				String string = textArea.getText();
				System.out.println(string);
				
			}
			else {
				aBook = new AddressBook();
			}
		}
        
    }

	
	
	
	public static void main(String[] args) {
	 Gui gui = new Gui();
		
	}

}
