/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

/**
 *
 * @author Mac
 */
public class Voltage extends Circuit{
   
    public double voltage;
    public int vol_number;
    private static int vol_number2 = 1 ;
    public Node node1,node2;
    
    public Voltage(double voltage, Node nod1, Node nod2) {
    this.voltage = voltage ;
    this.node1 = nod1;
    this.node2 = nod2;
    vol_number = vol_number2;
    vol_number2++;
    
}
    public Node [] getnodes(){
        Node [] node = new Node[2];
        node[0] = node1;
        node[1] = node2;
        return node;
       }
     public boolean negative(){
        
        Node [] nodes = getnodes();
        return (nodes[0].num_id > nodes[1].num_id);
        
    }
     @Override
    public String toString(){
        
        Node [] nodearray = getnodes();
        
        if (negative()){
            
        return("V" + vol_number + " " + nodearray[1] + " " + nodearray[0] + " DC " + -(this.voltage)); 
        
        } else {
            
          return("V" + vol_number + " " + nodearray[0] + " " + nodearray[1] + " DC " + this.voltage); 
        }   
    }
    }


