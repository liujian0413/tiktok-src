package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.impl.C1544f;
import java.util.concurrent.TimeUnit;

public final class ForceStopRunnable implements Runnable {

    /* renamed from: a */
    private static final long f5875a = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b */
    private final Context f5876b;

    /* renamed from: c */
    private final C1544f f5877c;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                if ("ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                    ForceStopRunnable.m7605a(context);
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m7608b() {
        return this.f5877c.f5840g.mo6847a();
    }

    /* renamed from: a */
    private boolean m7606a() {
        if (m7604a(this.f5876b, 536870912) != null) {
            return false;
        }
        m7605a(this.f5876b);
        return true;
    }

    public final void run() {
        if (m7608b()) {
            this.f5877c.mo6804e();
            this.f5877c.f5840g.mo6846a(false);
        } else if (m7606a()) {
            this.f5877c.mo6804e();
        }
        this.f5877c.mo6805f();
    }

    /* renamed from: b */
    private static Intent m7607b(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: a */
    static void m7605a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent a = m7604a(context, 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f5875a;
        if (alarmManager != null) {
            if (VERSION.SDK_INT >= 19) {
                alarmManager.setExact(0, currentTimeMillis, a);
                return;
            }
            alarmManager.set(0, currentTimeMillis, a);
        }
    }

    public ForceStopRunnable(Context context, C1544f fVar) {
        this.f5876b = context.getApplicationContext();
        this.f5877c = fVar;
    }

    /* renamed from: a */
    private static PendingIntent m7604a(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, m7607b(context), i);
    }
}
