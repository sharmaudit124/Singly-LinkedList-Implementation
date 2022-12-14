package myLinkedList;

import java.util.Iterator;
/*
* This is a Main class.
* Where you can run/test your Linked List using it's main Method.
* Make sure you have all the classes within same package
*/
public class MainLinkedList {

    public static void main(String[] args) {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.Insert(200);
        list.Insert(500);
        list.Insert(300);
        list.Insert(900);
        list.InsertAt(4, 800);
        list.Traverse();
        list.DeleteAt(0);
        list.Traverse();
        list.Traverse();
		
        System.out.println(list.Center());
		
        list.Traverse();
        System.out.println(list.contains(300));
        System.out.println(list.Size());
        list.Reverse();
       list.Traverse();
		
       for (Integer s : list)
           System.out.print(s +" ");
       System.out.println();

        LinkedListIterator itr = list.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
 	}		
}
