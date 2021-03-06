import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_UserLogs {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// initialize a map for storing all input data
		Map<String, LinkedHashMap<String, Integer>> log = new TreeMap<>();

		// parse each row until receiving the command "end"
		while (true) {
			String command = scan.nextLine();
			if (command.equals("end")) {
				// leave the infinite loop
				break;
			} else {
				// split the input into an array
				String[] input = command.replaceAll("\\s+", "")
						.replaceAll("IP=", "").replaceAll("message=", " ")
						.replaceAll("user=", " ").split("\\s+");
				// variables to add to the log
				String ipAddress = input[0];
				String user = input[2];
				
				// add the new user if it is not in the map
				if (log.containsKey(user) == false) {
					
					LinkedHashMap<String, Integer> data = new LinkedHashMap<>();
					data.put(ipAddress, 1);
					log.put(user, data);
					
				// add the data for an existing user
				} else {
					
					LinkedHashMap<String, Integer> data = log.get(user);
					
					if (data.containsKey(ipAddress)) {
						data.put(ipAddress, data.get(ipAddress) + 1);
					} else {
						data.put(ipAddress, 1);
					}
					
					log.put(user, data);					
				}
			}
		}
		
		// print the result in the required format
		for (String user : log.keySet()) {
			System.out.println(user + ":");			
			LinkedHashMap<String, Integer> data = log.get(user);
			int count = data.size();
			
			for (String ipAddress : data.keySet()) {
				System.out.print(ipAddress + " => " + data.get(ipAddress));
				count--;
				if (count > 0) {
					System.out.print(", ");
				} else {
					System.out.println(".");
				}
			}
		}

	}

}
