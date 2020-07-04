package com.p280ss.android.pushmanager.app;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.NetworkUtils;
import com.p280ss.android.message.C19809a;
import com.p280ss.android.message.NotifyService;
import com.p280ss.android.message.p885a.C19824h;
import com.p280ss.android.message.sswo.SswoActivity;
import com.p280ss.android.pushmanager.C20053c;
import com.p280ss.android.pushmanager.C20071d;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.C20077j;
import com.p280ss.android.pushmanager.app.C20044c.C20045a;
import com.p280ss.android.pushmanager.app.C20044c.C20046b;
import com.p280ss.android.pushmanager.setting.C20090b;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.app.d */
public final class C20047d implements C20045a {

    /* renamed from: c */
    protected static C20047d f54240c;

    /* renamed from: a */
    protected final Context f54241a;

    /* renamed from: b */
    protected final C20071d f54242b;

    /* renamed from: d */
    private boolean f54243d;

    /* renamed from: c */
    public final Map mo53674c() {
        return C20050f.m66035a(this);
    }

    /* renamed from: a */
    public static C20047d m66018a() {
        if (f54240c != null) {
            return f54240c;
        }
        throw new IllegalStateException("MessageData not init");
    }

    /* renamed from: b */
    public final C20071d mo53673b() {
        if (this.f54242b != null) {
            return this.f54242b;
        }
        throw new IllegalStateException("appContext not init");
    }

    /* renamed from: d */
    public final Map<String, String> mo53675d() {
        HashMap hashMap = new HashMap();
        C20090b.m66187a();
        C20090b.m66189b((Map<String, String>) hashMap);
        HashMap hashMap2 = new HashMap();
        String str = (String) hashMap.get(C20077j.f54294b);
        if (!C6319n.m19593a(str)) {
            hashMap2.put("iid", str);
        }
        String str2 = (String) hashMap.get(C20077j.f54293a);
        if (!C6319n.m19593a(str2)) {
            hashMap2.put("device_id", str2);
        }
        String f = NetworkUtils.m19552f(this.f54241a);
        if (!C6319n.m19593a(f)) {
            hashMap2.put("ac", f);
        }
        String d = this.f54242b.mo53703d();
        if (d != null) {
            hashMap2.put("channel", d);
        }
        hashMap2.put("aid", String.valueOf(this.f54242b.mo53702c()));
        String b = this.f54242b.mo53701b();
        if (b != null) {
            hashMap2.put("app_name", b);
        }
        hashMap2.put("version_code", String.valueOf(this.f54242b.mo53705f()));
        hashMap2.put("version_name", this.f54242b.mo53704e());
        hashMap2.put("device_type", Build.MODEL);
        hashMap2.put("device_brand", Build.BRAND);
        hashMap2.put("language", Locale.getDefault().getLanguage());
        hashMap2.put("os_api", String.valueOf(VERSION.SDK_INT));
        try {
            String str3 = VERSION.RELEASE;
            if (str3 != null && str3.length() > 10) {
                str3 = str3.substring(0, 10);
            }
            hashMap2.put("os_version", str3);
        } catch (Exception unused) {
        }
        String str4 = (String) hashMap.get(C20077j.f54296d);
        if (!C6319n.m19593a(str4)) {
            hashMap2.put("openudid", str4);
        }
        int d2 = C9738o.m28716d(this.f54241a);
        if (d2 > 0) {
            hashMap2.put("dpi", String.valueOf(d2));
        }
        hashMap2.put("rom", C20050f.m66034a());
        hashMap2.put("os", "android");
        hashMap2.put("package", this.f54241a.getPackageName());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        if (timeZone != null) {
            hashMap2.put("tz_offset", String.valueOf(timeZone.getOffset(System.currentTimeMillis()) / 1000));
            hashMap2.put("tz_name", timeZone.getID());
        }
        String language = Locale.getDefault().getLanguage();
        if (!C6319n.m19593a(language)) {
            hashMap2.put("language", language);
        }
        String country = Locale.getDefault().getCountry();
        if (!C6319n.m19593a(country)) {
            hashMap2.put("region", country.toLowerCase());
        }
        String str5 = "country";
        try {
            C20074g.m66106b();
            hashMap2.put(str5, C20053c.m66042d());
            C20074g.m66106b();
            hashMap2.putAll(C20053c.m66041b());
            hashMap2.put("rom_version", C19824h.m65453a());
        } catch (Exception unused2) {
        }
        return hashMap2;
    }

    public C20047d(final C20071d dVar) {
        this.f54242b = dVar;
        this.f54241a = dVar.mo53700a();
        C20044c.m66005a((C20045a) this);
        C20044c.m66006a((C20046b) new C20046b() {
            /* renamed from: a */
            public final C20071d mo53664a() {
                return dVar;
            }

            /* renamed from: b */
            public final Class mo53666b() {
                return NotifyService.class;
            }

            /* renamed from: c */
            public final String mo53667c() {
                return "message_data";
            }

            /* renamed from: d */
            public final String mo53668d() {
                return "com.ss.android.message";
            }

            /* renamed from: f */
            public final String mo53670f() {
                return C20049e.m66033a();
            }

            /* renamed from: g */
            public final boolean mo53671g() {
                return SswoActivity.m65681a();
            }

            /* renamed from: h */
            public final Map<String, String> mo53672h() {
                return C20047d.this.mo53674c();
            }

            /* renamed from: e */
            public final String mo53669e() {
                return C20074g.m66102a().mo53706a();
            }

            /* renamed from: a */
            public final void mo53665a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
                C20074g.m66102a().mo53709a(context, str, str2, str3, j, j2, jSONObject);
            }
        });
    }

    /* renamed from: a */
    public static void m66019a(C20047d dVar) {
        if (f54240c == null) {
            f54240c = dVar;
            return;
        }
        throw new IllegalStateException("MessageData already inited");
    }

    /* renamed from: a */
    public final void mo53663a(Context context) {
        if (!this.f54243d) {
            try {
                C19809a.m65409a((Application) context.getApplicationContext());
                this.f54243d = true;
            } catch (Exception unused) {
            }
        }
    }
}
