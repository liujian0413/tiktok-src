package com.p280ss.android.ugc.aweme.friends.recommendlist.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.p280ss.android.ugc.aweme.user.repository.C42844a;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.RecommendListRepository$$special$$inlined$syncAppendedListTo$1 */
public final class RecommendListRepository$$special$$inlined$syncAppendedListTo$1 extends Lambda implements C7562b<C11808c<C30070e, List<? extends C42844a>, Integer, List<? extends C42844a>>, C7581n> {
    public RecommendListRepository$$special$$inlined$syncAppendedListTo$1() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11808c) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11808c<C30070e, List<C42844a>, Integer, List<C42844a>> cVar) {
        C7573i.m23587b(cVar, "$this$keySyncTo");
        cVar.mo29359a((C7563m<? super K, ? super V, ? extends K1>) new C7563m<C30070e, List<? extends C42844a>, Integer>(this) {
            final /* synthetic */ RecommendListRepository$$special$$inlined$syncAppendedListTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Integer invoke(C30070e eVar, List<? extends C42844a> list) {
                return Integer.valueOf(eVar.f79046d);
            }
        });
        cVar.mo29360a((C48006q<? super K, ? super V, ? super V1, ? extends V1>) new C48006q<C30070e, List<? extends C42844a>, List<? extends C42844a>, List<? extends C42844a>>(this) {
            final /* synthetic */ RecommendListRepository$$special$$inlined$syncAppendedListTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final List<C42844a> invoke(C30070e eVar, List<? extends C42844a> list, List<? extends C42844a> list2) {
                int i;
                Integer num = eVar.f79044b;
                boolean z = false;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                if (i == 0) {
                    z = true;
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
