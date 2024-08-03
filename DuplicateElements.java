import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names[] = {"Java", "JavaScript","Python","C","Java"};
		
		//1.Compare each element (O(n*n))
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i] == names[j])
				{
					System.out.println("Duplicate element is : "+names[i]);
				}
			}
		}
		System.out.println("****************");
		//Using HashSet 
		Set<String> s = new HashSet<String>();
		for(String name : names)
		{
			if(s.add(name) == false)
			{
				System.out.println("Duplicate element is : "+name);
			}
		}
		
		System.out.println("****************");
		
		//3. Using HashMap
		
		Map<String,Integer> h = new HashMap<String,Integer>();
		
		for(String name:names)
		{
			Integer count = h.get(name);
			if(count == null)
			{
				h.put(name,1);
			}
			else {
				h.put(name,++count);
			}
		}
		
			//get the value from this hashmap
		Set<Entry<String,Integer>>  entryset = h.entrySet();
		for(Entry<String,Integer> entry : entryset )
		{
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate element is : "+entry.getKey());
			}
		}
		
	}

}
