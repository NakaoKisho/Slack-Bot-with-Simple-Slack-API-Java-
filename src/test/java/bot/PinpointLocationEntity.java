package bot;

public class PinpointLocationEntity {

    private String link;
    private String name;

    public String getLink() {
    	return this.link;
    }
    public String getName() {
    	return this.name;
    }
    public String toString() {
    	return "PinpointLocations{" +
    			", link=" + this.link +
                ", name=" + this.name +
                '}' + "\n";
    }
}
