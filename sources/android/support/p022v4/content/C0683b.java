package android.support.p022v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

/* renamed from: android.support.v4.content.b */
public class C0683b {

    /* renamed from: a */
    private static final Object f2625a = new Object();

    /* renamed from: b */
    private static TypedValue f2626b;

    protected C0683b() {
    }

    /* renamed from: d */
    public static boolean m2914d(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m2904a(java.io.File r2) {
        /*
            java.lang.Class<android.support.v4.content.b> r0 = android.support.p022v4.content.C0683b.class
            monitor-enter(r0)
            boolean r1 = r2.exists()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            boolean r1 = r2.mkdirs()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            boolean r1 = r2.exists()     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r2
        L_0x0017:
            r2 = 0
            monitor-exit(r0)
            return r2
        L_0x001a:
            monitor-exit(r0)
            return r2
        L_0x001c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.content.C0683b.m2904a(java.io.File):java.io.File");
    }

    /* renamed from: c */
    public static File m2913c(Context context) {
        if (VERSION.SDK_INT >= 21) {
            return context.getCodeCacheDir();
        }
        return m2904a(new File(context.getApplicationInfo().dataDir, "code_cache"));
    }

    /* renamed from: b */
    public static File m2911b(Context context) {
        if (VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return m2904a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    /* renamed from: a */
    public static File[] m2907a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    /* renamed from: b */
    public static int m2909b(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: c */
    public static int m2912c(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    /* renamed from: b */
    public static ColorStateList m2910b(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    /* renamed from: a */
    public static Drawable m2903a(Context context, int i) {
        int i2;
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f2625a) {
            if (f2626b == null) {
                f2626b = new TypedValue();
            }
            context.getResources().getValue(i, f2626b, true);
            i2 = f2626b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* renamed from: a */
    public static File[] m2908a(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(null);
        }
        return new File[]{context.getExternalFilesDir(null)};
    }

    /* renamed from: a */
    public static void m2905a(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static boolean m2906a(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }
}
