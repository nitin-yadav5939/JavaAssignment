package javaprac;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
public class MapManager {

public static void main(String args[]) {
	HashMap<String, Integer> numbers = new HashMap<>();
	numbers.put("amn",1);
	numbers.put("ashmi",2);
	numbers.put("nikku",3);
	numbers.put("bugs",4);
	numbers.put("nuts",5);
	numbers.put("sweetu",6);
	

	//for(Map.Entry<String,Integer>e:numbers.entrySet()) {
		//System.out.println(e.getKey());
	//}
	Set st=getKeys(numbers);
	System.out.println(st);
}
public static Set getKeys(Map<String,Integer>hmap)
{
	Set<String>hset=new HashSet<>();
	for(String key:hmap.keySet())
	{
		hset.add(key);
	}
	return hset;
}
}