package com.p280ss.android.pushmanager.monitor;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.p530h.p531a.C10279a;
import com.p280ss.android.pushmanager.monitor.exception.SenderRegisterException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.monitor.d */
public final class C20084d {

    /* renamed from: a */
    private static C6310a f54310a = new C6310a() {
        public final void handleMsg(Message message) {
            C20084d.m66147a(message);
        }
    };

    /* renamed from: b */
    private static Handler f54311b = new C6309f(C20083c.m66140b(), f54310a);

    /* renamed from: c */
    private static final Map<Integer, Boolean> f54312c = new ConcurrentHashMap(2);

    /* renamed from: a */
    public static void m66142a() {
        if (C20083c.m66139a()) {
            m66146a(0, (JSONObject) null);
        }
    }

    /* renamed from: c */
    private static void m66150c(int i) {
        f54311b.removeMessages(1001, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m66143a(int i) {
        if (C20083c.m66139a()) {
            synchronized (f54312c) {
                if (((Boolean) f54312c.get(Integer.valueOf(i))) == null) {
                    f54312c.put(Integer.valueOf(i), Boolean.valueOf(true));
                    f54311b.sendMessageDelayed(f54311b.obtainMessage(1001, Integer.valueOf(i)), TimeUnit.MINUTES.toMillis(1));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        m66150c(r5);
        r0 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.put("status", 0);
        r0.put("pushType", r5);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m66149b(int r5) {
        /*
            boolean r0 = com.p280ss.android.pushmanager.monitor.C20083c.m66139a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = f54312c
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = f54312c     // Catch:{ all -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0049 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0047
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0049 }
            if (r1 != 0) goto L_0x001f
            goto L_0x0047
        L_0x001f:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = f54312c     // Catch:{ all -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0049 }
            r3 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0049 }
            r1.put(r2, r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            m66150c(r5)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "status"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0040 }
            java.lang.String r1 = "pushType"
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0040 }
        L_0x0040:
            java.lang.String r5 = "push_monitor_register_result"
            r1 = 0
            com.p280ss.android.pushmanager.monitor.C20083c.m66136a(r5, r0, r1, r1)
            return
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x0049:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.monitor.C20084d.m66149b(int):void");
    }

    /* renamed from: a */
    public static void m66147a(Message message) {
        if (message != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", 108);
                jSONObject.put("pushType", message.obj);
            } catch (JSONException unused) {
            }
            if (message.what == 1001) {
                C20083c.m66136a("push_monitor_register_result", jSONObject, null, null);
                if (C10279a.m30443a()) {
                    StringBuilder sb = new StringBuilder(" 通道");
                    sb.append(message.obj);
                    sb.append("注册timeout");
                    throw new SenderRegisterException(sb.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public static void m66145a(int i, String str) {
        if (C20083c.m66139a()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("log", str);
            } catch (JSONException unused) {
            }
            m66146a(i, jSONObject);
        }
    }

    /* renamed from: a */
    private static void m66146a(int i, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", i);
        } catch (JSONException unused) {
        }
        C20083c.m66136a("push_monitor_update_sender", jSONObject2, null, jSONObject);
    }

    /* renamed from: a */
    public static void m66148a(boolean z, String str) {
        if (C20083c.m66139a() && !z) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", 107);
            } catch (JSONException unused) {
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("sender", str);
            } catch (JSONException unused2) {
            }
            C20083c.m66136a("push_monitor_register_result", jSONObject, null, jSONObject2);
            if (C10279a.m30443a()) {
                throw new SenderRegisterException("Server下发无可用通道或者注册失败");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        m66150c(r4);
        r0 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.put("pushType", r4);
        r0.put("status", r5);
        r0.put("3rd_code", r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m66144a(int r4, int r5, java.lang.String r6, java.lang.String r7) {
        /*
            boolean r0 = com.p280ss.android.pushmanager.monitor.C20083c.m66139a()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r0 = f54312c
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = f54312c     // Catch:{ all -> 0x007a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007a }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x007a }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x007a }
            if (r1 == 0) goto L_0x0078
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x007a }
            if (r1 != 0) goto L_0x001f
            goto L_0x0078
        L_0x001f:
            java.util.Map<java.lang.Integer, java.lang.Boolean> r1 = f54312c     // Catch:{ all -> 0x007a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007a }
            r3 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x007a }
            r1.put(r2, r3)     // Catch:{ all -> 0x007a }
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            m66150c(r4)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "pushType"
            r0.put(r1, r4)     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r1 = "status"
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x0045 }
            java.lang.String r5 = "3rd_code"
            r0.put(r5, r6)     // Catch:{ JSONException -> 0x0045 }
        L_0x0045:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r6 = "msg"
            r5.put(r6, r7)     // Catch:{ JSONException -> 0x004f }
        L_0x004f:
            java.lang.String r6 = "push_monitor_register_result"
            r1 = 0
            com.p280ss.android.pushmanager.monitor.C20083c.m66136a(r6, r0, r1, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = " 通道"
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = "注册失败，原因 : "
            r5.append(r4)
            r5.append(r7)
            java.lang.String r4 = r5.toString()
            boolean r5 = com.bytedance.p530h.p531a.C10279a.m30443a()
            if (r5 != 0) goto L_0x0072
            return
        L_0x0072:
            com.ss.android.pushmanager.monitor.exception.SenderRegisterException r5 = new com.ss.android.pushmanager.monitor.exception.SenderRegisterException
            r5.<init>(r4)
            throw r5
        L_0x0078:
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            return
        L_0x007a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.pushmanager.monitor.C20084d.m66144a(int, int, java.lang.String, java.lang.String):void");
    }
}
