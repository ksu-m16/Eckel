package containers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//(2) Create a Collection initializer that opens a file 
//and breaks it into words using TextFile, and then uses 
//the words as the source of data for the resulting Collection. 
//Demonstrate that it works.


public class E4 {

	
	private TreeSet<String> getWords() throws IOException{
		
		File f = new File(".//text.txt");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
		
		TreeSet<String> words = new TreeSet<String>(); 
		String s;
		
		Pattern p = Pattern.compile("([a-zA-Z]+)");
		try{
		while((s = reader.readLine()) != null) {
			Matcher m = p.matcher(s);
			while(m.find()) {
				words.add(m.group(0));
			}
			
		}
		}
		finally{
			reader.close();
		}
		
		
		return words; 
		
	}
	
	public static void main(String[] args) {
	
		E4 e4 = new E4();
		try {
			TreeSet<String> words = e4.getWords();
			
			for (String s: words) {
				System.out.println(s);
			}
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("File not found.");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	
	
	}
}
