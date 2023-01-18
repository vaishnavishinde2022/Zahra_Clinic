package clinic;

import java.util.*;
import java.lang.Math;

public class Zahra_Medical_Clinic 
{

	public static void main(String[] args) 
	{
		String BMI_Staus="";
		Scanner user=new Scanner(System.in);
		Scanner number=new Scanner(System.in);
		
		String clinical_staffusername="Zahra123";
		String clinical_staffpassword="Zahraeportal@23";
		//Medical staff Login section
		System.out.printf("%80s", "Welcome to the zahra Medical clinic patient's registration Eportal");
		System.out.printf("%70s %n","**************************************Medical Staff Login**************************************");
		System.out.printf("%50s","Username:-");
		String username=user.nextLine();
		System.out.printf("%50s","Password:-");
		String password=user.nextLine();
      
		System.out.printf("%70s %n","**************************************Medical Staff Login**************************************");	 
    
		//Medical staff Authentication section
		
		if(username.equals(clinical_staffusername)&&password.equals(clinical_staffpassword))
		{
			System.out.printf("%55s %n","Login is successful!");
			System.out.println();
			System.out.printf("%70s %n","We are now going to calculate the BMI of the patient");
			
			System.out.printf("%50s","Patient's name:-");
			String patient_name=user.nextLine();
			
           //BMI calculation section
			System.out.printf("%70s %n","###################################BMI Calculation###################################");	 
	         

			System.out.printf("%50s","Patient's Weight(kg):-");
			double patient_weight=number.nextDouble();

			System.out.printf("%50s","Patient's height(m):-");
			double patient_height=user.nextDouble();
			
			if(patient_weight<=0||patient_height<=0)
			{
				System.out.println("Sorry you have entered invalid values for the weight and/or the height of the patient");
			}//if
			
			else
			{
				System.out.printf("%70s %n","###################################BMI Calculation In progress###################################");	
			    double BMI_calc=patient_weight/(patient_height*patient_height);
				
			    if(BMI_calc<18.5)
			    {
			    	BMI_Staus="Underweight";
			    }//if
			    else if(BMI_calc>=18.5&& BMI_calc<=24.9)
			    {
			    	BMI_Staus="Normalweight";
			    }//else if
			    
			    else if(BMI_calc>=25.0&& BMI_calc<=29.9)
			    {
			    	BMI_Staus="Overweight";
			    }
			    
			    else if(BMI_calc>=30)
			    {
			    	BMI_Staus="Obesity";
			    }
			    
			   System.out.printf("%40s %.2f %s","Patient's BMI Results:-",BMI_calc,"kg/m^2");
				
			   System.out.println();
			   System.out.printf("%41s %10s","Patient's BMI Category:-",BMI_Staus);		  
			   System.out.printf("%70s %n","###################################BMI Calculation In progress###################################");
			  
			   //BSA Calculation section
			   System.out.println();
			   
			   System.out.printf("%70s %n","*****************************************BSA Calculation***********************************");	
			   
			   double conver_metertocenti=patient_height*100;
			   double BSA=Math.sqrt((conver_metertocenti*patient_weight)/3600); 
			   
			   System.out.printf("%40s %.2f %s","Patient's BSA Results:-",BSA,"m^2");
			   System.out.println();
			   System.out.printf("%70s %n","*****************************************BSA Calculation***********************************");
			   
			   //Cardiac Index Calculation section
			   System.out.println();
			   System.out.printf("%70s %n","#########################################cardiac Index###########################################");
			   
			   System.out.printf("%60s","Patient's cardiac Ouput(Minute):-");
			   double patient_cardiacoutput=number.nextDouble();
			   double cardiac_index=patient_cardiacoutput/BSA;
			   System.out.printf("%60s %.2f %s","Patient's Cardiac Index Results:-",cardiac_index,"L/minute/m^2");
			   System.out.printf("%70s %n","##########################################cardiac Index###########################################");
			
			   System.out.println();
			   
			   //Child patient Medication Dosage calculation
			   System.out.printf("%70s %n","*****************************************Medical Dosage Calculation for children***********************************");
			 
			   //To clear enter buffer
			   user.nextLine();
			   System.out.printf("%50s","Enter the drug name:- ");
			   String drug_name=user.nextLine();
			   
			   
			   System.out.printf("%50s","Enter the adult dosage(mg):- ");
			   int adult_dose=number.nextInt();
			   
			 		    
			   double medication_dose=(BSA/1.73)*adult_dose;
			   
			   System.out.printf("%50s %s %n","drug name:- ",drug_name);
			   System.out.printf("%50s %.2f %s","Child patient's Medical Dosage:-",medication_dose,"mg");
			
			   System.out.printf("%70s %n","*****************************************Medical Dosage Calculation for children***********************************");
			}//else
			
		}//if
		
		else
		{
			System.out.println("Invalid Credentials!,bye bye");
		}
		
	}

}
