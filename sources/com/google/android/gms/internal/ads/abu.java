package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;

@C6505uv
public final class abu {

    /* renamed from: a */
    int f39943a = -1;

    /* renamed from: b */
    private long f39944b = -1;

    /* renamed from: c */
    private long f39945c = -1;

    /* renamed from: d */
    private int f39946d = -1;

    /* renamed from: e */
    private long f39947e;

    /* renamed from: f */
    private final Object f39948f = new Object();

    /* renamed from: g */
    private final String f39949g;

    /* renamed from: h */
    private final acf f39950h;

    /* renamed from: i */
    private int f39951i = 0;

    /* renamed from: j */
    private int f39952j = 0;

    public abu(String str, acf acf) {
        this.f39949g = str;
        this.f39950h = acf;
    }

    /* renamed from: a */
    public final void mo39109a() {
        synchronized (this.f39948f) {
            this.f39951i++;
        }
    }

    /* renamed from: b */
    public final void mo39111b() {
        synchronized (this.f39948f) {
            this.f39952j++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39110a(com.google.android.gms.internal.ads.zzyv r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f39948f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.acf r1 = r10.f39950h     // Catch:{ all -> 0x007c }
            long r1 = r1.mo39158j()     // Catch:{ all -> 0x007c }
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.C14793ay.m42901g()     // Catch:{ all -> 0x007c }
            long r3 = r3.mo38684a()     // Catch:{ all -> 0x007c }
            long r5 = r10.f39945c     // Catch:{ all -> 0x007c }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0042
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.bl<java.lang.Long> r5 = com.google.android.gms.internal.ads.C15585bw.f43757aD     // Catch:{ all -> 0x007c }
            com.google.android.gms.internal.ads.bt r6 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x007c }
            java.lang.Object r5 = r6.mo41272a(r5)     // Catch:{ all -> 0x007c }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x007c }
            long r5 = r5.longValue()     // Catch:{ all -> 0x007c }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f39943a = r1     // Catch:{ all -> 0x007c }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.internal.ads.acf r1 = r10.f39950h     // Catch:{ all -> 0x007c }
            int r1 = r1.mo39159k()     // Catch:{ all -> 0x007c }
            r10.f39943a = r1     // Catch:{ all -> 0x007c }
        L_0x003b:
            r10.f39945c = r12     // Catch:{ all -> 0x007c }
            long r12 = r10.f39945c     // Catch:{ all -> 0x007c }
            r10.f39944b = r12     // Catch:{ all -> 0x007c }
            goto L_0x0044
        L_0x0042:
            r10.f39944b = r12     // Catch:{ all -> 0x007c }
        L_0x0044:
            r12 = 1
            if (r11 == 0) goto L_0x0058
            android.os.Bundle r13 = r11.f45779c     // Catch:{ all -> 0x007c }
            if (r13 == 0) goto L_0x0058
            android.os.Bundle r11 = r11.f45779c     // Catch:{ all -> 0x007c }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x007c }
            if (r11 != r12) goto L_0x0058
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return
        L_0x0058:
            int r11 = r10.f39946d     // Catch:{ all -> 0x007c }
            int r11 = r11 + r12
            r10.f39946d = r11     // Catch:{ all -> 0x007c }
            int r11 = r10.f39943a     // Catch:{ all -> 0x007c }
            int r11 = r11 + r12
            r10.f39943a = r11     // Catch:{ all -> 0x007c }
            int r11 = r10.f39943a     // Catch:{ all -> 0x007c }
            if (r11 != 0) goto L_0x0070
            r11 = 0
            r10.f39947e = r11     // Catch:{ all -> 0x007c }
            com.google.android.gms.internal.ads.acf r11 = r10.f39950h     // Catch:{ all -> 0x007c }
            r11.mo39140b(r3)     // Catch:{ all -> 0x007c }
            goto L_0x007a
        L_0x0070:
            com.google.android.gms.internal.ads.acf r11 = r10.f39950h     // Catch:{ all -> 0x007c }
            long r11 = r11.mo39160l()     // Catch:{ all -> 0x007c }
            r13 = 0
            long r3 = r3 - r11
            r10.f39947e = r3     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            return
        L_0x007c:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007c }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.abu.mo39110a(com.google.android.gms.internal.ads.zzyv, long):void");
    }

    /* renamed from: a */
    public final Bundle mo39108a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f39948f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f39949g);
            bundle.putLong("basets", this.f39945c);
            bundle.putLong("currts", this.f39944b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f39946d);
            bundle.putInt("preqs_in_session", this.f39943a);
            bundle.putLong("time_in_session", this.f39947e);
            bundle.putInt("pclick", this.f39951i);
            bundle.putInt("pimp", this.f39952j);
            bundle.putBoolean("support_transparent_background", m45410a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    private static boolean m45410a(Context context) {
        Context a = C16178xv.m52403a(context);
        int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            acd.m45781d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            acd.m45781d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (NameNotFoundException unused) {
            acd.m45783e("Fail to fetch AdActivity theme");
            acd.m45781d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }
}
