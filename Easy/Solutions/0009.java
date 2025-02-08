/******************************************************************************
 Palindrome Number
------------------

Given an integer x, return true if x is a 
palindrome
, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*******************************************************************************/

class Solution {
    public boolean isPalindrome(int x) {
        int input = x;
        String temp = Integer.toString(input);
        int[] newInput = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newInput[i] = temp.charAt(i) - '0';
        }

        Boolean isPalindrom = false;

        if(newInput.length % 2 == 0){
            for(int i = 0; i < (newInput.length / 2) ; i++){
                if(newInput[i] == newInput[newInput.length -( i + 1)]){
                    isPalindrom = true;
                }
                else{
                    isPalindrom = false;
                    break;
            }
            }
        }
        else if(newInput.length % 2 == 1){
            for(int i = 0; i < ((newInput.length -1) / 2) ; i++){
                if(newInput[i] == newInput[newInput.length -( i + 1)]){
                    isPalindrom = true;
                }
                else{
                    isPalindrom = false;
                    break;
                }
            }
        }

        if(input < 0 ){
            isPalindrom = false;
        }
        if(newInput.length == 1){
            isPalindrom = true;
        }
        

        return isPalindrom;
        
    }
}
