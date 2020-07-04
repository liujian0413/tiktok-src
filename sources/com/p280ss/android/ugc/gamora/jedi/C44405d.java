package com.p280ss.android.ugc.gamora.jedi;

import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.gamora.jedi.d */
public final class C44405d {

    /* renamed from: com.ss.android.ugc.gamora.jedi.d$a */
    static final class C44406a extends Lambda implements C7563m<C11585f, A, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7562b f114667a;

        C44406a(C7562b bVar) {
            this.f114667a = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m140522a((C11585f) obj, obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140522a(C11585f fVar, A a) {
            C7573i.m23587b(fVar, "$receiver");
            if (a != null) {
                this.f114667a.invoke(a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.jedi.d$b */
    static final class C44407b extends Lambda implements C7562b<C44403b<? extends A>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11592h f114668a;

        /* renamed from: b */
        final /* synthetic */ C7563m f114669b;

        C44407b(C11592h hVar, C7563m mVar) {
            this.f114668a = hVar;
            this.f114669b = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m140523a((C44403b) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m140523a(C44403b<? extends A> bVar) {
            C7573i.m23587b(bVar, "it");
            bVar.mo106827a(new C7562b<A, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C44407b f114670a;

                {
                    this.f114670a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m140524a(obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m140524a(A a) {
                    C7563m mVar = this.f114670a.f114669b;
                    C11592h hVar = this.f114670a.f114668a;
                    if (hVar != null) {
                        mVar.invoke((C44396a) hVar, a);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.gamora.jedi.BaseJediView");
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <A, S extends C11670t> void m140518a(C11592h hVar, BaseJediViewModel<S> baseJediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7562b<? super A, C7581n> bVar) {
        C7573i.m23587b(hVar, "$this$selectNonNullSubscribe");
        C7573i.m23587b(baseJediViewModel, "viewModel");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(bVar, "subscriber");
        hVar.mo29062a(baseJediViewModel, lVar, vVar, new C44406a(bVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <A, S extends C11670t> void m140520a(C11592h hVar, BaseJediViewModel<S> baseJediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
        C7573i.m23587b(hVar, "$this$subscribeEvent");
        C7573i.m23587b(baseJediViewModel, "viewModel");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        m140518a(hVar, baseJediViewModel, lVar, vVar, (C7562b<? super A, C7581n>) new C44407b<Object,C7581n>(hVar, mVar));
    }
}
