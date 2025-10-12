public class Program {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addAtEnd(-1);
        list.addAtStart(21);
        list.addAtStart(60);
        list.addAtStart(80);
        list.addAtStart(90);
        list.addAtEnd(1);
        list.addAtEnd(10);
        list.addAtEnd(15);

        System.out.println(list);
    }
}
