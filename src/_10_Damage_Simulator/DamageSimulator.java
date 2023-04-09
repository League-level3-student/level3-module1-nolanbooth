package _10_Damage_Simulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class DamageSimulator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton reRoll = new JButton();
	float[] numbersEntered;
	public void run() {
		frame.setVisible(true);
		frame.setSize(400, 400);
		panel.add(add);
		panel.add(reRoll);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add.addActionListener(this);
		add.setText("Add New Attack Scenario");
		reRoll.addActionListener(this);
		reRoll.setText("Re Roll Attack");

	}

	public float[] Roll(float[] numbers) {
		/*
		 * Order is: Allied Health - 0 Allied Damage - 1 Allied Protection - 2 Allied
		 * Full Health - 3 Allied Full Damage - 4 Enemy Health - 5 Enemy Damage - 6
		 * Enemy Protection - 7 Enemy Full Health - 8 Enemy Full Damage - 9
		 */
		numbers[5] = numbers[5] - ((1 - (numbers[7] / 100)) * numbers[1]);
		numbers[0] = numbers[0] - ((1 - (numbers[2] / 100)) * numbers[6]);
		// damaging the units
		float healthPercentAllied;
		float healthPercentEnemy;

		healthPercentAllied = numbers[0] / numbers[3];
		healthPercentEnemy = numbers[5] / numbers[8];
		// Setting the health percent of the units

		numbers[1] = numbers[4] * healthPercentAllied;
		numbers[6] = numbers[9] * healthPercentEnemy;

		return numbers;
	}

	public static void main(String[] args) {
		DamageSimulator simulator = new DamageSimulator();
		simulator.run();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == add) {
			String alliedHealthString = JOptionPane.showInputDialog("Enter Health of Allied Unit");
			float alliedHealth = Float.parseFloat(alliedHealthString);
			System.out.println("Allied Health Entered: " + alliedHealth);

			String alliedDamageString = JOptionPane.showInputDialog("Enter Damage of Allied Health Unit");
			float alliedDamage = Float.parseFloat(alliedDamageString);
			System.out.println("Allied Damage Entered: " + alliedDamage);

			String alliedProtectionString = JOptionPane.showInputDialog("Enter Protection Percent of Allied Unit");
			float alliedProtection = Float.parseFloat(alliedProtectionString);
			System.out.println("Allied Protection Entered: " + alliedProtection);

			String alliedFullHealthString = JOptionPane.showInputDialog("Enter Allied Full Health");
			float alliedFullHealth = Float.parseFloat(alliedFullHealthString);
			System.out.println("Allied Full Health Entered: " + alliedFullHealth);

			String alliedFullDamageString = JOptionPane.showInputDialog("Enter Allied Full Damage");
			float alliedFullDamage = Float.parseFloat(alliedFullDamageString);
			System.out.println("Allied Full Damage Entered: " + alliedFullDamage);

			// - - - - - - - ENEMY HEALTH, DAMAGE, PROTECTION - - - - - - - - - //

			String enemyHealthString = JOptionPane.showInputDialog("Enter Health of Enemy Unit");
			float enemyHealth = Float.parseFloat(enemyHealthString);
			System.out.println("Enemy Health Entered: " + enemyHealth);

			String enemyDamageString = JOptionPane.showInputDialog("Enter Damage of Enemy Unit");
			float enemyDamage = Float.parseFloat(enemyDamageString);
			System.out.println("Enemy Damage Entered: " + enemyDamage);

			String enemyProtectionString = JOptionPane.showInputDialog("Enter Protection Percent of Enemy Unit");
			float enemyProtection = Float.parseFloat(enemyProtectionString);
			System.out.println("Enemy Protection Entered: " + enemyProtection);

			String enemyFullHealthString = JOptionPane.showInputDialog("Enter Enemy Full Health");
			float enemyFullHealth = Float.parseFloat(enemyFullHealthString);
			System.out.println("Enemy Full Health Entered: " + enemyFullHealth);

			String enemyFullDamageString = JOptionPane.showInputDialog("Enter Enemy Full Damage");
			float enemyFullDamage = Float.parseFloat(enemyFullDamageString);
			System.out.println("Enemy Full Damage Entered: " + enemyFullDamage);

			numbersEntered = { alliedHealth, alliedDamage, alliedProtection, alliedFullHealth, alliedFullDamage,
					enemyHealth, enemyDamage, enemyProtection, enemyFullHealth, enemyFullDamage };

			Roll(numbersEntered);

			for (int i = 0; i < numbersEntered.length; i++) {
				System.out.print(numbersEntered[i] + ", ");
			}
		}if(arg0.getSource() == reRoll) {
			Roll(numbersEntered);
		}
	}

}
