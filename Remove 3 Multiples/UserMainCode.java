import java.util.ArrayList;

public class UserMainCode {
    
    public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> al) {
        
        //fill the code
        
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=0;i<al.size();i++){
            if((i + 1) % 3 != 0){
                result.add(al.get(i));
            }
        }
        return result;
    }
}