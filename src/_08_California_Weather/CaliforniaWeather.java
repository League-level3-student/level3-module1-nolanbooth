package _08_California_Weather;

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

public class CaliforniaWeather {
    
    
    
    
    
    void start() {
        HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        
        // All city keys have the first letter capitalized of each word
        String cityName = Utilities.capitalizeWords( "National City" );
        WeatherData datum = weatherData.get(cityName);
        
        if( datum == null ) {
            System.out.println("Unable to find weather data for: " + cityName);
        } else {
            System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
        }
    }
}
