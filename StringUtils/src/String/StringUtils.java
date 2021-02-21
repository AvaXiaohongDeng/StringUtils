package String;
/**
 * Sample code to be used for midterm review.
 * Utility class to manipulate Strings. Methods are utility methods
 * and therefore are static. 
 * @author dancye, 2021
 *
 */
public class StringUtils 
{
	/**
	 * A method to reverse a String of length 1 or higher
	 * @param givenString - the string to reverse
	 * @return
	 * @throws NullPointerException
	 */
	public static String reverseString(String givenString) throws NullPointerException
	{
		String newString = "";
		if(givenString==null)
		{
			throw new NullPointerException();
		}
		else
		{
			
			for(int i=givenString.length()-1; i>=0;i--)
			{
				char current = givenString.charAt(i);
				newString+=current;
			}
		}
		return newString;
	}

}
