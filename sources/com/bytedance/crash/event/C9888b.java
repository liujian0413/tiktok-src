package com.bytedance.crash.event;

import android.content.Context;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.p501j.C9954g;
import com.bytedance.crash.p504l.C9992m;
import com.bytedance.crash.p504l.C9995o;
import com.bytedance.crash.upload.C10027h.C10028a;
import com.bytedance.crash.upload.C10029i;
import com.bytedance.crash.upload.CrashUploader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.event.b */
public final class C9888b {

    /* renamed from: a */
    public static boolean f26975a = false;

    /* renamed from: b */
    private static Context f26976b;

    /* renamed from: c */
    private static volatile C9894d<Event> f26977c;

    /* renamed from: d */
    private static volatile Runnable f26978d;

    /* renamed from: e */
    private static final List<Event> f26979e = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.bytedance.crash.event.b$a */
    static class C9890a implements Runnable {
        private C9890a() {
        }

        public final void run() {
            m29191a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized void m29191a() {
            /*
                r6 = this;
                monitor-enter(r6)
                boolean r0 = com.bytedance.crash.event.C9888b.f26975a     // Catch:{ all -> 0x006a }
                if (r0 == 0) goto L_0x0068
                boolean r0 = com.bytedance.crash.C9912i.m29324f()     // Catch:{ all -> 0x006a }
                if (r0 == 0) goto L_0x000c
                goto L_0x0068
            L_0x000c:
                com.bytedance.crash.event.C9888b.m29187c()     // Catch:{ all -> 0x006a }
                com.bytedance.crash.event.d r0 = com.bytedance.crash.event.C9888b.m29188d()     // Catch:{ all -> 0x006a }
                int r1 = r0.mo24472a()     // Catch:{ all -> 0x006a }
                if (r1 > 0) goto L_0x001b
                monitor-exit(r6)
                return
            L_0x001b:
                java.util.ArrayList r0 = r0.mo24475b()     // Catch:{ all -> 0x006a }
                boolean r1 = com.bytedance.crash.p504l.C9995o.m29625a(r0)     // Catch:{ all -> 0x006a }
                if (r1 != 0) goto L_0x0066
                r1 = 0
            L_0x0026:
                int r2 = r0.size()     // Catch:{ all -> 0x006a }
                if (r1 >= r2) goto L_0x0066
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ all -> 0x006a }
                r2.<init>()     // Catch:{ all -> 0x006a }
                int r3 = r0.size()     // Catch:{ all -> 0x006a }
                int r3 = r3 - r1
                r4 = 10
                if (r3 <= r4) goto L_0x003b
                goto L_0x0041
            L_0x003b:
                int r3 = r0.size()     // Catch:{ all -> 0x006a }
                int r4 = r3 - r1
            L_0x0041:
                int r4 = r4 + r1
                java.util.List r3 = r0.subList(r1, r4)     // Catch:{ all -> 0x006a }
                java.util.Iterator r4 = r3.iterator()     // Catch:{ all -> 0x006a }
            L_0x004a:
                boolean r5 = r4.hasNext()     // Catch:{ all -> 0x006a }
                if (r5 == 0) goto L_0x0060
                java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x006a }
                com.bytedance.crash.event.Event r5 = (com.bytedance.crash.event.Event) r5     // Catch:{ all -> 0x006a }
                if (r5 == 0) goto L_0x004a
                org.json.JSONObject r5 = r5.toJSONObject()     // Catch:{ all -> 0x006a }
                r2.put(r5)     // Catch:{ all -> 0x006a }
                goto L_0x004a
            L_0x0060:
                m29192a(r2, r3)     // Catch:{ all -> 0x006a }
                int r1 = r1 + 10
                goto L_0x0026
            L_0x0066:
                monitor-exit(r6)
                return
            L_0x0068:
                monitor-exit(r6)
                return
            L_0x006a:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.event.C9888b.C9890a.m29191a():void");
        }

        /* renamed from: a */
        private static void m29192a(JSONArray jSONArray, List<Event> list) {
            if (C9888b.f26975a) {
                JSONObject jSONObject = new JSONObject();
                C9894d d = C9888b.m29188d();
                try {
                    jSONObject.put("data", jSONArray);
                } catch (JSONException unused) {
                }
                C10029i iVar = null;
                boolean z = false;
                try {
                    iVar = CrashUploader.m29744a(new C10028a().mo24652a("https://api2.musical.ly/monitor/collect/c/crash_client_event").mo24654a(jSONObject.toString().getBytes()).mo24653a(true).mo24656b(true).mo24655a());
                } catch (OutOfMemoryError unused2) {
                    z = true;
                } catch (Throwable unused3) {
                }
                if (iVar != null && iVar.mo24657a()) {
                    if (iVar.mo24658b()) {
                        d.mo24474a(list);
                    } else if (z) {
                        d.mo24474a(list);
                    }
                    if (C9918j.m29344i().f27126l) {
                        JSONObject jSONObject2 = iVar.f27307c;
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        try {
                            jSONObject2.put("device_id", C9918j.m29338c().mo24593a());
                        } catch (JSONException unused4) {
                        }
                    }
                } else if (z) {
                    d.mo24474a(list);
                }
            }
        }
    }

    private C9888b() {
    }

    /* renamed from: a */
    public static void m29182a() {
        f26975a = false;
    }

    /* renamed from: b */
    public static void m29185b() {
        if (f26975a) {
            m29190f().run();
        }
    }

    /* renamed from: e */
    private static void m29189e() {
        if (f26975a) {
            C9954g.m29460b().mo24596a(new Runnable() {
                public final void run() {
                    C9888b.m29187c();
                }
            });
        }
    }

    /* renamed from: f */
    private static Runnable m29190f() {
        if (f26978d == null) {
            synchronized (C9888b.class) {
                if (f26978d == null) {
                    f26978d = new C9890a();
                }
            }
        }
        return f26978d;
    }

    /* renamed from: c */
    public static void m29187c() {
        if (f26975a) {
            C9894d d = m29188d();
            int i = 0;
            while (i < f26979e.size()) {
                try {
                    Event event = (Event) f26979e.get(i);
                    if (event != null) {
                        d.mo24473a(event);
                    }
                    i++;
                } catch (Throwable unused) {
                }
            }
            f26979e.clear();
        }
    }

    /* renamed from: d */
    public static C9894d<Event> m29188d() {
        Context context;
        if (f26977c == null) {
            synchronized (C9888b.class) {
                if (f26977c == null) {
                    if (f26976b == null) {
                        context = C9918j.m29342g();
                    } else {
                        context = f26976b;
                    }
                    f26977c = new C9891c(C9992m.m29602d(context));
                }
            }
        }
        return f26977c;
    }

    /* renamed from: a */
    public static void m29183a(Event event) {
        if (f26975a && event != null) {
            try {
                f26979e.add(event);
                if (f26979e.size() > 5) {
                    m29189e();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m29186b(Event event) {
        if (f26975a) {
            m29187c();
            if (event != null) {
                event.eventTime = System.currentTimeMillis();
                m29188d().mo24473a(event);
            }
        }
    }

    /* renamed from: a */
    public static void m29184a(ArrayList<Event> arrayList) {
        if (f26975a && !C9995o.m29625a((List<?>) arrayList)) {
            try {
                f26979e.addAll(arrayList);
                if (f26979e.size() > 5) {
                    m29189e();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
