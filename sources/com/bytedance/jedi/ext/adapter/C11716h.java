package com.bytedance.jedi.ext.adapter;

import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11502e.C11503a;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.jedi.ext.adapter.h */
public interface C11716h<VH extends C11501d> extends C11501d, C11502e<VH> {

    /* renamed from: com.bytedance.jedi.ext.adapter.h$a */
    public static final class C11717a {
        /* renamed from: a */
        public static <VH extends C11501d, S extends C11670t> C7321c m34332a(C11716h<VH> hVar, JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super VH, ? super S, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribe");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C11503a.m33914a(hVar, jediViewModel, vVar, mVar);
        }

        /* renamed from: a */
        public static <VH extends C11501d, S extends C11670t, A> C7321c m34333a(C11716h<VH> hVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super VH, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C11503a.m33916a(hVar, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: a */
        public static <VH extends C11501d, S extends C11670t, T> C7321c m34334a(C11716h<VH> hVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super VH, ? super Throwable, C7581n> mVar, C7562b<? super VH, C7581n> bVar, C7563m<? super VH, ? super T, C7581n> mVar2) {
            C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
            C7573i.m23587b(lVar, "prop");
            C7573i.m23587b(vVar, "config");
            return C11503a.m33918a((C11502e<? extends RECEIVER>) hVar, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
        }

        /* renamed from: a */
        public static <VH extends C11501d, S extends C11670t, A, B> C7321c m34335a(C11716h<VH> hVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super VH, ? super A, ? super B, C7581n> qVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(qVar, "subscriber");
            return C11503a.m33920a((C11502e<? extends RECEIVER>) hVar, jediViewModel, lVar, lVar2, vVar, qVar);
        }

        /* renamed from: a */
        public static <VH extends C11501d, S extends C11670t, A, B, C, D> C7321c m34336a(C11716h<VH> hVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super VH, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
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
            C48008s<? super VH, ? super A, ? super B, ? super C, ? super D, C7581n> sVar2 = sVar;
            C7573i.m23587b(sVar2, "subscriber");
            return C11503a.m33922a((C11502e<? extends RECEIVER>) hVar, jediViewModel2, lVar5, lVar6, lVar7, lVar8, vVar2, sVar2);
        }

        /* renamed from: a */
        public static <VH extends C11501d, VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R m34337a(C11716h<VH> hVar, VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
            C7573i.m23587b(vm1, "viewModel1");
            C7573i.m23587b(bVar, "block");
            return C11503a.m33924a(hVar, vm1, bVar);
        }

        /* renamed from: a */
        public static <VH extends C11501d> C11648k m34331a(C11716h<VH> hVar) {
            C11679b d = hVar.mo29218d();
            if (d != null) {
                return d;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.LifecycleOwnerHolder");
        }

        /* renamed from: b */
        public static <VH extends C11501d> C11669s<VH> m34338b(C11716h<VH> hVar) {
            C11679b d = hVar.mo29218d();
            if (d != null) {
                return d;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.arch.ReceiverHolder<VH>");
        }
    }

    /* renamed from: d */
    C11679b mo29218d();
}
