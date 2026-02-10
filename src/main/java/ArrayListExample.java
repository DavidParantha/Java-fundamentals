package org.edge.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        int [] nums = {56,45,879,5,6};
        ArrayList list = new ArrayList();
        list.add(56);
        list.add("hey");
        list.add(8.2);
        list.add(true);
        System.out.println(list);
        ArrayList<Integer> listOfNums = new ArrayList<>();
        listOfNums.add(56);
        listOfNums.add(45);
        listOfNums.add(879);
        listOfNums.add(5);
        System.out.println(listOfNums);

        listOfNums.remove(2);
        System.out.println(listOfNums);

        listOfNums.set(2,69);
        listOfNums.add(2, 699);
        System.out.println(listOfNums);

        for (int i = 0; i < listOfNums.size(); i++) {
            System.out.print(listOfNums.get(i) + " ");
        }
        System.out.println();

        // for each (removed modification inside loop)
        for (Integer num : listOfNums) {
            System.out.print(num + " ");
        }

        // using iterator
        Iterator<Integer> iterator = listOfNums.iterator();
//        while (iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }
        // removeLast() not in ArrayList
        listOfNums.remove(listOfNums.size() - 1);

        System.out.println("Stream");
        listOfNums.stream().filter(x -> x % 2 == 0).forEach(System.out::println);  //:: are used

        if (listOfNums.isEmpty()){
            System.out.println("Empty");
        }

        System.out.println(listOfNums);
        System.out.println(listOfNums.size() - 1);
        // getLast() and getFirst() not in ArrayList
        System.out.println(listOfNums.get(listOfNums.size() - 1));
        System.out.println(listOfNums.getFirst());
        System.out.println(listOfNums.getLast());
        listOfNums.clear();

        List<Integer> list2 = List.of(54,65,4,45);
        listOfNums.addAll(list2);
        System.out.println(listOfNums);

        listOfNums.clear();
    }
}
