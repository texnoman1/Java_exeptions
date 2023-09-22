import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnsupportedOperationException {
    public static void main(String[] args) {
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}
//Exception in thread "main" java.lang.UnsupportedOperationException