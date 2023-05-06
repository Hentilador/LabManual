package javaInheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javaInheritance.LibraryItem;

public class LibrarySys {
	static Library lib = new Library();
	public static void main(String[] args) { //added for errors
		for(int x=0;x==0;x+=0) {
			lib.actionSelect();
		}
	}
		
}


class Library {
	Scanner input = new Scanner(System.in);
	
	public List<LibraryItem> items;
	public int libIndex=1; //index TODO
	public int numItems=0; //should be updated by add and remove methods
	
	public Library() {
		items = new ArrayList<>();
    }
	//Main Menu selection screen
	public void actionSelect() {
		cls();
		title();
		int key = 0; //to initialize everytime the method is called
		
		System.out.print("1. Add a Library Item\n2. Remove a Library Item\n3. Checkout Item\n4. Return Item\n5. View Library");
		if(numItems != 0) {
			System.out.println(" (Currently has "+numItems+" item(s))");
		}
		System.out.print("\n\nSelection: "); key = input.nextInt(); input.nextLine();//to consume the newline after nextInt
		
		switch(key) {
		case 1:
			addLibraryItem();
			break;
		case 2:
			removeLibraryItem();
			break;
		case 3:
			cls();
			checkoutItem();
			break;
		case 4:
			cls();
			returnItem();
			break;
		case 5:
			viewLibrary();
			break;
		default:
			cls();
			actionSelect();
			return;
		}
	}
	
	public void addLibraryItem() {
		start:
		for(int x=0;x==0;x+=0) { // infinite loop
			cls(); title();
			int select = 0; // initialize selection variable for isBookOrDVD
			System.out.println("\t\tAdd Item\n");
			System.out.print("1. Book\n2. DVD\n\nSelection: "); select = input.nextInt(); input.nextLine();
			if(select != 1 && select != 2) {
				break start; // if neither 1 or 2 was entered breaks the loop and goes back to start label
			}
			cls(); title();
			System.out.print("Enter title: "); String title = input.nextLine();
			System.out.print("Enter author: "); String author = input.nextLine();
			
			int isCheckedOut = 0;
			String dueDate = null;
			String isBookOrDVD = (select == 1) ? ("book") : ("dvd");
			
			if(select == 1) {
				int id = libIndex;
				
				System.out.print("Enter number of pages: ");
				int numPages = input.nextInt(); input.nextLine();
				System.out.print("Enter publisher: "); String publisher = input.nextLine();
				
				Book book = new Book(id,title,author,isCheckedOut,dueDate,isBookOrDVD,numPages,publisher);
				items.add(book);
			}
			else if(select == 2) {
				int id = libIndex;
				System.out.print("Enter runtime in minutes: ");
				int runtime = input.nextInt(); input.nextLine();
				System.out.print("Enter director: ");String director = input.nextLine();
				
				DVD dvd = new DVD(id,title,author,isCheckedOut,dueDate,isBookOrDVD,runtime,director);
				items.add(dvd);
			}
			// after adding an item, sets the index after the last item in the list
			libIndex = items.size()+1; 
			cls();
		}
	}
	
	public void removeLibraryItem() {
		start:
			cls(); title();
			// print a simplified version of view library to choose what to remove
			for (LibraryItem item : items) { 
	            System.out.print(item.libI());
			}
			System.out.print("\nEnter ID of Item to remove: "); int remove = input.nextInt();
			input.nextLine();
			libIndex = remove;
			items.remove(remove-1);
			cls(); title();
			for (LibraryItem item : items) { 
	            System.out.print(item.libI());
			}
			input.nextLine(); // pause the program until next input
	}
	
	public void checkoutItem() {
			cls(); title(); 
			// print a simplified version of view library to choose what to checkout
			for (LibraryItem item : items) { 
				if(item.isCheckedOut == 0) {
					System.out.print(item.libI());
				}
			}
			System.out.print("\nEnter ID of Item to Checkout: "); int checkout = input.nextInt();
			input.nextLine(); // consume newline character
			cls(); title();
			LibraryItem item = items.get(checkout-1);
			if(item.isCheckedOut == 1) {
				System.out.println("Item is already checked out");
			}
			else {
				System.out.print(item.libI());
	            System.out.print(item.libII());
	            
	            if (item instanceof Book) {
	            	// Type cast for changing item from  a type of LibraryItem to Book
	                Book book = (Book) item;
	                System.out.println(book.libB()+"\n");
	            } else if (item instanceof DVD) {
	                DVD dvd = (DVD) item;
	                System.out.println(dvd.libD()+"\n");
				}
	            System.out.print("Proceed with checkout?\n1. Yes\n2. No\n\nSelection:  "); int proceed = input.nextInt();
	            input.nextLine();
	            cls(); title();
	            if(proceed == 1) {
	            	item.isCheckedOut = 1;
	            	item.dueDate = "01/14/2034";
	            	System.out.println("Operation Successful.\nYour due date is: "+item.dueDate);
	            }
	            else {
	            	System.out.println("Operation Cancelled");
	            }
			}
            input.nextLine();
	}
	
	public void returnItem() {
		cls(); title(); 
		// print a simplified version of view library to choose what to checkout
		for (LibraryItem item : items) { 
			if(item.isCheckedOut == 1) {
				System.out.print(item.libI());
			}
		}
		System.out.print("\nEnter ID of Item to Checkout: "); int checkout = input.nextInt();
		input.nextLine(); // consume newline character
		cls(); title();
		LibraryItem item = items.get(checkout-1);
		if(item.isCheckedOut == 0) {
			System.out.println("Item isn't checked out");
		}
		else {
			System.out.print(item.libI());
            System.out.print(item.libII());
            
            if (item instanceof Book) {
            	// Type cast for changing item from  a type of LibraryItem to Book
                Book book = (Book) item;
                System.out.println(book.libB()+"\n");
            } else if (item instanceof DVD) {
                DVD dvd = (DVD) item;
                System.out.println(dvd.libD()+"\n");
			}
            System.out.print("Proceed with return?\n1. Yes\n2. No\n\nSelection:  "); int proceed = input.nextInt();
            input.nextLine();
            cls(); title();
            if(proceed == 1) {
            	item.isCheckedOut = 0;
            	item.dueDate = null;
            	System.out.println("Operation Successful");
            }
            else {
            	System.out.println("Operation Cancelled");
            }
		}
        input.nextLine();
	}
	
	public void viewLibrary() {
		cls(); title();
		// iterates over all the LibraryItem objects in the items array list and assign them to 'item'
		for (LibraryItem item : items) {
            System.out.print(item.libI());
            System.out.print(item.libII());
            
            if (item instanceof Book) {
            	// Type cast for changing item from  a type of LibraryItem to Book
                Book book = (Book) item;
                System.out.println(book.libB()+"\n");
            } else if (item instanceof DVD) {
                DVD dvd = (DVD) item;
                System.out.println(dvd.libD()+"\n");
			}
		}
		input.nextLine(); // pause the program until next input
	}
	
	
	public static void cls() {
	    for (int i = 0; i < 50; ++i) {
	        System.out.println();
	    }
	}
	
	public void title() {
		System.out.println("\t\tLibrary System\n");
	}

	
}