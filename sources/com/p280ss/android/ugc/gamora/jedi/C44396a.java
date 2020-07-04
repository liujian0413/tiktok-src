package com.p280ss.android.ugc.gamora.jedi;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.C11592h.C11593a;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.gamora.jedi.a */
public interface C44396a extends C11592h {

    /* renamed from: com.ss.android.ugc.gamora.jedi.a$a */
    public static final class C44397a {

        /* renamed from: com.ss.android.ugc.gamora.jedi.a$a$a */
        static final class C44398a extends Lambda implements C7562b<S1, C7581n> {

            /* renamed from: a */
            final /* synthetic */ ObjectRef f114659a;

            C44398a(ObjectRef objectRef) {
                this.f114659a = objectRef;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m140512a((C11670t) obj);
                return C7581n.f20898a;
            }

            /* JADX WARNING: type inference failed for: r2v0, types: [T, java.lang.Object, S1] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=S1, code=null, for r2v0, types: [T, java.lang.Object, S1] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void m140512a(S1 r2) {
                /*
                    r1 = this;
                    java.lang.String r0 = "it"
                    kotlin.jvm.internal.C7573i.m23587b(r2, r0)
                    kotlin.jvm.internal.Ref$ObjectRef r0 = r1.f114659a
                    r0.element = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.gamora.jedi.C44396a.C44397a.C44398a.m140512a(com.bytedance.jedi.arch.t):void");
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.jedi.a$a$b */
        static final class C44399b extends Lambda implements C7563m<C11585f, A, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C7563m f114660a;

            C44399b(C7563m mVar) {
                this.f114660a = mVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m140513a((C11585f) obj, obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m140513a(C11585f fVar, A a) {
                C7573i.m23587b(fVar, "$receiver");
                if (a != null) {
                    this.f114660a.invoke((C44396a) fVar, a);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.jedi.a$a$c */
        static final class C44400c extends Lambda implements C7563m<C44396a, C44403b<? extends A>, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C7563m f114661a;

            C44400c(C7563m mVar) {
                this.f114661a = mVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m140514a((C44396a) obj, (C44403b) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m140514a(final C44396a aVar, C44403b<? extends A> bVar) {
                C7573i.m23587b(aVar, "$receiver");
                C7573i.m23587b(bVar, "it");
                bVar.mo106827a(new C7562b<A, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C44400c f114662a;

                    {
                        this.f114662a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m140515a(obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m140515a(A a) {
                        this.f114662a.f114661a.invoke(aVar, a);
                    }
                });
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.jedi.a$a$d */
        static final class C44402d extends Lambda implements C7563m<C44396a, C44413i<? extends A>, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C7563m f114664a;

            C44402d(C7563m mVar) {
                this.f114664a = mVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m140516a((C44396a) obj, (C44413i) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m140516a(C44396a aVar, C44413i<? extends A> iVar) {
                C7573i.m23587b(aVar, "$receiver");
                C7573i.m23587b(iVar, "it");
                this.f114664a.invoke(aVar, iVar.f114671a);
            }
        }

        /* renamed from: a */
        public static C0043i m140494a(C44396a aVar) {
            return C11593a.m34076c(aVar);
        }

        /* renamed from: a */
        public static <S extends C11670t> C7321c m140496a(C44396a aVar, JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribe");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C11593a.m34069a(aVar, jediViewModel, vVar, mVar);
        }

        /* renamed from: a */
        public static <S extends C11670t, T> C7321c m140497a(C44396a aVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
            C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
            C7573i.m23587b(lVar, "prop");
            C7573i.m23587b(vVar, "config");
            return C11593a.m34071a(aVar, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
        }

        /* renamed from: a */
        public static <S extends C11670t, A, B> C7321c m140498a(C44396a aVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(qVar, "subscriber");
            return C11593a.m34072a(aVar, jediViewModel, lVar, lVar2, vVar, qVar);
        }

        /* renamed from: a */
        public static <S extends C11670t, A, B, C, D> C7321c m140499a(C44396a aVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
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
            return C11593a.m34073a(aVar, jediViewModel2, lVar5, lVar6, lVar7, lVar8, vVar2, sVar2);
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R m140500a(C44396a aVar, VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
            C7573i.m23587b(vm1, "viewModel1");
            C7573i.m23587b(bVar, "block");
            return C11593a.m34074a(aVar, vm1, bVar);
        }

        /* renamed from: b */
        public static C11648k m140503b(C44396a aVar) {
            return C11593a.m34068a(aVar);
        }

        /* renamed from: c */
        public static C11585f m140506c(C44396a aVar) {
            return C11593a.m34077d(aVar);
        }

        /* renamed from: d */
        public static C11669s<C11585f> m140509d(C44396a aVar) {
            return C11593a.m34075b(aVar);
        }

        /* renamed from: d */
        public static <S extends C11670t, A> C7321c m140510d(C44396a aVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            return C11593a.m34070a(aVar, jediViewModel, lVar, vVar, mVar);
        }

        /* renamed from: e */
        public static boolean m140511e(C44396a aVar) {
            return C11593a.m34078e(aVar);
        }

        /* renamed from: a */
        public static <VM1 extends JediViewModel<S1>, S1 extends C11670t> S1 m140495a(C44396a aVar, VM1 vm1) {
            C7573i.m23587b(vm1, "viewModel1");
            ObjectRef objectRef = new ObjectRef();
            objectRef.element = null;
            aVar.mo29066a(vm1, new C44398a(objectRef));
            S1 s1 = (C11670t) objectRef.element;
            if (s1 == null) {
                C7573i.m23580a();
            }
            return s1;
        }

        /* renamed from: b */
        public static <S extends C11670t, A> void m140504b(C44396a aVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribeEvent");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            aVar.mo91868b(jediViewModel, lVar, vVar, new C44400c(mVar));
        }

        /* renamed from: c */
        public static <S extends C11670t, A> void m140507c(C44396a aVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribeMultiEvent");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            aVar.mo91868b(jediViewModel, lVar, vVar, new C44402d(mVar));
        }

        /* renamed from: a */
        public static <S extends C11670t, A> void m140501a(C44396a aVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectNonNullSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            aVar.mo29062a(jediViewModel, lVar, vVar, new C44399b(mVar));
        }
    }

    /* renamed from: b */
    <S extends C11670t, A> void mo91868b(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar);

    /* renamed from: c */
    <S extends C11670t, A> void mo91869c(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44403b<? extends A>> lVar, C11672v<C11675y<C44403b<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar);

    /* renamed from: d */
    <S extends C11670t, A> void mo91870d(JediViewModel<S> jediViewModel, C7599l<S, ? extends C44413i<? extends A>> lVar, C11672v<C11675y<C44413i<A>>> vVar, C7563m<? super C44396a, ? super A, C7581n> mVar);
}
