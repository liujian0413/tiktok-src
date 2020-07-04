package androidx.work.impl.utils;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

/* renamed from: androidx.work.impl.utils.f */
public final class C1574f {
    /* renamed from: a */
    public static WakeLock m7666a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        StringBuilder sb = new StringBuilder("WorkManager: ");
        sb.append(str);
        return powerManager.newWakeLock(1, sb.toString());
    }
}
