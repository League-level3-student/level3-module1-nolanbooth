package _06_Intro_To_Hash_Maps;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;

public class _02_LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a
	 * GUI with three buttons. Button 1: Add Entry When this button is clicked, use
	 * an input dialog to ask the user to enter an ID number. After an ID is
	 * entered, use another input dialog to ask the user to enter a name. Add this
	 * information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addEntry = new JButton();
	JButton search = new JButton();
	JButton view = new JButton();
	HashMap<Integer, String> list = new HashMap<Integer, String>();
	JButton remove = new JButton();

	public void run() {

		addEntry.setText("Add Entry");
		search.setText("Search");
		view.setText("View Names");
		remove.setText("Remove Item");

		panel.add(addEntry);
		panel.add(search);
		panel.add(view);
		panel.add(remove);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		addEntry.addActionListener(this);
		search.addActionListener(this);
		view.addActionListener(this);
		remove.addActionListener(this);
	}

	public static void main(String[] args) {
		_02_LogSearch method = new _02_LogSearch();
		method.run();
		// OR
		// new _02_LogSearch().run();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == addEntry) {
			String idNum = JOptionPane.showInputDialog("Enter an ID number");
			String name = JOptionPane.showInputDialog("Enter a name");
			int realIDNum = Integer.parseInt(idNum);

			if (list.containsKey(realIDNum)) {
				JOptionPane.showMessageDialog(null, "That ID has already been taken");
			} else {
				list.put(realIDNum, name);
			}
		}
		if (e.getSource() == search) {
			String stringSearch = JOptionPane.showInputDialog("Enter an ID Number");
			int integerSearch = Integer.parseInt(stringSearch);
			if (list.containsKey(integerSearch)) {
				JOptionPane.showMessageDialog(null, "Name: " + list.get(integerSearch));
			} else {
				JOptionPane.showMessageDialog(null, "There is no name attached to the ID on the List");
			}

		}
		if (e.getSource() == view) {
			String names = "";
			for (Integer i : list.keySet()) {
				names = names + "ID: " + i + "  Name: " + list.get(i) + "\n";

				// JOptionPane.showMessageDialog(null, "ID: " + i + " Name: " + list.get(i));
			}
			JOptionPane.showMessageDialog(null, names);
		}
		if (e.getSource() == remove) {
			String stringRemove = JOptionPane.showInputDialog("Enter an ID to remove a name");
			int intRemove = Integer.parseInt(stringRemove);
			if(list.containsKey(intRemove)) {
				list.remove(intRemove);
			}else {
				JOptionPane.showMessageDialog(null, "There is no name attached to that ID");
			}
			
			
		}
	}
}
