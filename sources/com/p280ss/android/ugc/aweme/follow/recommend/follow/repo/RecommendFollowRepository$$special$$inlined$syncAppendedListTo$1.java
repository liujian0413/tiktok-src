package com.p280ss.android.ugc.aweme.follow.recommend.follow.repo;

import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.repo.RecommendFollowRepository$$special$$inlined$syncAppendedListTo$1 */
public final class RecommendFollowRepository$$special$$inlined$syncAppendedListTo$1 extends Lambda implements C7562b<C11808c<C29479d, List<? extends C29480e>, C7581n, List<? extends C29480e>>, C7581n> {
    public RecommendFollowRepository$$special$$inlined$syncAppendedListTo$1() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11808c) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11808c<C29479d, List<C29480e>, C7581n, List<C29480e>> cVar) {
        C7573i.m23587b(cVar, "$this$keySyncTo");
        cVar.mo29359a((C7563m<? super K, ? super V, ? extends K1>) new C7563m<C29479d, List<? extends C29480e>, C7581n>(this) {
            final /* synthetic */ RecommendFollowRepository$$special$$inlined$syncAppendedListTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final C7581n invoke(C29479d dVar, List<? extends C29480e> list) {
                if (C7573i.m23585a((Object) C29479d.class, (Object) C7581n.class)) {
                    if (dVar != null) {
                        return (C7581n) dVar;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Unit");
                } else if (C7573i.m23585a((Object) C7581n.class, (Object) C7581n.class)) {
                    return C7581n.f20898a;
                } else {
                    throw new RuntimeException();
                }
            }
        });
        cVar.mo29360a((C48006q<? super K, ? super V, ? super V1, ? extends V1>) new C48006q<C29479d, List<? extends C29480e>, List<? extends C29480e>, List<? extends C29480e>>(this) {
            final /* synthetic */ RecommendFollowRepository$$special$$inlined$syncAppendedListTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final List<C29480e> invoke(C29479d dVar, List<? extends C29480e> list, List<? extends C29480e> list2) {
                boolean z;
                if (dVar.f77730b == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (list2 == null) {
                        list2 = C7525m.m23461a();
                    }
                    Collection collection = list2;
                    if (list == null) {
                        list = C7525m.m23461a();
                    }
                    if (list != null) {
                        return C7525m.m23506c(collection, (Iterable<? extends T>) list);
                    }
                    throw new RuntimeException();
                } else if (list == null) {
                    return null;
                } else {
                    if (list != null) {
                        return list;
                    }
                    throw new RuntimeException();
                }
            }
        });
    }
}
