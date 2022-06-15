//Accept a character and check character is vowel or not

import java.util.Scanner;

class Vowel{
	
	public static void main(String []args){

	Scanner sc = new Scanner(System.in);
    System.out.println("Enter Character");
	char val;
	val = sc.next().charAt(0);
    
    switch(val){
        case 'a':System.out.println("Vowel");
        break;
        case 'e' : System.out.println("Vowel");
        break;
        case 'i' : System.out.println("Vowel");
        break;
        case 'o' : System.out.println("Vowel");
        break;
        case 'u' : System.out.println("Vowel");
        break;
        default : System.out.println("Not Vowel");
    }
	}
}