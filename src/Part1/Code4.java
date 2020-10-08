package Part1;
import java.util.*;
class Test{
    char [][] studentsAnswer;
    char[] keys;
    int[] result;
    Test(){
        result = new int[8];
        keys = new char[10];
    }
    void enterStudentsKeys (){

        System.out.println("Enter the Students Answer keys");
        studentsAnswer = new char [8][10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<8 ; i++ ){
            System.out.print("Student " + (i+1) + " = " );
            for( int j=0 ; j<10 ; j++ ){
                char b=sc.next().charAt(0);
                studentsAnswer[i][j] = b;
            }
        }
        System.out.println();
        System.out.print("Enter the answer key : ");
        for( int i=0; i<10 ; i++ ){
            char b=sc.next().charAt(0);
            keys[i]= b;
        }
        sc.close();   
    }
    void checkKeys(){
        for(int i=0; i<8 ; i++ ){
            for( int j=0 ; j<10 ; j++ ){
                if(keys[j]==studentsAnswer[i][j]){
                    result[i]++;
                }
            }
        }
    }
    void displayResult(){
        for(int i=0; i<8 ; i++ ){
            System.out.println("result of student "+ (i+1) + " : " + result[i]);
        }
    }

}
class Code4{
    public static void main(String args[]){
        Test students = new Test();
        students.enterStudentsKeys();
        students.checkKeys();
        students.displayResult();
        System.out.println("19CE055 Vivek D Kapadia");
    }
}
