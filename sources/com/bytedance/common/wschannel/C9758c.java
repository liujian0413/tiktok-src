package com.bytedance.common.wschannel;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.wschannel.C9753b.C9756a;
import com.bytedance.common.wschannel.app.C9752a;
import com.bytedance.common.wschannel.client.C9812a;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.SsWsApp.C9822a;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.p485c.C9762a;
import com.bytedance.common.wschannel.server.WsChannelReceiver;
import com.p280ss.android.message.C19809a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.common.wschannel.c */
public final class C9758c {

    /* renamed from: a */
    public static Application f26535a;

    /* renamed from: b */
    public static C9761b f26536b;

    /* renamed from: c */
    private static final Object f26537c = new Object();

    /* renamed from: d */
    private static volatile boolean f26538d;

    /* renamed from: e */
    private static C9760a f26539e = new C9760a();

    /* renamed from: f */
    private static Map<Integer, C9747a> f26540f = new ConcurrentHashMap();

    /* renamed from: g */
    private static String f26541g;

    /* renamed from: h */
    private static boolean f26542h;

    /* renamed from: com.bytedance.common.wschannel.c$a */
    static class C9760a implements C9756a {
        private C9760a() {
        }

        /* renamed from: a */
        public final void mo24166a() {
            if (C9758c.f26536b == null || C9758c.f26536b.f26543a) {
                C9812a.m28937a((Context) C9758c.f26535a);
            }
        }

        /* renamed from: b */
        public final void mo24167b() {
            if (C9758c.f26536b == null || C9758c.f26536b.f26543a) {
                C9812a.m28944b((Context) C9758c.f26535a);
            }
        }
    }

    /* renamed from: com.bytedance.common.wschannel.c$b */
    static class C9761b {

        /* renamed from: a */
        public boolean f26543a;

        /* renamed from: b */
        public Map<Integer, C9747a> f26544b;
    }

    /* renamed from: a */
    public static Context m28774a() {
        return f26535a;
    }

    /* renamed from: d */
    private static void m28785d() {
        if (!f26538d) {
            throw new IllegalStateException("please init first");
        }
    }

    /* renamed from: c */
    private static void m28784c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        f26535a.registerReceiver(new WsChannelReceiver(), intentFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m28781b() {
        /*
            m28785d()
            java.lang.Object r0 = f26537c
            monitor-enter(r0)
            com.bytedance.common.wschannel.c$b r1 = f26536b     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x004b
            com.bytedance.common.wschannel.c$b r1 = f26536b     // Catch:{ all -> 0x004d }
            boolean r1 = r1.f26543a     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0011
            goto L_0x004b
        L_0x0011:
            com.bytedance.common.wschannel.c$b r1 = f26536b     // Catch:{ all -> 0x004d }
            r2 = 1
            r1.f26543a = r2     // Catch:{ all -> 0x004d }
            com.bytedance.common.wschannel.c$b r1 = f26536b     // Catch:{ all -> 0x004d }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.a> r1 = r1.f26544b     // Catch:{ all -> 0x004d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x004d }
            if (r1 != 0) goto L_0x0044
            com.bytedance.common.wschannel.c$b r1 = f26536b     // Catch:{ all -> 0x004d }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.a> r1 = r1.f26544b     // Catch:{ all -> 0x004d }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x004d }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x004d }
        L_0x002c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x004d }
            com.bytedance.common.wschannel.a r2 = (com.bytedance.common.wschannel.C9747a) r2     // Catch:{ all -> 0x004d }
            m28778a(r2)     // Catch:{ all -> 0x004d }
            goto L_0x002c
        L_0x003c:
            com.bytedance.common.wschannel.c$b r1 = f26536b     // Catch:{ all -> 0x004d }
            java.util.Map<java.lang.Integer, com.bytedance.common.wschannel.a> r1 = r1.f26544b     // Catch:{ all -> 0x004d }
            r1.clear()     // Catch:{ all -> 0x004d }
            goto L_0x0049
        L_0x0044:
            android.app.Application r1 = f26535a     // Catch:{ all -> 0x004d }
            com.bytedance.common.wschannel.client.C9812a.m28942a(r1, r2, r2)     // Catch:{ all -> 0x004d }
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.C9758c.m28781b():void");
    }

    /* renamed from: b */
    private static void m28782b(C9747a aVar) {
        f26540f.put(Integer.valueOf(aVar.f26508a), aVar);
        C9812a.m28940a((Context) f26535a, m28783c(aVar));
    }

    /* renamed from: a */
    public static void m28775a(int i) {
        m28785d();
        WsConstants.remove(1239108);
        f26540f.remove(Integer.valueOf(1239108));
        synchronized (f26537c) {
            if (f26536b != null && !f26536b.f26543a) {
                f26536b.f26544b.remove(Integer.valueOf(1239108));
            }
        }
        m28781b();
        C9812a.m28938a((Context) f26535a, 1239108);
    }

    /* renamed from: a */
    private static void m28778a(C9747a aVar) {
        m28785d();
        synchronized (f26537c) {
            if (f26536b != null) {
                if (!f26536b.f26543a) {
                    f26536b.f26544b.put(Integer.valueOf(aVar.f26508a), aVar);
                }
            }
            m28782b(aVar);
        }
    }

    /* renamed from: c */
    private static SsWsApp m28783c(C9747a aVar) {
        Map<String, String> map = aVar.f26511d;
        ArrayList arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            if (entry != null) {
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append((String) entry.getValue());
                arrayList.add(sb.toString());
            }
        }
        int i = aVar.f26514g;
        if (i > 0) {
            String str = aVar.f26509b;
            if (!C6319n.m19593a(str)) {
                String str2 = aVar.f26510c;
                if (!C6319n.m19593a(str2)) {
                    int i2 = aVar.f26513f;
                    if (i2 > 0) {
                        String str3 = aVar.f26515h;
                        if (!C6319n.m19593a(str3)) {
                            int i3 = aVar.f26516i;
                            if (i3 > 0) {
                                int i4 = aVar.f26508a;
                                if (i4 > 0) {
                                    return new C9822a().mo24342a(i).mo24343a(str).mo24347b(str2).mo24350d(i2).mo24351d(str3).mo24344a(aVar.f26512e).mo24346b(i3).mo24348c(0).mo24352e(i4).mo24349c(TextUtils.join("&", arrayList.toArray())).mo24345a();
                                }
                                throw new IllegalArgumentException("channelId <= 0 ,please set channelId first");
                            }
                            throw new IllegalArgumentException("appVersion <= 0 ,please set appVersion first");
                        }
                        throw new IllegalArgumentException("appKey is empty,please set appKey first");
                    }
                    throw new IllegalArgumentException("fpid <= 0 ,please set fpid first");
                }
                throw new IllegalArgumentException("installId is empty ,please set installId first");
            }
            throw new IllegalArgumentException("deviceId is empty ,please set deviceId first");
        }
        throw new IllegalArgumentException("aid == 0 ,please set aid first");
    }

    /* renamed from: a */
    public static void m28780a(WsChannelMsg wsChannelMsg) {
        m28785d();
        if (wsChannelMsg == null) {
            throw new IllegalArgumentException("WsChannelMsg can't be null");
        } else if (wsChannelMsg.f26776k <= 0) {
            throw new IllegalArgumentException("illegal channelId");
        } else if (wsChannelMsg.f26769d <= 0) {
            throw new IllegalArgumentException("illegal service");
        } else if (wsChannelMsg.f26770e <= 0) {
            throw new IllegalArgumentException("illegal method");
        } else if (wsChannelMsg.mo24357a() != null) {
            if (f26536b != null && !f26536b.f26543a) {
                m28781b();
            }
            C9812a.m28935a().mo24280a((Context) f26535a, wsChannelMsg);
        } else {
            throw new IllegalArgumentException("illegal payload");
        }
    }

    /* renamed from: a */
    public static void m28776a(Application application, C9752a aVar) {
        m28777a(application, aVar, false, true);
    }

    /* renamed from: a */
    public static void m28779a(C9747a aVar, String str) {
        aVar.f26511d.put("sid", str);
        m28778a(aVar);
    }

    /* renamed from: a */
    private static void m28777a(Application application, C9752a aVar, boolean z, boolean z2) {
        if (!f26538d) {
            f26538d = true;
            f26535a = application;
            f26542h = true;
            f26541g = C9762a.m28792b((Context) application);
            try {
                C19809a.m65409a(application);
            } catch (Throwable unused) {
            }
            boolean a = C9762a.m28791a(application, f26541g);
            if (a) {
                C9753b bVar = new C9753b();
                bVar.f26532b = f26539e;
                application.registerActivityLifecycleCallbacks(bVar);
                WsConstants.setOnMessageReceiveListener(aVar);
            } else if (C9762a.m28793b(f26541g)) {
                m28784c();
            }
            if (f26536b == null) {
                C9812a.m28942a(f26535a, a, true);
            }
        }
    }
}
