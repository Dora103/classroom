//package Appointment;
import java.util.*;

public class AppointmentBooking {

	Scanner sc = new Scanner(System.in);

	//doctor id and password
	String dc_userName[] = new String[3];
	String dc_password[] = new String[3];
	int dc_id[] = new int[3];
	String dc_name[] = new String[3];
	long dc_mobile_no[] = new long[3];
	String dc_city[] = new String[3];
	int openTime[] = new int[3];
	int closeTime[] = new int[3];
	int index_dr=0;

	//patient data
	int pateint_id[] = new int[3];
	String pt_name[] = new String[3];
	int age[] = new int[3];
	long mobile_no[] = new long[3];
	String gender[] = new String[3];
	String userName[] = new String[3];
	String password[] = new String[3];
	String appoint_pt[] = new String[3];
	String appoint_dr[] = new String[3];
	int index_pt=0;
	int apt_index=0;

	public void clearMethod() { 
		try{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		}
		catch(Exception e)
		{

		}
	}

	public void mainFunct() throws Exception {
		int choice;
		System.out.println("                           ---------------------- Welcome To City Hospital ---------------------                           ");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("                     1. Doctor                  2. Patient                 3. Admin                4. Exit                 ");

		choice = sc.nextInt();
		clearMethod();
		switch(choice)
		{
		case 1 : 
			doctorFunction();
			break;
		case 2 :
			patientFunction();
			break;
		case 3 :
			adminFunction();
		case 4 :
			System.exit(0);
		}
	}

	//doctor function
	public void doctorFunction() throws Exception {

		int dcChoice;
		System.out.println();
		System.out.println("                             --------------------- Doctor Page ------------------------                             ");
		System.out.println();
		System.out.println("                           1. Login              2. Registration           3.Main Menu                              ");
		System.out.println();
		dcChoice = sc.nextInt();

		switch(dcChoice) //doctor choice 
		{
		case 1 : 

			String name = doctorLogin(dc_userName,dc_password);

			System.out.println();
			System.out.println("                             --------------------- Doctor Page ----------------------                              ");
			System.out.println();
			System.out.println("              1. Show Profile            2. Edit Profile           3.Show Appointment          4.Main Menu            ");
			System.out.println();
			dcChoice = sc.nextInt();    

			switch(dcChoice) 
			{
			case 1 : showProfile(name);
			break;
			case 2 : editProfile(name);
			break;
			case 3 : showAppointment(name,appoint_pt,appoint_dr);
			break;
			case 4 : mainFunct();
			break;

			}
			break;
		case 2 :
			doctorRegister();
			doctorFunction();
			break;
		case 3 :
			clearMethod();
			mainFunct();
			break;
			default: System.out.println("Please enter correct choice");
			doctorFunction();
		}
	}

	//doctor register
	public void doctorRegister() throws Exception{
		
			System.out.println("Your ID is : ");
			dc_id[index_dr]=sc.nextInt();
			System.out.println("Enter your name : ");
			sc.nextLine();
			dc_name[index_dr] = sc.nextLine();
			System.out.println("Enter your mobile no. : ");
			dc_mobile_no[index_dr]=sc.nextLong();
			sc.nextLine();
			System.out.println("Enter your City : ");
			dc_city[index_dr] = sc.nextLine();
			System.out.println("Enter your Opening Time : ");
			openTime[index_dr] = sc.nextInt();
			System.out.println("Enter your Closing Time : ");
			closeTime[index_dr] = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter your Username : ");
			dc_userName[index_dr] = sc.nextLine();
			System.out.println("Enter your password : ");
			dc_password[index_dr] = sc.nextLine();
			System.out.println("Registration is Successful!!!!");
			index_dr++;
		}

	//doctor login
	public String doctorLogin(String[] username, String[] password) throws Exception {
		sc.nextLine();
		System.out.println("                         --------------------- Doctor Page ---------------------                           ");
		sc.nextLine();
		String username1;
		String password1;
		boolean userFlag = false, passFlag = false;

		System.out.println(" Username : ");
		username1 = sc.nextLine();
		System.out.println("Password : ");
		password1 = sc.nextLine();

		//username validation
		for(int i=0; i<username.length; i++)
		{
			if(username1.equals(username[i]))
			{
				userFlag = true;
				break;
			}
		}

		//password validation
		for(int i=0; i<password.length; i++)
		{
			if(password1.equals(password[i]))
			{
				passFlag = true;
				break;
			}
		}


		if(userFlag == true && passFlag == true)
		{
			System.out.println("Login Successful!!!!");
		}
		else
		{
			System.out.println("Username or password is incorrect");
			System.out.println("If you have not yet registered, Please Register First");
			doctorFunction();
		}
		return username1;
	}

	//Display Profile of the Doctor
	public void showProfile(String name) throws Exception {

		int index=0;

		//get index based on user id
		for(int i=0;i<dc_name.length;i++)
		{
			if(dc_name[i] == name )
			{
				index=i;
				break;
			}
		}

		System.out.println("ID : "+dc_id[index]);
		System.out.println("Name : "+dc_name[index]);
		System.out.println("Mobile. no. : "+dc_mobile_no[index]);
		System.out.println("City : "+dc_city[index]);
		System.out.println("Open Time : "+openTime[index]);
		System.out.println("Close Time : "+closeTime[index]);

		System.out.println();
		System.out.println("                             --------------------- Doctor Page ----------------------                              ");
		System.out.println();
		System.out.println("              1. Show Profile            2. Edit Profile           3.Show Appointment          4.Main Menu            ");
		System.out.println();
		int dcChoice = sc.nextInt();   
		switch(dcChoice) 
		{
		case 1 : showProfile(name);
		break;
		case 2 : editProfile(name);
		break;
		case 3 : showAppointment(name,appoint_pt,appoint_dr);
		break;
		case 4 : clearMethod(); mainFunct();
		break;
		}
	}

	//Edit Details of the Doctor
	public void editProfile(String name) throws Exception {
		int index=0;

		System.out.println("Please enter your id");
		int id1 = sc.nextInt();
		for(int i=0;i<dc_id.length;i++)
		{
			if(id1 == dc_id[i])
			{
				index = i;
				break;
			}
		}

		System.out.println();
		System.out.println("ID : "+dc_id[index]);
		System.out.println("Name : "+dc_name[index]);
		System.out.println("Mobile. no. : "+dc_mobile_no[index]);
		System.out.println("City : "+dc_city[index]);
		System.out.println("Open Time : "+openTime[index]);
		System.out.println("Close Time : "+closeTime[index]);
		System.out.println();

		String details_ch="Y";
		do {

			System.out.println("1. Name ");
			System.out.println("2. Mobile. no. ");
			System.out.println("3. City ");
			System.out.println("4. Open Time ");
			System.out.println("5. Close Time ");
			System.out.println("Please select the details you want to edit");
			int choice = sc.nextInt();
			System.out.println("");

			switch(choice) {
			case 1 : System.out.println("Enter the Name ");
			sc.nextLine();
			dc_name[index]=sc.nextLine();
			break;
			case 2 : System.out.println("Enter the Mobile. no. ");
			sc.nextLine();
			dc_mobile_no[index] = sc.nextInt();
			break;
			case 3 : System.out.println("Enter the City ");
			sc.nextLine();
			dc_city[index] = sc.nextLine();
			case 4 : System.out.println("Enter the Open Time ");
			sc.nextLine();
			openTime[index] = sc.nextInt();
			break;
			case 5 : System.out.println("Enter the Close Time ");
			sc.nextLine();
			closeTime[index] = sc.nextInt();
			break;
			}

			System.out.println("Please Enter (Y/N) to edit details");

			details_ch = sc.next();
		}while(details_ch.equals("Y"));

		System.out.println();
		System.out.println("                             --------------------- Doctor Page ----------------------                              ");
		System.out.println();
		System.out.println("              1. Show Profile            2. Edit Profile           3.Show Appointment          4.Main Menu            ");
		System.out.println();
		int dcChoice = sc.nextInt();   
		switch(dcChoice) 
		{
		case 1 : showProfile(name);
		break;
		case 2 : editProfile(name);
		break;
		case 3 : showAppointment(name,appoint_pt,appoint_dr);
		break;
		case 4 : clearMethod(); mainFunct();
		break;
		}
	}

	//Display Appointments for the Doctor
	public void showAppointment(String name, String[] appoint_pt, String[] appoint_dr) throws Exception {

		int index=0;
		String[] headings = {"Appointment No.","Name","Age","MobileNo.","Gender"};
		System.out.println();
		System.out.println("                             --------------------- Appointment Details ---------------------                            ");
		System.out.println();
		System.out.println("*************************************************************************************************************");
		for(String h : headings)
		{
			tableRows(h);
		}

		System.out.println();
		System.out.println("*************************************************************************************************************");

		for(int i=0;i<dc_userName.length;i++)
		{
			if(dc_userName[i].equals(name))
			{
				index=i;
				break;
			}
		}
		int cnt=0;

		for(int j=0;j<appoint_pt.length;j++)
		{
			if(dc_name[index].equals(appoint_dr[j]))
			{
				cnt++;
				tableRows(String.valueOf(cnt));
				tableRows(pt_name[j]);
				tableRows(String.valueOf(age[j]));
				tableRows(String.valueOf(mobile_no[j]));
				tableRows(gender[j]);
				System.out.println();

			}
		}
		if(cnt <= 0)
		{
			System.out.println("No Appointments");
		}
		int dcChoice=0;
		System.out.println();
		System.out.println("                             --------------------- Doctor Page ----------------------                              ");
		System.out.println();
		System.out.println("              1. Show Profile            2. Edit Profile           3.Show Appointment          4.Main Menu            ");
		System.out.println();
		dcChoice = sc.nextInt();    
		switch(dcChoice) 
		{
		case 1 : showProfile(name);
		break;
		case 2 : editProfile(name);
		break;
		case 3 : showAppointment(name,appoint_pt,appoint_dr);
		break;
		case 4 : mainFunct();
		break;
		}
	}

	//patient function
	public void patientFunction() throws Exception {
		System.out.println();
		System.out.println("                             ----------------------Pateint Page-------------------------                             ");
		System.out.println();
		System.out.println("                           1. Login                2. Registration              3.Main Menu                          ");
		System.out.println();
		int ptChoice = sc.nextInt();

		switch(ptChoice) //patient choice 
		{
		case 1 : 
			String pt_name = patientLogin(userName,password); //patient login

			System.out.println();
			System.out.println("                             ----------------------Pateint Page-------------------------                             ");
			System.out.println();
			System.out.println("                           1. Book Appointment                           2. Main Menu                                ");
			ptChoice = sc.nextInt();  
			System.out.println();

			switch(ptChoice) 
			{
			case 1 : bookAppointment(pt_name);
			break;  
			case 2 : mainFunct();
			break;
			}
			break;
		case 2 :
			patientRegister(); //doctor registration
			patientFunction();
			break;
		case 3 :
			clearMethod();
			mainFunct();
			break;
		default: System.out.println("Please enter correct choice");
		patientFunction();
		}

	}

	//patient register
	public  void patientRegister() {

		System.out.println("Enter your ID is : ");
		pateint_id[index_pt] = sc.nextInt();
		System.out.println("Enter your name : ");
		sc.nextLine();
		pt_name[index_pt] = sc.nextLine();
		System.out.println("Enter your mobile no. : ");
		mobile_no[index_pt]=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter your age : ");
		age[index_pt]=sc.nextInt();
		System.out.println("Enter your Gender : ");
		sc.nextLine();
		gender[index_pt]=sc.nextLine();

		System.out.println("Enter your Username : ");
		userName[index_pt] = sc.nextLine();
		System.out.println("Enter your password : ");
		password[index_pt] = sc.nextLine();
		System.out.println("Registration is Successful!!!!");
		index_pt++;

	}

	//patient login
	public String patientLogin(String[] username, String[] password) throws Exception {

		System.out.println();
		System.out.println("                           --------------------- Patient  Page ---------------------                             ");
		sc.nextLine();
		String username1;
		String password1;
		boolean userFlag = false, passFlag = false;

		System.out.println("Username : ");
		username1 = sc.nextLine();
		System.out.println("Password : ");
		password1 = sc.nextLine();

		//username validation
		for(int i=0; i<username.length; i++)
		{
			if(username1.equals(username[i]))
			{
				userFlag = true;
				break;
			}
		}

		//password validation
		for(int i=0; i<password.length; i++)
		{
			if(password1.equals(password[i]))
			{
				passFlag = true;
				break;
			}
		}

		while(userFlag != true && passFlag != true)
		{
			System.out.println("Username or password is incorrect");
			System.out.println("If you have not yet registered, Please Register First");
			patientFunction();
		}
		return username1;
	}

	//patient list
	public void pateintsList() throws Exception {
		String[] headings = {"ID","Name","Age","MobileNo.","Gender"};
		System.out.println();
		System.out.println("                             -------------------- Pateints List --------------------                          ");
		System.out.println();
		System.out.println("*************************************************************************************************************");
		for(String h : headings)
		{
			tableRows(h);
		}

		System.out.println();
		System.out.println("*************************************************************************************************************");

		for(int i=0 ; pateint_id[i]!=0 && i<pateint_id.length ; i++)
		{
			tableRows(String.valueOf(pateint_id[i]));
			tableRows(pt_name[i]);
			tableRows(String.valueOf(age[i]));
			tableRows(String.valueOf(mobile_no[i]));
			tableRows(gender[i]);
			System.out.println();
		}

		adminFunction();
	}

	//book appointment
	public void bookAppointment(String pt_name1) throws Exception {
		int index=0; 
		int dc_choice=0;

		System.out.println();
		System.out.println("                             --------------------- BOOK APPOINTMENT ---------------------                              ");
		System.out.println();
		System.out.println();
		System.out.println("                             Welcome "+pt_name1+", to book appointment, choose your doctor.." );
		System.out.println();

		//list of doctors
		int dc_list=0,doctorListIndex=1;
		while(dc_name[dc_list]!=null)
		{
			System.out.println(doctorListIndex+". "+dc_name[dc_list]);
			dc_list++;
			doctorListIndex++;
		}
		System.out.println();

		try {
			System.out.println("Please enter your choice...");
			dc_choice = sc.nextInt();
			dc_choice=dc_choice-1;
		}
		catch(Exception e) {
			System.out.println("Please enter appropriate input");
		}


		System.out.println();
		System.out.println("Appointment Booked Successfully!!!!!");
		System.out.println();
		System.out.println("Appointment Details");
		System.out.println("-------------------");
		System.out.println();
		System.out.println("Doctor Name : " +dc_name[dc_choice]);
		System.out.println("Mobile. no. : "+dc_mobile_no[dc_choice]);
		System.out.println("City : "+dc_city[dc_choice]);
		System.out.println("Appointment Timing : "+openTime[dc_choice]+"-"+closeTime[dc_choice]);
		System.out.println();

		for(int i=0;i<pt_name.length;i++)
		{
			if(pt_name[i] == pt_name1)
			{
				index= i;
				break;
			}
		}

		//save the pt name in array pt_name
		appoint_pt[apt_index]= pt_name1;
		//save the respective doctor's name in array dc_name
		appoint_dr[apt_index] = dc_name[dc_choice];
		apt_index++;

		mainFunct();
	}

	public void adminFunction() throws Exception {

		int dcChoice=0;

		System.out.println();
		System.out.println("                             --------------------- Admin Page ----------------------                              ");
		System.out.println();
		System.out.println("              1. Doctors List            2. Pateints List           3. Appointments          4.Main Menu            ");
		System.out.println();
		dcChoice = sc.nextInt(); 
		switch(dcChoice) 
		{
		case 1 : doctorsList();
		break;
		case 2 : pateintsList();
		break;
		case 3 : totalAppointments();
		break;
		case 4 : clearMethod(); mainFunct();
		break;

		}
	}

	//Doctors List
	public void doctorsList() throws Exception {
		String[] headings = {"ID","Name","MobileNo.","City","Timing"};
		System.out.println();
		System.out.println("                             -------------------- Doctors List --------------------                          ");
		System.out.println();
		System.out.println("*************************************************************************************************************");
		for(String h : headings)
		{
			tableRows(h);
		}

		System.out.println();
		System.out.println("*************************************************************************************************************");

		for(int i=0 ; dc_id[i] !=0; i++)
		{
			tableRows(String.valueOf(dc_id[i]));
			tableRows(dc_name[i]);
			tableRows(String.valueOf(dc_mobile_no[i]));
			tableRows(dc_city[i]);
			tableRows(String.valueOf(openTime[i])+"-"+String.valueOf(closeTime[i]));
			System.out.println();
		}
		adminFunction();
	}

	void tableRows(String h)
	{
		System.out.print("|");

		long cnt = h.chars().count();
		cnt = 20-cnt;

		System.out.print(h);
		for(int j=0;j<cnt;j++)
		{
			System.out.print(" ");
		}
	}


	//Appointments List
	public void totalAppointments() throws Exception {
		String[] st = {"Doctor Name","Pateint Name","Timing"};

		System.out.println();
		System.out.println("                             -------------------- Appointment List --------------------                          ");
		System.out.println();
		System.out.println("*****************************************************************************************");

		//System.out.print("|");
		for(int i=0;i<st.length;i++)
		{
			tableRows(st[i]);
		}
		System.out.println();
		System.out.println("*****************************************************************************************");
		try {
			for(int i=0;i<appoint_pt.length;i++)
			{
				tableRows(appoint_dr[i]);
				tableRows(appoint_pt[i]);

				int name_index=0;
				for(int k=0;k<dc_name.length;k++)
				{
					if(dc_name[k].equals(appoint_dr[i]))
					{
						name_index=k;
						break;
					}
				}

				tableRows(String.valueOf(openTime[name_index])+"-"+String.valueOf(closeTime[name_index]));

				System.out.println();

			}
		}
		catch(Exception e) {}

		adminFunction();
	}

	public static void main(String[] args)throws Exception {

		AppointmentBooking ab = new AppointmentBooking();
		ab.mainFunct();

	}

}
