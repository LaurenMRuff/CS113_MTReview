public class MainClass {
    public static void main(String[] args) {

        //region L4CodeDoubleLinkedList
        L4CodeDoubleLinkedList<Integer> myList = new L4CodeDoubleLinkedList<>();
        System.out.println("\nDouble Linked List : ");
        for(int i = 0; i < 5; i++){
            myList.addLast(i);
        }

        myList.addFirst(5);

        for(Integer I : myList){
            System.out.println(I);
        }

        System.out.println(myList.get(3));

        for(Integer I : myList){
            System.out.println(I);
        }

        //endregion L4CodeDoubleLinkedList

        //region L5CodeRecursion
        L5CodeRecursion case1 = new L5CodeRecursion();
        L5CodeRecursion case2 = new L5CodeRecursion();
        L5CodeRecursion case3 = new L5CodeRecursion();
        L5CodeRecursion case4 = new L5CodeRecursion();

        System.out.println("\nRecursion : ");
        System.out.println(case1.recursiveFactorial(4));
        System.out.println(case1.iterativeFactorial(4));

        System.out.println(case2.recursivePower(5, 3));
        System.out.println(case2.iterativePower(5, 3));

        System.out.println(case3.recursiveGCD(220, 36));
        System.out.println(case3.iterativeGCD(220, 36));

        System.out.println(case4.recursiveFibStart(5));
        System.out.println(case4.iterativeFibStart(5));

        //endregion L5CodeRecursion
    }
}
