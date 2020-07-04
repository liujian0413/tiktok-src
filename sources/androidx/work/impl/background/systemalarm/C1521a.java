package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.C1544f;
import androidx.work.impl.p036b.C1496d;
import androidx.work.impl.p036b.C1497e;
import androidx.work.impl.utils.C1551a;
import com.C1642a;

/* renamed from: androidx.work.impl.background.systemalarm.a */
final class C1521a {
    /* renamed from: a */
    public static void m7513a(Context context, C1544f fVar, String str) {
        C1497e l = fVar.f5836c.mo6700l();
        C1496d a = l.mo6750a(str);
        if (a != null) {
            m7515a(context, str, a.f5727b);
            C1642a.m8034a("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str});
            l.mo6752b(str);
        }
    }

    /* renamed from: a */
    private static void m7515a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1522b.m7522b(context, str), 536870912);
        if (service != null && alarmManager != null) {
            C1642a.m8034a("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)});
            alarmManager.cancel(service);
        }
    }

    /* renamed from: a */
    public static void m7514a(Context context, C1544f fVar, String str, long j) {
        C1497e l = fVar.f5836c.mo6700l();
        C1496d a = l.mo6750a(str);
        if (a != null) {
            m7515a(context, str, a.f5727b);
            m7516a(context, str, a.f5727b, j);
            return;
        }
        int a2 = new C1551a(context).mo6816a();
        l.mo6751a(new C1496d(str, a2));
        m7516a(context, str, a2, j);
    }

    /* renamed from: a */
    private static void m7516a(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1522b.m7522b(context, str), 1073741824);
        if (alarmManager != null) {
            if (VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, j, service);
                return;
            }
            alarmManager.set(0, j, service);
        }
    }
}
