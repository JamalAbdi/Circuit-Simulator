package coe318.lab7;

public class Node {
   public int num_id;
   public static int after = 0; 
   
   public Node(){ 
        
        num_id = after;
        after++;
    }
   @Override
    public String toString(){   
        
        return ("" + this.num_id);
        
}
}
