public class stlinkedlist {
    private student head=null;
    public void addstudent(int id , String name , double gpa , int age , String school , String degree , double zscore , int rank){
        student newstudent = new student(id,name,gpa,age,school,degree,zscore,rank);

        if(head==null){
            head=newstudent;}
            else{
                student temp=head;
                while(temp.next !=null){
                    temp=temp.next;
                }
                temp.next=newstudent;
                }
                System.out.println( name + " successfully added.");
            }
            public void displaystudents(){
                if(head==null){
                    System.out.println("\n No student added");
                    return;
                }
                student temp=head;
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");
                while(temp !=null){
                    System.out.println("====================================\n           Student Details\n====================================\nID:"+temp.id+"\nNAME:"+temp.name+"\nGPA:"+temp.gpa+"\nAGE:"+temp.age+"\nSCHOOL:"+temp.school+"\nDEGREE:"+temp.degree+"\nZSCORE:"+temp.zscore+"\nRANK:"+temp.rank+"\n====================================");
                    temp=temp.next;
                }
                System.out.println("");
            }
               public void deletestudent(int id) {
        if (head == null) {
            System.out.println("\n Empty list.");
            return;
        }
        if (head.id == id) {
            System.out.println( head.name + " removed.");
            head = head.next; 
            return;
        }

        student temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }


        if (temp.next == null) {
            System.out.println("\n cant find the student.");
        } else {
            
            System.out.println("\n " + temp.next.name + " removing successed.");
            temp.next = temp.next.next;
        }
    }

     public void searchstudent(int id) {
        if (head == null) {
            System.out.println("\n empty list");
            return;
        }

        student temp = head;
        boolean found = false;



        while (temp != null) {
            if (temp.id == id) {
               
                System.out.println("\n====================================");
                System.out.println("          STUDENT FOUND!");
                System.out.println("====================================");
                System.out.println("ID: " + temp.id);
                System.out.println("Name: " + temp.name);
                System.out.println("GPA: " + temp.gpa);
                System.out.println("Age: " + temp.age);
                System.out.println("School: " + temp.school);
                System.out.println("Degree: " + temp.degree);
                System.out.println("Z-Score: " + temp.zscore);
                System.out.println("Rank: " + temp.rank);
                System.out.println("====================================");
                found = true;
                break; 
            }
            temp = temp.next; 
        }

       
        if (!found) {
            System.out.println("\n Sorry" + id +" was not found.");
        }
    }

}
    
