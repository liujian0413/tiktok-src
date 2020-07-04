package com.p280ss.android.ugc.aweme.favorites.model;

import com.bytedance.jedi.arch.ext.list.C11583n;
import com.p280ss.android.ugc.aweme.favorites.adapter.C27733b;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27701f;
import java.util.List;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$1 */
public final class PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$1 extends Lambda implements C7562b<PoiCollectListState, C7492s<Pair<? extends List<? extends C27733b>, ? extends C11583n>>> {
    final /* synthetic */ PoiCollectListViewModel this$0;

    /* renamed from: com.ss.android.ugc.aweme.favorites.model.PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$1$a */
    static final class C27760a<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        final /* synthetic */ PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$1 f73201a;

        C27760a(PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$1 poiCollectListViewModel$$special$$inlined$SingleListMiddleware$1) {
            this.f73201a = poiCollectListViewModel$$special$$inlined$SingleListMiddleware$1;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<List<C27733b>, C11583n> apply(C27701f fVar) {
            C7573i.m23587b(fVar, "collectionList");
            return C7579l.m23633a(this.f73201a.this$0.mo71244a(fVar.f73024a, fVar.f73025b), new C11583n(fVar.f73027d, fVar.f73026c));
        }
    }

    public PoiCollectListViewModel$$special$$inlined$SingleListMiddleware$1(PoiCollectListViewModel poiCollectListViewModel) {
        this.this$0 = poiCollectListViewModel;
        super(1);
    }

    public final C7492s<Pair<List<C27733b>, C11583n>> invoke(PoiCollectListState poiCollectListState) {
        C7573i.m23587b(poiCollectListState, "it");
        C7319aa b = this.this$0.f73192c.mo71233a(12, 0).mo19134b((C7327h<? super T, ? extends R>) new C27760a<Object,Object>(this));
        C7573i.m23582a((Object) b, "repo.getPoiCollectionLis…                        }");
        C7492s<Pair<List<C27733b>, C11583n>> b2 = b.mo19136b();
        C7573i.m23582a((Object) b2, "actualRefresh(it).toObservable()");
        return b2;
    }
}
