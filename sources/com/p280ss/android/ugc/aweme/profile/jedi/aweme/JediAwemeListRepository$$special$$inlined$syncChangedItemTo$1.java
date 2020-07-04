package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListRepository$$special$$inlined$syncChangedItemTo$1 */
public final class JediAwemeListRepository$$special$$inlined$syncChangedItemTo$1 extends Lambda implements C7562b<C11811d<? extends Object, Aweme, ? extends Object, List<? extends Aweme>>, C7581n> {
    public JediAwemeListRepository$$special$$inlined$syncChangedItemTo$1() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11811d) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11811d<? extends Object, Aweme, ? extends Object, List<Aweme>> dVar) {
        C7573i.m23587b(dVar, "$this$predicatedSyncTo");
        dVar.mo29361a(C358911.INSTANCE);
        dVar.mo29362b(new C7563m<Aweme, List<? extends Aweme>, List<? extends Aweme>>(this) {
            final /* synthetic */ JediAwemeListRepository$$special$$inlined$syncChangedItemTo$1 this$0;

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.android.ugc.aweme.feed.model.Aweme, code=java.lang.Object, for r6v0, types: [java.lang.Object, com.ss.android.ugc.aweme.feed.model.Aweme] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.util.List<com.p280ss.android.ugc.aweme.feed.model.Aweme> invoke(java.lang.Object r6, java.util.List<? extends com.p280ss.android.ugc.aweme.feed.model.Aweme> r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = "curV"
                    kotlin.jvm.internal.C7573i.m23587b(r7, r0)
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r1 = 10
                    int r1 = kotlin.collections.C7525m.m23469a(r7, r1)
                    r0.<init>(r1)
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.util.Iterator r7 = r7.iterator()
                L_0x0018:
                    boolean r1 = r7.hasNext()
                    if (r1 == 0) goto L_0x004a
                    java.lang.Object r1 = r7.next()
                    r2 = r6
                    com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r2
                    r3 = r1
                    com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r3
                    java.lang.String r4 = "new"
                    kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                    java.lang.String r2 = r2.getAid()
                    java.lang.String r3 = r3.getAid()
                    boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r2, r3)
                    if (r2 == 0) goto L_0x0046
                    boolean r2 = r6 instanceof java.lang.Object
                    if (r2 != 0) goto L_0x0041
                    r2 = 0
                    goto L_0x0042
                L_0x0041:
                    r2 = r6
                L_0x0042:
                    if (r2 != 0) goto L_0x0045
                    goto L_0x0046
                L_0x0045:
                    r1 = r2
                L_0x0046:
                    r0.add(r1)
                    goto L_0x0018
                L_0x004a:
                    java.util.List r0 = (java.util.List) r0
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListRepository$$special$$inlined$syncChangedItemTo$1.C358922.invoke(java.lang.Object, java.util.List):java.util.List");
            }
        });
    }
}
