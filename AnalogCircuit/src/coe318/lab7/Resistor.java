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
public class Resistor extends Circuit {
public double ressistance;
public int res_number;
private static int res_nubmer2 = 1 ;
private Node node1,node2;

public Resistor (double ressistance, Node node1, Node node2 ){
    this.ressistance = ressistance;
    this.node1 = node1;
    this.node2 = node2;
    this.res_number = res_nubmer2 ;
    res_number++;
   
    if (this.ressistance <0){
        throw new IllegalArgumentException("Resistance must be real");}
    if(node1 == null || node2 == null){
        throw new IllegalArgumentException("THE Nodes must exist");
    }
}
public Node [] getNodes() {
    Node [] nodes = {node1,node2};
    return nodes;
}
    
@Override
    public String toString() {//DO NOT MODIFY
        return ("R"+" "+ res_number +" "+ node1 + " " +  node2 +" "+ ressistance);
}
}

