package QuotesGen;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QuotesGenerator {

    private static final String JSON_FILE_PATH = "C:\\Users\\Raji\\eclipse-workspace\\QuotesGenerator1\\src\\QuotesGen\\Quote.JSON"; // Set your JSON file path here

    public static void main(String[] args) throws IOException {
        // Create a Scanner to get the user's input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

       // Read the JSON data from file
        byte[] jsonData = Files.readAllBytes(Paths.get(JSON_FILE_PATH));
        System.out.println(1);
        String jsonString = new String(jsonData);
        System.out.println(1);

        // Map the JSON to a list of Quotes objects
      
        System.out.println(1);
        String arr[]=jsonString.split(",");
		List<Quotes> quotesList=new ArrayList<Quotes>();
		
		for(int i=0;i<arr.length-2;i++) {
		//	String temp=arr[i]+" "+arr[i+1];
			quotesList.subList(i, i+1);
		}
		
		System.out.println(1);
		Random random = new Random();
		int randomIndex = random.nextInt();
		if(randomIndex<quotesList.size())
		Quotes randomQuote = quotesList.get(randomIndex);
		 System.out.println(1);

		System.out.println("\nHello, " + name + "! Here's a quote for you:");
		System.out.println("\"" + randomQuote.getQuote() + "\"");
		System.out.println("- " + randomQuote.getAuthor() + "\n");

		scanner.close();
    }
}
