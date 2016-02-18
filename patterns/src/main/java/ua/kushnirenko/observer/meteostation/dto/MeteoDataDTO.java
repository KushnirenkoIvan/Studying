package ua.kushnirenko.observer.meteostation.dto;

public class MeteoDataDTO {

    private Integer temperature;

    private Integer windSpeed;

    private Integer pressure;

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Integer windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Integer getPressure() {
        return pressure;
    }

    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public MeteoDataDTO() {
    }

    public MeteoDataDTO(Integer temperature, Integer windSpeed, Integer pressure) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "MeteoDataDTO{" +
                "pressure=" + pressure +
                ", windSpeed=" + windSpeed +
                ", temperature=" + temperature +
                '}';
    }
}
