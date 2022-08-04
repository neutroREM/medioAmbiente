package com.example.uptenfermeria.models;

public class WaqiIaqi {
    private WakiPm10 pm10;
    private WapiPm25 pm25;

    public WakiPm10 getPm10() {
        return pm10;
    }

    public void setPm10(WakiPm10 pm10) {
        this.pm10 = pm10;
    }

    public WapiPm25 getPm25() {
        return pm25;
    }

    public void setPm25(WapiPm25 pm25) {
        this.pm25 = pm25;
    }
}

