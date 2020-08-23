package chapterTwo;

public class Palindrome {



   private boolean isPalindrome(String word) {
      if (word.length() == 1) {
         return true;
      }
      if (word.charAt(0) == word.charAt(word.length() - 1)) {
         String newWord = word.substring(1,word.length()-1);
         return isPalindrome(newWord);
      }else {
         return false;
      }
   }
   public static void main(String[] args) {
      Palindrome palindrome = new Palindrome();
      System.out.println(palindrome.isPalindrome("madam"));
   }
}
