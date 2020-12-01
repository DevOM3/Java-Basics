import java.sql.*;
import java.util.Scanner;
import java.util.Vector;


class DB{
	public static Statement st;
	public static Statement connection(){	
		try{
			Connection con = DriverManager.getConnection("jdbc:sqlite:shop.db");
			st = con.createStatement();
		}catch(Exception e){
			 System.out.println("Error");
		}
		return st;
	}
}

class Shop{
	public static void main(String []ar){
		int id = 0;
		double payment = 0;
		
		Statement st = DB.connection();
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("What do you want to Perform?");
			System.out.println(" 1. Create Bill\n 2. View Stock\n 3. Update Stock\n 4. View Item Quantity\n 5. Add new Item\n 6. Total Collection\n 7. Exit");
			int action = sc.nextInt();

			switch(action){
			case 1:
				double itemCost = 0;
				double billAmt = 0;

				Vector itemList = new Vector();
				boolean cont = true;
				while(cont){
					System.out.print("ID- ");
					int buyID = sc.nextInt();
					
					try{
						ResultSet buyRS = st.executeQuery("SELECT * FROM items WHERE id=" + buyID);
						if (buyRS.next()){							
							System.out.print("Quantity- ");
							int buyQt = sc.nextInt();
							itemCost = buyQt * buyRS.getDouble("cost");
							Vector item = new Vector();
							item.addElement(id);
							item.addElement(buyRS.getString("name"));
							item.addElement(buyQt);
							item.addElement(itemCost);
							itemList.addElement(item);
							
							billAmt += itemCost;

							payment = payment + billAmt;
						}
						else{
							System.out.println("No item exist with ID- " + buyID);
						}
					}catch(Exception e){
						System.out.println("Unable to Checkout");
					}
					System.out.print("Enter '0' to Checkout:- ");
					int inp = sc.nextInt();
					if (inp == 0){
						cont = false;
						generateBill(itemList, billAmt);
					}
				}
				break;
			case 2:
				allItems(st);
				break;
			case 3:
				allItems(st);
				System.out.print("Enter the id of Product you want to Edit:- ");
				id = sc.nextInt();

				try{
					ResultSet rset = st.executeQuery("SELECT * FROM items WHERE id=" + id);
					if (rset.next()){
					
						System.out.println("What do you want to update?");
						System.out.println(" 1. Name\n 2. Cost\n 3. Quantity");
						int update = sc.nextInt();
					
						switch(update){
							case 1:
								System.out.print("Name:- ");
								sc.nextLine();
								String name = sc.nextLine();
								try{
									st.executeUpdate("UPDATE items SET name='" + name + "' WHERE id=" + id);
									System.out.println("Name updated for id '" + id + "'- " + name);
								}catch(Exception e){
									System.out.println("Error while updating");
								}
								break;
							case 2:
								System.out.print("Cost:- ");
								double cost = sc.nextInt();
								try{
									st.executeUpdate("UPDATE items SET cost=" + cost + " WHERE id=" + id);
									System.out.println("Cost updated for id '" + id + "'- " + cost);
								}catch(Exception e){
									System.out.println("Error while updating");
								}
								break;
							case 3:
								System.out.print("Quantity:- ");
								int qt = sc.nextInt();
								try{
									st.executeUpdate("UPDATE items SET qt=" + qt + " WHERE id=" + id);
									System.out.println("Quantity updated for id '" + id + "'- " + qt);
								}catch(Exception e){
									System.out.println("Error while updating");
								}
								break;
							default:
								System.out.println("Wrong Selection");
						}
					}
					else{
						System.out.println("No item with ID- " + id + "found");
					}
				}catch(Exception e){
					System.out.println("Unable to Update data");
				}
				break;
			case 4:
				System.out.println("Enter your Selection\n 1. Get quantity by ID\n 2. Get all items having less quantity");
				int sel = sc.nextInt();
				switch(sel){
					case 1:
						System.out.print("Enter the id of Product to get its Quantity:- ");
						id = sc.nextInt();
						try{
							ResultSet rs = st.executeQuery("SELECT * FROM items WHERE id=" + id);
						
							if(rs.next()){
								System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getDouble("cost") + "\t" + rs.getInt("qt"));
							}
							else{
								System.out.println("No item with ID- " + id);
							}
							
						}catch(Exception e){
							System.out.println("Error while fetching Data");
						}
						break;
					case 2:
						try{
							ResultSet rs = st.executeQuery("SELECT * FROM items WHERE qt<25");
							if (rs.next()){
								while(rs.next()){
									System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getDouble("cost") + "\t" + rs.getInt("qt"));
								}
							}
							else{
								System.out.println("You have sufficient Item quantity");
							}
						}catch(Exception e){
							System.out.println("Error while fetching Data");
						}						
						break;
					default:
						System.out.println("Error while showing products");
					
				}
				break;
			case 5:
				System.out.print("Name:- ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Cost:- ");
				double cost = sc.nextDouble();
				System.out.print("Quantity:- ");
				int qt = sc.nextInt();
				
				try{
					st.executeUpdate("INSERT INTO items(name, cost, qt) values('" + name + "'," + cost + "," + qt + ")");
					System.out.println("Item '" + name + "' is added");
				}catch(Exception e){
					System.out.println("Unable to add an item");
				}
			
				break;
			case 6:
				System.out.println("Your Today's collection is Rs. " + payment);
				break;
			case 7:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Selection");
			}
		}
	}
	
	public static void allItems(Statement st){
		try{
			ResultSet rs = st.executeQuery("SELECT * FROM items");
			
			while(rs.next()){
				System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + "\t" + rs.getDouble("cost") + "\t" + rs.getInt("qt"));
			}

		}catch(Exception e){
			System.out.println("Error occured while showing Items");
		}
	}

	public static void generateBill(Vector itemList, double amt){
		System.out.println("ID" + "\t\t" + "Name" +  "\t\t" + "Quantity" + "\t\t" + "Cost");
		for (Object prods: itemList){
			System.out.println();
			Vector items = (Vector)prods;
			for (Object item: items){
				System.out.print(item + "\t\t");
			}
		}
		System.out.println("\nTotal:- \t\tRs." + amt);
	}

}