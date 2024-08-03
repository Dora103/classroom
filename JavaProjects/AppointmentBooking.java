//package Appointment;
import java.util.*;

public class AppointmentBooking {

	Scanner sc = new Scanner(System.in);

	//doctor id and password
	ArrayList<String> dc_userName = new ArrayList<String>();
	ArrayList<String> dc_password = new ArrayList<String>();
	ArrayList<Integer> dc_id = new ArrayList<Integer>();
	ArrayList<String> dc_name = new ArrayList<String>();
	ArrayList<Long> dc_mobile_no = new ArrayList<Long>();
	ArrayList<String> dc_city = new ArrayList<String>();
	ArrayList<Integer> openTime = new ArrayList<Integer>();
	ArrayList<Integer> closeTime = new ArrayList<Integer>();
	int index_dr=0;

	//patient data
	ArrayList<Integer> pateint_id = new ArrayList<Integer>();
	ArrayList<String> pt_name = new ArrayList<String>();
	ArrayList<Integer> age = new ArrayList<Integer>();
	ArrayList<Long> mobile_no = new ArrayList<Long>();
	ArrayList<String> gender = new ArrayList<String>();
	ArrayList<String> userName = new ArrayList<String>();
	ArrayList<String> password = new ArrayList<String>();
	ArrayList<String> appoint_pt = new ArrayList<String>();
	ArrayList<String> appoint_dr = new ArrayList<String>();

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
		dc_id.add(index_dr, sc.nextInt());
		System.out.println("Enter your name : ");
		sc.nextLine();
		dc_name.add(index_dr, sc.nextLine());
		System.out.println("Enter your mobile no. : ");
		dc_mobile_no.add(index_dr, sc.nextLong());
		sc.nextLine();
		System.out.println("Enter your City : ");
		dc_city.add(index_dr, sc.nextLine());
		System.out.println("Enter your Opening Time : ");
		//openTime[index_dr] = sc.nextInt();
		openTime.add(index_dr, sc.nextInt());
		System.out.println("Enter your Closing Time : ");
		//closeTime[index_dr] = sc.nextInt();
		closeTime.add(index_dr, sc.nextInt());
		sc.nextLine();
		System.out.println("Enter your Username : ");
		//dc_userName[index_dr] = sc.nextLine();
		dc_userName.add(index_dr, sc.nextLine());
		System.out.println("Enter your password : ");
		//dc_password[index_dr] = sc.nextLine();
		dc_password.add(index_dr, sc.nextLine());
		System.out.println("Registration is Successful!!!!");
		index_dr++;
	}

	//doctor login
	//public String doctorLogin(String[] username, String[] password) throws Exception {
	public String doctorLogin(ArrayList<String> username, ArrayList<String> password) throws Exception {
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
		for(int i=0; i<username.size(); i++)
		{
			//if(username1.equals(username[i]))
			if(username1.equals(username.get(i)))
			{
				userFlag = true;
				break;
			}
		}

		//password validation
		for(int i=0; i<password.size(); i++)
		{
			if(password1.equals(password.get(i)))
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
		for(int i=0;i<dc_name.size();i++)
		{
			if(dc_name.get(i) == name )
			{
				index=i;
				break;
			}
		}

		System.out.println("ID : "+dc_id.get(index));
		System.out.println("Name : "+dc_name.get(index));
		System.out.println("Mobile. no. : "+dc_mobile_no.get(index));
		System.out.println("City : "+dc_city.get(index));
		System.out.println("Open Time : "+openTime.get(index));
		System.out.println("Close Time : "+closeTime.get(index));

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

//		System.out.println("Please enter your id");
//		int id1 = sc.nextInt();
//		for(int i=0;i<dc_id.size();i++)
//		{
//			if(id1 == dc_id.get(i))
//			{
//				index = i;
//				break;
//			}
//		}

		System.out.println();
		System.out.println("Profile Details");
		System.out.println("---------------");
		
		System.out.println("ID : "+dc_id.get(dc_userName.indexOf(name)));
		System.out.println("Name : "+dc_name.get(dc_userName.indexOf(name)));
		System.out.println("Mobile. no. : "+dc_mobile_no.get(dc_userName.indexOf(name)));
		System.out.println("City : "+dc_city.get(dc_userName.indexOf(name)));
		System.out.println("Open Time : "+openTime.get(dc_userName.indexOf(name)));
		System.out.println("Close Time : "+closeTime.get(dc_userName.indexOf(name)));
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
			dc_name.add(index, sc.nextLine());
			break;
			case 2 : System.out.println("Enter the Mobile. no. ");
			sc.nextLine();
			//dc_mobile_no[index] = sc.nextInt();
			dc_mobile_no.add(index, (long) sc.nextInt());
			break;
			case 3 : System.out.println("Enter the City ");
			sc.nextLine();
			//dc_city[index] = sc.nextLine();
			dc_city.add(index, sc.nextLine());
			case 4 : System.out.println("Enter the Open Time ");
			sc.nextLine();
			//openTime[index] = sc.nextInt();
			openTime.add(index, sc.nextInt());
			break;
			case 5 : System.out.println("Enter the Close Time ");
			sc.nextLine();
			//closeTime[index] = sc.nextInt();
			closeTime.add(index, sc.nextInt());
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
	public void showAppointment(String name, ArrayList<String> appoint_pt, ArrayList<String> appoint_dr) throws Exception {

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

		for(int i=0;i<dc_userName.size();i++)
		{
			if(dc_userName.get(i).equals(name))
			{
				index=i;
				break;
			}
		}
		int cnt=0;

		for(int j=0;j<appoint_pt.size();j++)
		{
			if(dc_name.get(index).equals(appoint_dr.get(j)))
			{
				cnt++;
				tableRows(String.valueOf(cnt));
				tableRows(pt_name.get(j));
				tableRows(String.valueOf(age.get(j)));
				tableRows(String.valueOf(mobile_no.get(j)));
				tableRows(gender.get(j));
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
		//pateint_id[index_pt] = sc.nextInt();
		pateint_id.add(index_pt, sc.nextInt());
		System.out.println("Enter your name : ");
		sc.nextLine();
		//pt_name[index_pt] = sc.nextLine();
		pt_name.add(index_pt, sc.nextLine());
		System.out.println("Enter your mobile no. : ");
		//mobile_no[index_pt]=sc.nextLong();
		mobile_no.add(index_pt, sc.nextLong());
		sc.nextLine();
		System.out.println("Enter your age : ");
		//age[index_pt]=sc.nextInt();
		age.add(index_pt, sc.nextInt());
		System.out.println("Enter your Gender : ");
		sc.nextLine();
		//gender[index_pt]=sc.nextLine();
		gender.add(index_pt, sc.nextLine());
		System.out.println("Enter your Username : ");
		//userName[index_pt] = sc.nextLine();
		userName.add(index_pt, sc.nextLine());
		System.out.println("Enter your password : ");
		//password[index_pt] = sc.nextLine();
		password.add(index_pt, sc.nextLine());
		System.out.println("Registration is Successful!!!!");
		index_pt++;

	}

	//patient login
	public String patientLogin(ArrayList<String> username, ArrayList<String> password) throws Exception {

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
		for(int i=0; i<username.size(); i++)
		{
			if(username1.equals(username.get(i)))
			{
				userFlag = true;
				break;
			}
		}

		//password validation
		for(int i=0; i<password.size(); i++)
		{
			if(password1.equals(password.get(i)))
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

		for(int i=0 ; i<pateint_id.size() ; i++)
		{
			tableRows(String.valueOf(pateint_id.get(i)));
			tableRows(pt_name.get(i));
			tableRows(String.valueOf(age.get(i)));
			tableRows(String.valueOf(mobile_no.get(i)));
			tableRows(gender.get(i));
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
		//while(dc_name.get(dc_list) != null)
		for(String dc_name1 : dc_name)
		{
			//System.out.println(doctorListIndex+". "+dc_name.get(dc_list));
			System.out.println(doctorListIndex+". "+ dc_name1);
			//			dc_list++;
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
		System.out.println("Doctor Name : " +dc_name.get(dc_choice));
		System.out.println("Mobile. no. : "+dc_mobile_no.get(dc_choice));
		System.out.println("City : "+dc_city.get(dc_choice));
		System.out.println("Appointment Timing : "+openTime.get(dc_choice)+"-"+closeTime.get(dc_choice));
		System.out.println();

		for(int i=0;i<pt_name.size();i++)
		{
			if(pt_name.get(i) == pt_name1)
			{
				index= i;
				break;
			}
		}

		//save the pt name in array pt_name
		appoint_pt.add(apt_index,pt_name1);
		//save the respective doctor's name in array dc_name
		appoint_dr.add(apt_index,dc_name.get(dc_choice));
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

		for(int i=0;i<dc_id.size();i++)
		{
			tableRows(String.valueOf(dc_id.get(i)));
			tableRows(dc_name.get(i));
			tableRows(String.valueOf(dc_mobile_no.get(i)));
			tableRows(dc_city.get(i));
			tableRows(String.valueOf(openTime.get(i))+"-"+String.valueOf(closeTime.get(i)));
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
			for(int i=0;i<appoint_pt.size();i++)
			{
				tableRows(appoint_dr.get(i));
				tableRows(appoint_pt.get(i));

				int name_index=0;
				for(int k=0;k<dc_name.size();k++)
				{
					if(dc_name.get(k).equals(appoint_dr.get(i)))
					{
						name_index=k;
						break;
					}
				}

				tableRows(String.valueOf(openTime.get(name_index))+"-"+String.valueOf(closeTime.get(name_index)));

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
