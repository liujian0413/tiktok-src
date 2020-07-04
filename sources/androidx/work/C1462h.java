package androidx.work;

import android.content.Context;
import androidx.work.impl.C1544f;

/* renamed from: androidx.work.h */
public abstract class C1462h {
    protected C1462h() {
    }

    /* renamed from: a */
    public static C1462h m7331a() {
        return C1463i.m7334a();
    }

    /* renamed from: b */
    public static C1462h m7333b() {
        C1544f c = C1544f.m7577c();
        if (c != null) {
            return c;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }

    /* renamed from: a */
    public static void m7332a(Context context, C1451a aVar) {
        C1544f.m7576b(context, aVar);
    }
}
