package bot;

import com.google.gson.annotations.SerializedName;

public class ForecastsEntity {
	 @SerializedName("date")
	    private String date;

	    @SerializedName("dateLabel")
	    private String dateLabel;

	    @SerializedName("telop")
	    private String telop;

	    @SerializedName("image")
	    private ImageEntity image;

	    @SerializedName("temperature")
	    private TemperatureEntity temperature;

	    public String getDate() {
	        return this.date;
	    }

	    public String getDateLabel() {
	        return this.dateLabel;
	    }

	    public String getTelop() {
	        return this.telop;
	    }

	    public ImageEntity getImage() {
	        return this.image;
	    }

	    public TemperatureEntity getTemperature() {
	        return this.temperature;
	    }

	    @Override
	    public String toString() {
	        return "ForecastsEntity{" +
	                "date='" + this.date + '\'' +
	                ", dateLabel='" +this. dateLabel + '\'' +
	                ", telop='" + this.telop + '\'' +
	                ", image=" + this.image +
	                ", temperature=" + this.temperature +
	                '}' + "\n";
	    }
}
