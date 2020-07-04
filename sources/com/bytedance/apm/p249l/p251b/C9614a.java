package com.bytedance.apm.p249l.p251b;

import com.bytedance.apm.C6174c;
import com.bytedance.apm.p241f.C6202e;
import com.bytedance.apm.p249l.C6269c;
import com.bytedance.apm.p249l.p250a.C9612c;
import com.bytedance.frameworks.baselib.p511a.C10071b;
import com.bytedance.frameworks.baselib.p511a.C10071b.C10072a;
import com.bytedance.frameworks.baselib.p511a.C10071b.C10074c;
import java.util.List;

/* renamed from: com.bytedance.apm.l.b.a */
public final class C9614a implements C9618b {

    /* renamed from: a */
    C10071b f26306a;

    /* renamed from: b */
    volatile long f26307b;

    /* renamed from: c */
    boolean f26308c;

    /* renamed from: d */
    int f26309d;

    /* renamed from: a */
    public final void mo23960a() {
        if (this.f26306a != null) {
            this.f26306a.f27408e = null;
        }
    }

    /* renamed from: c */
    public final boolean mo23964c() {
        if (this.f26307b == 1800000) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo23963b() {
        this.f26309d = 0;
        this.f26307b = 0;
        C6202e.m19259a().f18259a = false;
        C6269c.m19445a().mo15060a(true, 0);
    }

    public C9614a(final String str) {
        this.f26306a = new C10071b(C6174c.m19129a(), new C10072a() {
            /* renamed from: a */
            public final String mo23965a() {
                return str;
            }

            /* renamed from: b */
            public final List<String> mo23966b() {
                return C9612c.m28449a(str);
            }

            /* renamed from: c */
            public final int mo23967c() {
                return C9612c.m28448a();
            }

            /* renamed from: d */
            public final long mo23968d() {
                return (long) C9612c.m28451b();
            }
        }, new C10074c() {
            /* renamed from: a */
            public final boolean mo23969a() {
                return C9612c.m28453d();
            }

            /* renamed from: b */
            public final long mo23970b() {
                return C9614a.this.f26307b;
            }

            /* renamed from: c */
            public final boolean mo23971c() {
                return C9614a.this.f26308c;
            }

            /* renamed from: d */
            public final long mo23972d() {
                return C9612c.m28452c();
            }
        }) {
            /* renamed from: a */
            public final boolean mo23973a(String str, byte[] bArr) {
                boolean z;
                if (C9619d.m28471a() != null) {
                    C9620e a = C9619d.m28471a().mo15056a(str, bArr);
                    if (a.f26316a > 0) {
                        C9614a.this.f26308c = false;
                        if (a.f26316a != 200 || a.f26317b == null) {
                            if (500 <= a.f26316a && a.f26316a <= 600) {
                                C9614a.this.mo23961a(false);
                                return false;
                            }
                        } else if ("success".equals(a.f26317b.opt("message"))) {
                            C9614a.this.mo23963b();
                            return true;
                        } else {
                            if (a.f26317b.optInt("is_crash", 0) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean equals = "drop data".equals(a.f26317b.opt("message"));
                            if (z || equals) {
                                C9614a.this.mo23961a(true);
                                return false;
                            }
                            C9614a.this.mo23961a(false);
                            return false;
                        }
                    } else {
                        C9614a.this.f26308c = true;
                    }
                }
                return false;
            }
        };
    }

    /* renamed from: a */
    public final boolean mo23962a(String str) {
        if (C6174c.m19149g()) {
            new String[1][0] = str;
        }
        return this.f26306a.mo24727a(str);
    }

    /* renamed from: a */
    public final void mo23961a(boolean z) {
        if (z) {
            this.f26307b = 1800000;
            this.f26309d = 3;
        } else if (this.f26309d == 0) {
            this.f26307b = 300000;
            this.f26309d++;
        } else if (this.f26309d == 1) {
            this.f26307b = 900000;
            this.f26309d++;
        } else {
            int i = this.f26309d;
            this.f26307b = 1800000;
            this.f26309d++;
        }
        C6202e.m19259a().f18259a = true;
        C6269c.m19445a().mo15060a(false, this.f26307b);
    }
}
