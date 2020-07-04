package com.p280ss.videoarch.liveplayer.p1835b;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1642a;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.videoarch.liveplayer.C46300c;
import com.p280ss.videoarch.liveplayer.log.LiveError;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.b.a */
public final class C46286a {

    /* renamed from: b */
    public static volatile long f118922b;

    /* renamed from: a */
    public volatile String f118923a;

    /* renamed from: c */
    private final ExecutorService f118924c;

    /* renamed from: d */
    private final C46300c f118925d;

    /* renamed from: e */
    private Context f118926e;

    /* renamed from: f */
    private Future f118927f;

    /* renamed from: g */
    private volatile boolean f118928g;

    /* renamed from: h */
    private volatile C46290a f118929h;

    /* renamed from: i */
    private int f118930i = 600000;

    /* renamed from: j */
    private int f118931j = -1;

    /* renamed from: k */
    private int f118932k = -1;

    /* renamed from: l */
    private int f118933l = -1;

    /* renamed from: com.ss.videoarch.liveplayer.b.a$a */
    public interface C46290a {
        /* renamed from: a */
        void mo115041a(String str, String str2, LiveError liveError, boolean z);
    }

    /* renamed from: c */
    public final String mo115035c() {
        mo115033b();
        return this.f118923a;
    }

    /* renamed from: a */
    public final void mo115028a() {
        this.f118929h = null;
        if (this.f118927f != null && !this.f118927f.isDone()) {
            this.f118927f.cancel(true);
            this.f118927f = null;
        }
    }

    /* renamed from: b */
    public final void mo115033b() {
        if (SystemClock.elapsedRealtime() - f118922b >= 300000) {
            this.f118924c.submit(new Runnable() {
                public final void run() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            C46286a.this.f118923a = byName.getHostAddress();
                            C46286a.f118922b = SystemClock.elapsedRealtime();
                            new StringBuilder("update dns server ip:").append(C46286a.this.f118923a);
                        }
                    } catch (UnknownHostException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo115031a(boolean z) {
        boolean z2;
        if (!z || this.f118925d == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f118928g = z2;
    }

    /* renamed from: e */
    private static String m145309e(String str) {
        return C1642a.m8034a("http://%s/%s/d?host=%s", new Object[]{"203.107.1.4", "131950", str});
    }

    /* renamed from: d */
    public static boolean m145308d(String str) {
        if (str == null || str.length() < 7 || str.length() > 15 || "".equals(str)) {
            return false;
        }
        return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
    }

    /* renamed from: a */
    public final void mo115029a(final String str) {
        String e = m145309e(str);
        C46298e.m145339a(this.f118925d, e, mo115036c(e), new C46299a() {
            /* renamed from: a */
            public final void mo115038a(LiveError liveError) {
                C46286a.this.mo115032a(true, str, null, liveError, true);
            }

            /* renamed from: a */
            public final void mo115039a(JSONObject jSONObject) {
                String str;
                JSONArray optJSONArray = jSONObject.optJSONArray("ips");
                if (optJSONArray == null || optJSONArray.length() == 0) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("host", str);
                    C46286a.this.mo115032a(true, str, null, new LiveError(-111, "http dns response ip empty", hashMap), true);
                    return;
                }
                try {
                    str = optJSONArray.getString(0);
                } catch (Exception unused) {
                    str = null;
                }
                C46286a.this.mo115032a(true, str, str, null, true);
            }
        });
    }

    /* renamed from: b */
    public final void mo115034b(String str) {
        try {
            InetAddress byName = InetAddress.getByName(str);
            if (byName == null) {
                mo115032a(false, str, null, new LiveError(-110, "", null), true);
                return;
            }
            String hostAddress = byName.getHostAddress();
            if (byName instanceof Inet6Address) {
                hostAddress = C1642a.m8034a("[%s]", new Object[]{hostAddress});
            }
            mo115032a(false, str, hostAddress, null, true);
        } catch (UnknownHostException e) {
            HashMap hashMap = new HashMap();
            hashMap.put("reason", "Unknown host name");
            hashMap.put("host", str);
            hashMap.put("exception", e.toString());
            mo115032a(false, str, null, new LiveError(-110, "Unknown Host", hashMap), true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo115036c(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x004f
            int r0 = r6.length()
            if (r0 != 0) goto L_0x0009
            goto L_0x004f
        L_0x0009:
            java.lang.String r0 = "://"
            int r0 = r6.indexOf(r0)
            int r0 = r0 + 3
            r5.f118931j = r0
            r0 = -1
            r5.f118932k = r0
            int r1 = r5.f118931j
            int r2 = r6.length()
        L_0x001c:
            if (r1 >= r2) goto L_0x003c
            char r3 = r6.charAt(r1)
            r4 = 35
            if (r3 == r4) goto L_0x003c
            r4 = 47
            if (r3 == r4) goto L_0x003c
            r4 = 58
            if (r3 == r4) goto L_0x0037
            switch(r3) {
                case 63: goto L_0x003c;
                case 64: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x0039
        L_0x0032:
            int r3 = r1 + 1
            r5.f118931j = r3
            goto L_0x0039
        L_0x0037:
            r5.f118932k = r1
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x001c
        L_0x003c:
            r5.f118933l = r1
            int r1 = r5.f118932k
            if (r1 != r0) goto L_0x0046
            int r0 = r5.f118933l
            r5.f118932k = r0
        L_0x0046:
            int r0 = r5.f118931j
            int r1 = r5.f118932k
            java.lang.String r6 = r6.substring(r0, r1)
            return r6
        L_0x004f:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.videoarch.liveplayer.p1835b.C46286a.mo115036c(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final void mo115030a(final String str, C46290a aVar) {
        int i;
        String str2;
        if (!TextUtils.isEmpty(str)) {
            if (this.f118924c != null) {
                final boolean z = this.f118928g;
                mo115028a();
                this.f118929h = aVar;
                NetworkInfo a = C46297d.m145338a(this.f118926e);
                if (a == null || !a.isAvailable()) {
                    str2 = null;
                    i = -1;
                } else {
                    i = a.getType();
                    str2 = a.getExtraInfo();
                }
                C46291b.m145323a();
                int c = C46291b.m145325c();
                boolean z2 = true;
                if (i != -1 && i == c) {
                    C46291b.m145323a();
                    String d = C46291b.m145327d();
                    if (str2 == null || (d != null && str2.equals(d))) {
                        z2 = false;
                    }
                }
                if (z2) {
                    C46291b.m145323a().mo115044b();
                    C46291b.m145323a();
                    C46291b.m145326c(str2);
                    C46291b.m145323a();
                    C46291b.m145324a(i);
                }
                C46292a a2 = C46291b.m145323a().mo115042a(str);
                if (a2 != null && System.currentTimeMillis() - a2.f118945b <= ((long) this.f118930i) && !a2.f118946c) {
                    mo115032a(this.f118928g, str, a2.f118944a, null, false);
                } else if (!this.f118924c.isShutdown()) {
                    this.f118927f = this.f118924c.submit(new Runnable() {
                        public final void run() {
                            if (z) {
                                C46286a.this.mo115029a(str);
                            } else {
                                C46286a.this.mo115034b(str);
                            }
                        }
                    });
                } else {
                    mo115032a(false, str, null, null, false);
                }
            } else {
                throw new IllegalStateException("mExecutor should not be null");
            }
        }
    }

    public C46286a(Context context, ExecutorService executorService, C46300c cVar) {
        this.f118926e = context;
        this.f118924c = executorService;
        this.f118925d = cVar;
    }

    /* renamed from: a */
    public final String mo115027a(String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        boolean startsWith = str.startsWith(WebKitApi.SCHEME_HTTP);
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, this.f118931j));
        sb.append(str2);
        String sb2 = sb.toString();
        int i = this.f118932k;
        if (this.f118933l != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(str.substring(this.f118932k, this.f118933l));
            sb2 = sb3.toString();
            i = this.f118933l;
        }
        if (!startsWith) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("/");
            sb4.append(mo115036c(str));
            sb2 = sb4.toString();
        } else if (map != null) {
            map.put("Host", C1642a.m8034a(" %s", new Object[]{mo115036c(str)}));
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append(str.substring(i));
        return sb5.toString();
    }

    /* renamed from: a */
    public final void mo115032a(boolean z, String str, String str2, LiveError liveError, boolean z2) {
        if (this.f118928g == z) {
            C46290a aVar = this.f118929h;
            if (aVar != null) {
                if (z2) {
                    C46292a aVar2 = new C46292a();
                    aVar2.f118945b = System.currentTimeMillis();
                    aVar2.f118944a = str2;
                    aVar2.f118946c = false;
                    C46291b.m145323a().mo115043a(str, aVar2);
                }
                aVar.mo115041a(str, str2, liveError, z2);
            }
        }
    }
}
