import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WeekFour {

	public static void main(String[] args) {
		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap <Integer, String>();
		
		//List
		employeeNames.add("Mary Smith");
		employeeNames.add("Cary Grant");
		employeeNames.add("James Dean");
		employeeNames.add("Ginger Rogers");
		employeeNames.add("Natalie Wood");
		
		//Set
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		int i = 0;
		for(int id : ids) {
			employeeMap.put(id, employeeNames.get(i));	
			i++;
		}
		
//		for(int getid : ids) {
//			//String getEmployeeName = employeeNames.get(getid-1);
//			//System.out.println(getEmployeeName);
//			employeeMap.put(getid, getEmployeeName);	
//		}
		
		
//		for(int employeeId : employeeMap.keySet()) {
//			System.out.println(employeeId +": "+ employeeMap.get(employeeId));
//			
//		}
		
//		StringBuilder idsBuilder = null;
//		for(int getStringBld : employeeMap.keySet()) {
//			idsBuilder = new StringBuilder(getStringBld+"-");
//			System.out.print(idsBuilder.toString());
//		}
//		
//		StringBuilder nameBuilder = null;
//		for(String getName : employeeNames) {
//			nameBuilder = new StringBuilder(getName+" ");
//			System.out.print(nameBuilder.toString());
//			
//		}
		
		//add the numbers and names with a dash
//		StringBuilder idsBuilderTwo = null;
//		for(int getStringBld : employeeMap.keySet()) {
//			idsBuilderTwo = new StringBuilder(getStringBld+"-");
//			idsBuilderTwo.append(employeeMap.get(getStringBld));
//			System.out.println(idsBuilderTwo.toString());
//		}	
		

	}

}
