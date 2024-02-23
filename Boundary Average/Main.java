import java.io.*;
class Main
{
   public static void main(String args[]) throws IOException
   {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));     
     Integer n = Integer.parseInt(br.readLine());
     int[] inputs = new int[n];
     for(int i=0;i<n;i++) {
    	 inputs[i] = Integer.parseInt(br.readLine());
     }
     System.out.println(UserMainCode.getBoundaryAverage(inputs));
   }
}
