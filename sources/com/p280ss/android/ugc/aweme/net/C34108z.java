package com.p280ss.android.ugc.aweme.net;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.net.z */
public final class C34108z {

    /* renamed from: a */
    private static final Object f88875a = new Object();

    /* renamed from: b */
    private static int f88876b = 0;

    /* renamed from: a */
    private static void m109786a(StringBuilder sb) {
        sb.append(" Cronet/");
        sb.append("TTNetVersion:ec14aa9f 2019-12-27 QuicVersion:a93373c9 2019-11-29");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0019 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m109787b(android.content.Context r3) {
        /*
            java.lang.Object r0 = f88875a
            monitor-enter(r0)
            int r1 = f88876b     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x0021
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ all -> 0x0025 }
            r2 = 0
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x0019 }
            int r3 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x0019 }
            f88876b = r3     // Catch:{ NameNotFoundException -> 0x0019 }
            goto L_0x0021
        L_0x0019:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = "Cannot determine package version"
            r3.<init>(r1)     // Catch:{ all -> 0x0025 }
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x0021:
            int r3 = f88876b     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return r3
        L_0x0025:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.net.C34108z.m109787b(android.content.Context):int");
    }

    /* renamed from: a */
    public static String m109785a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append('/');
        sb.append(m109787b(context));
        sb.append(" (Linux; U; Android ");
        sb.append(VERSION.RELEASE);
        sb.append("; ");
        sb.append(Locale.getDefault().toString());
        String str = Build.MODEL;
        if (str.length() > 0) {
            sb.append("; ");
            sb.append(str);
        }
        String str2 = Build.ID;
        if (str2.length() > 0) {
            sb.append("; Build/");
            sb.append(str2);
        }
        sb.append(";");
        m109786a(sb);
        sb.append(')');
        return sb.toString();
    }
}
