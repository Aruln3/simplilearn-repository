package projectVirtualKey;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MyProject {

	     File handledFiles;
	     public  MyProject() {
	     	 handledFiles = new File("C://Users//hp//Desktop");
	         if (!handledFiles.exists())
	         System.out.println("MyFilePath : "+ handledFiles.getAbsolutePath());
	     }
	
	    public static final String Main_Menu_TAB =
	    		 "-----------------------------------------\n"+
	             "MAIN MENU :\n" + "Select any of the following by it's option (1, 2, 3)\n"+
	                     "  1)List the files\n"+
	                     "  2)Add, Remove or Search the files\n"+
	                     "  3)Exit\n";
	    public static final String HANDLING_FILES  =
	    		"-----------------------------------------\n"+
	            "Select any of the following by it's option (1, 2, 3, 4)\n"+
	                     "  1)Add a file\n"+
	                     "  2)Remove a file\n"+
	                     "  3)Search a file\n"+
	                     "  4)GoBack\n";

	     void mainPage() {
	         System.out.println(Main_Menu_TAB);
	         try(Scanner scanner = new Scanner(System.in)){
	             int option = scanner.nextInt();
	             switch (option){
	             case 1 : {
	                  showListOfFiles();
	                     mainPage();
	                      }
	             case 2 : {
	                     toolPage();
	                      }
	             case 3 : {
	                     System.out.println("Thank You Visiting LockedMe.com");
	                     System.exit(0);
	                      }
	             default: mainPage();
	                      }
	               }
	             catch (Exception e){
	             System.out.println("Please enter 1, 2 or 3");
	             mainPage();
	          }
	        }
	        
	     void toolPage() {
	         System.out.println(HANDLING_FILES );
	         try(Scanner scanner = new Scanner(System.in))
	         {
	             char[] input = scanner.nextLine().toLowerCase().trim().toCharArray();
	             char logic = input[0];
	             switch (logic){
	                 case '1' : {
	                     System.out.print("\nName of the file that you want to Add : ");
	                     String filename = scanner.next().trim().toLowerCase();
	                     addFileMethod(filename);
	                     break;
	                            }
	                 case '2' : {
	                     System.out.print("\nName of the file that you want to Remove : ");
	                     String filename = scanner.next().trim();
	                     deleteFileMethod(filename);
	                     break;
	                            }
	                 case '3' : {
	                     System.out.print("\nName of the file that you Searching for : ");
	                     String filename = scanner.next().trim();
	                     searchFileMethod(filename);
	                     break;
	                            }
	                 case '4' : {
	                     System.out.println("\nBack to Main Menu\n");
	                     mainPage();
	                     break;
	                            }
	                 default : System.out.println("\nFile not found, Please enter correct values");
	             }
	             toolPage();
	         }
	         catch (Exception e){
	             System.out.println("Please enter correct values");
	             toolPage();
	         }
	     }

	   void showListOfFiles() {
        if (handledFiles.list().length==0)
        	 System.out.println("The is Folder not found or Empty ");
	         else {
	             String[] list = handledFiles.list();
	             System.out.println("The files in "+ handledFiles +" are :");
	             Arrays.sort(list);
	             for (String str:list) {
	                 System.out.println(str);
	             }
	         }
	     }

	   void addFileMethod(String filename) throws IOException {
	         File filepath = new File(handledFiles +"/"+filename);
	         String[] list = handledFiles.list();
	         for (String file: list) {
	             if (filename.equalsIgnoreCase(file)) {
	                 System.out.println("File " + filename + " already exists at " + handledFiles);
	                 return;
	             }
	         }
	         filepath.createNewFile();
	         System.out.println("File "+filename+" added to "+ handledFiles);
	     }

	   void deleteFileMethod(String filename) {
	        File filepath = new File(handledFiles +"/"+filename);
	        String[] list = handledFiles.list();
	        for (String file: list) {
	        if (filename.equals(file) && filepath.delete()) {
                   System.out.println("File " + filename + " deleted from " + handledFiles);
                   return;
               }
	         }
	         System.out.println("File not found");
	        }

	   void searchFileMethod(String filename) {
	         String[] list = handledFiles.list();
	         for (String file: list) {
             if (filename.equals(file)) {
	                System.out.println("FOUND : File " + filename + " exists at " + handledFiles);
	                return;
	           }
	          }
	         System.out.println("File not found");
	        }
	
      public static void main(String[] args) {
		     System.out.println("Welcome To Lockers Pvt. Ltd.");
	         MyProject menu = new  MyProject();
	         menu.mainPage();
	     }
}
