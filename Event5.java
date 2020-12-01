import java.awt.*;
import java.awt.event.*;

class Event5Main extends Frame implements ActionListener {
	Event5Main() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);

		Label welcome = new Label("WELCOME TO LIBRARY MANAGEMENT SYSTEM");
		welcome.setFont(new Font("comicsans", Font.BOLD, 21));
		Label click = new Label("Click on your choice");
		click.setFont(new Font("comicsans", Font.BOLD, 17));
		
		Button issue = new Button("Issue Book");
		Button returnBook = new Button("Return Book");
		Button newBook = new Button("New Book");
		Button newStudent = new Button("New Student");
		Button notReturnedBooks = new Button("Not Returned Books");
		Button personalHistory = new Button("Personal History");
		Button showAllBooks = new Button("Show All Books");
		Button searchBooks = new Button("Search Books");
		Button exitit = new Button("EXIT");
		
		issue.addActionListener(this);
		returnBook.addActionListener(this);
		newBook.addActionListener(this);
		newStudent.addActionListener(this);
		notReturnedBooks.addActionListener(this);
		personalHistory.addActionListener(this);
		showAllBooks.addActionListener(this);
		searchBooks.addActionListener(this);
		exitit.addActionListener(this);

		add(welcome);
		add(click);
		add(issue);
		add(returnBook);
		add(newBook);
		add(newStudent);
		add(notReturnedBooks);
		add(personalHistory);
		add(showAllBooks);
		add(searchBooks);
		add(exitit);
	}

	public void actionPerformed(ActionEvent ae) {
		String label = ae.getActionCommand();

		switch(label) {
			case "Issue Book" : new IssueBook();
					    break;
			case "Return Book" : new ReturnBook();
					    break;
			case "New Book" : new NewBook();
					  break;
			case "New Student" : new NewStudent();
					    break;
			case "Not Returned Books" : new NotReturnedBooks();
						   break;
			case "Personal History" : new PersonalHistory();
						  break;
			case "Show All Books" : new ShowAllBooks();
						break;
			case "Search Books" : new SearchBooks();
					      break;
			case "EXIT" : System.exit(0);
				      break;
		}
	}
}

class IssueBook extends Frame implements ActionListener {
	TextField roll;
	TextField bookNo;
	
	IssueBook() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Font font = new Font("comicsans", Font.BOLD, 17);

		Label title = new Label("Issue Book");
		title.setFont(new Font("comicsans", Font.BOLD, 21));
		Label rollLabel = new Label("Enter enroll number");
		rollLabel.setFont(font);
		roll = new TextField(21);
		Label bookLabel = new Label("Enter Book Number");
		bookLabel.setFont(font);
		bookNo = new TextField(21);

		Button submit = new Button("Submit");
		submit.addActionListener(this);

		add(title);
		add(rollLabel);
		add(roll);
		add(bookLabel);
		add(bookNo);
		add(submit);
	}

	public void actionPerformed(ActionEvent ae) {
		String rollNumber = roll.getText();
		String bookNumber = bookNo.getText();
	}
}

class ReturnBook extends Frame implements ActionListener {
	TextField bookNo;
	
	ReturnBook() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Font font = new Font("comicsans", Font.BOLD, 17);

		Label title = new Label("Return Book");
		title.setFont(new Font("comicsans", Font.BOLD, 21));
		Label bookLabel = new Label("Enter Book number");
		bookLabel.setFont(font);
		bookNo = new TextField(21);

		Button submit = new Button("Submit");
		submit.addActionListener(this);

		add(title);
		add(bookLabel);
		add(bookNo);
		add(submit);
	}

	public void actionPerformed(ActionEvent ae) {
		String bookNumber = bookNo.getText();
	}
}

class NewBook extends Frame implements ActionListener {
	TextField bookNo;
	TextField bookName;
	TextField bookAuthor;
	
	NewBook() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Font font = new Font("comicsans", Font.BOLD, 17);

		Label title = new Label("New Book");
		title.setFont(new Font("comicsans", Font.BOLD, 21));

		Label noLabel = new Label("Enter Book number");
		noLabel.setFont(font);
		bookNo = new TextField(21);
		Label nameLabel = new Label("Enter Book name");
		nameLabel.setFont(font);
		bookName = new TextField(21);
		Label authorLabel = new Label("Enter Book Author");
		authorLabel.setFont(font);
		bookAuthor = new TextField(21);

		Button submit = new Button("Submit");
		submit.addActionListener(this);

		add(title);
		add(noLabel);
		add(nameLabel);
		add(authorLabel);
		add(bookNo);
		add(bookName);
		add(bookAuthor);
		add(submit);
	}

	public void actionPerformed(ActionEvent ae) {
		String bookNumber = bookNo.getText();
		String name = bookName.getText();
		String author = bookAuthor.getText();
	}
}

class NewStudent extends Frame implements ActionListener {
	TextField enNo;
	TextField studentName;
	TextField studentBranch;
	TextField phno;
	
	NewStudent() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Font font = new Font("comicsans", Font.BOLD, 17);

		Label title = new Label("New Student");
		title.setFont(new Font("comicsans", Font.BOLD, 21));

		Label noLabel = new Label("Enter Enroll number");
		noLabel.setFont(font);
		enNo = new TextField(21);
		Label nameLabel = new Label("Enter Student name");
		nameLabel.setFont(font);
		studentName = new TextField(21);
		Label branchLabel = new Label("Enter Student Branch");
		branchLabel.setFont(font);
		studentBranch = new TextField(21);
		Label phnoLabel = new Label("Enter Phone number");
		phnoLabel.setFont(font);
		phno = new TextField(21);

		Button submit = new Button("Submit");
		submit.addActionListener(this);

		add(title);
		add(noLabel);
		add(nameLabel);
		add(branchLabel);
		add(phnoLabel);
		add(enNo);
		add(studentName);
		add(studentBranch);
		add(phno);
		add(submit);
	}

	public void actionPerformed(ActionEvent ae) {
		String enrollNumber = enNo.getText();
		String name = studentName.getText();
		String branch = studentBranch.getText();
		String phone = phno.getText();
	}
}

class NotReturnedBooks extends Frame {
	NotReturnedBooks() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);

		Label title = new Label("Not Returned Book");
		title.setFont(new Font("comicsans", Font.BOLD, 21));

		add(title);
	}
}

class PersonalHistory extends Frame implements ActionListener {
	TextField enNo;
	
	PersonalHistory() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Font font = new Font("comicsans", Font.BOLD, 17);

		Label title = new Label("Enter Enrollment Number");
		title.setFont(new Font("comicsans", Font.BOLD, 21));

		enNo = new TextField(40);

		Button submit = new Button("Submit");
		submit.addActionListener(this);

		add(title);
		add(enNo);
		add(submit);
	}

	public void actionPerformed(ActionEvent ae) {
		String enrollNumber = enNo.getText();
	}
}


class ShowAllBooks extends Frame implements ActionListener {
	ShowAllBooks() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		
		Font font = new Font("comicsans", Font.BOLD, 17);

		Label title = new Label("Showing details of all Books");
		title.setFont(new Font("comicsans", Font.BOLD, 21));

		Label label = new Label("Click the button to get Details");
		label.setFont(font);

		Button submit = new Button("Submit");
		submit.addActionListener(this);

		add(title);
		add(label);
		add(submit);
	}

	public void actionPerformed(ActionEvent ae) {
		System.out.println("Clicked");
	}
}

class SearchBooks extends Frame implements ActionListener {
	SearchBooks() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);

		Label title = new Label("Search Books by");
		title.setFont(new Font("comicsans", Font.BOLD, 21));

		Button bookNo = new Button("Book Number");
		bookNo.addActionListener(this);
		Button bookName = new Button("Book Name");
		bookName.addActionListener(this);
		Button bookAuthor = new Button("Book Author");
		bookAuthor.addActionListener(this);

		add(title);
		add(bookNo);
		add(bookName);
		add(bookAuthor);
	}

	public void actionPerformed(ActionEvent ae) {
		String label = ae.getActionCommand();

		switch(label) {
			case "Book Number":
					    break;
			case "Book Name":
					  break;
			case "Book Author":
					    break;
		}
	}
}

class Event5 {
	public static void main(String []ar) {
		new Event5Main();
	}
}
