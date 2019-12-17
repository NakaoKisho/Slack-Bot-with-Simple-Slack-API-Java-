package bot;

import com.google.gson.annotations.SerializedName;

public class ProviderEntity {

	 @SerializedName("link")
	    private String link;

	 @SerializedName("name")
	    private String name;

	    public String getLink() {
	        return link;
	    }

	    public String getName() {
	        return name;
	    }

	    @Override
	    public String toString() {
	        return "LinkEntity{" +
	                "link='" + this.link + '\'' +
	                ", name='" + this.name + '\'' +
	                '}' + "\n";
	    }

}
