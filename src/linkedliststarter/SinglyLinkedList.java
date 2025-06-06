/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedliststarter;

/**
 *
 * @author michael.roy-diclemen
 */
public class SinglyLinkedList implements ILinkedList{
    private Node head;
    private Node tail;

    /**
     * Return the size of the Linked List
     * @return an int representing the size
     */
    //matthew
    @Override
    public int size() {
        int counter = 0;
        Node curr = head;
        //while current has a value
        while (curr != null){
            counter++;
            curr = curr.getNext();
        }
        return counter;
    }

    /**
     * Reset / Empty the LinkedList
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Remove the first instance of item from the linked list
     * @param item The item to be removed
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(Data item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Remove the item from the particular index
     * @param index The index of the item to remove
     * @return true: if the item was found and removed
     *         false otherwise
     */
    @Override
    public boolean remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Returns the first found index of the given item
     * @param item The item to find
     * @return The index of the found item, or -1
     */
    @Override
    public int indexOf(Data item) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /**
     * Retrieves the Data at the given index
     * @param index The index to be retrieved
     * @return The data item, null if bad index
     */
    
    //matthew
    @Override
    public Data get(int index) {
        Data indexData;
        if (index < 0){
            return null;
        }
        Node curr = head;
        int counter = 0; 
        
        //while nodes have not reached end
        while (curr != null){
            //if index is reached
            if (counter == index){
                return curr.getData();
            }
            //else go up by one
            curr = curr.getNext();
            //increase counter
            counter++;
        }
        
        //when out of range i think?
        return null;
    }

    /**
     * Add the gen item to the end of the linked list
     * @param item Item to add
     * @return true if successfuuly added, false otherwise
     */
    
    //matthew
    @Override
    public boolean add(String item) {
        Data title = new Data(item);
        Node newNode = new Node(title);
        
        if (item == null){
            return false;
        }
        
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        
        
        int endIndex = size() - 1;
        Node curr = head;
        //go to end node
        for (int i = 0; i < endIndex; i++){
            curr = curr.getNext();
        }
        curr.setNext(newNode);
        tail = newNode;
        return true;
    }

    /**
     * Add the gen item to  the linked list at the given position
     * @param item Item to add
     * @param index The position to add the item
     * @return true if successfuuly added, false otherwise
     */
    
    //matthew
    @Override
    public boolean add(String item, int index) {
        if (item == null || index < 0) {
            return false;
        }
        
        Data title = new Data(item);
        Node newNode = new Node(title);
        
        
        
        //check if start
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
            //if list was empty
            if (tail == null) {
                tail = newNode; 
            }
            return true;
        }
        
        //else go to node
        Node curr = head;
        for (int i = 0; i < index - 1; i++) {
            curr = curr.getNext();
        }
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
        
        //if obj was last, update it
        if (newNode.getNext() == null) {
            tail = newNode;
        }   
        
        return true;
    }
    
}
