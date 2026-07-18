import java.util.Stack;
public class actstack {
    private Stack<String> actions=new Stack<>();

    public void logaction(String actiondescription){
        actions.push(actiondescription);
    }
    
    public void undoAction(){
        if(actions.isEmpty()){
            System.out.println("\nNo process for undo.");
        }
        else{
            String undone=actions.pop();
            System.out.println("\nundo:"+undone);
        }
    }
}
