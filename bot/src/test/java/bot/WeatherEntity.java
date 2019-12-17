package bot;

public class WeatherEntity {

    private String publicTime;
    private String title;
    private DescriptionEntity description;
    private String link;
    private ForecastEntity[] forecast;
    private LocationEntity location;
    private PinpointLocationEntity[] pinpointLocations;
    private CopyrightEntity copyright;

    public String getPublicTime() {
    	return this.publicTime;
    }
    public String getTitile() {
    	return this.title;
    }
    public DescriptionEntity getDescription() {
    	return this.description;
    }
    public String getLink() {
    	return this.link;
    }
    public ForecastEntity[] getForecast() {
    	return this.forecast;
    }
    public LocationEntity getLocation() {
    	return this.location;
    }
    public PinpointLocationEntity[] getPinpointLocations() {
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
                ", forecasts=" + this.forecast +
                "location='" + this.location + '\'' +
                ", pinpointLocations='" + this.pinpointLocations + '\'' +
                ", copyright=" + this.copyright +
                '}' + "\n";
    }
}
