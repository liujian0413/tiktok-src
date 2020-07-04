package com.p280ss.android.ugc.aweme.follow.recommend.follow.repo;

import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.RecommendFollowRepository$$special$$inlined$syncRemovedItemTo$1 */
public final class RecommendFollowRepository$$special$$inlined$syncRemovedItemTo$1 extends Lambda implements C7562b<C11811d<String, String, C7581n, List<? extends C29480e>>, C7581n> {
    public RecommendFollowRepository$$special$$inlined$syncRemovedItemTo$1() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11811d) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11811d<String, String, C7581n, List<C29480e>> dVar) {
        C7573i.m23587b(dVar, "$this$predicatedSyncTo");
        dVar.mo29361a(C294721.INSTANCE);
        dVar.mo29362b(new C7563m<String, List<? extends C29480e>, List<? extends C29480e>>(this) {
            final /* synthetic */ RecommendFollowRepository$$special$$inlined$syncRemovedItemTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final List<C29480e> invoke(String str, List<? extends C29480e> list) {
                C7573i.m23587b(list, "curV");
                Iterable iterable = list;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (!C7573i.m23585a((Object) ((C29480e) next).f77738a, (Object) str)) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
        });
    }
}
