package bot;

public class ImageEntity {

    private int width;
    private String url;
    private String title;
    private int height;

    public int getWidth() {
    	return this.width;
    }
    public String getUrl() {
    	return this.url;
    }
    public String getTitle() {
    	return this.title;
    }
    public int getHeight() {
    	return this.height;
    }
    public String toString() {
    	return "ImageEntity{" +
    			"title='" + this.title + '\'' +
                ", url='" + this.url + '\'' +
                ", width='" + this.width + '\'' +
                ", height='" + this.height + '\'' +
                '}' + "\n";
    }
}
