package Nuke2;
import java.io.*;

public class Nuke2 {
	public static void main(String arg[]) throws Exception {
		BufferedReader keybd = new BufferedReader(new InputStreamReader(System.in));
		String b = new String(keybd.readLine()); 
		System.out.println("you input the value is: "+b);
		System.out.println();
		operation a =new operation();
		a.operation(b);
	}
}

class operation {
	int i;
	public void operation(String word){
		char[] array = word.toCharArray();
		for(i =0; i <= array.length-1; i++){    //array.length should be minus 1 because of array
			if(i!=1){
			System.out.print(array[i]);
			}
		}
	}
}
