import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProjectInfoMain {

	private Map<String,String> projectMap=new HashMap<String,String>();
	
	public Map<String, String> getProjectMap() {
		return projectMap;
	}

	public void setProjectMap(Map<String, String> projectMap) {
		this.projectMap = projectMap;
	}

	public int findTheCountOfProjectsBasedOnTheConstructionType(String constructionType) {
		int count=0;
		for(Map.Entry<String,String>entry:projectMap.entrySet()){
		    if(entry.getValue().equalsIgnoreCase(constructionType)){
		        count++;
		    }
		}
		return count>0 ? count:-1;
	}

	public List<String> findProjectIdsBasedOnTheConstructionType(String constructionType){
        List<String> projectIds = new ArrayList<>();
        	for(Map.Entry<String,String>entry:projectMap.entrySet()){
		    if(entry.getValue().equalsIgnoreCase(constructionType)){
		        projectIds.add(entry.getKey());
		    }
        	}
        	
		return projectIds;

	}

	public static void main(String args[]) {
		// You are provided with the main method as code template and it is excluded from evaluation.
		ProjectInfoMain office=new ProjectInfoMain();
		List<String> list=new ArrayList<String>();
		Map<String, String> map=new HashMap<String,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of projects to be added");
		int n=sc.nextInt();
		System.out.println("Enter the project (Project Id: Construction type)");
		String [] projectDetails = new String[n];
		for(int i=0;i<n;i++) {
			projectDetails[i] = sc.next();
		}

		for(int i=0;i<projectDetails.length;i++) {
			String[] a = projectDetails[i].split(":");

			map.put(a[0], (a[1]));

			office.setProjectMap(map);
		}


		System.out.println("Enter the Construction type to be searched");
		String searchType=sc.next();
		
		int count=office.findTheCountOfProjectsBasedOnTheConstructionType(searchType);
		if(count>0)
		{
			System.out.println("The projects based on "+searchType+" are "+count);
		}
		else
		{
			System.out.println("No projects were found for "+searchType);
		}

		System.out.println("Enter the Construction type to identify the Projects Ids");
		String constructionType=sc.next();
		
		list=office.findProjectIdsBasedOnTheConstructionType(constructionType);

		 
		if(list.size()>=1) {
			System.out.println("Projects based on the "+constructionType+" are ");
			for(String s:list)
			{
				System.out.println(s);
			}
		}
		else
			System.out.println("No Projects Ids were found for the "+constructionType);
	}

}
