package Part1;
import java.util.*;

class removeString {

    private String charRemoveAt(String str,int i){
        return str.substring(0,i) + str.substring(i+1);
    }
    void wordsWithout(String a,char target){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i) == target){
               a=charRemoveAt(a,i);
               i--; 
            }
        }
        System.out.println(a);
    }
}
public class Code6 {
    public static void main(String[] args){
        removeString str=new removeString();
        Scanner sc = new Scanner(System.in);
        for( int i=0; i<3 ; i++){
            System.out.print("Enter String : ");
            String a = sc.next();
            System.out.print("Enter target char : ");
            char target = sc.next().charAt(0);
            str.wordsWithout(a,target);
        }
        sc.close();
        System.out.println("Coded by - Vivek D Kapadia");
        System.out.println("19CE055");
    }
}
