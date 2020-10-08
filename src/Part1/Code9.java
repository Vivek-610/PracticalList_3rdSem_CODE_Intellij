package Part1;
import java.util.*;

class caesarCipher{
    private String str;
    private int increment;
    
    caesarCipher(String a,int inc){
        str = a;
        increment = inc;
    }

    String increment(int i){
        char c = str.charAt(i);
        if(c>='a' && c<='z'){
            if( ((int)c+increment) > 122 ){
                c =(char) ( ((int)c+increment) % 122);
                c =(char) (c + 96);
            } else {
                c =(char) ( ((int)c+increment) % 97);
                c =(char) (c + 97);
            }
        } else {
                if( ((int)c+increment) > 90 ){
                    c =(char) ( ((int)c+increment) % 90);
                    c =(char) (c + 64);
                } else {
                    c =(char) ( ((int)c+increment) % 65);
                    c =(char) (c + 65);
                }
        }
        return str.substring(0,i) + c + str.substring(i+1);
        
    }

    void cipher(){
        for( int i=0;i<str.length() ;i++){
            str=increment(i);
        }
    }
    void display(){
        System.out.println("------->"+str);
    }
}
public class Code9 {
    public static void main(String args[]){
        System.out.print("Enter String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print("Enter number to shift alphabets of the string : ");
        int inc = sc.nextInt(); 
        caesarCipher str = new caesarCipher(s,inc);
        sc.close();
        str.cipher();
        str.display();
        System.out.println("Coded By Vivek D Kapadia \n19CE055");
    }
}
