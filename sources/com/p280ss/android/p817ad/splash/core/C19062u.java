package com.p280ss.android.p817ad.splash.core;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.p817ad.splash.core.p828c.C19006e;
import com.p280ss.android.p817ad.splash.core.p828c.C19012k;
import com.p280ss.android.p817ad.splash.p836g.C19122a;
import com.p280ss.android.p817ad.splash.p836g.C19124c;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import java.util.Calendar;

/* renamed from: com.ss.android.ad.splash.core.u */
public class C19062u {

    /* renamed from: a */
    private static volatile C19062u f51502a;

    /* renamed from: b */
    private static final String f51503b;

    /* renamed from: e */
    private static Calendar f51504e = Calendar.getInstance();

    /* renamed from: c */
    private SharedPreferences f51505c = C7285c.m22838a(C19025f.m62096J(), "splash_ad_sp", 0);

    /* renamed from: d */
    private Editor f51506d;

    /* renamed from: j */
    public final void mo50628j() {
        this.f51506d.apply();
    }

    /* renamed from: A */
    private String m62365A() {
        return this.f51505c.getString("key_last_show_sequence_day", "");
    }

    /* renamed from: C */
    private Editor m62367C() {
        if (this.f51506d == null) {
            this.f51506d = this.f51505c.edit();
        }
        return this.f51506d;
    }

    /* renamed from: z */
    private int m62372z() {
        return this.f51505c.getInt("show_splash_ad_day", 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C19062u mo50615d() {
        m62367C().putInt("splash_ad_show_count", mo50636q() + 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C19062u mo50617e() {
        m62367C().putInt("key_splash_ad_show_sequence", mo50637r() + 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C19062u mo50619f() {
        m62367C().putLong("clear_local_cache_time", System.currentTimeMillis());
        return this;
    }

    /* renamed from: g */
    public final long mo50621g() {
        return this.f51505c.getLong("clear_local_cache_time", 0);
    }

    /* renamed from: l */
    public final long mo50631l() {
        return this.f51505c.getLong("splash_ad_leave_interval", 0);
    }

    /* renamed from: m */
    public final long mo50632m() {
        return this.f51505c.getLong("splash_ad_splash_interval", 0);
    }

    /* renamed from: n */
    public final int mo50633n() {
        return this.f51505c.getInt("splash_ad_show_limit", 0);
    }

    /* renamed from: o */
    public final String mo50634o() {
        return this.f51505c.getString("splash_ad_did", "");
    }

    /* renamed from: p */
    public final boolean mo50635p() {
        return this.f51505c.getBoolean("key_splash_ad_need_ack", false);
    }

    /* renamed from: s */
    public final boolean mo50638s() {
        return this.f51505c.getBoolean("key_splash_ad_empty", false);
    }

    /* renamed from: t */
    public final String mo50639t() {
        return this.f51505c.getString("key_splash_ad_rt_necessary_device_params", "");
    }

    /* renamed from: u */
    public final String mo50640u() {
        return this.f51505c.getString("splash_ad_data", "");
    }

    /* renamed from: v */
    public final String mo50641v() {
        return this.f51505c.getString("key_splash_ad_penalty_period", "");
    }

    /* renamed from: w */
    public final String mo50642w() {
        return this.f51505c.getString("key_empty_log_extra_substitute", "");
    }

    private C19062u() {
    }

    /* renamed from: a */
    public static C19062u m62368a() {
        if (f51502a == null) {
            synchronized (C19062u.class) {
                if (f51502a == null) {
                    f51502a = new C19062u();
                }
            }
        }
        return f51502a;
    }

    /* renamed from: y */
    private void m62371y() {
        m62367C().putString("key_last_show_sequence_day", m62366B()).apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final String mo50626i() {
        return this.f51505c.getString("splash_ad_local_cache_data", "");
    }

    /* renamed from: k */
    public final String mo50630k() {
        return this.f51505c.getString("splash_ad_full_data", "");
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C19025f.m62096J().getFilesDir());
        sb.append("/SplashData/");
        f51503b = sb.toString();
    }

    /* renamed from: B */
    private static String m62366B() {
        f51504e.setTimeInMillis(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        sb.append(f51504e.get(1));
        sb.append("/");
        sb.append(f51504e.get(2));
        sb.append("/");
        sb.append(f51504e.get(5));
        return sb.toString();
    }

    /* renamed from: x */
    private void m62370x() {
        f51504e.setTimeInMillis(System.currentTimeMillis());
        m62367C().putInt("show_splash_ad_day", f51504e.get(5) + f51504e.get(2) + f51504e.get(1)).apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo50614c() {
        f51504e.setTimeInMillis(System.currentTimeMillis());
        if (f51504e.get(5) + f51504e.get(2) + f51504e.get(1) == m62372z()) {
            return this.f51505c.getBoolean("splash_ad_has_first_refresh", false);
        }
        m62370x();
        mo50610b(false).mo50628j();
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final String mo50623h() {
        if (!C19025f.m62138ag()) {
            return this.f51505c.getString("splash_ad_data", "");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f51503b);
        sb.append("splash_ad_ordered_data");
        return C19124c.m62679b(sb.toString());
    }

    /* renamed from: r */
    public final int mo50637r() {
        if (m62366B().equals(m62365A())) {
            return this.f51505c.getInt("key_splash_ad_show_sequence", 0);
        }
        m62367C().putInt("key_splash_ad_show_sequence", 0).apply();
        m62371y();
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo50611b() {
        return this.f51505c.getString("splash_ad_first_show_data", "");
    }

    /* renamed from: q */
    public final int mo50636q() {
        f51504e.setTimeInMillis(System.currentTimeMillis());
        if (f51504e.get(5) + f51504e.get(2) + f51504e.get(1) == m62372z()) {
            return this.f51505c.getInt("splash_ad_show_count", 0);
        }
        m62367C().putInt("splash_ad_show_count", 0).apply();
        m62370x();
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C19062u mo50602a(int i) {
        m62367C().putInt("splash_ad_show_limit", i);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C19062u mo50608b(long j) {
        m62367C().putLong("splash_ad_splash_interval", j);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C19062u mo50612c(String str) {
        m62367C().putString("splash_ad_data", str);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final C19062u mo50625i(String str) {
        m62367C().putString("splash_ad_local_cache_data", str);
        return this;
    }

    /* renamed from: j */
    public final C19062u mo50627j(String str) {
        m62367C().putString("key_splash_ad_penalty_period", str);
        return this;
    }

    /* renamed from: k */
    public final C19062u mo50629k(String str) {
        m62367C().putString("key_empty_log_extra_substitute", str);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C19062u mo50609b(String str) {
        m62367C().putString("splash_ad_full_data", str);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C19062u mo50613c(boolean z) {
        m62367C().putBoolean("key_splash_ad_need_ack", z);
        return this;
    }

    /* renamed from: d */
    public final C19062u mo50616d(String str) {
        m62367C().putString("splash_ad_did", str);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C19062u mo50618e(String str) {
        m62367C().putString("splash_ad_first_show_data", str);
        return this;
    }

    /* renamed from: f */
    public final void mo50620f(String str) {
        m62367C().putString("key_splash_ad_rt_necessary_device_params", str).apply();
    }

    /* renamed from: l */
    private void m62369l(String str) {
        if (!C19132j.m62736a(str)) {
            Editor C = m62367C();
            StringBuilder sb = new StringBuilder("splash_ad_url_has_download_");
            sb.append(C19122a.m62654a(str));
            C.putBoolean(sb.toString(), true).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C19062u mo50603a(long j) {
        m62367C().putLong("splash_ad_leave_interval", j);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C19062u mo50610b(boolean z) {
        m62367C().putBoolean("splash_ad_has_first_refresh", z);
        return this;
    }

    /* renamed from: g */
    public final void mo50622g(String str) {
        if (!C19132j.m62736a(str)) {
            Editor C = m62367C();
            StringBuilder sb = new StringBuilder("splash_ad_url_has_download_");
            sb.append(C19122a.m62654a(str));
            C.remove(sb.toString()).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C19062u mo50604a(String str) {
        if (C19025f.m62138ag()) {
            C19124c.m62677a(str, f51503b, "splash_ad_ordered_data");
        } else {
            m62367C().putString("splash_ad_data", str);
        }
        return this;
    }

    /* renamed from: h */
    public final boolean mo50624h(String str) {
        if (C19132j.m62736a(str)) {
            return false;
        }
        SharedPreferences sharedPreferences = this.f51505c;
        StringBuilder sb = new StringBuilder("splash_ad_url_has_download_");
        sb.append(C19122a.m62654a(str));
        return sharedPreferences.getBoolean(sb.toString(), false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C19062u mo50605a(boolean z) {
        m62367C().putBoolean("key_splash_ad_empty", z);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50606a(C19006e eVar) {
        if (eVar != null && !C19132j.m62736a(eVar.f51330d)) {
            m62369l(eVar.f51330d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50607a(C19012k kVar) {
        if (kVar != null && !C19132j.m62736a(kVar.f51352d)) {
            m62369l(kVar.f51352d);
        }
    }
}
