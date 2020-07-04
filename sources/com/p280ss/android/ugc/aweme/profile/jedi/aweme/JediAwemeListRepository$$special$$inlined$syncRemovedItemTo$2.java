package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListRepository$$special$$inlined$syncRemovedItemTo$2 */
public final class JediAwemeListRepository$$special$$inlined$syncRemovedItemTo$2 extends Lambda implements C7562b<C11808c<String, String, Integer, List<? extends Aweme>>, C7581n> {
    final /* synthetic */ C7562b $where;

    public JediAwemeListRepository$$special$$inlined$syncRemovedItemTo$2(C7562b bVar) {
        this.$where = bVar;
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11808c) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11808c<String, String, Integer, List<Aweme>> cVar) {
        C7573i.m23587b(cVar, "$this$keySyncTo");
        cVar.mo29359a((C7563m<? super K, ? super V, ? extends K1>) new C7563m<String, String, Integer>(this) {
            final /* synthetic */ JediAwemeListRepository$$special$$inlined$syncRemovedItemTo$2 this$0;

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, java.lang.Integer] */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1, types: [java.lang.Object, java.lang.Integer]
              assigns: [java.lang.Object]
              uses: [java.lang.Integer]
              mth insns count: 4
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Integer invoke(java.lang.String r1, java.lang.String r2) {
                /*
                    r0 = this;
                    com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListRepository$$special$$inlined$syncRemovedItemTo$2 r2 = r0.this$0
                    kotlin.jvm.a.b r2 = r2.$where
                    java.lang.Object r1 = r2.invoke(r1)
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListRepository$$special$$inlined$syncRemovedItemTo$2.C358961.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        cVar.mo29360a((C48006q<? super K, ? super V, ? super V1, ? extends V1>) new C48006q<String, String, List<? extends Aweme>, List<? extends Aweme>>(this) {
            final /* synthetic */ JediAwemeListRepository$$special$$inlined$syncRemovedItemTo$2 this$0;

            {
                this.this$0 = r1;
            }

            public final List<Aweme> invoke(String str, String str2, List<? extends Aweme> list) {
                boolean z;
                if (list == null) {
                    return null;
                }
                Iterable iterable = list;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (str2 != null) {
                        z = C7573i.m23585a((Object) ((Aweme) next).getAid(), (Object) str2);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
        });
    }
}
