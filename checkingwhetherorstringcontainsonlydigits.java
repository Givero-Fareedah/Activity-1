package Givero;

public class checkingwhetherorstringcontainsonlydigits {

  public static void main(String[] args) {
   
   String str = "041120";
   boolean result = str.matches("[0-9]+");
   System.out.println("Original String : " + str);
   System.out.println("Does string contain only Digits? : " + result);
  

  }

}