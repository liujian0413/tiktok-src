package com.bytedance.common.p479c;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.common.c.d */
public final class C9692d {

    /* renamed from: a */
    static final C9694a f26429a;

    /* renamed from: com.bytedance.common.c.d$a */
    static class C9694a {
        private C9694a() {
        }

        /* renamed from: a */
        public void mo24057a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            if (alarmManager != null) {
                try {
                    alarmManager.set(i, j, pendingIntent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: com.bytedance.common.c.d$b */
    static class C9695b extends C9694a {
        private C9695b() {
            super();
        }

        /* renamed from: a */
        public final void mo24057a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
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
            f26429a = new C9695b();
        } else {
            f26429a = new C9694a();
        }
    }

    /* renamed from: a */
    public static void m28627a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        f26429a.mo24057a(alarmManager, i, j, pendingIntent);
    }
}
