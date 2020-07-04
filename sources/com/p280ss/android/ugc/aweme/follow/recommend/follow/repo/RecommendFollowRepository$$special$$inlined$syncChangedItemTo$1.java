package com.p280ss.android.ugc.aweme.follow.recommend.follow.repo;

import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.RecommendFollowRepository$$special$$inlined$syncChangedItemTo$1 */
public final class RecommendFollowRepository$$special$$inlined$syncChangedItemTo$1 extends Lambda implements C7562b<C11811d<? extends Object, User, ? extends Object, List<? extends C29480e>>, C7581n> {
    public RecommendFollowRepository$$special$$inlined$syncChangedItemTo$1() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11811d) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11811d<? extends Object, User, ? extends Object, List<C29480e>> dVar) {
        C7573i.m23587b(dVar, "$this$predicatedSyncTo");
        dVar.mo29361a(C294671.INSTANCE);
        dVar.mo29362b(new C7563m<User, List<? extends C29480e>, List<? extends C29480e>>(this) {
            final /* synthetic */ RecommendFollowRepository$$special$$inlined$syncChangedItemTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final List<C29480e> invoke(User user, List<? extends C29480e> list) {
                Object obj;
                C7573i.m23587b(list, "curV");
                Iterable iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (Object next : iterable) {
                    User user2 = user;
                    C29480e eVar = (C29480e) next;
                    if (C7573i.m23585a((Object) eVar.f77738a, (Object) user2.getUid())) {
                        eVar.mo75490a(user2);
                        obj = eVar;
                    } else {
                        obj = next;
                    }
                    arrayList.add(obj);
                }
                return (List) arrayList;
            }
        });
    }
}
