/**My words and actions will reflect Academic Integrity. 
I will not cheat or lie or steal in academic matters. 
I will promote integrity in the UNCG community. 
Student’s Signature Kanika Sun Date 04/01/2023 
**/

// Kanika Sun
// Test #2
// CSC 230 Sec #1

package test2spring2023;

import java.util.LinkedList;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Test2Spring2023 {

// add values to first list method
    public static void fillList(List array1) {
        
        array1.add(25);
        array1.add(54);
        array1.add(61);
        array1.add(63);
        array1.add(70);
        array1.add(74);
        array1.add(84);
        array1.add(92);
        array1.add(93);
        
    }
    
    // print list method
    public static void print(List<?> array) {
        
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
    
    // read the second array list 
    public static void readSecondList(List array2) {
        
        try {
            File file = new File("secondArray.txt");
            List<Integer> newArray = new ArrayList<>();
            
            Scanner input = new Scanner(file);
            String read = "";
            
            while (input.hasNext()) 
                read = input.nextLine();
                System.out.println(read);
                
                input.close();
             } 
        catch (FileNotFoundException ex) {
        }
    
        
        
    }
    
    // compare first and second list method
    public static boolean compareLists(List array1, List array2) {
        
        if (array1.equals(array2)) {
        return true;
        } else {
            return false;
        }
        
    }
    
    // add values to first list method
    public static void addToList(List array1) {
        array1.add(0, 10);
        array1.add(3, 30);
        array1.add(7, 67);
        array1.add(12, 98);
        
    }
    
    // remove values from first array method
    public static void removeFromList(List array1) {
        array1.remove(5);
        array1.remove(7);

    }
    
    // print first list backwards method
    public static void printListBackwards(Object linkedList, Object listIterator) {
        Collections.reverse((List<?>) linkedList);
         
        System.out.println(linkedList.toString());
    }
    
    public static void main(String[] args) {
        
        System.out.println("\nKanika Sun");
        System.out.println("Test #2");
        System.out.println("CSC 230 Sec 1");
        
        System.out.println("\nThis program works with ArrayLists, LinkedLists, a ListIterator, and Queues .\n" +
"The program is method-based.\n" +
"The methods are:\n" +
" fillList() which is used to fill the first ArrayList with Integers.\n" +
" print() which is a generic method that will print any type of list.\n" +
" readSecondist() which will read in a list of whole numbers into the second ArrayList.\n" +
" compareLists() which will compare the two lists and return true if they are equal or false if they are to.\n" +
" addToList() which will add four numbers to the 1st list.\n" +
" removeFromList() which will remove two numbers from the 1st list.\n" +
" printListBackwards() which will print the LinkedList backwards.");
        
        // create list objects
        List<Integer> firstArray = new ArrayList<Integer>();
        List<Integer> secondArray = new ArrayList<Integer>();

        // call fill list method and print first array list
        fillList(firstArray);
        
        System.out.print("\nThe first array is: ");
        print(firstArray);
        
        // print second array list
        System.out.print("\nThe second array is: ");
        readSecondList(secondArray);
          
        // compare first and second array list
        if (compareLists(firstArray, secondArray) == true) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }
        
        // call addToList() method and print new list
        addToList(firstArray);
        System.out.print("\nThe list with added numbers is: ");
        print(firstArray);
        
        System.out.println("");
        
        // call removeFromList() method and print new list
        removeFromList(firstArray);
        System.out.print("\nThe list with removed numbers is: ");
        print(firstArray);
        
        System.out.println("");
        
        // linked list and list iterator creation
        List linked = new LinkedList(firstArray);
        ListIterator<Integer> iterator = firstArray.listIterator();
        LinkedList<Object> queue = new LinkedList<Object>(firstArray);
        
        System.out.println("");
        
        // printing the list backwards
        System.out.print("Display the linked list backwards: ");
        printListBackwards(linked, iterator);
        
        System.out.println("");
        
        // print first element in list
        System.out.println("The 1st element is: " + queue.peek());
        
        System.out.println("");
        
        // remove first element in list and print the new one
        queue.remove();
        System.out.println("After removing an element, now the 1st element is: " + queue.peek());
        
        
    }
    
}
