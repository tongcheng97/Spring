package study1;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;





public class Data {
	public JSONArray getData() {
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String,Object> map1 = new LinkedHashMap<String,Object>();
		Map<String,Object> map2 = new LinkedHashMap<String,Object>();
		map1.put("name", "°×·ã");
		map1.put("sex", "ÄĞ");
		map2.put("name","°×óãÓê");
		map2.put("sex", "Å®");
		list.add(map1);
		list.add(map2);
		JSONArray jb = JSONArray.fromObject(list);
		return jb;
	}
}
