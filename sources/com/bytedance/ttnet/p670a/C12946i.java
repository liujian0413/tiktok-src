package com.bytedance.ttnet.p670a;

import android.webkit.CookieManager;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10150h;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.C10127b;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b.C10128c;
import com.bytedance.frameworks.baselib.network.http.impl.C10156a;
import com.bytedance.frameworks.baselib.network.http.p512a.p513a.C10114e;
import com.bytedance.frameworks.core.encrypt.C6367a.C6368a;
import com.bytedance.retrofit2.SsHttpCall.C12448a;
import com.bytedance.ttnet.C12947b.C12950b;
import com.bytedance.ttnet.C12961d;
import com.bytedance.ttnet.encrypt.C12980c.C12981a;
import com.bytedance.ttnet.retrofit.C12990a;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ttnet.a.i */
public class C12946i implements C10127b, C10128c, C10150h, C6368a, C12448a, C12950b, C12981a {

    /* renamed from: p */
    private static volatile C12946i f34269p;

    /* renamed from: a */
    private String f34270a;

    /* renamed from: b */
    private int f34271b;

    /* renamed from: c */
    private int f34272c;

    /* renamed from: d */
    private int f34273d;

    /* renamed from: e */
    private int f34274e;

    /* renamed from: f */
    private int f34275f;

    /* renamed from: g */
    private int f34276g;

    /* renamed from: h */
    private String f34277h;

    /* renamed from: i */
    private String f34278i;

    /* renamed from: j */
    private int f34279j;

    /* renamed from: k */
    private int f34280k;

    /* renamed from: l */
    private String f34281l;

    /* renamed from: m */
    private String f34282m;

    /* renamed from: n */
    private Set<String> f34283n;

    /* renamed from: o */
    private long f34284o;

    private C12946i() {
        mo31457j();
    }

    /* renamed from: c */
    public final boolean mo15275c() {
        if (this.f34271b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo15276d() {
        if (this.f34272c > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo15277e() {
        if (this.f34273d > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int mo30435g() {
        return C12990a.m37889a(this.f34279j);
    }

    /* renamed from: p */
    public final boolean mo31421p() {
        if (this.f34280k > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo24792b() {
        if (!C12925a.f34148j && this.f34274e > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static C12946i m37726i() {
        if (f34269p == null) {
            synchronized (C12946i.class) {
                if (f34269p == null) {
                    f34269p = new C12946i();
                }
            }
        }
        return f34269p;
    }

    /* renamed from: a */
    public final boolean mo24791a() {
        if (C12961d.m37772a().mo31459a(C12961d.m37772a().mo31461a(), "chromium_boot_failures", 0) <= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30434f() {
        String str = "";
        String str2 = "";
        List asList = Arrays.asList(this.f34277h.split(","));
        if (asList.size() == 2) {
            str = (String) asList.get(0);
            str2 = (String) asList.get(1);
        }
        return C12990a.m37890a(str, str2);
    }

    /* renamed from: h */
    public final boolean mo31415h() {
        if (C12925a.f34148j) {
            C10114e.m30025a(0);
            return false;
        } else if (C12925a.m37644n()) {
            return false;
        } else {
            if (this.f34275f > 3) {
                C10114e.m30025a(3);
                return false;
            } else if (C12925a.f34149k && C12961d.m37772a().mo31468b()) {
                return true;
            } else {
                if (this.f34276g <= 0) {
                    C10114e.m30025a(4);
                }
                if (this.f34276g > 0) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: q */
    public final Set<String> mo31422q() {
        if (!mo31421p()) {
            return Collections.emptySet();
        }
        long parseLong = Long.parseLong(this.f34281l);
        if (this.f34284o != 0 && this.f34284o == parseLong && this.f34283n != null) {
            return this.f34283n;
        }
        this.f34284o = parseLong;
        this.f34283n = C12925a.m37640f(this.f34282m);
        return this.f34283n;
    }

    /* renamed from: j */
    public final void mo31457j() {
        this.f34270a = C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "share_cookie_host_list", "");
        this.f34271b = C12961d.m37772a().mo31459a(C12961d.m37772a().mo31461a(), "add_ss_queries_open", 0);
        this.f34272c = C12961d.m37772a().mo31459a(C12961d.m37772a().mo31461a(), "add_ss_queries_header_open", 1);
        this.f34273d = C12961d.m37772a().mo31459a(C12961d.m37772a().mo31461a(), "add_ss_queries_plaintext_open", 1);
        this.f34274e = C12961d.m37772a().mo31459a(C12961d.m37772a().mo31461a(), "http_dns_enabled", 0);
        this.f34275f = C12961d.m37772a().mo31459a(C12961d.m37772a().mo31461a(), "chromium_boot_failures", 0);
        this.f34276g = C12961d.m37772a().mo31459a(C12961d.m37772a().mo31461a(), "chromium_open", 0);
        this.f34277h = C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "request_delay_time_range", "");
        this.f34278i = C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "request_random_delay_apis", "");
        this.f34279j = C12961d.m37772a().mo31459a(C12961d.m37772a().mo31461a(), "request_max_delay_time", 600000);
        this.f34280k = C12961d.m37772a().mo31459a(C12961d.m37772a().mo31461a(), "ttnet_token_enabled", 1);
        this.f34281l = C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "ttnet_token_config_time", "-1");
        this.f34282m = C12961d.m37772a().mo31464a(C12961d.m37772a().mo31461a(), "ttnet_token_api", "[]");
    }

    /* renamed from: e */
    public final boolean mo30433e(String str) {
        String[] split = this.f34278i.split(",");
        HashSet hashSet = new HashSet();
        for (String add : split) {
            hashSet.add(add);
        }
        return C12990a.m37891a(str, (Set<String>) hashSet);
    }

    /* renamed from: d */
    public final List<String> mo24814d(String str) {
        String[] split;
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f34270a.split(",")) {
            if (!C6319n.m19593a(str2)) {
                arrayList.add(str2);
            }
        }
        String g = C12961d.m37772a().mo31473g();
        if (!C6319n.m19593a(g) && !m37725a(g, arrayList)) {
            arrayList.add(g);
        }
        if (m37725a(str, arrayList)) {
            return arrayList;
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m37725a(String str, List<String> list) {
        if (C6319n.m19593a(str) || C6311g.m19573a(list)) {
            return false;
        }
        for (String endsWith : list) {
            if (str.endsWith(endsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final List<String> mo24813a(CookieManager cookieManager, C10156a aVar, URI uri) {
        String str;
        String[] split;
        if (uri == null || (cookieManager == null && aVar == null)) {
            return null;
        }
        try {
            str = uri.getHost();
        } catch (Exception unused) {
            str = null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f34270a.split(",")) {
            if (!C6319n.m19593a(str2)) {
                arrayList.add(str2);
            }
        }
        if (C6319n.m19593a(str) || !m37725a(str, arrayList)) {
            return null;
        }
        List<String> arrayList2 = new ArrayList<>();
        if (cookieManager != null) {
            String cookie = cookieManager.getCookie(C12961d.m37772a().mo31473g());
            if (!C6319n.m19593a(cookie)) {
                arrayList2.add(cookie);
            }
        }
        if (C6311g.m19573a(arrayList2) && aVar != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(uri.getScheme());
                sb.append("://");
                sb.append(C12961d.m37772a().mo31473g());
                Map map = aVar.get(URI.create(sb.toString()), new LinkedHashMap());
                if (map != null && !map.isEmpty()) {
                    arrayList2 = (List) map.get("Cookie");
                }
            } catch (Throwable unused2) {
            }
        }
        return arrayList2;
    }
}
