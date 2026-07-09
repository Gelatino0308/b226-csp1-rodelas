
package com.joysistvi.loadreg.main;

import java.util.Scanner;


public class Main {
    
    static Scanner scanner = new Scanner(System.in);
    static double loadBalance = 100.0;
    static String[] promoList = {
        "ALL DATA", "ALL DATA+", "POWERALL", "MAGIC DATA", "MAGIC DATA+", 
        "UNLI 5G DATA", "SMART UCT", "ALLNET COMBOS", "MAGIC CALLS", "GIGA VIDEO"
    };
    
    public static void main(String[] args) {
        // clearScreen();
        validateUssdCode();
        
//        while(true) {
//            
//            // Exceptions Handling: trycatch statement
//            
//        }
    }
    
    public static void validateUssdCode() {
        System.out.println("Dial *123# to access Smart Services");
        System.out.print("Enter USSD Code: ");
        String ussdCode = scanner.nextLine();
        
        // validation
        if (ussdCode.isEmpty() || !ussdCode.equals("*123#")) {
            System.out.println("> Invalid USSD Code. Exiting...");
            System.exit(0); // Exit System
        }
        
        mainMenu();
    }
    
    public static void mainMenu() {
        
        while (true) {
            System.out.println("\n** Smart Load Registration **");
            for (int i = 0; i < promoList.length; i++) {
                System.out.println("\t[" + (i + 1) + "] " + promoList[i]);
            }
            System.out.println("\t[" + (promoList.length + 1) + "] Check Balance");
            System.out.println("\t[" + (promoList.length + 2) + "] Exit");
            System.out.print("Enter choice: ");
            int mainMenuChoice = scanner.nextInt();
            
            switch(mainMenuChoice) {
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
                        {"3 Days", "7 Days", "30 Days"}, // Days
                        {"50", "99", "299"} // Price
                    };
                    promoDetails(mainMenuChoice, gigaVideoOptions);
                    break;
                case 11:
                    checkBalance();
                    break;
                case 12:
                    System.out.println("> Exiting...");
                    System.exit(0);
                default:
                    System.out.println("> Invalid Choice!");
                    break;
            }
        }   
    }
    
    public static void promoDetails(int menuChoice, String[][] promoOptions) {
        
        while (true) {
            System.out.println("\n** Enjoy " + promoList[menuChoice - 1] + " Promo **");
            
            for (int i = 0; i < promoOptions[0].length; i++) {
                System.out.print("\t[" + (i + 1) + "] ");
              
                if (!promoOptions[0][i].isEmpty()) {
                    System.out.print(promoOptions[0][i] + ", ");
                }

                if (!promoOptions[1][i].isEmpty()) {
                    System.out.print(promoOptions[1][i] + ", ");
                }
                
                System.out.print(promoOptions[2][i] + " ");
                System.out.println("for P" + promoOptions[3][i]);
            }
            System.out.println("\t[4] Back");
            System.out.print("Enter choice: ");
            int promoChoice = scanner.nextInt();

            if (promoChoice >= 1 && promoChoice <= promoOptions[0].length) {
                String promoName = promoList[menuChoice - 1];
                String dataAllocation = promoOptions[0][promoChoice - 1];
                String callNTextInclusions = promoOptions[1][promoChoice - 1];
                String validityInDays = promoOptions[2][promoChoice - 1];
                int promoPrice = Integer.parseInt(promoOptions[3][promoChoice - 1]);
                
                subscriptionConfirmation(promoName, dataAllocation, callNTextInclusions, validityInDays, promoPrice);
            }
            else if (promoChoice == 4) {
                return;
            }
            else {
                System.out.println("> Invalid Choice!");
            }
        }
    }
    
    
    public static void subscriptionConfirmation(String promo, String data, String inclusions, String days, int price) {
        
        while (true) {
            System.out.print("\n-> Get " + promo + " with ");

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
                        System.out.println("> You are now registered to " + promo + " promo!");
                        checkBalance();
                    }
                    else {
                        System.out.println("> You don't have enough load balance to subscribe to this promo!");
                    }
                    System.exit(0);
                case 2:
                    return;
                case 3:
                    System.out.println("> Exiting...");
                    System.exit(0);
                default:
                    System.out.println("> Invalid Choice!");
                    break;
            }
        }
    }
    
    public static void checkBalance() {
        System.out.println("> Your current load balance is: P" + loadBalance);
    }

    
}

//    public static void allDataPromo(int choice) {
//        
//        String[][] allDataOptions = {
//            {"2 GB", "6 GB", "24 GB"}, // Data
//            {"", "", ""}, // Inclusions
//            {"3 Days", "7 Days", "30 Days"}, // Days
//            {"50", "99", "299"} // Price
//        };
//        
//        while (true) {
//            System.out.println("\n** Enjoy " + promoList[choice - 1] + " Promo **");
//            
//            for (int i = 0; i < allDataOptions[0].length; i++) {
//                System.out.print("\t[" + (i + 1) + "] ");
//              
//                if (!allDataOptions[0][i].equals("0")) {
//                    System.out.print(allDataOptions[0][i] + ", ");
//                }
//
//                if (!allDataOptions[1][i].isEmpty()) {
//                    System.out.print(allDataOptions[1][i] + ", ");
//                }
//
//                if (!allDataOptions[2][i].equals("No Expiration")) {
//                    System.out.print(allDataOptions[2][i] + " ");
//                }
//                else {
//                    System.out.print("No Expiration ");
//                }
//
//                System.out.println("for P" + allDataOptions[3][i]);
//            }
//            System.out.println("\t[4] Back");
//            System.out.print("Enter choice: ");
//            int allDataPromoChoice = scanner.nextInt();
//
//            if (allDataPromoChoice >= 1 && allDataPromoChoice <= allDataOptions[0].length) {
//                String promoName = promoList[choice - 1];
//                String dataAllocation = allDataOptions[0][allDataPromoChoice - 1];
//                String callTextInclusions = allDataOptions[1][allDataPromoChoice - 1];
//                String validityInDays = allDataOptions[2][allDataPromoChoice - 1];
//                int promoPrice = Integer.parseInt(allDataOptions[3][allDataPromoChoice - 1]);
//                
//                subscriptionConfirmation(promoName, dataAllocation, callTextInclusions, validityInDays, promoPrice);
//            }
//            else if (allDataPromoChoice == 4) {
//                return;
//            }
//            else {
//                System.out.println("> Invalid Choice!");
//            }
//        }
//    }
//    
//    public static void allDataPlusPromo(int choice) {
//        
//        String[][] allDataPlusOptions = {
//            {"3 GB", "6 GB", "24 GB"}, // Data
//            {"Unli All-Net Calls & Texts", "Unli All-Net Calls & Texts", "Unli All-Net Calls & Texts"}, // Inclusions
//            {"3 Days", "7 Days", "30 Days"}, // Days
//            {"75", "149", "499"} // Price
//        };
//        
//        while (true) {
//            System.out.println("\n** Enjoy " + promoList[choice - 1] + " Promo **");
//            
//            for (int i = 0; i < allDataPlusOptions[0].length; i++) {
//                System.out.print("\t[" + (i + 1) + "] ");
//              
//                if (!allDataPlusOptions[0][i].equals("0")) {
//                    System.out.print(allDataPlusOptions[0][i] + ", ");
//                }
//
//                if (!allDataPlusOptions[1][i].isEmpty()) {
//                    System.out.print(allDataPlusOptions[1][i] + ", ");
//                }
//
//                if (!allDataPlusOptions[2][i].equals("No Expiration")) {
//                    System.out.print(allDataPlusOptions[2][i] + " ");
//                }
//                else {
//                    System.out.print("No Expiration ");
//                }
//
//                System.out.println("for P" + allDataPlusOptions[3][i]);
//            }
//            System.out.println("\t[4] Back");
//            System.out.print("Enter choice: ");
//            int allDataPromoChoice = scanner.nextInt();
//
//            if (allDataPromoChoice >= 1 && allDataPromoChoice <= allDataPlusOptions[0].length) {
//                String promoName = promoList[choice - 1];
//                String dataAllocation = allDataPlusOptions[0][allDataPromoChoice - 1];
//                String callTextInclusions = allDataPlusOptions[1][allDataPromoChoice - 1];
//                String validityInDays = allDataPlusOptions[2][allDataPromoChoice - 1];
//                int promoPrice = Integer.parseInt(allDataPlusOptions[3][allDataPromoChoice - 1]);
//                
//                subscriptionConfirmation(promoName, dataAllocation, callTextInclusions, validityInDays, promoPrice);
//            }
//            else if (allDataPromoChoice == 4) {
//                return;
//            }
//            else {
//                System.out.println("> Invalid Choice!");
//            }
//        }
//    }
//    
//    public static void unliCallNTextPromo() {
//        System.out.println("** Enjoy Unli Call N Text Promo **");
//    }
