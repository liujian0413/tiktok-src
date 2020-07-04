package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.common.base.C17457s;
import com.google.common.util.concurrent.C18225b;
import com.google.common.util.concurrent.C18241d;
import com.google.common.util.concurrent.C18245g;
import com.google.common.util.concurrent.C18246h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.base.C23364n;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35582r.C35583a;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.p */
public final class C40203p {
    /* renamed from: a */
    public static <V> C18241d<ApiServerException, V> m128511a(C17457s<C18253l<V>> sVar) {
        return new C40243q(sVar);
    }

    /* renamed from: a */
    private static <V> C18253l<V> m128513a(final ApiServerException apiServerException, final C17457s<C18253l<V>> sVar) {
        return new C18225b<V>() {
            {
                C35563c.f93244g.mo83158a(apiServerException, new C35583a() {
                    /* renamed from: b */
                    public final void mo90395b() {
                        C402041.this.mo47087a((Throwable) apiServerException);
                    }

                    /* renamed from: a */
                    public final void mo90394a() {
                        C18246h.m60214a((C18253l) sVar.mo44946a(), (C18245g<? super V>) new C18245g<V>() {
                            public final void onFailure(Throwable th) {
                                C402041.this.mo47087a(th);
                            }

                            public final void onSuccess(V v) {
                                C402041.this.mo47088b(v);
                            }
                        }, (Executor) C23364n.f61448a);
                    }
                });
            }
        };
    }

    /* renamed from: a */
    static final /* synthetic */ C18253l m128512a(C17457s sVar, ApiServerException apiServerException) throws Exception {
        if (C35563c.f93244g.mo83159a(apiServerException)) {
            return m128513a(apiServerException, sVar);
        }
        return C18246h.m60211a((Throwable) apiServerException);
    }
}
