package com.p280ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.following.repository.FollowingRelationRepository$$special$$inlined$syncChangedListTo$1 */
public final class C29597x4fff8ee4 extends Lambda implements C7562b<C11802a<? extends Object, List<? extends User>, String, User>, C7581n> {
    public C29597x4fff8ee4() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11802a) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11802a<? extends Object, List<User>, String, User> aVar) {
        C7573i.m23587b(aVar, "$receiver");
        aVar.mo29358a(new C7562b<List<? extends User>, List<? extends Pair<? extends String, ? extends User>>>(this) {
            final /* synthetic */ C29597x4fff8ee4 this$0;

            {
                this.this$0 = r1;
            }

            public final List<Pair<String, User>> invoke(List<? extends User> list) {
                C7573i.m23587b(list, "it");
                Iterable<User> iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (User user : iterable) {
                    arrayList.add(C7579l.m23633a(user.getUid(), user));
                }
                return (List) arrayList;
            }
        });
    }
}
