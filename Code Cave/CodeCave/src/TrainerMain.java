import java.util.*;
import java.util.Map.Entry;

public class TrainerMain {
	
	private Map<String, Float> trainerMap;

	

	public Map<String, Float> getTrainerMap() {
		return trainerMap;
	}

	public void setTrainerMap(Map<String, Float> trainerMap) {
		this.trainerMap = trainerMap;
	}

	public float findPerformanceRatingOfGivenTrainerId(String trainerId)
	{
	    // Fill the code here
		float s=-1;
		Map<String,Float> a=getTrainerMap();
		for(Map.Entry<String,Float> entry:a.entrySet())
		{
			if((entry.getKey()).equals(trainerId))
					{
						s=entry.getValue();
						
						//System.out.println(s);
					}
		}
		
		return s;

	   // return 0;
	}

	public List<String> findTrainerIdsWithLowPerformanceRating()
	{
	    // Fill the code here
	    
	    List<String> list=new ArrayList<String>();
		for(Entry<String, Float> entry:trainerMap.entrySet())
		{	 	  	  	 		     	   	      	 	
			if(entry.getValue()<=3)
			{
				list.add(entry.getKey());
			}
			
		}
		return list;
	
	
	   // return null;
	}
	
	

	public static void main(String args[])
	{
	    // Main method is excluded from evaluation. You are free to write your own code or add lines of code to check the correctness of the functionalities
	    
	    TrainerMain trainer=new TrainerMain();
		List<String> list1=new ArrayList<String>();
		Map<String, Float> map=new HashMap<String,Float>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of records to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the trainer records (Trainer id : Performance rating):");
		String [] trainerDetails = new String[n];
		for(int i=0;i<n;i++) {
			trainerDetails[i] = sc.next();
		}
		
		for(int i=0;i<trainerDetails.length;i++) {
			String[] a = trainerDetails[i].split(":");
			
			map.put(a[0], Float.parseFloat(a[1]));
			
			trainer.setTrainerMap(map);
		}
		System.out.println("Enter the trainer id to be searched");
		String search=sc.next();
		float rating=trainer.findPerformanceRatingOfGivenTrainerId(search);
		if(rating==-1)
		{
			System.out.println(search+" is an invalid trainer id");
		}
		else
		{
			System.out.println("Performance rating of trainer id "+search+" is "+rating);
		}
		list1=trainer.findTrainerIdsWithLowPerformanceRating();
		if(list1.size()>=1) 
		{
			System.out.println("Trainer id of the trainers with low rating are:"); 
			for(String s:list1)
			{
				System.out.println(s);
			}
		}
		else
			System.out.println("No trainers have a low rating");
	}
	
}