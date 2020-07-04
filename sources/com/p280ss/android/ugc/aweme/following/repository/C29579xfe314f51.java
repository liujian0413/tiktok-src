package com.p280ss.android.ugc.aweme.following.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.following.repository.ConnectedRelationRepository$$special$$inlined$syncChangedItemTo$1 */
public final class C29579xfe314f51 extends Lambda implements C7562b<C11811d<? extends Object, User, ? extends Object, List<? extends User>>, C7581n> {
    public C29579xfe314f51() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11811d) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11811d<? extends Object, User, ? extends Object, List<User>> dVar) {
        C7573i.m23587b(dVar, "$this$predicatedSyncTo");
        dVar.mo29361a(C295801.INSTANCE);
        dVar.mo29362b(new C7563m<User, List<? extends User>, List<? extends User>>(this) {
            final /* synthetic */ C29579xfe314f51 this$0;

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.aweme.profile.model.User, code=java.lang.Object, for r5v0, types: [java.lang.Object, com.ss.android.ugc.aweme.profile.model.User] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.util.List<com.p280ss.android.ugc.aweme.profile.model.User> invoke(java.lang.Object r5, java.util.List<? extends com.p280ss.android.ugc.aweme.profile.model.User> r6) {
                /*
                    r4 = this;
                    java.lang.String r0 = "curV"
                    kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r1 = 10
                    int r1 = kotlin.collections.C7525m.m23469a(r6, r1)
                    r0.<init>(r1)
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.util.Iterator r6 = r6.iterator()
                L_0x0018:
                    boolean r1 = r6.hasNext()
                    if (r1 == 0) goto L_0x0045
                    java.lang.Object r1 = r6.next()
                    r2 = r5
                    com.ss.android.ugc.aweme.profile.model.User r2 = (com.p280ss.android.ugc.aweme.profile.model.User) r2
                    r3 = r1
                    com.ss.android.ugc.aweme.profile.model.User r3 = (com.p280ss.android.ugc.aweme.profile.model.User) r3
                    java.lang.String r3 = r3.getUid()
                    java.lang.String r2 = r2.getUid()
                    boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r3, r2)
                    if (r2 == 0) goto L_0x0041
                    boolean r2 = r5 instanceof java.lang.Object
                    if (r2 != 0) goto L_0x003c
                    r2 = 0
                    goto L_0x003d
                L_0x003c:
                    r2 = r5
                L_0x003d:
                    if (r2 != 0) goto L_0x0040
                    goto L_0x0041
                L_0x0040:
                    r1 = r2
                L_0x0041:
                    r0.add(r1)
                    goto L_0x0018
                L_0x0045:
                    java.util.List r0 = (java.util.List) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.repository.C29579xfe314f51.C295812.invoke(java.lang.Object, java.util.List):java.util.List");
            }
        });
    }
}
