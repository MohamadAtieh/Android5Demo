
package com.example.matie.myapplication.pojo;

import com.google.gson.annotations.Expose;

public class TodayWeather {

    @Expose
    private Object pressure;
    @Expose
    private Object temperature;

    /**
     * 
     * @return
     *     The pressure
     */
    public Object getPressure() {
        return pressure;
    }

    /**
     * 
     * @param pressure
     *     The pressure
     */
    public void setPressure(Object pressure) {
        this.pressure = pressure;
    }

    /**
     * 
     * @return
     *     The temperature
     */
    public Object getTemperature() {
        return temperature;
    }

    /**
     * 
     * @param temperature
     *     The temperature
     */
    public void setTemperature(Object temperature) {
        this.temperature = temperature;
    }

}
