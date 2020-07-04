package com.facebook.appevents;

import android.preference.PreferenceManager;
import com.facebook.C13499h;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.appevents.b */
class C13120b {

    /* renamed from: a */
    public static ReentrantReadWriteLock f34755a = new ReentrantReadWriteLock();

    /* renamed from: b */
    public static String f34756b = null;

    /* renamed from: c */
    private static final String f34757c = "b";

    /* renamed from: d */
    private static volatile boolean f34758d = false;

    C13120b() {
    }

    /* renamed from: a */
    public static void m38368a() {
        if (!f34758d) {
            C13187j.m38543c().execute(new Runnable() {
                public final void run() {
                    C13120b.m38370c();
                }
            });
        }
    }

    /* renamed from: b */
    public static String m38369b() {
        if (!f34758d) {
            m38370c();
        }
        f34755a.readLock().lock();
        try {
            return f34756b;
        } finally {
            f34755a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public static void m38370c() {
        if (!f34758d) {
            f34755a.writeLock().lock();
            try {
                if (!f34758d) {
                    f34756b = PreferenceManager.getDefaultSharedPreferences(C13499h.m39721g()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    f34758d = true;
                    f34755a.writeLock().unlock();
                }
            } finally {
                f34755a.writeLock().unlock();
            }
        }
    }
}
