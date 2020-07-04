package com.p280ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.p280ss.android.ugc.aweme.profile.model.User;
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

/* renamed from: com.ss.android.ugc.aweme.following.repository.ConnectedRelationRepository$$special$$inlined$syncAppendedListTo$1 */
public final class C29576x89ea801d extends Lambda implements C7562b<C11808c<C29599a, List<? extends User>, C7581n, List<? extends User>>, C7581n> {
    public C29576x89ea801d() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11808c) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11808c<C29599a, List<User>, C7581n, List<User>> cVar) {
        C7573i.m23587b(cVar, "$this$keySyncTo");
        cVar.mo29359a((C7563m<? super K, ? super V, ? extends K1>) new C7563m<C29599a, List<? extends User>, C7581n>(this) {
            final /* synthetic */ C29576x89ea801d this$0;

            {
                this.this$0 = r1;
            }

            public final C7581n invoke(C29599a aVar, List<? extends User> list) {
                if (C7573i.m23585a((Object) C29599a.class, (Object) C7581n.class)) {
                    if (aVar != null) {
                        return (C7581n) aVar;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Unit");
                } else if (C7573i.m23585a((Object) C7581n.class, (Object) C7581n.class)) {
                    return C7581n.f20898a;
                } else {
                    throw new RuntimeException();
                }
            }
        });
        cVar.mo29360a((C48006q<? super K, ? super V, ? super V1, ? extends V1>) new C48006q<C29599a, List<? extends User>, List<? extends User>, List<? extends User>>(this) {
            final /* synthetic */ C29576x89ea801d this$0;

            {
                this.this$0 = r1;
            }

            public final List<User> invoke(C29599a aVar, List<? extends User> list, List<? extends User> list2) {
                boolean z;
                Integer num = aVar.f77955b;
                if (num != null && num.intValue() == 0) {
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
