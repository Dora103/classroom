

import java.util.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;  
import java.util.Date;


class Calculation
{

	Scanner sc = new Scanner(System.in);

	String name,name2,result;
	String final_per;
	int enrol_no,cnt_no=0,count=0;
	String formatted_enrol,formatted_marks;
	int[] theory_marks = new int[8];
	int[] practical_marks = new int[8];
	int[] total_marks = new int[8];
	String[] subjects = {"APPLIED MATHEMATICS","ADVANCE 'C' & PROGRAMMING LOGIC DESIGN","DISTRIBUTED OPERATING SYSTEM","DIGITAL CIRCUITS & FUND. OF MICROPROCESSOR","SYSTEM PROGRAMMING","ETHICS IN IT","COMPUTER ARCHITECTURE AND ORG.","ARTIFICIAL INTELLIGENCE"};
	String[] grades = new String[8];
	String[] fail = new String[8];
	int total =0;
	float per = 0.0f;
	
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	Date date = new Date();   

	void input_data()
	{ 
		System.out.println("Enter your name : ");
		name = sc.nextLine();
		System.out.println("Enter your mother's name : ");
		name2 = sc.nextLine();
		System.out.println("Enter your Enrollment No. : ");
		enrol_no = sc.nextInt();
		

		//input subjects theory and practical marks and calculate total marks
		for(int i=0;i<8;i++)
		{
			System.out.println("Enter the "+subjects[i]+" theory marks :");
			theory_marks[i] = sc.nextInt();	
			if(theory_marks[i]  > 80) {
				while(theory_marks[i]  > 80)
				{
					System.out.println("Please Enter valid marks below and equal to 80...... ");
					theory_marks[i] = sc.nextInt();	
				}
			}
			
		}
		
		for(int i=0;i<8;i++)
		{
			System.out.println("Enter the "+subjects[i]+" practical marks :");
			practical_marks[i] = sc.nextInt();
			if(practical_marks[i]  > 20) {
				while(practical_marks[i]  > 20)
				{
					System.out.println("Please Enter valid marks below and equal to 20...... ");

					practical_marks[i] = sc.nextInt();	
				}
			}
			
		}
		
		
		
		
		
		
		
	}
	
	void calculate() {
		
		//calculate enrollment no.
		cnt_no = enrol_no;
		for(int i=0;i<16;i++)
		{
			if(cnt_no>0) {
				cnt_no = cnt_no/10;
				count++;
			}
		}
		
		if(count<16)
		{
			count = 16-count;
			formatted_enrol = String.format("%0"+count+"d", enrol_no);
		}
		
		//calculate total marks
		for(int i =0;i<8;i++)
		{
			total_marks[i] = theory_marks[i]+practical_marks[i];
			total = total+total_marks[i];
		}
		
		//calculate grades
				for(int i=0;i<8;i++)
				{
					if(total_marks[i] >= 80 && total_marks[i] <= 100)
					{
						grades[i] = "AA";
						fail[i]=" ";
					}
					if(total_marks[i] >= 70 && total_marks[i] <= 80)
					{
						grades[i] = "AB";
						fail[i]=" ";
					}
					if(total_marks[i] >= 60 && total_marks[i] <= 70)
					{
						grades[i] = "BB";
						fail[i]=" ";
					}
					if(total_marks[i] >= 55 && total_marks[i] <= 60)
					{
						grades[i] = "BC";
						fail[i]=" ";
					}
					if(total_marks[i] >= 50 && total_marks[i] <= 55)
					{
						grades[i] = "CC";
						fail[i]=" ";
					}
					if(total_marks[i] >= 45 && total_marks[i] <= 50)
					{
						grades[i] = "CD";
						fail[i]=" ";
					}
					if(total_marks[i] >= 40 && total_marks[i] <= 45)
					{
						grades[i] = "DD";
						fail[i]=" ";
					}
					if(total_marks[i] >= 0 && total_marks[i] <= 40)
					{
						grades[i] = "FF";
						fail[i]="#";
					}
				}
				
				//calculate percentage
				per = (float) (((float)total/720.0)*100);
				DecimalFormat df = new DecimalFormat();
				df.setMaximumFractionDigits(2);
				final_per = df.format(per);
				//if(per>=40.0d)
				for(int i=0;i<8;i++)
				{
					if(total_marks[i]>=40)
					{
						result="PASS";
					}
					else
					{
						result="FAIL";
						break;
					}
				}
				
	}
	
	void show()
	{
		//display semester name 
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<100;j++)
			{
				if((j==0||j==99)||(i==0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("*         THIRD SEMESTER EXAMINATION FOR THE DEGREE OF BACHELOR OF ENGINEERING, WINTER 2016        *");
		System.out.println("*                      [FOURTH YEAR DEGREE COURSE] [CREDIT BASED SYSTEM]                           *");	

		for(int i=0;i<1;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(i==0 && j!=0 && j!=99)
				{
					System.out.print("-");
				}
				else if(j==0||j==99) {
					System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("*  Student Name  : "+name+"                  "+" Roll No.   : 361997                "+"  Date : "+formatter.format(date)+"   *");
		System.out.println("*  Mother's Name : "+name2+"                  "+" Enrol. No. : "+formatted_enrol+"        "+"  Medium : English    *");                
		System.out.println("*  Branch Name   : cse                "+"  Category   : Regular                                       *");
		System.out.println("*  College name  : Datta Meghe Inst. Of Engg. Tech. & Research, Sawangi Meghe, Wardha              *");

		for(int i=0;i<1;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(i==0 && j!=0 && j!=99)
				{
					System.out.print("-");
				}
				else if(j==0||j==99) {
					System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

		System.out.println("*|Sr.|            SUBJECT            |   MARKS & CREDITS SCHEME  |     MARKS & GRADES AWARDED     |*");
		System.out.println("*|No.|                               |----MAX----|  MAX  |  MIN  | TU/PU | TI/PI | TOTAL |  GRADE |*");
		System.out.println("*|   |                               |TU/PU|TI/PI| MARKS | MARKS |       |       | MARKS |        |*");

		for(int i=0;i<1;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(i==0 && j!=0 && j!=99)
				{
					System.out.print("-");
				}
				else if(j==0||j==99) {
					System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("*| 1 | APPLIED MATHEMATICS           | 80  | 20  |  100  |  40   |  "+theory_marks[0]+"   |  "+String.format("%02d",practical_marks[0])+"   |  "+total_marks[0]+fail[0]+"  |   "+grades[0]+"   |*");
		System.out.println("*| 2 | ADVANCE 'C' & PROGRAMMING     | 80  | 20  |  100  |  40   |  "+theory_marks[1]+"   |  "+String.format("%02d",practical_marks[1])+"   |  "+total_marks[1]+fail[1]+"  |   "+grades[1]+"   |*");
		System.out.println("*| 3 | DISTRIBUTED OPERATING SYSTEM  | 80  | 20  |  100  |  40   |  "+theory_marks[2]+"   |  "+String.format("%02d",practical_marks[2])+"   |  "+total_marks[2]+fail[2]+"  |   "+grades[2]+"   |*");
		System.out.println("*| 4 | DIGITAL CIRCUITS & FUND.      | 80  | 20  |  100  |  40   |  "+theory_marks[3]+"   |  "+String.format("%02d",practical_marks[3])+"   |  "+total_marks[3]+fail[3]+"  |   "+grades[3]+"   |*");
		System.out.println("*| 5 | SYSTEM PROGRAMMING            | 80  | 20  |  100  |  40   |  "+theory_marks[4]+"   |  "+String.format("%02d",practical_marks[4])+"   |  "+total_marks[4]+fail[4]+"  |   "+grades[4]+"   |*");
		System.out.println("*| 6 | ETHICS IN IT                  | 80  | 20  |  100  |  40   |  "+theory_marks[5]+"   |  "+String.format("%02d",practical_marks[5])+"   |  "+total_marks[5]+fail[5]+"  |   "+grades[5]+"   |*");
		System.out.println("*| 7 | COMPUTER ARCHITECTURE AND ORG.| 80  | 20  |  100  |  40   |  "+theory_marks[6]+"   |  "+String.format("%02d",practical_marks[6])+"   |  "+total_marks[6]+fail[6]+"  |   "+grades[6]+"   |*");
		System.out.println("*| 8 | ARTIFICIAL INTELLIGENCE       | --  | 20  |  020  |  12   |  "+theory_marks[7]+"   |  "+String.format("%02d",practical_marks[7])+"   |  "+total_marks[7]+fail[7]+"  |   "+grades[7]+"   |*");

		for(int i=0;i<1;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(i==0 && j!=0 && j!=99)
				{
					System.out.print("-");
				}
				else if(j==0||j==99) {
					System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(i==0 && j!=0 && j!=99)
				{
					System.out.print("-");
				}
				else if(j==0||j==99) {
					System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("*|      OUT OF     |  TOTAL MARKS    |       PERCENTAGE      |       RESULT      |     REMARK     |*");
		System.out.println("*|      MARKS      |   OBTAINED      |                       |                   |                |*");
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(i==0 && j!=0 && j!=99)
				{
					System.out.print("-");
				}
				else if(j==0||j==99) {
					System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("*|       720       |      "+total+"       |         "+final_per+"%        |      "+result+"      |   ----------   |*");
		
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<100;j++)
			{
				if(i==0 && j!=0 && j!=99)
				{
					System.out.print("-");
				}
				else if(j==0||j==99) {
					System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<100;j++)
			{
				if((j==0||j==99)||(i==0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}
}




public class Marksheet{

	public static void main(String[] args)
	{
		Calculation cal = new Calculation();

		cal.input_data();
		cal.calculate();
		cal.show();

	}
}
