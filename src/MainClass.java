public class MainClass {
    public static void main(String[] args) {
        L4CodeDoubleLinkedList<Integer> myList = new L4CodeDoubleLinkedList<>();

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

    }
}
