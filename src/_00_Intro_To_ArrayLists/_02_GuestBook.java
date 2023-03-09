package _00_Intro_To_ArrayLists;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class _02_GuestBook implements ActionListener {
	/*
	 * Create a GUI with two buttons. One button reads "Add Name" and the other
	 * button reads "View Names". When the add name button is clicked, display an
	 * input dialog that asks the user to enter a name. Add that name to an
	 * ArrayList. When the "View Names" button is clicked, display a message dialog
	 * that displays all the names added to the list. Format the list as follows:
	 * Guest #1: Bob Banders Guest #2: Sandy Summers Guest #3: Greg Ganders Guest
	 * #4: Donny Doners
	 */

	ArrayList<String> guestBook = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton();
	JButton viewNames = new JButton();

	public void run() {
		frame.setVisible(true);
		panel.add(addName);
		panel.add(viewNames);
		frame.add(panel);
		frame.setSize(300, 300);
		addName.setText("Add Names");
		viewNames.setText("View Names");
		viewNames.addActionListener(this);
		addName.addActionListener(this);
		guestBook.add("Bob Banders");
		guestBook.add("Sandy Summers");
		guestBook.add("Greg Ganders");
		guestBook.add("Donny Doners");
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addName) {
			String nameAdded = JOptionPane.showInputDialog("What name do you wanna add?");
			guestBook.add(nameAdded);
		} else if (e.getSource() == viewNames) {
			JOptionPane.showMessageDialog(null, "The list is:  " + guestBook);
		}
	}

}
