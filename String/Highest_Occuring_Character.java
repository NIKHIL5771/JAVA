/*
For a given a string(str), find and return the highest occurring character.
Example:
Input String: "abcdeapapqarr"
Expected Output: 'a'
Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
If there are two characters in the input string with the same frequency, return the character which comes first.
Consider:
Assume all the characters in the given string to be in lowercase always.
Input Format:
The first and only line of input contains a string without any leading and trailing spaces.
Output Format:
The only line of output prints the updated string. 
Note:
You are not required to print anything explicitly. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abdefgbabfba
Sample Output 1:
b
Sample Input 2:
xy
Sample Output 2:
x
*/


public class Solution {

	public static char highestOccuringChar(String str) {
		//Your code goes here
	// int c1 = 0,c2 = 0,i,j;
	// 	char maxChar = '\0';
	// 	j = 0;
	// 	while(j < str.length()) {
	// 	i = 0;
	// 	do {
	// 		if(str.charAt(i) == str.charAt(j)) {
	// 			c2++;
	// 		}
	// 		i++;
	// 	}while(i < str.length());
	// 	if(c2 > c1) {
	// 		maxChar = str.charAt(j) ;
	// 		c1 = c2;
	// 	}
	// 	c2 = 0;
	// 	j++;
	// }
	// 	return maxChar;
        
       int freq[]=new int[256];

        for(int i=0;i<str.length();i++)
        {
            int ch=str.charAt(i);
            freq[ch]=freq[ch]+1;
        }


		int largest =0;
        char indexToChar=str.charAt(0);
        for(int i=0;i<str.length();i++)
        {
            int index = str.charAt(i);
            if(freq[index] > largest){
                indexToChar = str.charAt(i);
                largest = freq[index];
            }
        }
        return indexToChar;
	}

}
