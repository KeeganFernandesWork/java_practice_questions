import java.util.*;
public class prac1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sentence");
    String sentence = sc.nextLine();
    String[] words = sentence.split(" ");
    // Checking if the sentence has 5 words
    if(words.length < 5){
      System.out.println("The sentence needs to have 5 words");
    }
    else{
      for(int i=0;i<words.length;i++){
        System.out.println(words[i]);
        vowelCounter(words[i]); // Function that shows the counts of each vowel
      }
    }

  }
  public static void vowelCounter(String word) {
    char[] vowel_count = word.toLowerCase().toCharArray();
    int[] record = new int[5];
    for(int i = 0;i<vowel_count.length;i++){
      if(vowel_count[i] == 'a'){
        record[0]++;
      }

      if(vowel_count[i] == 'e'){
        record[1]++;
      }
      if(vowel_count[i] == 'i'){
        record[2]++;
      }
      if(vowel_count[i] == 'o'){
        record[3]++;
      }
      if(vowel_count[i] == 'u'){
        record[4]++;
      }
    }
    System.out.println("the count of the a is "+record[0]);
    System.out.println("the count of the e is "+record[1]);
    System.out.println("the count of the i is "+record[2]);
    System.out.println("the count of the o is "+record[3]);
    System.out.println("the count of the u is "+record[4]);
    }
 }

