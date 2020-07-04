package com.p280ss.android.ugc.aweme.hybrid.monitor.utils;

import android.graphics.Bitmap.Config;
import android.view.View;
import android.webkit.WebView;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.utils.a */
public final class C30404a {

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.utils.a$a */
    public static class C30405a {

        /* renamed from: a */
        public int f79903a;

        /* renamed from: b */
        public int f79904b;

        /* renamed from: c */
        public Config f79905c;
    }

    /* renamed from: a */
    public static boolean m99372a(View view) {
        if (m99374b(view).f79903a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m99373a(WebView webView) {
        if (m99374b(webView).f79903a == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|(1:30)|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.f79903a = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        if (r2 == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        r10.setDrawingCacheEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006b, code lost:
        if (r2 == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
        r10.setDrawingCacheEnabled(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30404a.C30405a m99374b(android.view.View r10) {
        /*
            com.ss.android.ugc.aweme.hybrid.monitor.utils.a$a r0 = new com.ss.android.ugc.aweme.hybrid.monitor.utils.a$a
            r0.<init>()
            r1 = 3
            if (r10 == 0) goto L_0x0071
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r2 == r3) goto L_0x0013
            goto L_0x0071
        L_0x0013:
            boolean r2 = r10.isDrawingCacheEnabled()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0021
            r10.setDrawingCacheEnabled(r3)     // Catch:{ Throwable -> 0x0063 }
            goto L_0x0021
        L_0x001f:
            r0 = move-exception
            goto L_0x006b
        L_0x0021:
            android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0063 }
            android.graphics.Bitmap r5 = r10.getDrawingCache()     // Catch:{ Throwable -> 0x0063 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0063 }
            r6 = 2
            if (r5 == 0) goto L_0x005b
            int r7 = r5.getWidth()     // Catch:{ Throwable -> 0x0063 }
            int r8 = r5.getHeight()     // Catch:{ Throwable -> 0x0063 }
            android.graphics.Bitmap$Config r9 = r5.getConfig()     // Catch:{ Throwable -> 0x0063 }
            r0.f79905c = r9     // Catch:{ Throwable -> 0x0063 }
            if (r7 <= 0) goto L_0x005b
            if (r8 <= 0) goto L_0x005b
            int r7 = r5.getPixel(r4, r4)     // Catch:{ Throwable -> 0x0063 }
            r0.f79904b = r7     // Catch:{ Throwable -> 0x0063 }
            com.ss.android.ugc.aweme.hybrid.monitor.utils.f r8 = new com.ss.android.ugc.aweme.hybrid.monitor.utils.f     // Catch:{ Throwable -> 0x0063 }
            r8.<init>(r7)     // Catch:{ Throwable -> 0x0063 }
            boolean r5 = r8.mo80037a(r5)     // Catch:{ Throwable -> 0x0063 }
            if (r5 == 0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r3 = 2
        L_0x0053:
            r0.f79903a = r3     // Catch:{ Throwable -> 0x0063 }
            if (r2 != 0) goto L_0x005a
            r10.setDrawingCacheEnabled(r4)
        L_0x005a:
            return r0
        L_0x005b:
            if (r2 != 0) goto L_0x0060
            r10.setDrawingCacheEnabled(r4)
        L_0x0060:
            r0.f79903a = r6
            return r0
        L_0x0063:
            r0.f79903a = r1     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x006a
            r10.setDrawingCacheEnabled(r4)
        L_0x006a:
            return r0
        L_0x006b:
            if (r2 != 0) goto L_0x0070
            r10.setDrawingCacheEnabled(r4)
        L_0x0070:
            throw r0
        L_0x0071:
            r0.f79903a = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.hybrid.monitor.utils.C30404a.m99374b(android.view.View):com.ss.android.ugc.aweme.hybrid.monitor.utils.a$a");
    }
}
