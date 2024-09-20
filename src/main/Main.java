package main;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	Vector<String> Yname = new Vector<>();
	Vector<String> Yflav = new Vector<>();
	Vector<Integer> Yprice = new Vector<>();
	Vector<String> YID = new Vector<>();
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	public void choose1() {
		
		String name, flav;
		int price;
		
		while(true) {
			System.out.print("Create Yoghurt Name [more than 1 word]: ");
			name = scan.nextLine();
				if(!name.contains(" ")){
					System.out.println("Name must be more than 1 word!");
					continue;
				} Yname.add(name);
				break;
		}
		
		while(true) {
			System.out.print("Choose Base Flavour [Original | Peach | Strawberry | Charcoal]: ");
			flav = scan.nextLine();
				if(!(flav.equals("Original") || flav.equals("Peach") || flav.equals("Strawberry") || flav.equals("Charcoal"))) {
					System.out.println("Choose from the base flavour provided!");
					continue;
				} Yflav.add(flav); 
				break;
		}
		
		while(true) {
			System.out.print("Input Price [10000 - 100000]: ");
			price = scan.nextInt();
				if(price<10000 || price>100000) {
					System.out.println("Price must be between 10000 - 100000!");
					continue;
				} Yprice.add(price); 
				break;
		}
		
		while(true) {
			
			String ID;
			
			char a = (char)(rand.nextInt(26) + 'A');
			char b = (char)(rand.nextInt(26) + 'A');
			
			ID = Character.toString(a) + Character.toString(b) + rand.nextInt(10) + rand.nextInt(10) + rand.nextInt(10);
			System.out.println("Yoghurt ID = " + ID);
			System.out.println("Yoghurt successfully added!");
			System.out.println();
			YID.add(ID);
			break;
		}
	}
	
	public void choose2() {
		
		int subchoice, delete, update, price;
		String name, flav;
		
		while(true) {
			if(Yname.size()<1) {
				System.out.println("There is no Yoghurt creation!");
				System.out.println();
				break;
			} else {
				System.out.println("---------------------------------------------------------");
				System.out.println("|No| ID       | Name            | Flavour     | Price   |");
				System.out.println("---------------------------------------------------------");
				for (int i = 0; i < Yname.size()-1; i++) {
					for (int j = 0; j < Yname.size()-i-1; j++) {
						if(Yname.get(j).compareToIgnoreCase(Yname.get(j+1))>0) {
							String tempName = Yname.get(j);
							Yname.set(j, Yname.get(j+1));
							Yname.set(j+1, tempName);
							
							String tempFlav = Yflav.get(j);
							Yflav.set(j, Yflav.get(j+1));
							Yflav.set(j+1, tempFlav);
							
							Integer tempPrice = Yprice.get(j);
							Yprice.set(j, Yprice.get(j+1));
							Yprice.set(j+1, tempPrice);
							
							String tempID = YID.get(j);
							YID.set(j, YID.get(j+1));
							YID.set(j+1, tempID);
							
							}
						}
					} for (int i = 0; i < Yname.size(); i++) {
						System.out.println("|" +(i+1)+ "| " +YID.get(i)+ "  |" +Yname.get(i)+ "    | " +Yflav.get(i)+ "    |" +Yprice.get(i)+"  |");
						System.out.println("---------------------------------------------------------");					
						}
					System.out.println("");
					System.out.println("1. Delete Yoghurt");
					System.out.println("2. Update Yoghurt");
					System.out.println("3. Back to Main Menu");
					System.out.print(">>");
					System.out.println();
					subchoice = scan.nextInt();
						
					while(true) {
						if(subchoice<1||subchoice>3) {
							continue;
						}
						if(subchoice==1) {
							System.out.println("---------------------------------------------------------");
							System.out.println("|No| ID       | Name            | Flavour     | Price   |");
							System.out.println("---------------------------------------------------------");
							for (int i = 0; i < Yname.size()-1; i++) {
								for (int j = 0; j < Yname.size()-i-1; j++) {
									if(Yname.get(j).compareToIgnoreCase(Yname.get(j+1))>0) {
										String tempName = Yname.get(j);
										Yname.set(j, Yname.get(j+1));
										Yname.set(j+1, tempName);
										
										String tempFlav = Yflav.get(j);
										Yflav.set(j, Yflav.get(j+1));
										Yflav.set(j+1, tempFlav);
										
										Integer tempPrice = Yprice.get(j);
										Yprice.set(j, Yprice.get(j+1));
										Yprice.set(j+1, tempPrice);
										
										String tempID = YID.get(j);
										YID.set(j, YID.get(j+1));
										YID.set(j+1, tempID);
										
										}
									}
								} for (int i = 0; i < Yname.size(); i++) {
									System.out.println("|" +(i+1)+ "| " +YID.get(i)+ "  |" +Yname.get(i)+ "    | " +Yflav.get(i)+ "    |" +Yprice.get(i)+"  |");
									System.out.println("---------------------------------------------------------");
								}
								while(true) {
									System.out.println();
									System.out.print("Choose yoghurt to delete [1 - " +Yname.size()+ "]: ");
									delete = scan.nextInt();
									
									Yname.remove(delete-1);
									Yflav.remove(delete-1);
									Yprice.remove(delete-1);
									YID.remove(delete-1);
									System.out.println("Yoghurt successfully deleted!");
									System.out.println();
									break;
								}
									
								
						
					
						} else if (subchoice==2) {
							System.out.println("---------------------------------------------------------");
							System.out.println("|No| ID       | Name            | Flavour     | Price   |");
							System.out.println("---------------------------------------------------------");
							for (int i = 0; i < Yname.size()-1; i++) {
								for (int j = 0; j < Yname.size()-i-1; j++) {
									if(Yname.get(j).compareToIgnoreCase(Yname.get(j+1))>0) {
										String tempName = Yname.get(j);
										Yname.set(j, Yname.get(j+1));
										Yname.set(j+1, tempName);
										
										String tempFlav = Yflav.get(j);
										Yflav.set(j, Yflav.get(j+1));
										Yflav.set(j+1, tempFlav);
										
										Integer tempPrice = Yprice.get(j);
										Yprice.set(j, Yprice.get(j+1));
										Yprice.set(j+1, tempPrice);
										
										String tempID = YID.get(j);
										YID.set(j, YID.get(j+1));
										YID.set(j+1, tempID);
										
										}
									}
								} for (int i = 0; i < Yname.size(); i++) {
									System.out.println("|" +(i+1)+ "| " +YID.get(i)+ "  |" +Yname.get(i)+ "    | " +Yflav.get(i)+ "    |" +Yprice.get(i)+"  |");
									System.out.println("---------------------------------------------------------");
								}
								while(true) {
									System.out.println("");
									System.out.print("Choose yoghurt to update{1 - "+(Yname.size())+"]: ");
									update = scan.nextInt();
									
									while(true) {
										System.out.print("Create Yoghurt Name [more than 1 word]: ");
										scan.next();
										name = scan.nextLine();
											if(!name.contains(" ")){
												System.out.println("Name must be more than 1 word!");
												continue;
											} Yname.set(update-1, name);
											break;
									}
									
									while(true) {
										System.out.print("Choose Base Flavour [Original | Peach | Strawberry | Charcoal]: ");
										flav = scan.nextLine();
											if(!(flav.equals("Original") || flav.equals("Peach") || flav.equals("Strawberry") || flav.equals("Charcoal"))) {
												System.out.println("Choose from the base flavour provided!");
												continue;
											} Yflav.add(update-1, flav); 
											break;
									}
									
									while(true) {
										System.out.print("Input Price [10000 - 100000]: ");
										price = scan.nextInt();
											if(price<10000 || price>100000) {
												System.out.println("Price must be between 10000 - 100000!");
												continue;
											} Yprice.add(update-1, price); 
											System.out.println("Yoghurt successfully updated!");
											System.out.println();
											break;
									}
									break;
								}
									  
						}break;
						
				}
				
				
			}if(subchoice==3) {
				break;
			}
		}	
}

		
		
	
	public void choose3() {
		System.exit(0);
	}
	
	
	
	
	public Main() {
		
		int choose;
		
		while(true) {
			System.out.println("YoghurtLand");
			System.out.println("1. Create New Yoghurt Creation");
			System.out.println("2. View Yoghurt List");
			System.out.println("3. Exit");
			System.out.print(">>");
			choose = scan.nextInt();
			scan.nextLine();
			
			if(choose<1 || choose>3) {
				continue;
			}
			if(choose==1) {
				choose1();
			}else if(choose==2) {
				choose2();
			}else if (choose==3) {
				choose3();
			} 
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
