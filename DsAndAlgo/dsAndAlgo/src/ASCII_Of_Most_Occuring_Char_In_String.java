import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ASCII_Of_Most_Occuring_Char_In_String {
   public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("enter the string: ");
    String inputString=s.next();
    char[] inputCharArray=inputString.toCharArray();
    var counter= new HashMap<Character,Integer>();
    for(char c:inputCharArray){
        if(counter.containsKey(c)){
            counter.put(c, counter.get(c)+1);
        }
        else{
            counter.put(c, 1);
        }
    }
    int maxCount=0;
    char maxChar=256;

    for (var  entry : counter.entrySet()) {
        if(entry.getValue()>maxCount){
            maxChar=entry.getKey();
            maxCount=entry.getValue();
        }
        else if(entry.getValue()==maxCount){
            if(entry.getKey()<maxChar){
                maxChar=entry.getKey();
                maxCount=entry.getValue();
            }
        }
        
    }
    int mostFreqCharacter=maxChar;
    System.out.println(mostFreqCharacter);

   } 
}
