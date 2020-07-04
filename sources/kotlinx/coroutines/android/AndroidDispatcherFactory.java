package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.internal.MainDispatcherFactory;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    public final int getLoadPriority() {
        return 1073741823;
    }

    public final String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    public final C48070b createDispatcher(List<? extends MainDispatcherFactory> list) {
        C7573i.m23587b(list, "allFactories");
        Looper mainLooper = Looper.getMainLooper();
        C7573i.m23582a((Object) mainLooper, "Looper.getMainLooper()");
        return new C48070b(C48075d.m149051a(mainLooper, true), "Main");
    }
}
