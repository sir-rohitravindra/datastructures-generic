package MiscJava.DataStructures.LinkedList;

public class app {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.insert(1);
        linkedList.insert(22);
        linkedList.insert(333);
        System.out.println(linkedList);
        System.out.println(linkedList.getLength());
        // System.out.println(linkedList.printTailValue());

        System.out.println(linkedList);
        try {
            System.out.println(linkedList.get(1));
            System.out.println(linkedList.get(0));
            System.out.println(linkedList.get(17));
        } catch (Exception e) {
            System.err.println(e);
        }

        try {
            linkedList.set(1, 2022);
            System.out.println(linkedList);
        } catch (Exception e) {

        }
        // linkedList.deleteEnd();
        // // System.out.println(linkedList.printTailValue());

        // linkedList.getLength();
        // linkedList.deleteEnd();
        // // linkedList.printTailValue();
        // linkedList.deleteEnd();
        // System.out.println(linkedList);
        // System.out.println(linkedList.getLength());
    }

}
