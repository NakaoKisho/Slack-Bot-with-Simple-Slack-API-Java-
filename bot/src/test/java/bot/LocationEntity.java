package bot;

public class LocationEntity {

    private String city;
    private String area;
    private String prefecture;

    public String getCity() {
    	return this.city;
    }
    public String getArea() {
    	return this.area;
    }
    public String getPrefecture() {
    	return this.prefecture;
    }
    public String toString() {
    	return "LocationEntity{" +
    			", city=" + this.city +
                ", area=" + this.area +
                ", prefecture=" + this.prefecture +
                '}' + "\n";
    }
}
