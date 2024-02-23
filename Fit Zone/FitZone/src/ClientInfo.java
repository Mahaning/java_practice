
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ClientInfo {
    private Map<String, String> clientMap = new HashMap<String, String>();

    public Map<String, String> getClientMap() {
        return clientMap;
    }

    public void setClientMap(Map<String, String> map) {
        this.clientMap = map;
    }

    public int findTotalCountOfClientsBasedOnPackageName(String packageName) {
        int count = 0;

        for (Map.Entry<String, String> entry : clientMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(packageName)) {
                count++;
            }
        }

        if (count == 0) {
            count = -1;
        }

        return count;
    }

    public List<String> searchClientIdsByPackageName(String packageName) {
        List<String> clients = new ArrayList<>();

        for (Map.Entry<String, String> entry : clientMap.entrySet()) {	 	  	 	      	     	      	 	   	 	
            if (entry.getValue().equalsIgnoreCase(packageName)) {
                clients.add(entry.getKey());
            }
        }

        return clients;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClientInfo clientInfo = new ClientInfo();
        Map<String, String> map = new HashMap<String, String>();
        System.out.println("Enter number of clients to be added");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the client details (Client Id: Package Name)");

        for(int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] clientDetails=s.split(":");
            map.put(clientDetails[0],clientDetails[1]);
        }
        clientInfo.setClientMap(map);

        System.out.println("Enter the package name to find the total count of clients");
        String packageName=sc.nextLine();
        int count=clientInfo.findTotalCountOfClientsBasedOnPackageName(packageName);
        if (count==-1) {
            System.out.println("No clients found with package name "+packageName);
        }else{
            System.out.println("Total number of clients with package name "+packageName +" is "+count);
        }

        System.out.println("Enter the package name to search for client Ids");
        String searchPackage =sc.next();
        List<String> clientIds = clientInfo.searchClientIdsByPackageName(searchPackage);
        if(!clientIds.isEmpty()) {	 	  	 	      	     	      	 	   	 	
            System.out.println("Client Ids based on package name " +searchPackage);
            for(String id : clientIds) {
              System.out.println(id);
            }
        } else{
            System.out.println("No clients found with package name "+searchPackage);
        }
    }
}
