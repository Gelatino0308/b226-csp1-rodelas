
package com.joysistvi.loadreg.main;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in); // instantiation of scanner object to be reused 
    
    static double loadBalance = 100.0; // user has 100 as initial load balance
    // single dimensional array to contain list of Smart promo names
    static String[] promoList = {
        "ALL DATA", "ALL DATA+", "POWERALL", "MAGIC DATA", "MAGIC DATA+", 
        "UNLI 5G DATA", "SMART UCT", "ALLNET COMBOS", "MAGIC CALLS", "GIGA VIDEO"
    };
    
    // MAIN METHOD
    public static void main(String[] args) {
        validateUssdCode();
        // exception handling was done for each display method instead to avoid always going back to main even if the error occured on other sections
        mainMenu(); 
    }
    
    // nethod to validate USSD code for Smart
    public static void validateUssdCode() {
        System.out.println("----------------------------------------");
        System.out.println("  Dial *123# to access Smart Services");
        System.out.println("----------------------------------------");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();
        
        // validation
        if (ussdCode.isEmpty() || !ussdCode.equals("*123#")) {
            System.out.println("\n> Invalid USSD Code. Exiting...");
            System.exit(0); // Exit System
        }
    }
    
    // method to display main menu interface
    public static void mainMenu() {
        
        while (true) {
            try {
                clearScreen();
                System.out.println("\n------------------------------------");
                System.out.println("   ** Smart Load Registration **");
                System.out.println("------------------------------------");
                
                // cycles through the promo list to display them dynamically
                for (int i = 0; i < promoList.length; i++) {
                    System.out.println("\t[" + (i + 1) + "] " + promoList[i]);
                }
                System.out.println("\t[" + (promoList.length + 1) + "] Check Balance");
                System.out.println("\t[" + (promoList.length + 2) + "] Exit");
                System.out.print("Enter choice: ");
                int mainMenuChoice = scanner.nextInt();
                
                /* 
                    depending on the chosen promo, a corresponding 2D array of its options will be initialized,
                    where each row represents the promo's attributes and each column is an entry of a promo's option.
                    the specific array initialized will then be passed to a generic function for display.
                */
                switch (mainMenuChoice) {
                    case 1:
                        String[][] allDataOptions = {
                            {"2 GB", "6 GB", "24 GB"}, // Data
                            {"", "", ""}, // Inclusions
                            {"3 Days", "7 Days", "30 Days"}, // Validity
                            {"50", "99", "299"} // Price
                        };
                        promoDetails(mainMenuChoice, allDataOptions);
                        break;
                    case 2:
                        String[][] allDataPlusOptions = {
                            {"3 GB", "6 GB", "24 GB"}, // Data
                            {"Unli All-Net Calls & Texts", "Unli All-Net Calls & Texts", "Unli All-Net Calls & Texts"}, // Inclusions
                            {"3 Days", "7 Days", "30 Days"}, // Validity
                            {"75", "149", "499"} // Price
                        };
                        promoDetails(mainMenuChoice, allDataPlusOptions);
                        break;
                    case 3:
                        String[][] powerAllOptions = {
                            {"8 GB + Unli Tiktok", "12 GB + Unli Tiktok", "24 GB + Unli Tiktok"}, // Data
                            {"Unli All-Net Calls & Texts", "Unli All-Net Calls & Texts", "Unli All-Net Calls & Texts"}, // Inclusions
                            {"7 Days", "7 Days", "30 Days"}, // Validity
                            {"99", "149", "449"} // Price
                        };
                        promoDetails(mainMenuChoice, powerAllOptions);
                        break;
                    case 4:
                        String[][] magicDataOptions = {
                            {"2 GB", "6 GB", "24 GB"}, // Data
                            {"", "", ""}, // Inclusions
                            {"No Expiry", "No Expiry", "No Expiry"}, // Validity
                            {"99", "149", "399"} // Price
                        };
                        promoDetails(mainMenuChoice, magicDataOptions);
                        break;
                    case 5:
                        String[][] magicDataPlusOptions = {
                            {"4 GB", "19 GB", "30 GB"}, // Data
                            {
                                "50 mins All-Net Calls + 50 All-Net Texts",
                                "150 mins All-Net Calls + 150 All-Net Texts",
                                "200 mins All-Net Calls + 200 All-Net Texts"
                            }, // Inclusions
                            {"No Expiry", "No Expiry", "No Expiry"}, // Validity
                            {"199", "399", "499"} // Price
                        };
                        promoDetails(mainMenuChoice, magicDataPlusOptions);
                        break;
                    case 6:
                        String[][] unli5GDataOptions = {
                            {"Unli 5G (+3GB 4G)", "Unli 5G (+12GB 4G)", "Unli 5G (+24GB 4G)"}, // Data
                            {"", "", ""}, // Inclusions
                            {"7 Days", "30 Days", "30 Days"}, // Validity
                            {"299", "599", "799"} // Price
                        };
                        promoDetails(mainMenuChoice, unli5GDataOptions);
                        break;
                    case 7:
                        String[][] smartUCTOptions = {
                            {"100 MB Chat", "300 MB Chat", "500 MB Chat"}, // Data
                            {
                                "Unli All-Net Texts + Unli Tri-Net Calls",
                                "Unli All-Net Texts + Unli Tri-Net Calls",
                                "Unli All-Net Texts + Unli Tri-Net Calls"
                            }, // Inclusions
                            {"1 Day", "3 Days", "7 Days"}, // Validity
                            {"30", "50", "100"} // Price
                        };
                        promoDetails(mainMenuChoice, smartUCTOptions);
                        break;
                    case 8:
                        String[][] allNetOptions = {
                            {"500 MB", "1 GB", "2 GB"}, // Data
                            {"Unli All-Net Calls & Texts", "Unli All-Net Calls & Texts", "Unli All-Net Calls & Texts"}, // Inclusions
                            {"3 Days", "7 Days", "30 Days"}, // Validity
                            {"50", "99", "299"} // Price
                        };
                        promoDetails(mainMenuChoice, allNetOptions);
                        break;
                    case 9:
                        String[][] magicCallsOptions = {
                            {"", "", ""}, // Data
                            {"50 mins All-Net Calls", "150 mins All-Net Calls", "250 mins All-Net Calls"}, // Inclusions
                            {"No Expiry", "No Expiry", "No Expiry"}, // Validity
                            {"99", "150", "199"} // Price
                        };
                        promoDetails(mainMenuChoice, magicCallsOptions);
                        break;
                    case 10:
                        String[][] gigaVideoOptions = {
                            {
                                "1 GB Open Data + 1 GB/Day YouTube",
                                "2 GB Open Data + 1 GB/Day YouTube",
                                "4 GB Open Data + 1 GB/Day YouTube"
                            }, // Data
                            {"", "", ""}, // Inclusions
                            {"3 Days", "7 Days", "30 Days"}, // Validity
                            {"50", "99", "299"} // Price
                        };
                        promoDetails(mainMenuChoice, gigaVideoOptions);
                        break;
                    case 11:
                        checkBalance();
                        break;
                    case 12:
                        System.out.println("\n> Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("\n> Invalid Choice!");
                        break;
                }
            } 
            catch (Exception e) {
                System.out.println("\n> Invalid input! Please enter a number.");
                scanner.nextLine(); // consumes leftover \n in input buffer
            }
        }
    }
    
    // method to display the promo details such as options and user actions
    public static void promoDetails(int menuChoice, String[][] promoOptions) {
        
        while (true) {
            try {
                clearScreen();
                System.out.println("\n--------------------------------------------");
                System.out.println("         ** Enjoy " + promoList[menuChoice - 1] + " Promo **");
                System.out.println("--------------------------------------------");
                
                // cycles through each promo to display the option's attributes
                for (int i = 0; i < promoOptions[0].length; i++) {
                    System.out.print("\t[" + (i + 1) + "] ");

                    if (!promoOptions[0][i].isEmpty()) { // displays data part
                        System.out.print(promoOptions[0][i] + ", ");
                    }

                    if (!promoOptions[1][i].isEmpty()) { // displays inclusions part
                        System.out.print(promoOptions[1][i] + ", ");
                    }

                    System.out.print(promoOptions[2][i] + " "); // displays validity part
                    System.out.println("for P" + promoOptions[3][i]); // displays price part
                }
                System.out.println("\t[4] Back");
                System.out.print("Enter choice: ");
                int promoChoice = scanner.nextInt();

                if (promoChoice >= 1 && promoChoice <= promoOptions[0].length) {
                    // stores the values in temporary variables to minimize method call argument length
                    String promoName = promoList[menuChoice - 1];
                    String dataAllocation = promoOptions[0][promoChoice - 1];
                    String callNTextInclusions = promoOptions[1][promoChoice - 1];
                    String validityInDays = promoOptions[2][promoChoice - 1];
                    int promoPrice = Integer.parseInt(promoOptions[3][promoChoice - 1]);
                    // if the user subscribes chooses a promo option, a confimation interface will be shown
                    subscriptionConfirmation(promoName, dataAllocation, callNTextInclusions, validityInDays, promoPrice);     
                }
                else if (promoChoice == 4) {
                    return;
                }
                else {
                    System.out.println("\n> Invalid Choice!");
                }
            } 
            catch (Exception e) {
                System.out.println("\n> Invalid input! Please enter a number.");
                scanner.nextLine(); // consumes leftover \n in input buffer
            }
        }
    }
    
    // method to show subscription confirmation interface
    public static void subscriptionConfirmation(String promo, String data, String inclusions, String days, int price) {
        
        while (true) {
            try {
                clearScreen();
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                // this part builds the sentence to display for the details of the promo option
                System.out.print("-> Get " + promo + " with ");

                if (!data.isEmpty()) {
                    System.out.print(data + " Data, ");
                }

                if (!inclusions.isEmpty()) {
                    System.out.print(inclusions + ", ");
                }

                if (!days.equals("No Expiry")) {
                    System.out.print("valid for " + days);
                }
                else {
                    System.out.print("No Expiry");
                }

                System.out.println(" for only P" + price + "!");

                System.out.println("\t[1] Subscribe");
                System.out.println("\t[2] Back");
                System.out.println("\t[3] Exit");
                System.out.print("Enter choice: ");
                int confirmationChoice = scanner.nextInt();

                switch(confirmationChoice) {
                    case 1:
                        if (loadBalance >= price) {
                            loadBalance -= price;
                            clearScreen();
                            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------");
                            System.out.print("> You are now registered to " + promo + " promo! Enjoy " + days + " of ");
                         
                            if (!data.isEmpty()) {
                                System.out.print(data + " Data");
                            }
                            
                            if (!data.isEmpty() && !inclusions.isEmpty()) {
                                System.out.print(" and ");
                            }

                            if (!inclusions.isEmpty()) {
                                System.out.print(inclusions);
                            }
     
                            checkBalance();
                            System.out.println("----------------------------------------------------------------------------------------------------------------------------");
                            // the user will be given a chance to choose another promo
                            postSubscriptionChoices();
                        }
                        else {
                            System.out.println("\n> You don't have enough load balance to subscribe to this promo!");
                        }
                    case 2:
                        return;
                    case 3:
                        System.out.println("\n> Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("\n> Invalid Choice!");
                        break;
                }
            } 
            catch (Exception e) {
                System.out.println("\n> Invalid input! Please enter a number.");
                scanner.nextLine(); // consumes leftover \n in input buffer
            }
        }
    }
    
    // method to guide user after subscription
    public static void postSubscriptionChoices() {
        
        scanner.nextLine(); // consumes leftover \n in input buffer
        
        while (true) {
            System.out.print("\nDo you want to choose a new promo ([y] Yes or [n] No)? ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("y") || input.equals("yes")) {
                mainMenu();
            }
            else if (input.equals("n") || input.equals("no")) {
                System.out.println("\n> Exiting...");
                System.exit(0);
            }
            else {
                System.out.println("\n> Invalid input! Please enter either y or n.");
            }
        }
    }
    
    // utility method to display balance
    public static void checkBalance() {
        System.out.println("\n> Your current load balance is: P" + loadBalance);
    }

    // utility method to clear screen in terminal
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
   
}
