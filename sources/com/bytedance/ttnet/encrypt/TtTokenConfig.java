package com.bytedance.ttnet.encrypt;

import android.content.Context;
import android.util.Base64;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10152j;
import com.bytedance.frameworks.baselib.network.http.util.C10186f;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12488k;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p264b.C6447a;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6463n;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.encrypt.C12980c.C12981a;
import com.bytedance.ttnet.hostmonitor.HostMonitorBroadcastReceiver;
import com.bytedance.ttnet.hostmonitor.HostStatus;
import com.bytedance.ttnet.utils.C13000c;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TtTokenConfig {

    /* renamed from: f */
    private static TtTokenConfig f34358f;

    /* renamed from: a */
    public Object f34359a = new Object();

    /* renamed from: b */
    public C12977a f34360b;

    /* renamed from: c */
    final HostMonitorBroadcastReceiver f34361c = new HostMonitorBroadcastReceiver() {
        /* renamed from: a */
        public final void mo31425a(HostStatus hostStatus) {
            if (hostStatus != null) {
                try {
                    if (C10186f.m30256b(C12961d.m37772a().mo31461a())) {
                        super.mo31425a(hostStatus);
                        if (hostStatus.f34383d) {
                            TtTokenConfig.this.mo31498f();
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };

    /* renamed from: d */
    public AtomicBoolean f34362d = new AtomicBoolean(false);

    /* renamed from: e */
    public long f34363e = 0;

    /* renamed from: g */
    private C12977a f34364g;

    /* renamed from: h */
    private long f34365h = 0;

    /* renamed from: i */
    private int f34366i = 0;

    interface ISessionTokenApi {
        @C6457h
        C12466b<String> getSeesionToken(@C6447a boolean z, @C6463n int i, @C6450ac String str);
    }

    /* renamed from: com.bytedance.ttnet.encrypt.TtTokenConfig$a */
    public static final class C12977a {

        /* renamed from: a */
        long f34370a;

        /* renamed from: b */
        long f34371b;

        /* renamed from: c */
        String f34372c;

        /* renamed from: d */
        byte[] f34373d;

        /* renamed from: e */
        byte[] f34374e;

        public final String toString() {
            StringBuilder sb = new StringBuilder("SessionToken{request_time=");
            sb.append(this.f34370a);
            sb.append(", expire_time=");
            sb.append(this.f34371b);
            sb.append(", token='");
            sb.append(this.f34372c);
            sb.append('\'');
            sb.append(", key=");
            sb.append(Arrays.toString(this.f34373d));
            sb.append(", hmac_key=");
            sb.append(Arrays.toString(this.f34374e));
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static TtTokenConfig m37818a() {
        if (f34358f == null) {
            synchronized (TtTokenConfig.class) {
                if (f34358f == null) {
                    f34358f = new TtTokenConfig();
                }
            }
        }
        return f34358f;
    }

    /* renamed from: b */
    public final C12977a mo31494b() {
        C12977a aVar;
        if (!C10186f.m30256b(C12961d.m37772a().mo31461a())) {
            m37819h();
        }
        synchronized (this.f34359a) {
            aVar = this.f34360b;
        }
        return aVar;
    }

    /* renamed from: d */
    public final void mo31496d() {
        C12981a d = C12980c.m37838d();
        if (d != null && d.mo31421p()) {
            List<C10152j> b = C10142f.m30116b();
            if (b != null && b.size() > 0) {
                Map c = mo31495c();
                for (C10152j a : b) {
                    try {
                        a.mo24788a(c);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo31497e() {
        try {
            if (this.f34360b != null) {
                synchronized (this.f34359a) {
                    this.f34360b.f34372c = "";
                    this.f34360b.f34373d = null;
                    this.f34360b.f34374e = null;
                    this.f34360b.f34371b = 0;
                }
                mo31496d();
                mo31499g();
                mo31498f();
            }
        } catch (Throwable unused) {
        }
    }

    private TtTokenConfig() {
        if (C10186f.m30256b(C12961d.m37772a().mo31461a())) {
            this.f34361c.mo31505a(C12961d.m37772a().mo31461a());
        }
        this.f34364g = new C12977a();
        this.f34364g.f34373d = C13000c.m37929a(1000, "AES");
        this.f34364g.f34374e = C13000c.m37929a(1001, "HmacSHA256");
        m37819h();
    }

    /* renamed from: c */
    public final Map<String, ?> mo31495c() {
        if (this.f34360b == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.f34359a) {
            linkedHashMap.put("token", this.f34360b.f34372c);
            linkedHashMap.put("key", this.f34360b.f34373d);
            linkedHashMap.put("hmac_key", this.f34360b.f34374e);
            linkedHashMap.put("expire", Long.valueOf(this.f34360b.f34371b));
            linkedHashMap.put("request_time", Long.valueOf(this.f34360b.f34370a));
            linkedHashMap.put(C38347c.f99551f, Integer.valueOf(1));
            linkedHashMap.put("session_token", this.f34360b);
        }
        return linkedHashMap;
    }

    /* renamed from: h */
    private void m37819h() {
        try {
            long parseLong = Long.parseLong(C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "tt_token_rt", "-1"));
            if (this.f34363e <= 0 || this.f34363e != parseLong) {
                this.f34363e = parseLong;
                String a = C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "tt_token_t", "");
                String a2 = C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "tt_token_e", "");
                String a3 = C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "tt_token_h", "");
                String a4 = C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "tt_token_et", "0");
                if (!C6319n.m19593a(a) && !C6319n.m19593a(a2)) {
                    if (!C6319n.m19593a(a3)) {
                        C12977a aVar = new C12977a();
                        aVar.f34372c = new String((byte[]) C12979b.m37835b(this.f34364g, Base64.decode(a, 2)).second);
                        aVar.f34373d = (byte[]) C12979b.m37835b(this.f34364g, Base64.decode(a2, 2)).second;
                        aVar.f34374e = (byte[]) C12979b.m37835b(this.f34364g, Base64.decode(a3, 2)).second;
                        aVar.f34370a = parseLong;
                        aVar.f34371b = Long.parseLong(a4);
                        synchronized (this.f34359a) {
                            this.f34360b = aVar;
                        }
                        mo31496d();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public final void mo31498f() {
        long j;
        long j2;
        if (C10186f.m30256b(C12961d.m37772a().mo31461a())) {
            C12981a d = C12980c.m37838d();
            if (d != null && d.mo31421p()) {
                if (this.f34360b == null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (this.f34365h > 0) {
                        if (this.f34366i == 1) {
                            if (currentTimeMillis - this.f34365h < C40413c.f105051b) {
                                return;
                            }
                        } else if (this.f34366i != 2 || currentTimeMillis - this.f34365h < 30000) {
                            return;
                        }
                    }
                } else {
                    synchronized (this.f34359a) {
                        j = this.f34360b.f34371b;
                        j2 = this.f34360b.f34370a;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (j2 > currentTimeMillis2) {
                        j2 = currentTimeMillis2 - j;
                    }
                    if (j2 + j <= currentTimeMillis2) {
                        if (this.f34365h > 0) {
                            if (this.f34366i == 1) {
                                if (currentTimeMillis2 - this.f34365h < C40413c.f105051b) {
                                    return;
                                }
                            } else if (this.f34366i != 2 || currentTimeMillis2 - this.f34365h < 30000) {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (!this.f34362d.get()) {
                    this.f34362d.getAndSet(true);
                    ISessionTokenApi iSessionTokenApi = (ISessionTokenApi) RetrofitUtils.m37898a(C12978a.f34375a, ISessionTokenApi.class);
                    if (iSessionTokenApi == null) {
                        this.f34362d.getAndSet(false);
                        return;
                    }
                    C12466b seesionToken = iSessionTokenApi.getSeesionToken(true, -1, "/session_token/");
                    final long currentTimeMillis3 = System.currentTimeMillis();
                    this.f34365h = currentTimeMillis3;
                    this.f34366i++;
                    seesionToken.enqueue(new C12488k<String>() {
                        /* renamed from: a */
                        public final void mo26463a(C12466b<String> bVar, C12534t<String> tVar) {
                            TtTokenConfig.this.f34362d.getAndSet(false);
                        }

                        /* renamed from: a */
                        public final void mo26464a(C12466b<String> bVar, Throwable th) {
                            TtTokenConfig.this.f34362d.getAndSet(false);
                        }

                        /* renamed from: b */
                        public final void mo30461b(C12466b<String> bVar, C12534t<String> tVar) {
                            if (tVar != null) {
                                String str = (String) tVar.f33302b;
                                if (!C6319n.m19593a(str)) {
                                    try {
                                        JSONObject jSONObject = new JSONObject(str);
                                        if (jSONObject.optInt("status", -1) == 0) {
                                            String optString = jSONObject.optString("key", "");
                                            String optString2 = jSONObject.optString("hmac_key", "");
                                            String optString3 = jSONObject.optString("token", "");
                                            long optLong = (((jSONObject.optLong("expire", 0) * 60) * 60) * 1000) / 2;
                                            if (!C6319n.m19593a(optString) && !C6319n.m19593a(optString2)) {
                                                if (!C6319n.m19593a(optString3)) {
                                                    C12977a aVar = new C12977a();
                                                    aVar.f34370a = currentTimeMillis3;
                                                    aVar.f34371b = optLong;
                                                    aVar.f34372c = optString3;
                                                    aVar.f34373d = Base64.decode(optString, 2);
                                                    aVar.f34374e = Base64.decode(optString2, 2);
                                                    synchronized (TtTokenConfig.this.f34359a) {
                                                        TtTokenConfig.this.f34360b = aVar;
                                                        TtTokenConfig.this.f34363e = currentTimeMillis3;
                                                    }
                                                    TtTokenConfig.this.mo31499g();
                                                    TtTokenConfig.this.mo31496d();
                                                }
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: used method not loaded: com.bytedance.ttnet.encrypt.b.a(com.bytedance.ttnet.encrypt.TtTokenConfig$a, byte[]):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (com.bytedance.common.utility.C6319n.m19593a(r1) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r3 != null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = new java.util.LinkedHashMap();
        r8 = "tt_token_t";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        r1 = android.util.Base64.encodeToString((byte[]) com.bytedance.ttnet.encrypt.C12979b.m37832a(r11.f34364g, r1.getBytes()).second, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r0.put(r8, r1);
        r1 = "tt_token_e";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r2 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r2.length > 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        r2 = android.util.Base64.encodeToString((byte[]) com.bytedance.ttnet.encrypt.C12979b.m37832a(r11.f34364g, r2).second, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0067, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        r0.put(r1, r2);
        r1 = "tt_token_h";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        if (r3 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (r3.length > 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        r2 = android.util.Base64.encodeToString((byte[]) com.bytedance.ttnet.encrypt.C12979b.m37832a(r11.f34364g, r3).second, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r0.put(r1, r2);
        r0.put("tt_token_rt", java.lang.String.valueOf(r4));
        r0.put("tt_token_et", java.lang.String.valueOf(r6));
        com.bytedance.ttnet.C12961d.m37772a().mo31466a(com.bytedance.ttnet.C12961d.m37772a().mo31461a(), (java.util.Map<java.lang.String, ?>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31499g() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f34359a     // Catch:{ Throwable -> 0x00ae }
            monitor-enter(r0)     // Catch:{ Throwable -> 0x00ae }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r1 = r11.f34360b     // Catch:{ all -> 0x00ab }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            return
        L_0x0009:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r1 = r11.f34360b     // Catch:{ all -> 0x00ab }
            java.lang.String r1 = r1.f34372c     // Catch:{ all -> 0x00ab }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r2 = r11.f34360b     // Catch:{ all -> 0x00ab }
            byte[] r2 = r2.f34373d     // Catch:{ all -> 0x00ab }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r3 = r11.f34360b     // Catch:{ all -> 0x00ab }
            byte[] r3 = r3.f34374e     // Catch:{ all -> 0x00ab }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r4 = r11.f34360b     // Catch:{ all -> 0x00ab }
            long r4 = r4.f34370a     // Catch:{ all -> 0x00ab }
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r6 = r11.f34360b     // Catch:{ all -> 0x00ab }
            long r6 = r6.f34371b     // Catch:{ all -> 0x00ab }
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r1)     // Catch:{ Throwable -> 0x00ae }
            if (r0 != 0) goto L_0x00aa
            if (r2 == 0) goto L_0x00aa
            if (r3 != 0) goto L_0x002a
            goto L_0x00aa
        L_0x002a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ Throwable -> 0x00ae }
            r0.<init>()     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r8 = "tt_token_t"
            boolean r9 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x00ae }
            r10 = 2
            if (r9 == 0) goto L_0x003b
            java.lang.String r1 = ""
            goto L_0x004d
        L_0x003b:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r9 = r11.f34364g     // Catch:{ Throwable -> 0x00ae }
            byte[] r1 = r1.getBytes()     // Catch:{ Throwable -> 0x00ae }
            android.util.Pair r1 = com.bytedance.ttnet.encrypt.C12979b.m37832a(r9, r1)     // Catch:{ Throwable -> 0x00ae }
            java.lang.Object r1 = r1.second     // Catch:{ Throwable -> 0x00ae }
            byte[] r1 = (byte[]) r1     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r10)     // Catch:{ Throwable -> 0x00ae }
        L_0x004d:
            r0.put(r8, r1)     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = "tt_token_e"
            if (r2 == 0) goto L_0x0067
            int r8 = r2.length     // Catch:{ Throwable -> 0x00ae }
            if (r8 > 0) goto L_0x0058
            goto L_0x0067
        L_0x0058:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r8 = r11.f34364g     // Catch:{ Throwable -> 0x00ae }
            android.util.Pair r2 = com.bytedance.ttnet.encrypt.C12979b.m37832a(r8, r2)     // Catch:{ Throwable -> 0x00ae }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x00ae }
            byte[] r2 = (byte[]) r2     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r10)     // Catch:{ Throwable -> 0x00ae }
            goto L_0x0069
        L_0x0067:
            java.lang.String r2 = ""
        L_0x0069:
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = "tt_token_h"
            if (r3 == 0) goto L_0x0083
            int r2 = r3.length     // Catch:{ Throwable -> 0x00ae }
            if (r2 > 0) goto L_0x0074
            goto L_0x0083
        L_0x0074:
            com.bytedance.ttnet.encrypt.TtTokenConfig$a r2 = r11.f34364g     // Catch:{ Throwable -> 0x00ae }
            android.util.Pair r2 = com.bytedance.ttnet.encrypt.C12979b.m37832a(r2, r3)     // Catch:{ Throwable -> 0x00ae }
            java.lang.Object r2 = r2.second     // Catch:{ Throwable -> 0x00ae }
            byte[] r2 = (byte[]) r2     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r10)     // Catch:{ Throwable -> 0x00ae }
            goto L_0x0085
        L_0x0083:
            java.lang.String r2 = ""
        L_0x0085:
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = "tt_token_rt"
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x00ae }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r1 = "tt_token_et"
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch:{ Throwable -> 0x00ae }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00ae }
            com.bytedance.ttnet.c r1 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Throwable -> 0x00ae }
            com.bytedance.ttnet.c r2 = com.bytedance.ttnet.C12961d.m37772a()     // Catch:{ Throwable -> 0x00ae }
            android.content.Context r2 = r2.mo31461a()     // Catch:{ Throwable -> 0x00ae }
            r1.mo31466a(r2, r0)     // Catch:{ Throwable -> 0x00ae }
            return
        L_0x00aa:
            return
        L_0x00ab:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ab }
            throw r1     // Catch:{ Throwable -> 0x00ae }
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.encrypt.TtTokenConfig.mo31499g():void");
    }

    /* renamed from: a */
    public final void mo31493a(Context context) {
        mo31498f();
    }
}
