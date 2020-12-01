import java.util.Scanner;

interface Bank
{
	double roi = 8.00;
}

interface BankFacility
{
	public void withdrawal();
	public double getBalance();
	public void transferMoney();
}

class BankMain implements Bank, BankFacility
{
	static String acc_no = "12345";
	static String pass = "qwerty";
	static double bal = 253234.00;
	static double rem_bal;

	public void withdrawal()
		{
			Scanner w = new Scanner(System.in);
			System.out.print("Enter the amount which you want to Withdraw : ");
			int w_amt = w.nextInt();
			System.out.println("Rs. " + w_amt + " are debited from your account");
			rem_bal = bal - w_amt;
			System.out.println("Remaining Balance is : " + rem_bal);
		}

	public double getBalance()
		{
			return rem_bal;
		}

	public void transferMoney()
		{
			Scanner tm = new Scanner(System.in);
			System.out.print("Enter the Recipants Account Number : ");
			int rec_id = tm.nextInt();
			System.out.println("Enter the amount you want to transfer ");
			int send_amt = tm.nextInt();
			System.out.println("Do you want to send Rs. " + send_amt + " to " + rec_id + " ? (y/n)");
			String yn = tm.nextLine();
			if (yn == "y")
				{
					System.out.println("Sending Rs. " + send_amt + " to Account number " + rec_id + ".......");
					System.out.println("Amount " + send_amt + "Sent to Account Number " + rec_id);
				}
			else
				{
					System.out.println("Money Transfer Cancled .......");
				}
		}

	public static void main(String []ar)
		{
			String acc;
			String p;
			Scanner sc = new Scanner(System.in);

			BankMain b = new BankMain();
			do{
			System.out.println("Enter your Bank ");
			acc = sc.nextLine();

			System.out.println("Enter a Password ");
			p = sc.nextLine();

			if (acc.equals(acc_no) && p.equals(pass))
				{
					System.out.print("What do you want to perform : \n1] Withdraw Money\n2] Get Balance\n3] Transfer Money\n");
					byte ch = sc.nextByte();

					switch(ch)
						{
							case 1:
								b.withdrawal();
								break;
							case 2:
								System.out.println("Remaining Balance is : " + b.getBalance());
								break;
							case 3:
								b.transferMoney();
								break;
							default:
								System.out.println("Syntax Error !! Invalid Input");
						}
				}
			else
				{
					System.out.print("Your Account Number and Password might be invalid ! Try again!!!");
				}
			}while(true);
			
		}
}
