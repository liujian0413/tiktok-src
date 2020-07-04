package com.p280ss.android.p817ad.splash;

import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.p817ad.splash.core.C19025f;

/* renamed from: com.ss.android.ad.splash.b */
public final class C18948b {

    /* renamed from: a */
    public boolean f51076a = true;

    /* renamed from: b */
    private String f51077b;

    /* renamed from: c */
    private String f51078c;

    /* renamed from: d */
    private String f51079d;

    /* renamed from: e */
    private String f51080e;

    /* renamed from: f */
    private String f51081f;

    /* renamed from: g */
    private String f51082g;

    /* renamed from: h */
    private String f51083h;

    /* renamed from: i */
    private String f51084i;

    /* renamed from: j */
    private String f51085j;

    /* renamed from: k */
    private String f51086k;

    /* renamed from: l */
    private String f51087l;

    /* renamed from: m */
    private String f51088m;

    /* renamed from: n */
    private long f51089n;

    /* renamed from: o */
    private String f51090o;

    /* renamed from: p */
    private String f51091p;

    /* renamed from: q */
    private String f51092q;

    /* renamed from: r */
    private String f51093r;

    /* renamed from: s */
    private String f51094s;

    /* renamed from: t */
    private String f51095t;

    /* renamed from: e */
    private String m61846e() {
        if (m61845a(this.f51078c)) {
            this.f51078c = C19025f.m62139ah().mo50333c();
        }
        return this.f51078c;
    }

    /* renamed from: f */
    private String m61847f() {
        if (m61845a(this.f51079d)) {
            this.f51079d = C19025f.m62139ah().mo50334d();
        }
        return this.f51079d;
    }

    /* renamed from: g */
    private String m61848g() {
        if (m61845a(this.f51080e)) {
            this.f51080e = C19025f.m62139ah().mo50335e();
        }
        return this.f51080e;
    }

    /* renamed from: h */
    private String m61849h() {
        if (m61845a(this.f51081f)) {
            this.f51081f = C19025f.m62139ah().mo50336f();
        }
        return this.f51081f;
    }

    /* renamed from: i */
    private String m61850i() {
        if (m61845a(this.f51083h)) {
            this.f51083h = C19025f.m62139ah().mo50338h();
        }
        return this.f51083h;
    }

    /* renamed from: j */
    private String m61851j() {
        if (m61845a(this.f51084i)) {
            this.f51084i = C19025f.m62139ah().mo50339i();
        }
        return this.f51084i;
    }

    /* renamed from: k */
    private String m61852k() {
        if (m61845a(this.f51085j)) {
            this.f51085j = C19025f.m62139ah().mo50340j();
        }
        return this.f51085j;
    }

    /* renamed from: l */
    private String m61853l() {
        if (m61845a(this.f51088m)) {
            this.f51088m = C19025f.m62139ah().mo50343m();
        }
        return this.f51088m;
    }

    /* renamed from: m */
    private String m61854m() {
        if (m61845a(this.f51087l)) {
            this.f51087l = C19025f.m62139ah().mo50342l();
        }
        return this.f51087l;
    }

    /* renamed from: n */
    private String m61855n() {
        if (m61845a(this.f51091p)) {
            this.f51091p = C19025f.m62139ah().mo50344n();
        }
        return this.f51091p;
    }

    /* renamed from: o */
    private String m61856o() {
        if (m61845a(this.f51092q)) {
            this.f51092q = C19025f.m62139ah().mo50345o();
        }
        return this.f51092q;
    }

    /* renamed from: p */
    private String m61857p() {
        if (m61845a(this.f51093r)) {
            this.f51093r = C19025f.m62139ah().mo50346p();
        }
        return this.f51093r;
    }

    /* renamed from: q */
    private String m61858q() {
        if (m61845a(this.f51094s)) {
            this.f51094s = C19025f.m62139ah().mo50347q();
        }
        return this.f51094s;
    }

    /* renamed from: r */
    private String m61859r() {
        if (m61845a(this.f51095t)) {
            this.f51095t = C19025f.m62139ah().mo50348r();
        }
        return this.f51095t;
    }

    /* renamed from: s */
    private String m61860s() {
        if (m61845a(this.f51090o)) {
            this.f51090o = C19025f.m62139ah().mo50331a();
        }
        return this.f51090o;
    }

    /* renamed from: a */
    public final String mo50356a() {
        if (m61845a(this.f51077b)) {
            this.f51077b = C19025f.m62139ah().mo50332b();
        }
        return this.f51077b;
    }

    /* renamed from: b */
    public final String mo50357b() {
        if (m61845a(this.f51082g)) {
            this.f51082g = C19025f.m62139ah().mo50337g();
        }
        return this.f51082g;
    }

    /* renamed from: c */
    public final String mo50358c() {
        if (m61845a(this.f51086k)) {
            this.f51086k = C19025f.m62139ah().mo50341k();
        }
        return this.f51086k;
    }

    /* renamed from: d */
    public final long mo50359d() {
        if (this.f51089n == 0 && C19025f.m62139ah() != null) {
            this.f51089n = 0;
        }
        return this.f51089n;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(mo50357b())) {
            sb.append("&channel=");
            sb.append(Uri.encode(mo50357b()));
        }
        if (!TextUtils.isEmpty(mo50356a())) {
            sb.append("&aid=");
            sb.append(Uri.encode(mo50356a()));
        }
        if (!TextUtils.isEmpty(m61859r())) {
            sb.append("&gaid=");
            sb.append(Uri.encode(m61859r()));
        }
        if (!TextUtils.isEmpty(m61846e())) {
            sb.append("&app_name=");
            sb.append(Uri.encode(m61846e()));
        }
        if (!TextUtils.isEmpty(m61849h())) {
            sb.append("&update_version_code=");
            sb.append(Uri.encode(m61849h()));
        }
        if (!TextUtils.isEmpty(m61847f())) {
            sb.append("&version_code=");
            sb.append(Uri.encode(m61847f()));
        }
        if (!TextUtils.isEmpty(m61848g())) {
            sb.append("&version_name=");
            sb.append(Uri.encode(m61848g()));
        }
        if (!TextUtils.isEmpty(m61850i())) {
            sb.append("&manifest_version_code=");
            sb.append(Uri.encode(m61850i()));
        }
        sb.append("&language=");
        if (TextUtils.isEmpty(m61851j())) {
            str = "zh";
        } else {
            str = Uri.encode(m61851j());
        }
        sb.append(str);
        if (!TextUtils.isEmpty(m61852k())) {
            sb.append("&iid=");
            sb.append(Uri.encode(m61852k()));
        }
        if (!TextUtils.isEmpty(mo50358c())) {
            sb.append("&device_id=");
            sb.append(Uri.encode(mo50358c()));
        }
        if (!TextUtils.isEmpty(m61853l())) {
            sb.append("&openudid=");
            sb.append(Uri.encode(m61853l()));
        }
        if (!TextUtils.isEmpty(m61854m())) {
            sb.append("&uuid=");
            sb.append(Uri.encode(m61854m()));
        }
        if (!TextUtils.isEmpty(m61860s())) {
            sb.append("&mac_address=");
            sb.append(Uri.encode(m61860s()));
        }
        if (this.f51076a) {
            if (!TextUtils.isEmpty(m61855n())) {
                sb.append("&ab_version=");
                sb.append(Uri.encode(m61855n()));
            }
            if (!TextUtils.isEmpty(m61856o())) {
                sb.append("&ab_client=");
                sb.append(Uri.encode(m61856o()));
            }
            if (!TextUtils.isEmpty(m61857p())) {
                sb.append("&ab_group=");
                sb.append(Uri.encode(m61857p()));
            }
            if (!TextUtils.isEmpty(m61858q())) {
                sb.append("&ab_feature=");
                sb.append(Uri.encode(m61858q()));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m61845a(String str) {
        if (!TextUtils.isEmpty(str) || C19025f.m62139ah() == null) {
            return false;
        }
        return true;
    }
}
