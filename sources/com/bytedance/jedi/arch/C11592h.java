package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11585f.C11586a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.jedi.arch.h */
public interface C11592h extends C11585f {

    /* renamed from: com.bytedance.jedi.arch.h$a */
    public static final class C11593a {
        /* renamed from: a */
        public static C11648k m34068a(C11592h hVar) {
            return C11586a.m34049a(hVar);
        }

        /* renamed from: a */
        public static <S extends C11670t> C7321c m34069a(C11592h hVar, JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribe");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C11586a.m34050a(hVar, jediViewModel, vVar, mVar);
        }

        /* renamed from: a */
        public static <S extends C11670t, A> C7321c m34070a(C11592h hVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C11586a.m34051a(hVar, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: a */
        public static <S extends C11670t, T> C7321c m34071a(C11592h hVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
            C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
            C7573i.m23587b(lVar, "prop");
            C7573i.m23587b(vVar, "config");
            return C11586a.m34052a(hVar, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
        }

        /* renamed from: a */
        public static <S extends C11670t, A, B> C7321c m34072a(C11592h hVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(qVar, "subscriber");
            return C11586a.m34053a(hVar, jediViewModel, lVar, lVar2, vVar, qVar);
        }

        /* renamed from: a */
        public static <S extends C11670t, A, B, C, D> C7321c m34073a(C11592h hVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
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
            return C11586a.m34054a(hVar, jediViewModel2, lVar5, lVar6, lVar7, lVar8, vVar2, sVar2);
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R m34074a(C11592h hVar, VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
            C7573i.m23587b(vm1, "viewModel1");
            C7573i.m23587b(bVar, "block");
            return C11586a.m34055a(hVar, vm1, bVar);
        }

        /* renamed from: b */
        public static C11669s<C11585f> m34075b(C11592h hVar) {
            return C11586a.m34056b(hVar);
        }

        /* renamed from: c */
        public static C0043i m34076c(C11592h hVar) {
            return C11586a.m34057c(hVar);
        }

        /* renamed from: d */
        public static C11585f m34077d(C11592h hVar) {
            return C11586a.m34058d(hVar);
        }

        /* renamed from: e */
        public static boolean m34078e(C11592h hVar) {
            return C11586a.m34059e(hVar);
        }
    }
}
