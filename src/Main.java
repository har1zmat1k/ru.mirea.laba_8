import ru.mirea.laba_8.BoundedWaitList;
import ru.mirea.laba_8.UnfairWaitList;

public class Main {
    public static void main(String[] args) {
        BoundedWaitList a = new BoundedWaitList(10);
        a.add(1);
    }
}
