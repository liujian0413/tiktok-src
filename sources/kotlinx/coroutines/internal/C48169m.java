package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48116bs;

/* renamed from: kotlinx.coroutines.internal.m */
public final class C48169m {

    /* renamed from: a */
    public static final C48116bs f123029a = m149448a();

    /* renamed from: b */
    public static final C48169m f123030b = new C48169m();

    private C48169m() {
    }

    /* renamed from: a */
    private static C48116bs m149448a() {
        Object obj;
        Class<MainDispatcherFactory> cls = MainDispatcherFactory.class;
        try {
            ServiceLoader load = ServiceLoader.load(cls, cls.getClassLoader());
            C7573i.m23582a((Object) load, "ServiceLoader.load(clz, clz.classLoader)");
            List h = C7525m.m23516h((Iterable<? extends T>) load);
            Iterator it = h.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                int loadPriority = ((MainDispatcherFactory) obj).getLoadPriority();
                while (it.hasNext()) {
                    Object next = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        obj = next;
                        loadPriority = loadPriority2;
                    }
                }
            }
            MainDispatcherFactory mainDispatcherFactory = (MainDispatcherFactory) obj;
            if (mainDispatcherFactory != null) {
                C48116bs a = C48170n.m149449a(mainDispatcherFactory, h);
                if (a != null) {
                    return a;
                }
            }
            return new C48171o(null, null, 2, null);
        } catch (Throwable th) {
            return new C48171o(th, null, 2, null);
        }
    }
}
