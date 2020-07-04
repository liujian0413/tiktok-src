package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48116bs;

/* renamed from: kotlinx.coroutines.internal.n */
public final class C48170n {
    /* renamed from: a */
    public static final C48116bs m149449a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        C7573i.m23587b(mainDispatcherFactory, "receiver$0");
        C7573i.m23587b(list, "factories");
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return new C48171o(th, mainDispatcherFactory.hintOnError());
        }
    }
}
