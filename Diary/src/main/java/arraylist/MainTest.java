package arraylist;

public class MainTest {
    public static void main(String[] args) {
        MyList<Integer> list = MyList.ofInt(1, 1, 3, 4, 5);
        System.out.println(list.get(0).getClass());
        System.out.println(list.get(1).getClass());
        System.out.println(list.get(2).getClass());
        System.out.println(list.get(3).getClass());
        System.out.println(list.length());
        System.out.println(list.indexOf(3));
        list.add(3);
        list.removeByValue(4);
        list.removeByValue(1);
        System.out.println(list);
    }

}
