package cn.summerwaves.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@ContextConfiguration(locations = {"classpath:spring.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class WeatherDataTest {

    @Autowired
    private WeatherData weatherData;

    @Autowired
    private CurrentConditionDisplay currentConditionDisplay;

    @Test
    public void setMeasurements() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.removerObserver(currentConditionDisplay);
        weatherData.setMeasurements(700, 605, 300.4f);
    }

    @Test
    public void setMeasurementsBySpring() {
        weatherData.setMeasurements(80, 65, 30.4f);
    }

    @Test
    public void currentConditionDisplayTest() {
        currentConditionDisplay.display();
    }
}