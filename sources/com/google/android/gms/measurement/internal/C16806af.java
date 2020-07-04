package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Pair;
import com.C1642a;
import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.google.android.gms.measurement.internal.af */
final class C16806af extends C16849bv {

    /* renamed from: a */
    static final Pair<String, Long> f46915a = new Pair<>("", Long.valueOf(0));

    /* renamed from: b */
    public C16810aj f46916b;

    /* renamed from: c */
    public final C16809ai f46917c = new C16809ai(this, "last_upload", 0);

    /* renamed from: d */
    public final C16809ai f46918d = new C16809ai(this, "last_upload_attempt", 0);

    /* renamed from: e */
    public final C16809ai f46919e = new C16809ai(this, "backoff", 0);

    /* renamed from: f */
    public final C16809ai f46920f = new C16809ai(this, "last_delete_stale", 0);

    /* renamed from: g */
    public final C16809ai f46921g = new C16809ai(this, "midnight_offset", 0);

    /* renamed from: h */
    public final C16809ai f46922h = new C16809ai(this, "first_open_time", 0);

    /* renamed from: i */
    public final C16809ai f46923i = new C16809ai(this, "app_install_time", 0);

    /* renamed from: j */
    public final C16811ak f46924j = new C16811ak(this, "app_instance_id", null);

    /* renamed from: k */
    public final C16809ai f46925k = new C16809ai(this, "time_before_start", 10000);

    /* renamed from: l */
    public final C16809ai f46926l = new C16809ai(this, "session_timeout", 1800000);

    /* renamed from: m */
    public final C16808ah f46927m = new C16808ah(this, "start_new_session", true);

    /* renamed from: n */
    public final C16809ai f46928n = new C16809ai(this, "last_pause_time", 0);

    /* renamed from: o */
    public final C16809ai f46929o = new C16809ai(this, "time_active", 0);

    /* renamed from: p */
    public boolean f46930p;

    /* renamed from: r */
    private SharedPreferences f46931r;

    /* renamed from: s */
    private String f46932s;

    /* renamed from: t */
    private boolean f46933t;

    /* renamed from: u */
    private long f46934u;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Pair<String, Boolean> mo43594a(String str) {
        mo43571c();
        long b = mo43580l().mo38685b();
        if (this.f46932s != null && b < this.f46934u) {
            return new Pair<>(this.f46932s, Boolean.valueOf(this.f46933t));
        }
        this.f46934u = b + mo43587s().mo44047a(str, C16942h.f47442j);
        try {
            C14734a a = C14733a.m42585a(mo43581m());
            if (a != null) {
                this.f46932s = a.f38079a;
                this.f46933t = a.f38080b;
            }
            if (this.f46932s == null) {
                this.f46932s = "";
            }
        } catch (Exception e) {
            mo43585q().f47494h.mo44161a("Unable to get advertising id", e);
            this.f46932s = "";
        }
        return new Pair<>(this.f46932s, Boolean.valueOf(this.f46933t));
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo43602d() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo43597b(String str) {
        mo43571c();
        String str2 = (String) mo43594a(str).first;
        MessageDigest h = C16922em.m55977h();
        if (h == null) {
            return null;
        }
        return C1642a.m8035a(Locale.US, "%032X", new Object[]{new BigInteger(1, h.digest(str2.getBytes()))});
    }

    C16806af(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo43603e() {
        this.f46931r = C7285c.m22838a(mo43581m(), "com.google.android.gms.measurement.prefs", 0);
        this.f46930p = this.f46931r.getBoolean("has_been_opened", false);
        if (!this.f46930p) {
            Editor edit = this.f46931r.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        C16810aj ajVar = new C16810aj(this, "health_monitor", Math.max(0, ((Long) C16942h.f47443k.mo44132a()).longValue()));
        this.f46916b = ajVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final SharedPreferences m55397A() {
        mo43571c();
        mo43718x();
        return this.f46931r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo43599c(String str) {
        mo43571c();
        Editor edit = m55397A().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final String mo43604f() {
        mo43571c();
        return m55397A().getString("gmp_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo43601d(String str) {
        mo43571c();
        Editor edit = m55397A().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final String mo43605g() {
        mo43571c();
        return m55397A().getString("admob_app_id", null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final Boolean mo43606h() {
        mo43571c();
        if (!m55397A().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(m55397A().getBoolean("use_service", false));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43595a(boolean z) {
        mo43571c();
        mo43585q().f47495i.mo44161a("Setting useService", Boolean.valueOf(z));
        Editor edit = m55397A().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final void mo43607i() {
        mo43571c();
        mo43585q().f47495i.mo44160a("Clearing collection preferences.");
        if (mo43587s().mo44048a(C16942h.f47424aq)) {
            Boolean j = mo43608j();
            Editor edit = m55397A().edit();
            edit.clear();
            edit.apply();
            if (j != null) {
                m55399d(j.booleanValue());
            }
            return;
        }
        boolean contains = m55397A().contains("measurement_enabled");
        boolean z = true;
        if (contains) {
            z = mo43598b(true);
        }
        Editor edit2 = m55397A().edit();
        edit2.clear();
        edit2.apply();
        if (contains) {
            m55399d(z);
        }
    }

    /* renamed from: d */
    private void m55399d(boolean z) {
        mo43571c();
        mo43585q().f47495i.mo44161a("Setting measurementEnabled", Boolean.valueOf(z));
        Editor edit = m55397A().edit();
        edit.putBoolean("measurement_enabled", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo43598b(boolean z) {
        mo43571c();
        return m55397A().getBoolean("measurement_enabled", z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final Boolean mo43608j() {
        mo43571c();
        if (m55397A().contains("measurement_enabled")) {
            return Boolean.valueOf(m55397A().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final String mo43609t() {
        mo43571c();
        String string = m55397A().getString("previous_os_version", null);
        mo43579k().mo43718x();
        String str = VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            Editor edit = m55397A().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo43600c(boolean z) {
        mo43571c();
        mo43585q().f47495i.mo44161a("Updating deferred analytics collection", Boolean.valueOf(z));
        Editor edit = m55397A().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final boolean mo43610u() {
        mo43571c();
        return m55397A().getBoolean("deferred_analytics_collection", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final boolean mo43611v() {
        return this.f46931r.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo43596a(long j) {
        return j - this.f46926l.mo43614a() > this.f46928n.mo43614a();
    }
}
