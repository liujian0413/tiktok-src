package com.bytedance.frameworks.apm.trace;

import com.C1642a;

/* renamed from: com.bytedance.frameworks.apm.trace.d */
public final class C10060d {

    /* renamed from: a */
    private static C10062a f27372a;

    /* renamed from: b */
    private static C10062a f27373b;

    /* renamed from: com.bytedance.frameworks.apm.trace.d$a */
    public interface C10062a {
        /* renamed from: a */
        void mo24703a(String str, String str2, Object... objArr);

        /* renamed from: b */
        void mo24704b(String str, String str2, Object... objArr);

        /* renamed from: c */
        void mo24705c(String str, String str2, Object... objArr);

        /* renamed from: d */
        void mo24706d(String str, String str2, Object... objArr);
    }

    static {
        C100611 r0 = new C10062a() {
            /* renamed from: a */
            public final void mo24703a(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    C1642a.m8034a(str2, objArr);
                }
            }

            /* renamed from: b */
            public final void mo24704b(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    C1642a.m8034a(str2, objArr);
                }
            }

            /* renamed from: c */
            public final void mo24705c(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    C1642a.m8034a(str2, objArr);
                }
            }

            /* renamed from: d */
            public final void mo24706d(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    C1642a.m8034a(str2, objArr);
                }
            }
        };
        f27372a = r0;
        f27373b = r0;
    }

    /* renamed from: a */
    public static void m29878a(String str, String str2, Object... objArr) {
        if (f27373b != null) {
            f27373b.mo24706d(str, str2, objArr);
        }
    }

    /* renamed from: b */
    public static void m29879b(String str, String str2, Object... objArr) {
        if (f27373b != null) {
            f27373b.mo24705c(str, str2, objArr);
        }
    }

    /* renamed from: c */
    public static void m29880c(String str, String str2, Object... objArr) {
        if (f27373b != null) {
            f27373b.mo24703a(str, str2, objArr);
        }
    }

    /* renamed from: d */
    public static void m29881d(String str, String str2, Object... objArr) {
        if (f27373b != null) {
            f27373b.mo24704b(str, str2, objArr);
        }
    }
}
