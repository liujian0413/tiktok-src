package kotlin.p1884io;

import java.io.Closeable;
import kotlin.C47885a;

/* renamed from: kotlin.io.b */
public final class C47973b {
    /* renamed from: a */
    public static final void m148917a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C47885a.m148820a(th, th2);
            }
        }
    }
}
