package bot;

public class MinEntity {
	private String celsius;
    private String fahrenheit;
    
    public String getCelsius() {
    	return this.celsius;
    }
    public String getFahremheit() {
    	return this.fahrenheit;
    }
    public String toString() {
    	return "MinEntity{" +
    			", celsius=" + this.celsius +
                ", fahrenheit=" + this.fahrenheit +
                '}' + "\n";
    }
}
