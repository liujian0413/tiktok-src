package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11502e.C11503a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.jedi.arch.f */
public interface C11585f extends C0043i, C11501d, C11502e<C11585f>, C11648k, C11669s<C11585f> {

    /* renamed from: com.bytedance.jedi.arch.f$a */
    public static final class C11586a {
        /* renamed from: a */
        public static <S extends C11670t> C7321c m34050a(C11585f fVar, JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribe");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C11503a.m33914a(fVar, jediViewModel, vVar, mVar);
        }

        /* renamed from: a */
        public static <S extends C11670t, A> C7321c m34051a(C11585f fVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C11503a.m33916a(fVar, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: a */
        public static <S extends C11670t, T> C7321c m34052a(C11585f fVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
            C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
            C7573i.m23587b(lVar, "prop");
            C7573i.m23587b(vVar, "config");
            return C11503a.m33918a((C11502e<? extends RECEIVER>) fVar, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
        }

        /* renamed from: a */
        public static <S extends C11670t, A, B> C7321c m34053a(C11585f fVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(qVar, "subscriber");
            return C11503a.m33920a((C11502e<? extends RECEIVER>) fVar, jediViewModel, lVar, lVar2, vVar, qVar);
        }

        /* renamed from: a */
        public static <S extends C11670t, A, B, C, D> C7321c m34054a(C11585f fVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
            JediViewModel<S> jediViewModel2 = jediViewModel;
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7599l<S, ? extends A> lVar5 = lVar;
            C7573i.m23587b(lVar, "prop1");
            C7599l<S, ? extends B> lVar6 = lVar2;
            C7573i.m23587b(lVar2, "prop2");
            C7599l<S, ? extends C> lVar7 = lVar3;
            C7573i.m23587b(lVar3, "prop3");
            C7599l<S, ? extends D> lVar8 = lVar4;
            C7573i.m23587b(lVar4, "prop4");
            C11672v<C11493ab<A, B, C, D>> vVar2 = vVar;
            C7573i.m23587b(vVar, "config");
            C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar2 = sVar;
            C7573i.m23587b(sVar2, "subscriber");
            return C11503a.m33922a((C11502e<? extends RECEIVER>) fVar, jediViewModel2, lVar5, lVar6, lVar7, lVar8, vVar2, sVar2);
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R m34055a(C11585f fVar, VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
            C7573i.m23587b(vm1, "viewModel1");
            C7573i.m23587b(bVar, "block");
            return C11503a.m33924a(fVar, vm1, bVar);
        }

        /* renamed from: d */
        public static C11585f m34058d(C11585f fVar) {
            return fVar;
        }

        /* renamed from: e */
        public static boolean m34059e(C11585f fVar) {
            return true;
        }

        /* renamed from: a */
        public static C11648k m34049a(C11585f fVar) {
            return fVar;
        }

        /* renamed from: b */
        public static C11669s<C11585f> m34056b(C11585f fVar) {
            return fVar;
        }

        /* renamed from: c */
        public static C0043i m34057c(C11585f fVar) {
            return fVar;
        }
    }
}
