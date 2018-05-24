import java.util.HashMap;
import java.util.Map;


public class Demo {

	public static void main(String args[])
	{
		
		
		Map<String,String> hmap=new HashMap<String,String>();
		
		hmap.put("1", "94505005");
		hmap.put("2", "98989898");
		hmap.put("0", "10000000");
		hmap.put("3", "20000000");
		hmap.put("2", "30000000");
		hmap.put("4", "40000000");
		
		for ( String key : hmap.keySet() ) {
		    System.out.println( key );
		}
	}
}
