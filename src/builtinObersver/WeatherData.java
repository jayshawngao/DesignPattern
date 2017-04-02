package builtinObersver;

import java.util.Observable;

public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {} //不再需要手动建立ArrayList
	
	public void measurementsChanged(){
		setChanged(); 
		notifyObservers();//没有主动传送数据,表示使用的是pull的方式,push方式需要主动推送数据
	}
	
	public void setMeasurements(float temperature,  float humidity, float pressure){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	
}
