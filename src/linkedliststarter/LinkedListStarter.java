/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class LinkedListStarter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("running");
        // This is a shared space for you to do some testing  It will also likely be the source of lots of conflicts if you're not careful.
        SinglyLinkedList sli1 = new SinglyLinkedList();
        sli1.add("debug1");
        sli1.add("debug2");
        sli1.add("debug3");
        sli1.add("debug4");
        sli1.add("debug5");
        System.out.println(sli1.size());
        System.out.println("finish");
    }
    
}
