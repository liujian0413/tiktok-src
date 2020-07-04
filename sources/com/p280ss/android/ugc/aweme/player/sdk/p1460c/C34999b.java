package com.p280ss.android.ugc.aweme.player.sdk.p1460c;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.player.sdk.c.b */
public final class C34999b {

    /* renamed from: a */
    private static final String[] f91357a = {"player_prepare_duration", "videochache_prepare_duration", "videoheader_chache_duration", "firstframe_render_duration", "firstframe_total_duration"};

    /* renamed from: c */
    private static final C34999b f91358c = new C34999b();

    /* renamed from: b */
    private Map<String, Map<String, Long>> f91359b = new LinkedHashMap<String, Map<String, Long>>() {
        /* access modifiers changed from: protected */
        public final boolean removeEldestEntry(Entry entry) {
            if (size() > 3) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: a */
    public static C34999b m112962a() {
        return f91358c;
    }

    private C34999b() {
    }

    /* renamed from: a */
    public final void mo88685a(String str, String str2) {
        m112963a(str, str2, System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m112963a(java.lang.String r3, java.lang.String r4, long r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.lang.String r0 = "player_try_play"
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0021
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> r0 = r2.f91359b     // Catch:{ all -> 0x0040 }
            r0.remove(r3)     // Catch:{ all -> 0x0040 }
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0040 }
            r0.<init>()     // Catch:{ all -> 0x0040 }
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> r1 = r2.f91359b     // Catch:{ all -> 0x0040 }
            r1.put(r3, r0)     // Catch:{ all -> 0x0040 }
            goto L_0x0033
        L_0x0021:
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Long>> r0 = r2.f91359b     // Catch:{ all -> 0x0040 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0040 }
            r0 = r3
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            boolean r3 = r0.containsKey(r4)     // Catch:{ all -> 0x0040 }
            if (r3 == 0) goto L_0x0033
            goto L_0x003e
        L_0x0033:
            if (r0 == 0) goto L_0x003c
            java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0040 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0040 }
        L_0x003c:
            monitor-exit(r2)
            return
        L_0x003e:
            monitor-exit(r2)
            return
        L_0x0040:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.player.sdk.p1460c.C34999b.m112963a(java.lang.String, java.lang.String, long):void");
    }
}
