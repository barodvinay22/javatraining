//Strings * Write a code to check whether string is a palindrome or not(nayan) * Count the number of vowels and consonants in a string.
public class PalindromeString {
    public static void main(String[] args){
        System.out.println(isPalindromeReverse("madam"));
        System.out.println(isPalindromeReverse("hello"));
    }
    public static boolean isPalindromeReverse(String str){
        if(str == null || str.isEmpty()){
            return true; // empty string or null is considered as palindrome
        }
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;//All characters matched
    }
}
