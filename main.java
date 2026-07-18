
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       
        stlinkedlist  list = new stlinkedlist ();
        stqueue queue = new stqueue();
        actstack stack = new actstack();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("==================================================");
            System.out.println("              STUDENT RECORD SYSTEM               ");
            System.out.println("==================================================");
            System.out.println("1. Add Student.");
            System.out.println("2. View All Students.");
            System.out.println("3. Search Student."); 
            System.out.println("4. Add Student to Service Queue.");
            System.out.println("5. Serve Student.");
            System.out.println("6. Undo Last Action.");
            System.out.println("7. Remove Student.");
            System.out.println("8. Exit");
            System.out.println("=================================================");
            System.out.print("Enter your choice (1-8): ");
            int choice=scanner.nextInt();
            
            
        
            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter School: ");
                    String school = scanner.nextLine();

                    System.out.print("Enter Degree: ");
                    String degree = scanner.nextLine();

                    System.out.print("Enter Zscore: ");
                    double zscore = scanner.nextDouble();

                    System.out.print("Enter Rank: ");
                    int rank = scanner.nextInt();
                     scanner.nextLine();
                    
                    list.addstudent(id, name, gpa,age,school,degree,zscore,rank);
                    stack.logaction("Added Student: " + name); 
                    break;
                    
                case 2:
                    list.displaystudents();
                    break;
                    



                case 3:
                System.out.print("Enter Id for searching: ");
                int searchId = scanner.nextInt();
                scanner.nextLine(); 
                
                list.searchstudent(searchId); 
                break;
                
                

                case 4:
                System.out.println("\nAdd Student to Service Queue ");
                System.out.print("Enter Student ID: ");
                int qId = scanner.nextInt();
                scanner.nextLine(); // Clear buffer

                System.out.print("Enter Student Name: ");
                String qName = scanner.nextLine();

                System.out.print("Enter Student Degree: ");
                String qDegree = scanner.nextLine();

            
               queue.addtoqueue(qId, qName, qDegree);
                break;


                case 5:
                    queue.servestudent();
                    break;
                    
                case 6:
                    stack.undoAction();
                    break;
                    


                case 7:
                System.out.print("Enter id do you want to remove: ");
                int deleteId = scanner.nextInt();
                scanner.nextLine(); 
                
                list.deletestudent(deleteId);
                stack.logaction("Removed Student ID: " + deleteId);
                break;

                case 8:
                    System.out.println("\nEXIT");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\n[ERROR]: Invalid.");
            }
        }
    }
}
//1-use linked list
//2-use linked list
//use linked list search
//4use queue
//5use queue
//6use stack
//7use linked list