package com.p280ss.android.ugc.aweme.newfollow.util;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.c */
public final class C34196c {

    /* renamed from: a */
    public volatile HashSet<String> f89174a;

    /* renamed from: b */
    public volatile HashSet<String> f89175b;

    /* renamed from: c */
    private HashSet<String> f89176c;

    /* renamed from: d */
    private volatile List<String> f89177d;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.util.c$a */
    static class C34198a {

        /* renamed from: a */
        private static final Map<String, C34196c> f89178a = new ConcurrentHashMap(1);

        /* renamed from: a */
        public static C34196c m110406a(String str) {
            C34196c cVar = (C34196c) f89178a.get(str);
            if (cVar != null) {
                return cVar;
            }
            C34196c cVar2 = new C34196c();
            f89178a.put(str, cVar2);
            return cVar2;
        }
    }

    private C34196c() {
        m110396f();
    }

    /* renamed from: b */
    public final boolean mo86927b() {
        return C6307b.m19566a((Collection<T>) this.f89174a);
    }

    /* renamed from: g */
    private static void m110397g() {
        C23338f.m76568f().mo60632b("to_report_feed_ids", "");
    }

    /* renamed from: h */
    private static String m110398h() {
        return C23338f.m76568f().mo60623a("to_report_feed_ids", "");
    }

    /* renamed from: e */
    public final void mo86930e() {
        C23338f.m76568f().mo60632b("to_report_feed_ids", mo86928c());
    }

    /* renamed from: f */
    private void m110396f() {
        String h = m110398h();
        if (h != null && !h.isEmpty()) {
            for (String b : h.split(",")) {
                mo86926b(b);
            }
        }
    }

    /* renamed from: a */
    public final String mo86924a() {
        if (C6307b.m19566a((Collection<T>) this.f89177d)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String append : this.f89177d) {
            sb.append(append);
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo86928c() {
        if (C6307b.m19566a((Collection<T>) this.f89174a)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f89174a.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    /* renamed from: d */
    public final void mo86929d() {
        if (this.f89174a != null) {
            if (!C6307b.m19566a((Collection<T>) this.f89175b)) {
                this.f89174a.removeAll(this.f89175b);
            } else {
                this.f89174a.clear();
            }
        }
        if (this.f89175b != null) {
            this.f89175b.clear();
        }
        m110397g();
    }

    /* renamed from: a */
    public static C34196c m110395a(String str) {
        return C34198a.m110406a(str);
    }

    /* renamed from: a */
    public final void mo86925a(List<String> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            if (this.f89177d != null) {
                this.f89177d.clear();
            }
            return;
        }
        this.f89177d = list;
    }

    /* renamed from: b */
    public final void mo86926b(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.f89176c == null) {
                this.f89176c = new HashSet<>();
            }
            if (this.f89174a == null) {
                this.f89174a = new HashSet<>();
            }
            if (!this.f89176c.contains(str)) {
                this.f89174a.add(str);
                this.f89176c.add(str);
            }
        }
    }
}
