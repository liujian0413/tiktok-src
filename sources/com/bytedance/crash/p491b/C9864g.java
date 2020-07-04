package com.bytedance.crash.p491b;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.crash.C9875d;
import com.bytedance.crash.p501j.C9940c;
import com.bytedance.crash.p501j.C9952f;
import com.bytedance.crash.p501j.C9954g;
import com.bytedance.crash.p501j.C9955h;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.services.apm.api.C12916e;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.b.g */
public final class C9864g {

    /* renamed from: a */
    public static boolean f26898a = true;

    /* renamed from: b */
    public static volatile AtomicLong f26899b = new AtomicLong(-1);

    /* renamed from: c */
    public static long f26900c = 100;

    /* renamed from: d */
    public static long f26901d;

    /* renamed from: e */
    public static long f26902e;

    /* renamed from: f */
    public static long f26903f;

    /* renamed from: g */
    public static int f26904g;

    /* renamed from: h */
    public static boolean f26905h;

    /* renamed from: i */
    public static volatile String f26906i = null;

    /* renamed from: j */
    public static volatile boolean f26907j = false;

    /* renamed from: k */
    public static int f26908k = -1;

    /* renamed from: l */
    public static volatile long f26909l = 0;

    /* renamed from: m */
    public static long f26910m = -1;

    /* renamed from: n */
    public static long f26911n = -1;

    /* renamed from: o */
    private static int f26912o;

    /* renamed from: p */
    private static List<C9870a> f26913p;

    /* renamed from: q */
    private static C9955h f26914q = new C9955h(5);

    /* renamed from: r */
    private static HandlerThread f26915r;

    /* renamed from: s */
    private static Handler f26916s;

    /* renamed from: t */
    private static int f26917t = -1;

    /* renamed from: u */
    private static MessageQueue f26918u = null;

    /* renamed from: v */
    private static Field f26919v = null;

    /* renamed from: w */
    private static Field f26920w = null;

    /* renamed from: com.bytedance.crash.b.g$a */
    public static class C9870a {

        /* renamed from: a */
        public int f26922a;

        /* renamed from: b */
        public int f26923b;

        /* renamed from: c */
        public long f26924c;

        /* renamed from: d */
        public long f26925d;

        /* renamed from: e */
        public long f26926e;

        /* renamed from: f */
        public boolean f26927f;

        /* renamed from: g */
        public String f26928g;

        public final String toString() {
            if (this.f26923b == 0) {
                StringBuilder sb = new StringBuilder("[[[ IDLE  ]]] cost ");
                sb.append(this.f26924c);
                sb.append(" tick , mDuration：");
                sb.append(this.f26925d);
                sb.append(",cpuTime:");
                sb.append(this.f26926e);
                return sb.toString();
            } else if (this.f26923b == 1) {
                StringBuilder sb2 = new StringBuilder("[[[ Long IDLE  ]]] cost ");
                sb2.append(this.f26924c);
                sb2.append(" tick , mDuration：");
                sb2.append(this.f26925d);
                sb2.append(",cpuTime:");
                sb2.append(this.f26926e);
                return sb2.toString();
            } else if (this.f26923b == 2) {
                StringBuilder sb3 = new StringBuilder("[[[  1 msg  ]]] cost ");
                sb3.append(this.f26924c);
                sb3.append(" tick , mDuration：");
                sb3.append(this.f26925d);
                sb3.append(",cpuTime:");
                sb3.append(this.f26926e);
                sb3.append(", msg:");
                sb3.append(this.f26928g);
                return sb3.toString();
            } else if (this.f26923b == 3) {
                StringBuilder sb4 = new StringBuilder("[[[ 1 msg + IDLE  ]]] cost ");
                sb4.append(this.f26924c);
                sb4.append(" tick , mDuration：");
                sb4.append(this.f26925d);
                sb4.append(",cpuTime:");
                sb4.append(this.f26926e);
                return sb4.toString();
            } else if (this.f26923b == 4) {
                StringBuilder sb5 = new StringBuilder("[[[ ");
                sb5.append(this.f26922a - 1);
                sb5.append(" msgs  ]]] cost less than 1 tick, [[[  last msg ]]] cost more than ");
                sb5.append(this.f26924c - 1);
                sb5.append("tick ,, mDuration：");
                sb5.append(this.f26925d);
                sb5.append("cpuTime:");
                sb5.append(this.f26926e);
                sb5.append(" msg:");
                sb5.append(this.f26928g);
                return sb5.toString();
            } else if (this.f26923b == 5) {
                StringBuilder sb6 = new StringBuilder("[[[ ");
                sb6.append(this.f26922a);
                sb6.append(" msgs ]]] cost less than 1 tick but [[[  IDLE ]]] cost more than");
                sb6.append(this.f26924c - 1);
                sb6.append(" ticks, , mDuration：");
                sb6.append(this.f26925d);
                sb6.append("cpuTime:");
                sb6.append(this.f26926e);
                return sb6.toString();
            } else if (this.f26923b == 6) {
                StringBuilder sb7 = new StringBuilder("[[[  1 msg  ]]] cost less than 1 tick , but [[[  IDLE ]]] cost more than");
                sb7.append(this.f26924c - 1);
                sb7.append(", , mDuration：");
                sb7.append(this.f26925d);
                sb7.append("cpuTime:");
                sb7.append(this.f26926e);
                return sb7.toString();
            } else if (this.f26923b == 7) {
                StringBuilder sb8 = new StringBuilder("[[[ ");
                sb8.append(this.f26922a);
                sb8.append(" msgs + IDLE  ]]] cost 1 tick , mDuration：");
                sb8.append(this.f26925d);
                sb8.append(" cost cpuTime:");
                sb8.append(this.f26926e);
                return sb8.toString();
            } else if (this.f26923b == 8) {
                StringBuilder sb9 = new StringBuilder("[[[ 1 msgs ]]] cost ");
                sb9.append(this.f26924c);
                sb9.append(" ticks , mDuration：");
                sb9.append(this.f26925d);
                sb9.append(" cost cpuTime:");
                sb9.append(this.f26926e);
                sb9.append(" msg:");
                sb9.append(this.f26928g);
                return sb9.toString();
            } else if (this.f26923b == 9) {
                StringBuilder sb10 = new StringBuilder("[[[ ");
                sb10.append(this.f26922a);
                sb10.append(" msgs ]]] cost 1 tick , mDuration：");
                sb10.append(this.f26925d);
                sb10.append(" cost cpuTime:");
                sb10.append(this.f26926e);
                return sb10.toString();
            } else {
                StringBuilder sb11 = new StringBuilder("=========   UNKNOW =========  Type:");
                sb11.append(this.f26923b);
                sb11.append(" cost ticks ");
                sb11.append(this.f26924c);
                sb11.append(" msgs:");
                sb11.append(this.f26922a);
                return sb11.toString();
            }
        }
    }

    /* renamed from: f */
    public static long m29122f() {
        return f26909l;
    }

    /* renamed from: a */
    public static void m29115a() {
        try {
            C6446c.m20129a(C12916e.class, new C12916e() {
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static long m29121e() {
        if (f26908k < 0) {
            return 0;
        }
        try {
            return C9940c.m29420a(f26908k);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static C9870a m29118b() {
        if (f26913p.size() == f26912o) {
            f26917t = (f26917t + 1) % f26912o;
            return (C9870a) f26913p.get(f26917t);
        }
        C9870a aVar = new C9870a();
        f26913p.add(aVar);
        f26917t++;
        return aVar;
    }

    /* renamed from: d */
    public static void m29120d() {
        f26915r = C9954g.m29459a();
        f26901d = SystemClock.uptimeMillis();
        Handler handler = new Handler(f26915r.getLooper());
        f26916s = handler;
        handler.postDelayed(new Runnable() {
            public final void run() {
                try {
                    new Thread("npth-tick") {
                        public final void run() {
                            long j;
                            super.run();
                            try {
                                C9864g.m29115a();
                                while (C9864g.f26898a) {
                                    long uptimeMillis = SystemClock.uptimeMillis();
                                    if (!C9862e.m29106a()) {
                                        C9864g.f26909l = C9864g.m29121e();
                                    }
                                    C9864g.f26899b.set((uptimeMillis - C9864g.f26901d) / C9864g.f26900c);
                                    long j2 = (uptimeMillis - C9864g.f26901d) % C9864g.f26900c;
                                    if (j2 >= 95) {
                                        C9864g.f26899b.incrementAndGet();
                                        j = (C9864g.f26900c << 1) - j2;
                                    } else {
                                        j = C9864g.f26900c - j2;
                                    }
                                    SystemClock.sleep(j);
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }.start();
                } catch (Throwable unused) {
                }
            }
        }, f26900c);
    }

    /* renamed from: g */
    private static void m29123g() {
        C9952f.m29447a().mo24576b();
        C9952f.m29447a().mo24577b((Printer) new Printer() {
            public final void println(String str) {
                int i;
                if (C9864g.f26898a) {
                    C9864g.f26906i = str;
                    if (!C9864g.f26905h) {
                        C9864g.f26905h = true;
                        C9864g.f26908k = Process.myTid();
                        C9864g.m29120d();
                    }
                    C9864g.f26910m = C9864g.f26899b.get();
                    if (C9864g.f26911n != -1) {
                        long j = C9864g.f26910m - C9864g.f26911n;
                        if (j <= 0) {
                            C9864g.f26904g++;
                            return;
                        }
                        if (j == 1) {
                            if (C9864g.f26904g > 1) {
                                i = 7;
                            } else if (C9864g.f26904g == 1) {
                                i = 3;
                            } else {
                                i = 0;
                            }
                        } else if (C9864g.f26904g > 1) {
                            i = 5;
                        } else if (C9864g.f26904g == 1) {
                            i = 6;
                        } else {
                            i = 1;
                        }
                        long f = C9864g.m29122f();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (!C9864g.f26907j) {
                            C9864g.m29117a(C9864g.m29118b(), f - C9864g.f26902e, uptimeMillis - C9864g.f26903f, j, i, C9864g.f26904g, null);
                        }
                        C9864g.f26902e = f;
                        C9864g.f26903f = uptimeMillis;
                        C9864g.f26904g = 1;
                    }
                }
            }
        });
        C9952f.m29447a().mo24574a((Printer) new Printer() {
            public final void println(String str) {
                int i;
                C9864g.f26911n = C9864g.f26899b.get();
                C9864g.f26906i = "no message running";
                if (C9864g.f26910m > 0) {
                    long j = C9864g.f26911n - C9864g.f26910m;
                    if (j > 0) {
                        long f = C9864g.m29122f();
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (j == 1 && C9864g.f26904g > 1) {
                            i = 9;
                        } else if (j == 1 && C9864g.f26904g == 1) {
                            i = 2;
                        } else if (j > 1 && C9864g.f26904g > 1) {
                            i = 4;
                        } else if (j <= 1 || C9864g.f26904g != 1) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        if (!C9864g.f26907j) {
                            C9864g.m29117a(C9864g.m29118b(), f - C9864g.f26902e, uptimeMillis - C9864g.f26903f, j, i, C9864g.f26904g, str);
                        }
                        C9864g.f26902e = f;
                        C9864g.f26903f = uptimeMillis;
                        C9864g.f26904g = 0;
                        C9864g.f26910m = -1;
                    }
                }
            }
        });
        f26902e = m29122f();
        f26903f = SystemClock.uptimeMillis();
    }

    /* renamed from: j */
    private static long m29126j() {
        if (f26910m < 0) {
            return (SystemClock.uptimeMillis() - f26901d) - (f26911n * f26900c);
        }
        return (SystemClock.uptimeMillis() - f26901d) - (f26910m * f26900c);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|11|12|13|14|15|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0055 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONArray m29119c() {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.List r1 = m29124h()     // Catch:{ Throwable -> 0x0059 }
            if (r1 != 0) goto L_0x000c
            return r0
        L_0x000c:
            r2 = 0
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0059 }
        L_0x0011:
            boolean r3 = r1.hasNext()     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x0063
            java.lang.Object r3 = r1.next()     // Catch:{ Throwable -> 0x0059 }
            com.bytedance.crash.b.g$a r3 = (com.bytedance.crash.p491b.C9864g.C9870a) r3     // Catch:{ Throwable -> 0x0059 }
            if (r3 == 0) goto L_0x0011
            int r2 = r2 + 1
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0059 }
            r4.<init>()     // Catch:{ Throwable -> 0x0059 }
            java.lang.String r5 = "msg"
            java.lang.String r6 = r3.f26928g     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "cpuDuration"
            long r6 = r3.f26926e     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "duration"
            long r6 = r3.f26925d     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "tick"
            long r6 = r3.f26924c     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "type"
            int r6 = r3.f26923b     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r6)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r5 = "count"
            int r3 = r3.f26922a     // Catch:{ JSONException -> 0x0055 }
            r4.put(r5, r3)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r3 = "id"
            r4.put(r3, r2)     // Catch:{ JSONException -> 0x0055 }
        L_0x0055:
            r0.put(r4)     // Catch:{ Throwable -> 0x0059 }
            goto L_0x0011
        L_0x0059:
            r1 = move-exception
            com.bytedance.crash.e r2 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r3 = "NPTH_CATCH"
            r2.mo24453a(r3, r1)
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p491b.C9864g.m29119c():org.json.JSONArray");
    }

    /* renamed from: h */
    private static List<C9870a> m29124h() {
        if (f26913p == null) {
            return null;
        }
        f26907j = true;
        ArrayList arrayList = new ArrayList();
        if (f26913p.size() == f26912o) {
            for (int i = f26917t; i < f26913p.size(); i++) {
                arrayList.add((C9870a) f26913p.get(i));
            }
            for (int i2 = 0; i2 < f26917t; i2++) {
                arrayList.add((C9870a) f26913p.get(i2));
            }
        } else {
            arrayList.addAll(f26913p);
        }
        f26907j = false;
        return arrayList;
    }

    /* renamed from: i */
    private static MessageQueue m29125i() {
        if (f26918u == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f26918u = Looper.myQueue();
            } else if (VERSION.SDK_INT >= 23) {
                f26918u = mainLooper.getQueue();
            } else {
                try {
                    Field declaredField = mainLooper.getClass().getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    f26918u = (MessageQueue) declaredField.get(mainLooper);
                } catch (Throwable unused) {
                }
            }
        }
        return f26918u;
    }

    /* renamed from: a */
    private static Message m29110a(Message message) {
        if (f26920w == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                f26920w = declaredField;
                declaredField.setAccessible(true);
                return (Message) f26920w.get(message);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) f26920w.get(message);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    private static Message m29111a(MessageQueue messageQueue) {
        if (f26919v == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                f26919v = declaredField;
                declaredField.setAccessible(true);
                return (Message) f26919v.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        } else {
            try {
                return (Message) f26919v.get(messageQueue);
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m29113a(long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("message", f26906i);
            jSONObject.put("currentMessageCost", m29126j());
            jSONObject.put("currentMessageCpu", m29122f() - f26902e);
            jSONObject.put("currentTick", f26899b.get());
        } catch (Throwable th) {
            C9875d.m29130a().mo24453a("NPTH_CATCH", th);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m29116a(int i, int i2) {
        if (f26898a) {
            f26912o = 100;
            f26900c = 300;
            f26913p = new ArrayList();
            m29123g();
            m29111a(m29125i());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:14|15|16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x002a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONArray m29112a(int r6, long r7) {
        /*
            android.os.MessageQueue r6 = m29125i()
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r6 != 0) goto L_0x000c
            return r0
        L_0x000c:
            monitor-enter(r6)     // Catch:{ Throwable -> 0x0037 }
            android.os.Message r1 = m29111a(r6)     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            return r0
        L_0x0015:
            r2 = 0
            r3 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x0032
            r4 = 100
            if (r2 >= r4) goto L_0x0032
            int r2 = r2 + 1
            int r3 = r3 + 1
            org.json.JSONObject r4 = m29114a(r1, r7)     // Catch:{ all -> 0x0034 }
            java.lang.String r5 = "id"
            r4.put(r5, r3)     // Catch:{ JSONException -> 0x002a }
        L_0x002a:
            r0.put(r4)     // Catch:{ all -> 0x0034 }
            android.os.Message r1 = m29110a(r1)     // Catch:{ all -> 0x0034 }
            goto L_0x0017
        L_0x0032:
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            return r0
        L_0x0034:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0034 }
            throw r7     // Catch:{ Throwable -> 0x0037 }
        L_0x0037:
            r6 = move-exception
            com.bytedance.crash.e r7 = com.bytedance.crash.C9875d.m29130a()
            java.lang.String r8 = "NPTH_CATCH"
            r7.mo24453a(r8, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.p491b.C9864g.m29112a(int, long):org.json.JSONArray");
    }

    /* renamed from: a */
    private static JSONObject m29114a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            if (message.obj != null) {
                jSONObject.put("obj", message.obj);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m29117a(C9870a aVar, long j, long j2, long j3, int i, int i2, String str) {
        aVar.f26926e = j;
        aVar.f26924c = j3;
        aVar.f26925d = j2;
        aVar.f26927f = false;
        aVar.f26922a = i2;
        if (str != null) {
            aVar.f26928g = str;
        }
        aVar.f26923b = i;
    }
}
