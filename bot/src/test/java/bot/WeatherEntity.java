package bot;

import java.util.List;

public class WeatherEntity {

    private String publicTime;
    private String title;
    private DescriptionEntity description;
    private String link;
    private List<ForecastsEntity> forecasts;
    private LocationEntity location;
    private List<PinpointLocationEntity> pinpointLocations;
    private CopyrightEntity copyright;

    public String getPublicTime() {
    	return this.publicTime;
    }
    public String getTitle() {
    	return this.title;
    }
    public DescriptionEntity getDescription() {
    	return this.description;
    }
    public String getLink() {
    	return this.link;
    }
    public List<ForecastsEntity> getForecasts() {
    	return this.forecasts;
    }
    public LocationEntity getLocation() {
    	return this.location;
    }
    public List<PinpointLocationEntity> getPinpointLocations() {
    	return this.pinpointLocations;
    }
    public CopyrightEntity getCopyright() {
    	return this.copyright;
    }
    public String toString() {
    	return "WeatherEntity{"  +
    			"publicTime='" + this.publicTime + '\'' +
                ", title='" +this. title + '\'' +
                ", description='" + this.description + '\'' +
                ", link=" + this.link +
                ", forecasts=" + this.forecasts +
                "location='" + this.location + '\'' +
                ", pinpointLocations='" + this.pinpointLocations + '\'' +
                ", copyright=" + this.copyright +
                '}' + "\n";
    }
}
