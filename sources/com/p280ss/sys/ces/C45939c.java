package com.p280ss.sys.ces;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.Window;
import com.p280ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.p811a.p812a.C18875a;
import com.p280ss.p811a.p813b.C18881a;
import com.p280ss.p811a.p813b.C18886e;
import com.p280ss.p811a.p813b.C18889h;
import com.p280ss.sys.ces.out.ISdk;
import com.p280ss.sys.ces.out.ISdkNM;
import com.p280ss.sys.ces.p1802a.C45929a;
import com.p280ss.sys.ces.p1802a.C45930b;
import com.p280ss.sys.ces.p1802a.C45932c;
import com.p280ss.sys.ces.p1802a.C45933d;
import com.p280ss.sys.ces.p1802a.C45934e;
import com.p280ss.sys.ces.p1802a.C45935f;
import com.p280ss.sys.ces.p1803b.C45937a;
import com.p280ss.sys.ces.p1803b.C45938b;
import com.p280ss.sys.ces.p1804c.C45944b;
import com.p280ss.sys.ces.p1804c.C45949f;
import com.p280ss.sys.ces.p1805gg.C45959tt;
import com.p280ss.sys.ces.utils.NetInterface;
import com.p280ss.sys.p1799a.C45923a;
import com.p280ss.sys.p1799a.p1800a.C45924a;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ces.c */
public class C45939c extends Thread implements ISdk {

    /* renamed from: b */
    public static boolean f117415b = true;

    /* renamed from: c */
    public static int f117416c = -1;

    /* renamed from: k */
    public static boolean f117417k = false;

    /* renamed from: l */
    public static boolean f117418l = false;

    /* renamed from: n */
    static final /* synthetic */ boolean f117419n = (!C45939c.class.desiredAssertionStatus());

    /* renamed from: o */
    private static volatile ISdkNM f117420o = null;

    /* renamed from: p */
    private static volatile C45939c f117421p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public static boolean f117422q = false;

    /* renamed from: r */
    private static Map<String, Object> f117423r;

    /* renamed from: a */
    public boolean f117424a;

    /* renamed from: d */
    public Context f117425d;

    /* renamed from: e */
    public long f117426e;

    /* renamed from: f */
    public String f117427f = "";

    /* renamed from: g */
    public String f117428g = "";

    /* renamed from: h */
    public String f117429h = "";

    /* renamed from: i */
    public String f117430i = "";

    /* renamed from: j */
    public boolean f117431j;

    /* renamed from: m */
    public boolean f117432m;

    private C45939c(Context context, long j) {
        setName("CZL-MLP");
        this.f117425d = context;
        this.f117426e = j;
    }

    /* renamed from: a */
    public static C45939c m144077a() {
        return f117421p;
    }

    /* renamed from: a */
    public static C45939c m144078a(Context context, long j, int i) {
        if (f117421p == null) {
            synchronized (C45939c.class) {
                if (f117421p == null) {
                    if (context == null) {
                        context = C45929a.m144044b().getApplicationContext();
                    }
                    if (context == null) {
                        return null;
                    }
                    f117421p = new C45939c(context, j);
                }
                C18875a.m61608a(i);
                C18875a.m61611b((int) m144082b());
                C18886e.m61651a(context, "cms");
                C45959tt.init_gorgon();
                m144080a(context);
                m144083b(context);
            }
        }
        return f117421p;
    }

    /* renamed from: a */
    public static void m144079a(int i, Object obj) {
        if (obj != null) {
            switch (i) {
                case 3:
                    MotionEvent motionEvent = (MotionEvent) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append(motionEvent.getToolType(0));
                    C45928a.meta(137, null, sb.toString());
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private static void m144080a(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append((int) m144082b());
        C45928a.meta(102, null, sb.toString());
        C45928a.meta(BaseNotice.HASHTAG, null, "1");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m144084c());
        C45928a.meta(1020, null, sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C45929a.m144043b(context));
        C45928a.meta(105, null, sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C45929a.m144042a(context));
        C45928a.meta(106, null, sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C45929a.m144046c(context));
        C45928a.meta(107, null, sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(C45929a.m144048d(context));
        C45928a.meta(108, null, sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(C45929a.m144045c());
        C45928a.meta(109, null, sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(C45929a.m144047d());
        C45928a.meta(OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, null, sb8.toString());
    }

    /* renamed from: b */
    public static long m144082b() {
        return m144077a().f117426e;
    }

    /* renamed from: b */
    private static void m144083b(final Context context) {
        new Thread("0.6.10.25.17-IH-Ov") {
            public final void run() {
                Context context = context;
                StringBuilder sb = new StringBuilder();
                sb.append(Thread.currentThread().getId());
                C45928a.meta(100, context, sb.toString());
            }
        }.start();
    }

    /* renamed from: c */
    public static String m144084c() {
        return m144077a().f117427f;
    }

    /* renamed from: d */
    public static String m144085d() {
        return m144077a().f117429h;
    }

    /* renamed from: e */
    public static String m144086e() {
        return m144077a().f117430i;
    }

    /* renamed from: f */
    public static String m144087f() {
        return m144077a().f117428g;
    }

    /* renamed from: g */
    public static ISdkNM m144088g() {
        return f117420o;
    }

    /* renamed from: h */
    public static int m144089h() {
        try {
            return C45929a.m144041a() != null ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: i */
    private void m144090i() {
        C45923a.m144033a().mo111208a(this.f117425d, m144082b(), new C45924a() {
            /* renamed from: a */
            public final void mo111209a(String str) {
                C45939c.f117422q = true;
            }
        });
    }

    public void InitSelas() {
        m144090i();
    }

    public void SetRegionType(int i) {
        C18875a.m61608a(i);
    }

    /* renamed from: a */
    public final void mo111244a(String str) {
        try {
            if (m144077a().f117424a) {
                Calendar.getInstance().getTimeInMillis();
            }
            byte[] bArr = (byte[]) C45928a.meta(222, this.f117425d, str);
            if (m144077a().f117424a) {
                Calendar.getInstance().getTimeInMillis();
            }
            if (bArr == null || bArr.length <= 0) {
                throw new NullPointerException("NullPointerException");
            }
            if (f117415b) {
                try {
                    new C45949f(this.f117425d, this.f117428g, 0).mo111270a(bArr);
                } catch (Throwable unused) {
                }
            } else {
                new C45944b(this.f117425d, this.f117428g, 0).mo50246a(1, 2, bArr);
            }
            if (m144088g() != null) {
                if (f117415b) {
                    new C45949f(this.f117425d, this.f117428g, 1).mo111270a(bArr);
                    return;
                }
                new C45944b(this.f117425d, this.f117428g, 1).mo50246a(1, 2, bArr);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    public final Object mo111245b(int i, Object obj) {
        Object obj2;
        String str;
        if (i == 123) {
            return C45934e.m144063a(this.f117425d);
        }
        if (i == 121) {
            return C45932c.m144057c(this.f117425d);
        }
        if (i == 122) {
            return C45932c.m144054a();
        }
        if (i == 126) {
            return C45932c.m144058d(this.f117425d);
        }
        if (i == 127) {
            return C45932c.m144055a(this.f117425d);
        }
        if (i == 128) {
            return C45932c.m144056b(this.f117425d);
        }
        if (i == 120) {
            return C45930b.m144049a();
        }
        if (i == 124) {
            return C45935f.m144067b(this.f117425d);
        }
        if (i == 130) {
            return C45935f.m144066a(this.f117425d);
        }
        if (i == 125) {
            return C45935f.m144068c(this.f117425d);
        }
        if (i == 226) {
            return C45935f.m144069d(this.f117425d);
        }
        if (i == 129) {
            return C45933d.m144059a(this.f117425d);
        }
        if (i == 131) {
            return C45923a.m144034b();
        }
        if (i == 132) {
            reportNow((String) obj);
            return null;
        } else if (i == 134) {
            return C45937a.m144071a(this.f117425d).mo111216b();
        } else {
            if (i == 133) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Entry entry : f117423r.entrySet()) {
                        if (entry.getValue() == null) {
                            jSONObject.put((String) entry.getKey(), "");
                        } else {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    str = jSONObject.toString();
                } catch (Throwable unused) {
                    str = null;
                }
                obj2 = str == null ? "{}" : str.trim();
            } else if (i == 135) {
                return C45957f.m144122a();
            } else {
                if (i == 136) {
                    try {
                        obj2 = this.f117425d.getPackageManager().getPackageInfo(this.f117425d.getPackageName(), 64).signatures[0].toByteArray();
                    } catch (Throwable unused2) {
                        return null;
                    }
                } else if (i != 138) {
                    return null;
                } else {
                    try {
                        Window window = C45929a.m144041a().getWindow();
                        if (window == null) {
                            return null;
                        }
                        window.setCallback(new C45938b(window.getCallback()));
                        f117416c = 1;
                        return null;
                    } catch (Throwable unused3) {
                        f117416c = 0;
                        return null;
                    }
                }
            }
            return obj2;
        }
    }

    public String debugEntry(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return (String) C45928a.meta(1024768, context, sb.toString());
    }

    public byte[] decodeMillion(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr2.length == 0) {
            return new byte[0];
        }
        if (f117419n || bArr.length == 16) {
            return (byte[]) C45928a.meta(C28539a.f75176k, null, C18881a.m61634a(bArr, bArr2));
        }
        throw new AssertionError();
    }

    public byte[] encode(byte[] bArr) {
        return C45928a.encode(bArr);
    }

    public byte[] encodeMillion(byte[] bArr, byte[] bArr2) {
        return new byte[0];
    }

    public int isUseTTNet(boolean z) {
        f117415b = z;
        return 1;
    }

    public String onEvent() {
        return C45923a.m144034b();
    }

    public String pullSg() {
        return C45957f.m144122a();
    }

    public String pullVer(String str) {
        return C45957f.m144123a(str);
    }

    public void reportNow(final String str) {
        try {
            new Thread("CZL-MRP_T") {
                public final void run() {
                    C45939c.this.mo111244a(str);
                }
            }.start();
        } catch (Throwable unused) {
        }
    }

    public void reportNow(String str, boolean z) {
        if (!z) {
            reportNow(str);
        } else {
            mo111244a(str);
        }
    }

    public void run() {
        this.f117432m = true;
        StringBuilder sb = new StringBuilder();
        sb.append(VERSION.SDK_INT);
        C45928a.meta(111, null, sb.toString());
        C45937a.m144071a(this.f117425d).mo111215a();
        C45958g.m144125a(this.f117425d, 3);
        m144090i();
        int i = 0;
        while (true) {
            i++;
            C18889h.m61656a(60000);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Thread.currentThread().getName());
            sb2.append("-");
            sb2.append(i);
            C45928a.meta(1213, null, sb2.toString());
            if (C45951d.m144111a()) {
                C45958g.m144125a(this.f117425d, 3);
            }
            if (C45951d.m144113b()) {
                reportNow("CZL-MRP_L", true);
            }
            if (C45951d.m144115c()) {
                C45937a.m144071a(this.f117425d).mo111215a();
            }
        }
    }

    public void setCustomInfo(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            f117423r = hashMap;
        }
    }

    public void setEfficientDebug(boolean z) {
        this.f117424a = z;
    }

    public void setInterface(NetInterface netInterface) {
    }

    public void setNMSdkExpandInstance(ISdkNM iSdkNM) {
        f117420o = iSdkNM;
    }

    public void setNetwork(boolean z) {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:2|3|4|(1:8)|(1:12)|13|(2:17|18)|19|20) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setParams(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.Class<com.ss.sys.ces.c> r0 = com.p280ss.sys.ces.C45939c.class
            monitor-enter(r0)
            r1 = 1
            r3.f117431j = r1     // Catch:{ all -> 0x0034 }
            r1 = 0
            if (r4 == 0) goto L_0x0016
            int r2 = r4.length()     // Catch:{ all -> 0x0034 }
            if (r2 <= 0) goto L_0x0016
            r3.f117429h = r4     // Catch:{ all -> 0x0034 }
            r2 = 103(0x67, float:1.44E-43)
            com.p280ss.sys.ces.C45928a.meta(r2, r1, r4)     // Catch:{ all -> 0x0034 }
        L_0x0016:
            if (r5 == 0) goto L_0x0025
            int r4 = r5.length()     // Catch:{ all -> 0x0034 }
            if (r4 <= 0) goto L_0x0025
            r3.f117430i = r5     // Catch:{ all -> 0x0034 }
            r4 = 104(0x68, float:1.46E-43)
            com.p280ss.sys.ces.C45928a.meta(r4, r1, r5)     // Catch:{ all -> 0x0034 }
        L_0x0025:
            boolean r4 = r3.isAlive()     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x002f
            boolean r4 = r3.f117432m     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
        L_0x002f:
            r3.start()     // Catch:{ Throwable -> 0x0032 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.sys.ces.C45939c.setParams(java.lang.String, java.lang.String):void");
    }

    public void setSession(String str) {
        if (str != null && str.length() > 0) {
            synchronized (this) {
                if (this.f117428g.length() <= 0 || !str.equals(this.f117428g)) {
                    this.f117428g = str;
                }
            }
        }
    }

    public void setUrlInterface(int i, String str) {
        if (str != null && str.length() > 0) {
            C18875a.m61609a(i, str);
        }
    }
}
