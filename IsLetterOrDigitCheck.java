public class IsLetterOrDigitCheck {
    public static void main(String[] args) {
        int i=0;
        String s = "Was it a car or a cat I saw?";
        while(true) {
        if(Character.isLetterOrDigit(s.charAt(i))) {
          System.out.println(s.charAt(i));
        } else {
            System.out.println("Not letter or digit " + s.charAt(i));
        }

        i++;
    }
}
}
