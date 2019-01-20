package coe318.lab7;

import java.util.*;
public class UserMain implements UserInterface  {
   String input;

   private ArrayList<Circuit> circuit = new ArrayList<>();
   private static Scanner in = new Scanner(System.in);

    @Override
    public void start(){
        display();
        run();
}
    
    @Override
    public void run(){
       
       boolean run = true;
       while(run){
           
        input= in.nextLine();
     
        if (input.equals("end") || input.equals("END")) {
            end(); 
            break;
           }
      else if (input.equals("spice") || input.equals("SPICE")) {
              spice(); 
                    
            }
      else if (input.startsWith("v") || input.startsWith("V")){
                
                String delimitter = "[ ]+";
                String[] line = input.split(delimitter);
     
                Node n1 = new Node();
                n1.num_id = Integer.parseInt(line[1]);
                Node n2 = new Node();
                n2.num_id = Integer.parseInt(line[2]);
                Voltage vs = new Voltage(Double.parseDouble(line[3]) ,n1,n2);
                circuit.add(vs);
                
                
            } 
      else if(input.startsWith("r") || input.startsWith("R")){
                
                String delimitter = "[ ]+";
                String[] line = input.split(delimitter);
                                                 
                Node n1 = new Node();
                n1.num_id = Integer.parseInt(line[1]);
                Node n2 = new Node();
                n2.num_id = Integer.parseInt(line[2]);
                Resistor r = new Resistor(Double.parseDouble(line[3]),n1,n2);
                circuit.add(r);
                
            } else {
                
                System.out.println("Syntax ERror");
                System.out.println("Please enter 4 valid inputs");
}
       }
}
@Override
   public void display(){
      
     System.out.println("Describe your electric circuit");
   }

   @Override
   public void spice(){
       
       for(Circuit circ: circuit) {
           System.out.println(circ);
       }
   }
 
   @Override
   public void end(){
       
       System.out.println("Finished");
   }
   
    public static void main(String [] args){
        
       UserMain user = new UserMain();
       user.start();
    }
}

