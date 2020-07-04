package com.p280ss.android.ugc.aweme.newfollow.util;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23337e;
import com.p280ss.android.ugc.aweme.base.p1062f.C23339g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.f */
public final class C34202f {

    /* renamed from: a */
    public volatile List<String> f89192a;

    /* renamed from: b */
    private List<String> f89193b;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.util.f$a */
    static class C34203a {

        /* renamed from: a */
        public static final C34202f f89194a = new C34202f();
    }

    /* renamed from: a */
    public static C34202f m110435a() {
        return C34203a.f89194a;
    }

    /* renamed from: e */
    private static C23339g m110436e() {
        return C23337e.m76561a(C6399b.m19921a(), "rec_user");
    }

    /* renamed from: f */
    private void m110437f() {
        m110436e().mo60632b("to_report_rec_user_ids", "");
    }

    /* renamed from: g */
    private String m110438g() {
        return m110436e().mo60623a("to_report_rec_user_ids", "");
    }

    /* renamed from: d */
    public final void mo86951d() {
        m110436e().mo60632b("to_report_rec_user_ids", mo86949b());
    }

    /* renamed from: c */
    public final void mo86950c() {
        if (this.f89192a != null) {
            this.f89192a.clear();
        }
        if (this.f89193b != null) {
            this.f89193b.clear();
        }
        m110437f();
    }

    /* renamed from: h */
    private void m110439h() {
        if (!m110438g().isEmpty()) {
            for (String str : Arrays.asList(m110438g().split(","))) {
                if (this.f89192a.contains(str)) {
                    this.f89192a.remove(str);
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo86949b() {
        String g = m110438g();
        if (this.f89192a == null || this.f89192a.size() == 0) {
            return g;
        }
        StringBuilder sb = new StringBuilder();
        if (!g.isEmpty()) {
            sb.append(g);
            sb.append(",");
        }
        m110439h();
        ArrayList arrayList = new ArrayList(this.f89192a);
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append((String) arrayList.get(i));
            sb.append(",");
        }
        String sb2 = sb.toString();
        if (sb2.endsWith(",")) {
            sb2 = sb2.substring(0, sb2.length() - 1);
        }
        return sb2;
    }

    /* renamed from: a */
    public final void mo86948a(int i, String str) {
        if (this.f89193b == null) {
            this.f89193b = new ArrayList();
        }
        if (this.f89192a == null) {
            this.f89192a = new ArrayList();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(":");
        sb.append(str);
        String sb2 = sb.toString();
        if (!this.f89193b.contains(sb2)) {
            this.f89192a.add(sb2);
            this.f89193b.add(sb2);
        }
    }
}
