package bot;


public class TemperatureEntity {

    private MinEntity min;
    private MaxEntity max;

    public MinEntity getMin() {
    	return this.min;
    }
    public MaxEntity getMax() {
    	return this.max;
    }
    public String toString() {
    	return "TemperatureEntity{" +
    			", min=" + this.min +
                ", max=" + this.max +
                '}' + "\n";
    }
}
