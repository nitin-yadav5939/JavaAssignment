package javaprac;
import java.util.*;
public class ListManagerques {
public static void main(String args[])
{
	List<String> l1=new ArrayList<>();
	List<String> l2= new ArrayList<>();
	l1.add("a");
	l1.add("a");
	l1.add("b");
	l1.add("d");
	l1.add("e");
	l1.add("f");
	l2.add("b");
	l2.add("d");
	l2.add("f");
	removeElements(l1,l2);
}
public static void removeElements(List<String> l3,List<String> l4)
{
l5=removeElements(l3,l4);
System.out.println(l5);
	}
}
