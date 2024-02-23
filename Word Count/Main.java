import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    int size,input1;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    size=Integer.parseInt(br.readLine());
    String[] array =new String[size];
    for(int i=0;i<size;i++)
    {
        array[i]=br.readLine();
    }
    input1=Integer.parseInt(br.readLine());
    System.out.println(UserMainCode.countWord(array,input1));
    }
}
