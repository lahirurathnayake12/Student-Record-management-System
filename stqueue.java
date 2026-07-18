 import java.util.LinkedList;
 import java.util.Queue;

 public class stqueue {
    private Queue<String> queue=new LinkedList<>();

    public void addtoqueue(int id, String name, String degree ){
         String studentInfo = "ID: " + id + " | Name: " + name + " | Degree: " + degree;
         queue.add(studentInfo);
         System.out.println( name + " added to the queue.");

    }

    public void servestudent(){
        if(queue.isEmpty()){
            System.out.println("No one in queue.");
        }else{
            String served=queue.poll();
            String[] parts=served.split(" \\| ");
            String name=parts[1].replace("Name: ","");
            System.out.println("\nServing completed for  " +name);
        }
    }
   


}
