import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			String date=br.readLine();
			String result=UserMainCode.getDayOfWeek(date);
			System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
