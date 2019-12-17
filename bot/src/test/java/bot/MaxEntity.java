package bot;

public class MaxEntity {
    private String celsius;
    private String fahrenheit;
    
    public String getCelsius() {
    	return this.celsius;
    }
    public String getFahremheit() {
    	return this.fahrenheit;
    }
    public String toString() {
    	return "MaxEntity{" +
    			", celsius=" + this.celsius +
                ", fahrenheit=" + this.fahrenheit +
                '}' + "\n";
    }
}
