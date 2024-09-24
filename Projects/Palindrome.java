package Projects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        
        System.out.println("Enter your word to check palindrome: ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        String s = bf.readLine();
        String revString = new StringBuffer(s).reverse().toString();
        if (s.equals(revString)){
            System.out.println("The "+s+" String is Palindrome");
        }
        else{
            System.out.println("The "+s+" String is not Palindrome");
        }
    }
}
