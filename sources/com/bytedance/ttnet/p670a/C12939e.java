package com.bytedance.ttnet.p670a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.frameworks.baselib.network.dispatcher.C10094a;
import com.bytedance.frameworks.baselib.network.dispatcher.C10100e;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority;
import com.bytedance.frameworks.baselib.network.http.util.C10186f;
import com.bytedance.ttnet.C12961d;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.a.e */
public class C12939e implements C6310a {

    /* renamed from: e */
    private static C12939e f34234e;

    /* renamed from: o */
    private static final Queue<Pair<String, JSONObject>> f34235o = new LinkedBlockingQueue();

    /* renamed from: p */
    private static boolean f34236p = true;

    /* renamed from: a */
    public int f34237a = 2;

    /* renamed from: b */
    public Map<String, C12941a> f34238b = Collections.synchronizedMap(new LinkedHashMap());

    /* renamed from: c */
    public C12941a f34239c;

    /* renamed from: d */
    AtomicBoolean f34240d = new AtomicBoolean(false);

    /* renamed from: f */
    private final Context f34241f;

    /* renamed from: g */
    private final C6309f f34242g = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: h */
    private int f34243h = 1800;

    /* renamed from: i */
    private int f34244i = 60;

    /* renamed from: j */
    private long f34245j;

    /* renamed from: k */
    private C12941a f34246k;

    /* renamed from: l */
    private AtomicLong f34247l = new AtomicLong(-1);

    /* renamed from: m */
    private String f34248m = null;

    /* renamed from: n */
    private int f34249n = -1;

    /* renamed from: com.bytedance.ttnet.a.e$a */
    class C12941a {

        /* renamed from: a */
        String f34254a;

        /* renamed from: b */
        int f34255b;

        /* renamed from: c */
        int f34256c;

        /* renamed from: d */
        int f34257d = -1;

        /* renamed from: e */
        long f34258e = -1;

        /* renamed from: f */
        int f34259f = -1;

        /* renamed from: g */
        int f34260g = -1;

        /* renamed from: h */
        long f34261h = -1;

        /* renamed from: i */
        int f34262i = -1;

        /* renamed from: j */
        String f34263j = "";

        /* renamed from: b */
        public final int mo31452b() {
            if (this.f34257d != -1) {
                return this.f34257d + this.f34256c;
            }
            if (this.f34260g != -1) {
                return this.f34260g + this.f34256c;
            }
            return Integer.MAX_VALUE;
        }

        /* renamed from: a */
        public final boolean mo31451a() {
            if (this.f34257d != -1) {
                if (this.f34257d <= this.f34255b) {
                    return true;
                }
            } else if (this.f34260g != -1 && this.f34260g <= this.f34255b) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final JSONObject mo31453c() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("host", this.f34254a);
            jSONObject.put("max_time", this.f34255b);
            jSONObject.put("weight_time", this.f34256c);
            jSONObject.put("https_select_cost", this.f34257d);
            jSONObject.put("https_select_time", this.f34258e);
            jSONObject.put("https_status", this.f34259f);
            jSONObject.put("http_select_cost", this.f34260g);
            jSONObject.put("http_select_time", this.f34261h);
            jSONObject.put("http_status", this.f34262i);
            jSONObject.put("scheme", this.f34263j);
            return jSONObject;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NetChannel{host='");
            sb.append(this.f34254a);
            sb.append('\'');
            sb.append(", maxTime=");
            sb.append(this.f34255b);
            sb.append(", weightTime=");
            sb.append(this.f34256c);
            sb.append(", httpsSelectCost=");
            sb.append(this.f34257d);
            sb.append(", httpsSelectTime=");
            sb.append(this.f34258e);
            sb.append(", httpsStatus=");
            sb.append(this.f34259f);
            sb.append(", httpSelectCost=");
            sb.append(this.f34260g);
            sb.append(", httpSelectTime=");
            sb.append(this.f34261h);
            sb.append(", httpStatus=");
            sb.append(this.f34262i);
            sb.append(", scheme='");
            sb.append(this.f34263j);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        C12941a() {
        }

        /* renamed from: a */
        public final void mo31449a(C12941a aVar) {
            if (aVar != null) {
                this.f34257d = aVar.f34257d;
                this.f34258e = aVar.f34258e;
                this.f34259f = aVar.f34259f;
                this.f34260g = aVar.f34260g;
                this.f34261h = aVar.f34261h;
                this.f34262i = aVar.f34262i;
                this.f34263j = aVar.f34263j;
            }
        }

        /* renamed from: a */
        public final void mo31450a(JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f34254a = jSONObject.optString("host");
                this.f34255b = jSONObject.optInt("max_time");
                this.f34256c = jSONObject.optInt("weight_time");
                this.f34257d = jSONObject.optInt("https_select_cost", -1);
                this.f34258e = jSONObject.optLong("https_select_time", -1);
                this.f34259f = jSONObject.optInt("https_status", -1);
                this.f34260g = jSONObject.optInt("http_select_cost", -1);
                this.f34261h = jSONObject.optLong("http_select_time", -1);
                this.f34262i = jSONObject.optInt("http_status", -1);
                this.f34263j = jSONObject.optString("scheme");
            }
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=org.json.JSONObject, code=java.lang.Object, for r6v0, types: [org.json.JSONObject, java.lang.Object] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31443a(java.lang.String r3, android.content.Context r4, boolean r5, java.lang.Object r6, org.json.JSONObject r7) {
        /*
            r2 = this;
            if (r7 == 0) goto L_0x000d
            java.lang.String r5 = "from"
            r7.put(r5, r3)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r3 = "ss_net_channel_select"
            m37697a(r4, r3, r7)     // Catch:{ Throwable -> 0x006f }
            goto L_0x006f
        L_0x000d:
            if (r5 == 0) goto L_0x0042
            com.bytedance.ttnet.a.e$a r5 = r2.f34239c     // Catch:{ Throwable -> 0x006f }
            if (r5 == 0) goto L_0x0042
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x006f }
            r5.<init>()     // Catch:{ Throwable -> 0x006f }
            java.lang.String r7 = "id"
            java.util.concurrent.atomic.AtomicLong r0 = r2.f34247l     // Catch:{ Throwable -> 0x006f }
            long r0 = r0.get()     // Catch:{ Throwable -> 0x006f }
            r5.put(r7, r0)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r7 = "pre"
            if (r6 != 0) goto L_0x0029
            java.lang.String r6 = ""
        L_0x0029:
            r5.put(r7, r6)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r6 = "cur"
            com.bytedance.ttnet.a.e$a r7 = r2.f34239c     // Catch:{ Throwable -> 0x006f }
            org.json.JSONObject r7 = r7.mo31453c()     // Catch:{ Throwable -> 0x006f }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r6 = "from"
            r5.put(r6, r3)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r3 = "ss_net_channel_select"
            m37697a(r4, r3, r5)     // Catch:{ Throwable -> 0x006f }
            goto L_0x006f
        L_0x0042:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x006f }
            r5.<init>()     // Catch:{ Throwable -> 0x006f }
            java.lang.String r7 = "id"
            java.util.concurrent.atomic.AtomicLong r0 = r2.f34247l     // Catch:{ Throwable -> 0x006f }
            long r0 = r0.get()     // Catch:{ Throwable -> 0x006f }
            r5.put(r7, r0)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r7 = "pre"
            if (r6 != 0) goto L_0x0058
            java.lang.String r6 = ""
        L_0x0058:
            r5.put(r7, r6)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r6 = "all"
            org.json.JSONObject r7 = r2.m37700c()     // Catch:{ Throwable -> 0x006f }
            r5.put(r6, r7)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r6 = "from"
            r5.put(r6, r3)     // Catch:{ Throwable -> 0x006f }
            java.lang.String r3 = "ss_net_channel_select"
            m37697a(r4, r3, r5)     // Catch:{ Throwable -> 0x006f }
            return
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12939e.mo31443a(java.lang.String, android.content.Context, boolean, org.json.JSONObject, org.json.JSONObject):void");
    }

    /* renamed from: a */
    public final void mo31441a(Editor editor) {
        if (editor != null) {
            try {
                JSONObject c = m37700c();
                if (c != null) {
                    editor.putString("i_host_select", c.toString());
                    if (this.f34239c != null) {
                        editor.putString("i_host_select_netchannel_host", this.f34239c.f34254a);
                    } else {
                        editor.putString("i_host_select_netchannel_host", "");
                    }
                    editor.putInt("i_host_select_interval", this.f34243h);
                    editor.putInt("i_host_select_interval_http_timeout", this.f34244i);
                    editor.putInt("i_host_max_fail", this.f34237a);
                    editor.putLong("i_host_last_select_time", this.f34245j);
                    editor.putLong("i_host_atomic_long", this.f34247l.longValue());
                    editor.putString("i_host_last_bssid", this.f34248m);
                    editor.putInt("i_host_last_net_type", this.f34249n);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final Pair<String, String> mo31444b() {
        if (this.f34246k != null) {
            return new Pair<>(this.f34246k.f34263j, this.f34246k.f34254a);
        }
        return null;
    }

    /* renamed from: c */
    private JSONObject m37700c() {
        if (this.f34238b == null || this.f34238b.size() <= 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        synchronized (C12939e.class) {
            for (Entry entry : this.f34238b.entrySet()) {
                if (entry != null) {
                    try {
                        jSONArray.put(((C12941a) entry.getValue()).mo31453c());
                    } catch (Exception unused) {
                    }
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("i_host_list", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final Pair<String, String> mo31438a() {
        synchronized (C12939e.class) {
            if (this.f34239c == null) {
                return null;
            }
            Pair<String, String> pair = new Pair<>(this.f34239c.f34263j, this.f34239c.f34254a);
            return pair;
        }
    }

    /* renamed from: a */
    public final void mo31442a(C12941a aVar) {
        this.f34239c = aVar;
        this.f34246k = m37699b(aVar);
    }

    /* renamed from: a */
    public static C12939e m37695a(Context context) {
        if (f34234e == null) {
            synchronized (C12939e.class) {
                if (f34234e == null) {
                    f34234e = new C12939e(context);
                }
            }
        }
        return f34234e;
    }

    /* renamed from: b */
    private C12941a m37699b(C12941a aVar) {
        if (aVar == null) {
            return null;
        }
        C12941a aVar2 = new C12941a();
        aVar2.f34254a = aVar.f34254a;
        aVar2.f34255b = aVar.f34255b;
        aVar2.f34256c = aVar.f34256c;
        aVar2.mo31449a(aVar);
        return aVar2;
    }

    /* renamed from: e */
    private static int m37701e(Context context) {
        try {
            C12961d.m37772a();
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Throwable unused) {
            return -2;
        }
    }

    /* renamed from: f */
    private static String m37702f(Context context) {
        try {
            C12961d.m37772a();
            return ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getBSSID();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public final void mo31447d(Context context) {
        if (context != null) {
            try {
                synchronized (C12925a.class) {
                    Editor edit = C7285c.m22838a(context, "ss_app_config", 0).edit();
                    mo31441a(edit);
                    C9721b.m28656a(edit);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 105) {
                    mo31445b(this.f34241f);
                    this.f34242g.sendEmptyMessageDelayed(105, (long) (this.f34243h * 1000));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private C12939e(Context context) {
        this.f34241f = context;
    }

    /* renamed from: c */
    public final void mo31446c(Context context) {
        if (context != null) {
            try {
                int e = m37701e(context);
                if (e == 1) {
                    String f = m37702f(context);
                    if (f != null && !f.equals(this.f34248m)) {
                        m37696a(context, "onConnectivityChange");
                        return;
                    }
                }
                if (this.f34249n != e) {
                    m37696a(context, "onConnectivityChange");
                }
                if (System.currentTimeMillis() - this.f34245j > ((long) (this.f34243h * 1000))) {
                    m37696a(context, "onConnectivityChange");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo31445b(Context context) {
        if (context != null) {
            try {
                if (System.currentTimeMillis() - this.f34245j > ((long) (this.f34243h * 1000))) {
                    m37696a(context, "onActivityResume");
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m37696a(final Context context, final String str) {
        if (!this.f34240d.get() && this.f34238b != null && this.f34238b.size() > 0 && context != null) {
            try {
                if (C10186f.m30256b(context) && C12925a.m37625a(context).mo31423r() && C12943g.m37719a(context) && C12925a.m37625a(context).mo31416i()) {
                    final LinkedList linkedList = new LinkedList();
                    synchronized (C12939e.class) {
                        for (Entry value : this.f34238b.entrySet()) {
                            linkedList.add(value.getValue());
                        }
                    }
                    this.f34240d.getAndSet(true);
                    this.f34245j = System.currentTimeMillis();
                    this.f34242g.removeMessages(105);
                    this.f34242g.sendEmptyMessageDelayed(105, (long) (this.f34243h * 1000));
                    this.f34249n = m37701e(context);
                    if (this.f34249n == 1) {
                        this.f34248m = m37702f(context);
                    }
                    if (this.f34247l.get() >= Long.MAX_VALUE) {
                        this.f34247l.getAndSet(-1);
                    }
                    this.f34247l.getAndIncrement();
                    C10094a aVar = new C10094a("SelectThread", Priority.NORMAL, 0, new Runnable() {
                        /* JADX WARNING: Can't wrap try/catch for region: R(5:147|148|(1:150)(3:151|152|153)|154|155) */
                        /* JADX WARNING: Can't wrap try/catch for region: R(5:69|70|(1:72)(3:73|74|75)|76|77) */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x02d3 */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0194 */
                        /* JADX WARNING: Removed duplicated region for block: B:100:0x01bb A[Catch:{ Throwable -> 0x032c }] */
                        /* JADX WARNING: Removed duplicated region for block: B:108:0x01f4 A[SYNTHETIC] */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r24 = this;
                                r1 = r24
                                java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                if (r0 == 0) goto L_0x031c
                                java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                int r0 = r0.size()     // Catch:{ Throwable -> 0x032c }
                                if (r0 > 0) goto L_0x0010
                                goto L_0x031c
                            L_0x0010:
                                r3 = 0
                            L_0x0011:
                                if (r3 > 0) goto L_0x02eb
                                java.lang.String r5 = "https"
                                java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                java.util.Iterator r6 = r0.iterator()     // Catch:{ Throwable -> 0x032c }
                                r7 = 0
                                r12 = 0
                            L_0x001d:
                                boolean r0 = r6.hasNext()     // Catch:{ Throwable -> 0x032c }
                                if (r0 == 0) goto L_0x0247
                                java.lang.Object r0 = r6.next()     // Catch:{ Throwable -> 0x032c }
                                r8 = r0
                                com.bytedance.ttnet.a.e$a r8 = (com.bytedance.ttnet.p670a.C12939e.C12941a) r8     // Catch:{ Throwable -> 0x032c }
                                java.lang.String r0 = r8.f34254a     // Catch:{ Throwable -> 0x032c }
                                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x032c }
                                r9.<init>()     // Catch:{ Throwable -> 0x032c }
                                r9.append(r5)     // Catch:{ Throwable -> 0x032c }
                                java.lang.String r10 = "://"
                                r9.append(r10)     // Catch:{ Throwable -> 0x032c }
                                r9.append(r0)     // Catch:{ Throwable -> 0x032c }
                                java.lang.String r10 = "/network/get_network/"
                                r9.append(r10)     // Catch:{ Throwable -> 0x032c }
                                java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x032c }
                                long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x032c }
                                r13 = -1
                                java.lang.String r14 = "onErr"
                                java.lang.String r15 = r10     // Catch:{ Throwable -> 0x01b2 }
                                boolean r14 = r14.equals(r15)     // Catch:{ Throwable -> 0x01b2 }
                                if (r14 == 0) goto L_0x007f
                                com.bytedance.ttnet.a.e r14 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x01b2 }
                                com.bytedance.ttnet.a.e$a r14 = r14.f34239c     // Catch:{ Throwable -> 0x01b2 }
                                if (r14 == 0) goto L_0x007f
                                com.bytedance.ttnet.a.e r14 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x01b2 }
                                com.bytedance.ttnet.a.e$a r14 = r14.f34239c     // Catch:{ Throwable -> 0x01b2 }
                                java.lang.String r14 = r14.f34254a     // Catch:{ Throwable -> 0x01b2 }
                                boolean r0 = r0.equals(r14)     // Catch:{ Throwable -> 0x01b2 }
                                if (r0 == 0) goto L_0x007f
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x01b2 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ Throwable -> 0x01b2 }
                                java.lang.String r0 = r0.f34263j     // Catch:{ Throwable -> 0x01b2 }
                                boolean r0 = r5.equals(r0)     // Catch:{ Throwable -> 0x01b2 }
                                if (r0 == 0) goto L_0x007f
                                r8.f34257d = r13     // Catch:{ Throwable -> 0x01b2 }
                                r14 = -1
                                r8.f34258e = r14     // Catch:{ Throwable -> 0x01b2 }
                                r8.f34259f = r13     // Catch:{ Throwable -> 0x01b2 }
                                java.lang.String r0 = "https"
                                r8.f34263j = r0     // Catch:{ Throwable -> 0x01b2 }
                                goto L_0x001d
                            L_0x007f:
                                android.content.Context r0 = r9     // Catch:{ Throwable -> 0x01b2 }
                                boolean r0 = com.bytedance.ttnet.p670a.C12942f.m37718a(r0)     // Catch:{ Throwable -> 0x01b2 }
                                if (r0 != 0) goto L_0x0089
                                goto L_0x0247
                            L_0x0089:
                                com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Throwable -> 0x01b2 }
                                r0.mo31463a(r13, r9)     // Catch:{ Throwable -> 0x01b2 }
                                long r14 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x01b2 }
                                r0 = 0
                                long r14 = r14 - r10
                                int r0 = (int) r14     // Catch:{ Throwable -> 0x01b2 }
                                com.bytedance.ttnet.a.e r9 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x01b2 }
                                com.bytedance.ttnet.a.e$a r9 = r9.f34239c     // Catch:{ Throwable -> 0x01b2 }
                                if (r9 == 0) goto L_0x00a6
                                com.bytedance.ttnet.a.e r9 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x01b2 }
                                com.bytedance.ttnet.a.e$a r9 = r9.f34239c     // Catch:{ Throwable -> 0x01b2 }
                                org.json.JSONObject r9 = r9.mo31453c()     // Catch:{ Throwable -> 0x01b2 }
                                goto L_0x00a7
                            L_0x00a6:
                                r9 = r12
                            L_0x00a7:
                                r8.f34257d = r0     // Catch:{ Throwable -> 0x01ad }
                                r8.f34258e = r10     // Catch:{ Throwable -> 0x01ad }
                                r0 = 200(0xc8, float:2.8E-43)
                                r8.f34259f = r0     // Catch:{ Throwable -> 0x01ad }
                                long r14 = r8.f34258e     // Catch:{ Throwable -> 0x00d1 }
                                java.lang.String r0 = r8.f34254a     // Catch:{ Throwable -> 0x00d1 }
                                int r12 = r8.f34257d     // Catch:{ Throwable -> 0x00d1 }
                                java.lang.String r21 = "https"
                                int r13 = r8.f34259f     // Catch:{ Throwable -> 0x00d1 }
                                com.bytedance.ttnet.a.e r2 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x00d1 }
                                android.content.Context r4 = r9     // Catch:{ Throwable -> 0x00d1 }
                                r23 = r5
                                java.lang.String r5 = r10     // Catch:{ Throwable -> 0x00d3 }
                                r17 = r14
                                r14 = r2
                                r15 = r4
                                r16 = r5
                                r19 = r0
                                r20 = r12
                                r22 = r13
                                r14.mo31440a(r15, r16, r17, r19, r20, r21, r22)     // Catch:{ Throwable -> 0x00d3 }
                                goto L_0x00d3
                            L_0x00d1:
                                r23 = r5
                            L_0x00d3:
                                java.lang.Class<com.bytedance.ttnet.a.e> r2 = com.bytedance.ttnet.p670a.C12939e.class
                                monitor-enter(r2)     // Catch:{ Throwable -> 0x01ab }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a8 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x01a8 }
                                if (r0 == 0) goto L_0x0102
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a8 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x01a8 }
                                java.lang.String r0 = r0.f34254a     // Catch:{ all -> 0x01a8 }
                                if (r0 == 0) goto L_0x0102
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a8 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x01a8 }
                                java.lang.String r0 = r0.f34254a     // Catch:{ all -> 0x01a8 }
                                java.lang.String r4 = r8.f34254a     // Catch:{ all -> 0x01a8 }
                                boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01a8 }
                                if (r0 == 0) goto L_0x0102
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a8 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x01a8 }
                                boolean r0 = r0.mo31451a()     // Catch:{ all -> 0x01a8 }
                                if (r0 != 0) goto L_0x0102
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a8 }
                                r4 = 0
                                r0.mo31442a(r4)     // Catch:{ all -> 0x01a8 }
                            L_0x0102:
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a8 }
                                java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34238b     // Catch:{ all -> 0x01a8 }
                                java.lang.String r4 = r8.f34254a     // Catch:{ all -> 0x01a8 }
                                boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x01a8 }
                                if (r0 == 0) goto L_0x011f
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a8 }
                                java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34238b     // Catch:{ all -> 0x01a8 }
                                java.lang.String r4 = r8.f34254a     // Catch:{ all -> 0x01a8 }
                                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01a8 }
                                com.bytedance.ttnet.a.e$a r0 = (com.bytedance.ttnet.p670a.C12939e.C12941a) r0     // Catch:{ all -> 0x01a8 }
                                if (r0 == r8) goto L_0x011f
                                r0.mo31449a(r8)     // Catch:{ all -> 0x01a8 }
                            L_0x011f:
                                monitor-exit(r2)     // Catch:{ all -> 0x01a8 }
                                android.content.Context r0 = r9     // Catch:{ Throwable -> 0x01ab }
                                boolean r0 = com.bytedance.common.utility.NetworkUtils.m19545a(r0)     // Catch:{ Throwable -> 0x01ab }
                                if (r0 != 0) goto L_0x0132
                                boolean r0 = r8.mo31451a()     // Catch:{ Throwable -> 0x01ab }
                                if (r0 == 0) goto L_0x012f
                                goto L_0x0132
                            L_0x012f:
                                r12 = r9
                                goto L_0x0240
                            L_0x0132:
                                java.lang.Class<com.bytedance.ttnet.a.e> r2 = com.bytedance.ttnet.p670a.C12939e.class
                                monitor-enter(r2)     // Catch:{ Throwable -> 0x01ab }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a5 }
                                java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34238b     // Catch:{ all -> 0x01a5 }
                                java.lang.String r4 = r8.f34254a     // Catch:{ all -> 0x01a5 }
                                boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x01a5 }
                                if (r0 == 0) goto L_0x0168
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a5 }
                                java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34238b     // Catch:{ all -> 0x01a5 }
                                java.lang.String r4 = r8.f34254a     // Catch:{ all -> 0x01a5 }
                                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x01a5 }
                                com.bytedance.ttnet.a.e$a r0 = (com.bytedance.ttnet.p670a.C12939e.C12941a) r0     // Catch:{ all -> 0x01a5 }
                                java.lang.String r4 = "https"
                                r0.f34263j = r4     // Catch:{ all -> 0x01a5 }
                                com.bytedance.ttnet.a.e r4 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a5 }
                                r4.mo31442a(r0)     // Catch:{ all -> 0x01a5 }
                                com.bytedance.ttnet.a.e r14 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a5 }
                                java.lang.String r15 = r10     // Catch:{ all -> 0x01a5 }
                                android.content.Context r0 = r9     // Catch:{ all -> 0x01a5 }
                                r17 = 1
                                r19 = 0
                                r16 = r0
                                r18 = r9
                                r14.mo31443a(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01a5 }
                                goto L_0x0194
                            L_0x0168:
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x01a5 }
                                r4 = 0
                                r0.mo31442a(r4)     // Catch:{ all -> 0x01a5 }
                                org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0194 }
                                r0.<init>()     // Catch:{ Throwable -> 0x0194 }
                                java.lang.String r4 = "net_channel"
                                org.json.JSONObject r5 = r8.mo31453c()     // Catch:{ Throwable -> 0x0194 }
                                r0.put(r4, r5)     // Catch:{ Throwable -> 0x0194 }
                                java.lang.String r4 = "map_net_channel"
                                java.lang.String r5 = "null"
                                r0.put(r4, r5)     // Catch:{ Throwable -> 0x0194 }
                                com.bytedance.ttnet.a.e r14 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x0194 }
                                java.lang.String r15 = r10     // Catch:{ Throwable -> 0x0194 }
                                android.content.Context r4 = r9     // Catch:{ Throwable -> 0x0194 }
                                r17 = 0
                                r16 = r4
                                r18 = r9
                                r19 = r0
                                r14.mo31443a(r15, r16, r17, r18, r19)     // Catch:{ Throwable -> 0x0194 }
                            L_0x0194:
                                monitor-exit(r2)     // Catch:{ all -> 0x01a5 }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x01ab }
                                android.content.Context r2 = r9     // Catch:{ Throwable -> 0x01ab }
                                r0.mo31447d(r2)     // Catch:{ Throwable -> 0x01ab }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x01ab }
                                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34240d     // Catch:{ Throwable -> 0x01ab }
                                r2 = 0
                                r0.getAndSet(r2)     // Catch:{ Throwable -> 0x01ab }
                                return
                            L_0x01a5:
                                r0 = move-exception
                                monitor-exit(r2)     // Catch:{ all -> 0x01a5 }
                                throw r0     // Catch:{ Throwable -> 0x01ab }
                            L_0x01a8:
                                r0 = move-exception
                                monitor-exit(r2)     // Catch:{ all -> 0x01a8 }
                                throw r0     // Catch:{ Throwable -> 0x01ab }
                            L_0x01ab:
                                r0 = move-exception
                                goto L_0x01b0
                            L_0x01ad:
                                r0 = move-exception
                                r23 = r5
                            L_0x01b0:
                                r12 = r9
                                goto L_0x01b5
                            L_0x01b2:
                                r0 = move-exception
                                r23 = r5
                            L_0x01b5:
                                com.bytedance.ttnet.a.e r2 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x032c }
                                com.bytedance.ttnet.a.e$a r2 = r2.f34239c     // Catch:{ Throwable -> 0x032c }
                                if (r2 == 0) goto L_0x01c4
                                com.bytedance.ttnet.a.e r2 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x032c }
                                com.bytedance.ttnet.a.e$a r2 = r2.f34239c     // Catch:{ Throwable -> 0x032c }
                                org.json.JSONObject r2 = r2.mo31453c()     // Catch:{ Throwable -> 0x032c }
                                r12 = r2
                            L_0x01c4:
                                com.bytedance.ttnet.c r2 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Throwable -> 0x032c }
                                r4 = 0
                                int r0 = r2.mo31460a(r0, r4)     // Catch:{ Throwable -> 0x032c }
                                r2 = -1
                                r8.f34257d = r2     // Catch:{ Throwable -> 0x032c }
                                r8.f34258e = r10     // Catch:{ Throwable -> 0x032c }
                                r8.f34259f = r0     // Catch:{ Throwable -> 0x032c }
                                java.lang.String r2 = "https"
                                r8.f34263j = r2     // Catch:{ Throwable -> 0x032c }
                                long r4 = r8.f34258e     // Catch:{ Throwable -> 0x01f1 }
                                java.lang.String r2 = r8.f34254a     // Catch:{ Throwable -> 0x01f1 }
                                int r9 = r8.f34257d     // Catch:{ Throwable -> 0x01f1 }
                                java.lang.String r20 = "https"
                                com.bytedance.ttnet.a.e r13 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x01f1 }
                                android.content.Context r14 = r9     // Catch:{ Throwable -> 0x01f1 }
                                java.lang.String r15 = r10     // Catch:{ Throwable -> 0x01f1 }
                                r16 = r4
                                r18 = r2
                                r19 = r9
                                r21 = r0
                                r13.mo31440a(r14, r15, r16, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x01f1 }
                            L_0x01f1:
                                java.lang.Class<com.bytedance.ttnet.a.e> r2 = com.bytedance.ttnet.p670a.C12939e.class
                                monitor-enter(r2)     // Catch:{ Throwable -> 0x032c }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0244 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x0244 }
                                if (r0 == 0) goto L_0x0220
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0244 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x0244 }
                                java.lang.String r0 = r0.f34254a     // Catch:{ all -> 0x0244 }
                                if (r0 == 0) goto L_0x0220
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0244 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x0244 }
                                java.lang.String r0 = r0.f34254a     // Catch:{ all -> 0x0244 }
                                java.lang.String r4 = r8.f34254a     // Catch:{ all -> 0x0244 }
                                boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0244 }
                                if (r0 == 0) goto L_0x0220
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0244 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x0244 }
                                boolean r0 = r0.mo31451a()     // Catch:{ all -> 0x0244 }
                                if (r0 != 0) goto L_0x0220
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0244 }
                                r4 = 0
                                r0.mo31442a(r4)     // Catch:{ all -> 0x0244 }
                            L_0x0220:
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0244 }
                                java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34238b     // Catch:{ all -> 0x0244 }
                                java.lang.String r4 = r8.f34254a     // Catch:{ all -> 0x0244 }
                                boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x0244 }
                                if (r0 == 0) goto L_0x023d
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0244 }
                                java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34238b     // Catch:{ all -> 0x0244 }
                                java.lang.String r4 = r8.f34254a     // Catch:{ all -> 0x0244 }
                                java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0244 }
                                com.bytedance.ttnet.a.e$a r0 = (com.bytedance.ttnet.p670a.C12939e.C12941a) r0     // Catch:{ all -> 0x0244 }
                                if (r0 == r8) goto L_0x023d
                                r0.mo31449a(r8)     // Catch:{ all -> 0x0244 }
                            L_0x023d:
                                monitor-exit(r2)     // Catch:{ all -> 0x0244 }
                                int r7 = r7 + 1
                            L_0x0240:
                                r5 = r23
                                goto L_0x001d
                            L_0x0244:
                                r0 = move-exception
                                monitor-exit(r2)     // Catch:{ all -> 0x0244 }
                                throw r0     // Catch:{ Throwable -> 0x032c }
                            L_0x0247:
                                java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                int r0 = r0.size()     // Catch:{ Throwable -> 0x032c }
                                if (r7 == r0) goto L_0x02e7
                                java.util.List r0 = r0     // Catch:{ Throwable -> 0x032c }
                                java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x032c }
                                r2 = 0
                            L_0x0256:
                                boolean r4 = r0.hasNext()     // Catch:{ Throwable -> 0x032c }
                                if (r4 == 0) goto L_0x027c
                                java.lang.Object r4 = r0.next()     // Catch:{ Throwable -> 0x032c }
                                com.bytedance.ttnet.a.e$a r4 = (com.bytedance.ttnet.p670a.C12939e.C12941a) r4     // Catch:{ Throwable -> 0x032c }
                                if (r2 != 0) goto L_0x026f
                                int r5 = r4.mo31452b()     // Catch:{ Throwable -> 0x032c }
                                r6 = 2147483647(0x7fffffff, float:NaN)
                                if (r5 >= r6) goto L_0x026f
                            L_0x026d:
                                r2 = r4
                                goto L_0x0256
                            L_0x026f:
                                if (r2 == 0) goto L_0x0256
                                int r5 = r4.mo31452b()     // Catch:{ Throwable -> 0x032c }
                                int r6 = r2.mo31452b()     // Catch:{ Throwable -> 0x032c }
                                if (r5 >= r6) goto L_0x0256
                                goto L_0x026d
                            L_0x027c:
                                if (r2 == 0) goto L_0x02e7
                                java.lang.Class<com.bytedance.ttnet.a.e> r3 = com.bytedance.ttnet.p670a.C12939e.class
                                monitor-enter(r3)     // Catch:{ Throwable -> 0x032c }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x02e4 }
                                java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34238b     // Catch:{ all -> 0x02e4 }
                                java.lang.String r4 = r2.f34254a     // Catch:{ all -> 0x02e4 }
                                boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x02e4 }
                                if (r0 == 0) goto L_0x02ae
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x02e4 }
                                java.util.Map<java.lang.String, com.bytedance.ttnet.a.e$a> r0 = r0.f34238b     // Catch:{ all -> 0x02e4 }
                                java.lang.String r2 = r2.f34254a     // Catch:{ all -> 0x02e4 }
                                java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x02e4 }
                                com.bytedance.ttnet.a.e$a r0 = (com.bytedance.ttnet.p670a.C12939e.C12941a) r0     // Catch:{ all -> 0x02e4 }
                                java.lang.String r2 = "https"
                                r0.f34263j = r2     // Catch:{ all -> 0x02e4 }
                                com.bytedance.ttnet.a.e r2 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x02e4 }
                                r2.mo31442a(r0)     // Catch:{ all -> 0x02e4 }
                                com.bytedance.ttnet.a.e r8 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x02e4 }
                                java.lang.String r9 = r10     // Catch:{ all -> 0x02e4 }
                                android.content.Context r10 = r9     // Catch:{ all -> 0x02e4 }
                                r11 = 1
                                r13 = 0
                                r8.mo31443a(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x02e4 }
                                goto L_0x02d3
                            L_0x02ae:
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x02e4 }
                                r4 = 0
                                r0.mo31442a(r4)     // Catch:{ all -> 0x02e4 }
                                org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Throwable -> 0x02d3 }
                                r13.<init>()     // Catch:{ Throwable -> 0x02d3 }
                                java.lang.String r0 = "net_channel"
                                org.json.JSONObject r2 = r2.mo31453c()     // Catch:{ Throwable -> 0x02d3 }
                                r13.put(r0, r2)     // Catch:{ Throwable -> 0x02d3 }
                                java.lang.String r0 = "map_net_channel"
                                java.lang.String r2 = "null"
                                r13.put(r0, r2)     // Catch:{ Throwable -> 0x02d3 }
                                com.bytedance.ttnet.a.e r8 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x02d3 }
                                java.lang.String r9 = r10     // Catch:{ Throwable -> 0x02d3 }
                                android.content.Context r10 = r9     // Catch:{ Throwable -> 0x02d3 }
                                r11 = 0
                                r8.mo31443a(r9, r10, r11, r12, r13)     // Catch:{ Throwable -> 0x02d3 }
                            L_0x02d3:
                                monitor-exit(r3)     // Catch:{ all -> 0x02e4 }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x032c }
                                android.content.Context r2 = r9     // Catch:{ Throwable -> 0x032c }
                                r0.mo31447d(r2)     // Catch:{ Throwable -> 0x032c }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x032c }
                                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34240d     // Catch:{ Throwable -> 0x032c }
                                r2 = 0
                                r0.getAndSet(r2)     // Catch:{ Throwable -> 0x032c }
                                return
                            L_0x02e4:
                                r0 = move-exception
                                monitor-exit(r3)     // Catch:{ all -> 0x02e4 }
                                throw r0     // Catch:{ Throwable -> 0x032c }
                            L_0x02e7:
                                int r3 = r3 + 1
                                goto L_0x0011
                            L_0x02eb:
                                java.lang.Class<com.bytedance.ttnet.a.e> r2 = com.bytedance.ttnet.p670a.C12939e.class
                                monitor-enter(r2)     // Catch:{ Throwable -> 0x032c }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0319 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x0319 }
                                if (r0 == 0) goto L_0x02fe
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0319 }
                                com.bytedance.ttnet.a.e$a r0 = r0.f34239c     // Catch:{ all -> 0x0319 }
                                org.json.JSONObject r4 = r0.mo31453c()     // Catch:{ all -> 0x0319 }
                                r9 = r4
                                goto L_0x02ff
                            L_0x02fe:
                                r9 = 0
                            L_0x02ff:
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0319 }
                                r3 = 0
                                r0.mo31442a(r3)     // Catch:{ all -> 0x0319 }
                                com.bytedance.ttnet.a.e r5 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ all -> 0x0319 }
                                java.lang.String r6 = r10     // Catch:{ all -> 0x0319 }
                                android.content.Context r7 = r9     // Catch:{ all -> 0x0319 }
                                r8 = 0
                                r10 = 0
                                r5.mo31443a(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0319 }
                                monitor-exit(r2)     // Catch:{ all -> 0x0319 }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x032c }
                                android.content.Context r2 = r9     // Catch:{ Throwable -> 0x032c }
                                r0.mo31447d(r2)     // Catch:{ Throwable -> 0x032c }
                                goto L_0x032c
                            L_0x0319:
                                r0 = move-exception
                                monitor-exit(r2)     // Catch:{ all -> 0x0319 }
                                throw r0     // Catch:{ Throwable -> 0x032c }
                            L_0x031c:
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x032c }
                                android.content.Context r2 = r9     // Catch:{ Throwable -> 0x032c }
                                r0.mo31447d(r2)     // Catch:{ Throwable -> 0x032c }
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this     // Catch:{ Throwable -> 0x032c }
                                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34240d     // Catch:{ Throwable -> 0x032c }
                                r2 = 0
                                r0.getAndSet(r2)     // Catch:{ Throwable -> 0x032c }
                                return
                            L_0x032c:
                                com.bytedance.ttnet.a.e r0 = com.bytedance.ttnet.p670a.C12939e.this
                                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f34240d
                                r2 = 0
                                r0.getAndSet(r2)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12939e.C129401.run():void");
                        }
                    }, false);
                    C10100e.m29991b().mo24751b(aVar);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m37698a(Context context, JSONObject jSONObject) {
        if (context != null) {
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("i_host_list");
                if (jSONObject.has("i_host_last_select_time")) {
                    this.f34245j = jSONObject.optLong("i_host_last_select_time");
                }
                this.f34243h = jSONObject.optInt("i_host_select_interval", 1800);
                this.f34244i = jSONObject.optInt("i_host_select_interval_http_timeout", 60);
                this.f34237a = jSONObject.optInt("i_host_max_fail", 2);
                int length = optJSONArray.length();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (int i = 0; i < length; i++) {
                    try {
                        C12941a aVar = new C12941a();
                        aVar.mo31450a(optJSONArray.optJSONObject(i));
                        C12941a aVar2 = (C12941a) this.f34238b.get(aVar.f34254a);
                        if (aVar2 != null) {
                            aVar.mo31449a(aVar2);
                        }
                        linkedHashMap.put(aVar.f34254a, aVar);
                    } catch (Exception unused) {
                    }
                }
                synchronized (C12939e.class) {
                    this.f34238b.clear();
                    this.f34238b.putAll(linkedHashMap);
                    if (this.f34239c != null) {
                        if (!this.f34238b.containsKey(this.f34239c.f34254a)) {
                            m37696a(context, "onUpdate");
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo31439a(Context context, SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                String string = sharedPreferences.getString("i_host_select", null);
                this.f34243h = sharedPreferences.getInt("i_host_select_interval", 1800);
                this.f34244i = sharedPreferences.getInt("i_host_select_interval_http_timeout", 60);
                this.f34237a = sharedPreferences.getInt("i_host_max_fail", 2);
                this.f34245j = sharedPreferences.getLong("i_host_last_select_time", 0);
                long j = -1;
                long j2 = sharedPreferences.getLong("i_host_atomic_long", -1);
                this.f34248m = sharedPreferences.getString("i_host_last_bssid", null);
                this.f34249n = sharedPreferences.getInt("i_host_last_net_type", -1);
                if (j2 < Long.MAX_VALUE) {
                    j = j2;
                }
                if (this.f34247l != null) {
                    this.f34247l.getAndSet(j);
                }
                if (!C6319n.m19593a(string)) {
                    try {
                        m37698a(context, new JSONObject(string));
                    } catch (Throwable unused) {
                    }
                    String string2 = sharedPreferences.getString("i_host_select_netchannel_host", "");
                    if (!C6319n.m19593a(string2)) {
                        synchronized (C12939e.class) {
                            mo31442a((C12941a) this.f34238b.get(string2));
                        }
                    }
                    if (C12925a.m37625a(context).mo31423r()) {
                        m37696a(context, "onInit");
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private static void m37697a(Context context, String str, JSONObject jSONObject) {
        if (context != null && !C6319n.m19593a(str) && jSONObject != null) {
            try {
                if (f34236p) {
                    C12961d.m37772a().mo31467a(str, jSONObject);
                } else {
                    f34235o.offer(new Pair(str, jSONObject));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo31440a(Context context, String str, long j, String str2, int i, String str3, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.f34247l.get());
            jSONObject.put("from", str);
            jSONObject.put("time", j);
            jSONObject.put("host", str2);
            jSONObject.put("cost", i);
            jSONObject.put("scheme", str3);
            jSONObject.put("status", i2);
            m37697a(context, "ss_net_channel_select_result", jSONObject);
        } catch (Throwable unused) {
        }
    }
}
