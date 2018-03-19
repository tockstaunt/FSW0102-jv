package com.keithcollier.finalproject;

import java.io.*;
import java.util.*;


public class FinalProject {
public static void main(String[] args) throws Exception{
	Scanner in = new Scanner(System.in);
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	//menu List
	List<String> menuItems = new ArrayList<String>();
	
	
	menuItems.add("1: Add a task");
	menuItems.add("2: Remove a task");
	menuItems.add("3: Mark a task complete");
	menuItems.add("4: List the tasks");
	
	//TaskList
	List<String> taskItems = new ArrayList<String>();
	
	//for loop to display list
	for (int i = 0; i < menuItems.size();i++) {
		System.out.println(menuItems.get(i));
		
	}
	
	boolean quit = false;
	int menu;
	do {	
		System.out.println("What would you like to do: ");
		menu = in.nextInt();
	
		switch (menu) {
		
		case 1:
			
			System.out.println("What Task would you like to add?");
			String input = reader.readLine();
			taskItems.add(input);
			System.out.print("You have added a task!");
			
			
			break;
			
		case 2:
			int numbers2 = 1;
	    	  
	    	  
	    	  for (int i = 0; i < taskItems.size();i++) {
	    		  
	    		  String listItems = numbers2 +": " + taskItems.get(i);
	    		  numbers2++;
	    			System.out.println(listItems);
	    			
	    		}
			System.out.println("What Task would you like to delete?");
			int input2 = in.nextInt();
			if(taskItems.size() > 0){taskItems.remove(input2);
				System.out.print("You have deleted a task!");
				}
			else 
			{
				System.out.println("Sorry Try Again");
				}
			

            break;

		case 3:

            
			int numbers3 = 1;
	    	  
	    	  
	    	  for (int i = 0; i < taskItems.size();i++) {
	    		  
	    		  String listItems = numbers3 +": " + taskItems.get(i);
	    		  numbers3++;
	    			System.out.println(listItems);
	    			
	    		}
            break;

      case 4:
    	  
    	  int numbers4 = 1;
    	  
    	  
    	  for (int i = 0; i < taskItems.size();i++) {
    		  
    		  String listItems = numbers4 +": " + taskItems.get(i);
    		  numbers4++;
    			System.out.println(listItems);
    			
    		}
    	 
            break;
		
	case 0:

        quit = true;

        break;
	 default:

         System.out.println("Invalid choice.");

   }

} while (!quit);
System.out.println("Bye-bye!");

}

}
	