package com.p280ss.android.ugc.aweme.image;

import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.i */
public final class C32042i {

    /* renamed from: a */
    public static final C32042i f83824a = new C32042i();

    /* renamed from: b */
    private static C32041h f83825b = new C32041h();

    private C32042i() {
    }

    /* renamed from: a */
    public final synchronized void mo83013a(JSONObject jSONObject) {
        C7573i.m23587b(jSONObject, "jsonObject");
        if (f83825b.f83816a != 0) {
            jSONObject.put("image_delay_total", f83825b.f83820e);
            jSONObject.put("image_fail_tms", f83825b.f83822g);
            jSONObject.put("image_num", f83825b.f83816a);
            jSONObject.put("image_re_delay_total", f83825b.f83821f);
            jSONObject.put("image_re_fail_tms", f83825b.f83823h);
            jSONObject.put("image_re_size_total", f83825b.f83819d);
            jSONObject.put("image_re_num", f83825b.f83817b);
            jSONObject.put("image_size_total", f83825b.f83818c);
            f83825b.mo83011a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo83014a(boolean r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "json"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "uri"
            java.lang.String r0 = r8.optString(r0)     // Catch:{ all -> 0x008b }
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x008b }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            int r1 = r1.length()     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = 0
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            if (r1 == 0) goto L_0x0021
            monitor-exit(r6)
            return
        L_0x0021:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "~tplv-tiktok-shrink"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ all -> 0x008b }
            r4 = 2
            r5 = 0
            boolean r0 = kotlin.text.C7634n.m23776c(r0, r1, false)     // Catch:{ all -> 0x008b }
            if (r7 == 0) goto L_0x0079
            com.ss.android.ugc.aweme.image.h r7 = f83825b     // Catch:{ all -> 0x008b }
            int r1 = r7.f83816a     // Catch:{ all -> 0x008b }
            int r1 = r1 + r3
            r7.f83816a = r1     // Catch:{ all -> 0x008b }
            com.ss.android.ugc.aweme.image.h r7 = f83825b     // Catch:{ all -> 0x008b }
            int r1 = r7.f83818c     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "file_size"
            int r2 = r8.optInt(r2)     // Catch:{ all -> 0x008b }
            int r2 = r2 / 1024
            int r1 = r1 + r2
            r7.f83818c = r1     // Catch:{ all -> 0x008b }
            com.ss.android.ugc.aweme.image.h r7 = f83825b     // Catch:{ all -> 0x008b }
            int r1 = r7.f83820e     // Catch:{ all -> 0x008b }
            java.lang.String r2 = "duration"
            int r2 = r8.optInt(r2)     // Catch:{ all -> 0x008b }
            int r1 = r1 + r2
            r7.f83820e = r1     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.image.h r7 = f83825b     // Catch:{ all -> 0x008b }
            int r0 = r7.f83817b     // Catch:{ all -> 0x008b }
            int r0 = r0 + r3
            r7.f83817b = r0     // Catch:{ all -> 0x008b }
            com.ss.android.ugc.aweme.image.h r7 = f83825b     // Catch:{ all -> 0x008b }
            int r0 = r7.f83819d     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "file_size"
            int r1 = r8.optInt(r1)     // Catch:{ all -> 0x008b }
            int r1 = r1 / 1024
            int r0 = r0 + r1
            r7.f83819d = r0     // Catch:{ all -> 0x008b }
            com.ss.android.ugc.aweme.image.h r7 = f83825b     // Catch:{ all -> 0x008b }
            int r0 = r7.f83821f     // Catch:{ all -> 0x008b }
            java.lang.String r1 = "duration"
            int r8 = r8.optInt(r1)     // Catch:{ all -> 0x008b }
            int r0 = r0 + r8
            r7.f83821f = r0     // Catch:{ all -> 0x008b }
            monitor-exit(r6)
            return
        L_0x0079:
            com.ss.android.ugc.aweme.image.h r7 = f83825b     // Catch:{ all -> 0x008b }
            int r8 = r7.f83822g     // Catch:{ all -> 0x008b }
            int r8 = r8 + r3
            r7.f83822g = r8     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.image.h r7 = f83825b     // Catch:{ all -> 0x008b }
            int r8 = r7.f83823h     // Catch:{ all -> 0x008b }
            int r8 = r8 + r3
            r7.f83823h = r8     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r6)
            return
        L_0x008b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32042i.mo83014a(boolean, org.json.JSONObject):void");
    }
}
