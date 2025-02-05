package Problems;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;



public class GenerateRandomNumberAndStrings {

	public static void main(String[] args) {
		
		//Approach 1- using Random class
		
		/*
		 * Random rand = new Random(); //int random_int =rand.nextInt(1000);
		 * //System.out.println(random_int); double random_ddl = rand.nextDouble(); //
		 * range 0.0 to less than 1.0 System.out.println(random_ddl);
		 */
		
		//Approach 2- Math class
		System.out.println(Math.random());  // we can call the random method directly by using Math class - It will generate random Decimal number

		//Approach 3 -Apache commons- lang API 
		//This API wil help to generate random number as well as Strings
		//http://commons.apache.org/
		//To download - https://commons.apache.org/proper/commons-lang/download_lang.cgi
		//Give this jar build path - commons-lang3-3.17.0
		
		//RandomStringUtils.
		
		
	}

}
