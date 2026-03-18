package Scholar;
import java.util.*;
public class CharCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int count = 0;
        for(int i = 0; i<name.length(); i++){
            for(int j = 1; j<name.length()-1; j++){
                char ch = name.charAt(i);
                char str = name.charAt(j);
                
                
                if (ch==str){
                    count++;
                }
                
            }
        }
        System.out.println(count);
        sc.close();
        
        
    }
}