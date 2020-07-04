package android.support.p022v4.content;

import android.content.Context;
import android.os.Process;
import android.support.p022v4.app.C0600d;

/* renamed from: android.support.v4.content.f */
public final class C0692f {
    /* renamed from: a */
    public static int m2946a(Context context, String str) {
        return m2947a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    private static int m2947a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0600d.m2491a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (C0600d.m2490a(context, a, str2) != 0) {
            return -2;
        }
        return 0;
    }
}
