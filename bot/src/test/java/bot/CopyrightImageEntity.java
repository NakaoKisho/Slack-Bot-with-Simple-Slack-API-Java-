package bot;

import com.google.gson.annotations.SerializedName;

public class CopyrightImageEntity {

	@SerializedName("title")
    private String title;

    @SerializedName("link")
    private String link;

    @SerializedName("url")
    private String url;

    @SerializedName("width")
    private String width;

    @SerializedName("height")
    private String height;

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getUrl() {
        return url;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "CopyrightImageEntity{" +
                "title='" + this.title + '\'' +
                ", link='" + this.link + '\'' +
                ", url='" + this.url + '\'' +
                ", width='" + this.width + '\'' +
                ", height='" + this.height + '\'' +
                '}' + "\n";
    }

}
