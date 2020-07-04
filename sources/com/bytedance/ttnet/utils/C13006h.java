package com.bytedance.ttnet.utils;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ttnet.hostmonitor.Logger;
import java.util.List;

/* renamed from: com.bytedance.ttnet.utils.h */
public final class C13006h {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m37953a(java.lang.Throwable r3) {
        /*
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ Throwable -> 0x0032, all -> 0x002a }
            r1.<init>()     // Catch:{ Throwable -> 0x0032, all -> 0x002a }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Throwable -> 0x0032, all -> 0x002a }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0032, all -> 0x002a }
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20180a(r3, r2)     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            if (r3 == 0) goto L_0x0020
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20180a(r3, r2)     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            if (r3 == 0) goto L_0x0020
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20180a(r3, r2)     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
        L_0x0020:
            java.lang.String r3 = r1.toString()     // Catch:{ Throwable -> 0x0033, all -> 0x0028 }
            r2.close()
            goto L_0x0039
        L_0x0028:
            r3 = move-exception
            goto L_0x002c
        L_0x002a:
            r3 = move-exception
            r2 = r0
        L_0x002c:
            if (r2 == 0) goto L_0x0031
            r2.close()
        L_0x0031:
            throw r3
        L_0x0032:
            r2 = r0
        L_0x0033:
            if (r2 == 0) goto L_0x0038
            r2.close()
        L_0x0038:
            r3 = r0
        L_0x0039:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.C13006h.m37953a(java.lang.Throwable):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m37955a(String str, List<String> list) {
        if (C6319n.m19593a(str) || C6311g.m19573a(list)) {
            return false;
        }
        for (String str2 : list) {
            if (!C6319n.m19593a(str2) && str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m37954a(Context context, Class<? extends BroadcastReceiver> cls, boolean z) {
        int i;
        String str;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        String str2 = "TtnetUtil";
        try {
            StringBuilder sb = new StringBuilder();
            if (z) {
                str = "enabling";
            } else {
                str = "disabling";
            }
            sb.append(str);
            sb.append(" connectivity receiver");
            Logger.m37870c(str2, sb.toString());
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), i, 1);
        } catch (Throwable unused) {
        }
    }
}
