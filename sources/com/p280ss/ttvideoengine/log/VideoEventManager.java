package com.p280ss.ttvideoengine.log;

import com.p280ss.ttvideoengine.p1816i.C46123h;
import org.json.JSONArray;

/* renamed from: com.ss.ttvideoengine.log.VideoEventManager */
public enum VideoEventManager {
    instance;
    
    private JSONArray mJsonArray;
    private JSONArray mJsonArrayV2;
    private C46147g mListener;
    private int mLoggerVersion;
    private C46144d mUploader;

    public final int getLoggerVersion() {
        return this.mLoggerVersion;
    }

    public final synchronized JSONArray popAllEvents() {
        JSONArray jSONArray;
        jSONArray = this.mJsonArray;
        this.mJsonArray = new JSONArray();
        return jSONArray;
    }

    public final JSONArray popAllEventsV2() {
        JSONArray jSONArray = this.mJsonArrayV2;
        synchronized (VideoEventManager.class) {
            this.mJsonArrayV2 = new JSONArray();
        }
        return jSONArray;
    }

    public final void setListener(C46147g gVar) {
        this.mListener = gVar;
    }

    public final void setUploader(C46144d dVar) {
        this.mUploader = dVar;
    }

    public final void setLoggerVersion(int i) {
        StringBuilder sb = new StringBuilder("setLoggerVersion: ");
        sb.append(i);
        C46123h.m144545a("VideoEventManager", sb.toString());
        if (i == 1 || i == 2) {
            this.mLoggerVersion = i;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void addEvent(org.json.JSONObject r3) {
        /*
            r2 = this;
            java.lang.Class<com.ss.ttvideoengine.log.VideoEventManager> r0 = com.p280ss.ttvideoengine.log.VideoEventManager.class
            monitor-enter(r0)
            if (r3 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r3 = move-exception
            goto L_0x0022
        L_0x0009:
            r2.showEvent(r3)     // Catch:{ all -> 0x0007 }
            com.ss.ttvideoengine.log.d r1 = r2.mUploader     // Catch:{ all -> 0x0007 }
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0012:
            org.json.JSONArray r1 = r2.mJsonArray     // Catch:{ all -> 0x0007 }
            r1.put(r3)     // Catch:{ all -> 0x0007 }
            com.ss.ttvideoengine.log.g r3 = r2.mListener     // Catch:{ all -> 0x0007 }
            if (r3 == 0) goto L_0x0020
            com.ss.ttvideoengine.log.g r3 = r2.mListener     // Catch:{ all -> 0x0007 }
            r3.onEvent()     // Catch:{ all -> 0x0007 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.log.VideoEventManager.addEvent(org.json.JSONObject):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x007a */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093 A[SYNTHETIC, Splitter:B:37:0x0093] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0098 A[SYNTHETIC, Splitter:B:41:0x0098] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a1 A[SYNTHETIC, Splitter:B:48:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a6 A[SYNTHETIC, Splitter:B:52:0x00a6] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void showEvent(org.json.JSONObject r7) {
        /*
            r6 = this;
            int r0 = com.p280ss.ttvideoengine.p1816i.C46123h.f118017a
            r1 = 1
            int r0 = r0 >> r1
            r0 = r0 & r1
            if (r0 != r1) goto L_0x00aa
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            r2.<init>()     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            r2.append(r3)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            char r3 = java.io.File.separatorChar     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            r2.append(r3)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            java.lang.String r3 = "engine.debug"
            r2.append(r3)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            if (r2 != 0) goto L_0x003b
            java.lang.String r1 = "VideoEventManager"
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r1, r2)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            return
        L_0x003b:
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0087, all -> 0x0084 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0088 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0088 }
        L_0x0045:
            java.lang.String r0 = r1.readLine()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            if (r0 == 0) goto L_0x0077
            java.lang.String r3 = "\r\n"
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replace(r3, r4)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.Object r3 = r7.opt(r0)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            if (r3 == 0) goto L_0x0045
            java.lang.String r3 = "VideoEventManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r4.<init>()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r4.append(r0)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.Object r0 = r7.opt(r0)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            r4.append(r0)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r3, r0)     // Catch:{ Exception -> 0x0082, all -> 0x007f }
            goto L_0x0045
        L_0x0077:
            r1.close()     // Catch:{ Throwable -> 0x007a }
        L_0x007a:
            r2.close()     // Catch:{ Throwable -> 0x007e }
            return
        L_0x007e:
            return
        L_0x007f:
            r7 = move-exception
            r0 = r1
            goto L_0x009f
        L_0x0082:
            r0 = r1
            goto L_0x0088
        L_0x0084:
            r7 = move-exception
            r2 = r0
            goto L_0x009f
        L_0x0087:
            r2 = r0
        L_0x0088:
            java.lang.String r1 = "VideoEventManager"
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x009e }
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r1, r7)     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0096
            r0.close()     // Catch:{ Throwable -> 0x0096 }
        L_0x0096:
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ Throwable -> 0x009c }
            goto L_0x009d
        L_0x009c:
            return
        L_0x009d:
            return
        L_0x009e:
            r7 = move-exception
        L_0x009f:
            if (r0 == 0) goto L_0x00a4
            r0.close()     // Catch:{ Throwable -> 0x00a4 }
        L_0x00a4:
            if (r2 == 0) goto L_0x00a9
            r2.close()     // Catch:{ Throwable -> 0x00a9 }
        L_0x00a9:
            throw r7
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.log.VideoEventManager.showEvent(org.json.JSONObject):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void addEventV2(org.json.JSONObject r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.Class<com.ss.ttvideoengine.log.VideoEventManager> r0 = com.p280ss.ttvideoengine.log.VideoEventManager.class
            monitor-enter(r0)
            if (r3 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r3 = move-exception
            goto L_0x0022
        L_0x0009:
            r2.showEvent(r3)     // Catch:{ all -> 0x0007 }
            com.ss.ttvideoengine.log.d r1 = r2.mUploader     // Catch:{ all -> 0x0007 }
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0012:
            org.json.JSONArray r1 = r2.mJsonArrayV2     // Catch:{ all -> 0x0007 }
            r1.put(r3)     // Catch:{ all -> 0x0007 }
            com.ss.ttvideoengine.log.g r3 = r2.mListener     // Catch:{ all -> 0x0007 }
            if (r3 == 0) goto L_0x0020
            com.ss.ttvideoengine.log.g r3 = r2.mListener     // Catch:{ all -> 0x0007 }
            r3.onEventV2(r4)     // Catch:{ all -> 0x0007 }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.log.VideoEventManager.addEventV2(org.json.JSONObject, java.lang.String):void");
    }
}
