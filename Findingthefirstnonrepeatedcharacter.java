package Givero;

public class Findingthefirstnonrepeatedcharacter {

  public static void main(String[] args) {
   
  String inputStr = " Reed ";
  for(char i : inputStr. toCharArray()) {
    if(inputStr.indexOf(i) == inputStr. lastIndexOf(i)) {
      
      System.out.println("First non repeated character is; " +i);
      
    }
  }
  

  }

}