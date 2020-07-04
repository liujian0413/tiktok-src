package com.bytedance.crash.p501j;

import com.bytedance.crash.p504l.C9982g;
import java.util.Comparator;

/* renamed from: com.bytedance.crash.j.c */
public final class C9940c {

    /* renamed from: a */
    private static final Comparator<C9942a> f27128a = new Comparator<C9942a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m29421a((C9942a) obj, (C9942a) obj2);
        }

        /* renamed from: a */
        private static int m29421a(C9942a aVar, C9942a aVar2) {
            int i = aVar.f27131b + aVar.f27132c;
            int i2 = aVar2.f27131b + aVar2.f27132c;
            if (i == i2) {
                return 0;
            }
            if (i > i2) {
                return -1;
            }
            return 1;
        }
    };

    /* renamed from: b */
    private static byte[] f27129b = new byte[4096];

    /* renamed from: com.bytedance.crash.j.c$a */
    public static class C9942a {

        /* renamed from: a */
        public String f27130a = "unknown";

        /* renamed from: b */
        public int f27131b;

        /* renamed from: c */
        public int f27132c;

        C9942a() {
        }
    }

    /* renamed from: a */
    public static long m29420a(int i) {
        StringBuilder sb = new StringBuilder("/proc/self/task/");
        sb.append(i);
        sb.append("/stat");
        String[] f = C9982g.m29562f(sb.toString());
        if (f == null) {
            return -1;
        }
        return (Long.parseLong(f[11]) * C9956a.m29461a()) + (Long.parseLong(f[12]) * C9956a.m29461a());
    }
}
