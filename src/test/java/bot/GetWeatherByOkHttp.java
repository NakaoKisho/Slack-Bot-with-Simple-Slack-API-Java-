package bot;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GetWeatherByOkHttp{
	String result;
	public String getWeatherByOkHttp() throws IOException {
		Request request = new Request.Builder()
	        		.url("http://weather.livedoor.com/forecast/webservice/json/v1?city=011000")
	                 .get()
	                 .build();

	        OkHttpClient client = new OkHttpClient();
	        Response response = client.newCall(request).execute();
	        result = response.body().string();
	        return result;
	 }
}
