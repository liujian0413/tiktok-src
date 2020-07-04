package com.p280ss.android.ugc.aweme.anchor.p1007a;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.anchor.api.p1008a.C22526a;
import com.p280ss.android.ugc.aweme.anchor.binder.game.GameItemViewBinder;
import kotlin.jvm.internal.C7573i;
import p1886me.drakeet.multitype.C48227d;
import p1886me.drakeet.multitype.MultiTypeAdapter;

/* renamed from: com.ss.android.ugc.aweme.anchor.a.a */
public final class C22520a extends C22523c {

    /* renamed from: com.ss.android.ugc.aweme.anchor.a.a$a */
    static final class C22521a<T> implements C48227d<C22526a> {

        /* renamed from: a */
        public static final C22521a f59995a = new C22521a();

        C22521a() {
        }

        /* renamed from: a */
        private static int m74485a(C22526a aVar) {
            C7573i.m23587b(aVar, "it");
            return 0;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo21960a(Object obj) {
            return m74485a((C22526a) obj);
        }
    }

    /* renamed from: a */
    public final void mo59137a(MultiTypeAdapter multiTypeAdapter, Activity activity, String str) {
        C7573i.m23587b(multiTypeAdapter, "adapter");
        C7573i.m23587b(str, "fragmentType");
        multiTypeAdapter.mo120456a(C22526a.class).mo120465a(new GameItemViewBinder(activity, str)).mo120466a(C22521a.f59995a);
    }
}
