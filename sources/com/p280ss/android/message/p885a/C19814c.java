package com.p280ss.android.message.p885a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.message.a.c */
public final class C19814c {

    /* renamed from: a */
    static final C19816a f53773a;

    /* renamed from: com.ss.android.message.a.c$a */
    static class C19816a {
        private C19816a() {
        }

        /* renamed from: a */
        public void mo53163a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            if (alarmManager != null) {
                try {
                    alarmManager.set(i, j, pendingIntent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.message.a.c$b */
    static class C19817b extends C19816a {
        private C19817b() {
            super();
        }

        /* renamed from: a */
        public final void mo53163a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            if (alarmManager != null) {
                try {
                    alarmManager.setExact(i, j, pendingIntent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            f53773a = new C19817b();
        } else {
            f53773a = new C19816a();
        }
    }

    /* renamed from: a */
    public static void m65419a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        f53773a.mo53163a(alarmManager, i, j, pendingIntent);
    }
}
