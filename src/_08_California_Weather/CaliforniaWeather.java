package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Ancients
 *          Program: Ancients is Overcast with a temperature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, PomOna, OceanSide, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *         AutoCorrect is definitely working
 *          Program: Fortune, Gallantly, Dew Mar, Ban Dig, Camel Valley, Slain Beach, El Cannon, Lots Angles, 
 *           Corned, Chime Vista,  Byway, Ban Macros, leg Mesh, Senate, Likest, Ranch Saint, Point,
 *           Broke Springs,  Cash den Pro-Mount Hillocks, Mount Lagoon, Pencil, Camp, Potterer, Lab Press, 
 *           Duskiness,  ...
 *           
 *           
 * 
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api
 */
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

public class CaliforniaWeather implements ActionListener {
	/*
	 * OBJECTIVE: 1. Create a program that allows the user to search for the weather
	 * conditions of a given city in California. Use the example program below and
	 * the Utilities class inside this project to get the temperature data from a
	 * day in December 2020. Example: User: Ancients Program: Ancients is Overcast
	 * with a temperature of 59.01 �F
	 * 
	 * 2. Create a way for the user to specify the weather condition and then list
	 * the cities that have those conditions. Example: User: Mostly Cloudy Program:
	 * Long Beach, PomOna, OceanSide, ...
	 * 
	 * 3. Create a way for the user to enter a minimum and maximum temperature and
	 * then list the cities that have temperatures within that range Example: User:
	 * minimum temperature �F = 65.0, max temperature �F = 70.0 AutoCorrect is
	 * definitely working Program: Fortune, Gallantly, Dew Mar, Ban Dig, Camel
	 * Valley, Slain Beach, El Cannon, Lots Angles, Corned, Chime Vista, Byway, Ban
	 * Macros, leg Mesh, Senate, Likest, Ranch Saint, Point, Broke Springs, Cash den
	 * Pro-Mount Hillocks, Mount Lagoon, Pencil, Camp, Potterer, Lab Press,
	 * Duskiness, ...
	 * 
	 * 
	 * 
	 * EXTRA: Feel free to add pictures for specific weather conditions or a
	 * thermometer for the temperature. Also If you want your program to get the
	 * current day's temperature, you can get a free API key at:
	 * https://openweathermap.org/api
	 */

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton citySearch = new JButton();
	JButton weatherSearch = new JButton();
	JButton tempSearch = new JButton();

	void start() {

		panel.add(citySearch);
		panel.add(weatherSearch);
		panel.add(tempSearch);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 500);
		citySearch.setText("Search for Cities");
		weatherSearch.setText("Search for Weather");
		citySearch.addActionListener(this);
		weatherSearch.addActionListener(this);
		tempSearch.setText("Temperature");
		tempSearch.addActionListener(this);
		// All city keys have the first letter capitalized of each word
//		String cityName = Utilities.capitalizeWords("National City");
//		WeatherData datum = weatherData.get(cityName);

//		if (datum == null) {
//			System.out.println("Unable to find weather data for: " + cityName);
//		} else {
//			System.out.println(
//					cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " ");
//		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
		if (e.getSource() == citySearch) {
			String cityName = JOptionPane.showInputDialog("Enter a city name");
			WeatherData john = weatherData.get(cityName);
			if (john == null) {
				JOptionPane.showMessageDialog(null, "Sorry. Not able to find data for: " + cityName);
			} else {
				JOptionPane.showMessageDialog(null,
						cityName + " is " + john.weatherSummary + ". Temperature: " + john.temperatureF);
				System.out.println(john.weatherSummary);
			}

		}
		if (e.getSource() == weatherSearch) {
			
			String weatherName = JOptionPane.showInputDialog("Enter a weather type");
			String cities = "";
		
			
				for (String city: weatherData.keySet()) {
					if(weatherData.get(city).weatherSummary.contains(weatherName)) {
						cities += city + " \n ";
						//System.out.println(city);
					}
				}
				
				JOptionPane.showMessageDialog(null, "Cities are " +  cities);

		}if(e.getSource() == tempSearch) {
			String mini = JOptionPane.showInputDialog("Enter minimum temperature:");
			String maxi = JOptionPane.showInputDialog("Enter Maximum temperature:");
			String cities = "";
			
			double min = Double.parseDouble(mini);
			double max = Double.parseDouble(maxi);
			
			for(String city: weatherData.keySet()) {
				if(weatherData.get(city).temperatureF >= max || weatherData.get(city).temperatureF <= min) {
					
				}else {
					cities += city + " \n ";
				}
			}
			JOptionPane.showMessageDialog(null, "Cities are: " + cities);
			
		}
	}
}
