package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0043i;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.internal.C11640h;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.jedi.arch.e */
public interface C11502e<RECEIVER extends C11501d> {

    /* renamed from: com.bytedance.jedi.arch.e$a */
    public static final class C11503a {

        /* renamed from: com.bytedance.jedi.arch.e$a$a */
        static final class C11504a extends Lambda implements C7562b<C11491a<? extends T>, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C11669s f31097a;

            /* renamed from: b */
            final /* synthetic */ C11502e f31098b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31099c;

            /* renamed from: d */
            final /* synthetic */ C7599l f31100d;

            /* renamed from: e */
            final /* synthetic */ C11672v f31101e;

            /* renamed from: f */
            final /* synthetic */ C7562b f31102f;

            /* renamed from: g */
            final /* synthetic */ C7563m f31103g;

            /* renamed from: h */
            final /* synthetic */ C7563m f31104h;

            C11504a(C11669s sVar, C11502e eVar, JediViewModel jediViewModel, C7599l lVar, C11672v vVar, C7562b bVar, C7563m mVar, C7563m mVar2) {
                this.f31097a = sVar;
                this.f31098b = eVar;
                this.f31099c = jediViewModel;
                this.f31100d = lVar;
                this.f31101e = vVar;
                this.f31102f = bVar;
                this.f31103g = mVar;
                this.f31104h = mVar2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m33925a((C11491a) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m33925a(C11491a<? extends T> aVar) {
                C7573i.m23587b(aVar, "async");
                if (aVar instanceof C11649l) {
                    C7562b bVar = this.f31102f;
                    if (bVar != null) {
                        C11501d e = this.f31097a.mo29191e();
                        if (e != null) {
                            bVar.invoke(e);
                        }
                    }
                } else if (aVar instanceof C11500c) {
                    C7563m mVar = this.f31103g;
                    if (mVar != null) {
                        C11501d e2 = this.f31097a.mo29191e();
                        if (e2 != null) {
                            mVar.invoke(e2, ((C11500c) aVar).f31096a);
                        }
                    }
                } else if (aVar instanceof C11674x) {
                    C7563m mVar2 = this.f31104h;
                    if (mVar2 != null) {
                        C11501d e3 = this.f31097a.mo29191e();
                        if (e3 != null) {
                            mVar2.invoke(e3, ((C11674x) aVar).mo29046a());
                        }
                    }
                }
            }
        }

        /* renamed from: com.bytedance.jedi.arch.e$a$b */
        static final class C11505b extends Lambda implements C7562b<A, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C11669s f31105a;

            /* renamed from: b */
            final /* synthetic */ C11502e f31106b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31107c;

            /* renamed from: d */
            final /* synthetic */ C7599l f31108d;

            /* renamed from: e */
            final /* synthetic */ C11672v f31109e;

            /* renamed from: f */
            final /* synthetic */ C7563m f31110f;

            C11505b(C11669s sVar, C11502e eVar, JediViewModel jediViewModel, C7599l lVar, C11672v vVar, C7563m mVar) {
                this.f31105a = sVar;
                this.f31106b = eVar;
                this.f31107c = jediViewModel;
                this.f31108d = lVar;
                this.f31109e = vVar;
                this.f31110f = mVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m33926a(obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m33926a(A a) {
                C11501d e = this.f31105a.mo29191e();
                if (e != null) {
                    this.f31110f.invoke(e, a);
                }
            }
        }

        /* renamed from: com.bytedance.jedi.arch.e$a$c */
        static final class C11506c extends Lambda implements C7563m<A, B, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C11669s f31111a;

            /* renamed from: b */
            final /* synthetic */ C11502e f31112b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31113c;

            /* renamed from: d */
            final /* synthetic */ C7599l f31114d;

            /* renamed from: e */
            final /* synthetic */ C7599l f31115e;

            /* renamed from: f */
            final /* synthetic */ C11672v f31116f;

            /* renamed from: g */
            final /* synthetic */ C48006q f31117g;

            C11506c(C11669s sVar, C11502e eVar, JediViewModel jediViewModel, C7599l lVar, C7599l lVar2, C11672v vVar, C48006q qVar) {
                this.f31111a = sVar;
                this.f31112b = eVar;
                this.f31113c = jediViewModel;
                this.f31114d = lVar;
                this.f31115e = lVar2;
                this.f31116f = vVar;
                this.f31117g = qVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m33927a(obj, obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m33927a(A a, B b) {
                C11501d e = this.f31111a.mo29191e();
                if (e != null) {
                    this.f31117g.invoke(e, a, b);
                }
            }
        }

        /* renamed from: com.bytedance.jedi.arch.e$a$d */
        static final class C11507d extends Lambda implements C48007r<A, B, C, D, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C11669s f31118a;

            /* renamed from: b */
            final /* synthetic */ C11502e f31119b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31120c;

            /* renamed from: d */
            final /* synthetic */ C7599l f31121d;

            /* renamed from: e */
            final /* synthetic */ C7599l f31122e;

            /* renamed from: f */
            final /* synthetic */ C7599l f31123f;

            /* renamed from: g */
            final /* synthetic */ C7599l f31124g;

            /* renamed from: h */
            final /* synthetic */ C11672v f31125h;

            /* renamed from: i */
            final /* synthetic */ C48008s f31126i;

            C11507d(C11669s sVar, C11502e eVar, JediViewModel jediViewModel, C7599l lVar, C7599l lVar2, C7599l lVar3, C7599l lVar4, C11672v vVar, C48008s sVar2) {
                this.f31118a = sVar;
                this.f31119b = eVar;
                this.f31120c = jediViewModel;
                this.f31121d = lVar;
                this.f31122e = lVar2;
                this.f31123f = lVar3;
                this.f31124g = lVar4;
                this.f31125h = vVar;
                this.f31126i = sVar2;
                super(4);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                m33928a(obj, obj2, obj3, obj4);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m33928a(A a, B b, C c, D d) {
                C11501d e = this.f31118a.mo29191e();
                if (e != null) {
                    this.f31126i.invoke(e, a, b, c, d);
                }
            }
        }

        /* renamed from: com.bytedance.jedi.arch.e$a$e */
        static final class C11508e extends Lambda implements C7562b<S, C7581n> {

            /* renamed from: a */
            final /* synthetic */ C11669s f31127a;

            /* renamed from: b */
            final /* synthetic */ C11502e f31128b;

            /* renamed from: c */
            final /* synthetic */ JediViewModel f31129c;

            /* renamed from: d */
            final /* synthetic */ C11672v f31130d;

            /* renamed from: e */
            final /* synthetic */ C7563m f31131e;

            C11508e(C11669s sVar, C11502e eVar, JediViewModel jediViewModel, C11672v vVar, C7563m mVar) {
                this.f31127a = sVar;
                this.f31128b = eVar;
                this.f31129c = jediViewModel;
                this.f31130d = vVar;
                this.f31131e = mVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                m33929a((C11670t) obj);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m33929a(S s) {
                C7573i.m23587b(s, "it");
                C11501d e = this.f31127a.mo29191e();
                if (e != null) {
                    this.f31131e.invoke(e, s);
                }
            }
        }

        /* renamed from: a */
        public static <RECEIVER extends C11501d, S extends C11670t, A, B, C, D> C7321c m33922a(C11502e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
            C11672v<C11493ab<A, B, C, D>> vVar2 = vVar;
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(lVar3, "prop3");
            C7573i.m23587b(lVar4, "prop4");
            C7573i.m23587b(vVar2, "config");
            C48008s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C7581n> sVar2 = sVar;
            C7573i.m23587b(sVar2, "subscriber");
            C11669s b = eVar.mo29067b();
            C0043i d = eVar.mo29060a().mo29173d();
            C11502e<? extends RECEIVER> eVar2 = eVar;
            C11672v a = C11640h.m34111a(eVar2, vVar2);
            C11507d dVar = new C11507d(b, eVar2, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar2, sVar2);
            return C11640h.m34115a(jediViewModel, d, lVar, lVar2, lVar3, lVar4, a, dVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends C11501d, VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R m33924a(C11502e<? extends RECEIVER> eVar, VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
            C7573i.m23587b(vm1, "viewModel1");
            C7573i.m23587b(bVar, "block");
            return bVar.invoke(vm1.mo29027a());
        }

        /* renamed from: a */
        public static <RECEIVER extends C11501d, S extends C11670t> C7321c m33914a(C11502e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super RECEIVER, ? super S, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$subscribe");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            C11669s b = eVar.mo29067b();
            C0043i d = eVar.mo29060a().mo29173d();
            C11672v a = C11640h.m34111a(eVar, vVar);
            C11508e eVar2 = new C11508e(b, eVar, jediViewModel, vVar, mVar);
            return C11640h.m34112a(jediViewModel, d, a, eVar2);
        }

        /* renamed from: a */
        public static <RECEIVER extends C11501d, S extends C11670t, A> C7321c m33916a(C11502e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super RECEIVER, ? super A, C7581n> mVar) {
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(vVar, "config");
            C7573i.m23587b(mVar, "subscriber");
            C11669s b = eVar.mo29067b();
            C0043i d = eVar.mo29060a().mo29173d();
            C11672v a = C11640h.m34111a(eVar, vVar);
            C11505b bVar = new C11505b(b, eVar, jediViewModel, lVar, vVar, mVar);
            return C11640h.m34113a(jediViewModel, d, lVar, a, bVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends C11501d, S extends C11670t, A, B> C7321c m33920a(C11502e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super RECEIVER, ? super A, ? super B, C7581n> qVar) {
            C11672v<C11676z<A, B>> vVar2 = vVar;
            JediViewModel<S> jediViewModel2 = jediViewModel;
            C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
            C7573i.m23587b(lVar, "prop1");
            C7573i.m23587b(lVar2, "prop2");
            C7573i.m23587b(vVar2, "config");
            C48006q<? super RECEIVER, ? super A, ? super B, C7581n> qVar2 = qVar;
            C7573i.m23587b(qVar2, "subscriber");
            C11669s b = eVar.mo29067b();
            C0043i d = eVar.mo29060a().mo29173d();
            C11502e<? extends RECEIVER> eVar2 = eVar;
            C11672v a = C11640h.m34111a(eVar, vVar2);
            C11506c cVar = new C11506c(b, eVar2, jediViewModel, lVar, lVar2, vVar2, qVar2);
            return C11640h.m34114a(jediViewModel, d, lVar, lVar2, a, cVar);
        }

        /* renamed from: a */
        public static <RECEIVER extends C11501d, S extends C11670t, T> C7321c m33918a(C11502e<? extends RECEIVER> eVar, JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super RECEIVER, ? super Throwable, C7581n> mVar, C7562b<? super RECEIVER, C7581n> bVar, C7563m<? super RECEIVER, ? super T, C7581n> mVar2) {
            JediViewModel<S> jediViewModel2 = jediViewModel;
            C7599l<S, ? extends C11491a<? extends T>> lVar2 = lVar;
            C11672v<C11675y<C11491a<T>>> vVar2 = vVar;
            C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
            C7573i.m23587b(lVar2, "prop");
            C7573i.m23587b(vVar2, "config");
            C11669s b = eVar.mo29067b();
            C0043i d = eVar.mo29060a().mo29173d();
            C11502e<? extends RECEIVER> eVar2 = eVar;
            C11672v a = C11640h.m34111a(eVar, vVar2);
            C11504a aVar = new C11504a(b, eVar2, jediViewModel, lVar, vVar2, bVar, mVar, mVar2);
            return C11640h.m34113a(jediViewModel, d, lVar2, a, aVar);
        }

        /* renamed from: a */
        public static /* synthetic */ C7321c m33919a(C11502e eVar, JediViewModel jediViewModel, C7599l lVar, C11672v vVar, C7563m mVar, C7562b bVar, C7563m mVar2, int i, Object obj) {
            C7563m mVar3;
            C7562b bVar2;
            C7563m mVar4;
            if ((i & 2) != 0) {
                vVar = C11640h.m34110a();
            }
            C11672v vVar2 = vVar;
            if ((i & 4) != 0) {
                mVar3 = null;
            } else {
                mVar3 = mVar;
            }
            if ((i & 8) != 0) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
            if ((i & 16) != 0) {
                mVar4 = null;
            } else {
                mVar4 = mVar2;
            }
            return eVar.mo29063a(jediViewModel, lVar, vVar2, mVar3, bVar2, mVar4);
        }
    }

    /* renamed from: a */
    C11648k mo29060a();

    /* renamed from: a */
    <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super RECEIVER, ? super S, C7581n> mVar);

    /* renamed from: a */
    <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super RECEIVER, ? super A, C7581n> mVar);

    /* renamed from: a */
    <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super RECEIVER, ? super Throwable, C7581n> mVar, C7562b<? super RECEIVER, C7581n> bVar, C7563m<? super RECEIVER, ? super T, C7581n> mVar2);

    /* renamed from: a */
    <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super RECEIVER, ? super A, ? super B, C7581n> qVar);

    /* renamed from: a */
    <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super RECEIVER, ? super A, ? super B, ? super C, ? super D, C7581n> sVar);

    /* renamed from: a */
    <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar);

    /* renamed from: b */
    C11669s<RECEIVER> mo29067b();

    /* renamed from: c */
    boolean mo29068c();
}
