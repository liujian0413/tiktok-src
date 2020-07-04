package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23322e;
import com.p280ss.android.ugc.aweme.base.p1063g.C23345c;

/* renamed from: com.ss.android.ugc.aweme.utils.ct */
public final class C43025ct<Result> {

    /* renamed from: a */
    public C23322e<Result> f111607a;

    /* renamed from: b */
    C23345c<Result> f111608b;

    /* renamed from: c */
    protected boolean f111609c;

    /* renamed from: a */
    public final void mo104701a() {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                try {
                    final Object a = C43025ct.this.f111607a.mo60608a();
                    if (C43025ct.this.f111608b != null) {
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                if (!C43025ct.this.f111609c) {
                                    C43025ct.this.f111608b.mo60643a(a);
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    if (C43025ct.this.f111608b != null) {
                        C6726a.m20844b(new Runnable() {
                            public final void run() {
                                if (!C43025ct.this.f111609c) {
                                    C43025ct.this.f111608b.mo60642a(e);
                                }
                            }
                        });
                    }
                }
            }
        });
    }

    public C43025ct(C23322e<Result> eVar, C23345c<Result> cVar) {
        this.f111607a = eVar;
        this.f111608b = cVar;
    }
}
