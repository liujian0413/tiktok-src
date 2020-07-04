package android.support.p022v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

/* renamed from: android.support.v4.content.WakefulBroadcastReceiver */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<WakeLock> f2623a = new SparseArray<>();

    /* renamed from: b */
    private static int f2624b = 1;

    /* renamed from: a */
    public static boolean m2900a(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f2623a) {
            WakeLock wakeLock = (WakeLock) f2623a.get(intExtra);
            if (wakeLock == null) {
                return true;
            }
            wakeLock.release();
            f2623a.remove(intExtra);
            return true;
        }
    }

    /* renamed from: a_ */
    public static ComponentName m2901a_(Context context, Intent intent) {
        synchronized (f2623a) {
            int i = f2624b;
            int i2 = f2624b + 1;
            f2624b = i2;
            if (i2 <= 0) {
                f2624b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f2623a.put(i, newWakeLock);
            return startService;
        }
    }
}
