import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cities {
	
	public Map<String, List<String>> Country = new HashMap<>();
	
	
	public Cities() {
		List<String> India = Arrays.asList("Hyderabad","Chennai","Banglore","Delhi","Mumbai");
		List<String> Nepal = Arrays.asList("Kathmandu","Chitwan","Pokhara","Lumbini","Bhaktapur");
		List<String> Us = Arrays.asList("Washington DC","Chicago","New York","LA","Houston");
		List<String> Korea = Arrays.asList("Seoul","Busan","Jinhae","Daegu","Gyeong");
		List<String> Japan = Arrays.asList("Tokyo","Kyoto","Osaka","Yokohama","Kobe");
		
		Country.put("India",India);
		Country.put("Nepal",Nepal);
		Country.put("Korea",Korea);
		Country.put("US",Us);
		Country.put("Japan",Japan);

	}
	
	
	public List<String> getCities(String country) {
		return Country.get(country);
	}

	//trying to implement it using api from wikipedia in next versions
}
