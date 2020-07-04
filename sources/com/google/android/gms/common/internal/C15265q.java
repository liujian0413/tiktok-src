package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.q */
public final class C15265q {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public static final class C15266a {

        /* renamed from: a */
        private final List<String> f39463a;

        /* renamed from: b */
        private final Object f39464b;

        private C15266a(Object obj) {
            this.f39464b = C15267r.m44384a(obj);
            this.f39463a = new ArrayList();
        }

        /* renamed from: a */
        public final C15266a mo38611a(String str, Object obj) {
            List<String> list = this.f39463a;
            String str2 = (String) C15267r.m44384a(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f39464b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f39463a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f39463a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m44381a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: a */
    public static int m44379a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C15266a m44380a(Object obj) {
        return new C15266a(obj);
    }
}
