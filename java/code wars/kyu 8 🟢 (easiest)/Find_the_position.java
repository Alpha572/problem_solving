/* 
 Find the position of the alphabet in the English alphabet (1 based indexing).
For example, for 'a' the position is 1, for 'z' the position is 26.
Note: Only lowercased English letters are tested
*/

package com.mycompany.hkr_tasks;


public class Find_the_position {

  public static String position(char alphabet)
  {
   int position=(int) alphabet-96;
    String result=Integer.toString(position);
    
      return "Position of alphabet: "+result;
  }

 public static void main(String[] args) {
    
     System.out.println(position('9'));

    
       
    }


}



    



