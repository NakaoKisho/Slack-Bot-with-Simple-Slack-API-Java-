package bot;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class CopyrightEntity {

	 @SerializedName("title")
	    private String title;

	    @SerializedName("link")
	    private String link;

	    @SerializedName("image")
	    private ImageEntity image;

	    @SerializedName("provider")
	    private List<ProviderEntity> provider;

	    public String getTitle() {
	        return title;
	    }

	    public String getLink() {
	        return link;
	    }

	    public ImageEntity getImage() {
	        return image;
	    }

	    public List<ProviderEntity> getProvider() {
	        return provider;
	    }

	    @Override
	    public String toString() {
	        return "CopyrightEntity{" +
	                "title='" + title + '\'' +
	                ", link='" + link + '\'' +
	                ", image=" + image +
	                ", provider=" + provider +
	                '}' + "\n";
	    }
}
