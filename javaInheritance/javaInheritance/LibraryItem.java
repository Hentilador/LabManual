package javaInheritance;

public class LibraryItem {
	
	public int id; //0 = row index for each new item
	public String title; //1
	public String author; //2
	public int isCheckedOut; //3
	public String dueDate; //4
	public String isBookOrDVD; //5
	
	public String libI() {
        return "[id#"+id+"] ["+isBookOrDVD+"]\n"+title+" by "+author+"\n";
    }
	public String libII() {
		return "Checked Out: "+((isCheckedOut == 1)?("Yes"):("No"))+"\nDue Date: "+dueDate;
	}
}

class Book extends LibraryItem {
	public int numPages; //6
	public String publisher; //7
	
	public Book(int id,String title,String author,int isCheckedOut,String dueDate,String isBookOrDVD, int numPages, String publisher) {
        this.id = id;
		this.title = title;
        this.author = author;
        this.isCheckedOut = isCheckedOut;
        this.dueDate = dueDate;
        this.isBookOrDVD = isBookOrDVD;
        this.numPages = numPages;
        this.publisher = publisher;
    }
	
	public String libB() {
		return "\nNumber of Pages: "+numPages+"\nPublisher: "+publisher;
	}
	
}

class DVD extends LibraryItem {
	public int runtime; //8
	public String director; //9
	
	public DVD(int id,String title,String author,int isCheckedOut,String dueDate,String isBookOrDVD, int runtime, String director) {
		this.id = id;
		this.title = title;
        this.author = author;
        this.isCheckedOut = isCheckedOut;
        this.dueDate = dueDate;
        this.isBookOrDVD = isBookOrDVD;
        this.runtime = runtime;
        this.director = director;
    }
	
	public String libD() {
		return "\nRuntime: "+runtime+"m"+"\nDirector: "+director;
	}
	
}
