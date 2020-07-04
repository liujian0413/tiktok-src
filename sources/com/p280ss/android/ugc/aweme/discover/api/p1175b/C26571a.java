package com.p280ss.android.ugc.aweme.discover.api.p1175b;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.api.b.a */
public final class C26571a {

    /* renamed from: a */
    public static final C26571a f70096a = new C26571a();

    /* renamed from: com.ss.android.ugc.aweme.discover.api.b.a$a */
    static final class C26572a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f70097a;

        C26572a(String str) {
            this.f70097a = str;
        }

        /* renamed from: a */
        private void m87329a() {
            DiscoverApi.m87297b(this.f70097a);
        }

        public final /* synthetic */ Object call() {
            m87329a();
            return C7581n.f20898a;
        }
    }

    private C26571a() {
    }

    /* renamed from: a */
    public static final void m87328a(String str) {
        C7573i.m23587b(str, "uid");
        C1592h.m7853a((Callable<TResult>) new C26572a<TResult>(str));
    }
}
