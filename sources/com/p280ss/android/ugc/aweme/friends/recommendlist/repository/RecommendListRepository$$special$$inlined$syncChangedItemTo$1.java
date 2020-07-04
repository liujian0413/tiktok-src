package com.p280ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.user.repository.C42844a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendListRepository$$special$$inlined$syncChangedItemTo$1 */
public final class RecommendListRepository$$special$$inlined$syncChangedItemTo$1 extends Lambda implements C7562b<C11811d<? extends Object, User, ? extends Object, List<? extends C42844a>>, C7581n> {
    public RecommendListRepository$$special$$inlined$syncChangedItemTo$1() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11811d) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11811d<? extends Object, User, ? extends Object, List<C42844a>> dVar) {
        C7573i.m23587b(dVar, "$this$predicatedSyncTo");
        dVar.mo29361a(C300581.INSTANCE);
        dVar.mo29362b(new C7563m<User, List<? extends C42844a>, List<? extends C42844a>>(this) {
            final /* synthetic */ RecommendListRepository$$special$$inlined$syncChangedItemTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final List<C42844a> invoke(User user, List<? extends C42844a> list) {
                Object obj;
                C7573i.m23587b(list, "curV");
                Iterable iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (Object next : iterable) {
                    User user2 = user;
                    C42844a aVar = (C42844a) next;
                    if (C7573i.m23585a((Object) aVar.f111320a.getUid(), (Object) user2.getUid())) {
                        aVar.mo104548a(user2);
                        obj = aVar;
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
