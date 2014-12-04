/* OpenCommercial.java */
package OpenCommercial;
import java.net.*;
import java.io.*;
import java.util.*;


/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    pop_pushline b = new pop_pushline();
    b.popline(inputLine, 10);
    
  }
}

class pop_pushline {
	public Stack st;
    public  void popline(String name, int times) throws Exception{
		Stack st = new Stack();
    	name = new String("http://www."+name+".com/");
		System.out.println(name);
		URL u = new URL(name);
		InputStream ins = u.openStream();
		InputStreamReader isr = new InputStreamReader(ins);
		BufferedReader wh = new BufferedReader(isr);
		for(int i =0; i < times; i++){
			st.push(wh.readLine());
		}
		for(int i = 0; i< times; i++){
			String print_line = (String) st.pop();
			System.out.println(print_line);
		}
	}
}
