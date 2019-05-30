package some;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SomeBean {
	private List<String> city;
	private Map<String,Double> score;
	private Set<String> sports;
	private Properties db;
	public void setCity(List<String> city) {
		this.city = city;
	}
	public void setScore(Map<String, Double> score) {
		this.score = score;
	}
	public void setSports(Set<String> sports) {
		this.sports = sports;
	}
	public void setDb(Properties db) {
		this.db = db;
	}
	@Override
	public String toString() {
		return "SomeBean [city=" + city + ", score=" + score + ", sports=" + sports + ", db=" + db + "]";
	}

	
}
