/**
 * @(#)CurrentDirectoryExample.java
 *
 *
 * @author 
 * @version 1.00 2015/4/21
 */
import java.io.*;

public class CurrentDirectoryExample {

    public static void main (String args[]) {
    	String current = System.getProperty("user.dir");
    	System.out.println("Current working direcotry in Java: " + current);
    }
    
    
}