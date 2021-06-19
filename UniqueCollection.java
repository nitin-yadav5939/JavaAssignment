package javaprac;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class UniqueCollection {
public static void main(String args[])
{
	Set<String> set=new TreeSet<>();
	//set.add("hitesh");
	//set.add("ashmi");
	///set.add("amn");
	//set.add("nikku");
	//set.add("mary");
	//set.add("aayush");
	//System.out.println(set);
	String arr[]= {"hitesh","ashmi","amn","nikku","mary","aayush"};
	 Set st=getCollection(arr);
	 System.out.println(st);
	 }
public static Set getCollection(String arr[])
{
	Set <String> str= new TreeSet<>();
	for(int i=0;i<arr.length;i++)
	{
		str.add(arr[i]);
	}
	return str;
}
}
