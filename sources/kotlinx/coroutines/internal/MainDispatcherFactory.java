package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C48116bs;

public interface MainDispatcherFactory {
    C48116bs createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
