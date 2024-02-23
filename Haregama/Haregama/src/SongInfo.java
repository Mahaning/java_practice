import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SongInfo {
	
	private Map<String, Integer> songMap;

	public Map<String, Integer> getSongMap() {
		return songMap;
	}

	public void setSongMap(Map<String, Integer> songMap) {
		this.songMap = songMap;
	}

	
public int findTheViewsForGivenSongTitle(String songTitle) {
    for (Map.Entry<String, Integer> entry : songMap.entrySet()) {
        if (entry.getKey().equalsIgnoreCase(songTitle)) {
            return entry.getValue();
        }
    }
    return -1;
}
	public List<String> findTheSongWithHighestViews()
	{
	     // Fill the code here
		 List<String> highestViewSongs=new ArrayList<>();
		 int maxViews=Collections.max(this.songMap.values());
	 for(Map.Entry<String,Integer> entry:this.songMap.entrySet()){
	     if(entry.getValue()==maxViews){
	         highestViewSongs.add(entry.getKey());
	     }
	 }
	 return highestViewSongs;
	}

	public static void main(String args[])
	{
	    //You are provided with the main method as code template and it is excluded from evaluation.
	    SongInfo hall=new SongInfo();
		List<String> list1=new ArrayList<String>();
		Map<String, Integer> map=new HashMap<String,Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of records to be added:");
		int n=sc.nextInt();
		System.out.println("Enter the song records (Song title: Views):");
		String [] hallDetails = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			hallDetails[i] = sc.nextLine();
		}
		
		for(int i=0;i<hallDetails.length;i++) {
			String[] a = hallDetails[i].split(":");
			
			map.put(a[0], Integer.parseInt(a[1]));
			
			hall.setSongMap(map);
		}
		System.out.println("Enter the song title to be searched");
		String search=sc.nextLine();
		int value=hall.findTheViewsForGivenSongTitle(search);
		if(value!=-1)
		{
			System.out.println(value);
		}
		else
		{
			System.out.println(search+" is an invalid song title");
		}
		list1=hall.findTheSongWithHighestViews();
		
		System.out.println("Song title with the highest views is:");
		for(String s:list1)
		{
			System.out.println(s);
		} 
		
	}
	
}