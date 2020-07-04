package com.p280ss.android.ugc.aweme.discover.repo;

import com.bytedance.jedi.model.p599a.C11750c;
import com.bytedance.jedi.model.p600b.C11774b;
import com.bytedance.jedi.model.p600b.C11776c;
import com.bytedance.jedi.model.p601c.C11783b;
import com.bytedance.jedi.model.p602d.C11790b;
import com.bytedance.jedi.model.p603e.C11801a.C11805b;
import com.bytedance.jedi.model.repository.C11994b;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverListData;
import com.p280ss.android.ugc.aweme.discover.repo.fetcher.C26855b;
import com.p280ss.android.ugc.aweme.discover.repo.fetcher.DiscoverRequestParam;
import com.p280ss.android.ugc.aweme.discover.repo.p1184a.C26851a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7492s;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.a */
public final class C26848a extends C11994b {

    /* renamed from: a */
    public static final C26850a f70857a = new C26850a(null);

    /* renamed from: c */
    private static final C26851a f70858c = new C26851a();

    /* renamed from: b */
    private final C26855b f70859b = new C26855b();

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.a$a */
    public static final class C26850a {
        private C26850a() {
        }

        public /* synthetic */ C26850a(C7571f fVar) {
            this();
        }
    }

    public C26848a() {
        mo29602a(C11783b.m34516a((C11790b<K, V, REQ, RESP>) this.f70859b), C11783b.m34514a((C11750c<K, V>) f70858c), C11805b.m34557a((C7563m<? super K, ? super V, ? extends K1>) C11806a.f31598a, (C48006q<? super K, ? super V, ? super V1, ? extends V1>) C268491.f70860a));
    }

    /* renamed from: a */
    public final C7492s<DiscoverListData> mo69508a(DiscoverRequestParam discoverRequestParam, boolean z) {
        boolean z2;
        C7492s sVar;
        C7573i.m23587b(discoverRequestParam, "param");
        if (discoverRequestParam.getCursor() == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !z) {
            sVar = this.f70859b.mo29357c(discoverRequestParam);
        } else {
            sVar = C11774b.m34502a(this.f70859b, f70858c, C11775a.f31570a).mo29349a(C11776c.m34505a()).mo29357c(discoverRequestParam);
        }
        C7492s<DiscoverListData> b = sVar.mo19304b(C7333a.m23044b());
        C7573i.m23582a((Object) b, "request.subscribeOn(Schedulers.io())");
        return b;
    }
}
