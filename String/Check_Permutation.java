/*
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
Permutations of each other
Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

Example: 
str1= "sinrtg" 
str2 = "string"

The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
Input Format:
The first line of input contains a string without any leading and trailing spaces, representing the first string 'str1'.

The second line of input contains a string without any leading and trailing spaces, representing the second string 'str2'.
Note:
All the characters in the input strings would be in lower case.
Output Format:
The only line of output prints either 'true' or 'false', denoting whether the two strings are a permutation of each other or not.

You are not required to print anything. It has already been taken care of. Just implement the function. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
abcde
baedc
Sample Output 1:
true
Sample Input 2:
abc
cbd
Sample Output 2:
false
*/


public class Solution {
    
//     public static String arrangeString(String inputString) {
//         int i,j;
// 		String str = "";
// 		    j = 97;
// 			while(j <= 122) {
// 			i = 0;
// 			do {
// 				if((int)inputString.charAt(i) == j) {
// 					str = str + (char)j;
// 				}
// 				i++;
// 			}while(i < inputString.length());
// 			j++;
// 		}
// 			return str;
		
// }

	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
		// boolean result = true;;
		// if(str1.length() != str2.length()){
		//   result = false;
		// }else{
		// 	String s1 = arrangeString(str1);
		// 	String s2 = arrangeString(str2);
		// 	for(int i = 0;i < s1.length();i++) {
		// 		if(s1.charAt(i) != s2.charAt(i)){
		// 			result = false;
		// 			break;
		// 		}
		// 	}
		// }
		// 	return result;
        int frequencyArr[]=new int[256];
  int count=0;
for(int i=0;i<str1.length();i++){
int cha=str1.charAt(i);
    frequencyArr[cha]=frequencyArr[cha]+1;}
    for(int i=0;i<str2.length();i++)
    {
        int ch=str2.charAt(i);
        frequencyArr[ch]=frequencyArr[ch]-1;
 }
    for(int i=0;i<256;i++)
    {
        if(frequencyArr[i]==0)
            count++;
    }
    if(count==256)
        return true;
    else
        return false;
	}

}
