package com.bytedance.ttnet.p670a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Message;
import android.webkit.CookieManager;
import com.bytedance.common.p477a.C9675e;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.common.utility.p254b.C9714c;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.frameworks.baselib.network.connectionclass.C10087c;
import com.bytedance.frameworks.baselib.network.connectionclass.C10087c.C10089b;
import com.bytedance.frameworks.baselib.network.http.C10122c;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10145c;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10147e;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10149g;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10150h;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.C10127b;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.C10128c;
import com.bytedance.frameworks.baselib.network.http.impl.C10156a;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e;
import com.bytedance.frameworks.baselib.network.http.util.C10182b;
import com.bytedance.frameworks.baselib.network.http.util.C10184d;
import com.bytedance.frameworks.baselib.network.http.util.C10186f;
import com.bytedance.frameworks.baselib.network.http.util.C10189i;
import com.bytedance.frameworks.core.encrypt.C6367a;
import com.bytedance.frameworks.core.encrypt.C6367a.C6368a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.SsHttpCall.C12448a;
import com.bytedance.ttnet.C12924a;
import com.bytedance.ttnet.C12947b;
import com.bytedance.ttnet.C12947b.C12950b;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.encrypt.C12980c;
import com.bytedance.ttnet.encrypt.C12980c.C12981a;
import com.bytedance.ttnet.hostmonitor.C12987b;
import com.bytedance.ttnet.hostmonitor.C12988c;
import com.bytedance.ttnet.hostmonitor.HostMonitorBroadcastReceiver;
import com.bytedance.ttnet.hostmonitor.HostStatus;
import com.bytedance.ttnet.p671c.C12960e;
import com.bytedance.ttnet.retrofit.C12990a;
import com.bytedance.ttnet.utils.C13006h;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.a.a */
public class C12925a implements C6310a, C10089b, C10127b, C10128c, C10145c, C10147e, C10149g, C10150h, C6368a, C12448a, C12950b, C12981a {

    /* renamed from: a */
    public static boolean f34136a = false;

    /* renamed from: ai */
    private static int f34137ai = 1;

    /* renamed from: aj */
    private static int f34138aj = 1;

    /* renamed from: ak */
    private static int f34139ak = 1;

    /* renamed from: al */
    private static int f34140al = 1;

    /* renamed from: am */
    private static int f34141am = 1;

    /* renamed from: an */
    private static int f34142an = -1;

    /* renamed from: ao */
    private static int f34143ao = -1;

    /* renamed from: at */
    private static int f34144at = -1;

    /* renamed from: au */
    private static boolean f34145au = false;

    /* renamed from: av */
    private static boolean f34146av = false;

    /* renamed from: d */
    public static int f34147d = 3;

    /* renamed from: j */
    static boolean f34148j;

    /* renamed from: k */
    static boolean f34149k;

    /* renamed from: l */
    private static C12925a f34150l;

    /* renamed from: m */
    private static int f34151m;

    /* renamed from: n */
    private static int f34152n;

    /* renamed from: A */
    private HashMap<C12934a, C12934a> f34153A;

    /* renamed from: B */
    private HashMap<String, String> f34154B = new HashMap<>();

    /* renamed from: C */
    private HashMap<String, String> f34155C = new HashMap<>();

    /* renamed from: D */
    private String f34156D = "";

    /* renamed from: E */
    private int f34157E = 0;

    /* renamed from: F */
    private int f34158F = 0;

    /* renamed from: G */
    private int f34159G = 0;

    /* renamed from: H */
    private int f34160H = 0;

    /* renamed from: I */
    private long f34161I = 0;

    /* renamed from: J */
    private int f34162J = 0;

    /* renamed from: K */
    private int f34163K = 0;

    /* renamed from: L */
    private int f34164L = 1;

    /* renamed from: M */
    private int f34165M = 1;

    /* renamed from: N */
    private int f34166N = 0;

    /* renamed from: O */
    private int f34167O = 1;

    /* renamed from: P */
    private int f34168P = 1;

    /* renamed from: Q */
    private int f34169Q = 0;

    /* renamed from: R */
    private int f34170R = 1;

    /* renamed from: S */
    private int f34171S = 1;

    /* renamed from: T */
    private int f34172T = 1;

    /* renamed from: U */
    private int f34173U = 1;

    /* renamed from: V */
    private int f34174V = 1;

    /* renamed from: W */
    private int f34175W = 1;

    /* renamed from: X */
    private int f34176X = 1;

    /* renamed from: Y */
    private int f34177Y = 1;

    /* renamed from: Z */
    private int f34178Z = 0;

    /* renamed from: aa */
    private Set<String> f34179aa;

    /* renamed from: ab */
    private int f34180ab = 600000;

    /* renamed from: ac */
    private String f34181ac = "";

    /* renamed from: ad */
    private String f34182ad = "";

    /* renamed from: ae */
    private Set<String> f34183ae = new HashSet();

    /* renamed from: af */
    private List<String> f34184af = new CopyOnWriteArrayList();

    /* renamed from: ag */
    private int f34185ag = 0;

    /* renamed from: ah */
    private int f34186ah = 0;

    /* renamed from: ap */
    private volatile int f34187ap;

    /* renamed from: aq */
    private volatile C9675e f34188aq = null;

    /* renamed from: ar */
    private C12988c f34189ar;

    /* renamed from: as */
    private C12987b f34190as;

    /* renamed from: b */
    public final Context f34191b;

    /* renamed from: c */
    public Map<C12934a, C12934a> f34192c;

    /* renamed from: e */
    public int f34193e = 0;

    /* renamed from: f */
    public volatile C12939e f34194f = null;

    /* renamed from: g */
    final C6309f f34195g = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: h */
    public int f34196h;

    /* renamed from: i */
    final HostMonitorBroadcastReceiver f34197i = new HostMonitorBroadcastReceiver() {
        /* renamed from: a */
        public final void mo31425a(HostStatus hostStatus) {
            if (hostStatus != null) {
                try {
                    if (C10186f.m30256b(C12925a.this.f34191b)) {
                        super.mo31425a(hostStatus);
                        if (hostStatus.f34383d) {
                            if (C12925a.this.f34194f != null) {
                                C12925a.this.f34194f.mo31446c(C12925a.this.f34191b);
                            }
                            if (hostStatus.mo31511a()) {
                                C12925a.this.mo31424t();
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: o */
    private final boolean f34198o;

    /* renamed from: p */
    private volatile boolean f34199p;

    /* renamed from: q */
    private boolean f34200q = true;

    /* renamed from: r */
    private boolean f34201r;

    /* renamed from: s */
    private long f34202s;

    /* renamed from: t */
    private long f34203t;

    /* renamed from: u */
    private AtomicBoolean f34204u = new AtomicBoolean(false);

    /* renamed from: v */
    private volatile boolean f34205v = false;

    /* renamed from: w */
    private HashMap<String, String> f34206w = new HashMap<>();

    /* renamed from: x */
    private HashMap<String, String> f34207x = new HashMap<>();

    /* renamed from: y */
    private Map<String, String> f34208y = new HashMap();

    /* renamed from: z */
    private HashMap<String, InetAddress[]> f34209z;

    /* renamed from: com.bytedance.ttnet.a.a$a */
    static class C12934a {

        /* renamed from: a */
        static String f34221a = "url_regex";

        /* renamed from: b */
        static String f34222b = "err_count";

        /* renamed from: c */
        String f34223c;

        /* renamed from: d */
        Matcher f34224d;

        /* renamed from: e */
        int f34225e;

        C12934a() {
        }

        public final int hashCode() {
            return this.f34223c.hashCode();
        }

        /* renamed from: a */
        public final boolean mo31428a() {
            if (this.f34225e <= C12925a.f34147d) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo31427a(String str) {
            if (!C6319n.m19593a(str)) {
                this.f34223c = str;
                this.f34224d = Pattern.compile(str).matcher("");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo31429b(String str) {
            if (!C6319n.m19593a(str) && this.f34224d != null) {
                return this.f34224d.reset(str).matches();
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.f34223c.equals(((C12934a) obj).f34223c);
        }
    }

    /* renamed from: com.bytedance.ttnet.a.a$b */
    static final class C12935b extends BroadcastReceiver {
        C12935b() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG".equals(intent.getAction())) {
                C12946i.m37726i().mo31457j();
            }
        }
    }

    /* renamed from: n */
    public static boolean m37644n() {
        return C12936b.m37683a();
    }

    /* renamed from: q */
    public final Set<String> mo31422q() {
        return this.f34179aa;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return m37643j(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.net.InetAddress> mo24808a(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0040
            boolean r0 = r2.f34198o
            if (r0 != 0) goto L_0x000c
            goto L_0x0040
        L_0x000c:
            r2.mo31419l()
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.f34209z     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x001d
            java.util.HashMap<java.lang.String, java.net.InetAddress[]> r0 = r2.f34209z     // Catch:{ all -> 0x003d }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x003d }
            r1 = r0
            java.net.InetAddress[] r1 = (java.net.InetAddress[]) r1     // Catch:{ all -> 0x003d }
        L_0x001d:
            if (r1 == 0) goto L_0x0037
            int r0 = r1.length     // Catch:{ all -> 0x003d }
            if (r0 <= 0) goto L_0x0037
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x003d }
            r3.<init>()     // Catch:{ all -> 0x003d }
            java.util.List r0 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x003d }
            r3.addAll(r0)     // Catch:{ all -> 0x003d }
            int r0 = f34144at     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0035
            java.util.Collections.shuffle(r3)     // Catch:{ all -> 0x003d }
        L_0x0035:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            return r3
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            java.util.List r3 = r2.m37643j(r3)
            return r3
        L_0x003d:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003d }
            throw r3
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12925a.mo24808a(java.lang.String):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:15|16|(1:18)(1:19)|(1:24)(1:23)|25|26|(2:33|(5:35|36|37|38|39))|41|42) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[Catch:{ Throwable -> 0x00e0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3 A[Catch:{ Throwable -> 0x00e0 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo24807a(java.lang.String r10, com.bytedance.frameworks.baselib.network.http.C10122c r11) {
        /*
            r9 = this;
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r10)
            if (r0 == 0) goto L_0x0007
            return r10
        L_0x0007:
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.C10189i.m30260a(r10)     // Catch:{ Throwable -> 0x00e0 }
            r1 = 0
            java.net.URI r0 = r9.m37628a(r0, r1)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r2 = r0.getHost()     // Catch:{ Throwable -> 0x00e0 }
            int r3 = r0.getPort()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r4 = r0.getScheme()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String[] r5 = m37646s()     // Catch:{ Throwable -> 0x00e0 }
            int r6 = r5.length     // Catch:{ Throwable -> 0x00e0 }
            r7 = 0
        L_0x0022:
            if (r7 >= r6) goto L_0x0030
            r8 = r5[r7]     // Catch:{ Throwable -> 0x00e0 }
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x00e0 }
            if (r8 == 0) goto L_0x002d
            return r10
        L_0x002d:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0030:
            boolean r5 = r9.f34198o     // Catch:{ Throwable -> 0x00e0 }
            if (r5 == 0) goto L_0x0038
            r9.mo31419l()     // Catch:{ Throwable -> 0x00e0 }
            goto L_0x003b
        L_0x0038:
            r9.mo31418k()     // Catch:{ Throwable -> 0x00e0 }
        L_0x003b:
            monitor-enter(r9)     // Catch:{ Throwable -> 0x00e0 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f34208y     // Catch:{ all -> 0x00dd }
            r6 = 0
            if (r5 == 0) goto L_0x004a
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f34208y     // Catch:{ all -> 0x00dd }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00dd }
            goto L_0x004b
        L_0x004a:
            r5 = r6
        L_0x004b:
            if (r5 == 0) goto L_0x005a
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.f34206w     // Catch:{ all -> 0x00dd }
            if (r7 == 0) goto L_0x005a
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.f34206w     // Catch:{ all -> 0x00dd }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ all -> 0x00dd }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00dd }
            goto L_0x005b
        L_0x005a:
            r5 = r6
        L_0x005b:
            java.lang.String r7 = com.bytedance.ttnet.C12924a.m37621a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r7 = com.bytedance.ttnet.C12924a.m37622a(r7)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r7.equals(r2)     // Catch:{ Throwable -> 0x008f }
            if (r2 != 0) goto L_0x0079
            if (r5 == 0) goto L_0x008f
            java.lang.String r2 = com.bytedance.ttnet.C12924a.m37621a()     // Catch:{ Throwable -> 0x008f }
            java.lang.String r2 = com.bytedance.ttnet.C12924a.m37622a(r2)     // Catch:{ Throwable -> 0x008f }
            boolean r2 = r2.equals(r5)     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
        L_0x0079:
            com.bytedance.ttnet.a.e r2 = r9.f34194f     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
            com.bytedance.ttnet.a.e r2 = r9.f34194f     // Catch:{ Throwable -> 0x008f }
            android.util.Pair r2 = r2.mo31438a()     // Catch:{ Throwable -> 0x008f }
            if (r2 == 0) goto L_0x008f
            java.lang.Object r7 = r2.first     // Catch:{ Throwable -> 0x008f }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x008f }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x008e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x008e }
            r5 = r2
        L_0x008e:
            r6 = r7
        L_0x008f:
            monitor-exit(r9)     // Catch:{ all -> 0x00dd }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ Throwable -> 0x00e0 }
            if (r2 != 0) goto L_0x009f
            com.bytedance.frameworks.baselib.network.http.util.b r2 = new com.bytedance.frameworks.baselib.network.http.util.b     // Catch:{ Throwable -> 0x00e0 }
            r2.<init>(r5, r3, r4)     // Catch:{ Throwable -> 0x00e0 }
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.C10189i.m30262a(r0, r2)     // Catch:{ Throwable -> 0x00e0 }
        L_0x009f:
            java.lang.String r11 = r9.m37626a(r0, r11, r6, r1)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r0 = "?"
            boolean r0 = r11.contains(r0)     // Catch:{ Throwable -> 0x00e0 }
            if (r0 != 0) goto L_0x00cc
            java.lang.String r0 = "?"
            boolean r0 = r10.contains(r0)     // Catch:{ Throwable -> 0x00e0 }
            if (r0 == 0) goto L_0x00cc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00e0 }
            r0.<init>()     // Catch:{ Throwable -> 0x00e0 }
            r0.append(r11)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r11 = "?"
            int r11 = r10.indexOf(r11)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r11 = r10.substring(r11)     // Catch:{ Throwable -> 0x00e0 }
            r0.append(r11)     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r11 = r0.toString()     // Catch:{ Throwable -> 0x00e0 }
        L_0x00cc:
            r10 = r11
            boolean r11 = com.bytedance.ttnet.C12947b.m37743a()     // Catch:{ Throwable -> 0x00e0 }
            if (r11 != 0) goto L_0x00e0
            com.bytedance.ttnet.d.c r11 = com.bytedance.ttnet.p672d.C12971c.m37800a()     // Catch:{ Throwable -> 0x00e0 }
            java.lang.String r11 = r11.mo31489a(r10)     // Catch:{ Throwable -> 0x00e0 }
            r10 = r11
            goto L_0x00e0
        L_0x00dd:
            r11 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00dd }
            throw r11     // Catch:{ Throwable -> 0x00e0 }
        L_0x00e0:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12925a.mo24807a(java.lang.String, com.bytedance.frameworks.baselib.network.http.c):java.lang.String");
    }

    /* renamed from: a */
    private static boolean m37633a(HashMap<String, String> hashMap, JSONObject jSONObject) throws JSONException {
        Matcher matcher = Pattern.compile("^([0-9a-zA-Z-]{1,40}\\.){1,5}[0-9a-zA-Z]{1,20}$").matcher("");
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String string = jSONObject.getString(str);
            if (C6319n.m19593a(str) || !matcher.reset(string).matches()) {
                return false;
            }
            hashMap.put(str, string);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo24791a() {
        SharedPreferences a = C7285c.m22838a(this.f34191b, "ss_app_config", 0);
        this.f34160H = a.getInt("chromium_boot_failures", 0);
        this.f34161I = a.getLong("chromium_boot_failures_timestamp", 0);
        if (this.f34160H > 3 && System.currentTimeMillis() - this.f34161I > TimeUnit.DAYS.toMillis(1)) {
            this.f34160H = 3;
        }
        if (!mo31415h()) {
            return false;
        }
        Editor edit = a.edit();
        edit.putInt("chromium_boot_failures", this.f34160H + 1);
        edit.putLong("chromium_boot_failures_timestamp", System.currentTimeMillis());
        C9721b.m28656a(edit);
        C9714c.m28652b().schedule(new Runnable() {
            public final void run() {
                try {
                    synchronized (C12925a.this) {
                        Editor edit = C7285c.m22838a(C12925a.this.f34191b, "ss_app_config", 0).edit();
                        edit.putInt("chromium_boot_failures", 0);
                        C9721b.m28656a(edit);
                    }
                } catch (Throwable unused) {
                }
            }
        }, 10, TimeUnit.SECONDS);
        return true;
    }

    /* renamed from: a */
    private boolean m37632a(String str, C12934a[] aVarArr, boolean z) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        Map map = this.f34192c;
        if (z) {
            map = this.f34153A;
        }
        if (map != null && map.size() > 0) {
            for (C12934a aVar : map.keySet()) {
                if (aVar.mo31429b(str)) {
                    aVarArr[0] = aVar;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(22:126|127|(1:129)(1:130)|131|(1:133)|134|(1:136)(1:137)|138|(3:140|(2:142|195)(2:143|194)|144)|193|145|(1:149)|150|151|152|(1:156)|157|158|159|160|163|164) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x05a0 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0297  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x02ed A[SYNTHETIC, Splitter:B:121:0x02ed] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x030e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x05c0  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05ca  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m37631a(java.lang.Object r65) throws java.lang.Exception {
        /*
            r64 = this;
            r1 = r64
            r0 = r65
            boolean r2 = r0 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L_0x0026
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r0)
            if (r2 == 0) goto L_0x0012
            return r3
        L_0x0012:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r0)
            java.lang.String r0 = "message"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r4 = "success"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x002f
            return r3
        L_0x0026:
            boolean r2 = r0 instanceof org.json.JSONObject
            if (r2 == 0) goto L_0x002e
            r2 = r0
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            if (r2 != 0) goto L_0x0032
            return r3
        L_0x0032:
            java.lang.String r0 = "data"
            org.json.JSONObject r2 = r2.getJSONObject(r0)
            java.lang.String r0 = "mapping"
            org.json.JSONObject r0 = r2.optJSONObject(r0)
            if (r0 != 0) goto L_0x0045
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0045:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            boolean r5 = m37633a(r4, r0)
            r6 = 1
            if (r5 == 0) goto L_0x0064
            monitor-enter(r64)
            r1.f34206w = r4     // Catch:{ all -> 0x0061 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0061 }
            r5.<init>()     // Catch:{ all -> 0x0061 }
            r5.putAll(r4)     // Catch:{ all -> 0x0061 }
            r1.f34207x = r5     // Catch:{ all -> 0x0061 }
            monitor-exit(r64)     // Catch:{ all -> 0x0061 }
            r4 = 1
            goto L_0x0065
        L_0x0061:
            r0 = move-exception
            monitor-exit(r64)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x0064:
            r4 = 0
        L_0x0065:
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "dns_mapping"
            org.json.JSONArray r0 = r2.optJSONArray(r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            m37636b(r7, r0)
            java.lang.String r8 = ""
            if (r0 == 0) goto L_0x0085
            int r9 = r7.size()
            if (r9 <= 0) goto L_0x0085
            java.lang.String r8 = r0.toString()
        L_0x0085:
            java.lang.String r0 = "shuffle_dns"
            int r0 = r2.optInt(r0)
            f34144at = r0
            java.lang.String r0 = "use_dns_mapping"
            r9 = -1
            int r0 = r2.optInt(r0, r9)
            com.bytedance.frameworks.baselib.network.http.C10142f.m30100a(r0)
            java.lang.String r0 = "use_http_dns"
            int r0 = r2.optInt(r0, r9)
            f34142an = r0
            java.lang.String r0 = "collect_recent_page_info_enable"
            int r0 = r2.optInt(r0, r9)
            f34143ao = r0
            monitor-enter(r64)
            r1.f34209z = r7     // Catch:{ all -> 0x05e6 }
            monitor-exit(r64)     // Catch:{ all -> 0x05e6 }
            java.lang.String r0 = "https_dns_err_max"
            r7 = 3
            int r7 = r2.optInt(r0, r7)
            java.lang.String r0 = "https_dns_err_policy"
            int r9 = r2.optInt(r0, r3)
            java.lang.String r0 = "hs_open"
            int r10 = r2.optInt(r0, r3)
            java.lang.String r0 = "ok_http_open"
            int r11 = r2.optInt(r0, r3)
            java.lang.String r0 = "ok_http3_open"
            int r12 = r2.optInt(r0, r3)
            java.lang.String r0 = "chromium_open"
            int r13 = r2.optInt(r0, r3)
            java.lang.String r0 = "cronet_version"
            int r14 = r2.optInt(r0, r3)
            java.lang.String r0 = "http_dns_enabled"
            int r15 = r2.optInt(r0, r3)
            java.lang.String r0 = "detect_open"
            r16 = r8
            int r8 = r2.optInt(r0, r3)
            java.lang.String r0 = "detect_native_page"
            int r3 = r2.optInt(r0, r6)
            java.lang.String r0 = "collect_recent_page_info_enable"
            r17 = r5
            int r5 = r2.optInt(r0, r6)
            java.lang.String r0 = "i_host_select_open"
            r18 = r4
            r6 = 0
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "i_host_select_open_v2"
            r20 = r4
            r6 = 1
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "replace_url_open"
            r21 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_ss_queries_open"
            r22 = r4
            r6 = 0
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_ss_queries_header_open"
            r23 = r4
            r6 = 1
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_ss_queries_plaintext_open"
            r24 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "add_device_fingerprint_open"
            r25 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "image_ttnet_enabled"
            r26 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "sample_band_width_enabled"
            int r0 = r2.optInt(r0, r6)
            r27 = r0
            java.lang.String r0 = "cdn_sample_band_width_enabled"
            int r0 = r2.optInt(r0, r6)
            r28 = r0
            java.lang.String r0 = "dynamic_timeout_enabled"
            int r0 = r2.optInt(r0, r6)
            r29 = r0
            java.lang.String r0 = "dynamic_adjust_threadpool_size_open"
            r30 = r4
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "ttnet_token_enabled"
            r31 = r4
            r6 = 0
            int r4 = r2.optInt(r0, r6)
            java.lang.String r0 = "ttnet_token_api"
            java.lang.String r6 = "[]"
            java.lang.String r6 = r2.optString(r0, r6)
            java.lang.String r0 = "send_api_exception_sample"
            r32 = r6
            r6 = 1
            int r0 = r2.optInt(r0, r6)
            f34151m = r0
            java.lang.String r0 = "send_ss_etag_sample"
            int r0 = r2.optInt(r0, r6)
            f34152n = r0
            monitor-enter(r64)
            f34147d = r7     // Catch:{ all -> 0x05e3 }
            r1.f34186ah = r9     // Catch:{ all -> 0x05e3 }
            r1.f34157E = r10     // Catch:{ all -> 0x05e3 }
            r1.f34158F = r11     // Catch:{ all -> 0x05e3 }
            r1.f34159G = r12     // Catch:{ all -> 0x05e3 }
            r1.f34193e = r13     // Catch:{ all -> 0x05e3 }
            r1.f34185ag = r14     // Catch:{ all -> 0x05e3 }
            r1.f34162J = r15     // Catch:{ all -> 0x05e3 }
            r1.f34163K = r8     // Catch:{ all -> 0x05e3 }
            r1.f34164L = r3     // Catch:{ all -> 0x05e3 }
            r1.f34165M = r5     // Catch:{ all -> 0x05e3 }
            r6 = r20
            r1.f34166N = r6     // Catch:{ all -> 0x05e3 }
            r33 = r6
            r6 = r21
            r1.f34167O = r6     // Catch:{ all -> 0x05e3 }
            r34 = r6
            r6 = r22
            r1.f34168P = r6     // Catch:{ all -> 0x05e3 }
            r35 = r6
            r6 = r23
            r1.f34169Q = r6     // Catch:{ all -> 0x05e3 }
            r36 = r6
            r6 = r24
            r1.f34170R = r6     // Catch:{ all -> 0x05e3 }
            r37 = r6
            r6 = r25
            r1.f34171S = r6     // Catch:{ all -> 0x05e3 }
            r38 = r6
            r6 = r26
            r1.f34176X = r6     // Catch:{ all -> 0x05e3 }
            r39 = r6
            r6 = r31
            r1.f34177Y = r6     // Catch:{ all -> 0x05e3 }
            r1.f34178Z = r4     // Catch:{ all -> 0x05e3 }
            r40 = r4
            r4 = r30
            r1.f34172T = r4     // Catch:{ all -> 0x05e3 }
            r0 = r27
            r1.f34173U = r0     // Catch:{ all -> 0x05e3 }
            r0 = r28
            r1.f34174V = r0     // Catch:{ all -> 0x05e3 }
            r0 = r29
            r1.f34175W = r0     // Catch:{ all -> 0x05e3 }
            monitor-exit(r64)     // Catch:{ all -> 0x05e3 }
            int r0 = r1.f34177Y
            if (r0 <= 0) goto L_0x01da
            r0 = 1
            goto L_0x01db
        L_0x01da:
            r0 = 0
        L_0x01db:
            com.bytedance.frameworks.baselib.network.dispatcher.C10100e.m29990a(r0)
            int r0 = r1.f34175W
            if (r0 <= 0) goto L_0x01e4
            r0 = 1
            goto L_0x01e5
        L_0x01e4:
            r0 = 0
        L_0x01e5:
            com.bytedance.frameworks.baselib.network.http.C10142f.m30115a(r0)
            java.lang.String r0 = ""
            r41 = r0
            java.lang.String r0 = "https_dns"
            org.json.JSONArray r0 = r2.optJSONArray(r0)     // Catch:{ Throwable -> 0x0215 }
            r42 = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0217 }
            r4.<init>()     // Catch:{ Throwable -> 0x0217 }
            r43 = r6
            r6 = 0
            r1.m37630a(r4, r0, r6)     // Catch:{ Throwable -> 0x0219 }
            java.lang.String r6 = m37627a(r4)     // Catch:{ Throwable -> 0x0219 }
            monitor-enter(r64)     // Catch:{ Throwable -> 0x021b }
            r1.f34192c = r4     // Catch:{ all -> 0x0212 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x0212 }
            r0.<init>()     // Catch:{ all -> 0x0212 }
            r0.putAll(r4)     // Catch:{ all -> 0x0212 }
            r1.f34153A = r0     // Catch:{ all -> 0x0212 }
            monitor-exit(r64)     // Catch:{ all -> 0x0212 }
            goto L_0x021b
        L_0x0212:
            r0 = move-exception
            monitor-exit(r64)     // Catch:{ all -> 0x0212 }
            throw r0     // Catch:{ Throwable -> 0x021b }
        L_0x0215:
            r42 = r4
        L_0x0217:
            r43 = r6
        L_0x0219:
            r6 = r41
        L_0x021b:
            java.lang.String r0 = ""
            java.lang.String r4 = "url_replace_mapping"
            org.json.JSONArray r4 = r2.optJSONArray(r4)     // Catch:{ Throwable -> 0x024d }
            r44 = r0
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x024f }
            r0.<init>()     // Catch:{ Throwable -> 0x024f }
            m37629a(r0, r4)     // Catch:{ Throwable -> 0x024f }
            if (r4 == 0) goto L_0x023b
            int r19 = r0.size()     // Catch:{ Throwable -> 0x024f }
            if (r19 <= 0) goto L_0x023b
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x024f }
            r44 = r4
        L_0x023b:
            monitor-enter(r64)     // Catch:{ Throwable -> 0x024f }
            r1.f34154B = r0     // Catch:{ all -> 0x024a }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x024a }
            r4.<init>()     // Catch:{ all -> 0x024a }
            r4.putAll(r0)     // Catch:{ all -> 0x024a }
            r1.f34155C = r4     // Catch:{ all -> 0x024a }
            monitor-exit(r64)     // Catch:{ all -> 0x024a }
            goto L_0x024f
        L_0x024a:
            r0 = move-exception
            monitor-exit(r64)     // Catch:{ all -> 0x024a }
            throw r0     // Catch:{ Throwable -> 0x024f }
        L_0x024d:
            r44 = r0
        L_0x024f:
            r0 = r44
            java.util.Set r4 = m37640f(r32)
            r1.f34179aa = r4
            java.lang.String r4 = "https_to_http"
            r45 = r5
            r5 = 1
            int r4 = r2.optInt(r4, r5)
            r46 = r3
            java.lang.String r3 = "http_to_https"
            int r3 = r2.optInt(r3, r5)
            r47 = r8
            java.lang.String r8 = "https_retry_http"
            int r8 = r2.optInt(r8, r5)
            r48 = r15
            java.lang.String r15 = "http_show_hijack"
            int r15 = r2.optInt(r15, r5)
            r49 = r14
            java.lang.String r14 = "http_verify_sign"
            int r14 = r2.optInt(r14, r5)
            monitor-enter(r64)
            f34137ai = r4     // Catch:{ all -> 0x05e0 }
            f34138aj = r3     // Catch:{ all -> 0x05e0 }
            f34139ak = r8     // Catch:{ all -> 0x05e0 }
            f34140al = r15     // Catch:{ all -> 0x05e0 }
            f34141am = r14     // Catch:{ all -> 0x05e0 }
            monitor-exit(r64)     // Catch:{ all -> 0x05e0 }
            java.lang.String r5 = "enable_req_ticket"
            r50 = r14
            r14 = 1
            int r5 = r2.optInt(r5, r14)
            if (r5 <= 0) goto L_0x0299
            r5 = 1
            goto L_0x029a
        L_0x0299:
            r5 = 0
        L_0x029a:
            com.bytedance.ttnet.utils.C13003f.m37950a(r5)
            com.bytedance.ttnet.utils.a$a r5 = com.bytedance.ttnet.utils.C12994a.m37908a(r2)
            java.lang.String r14 = "frontier_urls"
            r51 = r15
            java.lang.String r15 = ""
            java.lang.String r14 = r2.optString(r14, r15)
            java.lang.String r15 = "share_cookie_host_list"
            r52 = r14
            java.lang.String r14 = ""
            java.lang.String r14 = r2.optString(r15, r14)
            java.lang.String r15 = "disable_encrypt_switch"
            r53 = r14
            r14 = 0
            int r15 = r2.optInt(r15, r14)
            r1.f34187ap = r15
            int r15 = r1.f34187ap
            r14 = 2
            if (r15 != r14) goto L_0x02e2
            monitor-enter(r64)
            android.content.Context r15 = r1.f34191b     // Catch:{ all -> 0x02df }
            java.lang.String r14 = "app_log_encrypt_switch_count"
            r54 = r8
            r8 = 0
            android.content.SharedPreferences r14 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r15, r14, r8)     // Catch:{ all -> 0x02df }
            android.content.SharedPreferences$Editor r14 = r14.edit()     // Catch:{ all -> 0x02df }
            java.lang.String r15 = "app_log_encrypt_faild_count"
            r14.putInt(r15, r8)     // Catch:{ all -> 0x02df }
            com.bytedance.common.utility.p481c.C9721b.m28656a(r14)     // Catch:{ all -> 0x02df }
            monitor-exit(r64)     // Catch:{ all -> 0x02df }
            goto L_0x02e4
        L_0x02df:
            r0 = move-exception
            monitor-exit(r64)     // Catch:{ all -> 0x02df }
            throw r0
        L_0x02e2:
            r54 = r8
        L_0x02e4:
            java.lang.String r8 = "disable_framed_transport"
            r14 = 0
            int r8 = r2.optInt(r8, r14)
            if (r8 <= 0) goto L_0x02f0
            com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10108b.m30007a(r8)     // Catch:{ Throwable -> 0x02f0 }
        L_0x02f0:
            java.lang.String r14 = "request_max_delay_time"
            r15 = 600000(0x927c0, float:8.40779E-40)
            int r14 = r2.optInt(r14, r15)
            java.lang.String r15 = "request_random_delay_apis"
            r55 = r8
            java.lang.String r8 = ""
            java.lang.String r8 = r2.optString(r15, r8)
            java.lang.String r15 = "request_delay_time_range"
            r56 = r3
            java.lang.String r3 = ""
            java.lang.String r3 = r2.optString(r15, r3)
            monitor-enter(r64)
            android.content.Context r15 = r1.f34191b     // Catch:{ all -> 0x05dd }
            r57 = r2
            java.lang.String r2 = "ss_app_config"
            r58 = r4
            r4 = 0
            android.content.SharedPreferences r2 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r15, r2, r4)     // Catch:{ all -> 0x05dd }
            java.util.List<java.lang.String> r4 = r1.f34184af     // Catch:{ all -> 0x05dd }
            r4.clear()     // Catch:{ all -> 0x05dd }
            java.lang.String r4 = "share_cookie_host_list"
            java.lang.String r15 = ""
            java.lang.String r4 = r2.getString(r4, r15)     // Catch:{ all -> 0x05dd }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x05dd }
            if (r18 == 0) goto L_0x0338
            java.lang.String r15 = "config_mapping"
            r59 = r4
            r4 = r17
            r2.putString(r15, r4)     // Catch:{ all -> 0x05dd }
            goto L_0x033c
        L_0x0338:
            r59 = r4
            r4 = r17
        L_0x033c:
            java.lang.String r15 = "static_dns_mapping"
            r60 = r4
            r4 = r16
            r2.putString(r15, r4)     // Catch:{ all -> 0x05dd }
            java.lang.String r4 = "https_dns"
            r2.putString(r4, r6)     // Catch:{ all -> 0x05dd }
            java.lang.String r4 = "url_replace_mapping"
            r2.putString(r4, r0)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "ttnet_response_verify"
            java.lang.String r4 = r5.f34411b     // Catch:{ all -> 0x05dd }
            r2.putString(r0, r4)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "ttnet_response_verify_enabled"
            int r4 = r5.f34410a     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r4)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "https_dns_err_max"
            r2.putInt(r0, r7)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "https_dns_err_policy"
            r2.putInt(r0, r9)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "hs_open"
            r2.putInt(r0, r10)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "ok_http_open"
            r2.putInt(r0, r11)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "ok_http3_open"
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "chromium_open"
            r2.putInt(r0, r13)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "cronet_version"
            r4 = r49
            r2.putInt(r0, r4)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "http_dns_enabled"
            r4 = r48
            r2.putInt(r0, r4)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "detect_open"
            r5 = r47
            r2.putInt(r0, r5)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "detect_native_page"
            r5 = r46
            r2.putInt(r0, r5)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "collect_recent_page_info_enable"
            r5 = r45
            r2.putInt(r0, r5)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "i_host_select_open"
            r5 = r33
            r2.putInt(r0, r5)     // Catch:{ all -> 0x05dd }
            com.bytedance.ttnet.a.e r0 = r1.f34194f     // Catch:{ all -> 0x05dd }
            if (r0 == 0) goto L_0x03ae
            com.bytedance.ttnet.a.e r0 = r1.f34194f     // Catch:{ all -> 0x05dd }
            r0.mo31441a(r2)     // Catch:{ all -> 0x05dd }
        L_0x03ae:
            java.lang.String r0 = "i_host_select_open_v2"
            r5 = r34
            r2.putInt(r0, r5)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "replace_url_open"
            r5 = r35
            r2.putInt(r0, r5)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "add_ss_queries_open"
            r5 = r36
            r2.putInt(r0, r5)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "add_ss_queries_header_open"
            r6 = r37
            r2.putInt(r0, r6)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "add_ss_queries_plaintext_open"
            r7 = r38
            r2.putInt(r0, r7)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "add_device_fingerprint_open"
            r9 = r39
            r2.putInt(r0, r9)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "dynamic_adjust_threadpool_size_open"
            r9 = r43
            r2.putInt(r0, r9)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "ttnet_token_enabled"
            r9 = r40
            r2.putInt(r0, r9)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "ttnet_token_api"
            r10 = r32
            r2.putString(r0, r10)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "request_max_delay_time"
            r2.putInt(r0, r14)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "request_random_delay_apis"
            r2.putString(r0, r8)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "request_delay_time_range"
            r2.putString(r0, r3)     // Catch:{ all -> 0x05dd }
            r1.f34180ab = r14     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r8.split(r0)     // Catch:{ all -> 0x05dd }
            com.bytedance.ttnet.a.a$8 r11 = new com.bytedance.ttnet.a.a$8     // Catch:{ all -> 0x05dd }
            r11.<init>(r0)     // Catch:{ all -> 0x05dd }
            r1.f34183ae = r11     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r3.split(r0)     // Catch:{ all -> 0x05dd }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x05dd }
            int r11 = r0.size()     // Catch:{ all -> 0x05dd }
            r12 = 2
            if (r11 != r12) goto L_0x042f
            r11 = 0
            java.lang.Object r12 = r0.get(r11)     // Catch:{ all -> 0x05dd }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x05dd }
            r1.f34181ac = r12     // Catch:{ all -> 0x05dd }
            r12 = 1
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x05dd }
            r1.f34182ad = r0     // Catch:{ all -> 0x05dd }
            goto L_0x0430
        L_0x042f:
            r11 = 0
        L_0x0430:
            java.lang.String r0 = "image_ttnet_enabled"
            r12 = r42
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "send_api_exception_sample"
            int r12 = f34151m     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "send_ss_etag_sample"
            int r12 = f34152n     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "shuffle_dns"
            int r12 = f34144at     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "use_http_dns"
            int r12 = f34142an     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "use_http_dns_refetch_on_expire"
            int r12 = f34143ao     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "last_refresh_time"
            r2.putLong(r0, r11)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "https_to_http"
            r11 = r58
            r2.putInt(r0, r11)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "http_to_https"
            r11 = r56
            r2.putInt(r0, r11)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "https_retry_http"
            r11 = r54
            r2.putInt(r0, r11)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "http_show_hijack"
            r11 = r51
            r2.putInt(r0, r11)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "http_verify_sign"
            r11 = r50
            r2.putInt(r0, r11)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "frontier_urls"
            r11 = r52
            r2.putString(r0, r11)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "share_cookie_host_list"
            r12 = r53
            r2.putString(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = ","
            java.lang.String[] r0 = r12.split(r0)     // Catch:{ all -> 0x05dd }
            int r15 = r0.length     // Catch:{ all -> 0x05dd }
            r61 = r12
            r12 = 0
        L_0x049e:
            if (r12 >= r15) goto L_0x04bb
            r62 = r15
            r15 = r0[r12]     // Catch:{ all -> 0x05dd }
            boolean r16 = com.bytedance.common.utility.C6319n.m19593a(r15)     // Catch:{ all -> 0x05dd }
            if (r16 != 0) goto L_0x04b2
            r63 = r0
            java.util.List<java.lang.String> r0 = r1.f34184af     // Catch:{ all -> 0x05dd }
            r0.add(r15)     // Catch:{ all -> 0x05dd }
            goto L_0x04b4
        L_0x04b2:
            r63 = r0
        L_0x04b4:
            int r12 = r12 + 1
            r15 = r62
            r0 = r63
            goto L_0x049e
        L_0x04bb:
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = r0.mo31473g()     // Catch:{ all -> 0x05dd }
            boolean r12 = com.bytedance.common.utility.C6319n.m19593a(r0)     // Catch:{ all -> 0x05dd }
            if (r12 != 0) goto L_0x04d6
            java.util.List<java.lang.String> r12 = r1.f34184af     // Catch:{ all -> 0x05dd }
            boolean r12 = com.bytedance.ttnet.utils.C13006h.m37955a(r0, r12)     // Catch:{ all -> 0x05dd }
            if (r12 != 0) goto L_0x04d6
            java.util.List<java.lang.String> r12 = r1.f34184af     // Catch:{ all -> 0x05dd }
            r12.add(r0)     // Catch:{ all -> 0x05dd }
        L_0x04d6:
            java.lang.String r0 = "android_log_encrypt_switch"
            int r12 = r1.f34187ap     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "image_ttnet_enabled"
            int r12 = r1.f34172T     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "sample_band_width_enabled"
            int r12 = r1.f34173U     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "cdn_sample_band_width_enabled"
            int r12 = r1.f34174V     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "dynamic_timeout_enabled"
            int r12 = r1.f34175W     // Catch:{ all -> 0x05dd }
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            java.lang.String r0 = "disable_framed_transport"
            r12 = r55
            r2.putInt(r0, r12)     // Catch:{ all -> 0x05dd }
            com.bytedance.common.utility.p481c.C9721b.m28656a(r2)     // Catch:{ all -> 0x05dd }
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x059e }
            r0.<init>()     // Catch:{ Throwable -> 0x059e }
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r11)     // Catch:{ Throwable -> 0x059e }
            if (r2 != 0) goto L_0x051d
            java.lang.String r2 = r1.f34156D     // Catch:{ Throwable -> 0x059e }
            boolean r2 = r11.equals(r2)     // Catch:{ Throwable -> 0x059e }
            if (r2 != 0) goto L_0x051d
            r1.f34156D = r11     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "frontier_urls"
            r0.put(r2, r11)     // Catch:{ Throwable -> 0x059e }
        L_0x051d:
            java.lang.String r2 = "chromium_open"
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x059e }
            r0.put(r2, r11)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "http_dns_enabled"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x059e }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "add_ss_queries_open"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x059e }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "add_ss_queries_header_open"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x059e }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "add_ss_queries_plaintext_open"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch:{ Throwable -> 0x059e }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "ttnet_token_enabled"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x059e }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "ttnet_token_api"
            r0.put(r2, r10)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "ttnet_token_config_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x059e }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x059e }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "request_max_delay_time"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r14)     // Catch:{ Throwable -> 0x059e }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "request_random_delay_apis"
            r0.put(r2, r8)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "request_delay_time_range"
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x059e }
            java.lang.String r2 = "share_cookie_host_list"
            r3 = r61
            r0.put(r2, r3)     // Catch:{ Throwable -> 0x05a0 }
            java.lang.String r2 = "disable_framed_transport"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ Throwable -> 0x05a0 }
            r0.put(r2, r4)     // Catch:{ Throwable -> 0x05a0 }
            com.bytedance.ttnet.c r2 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Throwable -> 0x05a0 }
            android.content.Context r4 = r1.f34191b     // Catch:{ Throwable -> 0x05a0 }
            r2.mo31466a(r4, r0)     // Catch:{ Throwable -> 0x05a0 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Throwable -> 0x05a0 }
            java.lang.String r2 = "com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG"
            r0.<init>(r2)     // Catch:{ Throwable -> 0x05a0 }
            android.content.Context r2 = r1.f34191b     // Catch:{ Throwable -> 0x05a0 }
            r2.sendBroadcast(r0)     // Catch:{ Throwable -> 0x05a0 }
            goto L_0x05a0
        L_0x059e:
            r3 = r61
        L_0x05a0:
            monitor-exit(r64)     // Catch:{ all -> 0x05dd }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r3)
            if (r0 != 0) goto L_0x05b0
            com.bytedance.ttnet.a.h r0 = com.bytedance.ttnet.p670a.C12944h.m37720a()
            r2 = r59
            r0.mo31455a(r2, r3)
        L_0x05b0:
            com.bytedance.ttnet.a.d r0 = com.bytedance.ttnet.p670a.C12938d.m37686a()
            if (r0 == 0) goto L_0x05c0
            com.bytedance.ttnet.a.d r0 = com.bytedance.ttnet.p670a.C12938d.m37686a()
            r2 = r57
            r0.mo31433a(r2)
            goto L_0x05c2
        L_0x05c0:
            r2 = r57
        L_0x05c2:
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p672d.C12971c.m37800a()
            com.bytedance.ttnet.d.b r0 = r0.f34343a
            if (r0 == 0) goto L_0x05d3
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p672d.C12971c.m37800a()
            com.bytedance.ttnet.d.b r0 = r0.f34343a
            r0.mo31487a(r2)
        L_0x05d3:
            android.content.Context r0 = r1.f34191b
            r2 = r60
            r3 = 2
            com.bytedance.ttnet.utils.C13002e.m37944a(r0, r3, r2)
            r2 = 1
            return r2
        L_0x05dd:
            r0 = move-exception
            monitor-exit(r64)     // Catch:{ all -> 0x05dd }
            throw r0
        L_0x05e0:
            r0 = move-exception
            monitor-exit(r64)     // Catch:{ all -> 0x05e0 }
            throw r0
        L_0x05e3:
            r0 = move-exception
            monitor-exit(r64)     // Catch:{ all -> 0x05e3 }
            throw r0
        L_0x05e6:
            r0 = move-exception
            monitor-exit(r64)     // Catch:{ all -> 0x05e6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12925a.m37631a(java.lang.Object):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(19:2|3|4|5|6|7|(2:13|(1:15))|16|(1:18)|19|20|(1:22)(1:23)|24|25|26|(1:28)(2:29|(3:42|32|33))|31|44|39) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0088 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ab A[Catch:{ Throwable -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac A[Catch:{ Throwable -> 0x00c5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m37634a(org.json.JSONArray r13) throws org.json.JSONException {
        /*
            r12 = this;
            java.lang.String[] r0 = m37646s()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r5 = r3
            r4 = 0
        L_0x0009:
            if (r4 >= r1) goto L_0x00eb
            r6 = r0[r4]
            com.bytedance.ttnet.c.a r7 = new com.bytedance.ttnet.c.a     // Catch:{ Throwable -> 0x00c7 }
            r7.<init>()     // Catch:{ Throwable -> 0x00c7 }
            r5 = 1
            r7.f34299h = r5     // Catch:{ Throwable -> 0x00c5 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00c5 }
            r8.<init>()     // Catch:{ Throwable -> 0x00c5 }
            java.lang.String r9 = "https://"
            r8.append(r9)     // Catch:{ Throwable -> 0x00c5 }
            r8.append(r6)     // Catch:{ Throwable -> 0x00c5 }
            java.lang.String r6 = "/get_domains/v4/"
            r8.append(r6)     // Catch:{ Throwable -> 0x00c5 }
            com.bytedance.ttnet.c r6 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Throwable -> 0x00c5 }
            android.content.Context r9 = r12.f34191b     // Catch:{ Throwable -> 0x00c5 }
            android.location.Address r6 = r6.mo31462a(r9)     // Catch:{ Throwable -> 0x00c5 }
            com.bytedance.frameworks.baselib.network.http.util.j r9 = new com.bytedance.frameworks.baselib.network.http.util.j     // Catch:{ Throwable -> 0x00c5 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x00c5 }
            r9.<init>(r8)     // Catch:{ Throwable -> 0x00c5 }
            if (r6 == 0) goto L_0x006d
            boolean r8 = r6.hasLatitude()     // Catch:{ Throwable -> 0x00c5 }
            if (r8 == 0) goto L_0x006d
            boolean r8 = r6.hasLongitude()     // Catch:{ Throwable -> 0x00c5 }
            if (r8 == 0) goto L_0x006d
            java.lang.String r8 = "latitude"
            double r10 = r6.getLatitude()     // Catch:{ Throwable -> 0x00c5 }
            r9.mo24887a(r8, r10)     // Catch:{ Throwable -> 0x00c5 }
            java.lang.String r8 = "longitude"
            double r10 = r6.getLongitude()     // Catch:{ Throwable -> 0x00c5 }
            r9.mo24887a(r8, r10)     // Catch:{ Throwable -> 0x00c5 }
            java.lang.String r6 = r6.getLocality()     // Catch:{ Throwable -> 0x00c5 }
            boolean r8 = com.bytedance.common.utility.C6319n.m19593a(r6)     // Catch:{ Throwable -> 0x00c5 }
            if (r8 != 0) goto L_0x006d
            java.lang.String r8 = "city"
            java.lang.String r6 = android.net.Uri.encode(r6)     // Catch:{ Throwable -> 0x00c5 }
            r9.mo24890a(r8, r6)     // Catch:{ Throwable -> 0x00c5 }
        L_0x006d:
            boolean r6 = r12.f34199p     // Catch:{ Throwable -> 0x00c5 }
            if (r6 == 0) goto L_0x0076
            java.lang.String r6 = "force"
            r9.mo24888a(r6, r5)     // Catch:{ Throwable -> 0x00c5 }
        L_0x0076:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0088 }
            r6 = 21
            if (r5 >= r6) goto L_0x007f
            java.lang.String r5 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x0088 }
            goto L_0x0083
        L_0x007f:
            java.lang.String[] r5 = android.os.Build.SUPPORTED_ABIS     // Catch:{ Throwable -> 0x0088 }
            r5 = r5[r2]     // Catch:{ Throwable -> 0x0088 }
        L_0x0083:
            java.lang.String r6 = "abi"
            r9.mo24890a(r6, r5)     // Catch:{ Throwable -> 0x0088 }
        L_0x0088:
            java.lang.String r5 = r9.toString()     // Catch:{ Throwable -> 0x00c5 }
            r7.f34293b = r5     // Catch:{ Throwable -> 0x00c5 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c5 }
            java.lang.String r5 = com.bytedance.ttnet.p671c.C12957c.m37766a(r5, r3, r3, r7)     // Catch:{ Throwable -> 0x00c5 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c5 }
            r6 = 0
            long r10 = r10 - r8
            r7.f34294c = r10     // Catch:{ Throwable -> 0x00c5 }
            org.json.JSONObject r6 = r7.mo31474a()     // Catch:{ Throwable -> 0x00c5 }
            r13.put(r6)     // Catch:{ Throwable -> 0x00c5 }
            boolean r6 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ Throwable -> 0x00c5 }
            if (r6 == 0) goto L_0x00ac
            goto L_0x00bf
        L_0x00ac:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00c5 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x00c5 }
            java.lang.String r5 = "message"
            java.lang.String r5 = r6.getString(r5)     // Catch:{ Throwable -> 0x00c5 }
            java.lang.String r8 = "success"
            boolean r5 = r8.equals(r5)     // Catch:{ Throwable -> 0x00c5 }
            if (r5 != 0) goto L_0x00c0
        L_0x00bf:
            goto L_0x00e6
        L_0x00c0:
            boolean r5 = r12.m37631a(r6)     // Catch:{ Throwable -> 0x00c5 }
            return r5
        L_0x00c5:
            r5 = move-exception
            goto L_0x00ca
        L_0x00c7:
            r6 = move-exception
            r7 = r5
            r5 = r6
        L_0x00ca:
            if (r7 == 0) goto L_0x00e6
            java.io.StringWriter r6 = new java.io.StringWriter
            r6.<init>()
            java.io.PrintWriter r8 = new java.io.PrintWriter
            r8.<init>(r6)
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20180a(r5, r8)
            java.lang.String r5 = r6.toString()
            r7.f34295d = r5
            org.json.JSONObject r5 = r7.mo31474a()
            r13.put(r5)
        L_0x00e6:
            r5 = r7
            int r4 = r4 + 1
            goto L_0x0009
        L_0x00eb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12925a.m37634a(org.json.JSONArray):boolean");
    }

    /* renamed from: a */
    public final List<String> mo24813a(CookieManager cookieManager, C10156a aVar, URI uri) {
        String str;
        if (uri == null || (cookieManager == null && aVar == null)) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        if (C6319n.m19593a(str) || !C13006h.m37955a(str, this.f34184af) || C6319n.m19593a(C12961d.m37772a().mo31473g())) {
            return null;
        }
        List<String> arrayList = new ArrayList<>();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(C12961d.m37772a().mo31473g());
            if (!C6319n.m19593a(cookie)) {
                arrayList.add(cookie);
                return arrayList;
            }
        }
        if (C6311g.m19573a(arrayList) && aVar != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append("://");
                sb.append(C12961d.m37772a().mo31473g());
                Map map = aVar.get(URI.create(sb.toString()), new LinkedHashMap());
                if (map != null && !map.isEmpty()) {
                    arrayList = (List) map.get("Cookie");
                }
            } catch (Throwable unused2) {
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    private boolean m37649w() {
        if (this.f34167O > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo30435g() {
        return C12990a.m37889a(this.f34180ab);
    }

    /* renamed from: j */
    public final void mo31417j() {
        m37639e(false);
    }

    /* renamed from: p */
    public final boolean mo31421p() {
        if (this.f34178Z > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public final boolean mo31423r() {
        if (this.f34166N > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public static String[] m37646s() {
        return C12961d.m37772a().mo31469c();
    }

    /* renamed from: u */
    private void m37647u() {
        new C6304f("AppConfig-WaitConfigTimesTask") {
            public final void run() {
                SharedPreferences a = C7285c.m22838a(C12925a.this.f34191b, "ss_app_config", 0);
                C12925a.this.f34196h = a.getInt("wait_config_times", 0);
                C12925a.this.f34193e = a.getInt("chromium_open", 0);
                if (C12925a.this.f34193e <= 0) {
                    C12925a.this.f34196h = 0;
                } else {
                    if (C12925a.this.f34196h >= 3) {
                        C12925a.this.f34193e = 0;
                        C12925a.this.f34196h = 0;
                    }
                    C12925a.this.f34196h++;
                }
                synchronized (C12925a.this) {
                    Editor edit = a.edit();
                    edit.putInt("chromium_open", C12925a.this.f34193e);
                    edit.putInt("wait_config_times", C12925a.this.f34196h);
                    C9721b.m28656a(edit);
                }
            }
        }.start();
    }

    /* renamed from: v */
    private boolean m37648v() {
        if (!f34136a && this.f34157E > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private void m37650x() {
        new C6304f("AppConfig-SaveWaitConfigTimesTask") {
            public final void run() {
                C12925a.this.f34196h--;
                if (C12925a.this.f34196h < 0) {
                    C12925a.this.f34196h = 0;
                }
                synchronized (C12925a.this) {
                    Editor edit = C7285c.m22838a(C12925a.this.f34191b, "ss_app_config", 0).edit();
                    edit.putInt("wait_config_times", C12925a.this.f34196h);
                    C9721b.m28656a(edit);
                }
            }
        }.start();
    }

    /* renamed from: b */
    public final boolean mo24792b() {
        if (!f34145au && this.f34162J > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo15275c() {
        if (!f34146av && this.f34169Q <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo15277e() {
        if (!f34146av && this.f34171S <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30434f() {
        return C12990a.m37890a(this.f34181ac, this.f34182ad);
    }

    /* renamed from: d */
    public final boolean mo15276d() {
        if (!f34146av && this.f34170R > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo31416i() {
        if (this.f34189ar == null || !this.f34189ar.mo31524a(this.f34190as)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final synchronized int mo31420m() {
        if (this.f34205v) {
            return this.f34185ag;
        }
        return C7285c.m22838a(this.f34191b, "ss_app_config", 0).getInt("cronet_version", 0);
    }

    /* renamed from: o */
    public static boolean m37645o() {
        String str;
        try {
            if (VERSION.SDK_INT < 21) {
                C10114e.m30025a(1);
                return true;
            }
            str = Build.SUPPORTED_ABIS[0];
            if (!"x86".equalsIgnoreCase(str) && !"x86_64".equalsIgnoreCase(str)) {
                return false;
            }
            C10114e.m30025a(2);
            return true;
        } catch (Throwable unused) {
            str = null;
        }
    }

    /* renamed from: h */
    public final boolean mo31415h() {
        if (f34148j) {
            C10114e.m30025a(0);
            return false;
        } else if (m37644n()) {
            return false;
        } else {
            if (this.f34160H > 3) {
                C10114e.m30025a(3);
                return false;
            } else if ((C6312h.m19578b() || f34149k) && C12961d.m37772a().mo31468b()) {
                return true;
            } else {
                if (this.f34193e <= 0) {
                    C10114e.m30025a(4);
                }
                if (this.f34193e > 0) {
                    return true;
                }
                return false;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|5|6|(2:8|9)|10|11|(1:13)) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0032 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003a A[Catch:{ Exception -> 0x0045 }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31418k() {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0047 }
            long r2 = r5.f34202s     // Catch:{ all -> 0x0047 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0045
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0047 }
            r5.f34202s = r0     // Catch:{ all -> 0x0047 }
            android.content.Context r0 = r5.f34191b     // Catch:{ Exception -> 0x0045 }
            r1 = 2
            java.lang.String r0 = com.bytedance.ttnet.utils.C13002e.m37943a(r0, r1)     // Catch:{ Exception -> 0x0045 }
            r5.m37642i(r0)     // Catch:{ Exception -> 0x0045 }
            com.bytedance.ttnet.c r0 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Exception -> 0x0045 }
            android.content.Context r1 = r5.f34191b     // Catch:{ Exception -> 0x0045 }
            java.lang.String r2 = "disable_framed_transport"
            r3 = 0
            int r0 = r0.mo31459a(r1, r2, r3)     // Catch:{ Exception -> 0x0045 }
            if (r0 <= 0) goto L_0x0032
            com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10108b.m30007a(r0)     // Catch:{ Throwable -> 0x0032 }
        L_0x0032:
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p672d.C12971c.m37800a()     // Catch:{ Exception -> 0x0045 }
            com.bytedance.ttnet.d.b r0 = r0.f34343a     // Catch:{ Exception -> 0x0045 }
            if (r0 == 0) goto L_0x0043
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p672d.C12971c.m37800a()     // Catch:{ Exception -> 0x0045 }
            com.bytedance.ttnet.d.b r0 = r0.f34343a     // Catch:{ Exception -> 0x0045 }
            r0.mo31488b()     // Catch:{ Exception -> 0x0045 }
        L_0x0043:
            monitor-exit(r5)
            return
        L_0x0045:
            monitor-exit(r5)
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12925a.mo31418k():void");
    }

    /* renamed from: t */
    public final void mo31424t() {
        try {
            if (f34142an > 0 && !C12947b.m37743a()) {
                if (this.f34208y != null) {
                    for (Entry entry : this.f34208y.entrySet()) {
                        if (entry != null) {
                            m37643j((String) entry.getKey());
                        }
                    }
                }
                if (this.f34194f != null) {
                    Map<String, C12941a> map = this.f34194f.f34238b;
                    if (map != null) {
                        for (Entry entry2 : map.entrySet()) {
                            if (entry2 != null) {
                                m37643j((String) entry2.getKey());
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x01df */
    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0204 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0229 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x02ba */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02be A[SYNTHETIC, Splitter:B:91:0x02be] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31419l() {
        /*
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.f34205v     // Catch:{ all -> 0x0357 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r13)
            return
        L_0x0007:
            r0 = 1
            r13.f34205v = r0     // Catch:{ all -> 0x0357 }
            android.content.Context r1 = r13.f34191b     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = "ss_app_config"
            r3 = 0
            android.content.SharedPreferences r1 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r1, r2, r3)     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = "config_mapping"
            r4 = 0
            java.lang.String r2 = r1.getString(r2, r4)     // Catch:{ all -> 0x0357 }
            java.lang.String r5 = "last_refresh_time"
            r6 = 0
            long r5 = r1.getLong(r5, r6)     // Catch:{ all -> 0x0357 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0357 }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x002b
            r5 = r7
        L_0x002b:
            r13.f34202s = r5     // Catch:{ all -> 0x0357 }
            r13.m37642i(r2)     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = "static_dns_mapping"
            java.lang.String r2 = r1.getString(r2, r4)     // Catch:{ all -> 0x0357 }
            java.lang.String r5 = "https_dns"
            java.lang.String r5 = r1.getString(r5, r4)     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "url_replace_mapping"
            java.lang.String r4 = r1.getString(r6, r4)     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "https_dns_err_max"
            r7 = 3
            int r6 = r1.getInt(r6, r7)     // Catch:{ all -> 0x0357 }
            f34147d = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "https_dns_err_policy"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34186ah = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "hs_open"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34157E = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "ok_http_open"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34158F = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "ok_http3_open"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34159G = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "chromium_open"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34193e = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "cronet_version"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34185ag = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "http_dns_enabled"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34162J = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "detect_open"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34163K = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "detect_native_page"
            int r6 = r1.getInt(r6, r0)     // Catch:{ all -> 0x0357 }
            r13.f34164L = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "collect_recent_page_info_enable"
            int r6 = r1.getInt(r6, r0)     // Catch:{ all -> 0x0357 }
            r13.f34165M = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "i_host_select_open"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34166N = r6     // Catch:{ all -> 0x0357 }
            boolean r6 = r13.mo31423r()     // Catch:{ all -> 0x0357 }
            if (r6 == 0) goto L_0x00b1
            android.content.Context r6 = r13.f34191b     // Catch:{ all -> 0x0357 }
            com.bytedance.ttnet.a.e r6 = com.bytedance.ttnet.p670a.C12939e.m37695a(r6)     // Catch:{ all -> 0x0357 }
            r13.f34194f = r6     // Catch:{ all -> 0x0357 }
        L_0x00b1:
            android.content.Context r6 = r13.f34191b     // Catch:{ all -> 0x0357 }
            com.bytedance.ttnet.a.e r6 = com.bytedance.ttnet.p670a.C12939e.m37695a(r6)     // Catch:{ all -> 0x0357 }
            android.content.Context r7 = r13.f34191b     // Catch:{ all -> 0x0357 }
            r6.mo31439a(r7, r1)     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "i_host_select_open_v2"
            int r6 = r1.getInt(r6, r0)     // Catch:{ all -> 0x0357 }
            r13.f34167O = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "replace_url_open"
            int r6 = r1.getInt(r6, r0)     // Catch:{ all -> 0x0357 }
            r13.f34168P = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "add_ss_queries_open"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34169Q = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "add_ss_queries_header_open"
            int r6 = r1.getInt(r6, r0)     // Catch:{ all -> 0x0357 }
            r13.f34170R = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "add_ss_queries_plaintext_open"
            int r6 = r1.getInt(r6, r0)     // Catch:{ all -> 0x0357 }
            r13.f34171S = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "add_device_fingerprint_open"
            int r6 = r1.getInt(r6, r0)     // Catch:{ all -> 0x0357 }
            r13.f34176X = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "dynamic_adjust_threadpool_size_open"
            int r6 = r1.getInt(r6, r0)     // Catch:{ all -> 0x0357 }
            r13.f34177Y = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "ttnet_token_enabled"
            int r6 = r1.getInt(r6, r3)     // Catch:{ all -> 0x0357 }
            r13.f34178Z = r6     // Catch:{ all -> 0x0357 }
            java.lang.String r6 = "ttnet_token_api"
            java.lang.String r7 = "[]"
            java.lang.String r6 = r1.getString(r6, r7)     // Catch:{ all -> 0x0357 }
            java.lang.String r7 = "request_max_delay_time"
            r8 = 600000(0x927c0, float:8.40779E-40)
            int r7 = r1.getInt(r7, r8)     // Catch:{ all -> 0x0357 }
            r13.f34180ab = r7     // Catch:{ all -> 0x0357 }
            java.lang.String r7 = "request_random_delay_apis"
            java.lang.String r8 = ""
            java.lang.String r7 = r1.getString(r7, r8)     // Catch:{ all -> 0x0357 }
            java.lang.String r8 = ","
            java.lang.String[] r8 = r7.split(r8)     // Catch:{ all -> 0x0357 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0357 }
            r9.<init>()     // Catch:{ all -> 0x0357 }
            r13.f34183ae = r9     // Catch:{ all -> 0x0357 }
            int r9 = r8.length     // Catch:{ all -> 0x0357 }
            r10 = 0
        L_0x0126:
            if (r10 >= r9) goto L_0x0132
            r11 = r8[r10]     // Catch:{ all -> 0x0357 }
            java.util.Set<java.lang.String> r12 = r13.f34183ae     // Catch:{ all -> 0x0357 }
            r12.add(r11)     // Catch:{ all -> 0x0357 }
            int r10 = r10 + 1
            goto L_0x0126
        L_0x0132:
            java.lang.String r8 = "request_delay_time_range"
            java.lang.String r9 = ""
            java.lang.String r8 = r1.getString(r8, r9)     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = ","
            java.lang.String[] r9 = r8.split(r9)     // Catch:{ all -> 0x0357 }
            java.util.List r9 = java.util.Arrays.asList(r9)     // Catch:{ all -> 0x0357 }
            int r10 = r9.size()     // Catch:{ all -> 0x0357 }
            r11 = 2
            if (r10 != r11) goto L_0x015b
            java.lang.Object r10 = r9.get(r3)     // Catch:{ all -> 0x0357 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0357 }
            r13.f34181ac = r10     // Catch:{ all -> 0x0357 }
            java.lang.Object r9 = r9.get(r0)     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0357 }
            r13.f34182ad = r9     // Catch:{ all -> 0x0357 }
        L_0x015b:
            int r9 = r13.f34177Y     // Catch:{ all -> 0x0357 }
            if (r9 <= 0) goto L_0x0161
            r9 = 1
            goto L_0x0162
        L_0x0161:
            r9 = 0
        L_0x0162:
            com.bytedance.frameworks.baselib.network.dispatcher.C10100e.m29990a(r9)     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "image_ttnet_enabled"
            int r9 = r1.getInt(r9, r0)     // Catch:{ all -> 0x0357 }
            r13.f34172T = r9     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "sample_band_width_enabled"
            int r9 = r1.getInt(r9, r0)     // Catch:{ all -> 0x0357 }
            r13.f34173U = r9     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "cdn_sample_band_width_enabled"
            int r9 = r1.getInt(r9, r0)     // Catch:{ all -> 0x0357 }
            r13.f34174V = r9     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "dynamic_timeout_enabled"
            int r9 = r1.getInt(r9, r0)     // Catch:{ all -> 0x0357 }
            r13.f34175W = r9     // Catch:{ all -> 0x0357 }
            int r9 = r13.f34175W     // Catch:{ all -> 0x0357 }
            if (r9 <= 0) goto L_0x018b
            r9 = 1
            goto L_0x018c
        L_0x018b:
            r9 = 0
        L_0x018c:
            com.bytedance.frameworks.baselib.network.http.C10142f.m30115a(r9)     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "send_api_exception_sample"
            int r9 = r1.getInt(r9, r0)     // Catch:{ all -> 0x0357 }
            f34151m = r9     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "send_ss_etag_sample"
            int r9 = r1.getInt(r9, r0)     // Catch:{ all -> 0x0357 }
            f34152n = r9     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "shuffle_dns"
            r10 = -1
            int r9 = r1.getInt(r9, r10)     // Catch:{ all -> 0x0357 }
            f34144at = r9     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "use_dns_mapping"
            int r9 = r1.getInt(r9, r10)     // Catch:{ all -> 0x0357 }
            com.bytedance.frameworks.baselib.network.http.C10142f.m30100a(r9)     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "use_http_dns"
            int r9 = r1.getInt(r9, r10)     // Catch:{ all -> 0x0357 }
            f34142an = r9     // Catch:{ all -> 0x0357 }
            java.lang.String r9 = "use_http_dns_refetch_on_expire"
            int r9 = r1.getInt(r9, r10)     // Catch:{ all -> 0x0357 }
            f34143ao = r9     // Catch:{ all -> 0x0357 }
            com.bytedance.ttnet.utils.C12994a.m37912a(r1)     // Catch:{ all -> 0x0357 }
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ all -> 0x0357 }
            r9.<init>()     // Catch:{ all -> 0x0357 }
            boolean r10 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ all -> 0x0357 }
            if (r10 != 0) goto L_0x01df
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x01df }
            r10.<init>(r2)     // Catch:{ Exception -> 0x01df }
            m37636b(r9, r10)     // Catch:{ Exception -> 0x01df }
            monitor-enter(r13)     // Catch:{ Exception -> 0x01df }
            r13.f34209z = r9     // Catch:{ all -> 0x01dc }
            monitor-exit(r13)     // Catch:{ all -> 0x01dc }
            goto L_0x01df
        L_0x01dc:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x01dc }
            throw r2     // Catch:{ Exception -> 0x01df }
        L_0x01df:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0357 }
            r2.<init>()     // Catch:{ all -> 0x0357 }
            boolean r9 = com.bytedance.common.utility.C6319n.m19593a(r4)     // Catch:{ all -> 0x0357 }
            if (r9 != 0) goto L_0x0204
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ Exception -> 0x0204 }
            r9.<init>(r4)     // Catch:{ Exception -> 0x0204 }
            m37629a(r2, r9)     // Catch:{ Exception -> 0x0204 }
            monitor-enter(r13)     // Catch:{ Exception -> 0x0204 }
            r13.f34154B = r2     // Catch:{ all -> 0x0201 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0201 }
            r4.<init>()     // Catch:{ all -> 0x0201 }
            r4.putAll(r2)     // Catch:{ all -> 0x0201 }
            r13.f34155C = r4     // Catch:{ all -> 0x0201 }
            monitor-exit(r13)     // Catch:{ all -> 0x0201 }
            goto L_0x0204
        L_0x0201:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0201 }
            throw r2     // Catch:{ Exception -> 0x0204 }
        L_0x0204:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0357 }
            r2.<init>()     // Catch:{ all -> 0x0357 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ all -> 0x0357 }
            if (r4 != 0) goto L_0x0229
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x0229 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0229 }
            r13.m37630a(r2, r4, r0)     // Catch:{ Exception -> 0x0229 }
            monitor-enter(r13)     // Catch:{ Exception -> 0x0229 }
            r13.f34192c = r2     // Catch:{ all -> 0x0226 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0226 }
            r4.<init>()     // Catch:{ all -> 0x0226 }
            r4.putAll(r2)     // Catch:{ all -> 0x0226 }
            r13.f34153A = r4     // Catch:{ all -> 0x0226 }
            monitor-exit(r13)     // Catch:{ all -> 0x0226 }
            goto L_0x0229
        L_0x0226:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0226 }
            throw r2     // Catch:{ Exception -> 0x0229 }
        L_0x0229:
            java.util.Set r2 = m37640f(r6)     // Catch:{ all -> 0x0357 }
            r13.f34179aa = r2     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = "https_to_http"
            int r2 = r1.getInt(r2, r0)     // Catch:{ all -> 0x0357 }
            f34137ai = r2     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = "http_to_https"
            int r2 = r1.getInt(r2, r0)     // Catch:{ all -> 0x0357 }
            f34138aj = r2     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = "https_retry_http"
            int r2 = r1.getInt(r2, r0)     // Catch:{ all -> 0x0357 }
            f34139ak = r2     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = "http_show_hijack"
            int r2 = r1.getInt(r2, r0)     // Catch:{ all -> 0x0357 }
            f34140al = r2     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = "http_verify_sign"
            int r0 = r1.getInt(r2, r0)     // Catch:{ all -> 0x0357 }
            f34141am = r0     // Catch:{ all -> 0x0357 }
            java.lang.String r0 = "frontier_urls"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)     // Catch:{ all -> 0x0357 }
            r13.f34156D = r0     // Catch:{ all -> 0x0357 }
            java.lang.String r0 = "share_cookie_host_list"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = ","
            java.lang.String[] r2 = r0.split(r2)     // Catch:{ all -> 0x0357 }
            int r4 = r2.length     // Catch:{ all -> 0x0357 }
            r5 = 0
        L_0x0271:
            if (r5 >= r4) goto L_0x0283
            r9 = r2[r5]     // Catch:{ all -> 0x0357 }
            boolean r10 = com.bytedance.common.utility.C6319n.m19593a(r9)     // Catch:{ all -> 0x0357 }
            if (r10 != 0) goto L_0x0280
            java.util.List<java.lang.String> r10 = r13.f34184af     // Catch:{ all -> 0x0357 }
            r10.add(r9)     // Catch:{ all -> 0x0357 }
        L_0x0280:
            int r5 = r5 + 1
            goto L_0x0271
        L_0x0283:
            com.bytedance.ttnet.c r2 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ all -> 0x0357 }
            java.lang.String r2 = r2.mo31473g()     // Catch:{ all -> 0x0357 }
            boolean r4 = com.bytedance.common.utility.C6319n.m19593a(r2)     // Catch:{ all -> 0x0357 }
            if (r4 != 0) goto L_0x029e
            java.util.List<java.lang.String> r4 = r13.f34184af     // Catch:{ all -> 0x0357 }
            boolean r4 = com.bytedance.ttnet.utils.C13006h.m37955a(r2, r4)     // Catch:{ all -> 0x0357 }
            if (r4 != 0) goto L_0x029e
            java.util.List<java.lang.String> r4 = r13.f34184af     // Catch:{ all -> 0x0357 }
            r4.add(r2)     // Catch:{ all -> 0x0357 }
        L_0x029e:
            com.bytedance.ttnet.d.c r2 = com.bytedance.ttnet.p672d.C12971c.m37800a()     // Catch:{ all -> 0x0357 }
            com.bytedance.ttnet.d.b r2 = r2.f34343a     // Catch:{ all -> 0x0357 }
            if (r2 == 0) goto L_0x02af
            com.bytedance.ttnet.d.c r2 = com.bytedance.ttnet.p672d.C12971c.m37800a()     // Catch:{ all -> 0x0357 }
            com.bytedance.ttnet.d.b r2 = r2.f34343a     // Catch:{ all -> 0x0357 }
            r2.mo31486a()     // Catch:{ all -> 0x0357 }
        L_0x02af:
            java.lang.String r2 = "disable_framed_transport"
            int r1 = r1.getInt(r2, r3)     // Catch:{ all -> 0x0357 }
            if (r1 <= 0) goto L_0x02ba
            com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10108b.m30007a(r1)     // Catch:{ Throwable -> 0x02ba }
        L_0x02ba:
            boolean r2 = r13.f34198o     // Catch:{ all -> 0x0357 }
            if (r2 == 0) goto L_0x0355
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x0355 }
            r2.<init>()     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = r13.f34156D     // Catch:{ Throwable -> 0x0355 }
            boolean r3 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ Throwable -> 0x0355 }
            if (r3 != 0) goto L_0x02d2
            java.lang.String r3 = "frontier_urls"
            java.lang.String r4 = r13.f34156D     // Catch:{ Throwable -> 0x0355 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0355 }
        L_0x02d2:
            java.lang.String r3 = "chromium_open"
            int r4 = r13.f34193e     // Catch:{ Throwable -> 0x0355 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0355 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "http_dns_enabled"
            int r4 = r13.f34162J     // Catch:{ Throwable -> 0x0355 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0355 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "add_ss_queries_open"
            int r4 = r13.f34169Q     // Catch:{ Throwable -> 0x0355 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0355 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "add_ss_queries_header_open"
            int r4 = r13.f34170R     // Catch:{ Throwable -> 0x0355 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0355 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "add_ss_queries_plaintext_open"
            int r4 = r13.f34171S     // Catch:{ Throwable -> 0x0355 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0355 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "ttnet_token_enabled"
            int r4 = r13.f34178Z     // Catch:{ Throwable -> 0x0355 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0355 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "ttnet_token_api"
            r2.put(r3, r6)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "ttnet_token_config_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x0355 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "request_max_delay_time"
            int r4 = r13.f34180ab     // Catch:{ Throwable -> 0x0355 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0355 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "request_random_delay_apis"
            r2.put(r3, r7)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "request_delay_time_range"
            r2.put(r3, r8)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r3 = "share_cookie_host_list"
            r2.put(r3, r0)     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r0 = "disable_framed_transport"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x0355 }
            r2.put(r0, r1)     // Catch:{ Throwable -> 0x0355 }
            com.bytedance.ttnet.a.a$5 r0 = new com.bytedance.ttnet.a.a$5     // Catch:{ Throwable -> 0x0355 }
            java.lang.String r1 = "SaveMapToProvider-Thread"
            r0.<init>(r1, r2)     // Catch:{ Throwable -> 0x0355 }
            r0.start()     // Catch:{ Throwable -> 0x0355 }
            monitor-exit(r13)
            return
        L_0x0355:
            monitor-exit(r13)
            return
        L_0x0357:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12925a.mo31419l():void");
    }

    /* renamed from: b */
    public static void m37637b(boolean z) {
        f34148j = z;
    }

    /* renamed from: c */
    public static void m37638c(boolean z) {
        f34149k = true;
    }

    /* renamed from: e */
    public final boolean mo30433e(String str) {
        return C12990a.m37891a(str, this.f34183ae);
    }

    /* renamed from: d */
    public final List<String> mo24814d(String str) {
        if (C13006h.m37955a(str, this.f34184af)) {
            return this.f34184af;
        }
        return null;
    }

    /* renamed from: b */
    public static void m37635b(Context context) {
        C12925a aVar = f34150l;
        if (aVar != null) {
            if (C10186f.m30256b(context)) {
                aVar.m37639e(true);
                return;
            }
            aVar.mo31417j();
        }
    }

    /* renamed from: a */
    public final boolean mo31411a(final boolean z) {
        if (!this.f34204u.compareAndSet(false, true)) {
            return false;
        }
        if (z) {
            this.f34203t = System.currentTimeMillis();
        }
        new C6304f("AppConfigThread") {
            public final void run() {
                C12925a.this.mo31412d(z);
            }
        }.start();
        return true;
    }

    /* renamed from: a */
    private static String m37627a(Map<C12934a, C12934a> map) {
        try {
            JSONArray jSONArray = new JSONArray();
            if (map.size() > 0) {
                for (C12934a aVar : map.keySet()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C12934a.f34221a, aVar.f34223c);
                    jSONObject.put(C12934a.f34222b, aVar.f34225e);
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    private void m37639e(boolean z) {
        if (this.f34198o) {
            m37641f(z);
            if (this.f34194f != null) {
                this.f34194f.mo31445b(this.f34191b);
            }
        } else if (this.f34202s <= 0) {
            try {
                new C6304f("LoadDomainConfig4Other-Thread") {
                    public final void run() {
                        C12925a.this.mo31418k();
                    }
                }.start();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: f */
    static Set<String> m37640f(String str) {
        Set set;
        if (C6319n.m19593a(str)) {
            return Collections.emptySet();
        }
        Set emptySet = Collections.emptySet();
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                set = new LinkedHashSet();
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        set.add(jSONArray.getString(i));
                        i++;
                    } catch (Throwable unused) {
                    }
                }
                return set;
            }
        } catch (Throwable unused2) {
        }
        set = emptySet;
        return set;
    }

    /* renamed from: i */
    private void m37642i(String str) {
        if (!C6319n.m19593a(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                HashMap<String, String> hashMap = new HashMap<>();
                if (m37633a(hashMap, jSONObject)) {
                    this.f34206w = hashMap;
                    HashMap<String, String> hashMap2 = new HashMap<>();
                    hashMap2.putAll(hashMap);
                    this.f34207x = hashMap2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final boolean mo24810b(String str) {
        if (C6319n.m19593a(str) || this.f34174V <= 0) {
            return false;
        }
        try {
            URI a = C10189i.m30260a(str);
            if (a == null) {
                return false;
            }
            String host = a.getHost();
            if (!C6319n.m19593a(host) && host.endsWith(C12924a.m37624c())) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final boolean mo24812c(String str) {
        if (C6319n.m19593a(str) || this.f34173U <= 0) {
            return false;
        }
        try {
            URI a = C10189i.m30260a(str);
            if (a == null) {
                return false;
            }
            String host = a.getHost();
            if (!C6319n.m19593a(host) && host.endsWith(C12924a.m37623b())) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: h */
    public final void mo31414h(String str) {
        boolean z;
        if (!C6319n.m19593a(str)) {
            try {
                m37650x();
                z = m37631a((Object) str);
            } catch (Exception unused) {
                z = false;
            }
            int i = 102;
            if (z) {
                i = BaseNotice.HASHTAG;
            }
            try {
                new JSONObject().put("from", "cronet");
                C12961d.m37772a();
            } catch (Throwable unused2) {
            }
            this.f34195g.sendEmptyMessage(i);
        }
    }

    /* renamed from: f */
    private void m37641f(boolean z) {
        long j;
        if (!this.f34201r) {
            if (this.f34200q) {
                this.f34200q = false;
                this.f34202s = 0;
                this.f34203t = 0;
            }
            if (z) {
                j = 10800000;
            } else {
                j = 43200000;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f34202s > j && currentTimeMillis - this.f34203t > 120000) {
                boolean a = C12936b.m37684a(this.f34191b);
                if (!this.f34205v || a) {
                    mo31411a(a);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003d A[SYNTHETIC, Splitter:B:23:0x003d] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<java.net.InetAddress> m37643j(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            int r1 = f34142an     // Catch:{ Throwable -> 0x0067 }
            if (r1 > 0) goto L_0x000e
            boolean r1 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ Throwable -> 0x0067 }
            if (r1 == 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r1 = r0
            goto L_0x003a
        L_0x000e:
            monitor-enter(r7)     // Catch:{ Throwable -> 0x0067 }
            com.bytedance.common.a.e r1 = r7.f34188aq     // Catch:{ all -> 0x0064 }
            if (r1 != 0) goto L_0x0037
            android.content.Context r1 = r7.f34191b     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "131950"
            r3 = 300(0x12c, double:1.48E-321)
            int r5 = f34143ao     // Catch:{ all -> 0x0064 }
            r6 = 1
            if (r5 <= 0) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            com.bytedance.common.a.e r1 = com.bytedance.common.p477a.C9674d.m28581a(r1, r2, r3, r5)     // Catch:{ all -> 0x0064 }
            r7.f34188aq = r1     // Catch:{ all -> 0x0064 }
            com.bytedance.common.a.e r1 = r7.f34188aq     // Catch:{ all -> 0x0064 }
            r1.mo24043b(r6)     // Catch:{ all -> 0x0064 }
            boolean r1 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x0037
            com.bytedance.common.a.e r1 = r7.f34188aq     // Catch:{ all -> 0x0064 }
            r1.mo24041a(r6)     // Catch:{ all -> 0x0064 }
        L_0x0037:
            com.bytedance.common.a.e r1 = r7.f34188aq     // Catch:{ all -> 0x0064 }
            monitor-exit(r7)     // Catch:{ all -> 0x0064 }
        L_0x003a:
            if (r1 != 0) goto L_0x003d
            return r0
        L_0x003d:
            java.lang.String r2 = com.bytedance.ttnet.C12924a.m37623b()     // Catch:{ Throwable -> 0x0067 }
            boolean r2 = r8.endsWith(r2)     // Catch:{ Throwable -> 0x0067 }
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = ".pstatp.com"
            boolean r2 = r8.endsWith(r2)     // Catch:{ Throwable -> 0x0067 }
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = ".bytecdn.com"
            boolean r2 = r8.endsWith(r2)     // Catch:{ Throwable -> 0x0067 }
            if (r2 == 0) goto L_0x0067
        L_0x0057:
            java.util.List r8 = r1.mo24040a(r8)     // Catch:{ Throwable -> 0x0067 }
            if (r8 == 0) goto L_0x0067
            int r1 = r8.size()     // Catch:{ Throwable -> 0x0067 }
            if (r1 <= 0) goto L_0x0067
            return r8
        L_0x0064:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0064 }
            throw r8     // Catch:{ Throwable -> 0x0067 }
        L_0x0067:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12925a.m37643j(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo31412d(boolean z) {
        mo31419l();
        if (mo31415h()) {
            this.f34204u.set(false);
            return;
        }
        int i = 1;
        this.f34201r = true;
        int i2 = 102;
        if (!z) {
            this.f34195g.sendEmptyMessage(102);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (m37634a(jSONArray)) {
                i2 = BaseNotice.HASHTAG;
            } else {
                i = 0;
            }
            jSONObject.put(WebKitApi.SCHEME_HTTPS, jSONArray);
            jSONObject.put("from", "app");
            jSONObject.put("available_state", i);
        } catch (JSONException unused) {
            this.f34204u.set(false);
        }
        C12961d.m37772a();
        this.f34195g.sendEmptyMessage(i2);
    }

    public void handleMsg(Message message) {
        switch (message.what) {
            case BaseNotice.HASHTAG /*101*/:
                this.f34201r = false;
                this.f34202s = System.currentTimeMillis();
                if (this.f34200q) {
                    mo31417j();
                }
                try {
                    mo31424t();
                    if (f34142an <= 0 && this.f34188aq != null) {
                        this.f34188aq.mo24042b();
                    }
                } catch (Throwable unused) {
                }
                this.f34204u.set(false);
                return;
            case 102:
                this.f34201r = false;
                if (this.f34200q) {
                    mo31417j();
                }
                this.f34204u.set(false);
                break;
        }
    }

    /* renamed from: a */
    public static C12925a m37625a(Context context) {
        C12925a aVar;
        synchronized (C12925a.class) {
            if (f34150l == null) {
                boolean b = C10186f.m30256b(context);
                f34150l = new C12925a(context.getApplicationContext(), b);
                if (b) {
                    C6367a.m19795a(f34150l);
                    C10124b.m30053a((C10128c) f34150l);
                    C10124b.m30052a((C10127b) f34150l);
                    C12947b.m37742a((C12950b) f34150l);
                    C10087c.m29957b().mo24733a((C10089b) f34150l);
                    C10142f.m30108a((C10149g) f34150l);
                    C10142f.m30106a((C10147e) f34150l);
                    C12980c.m37836a((C12981a) f34150l);
                    SsHttpCall.setThrottleControl(f34150l);
                    if (C10142f.m30129l() == null) {
                        C10142f.m30109a((C10150h) f34150l);
                    }
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
                    context.registerReceiver(new C12935b(), intentFilter);
                    C12946i i = C12946i.m37726i();
                    C6367a.m19795a(i);
                    C10124b.m30053a((C10128c) i);
                    C10124b.m30052a((C10127b) i);
                    C12947b.m37742a((C12950b) i);
                    C12980c.m37836a((C12981a) i);
                    SsHttpCall.setThrottleControl(i);
                    if (C10142f.m30129l() == null) {
                        C10142f.m30109a((C10150h) i);
                    }
                }
                C10142f.m30105a((C10145c) f34150l);
                C12938d.m37687a(context);
            }
            aVar = f34150l;
        }
        return aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:3|4|(2:6|(2:46|8)(1:9))|45|10|(1:15)(1:14)|(3:16|17|(2:24|(11:26|27|28|29|32|33|(1:35)|36|(1:40)|41|44)))|30|32|33|(0)|36|38|40|41|44) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x007e */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[Catch:{ Throwable -> 0x00c4 }] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo31413g(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r10)
            if (r0 == 0) goto L_0x0007
            return r10
        L_0x0007:
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.C10189i.m30260a(r10)     // Catch:{ Throwable -> 0x00c4 }
            r1 = 1
            java.net.URI r0 = r9.m37628a(r0, r1)     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r2 = r0.getHost()     // Catch:{ Throwable -> 0x00c4 }
            int r3 = r0.getPort()     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r4 = r0.getScheme()     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String[] r5 = m37646s()     // Catch:{ Throwable -> 0x00c4 }
            int r6 = r5.length     // Catch:{ Throwable -> 0x00c4 }
            r7 = 0
        L_0x0022:
            if (r7 >= r6) goto L_0x0030
            r8 = r5[r7]     // Catch:{ Throwable -> 0x00c4 }
            boolean r8 = r8.equals(r2)     // Catch:{ Throwable -> 0x00c4 }
            if (r8 == 0) goto L_0x002d
            return r10
        L_0x002d:
            int r7 = r7 + 1
            goto L_0x0022
        L_0x0030:
            java.util.Map<java.lang.String, java.lang.String> r5 = r9.f34208y     // Catch:{ Throwable -> 0x00c4 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x00c4 }
            r6 = 0
            if (r5 == 0) goto L_0x0048
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.f34207x     // Catch:{ Throwable -> 0x00c4 }
            if (r7 == 0) goto L_0x0048
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r9.f34207x     // Catch:{ Throwable -> 0x00c4 }
            java.lang.Object r5 = r7.get(r5)     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x00c4 }
            goto L_0x0049
        L_0x0048:
            r5 = r6
        L_0x0049:
            java.lang.String r7 = com.bytedance.ttnet.C12924a.m37621a()     // Catch:{ Throwable -> 0x007d }
            java.lang.String r7 = com.bytedance.ttnet.C12924a.m37622a(r7)     // Catch:{ Throwable -> 0x007d }
            boolean r2 = r7.equals(r2)     // Catch:{ Throwable -> 0x007d }
            if (r2 != 0) goto L_0x0067
            if (r5 == 0) goto L_0x007d
            java.lang.String r2 = com.bytedance.ttnet.C12924a.m37621a()     // Catch:{ Throwable -> 0x007d }
            java.lang.String r2 = com.bytedance.ttnet.C12924a.m37622a(r2)     // Catch:{ Throwable -> 0x007d }
            boolean r2 = r2.equals(r5)     // Catch:{ Throwable -> 0x007d }
            if (r2 == 0) goto L_0x007d
        L_0x0067:
            com.bytedance.ttnet.a.e r2 = r9.f34194f     // Catch:{ Throwable -> 0x007d }
            if (r2 == 0) goto L_0x007d
            com.bytedance.ttnet.a.e r2 = r9.f34194f     // Catch:{ Throwable -> 0x007d }
            android.util.Pair r2 = r2.mo31444b()     // Catch:{ Throwable -> 0x007d }
            if (r2 == 0) goto L_0x007d
            java.lang.Object r7 = r2.first     // Catch:{ Throwable -> 0x007d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Throwable -> 0x007d }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x007e }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x007e }
            r5 = r2
            goto L_0x007e
        L_0x007d:
            r7 = r6
        L_0x007e:
            boolean r2 = com.bytedance.common.utility.C6319n.m19593a(r5)     // Catch:{ Throwable -> 0x00c4 }
            if (r2 != 0) goto L_0x008d
            com.bytedance.frameworks.baselib.network.http.util.b r2 = new com.bytedance.frameworks.baselib.network.http.util.b     // Catch:{ Throwable -> 0x00c4 }
            r2.<init>(r5, r3, r4)     // Catch:{ Throwable -> 0x00c4 }
            java.net.URI r0 = com.bytedance.frameworks.baselib.network.http.util.C10189i.m30262a(r0, r2)     // Catch:{ Throwable -> 0x00c4 }
        L_0x008d:
            java.lang.String r0 = r9.m37626a(r0, r6, r7, r1)     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r1 = "?"
            boolean r1 = r0.contains(r1)     // Catch:{ Throwable -> 0x00c4 }
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = "?"
            boolean r1 = r10.contains(r1)     // Catch:{ Throwable -> 0x00c4 }
            if (r1 == 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00c4 }
            r1.<init>()     // Catch:{ Throwable -> 0x00c4 }
            r1.append(r0)     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r0 = "?"
            int r0 = r10.indexOf(r0)     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r0 = r10.substring(r0)     // Catch:{ Throwable -> 0x00c4 }
            r1.append(r0)     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x00c4 }
        L_0x00ba:
            r10 = r0
            com.bytedance.ttnet.d.c r0 = com.bytedance.ttnet.p672d.C12971c.m37800a()     // Catch:{ Throwable -> 0x00c4 }
            java.lang.String r0 = r0.mo31489a(r10)     // Catch:{ Throwable -> 0x00c4 }
            goto L_0x00c5
        L_0x00c4:
            r0 = r10
        L_0x00c5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.p670a.C12925a.mo31413g(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static void m37629a(HashMap<String, String> hashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("origin");
                    if (!C6319n.m19593a(optString)) {
                        String optString2 = optJSONObject.optString("target");
                        if (!C6319n.m19593a(optString2)) {
                            hashMap.put(optString, optString2);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m37636b(HashMap<String, InetAddress[]> hashMap, JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < length; i++) {
                    try {
                        arrayList.clear();
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        String string = optJSONObject.getString("host");
                        if (!C6319n.m19593a(string)) {
                            JSONArray optJSONArray = optJSONObject.optJSONArray("ip");
                            int min = Math.min(optJSONArray.length(), 3);
                            for (int i2 = 0; i2 < min; i2++) {
                                String string2 = optJSONArray.getString(i2);
                                if (C10184d.m30251a(string2)) {
                                    InetAddress byAddress = InetAddress.getByAddress(string, InetAddress.getByName(string2).getAddress());
                                    if (byAddress != null) {
                                        arrayList.add(byAddress);
                                    }
                                }
                            }
                            if (arrayList.size() > 0) {
                                InetAddress[] inetAddressArr = new InetAddress[arrayList.size()];
                                arrayList.toArray(inetAddressArr);
                                hashMap.put(string, inetAddressArr);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
        }
    }

    private C12925a(Context context, boolean z) {
        this.f34191b = context;
        this.f34208y = C12961d.m37772a().mo31472f();
        String a = C12924a.m37622a(C12924a.m37621a());
        this.f34198o = z;
        if (this.f34198o) {
            m37647u();
            try {
                this.f34190as = new C12987b(a, 80);
                this.f34189ar = new C12988c(this.f34191b).mo31522a(30).mo31525b(this.f34190as);
                this.f34197i.mo31505a(this.f34191b);
                this.f34189ar.mo31530f();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private URI m37628a(URI uri, boolean z) {
        if (this.f34168P <= 0 || uri == null) {
            return uri;
        }
        try {
            HashMap<String, String> hashMap = this.f34154B;
            if (z) {
                hashMap = this.f34155C;
            }
            if (hashMap != null) {
                if (!hashMap.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    String host = uri.getHost();
                    int port = uri.getPort();
                    String rawPath = uri.getRawPath();
                    if (host != null) {
                        sb.append(host);
                        if (port > 0) {
                            sb.append(':');
                            sb.append(port);
                        }
                    }
                    if (rawPath == null || !rawPath.startsWith("/")) {
                        sb.append('/');
                    }
                    if (rawPath != null) {
                        sb.append(rawPath);
                    }
                    String sb2 = sb.toString();
                    String str = (String) hashMap.get(sb2);
                    if (C6319n.m19593a(str)) {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Entry entry = (Entry) it.next();
                            if (entry != null) {
                                String str2 = (String) entry.getKey();
                                String str3 = (String) entry.getValue();
                                if (sb2.startsWith(str2)) {
                                    str = sb2.replaceFirst(str2, str3);
                                    break;
                                }
                            }
                        }
                    }
                    if (!C6319n.m19593a(str)) {
                        StringBuilder sb3 = new StringBuilder();
                        if (uri.getScheme() != null) {
                            sb3.append(uri.getScheme());
                            sb3.append("://");
                        }
                        sb3.append(str);
                        URI uri2 = new URI(sb3.toString());
                        return C10189i.m30261a(uri2.getScheme(), uri2.getHost(), uri2.getPort(), uri2.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
                    }
                    return uri;
                }
            }
            return uri;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m37630a(Map<C12934a, C12934a> map, JSONArray jSONArray, boolean z) {
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    try {
                        C12934a aVar = new C12934a();
                        if (z) {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i);
                            aVar.mo31427a(optJSONObject.optString(C12934a.f34221a));
                            int optInt = optJSONObject.optInt(C12934a.f34222b);
                            if (this.f34186ah > 0) {
                                aVar.f34225e = optInt;
                            } else {
                                aVar.f34225e = 0;
                            }
                        } else {
                            aVar.mo31427a(jSONArray.optString(i));
                            aVar.f34225e = 0;
                        }
                        map.put(aVar, aVar);
                    } catch (Exception unused) {
                    }
                }
                synchronized (this) {
                    if (this.f34192c != null && this.f34192c.size() > 0) {
                        for (C12934a aVar2 : this.f34192c.keySet()) {
                            if (map.containsKey(aVar2)) {
                                map.remove(aVar2);
                                map.put(aVar2, aVar2);
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: a */
    private String m37626a(URI uri, C10122c cVar, String str, boolean z) {
        String str2;
        int i;
        C12960e eVar = null;
        if (uri == null) {
            return null;
        }
        if (cVar instanceof C12960e) {
            eVar = (C12960e) cVar;
        }
        if (eVar != null && eVar.f34306o) {
            return uri.toString();
        }
        if (!m37648v()) {
            return uri.toString();
        }
        String uri2 = uri.toString();
        try {
            if (NetworkUtils.m19545a(this.f34191b)) {
                return uri2;
            }
            if (!m37649w() || C6319n.m19593a(str)) {
                C12934a[] aVarArr = new C12934a[1];
                if (m37632a(uri2, aVarArr, z)) {
                    boolean z2 = false;
                    C12934a aVar = aVarArr[0];
                    if (aVar != null && aVar.mo31428a()) {
                        z2 = true;
                    }
                    if (eVar != null) {
                        if (aVar == null) {
                            i = -1;
                        } else {
                            i = aVar.f34225e;
                        }
                        eVar.f34308q = i;
                    }
                    if (uri2.startsWith(WebKitApi.SCHEME_HTTP) && z2 && (C6319n.m19593a(str) || !WebKitApi.SCHEME_HTTP.equals(str))) {
                        str2 = uri2.replaceFirst(WebKitApi.SCHEME_HTTP, WebKitApi.SCHEME_HTTPS);
                        if (eVar != null) {
                            eVar.f34307p = true;
                        }
                        return str2;
                    }
                }
                str2 = uri2;
                return str2;
            }
            str2 = C10189i.m30262a(uri, new C10182b(uri.getHost(), uri.getPort(), str)).toString();
            if (eVar != null) {
                try {
                    if (str.equals(WebKitApi.SCHEME_HTTPS)) {
                        eVar.f34307p = true;
                    }
                } catch (Throwable unused) {
                }
            }
            return str2;
        } catch (Throwable unused2) {
        }
    }
}
