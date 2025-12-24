class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        
        int j=s.length()-1;
        int n=s.length()/2;
        boolean isPalindrome = true;
        while(i < j) {
          if(!Character.isLetterOrDigit(s.charAt(i))) {
            i++;
            continue;
          }
          
          if(!Character.isLetterOrDigit(s.charAt(j))) {
            j--;
            continue;
          }

          System.out.println(s.charAt(i) + " " + s.charAt(j));
          if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
            isPalindrome = false;
            break;
          }

          i++;
          j--;
       
    }

        if(isPalindrome) {
           return true;
        }else {
            return false;
        }
    }
}
