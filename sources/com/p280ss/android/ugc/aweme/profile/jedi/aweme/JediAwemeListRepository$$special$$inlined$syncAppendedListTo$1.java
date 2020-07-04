package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListRepository$$special$$inlined$syncAppendedListTo$1 */
public final class JediAwemeListRepository$$special$$inlined$syncAppendedListTo$1 extends Lambda implements C7562b<C11808c<C35967e, List<? extends Aweme>, Integer, List<? extends Aweme>>, C7581n> {
    public JediAwemeListRepository$$special$$inlined$syncAppendedListTo$1() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11808c) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11808c<C35967e, List<Aweme>, Integer, List<Aweme>> cVar) {
        C7573i.m23587b(cVar, "$this$keySyncTo");
        cVar.mo29359a((C7563m<? super K, ? super V, ? extends K1>) new C7563m<C35967e, List<? extends Aweme>, Integer>(this) {
            final /* synthetic */ JediAwemeListRepository$$special$$inlined$syncAppendedListTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final Integer invoke(C35967e eVar, List<? extends Aweme> list) {
                return Integer.valueOf(eVar.f94138a);
            }
        });
        cVar.mo29360a((C48006q<? super K, ? super V, ? super V1, ? extends V1>) new C48006q<C35967e, List<? extends Aweme>, List<? extends Aweme>, List<? extends Aweme>>(this) {
            final /* synthetic */ JediAwemeListRepository$$special$$inlined$syncAppendedListTo$1 this$0;

            {
                this.this$0 = r1;
            }

            public final List<Aweme> invoke(C35967e eVar, List<? extends Aweme> list, List<? extends Aweme> list2) {
                boolean z;
                if (eVar.f94140c == 0) {
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
