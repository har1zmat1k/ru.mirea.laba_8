import ru.mirea.laba_8.BoundedWaitList;
import ru.mirea.laba_8.UnfairWaitList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test BoundedWaitList\nSize = 10\n");
        BoundedWaitList<Integer> a = new BoundedWaitList<>(10);
        for(int i = 0; i < 11; ++i){
            a.add(i);
        }
        System.out.println(a.toString());
        System.out.println("Test UnfairWaitList\n");
        UnfairWaitList<Integer> b = new UnfairWaitList<>();
        for(int i = 1; i < 10; ++i){
            b.add(i);
        }
        b.remove(1);
        b.moveToBack(2);
        b.moveToBack(1);
        b.moveToBack(2);
        System.out.println(b.toString());
    }
}
