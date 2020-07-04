package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.b */
public final class C31678b {

    /* renamed from: d */
    public static final C31679a f82895d = new C31679a(null);
    @C6593c(mo15949a = "time")

    /* renamed from: a */
    public long f82896a;
    @C6593c(mo15949a = "normal")

    /* renamed from: b */
    public Map<Integer, Integer> f82897b;
    @C6593c(mo15949a = "retry")

    /* renamed from: c */
    public int f82898c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.b$a */
    public static final class C31679a {
        private C31679a() {
        }

        /* renamed from: a */
        private static C31678b m102900a() {
            Boolean bool;
            C7076p a = C7076p.m22077a();
            C7573i.m23582a((Object) a, "IMSPUtils.get()");
            C31678b F = a.mo18290F();
            StringBuilder sb = new StringBuilder("loadMonitorInfo: monitorInfo=");
            sb.append(F);
            sb.append(", expired=");
            if (F != null) {
                bool = Boolean.valueOf(F.mo82457b());
            } else {
                bool = null;
            }
            sb.append(bool);
            if (F != null && !F.mo82457b()) {
                return F;
            }
            C31678b bVar = new C31678b();
            bVar.f82896a = System.currentTimeMillis();
            bVar.f82897b = new LinkedHashMap();
            return bVar;
        }

        public /* synthetic */ C31679a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static void m102901a(C31678b bVar) {
            C7076p.m22077a().mo18293a(bVar);
        }

        /* renamed from: b */
        private static void m102902b(C31678b bVar) {
            if (bVar.f82898c > 300 || bVar.mo82456a() > 100) {
                C7042c.m21904a(bVar);
            }
        }

        /* renamed from: a */
        public final void mo82459a(int i, boolean z) {
            int i2;
            C31678b a = m102900a();
            if (z) {
                a.f82898c++;
            } else {
                if (a.f82897b == null) {
                    a.f82897b = new LinkedHashMap();
                }
                Map<Integer, Integer> map = a.f82897b;
                if (map == null) {
                    C7573i.m23580a();
                }
                Integer num = (Integer) map.get(Integer.valueOf(i));
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 0;
                }
                Map<Integer, Integer> map2 = a.f82897b;
                if (map2 == null) {
                    C7573i.m23580a();
                }
                map2.put(Integer.valueOf(i), Integer.valueOf(i2 + 1));
            }
            m102902b(a);
            m102901a(a);
        }
    }

    /* renamed from: b */
    public final boolean mo82457b() {
        if (System.currentTimeMillis() - this.f82896a > 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo82456a() {
        Map<Integer, Integer> map = this.f82897b;
        int i = 0;
        if (map != null) {
            for (Entry value : map.entrySet()) {
                i += ((Number) value.getValue()).intValue();
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = this.f82897b;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((Number) entry.getKey()).intValue());
                sb2.append(':');
                sb2.append(((Number) entry.getValue()).intValue());
                sb2.append(',');
                sb.append(sb2.toString());
            }
        }
        C7634n.m23735a((CharSequence) sb, (CharSequence) ",");
        StringBuilder sb3 = new StringBuilder("{");
        sb3.append(this.f82896a);
        sb3.append(": [");
        sb3.append(sb);
        sb3.append("], ");
        sb3.append(this.f82898c);
        sb3.append('}');
        return sb3.toString();
    }
}
