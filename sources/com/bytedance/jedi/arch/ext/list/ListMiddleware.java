package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11649l;
import com.bytedance.jedi.arch.C11650m;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.differ.C11559a;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.Collection;
import java.util.List;
import kotlin.C48020o;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7599l;
import p346io.reactivex.C7492s;

public final class ListMiddleware<S extends C11670t, T, P extends C11583n> extends C11650m<S, ListState<T, P>> implements C11569b {

    /* renamed from: d */
    private final C7541d<C115191> f31135d;

    /* renamed from: e */
    private final C7562b<S, C7492s<Pair<List<T>, P>>> f31136e;

    /* renamed from: f */
    private final C7562b<S, C7492s<Pair<List<T>, P>>> f31137f;

    /* renamed from: g */
    private final C7563m<List<? extends T>, List<? extends T>, List<T>> f31138g;

    /* renamed from: h */
    private final C7563m<List<? extends T>, List<? extends T>, List<T>> f31139h;

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$a */
    static final class C11511a extends Lambda implements C7563m<S, ListState<T, P>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31140a;

        /* renamed from: b */
        final /* synthetic */ C7562b f31141b;

        /* renamed from: c */
        final /* synthetic */ C7563m f31142c;

        C11511a(ListMiddleware listMiddleware, C7562b bVar, C7563m mVar) {
            this.f31140a = listMiddleware;
            this.f31141b = bVar;
            this.f31142c = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33950a((C11670t) obj, (ListState) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33950a(S s, ListState<T, P> listState) {
            C7573i.m23587b(s, "state");
            C7573i.m23587b(listState, "substate");
            if (listState.getHasMore().f31214a && !(listState.getLoadMore() instanceof C11649l)) {
                this.f31140a.mo29181a((C7492s) this.f31141b.invoke(s), (C7563m<? super PROP, ? super C11491a<? extends T>, ? extends PROP>) new C7563m<ListState<T, P>, C11491a<? extends Pair<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11511a f31143a;

                    {
                        this.f31143a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0051, code lost:
                        if (r2 == null) goto L_0x0053;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0067, code lost:
                        if (r2 == null) goto L_0x0069;
                     */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public com.bytedance.jedi.arch.ext.list.ListState<T, P> invoke(com.bytedance.jedi.arch.ext.list.ListState<T, P> r13, com.bytedance.jedi.arch.C11491a<? extends kotlin.Pair<? extends java.util.List<? extends T>, ? extends P>> r14) {
                        /*
                            r12 = this;
                            java.lang.String r0 = "$receiver"
                            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
                            java.lang.String r0 = "loadMore"
                            kotlin.jvm.internal.C7573i.m23587b(r14, r0)
                            java.lang.Object r0 = r14.mo29046a()
                            kotlin.Pair r0 = (kotlin.Pair) r0
                            if (r0 == 0) goto L_0x0069
                            java.lang.Object r1 = r0.component1()
                            java.util.List r1 = (java.util.List) r1
                            java.lang.Object r0 = r0.component2()
                            r3 = r0
                            com.bytedance.jedi.arch.ext.list.n r3 = (com.bytedance.jedi.arch.ext.list.C11583n) r3
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$a r0 = r12.f31143a
                            com.bytedance.jedi.arch.ext.list.ListMiddleware r0 = r0.f31140a
                            int r2 = r1.size()
                            r4 = 0
                            r0.mo29079a(r2, r4)
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$a r0 = r12.f31143a
                            kotlin.jvm.a.m r0 = r0.f31142c
                            java.util.List r2 = r13.getList()
                            java.lang.Object r0 = r0.invoke(r2, r1)
                            java.util.List r0 = (java.util.List) r0
                            com.bytedance.jedi.arch.ext.list.b r10 = com.bytedance.jedi.arch.ext.list.ListMiddleware.m33936a(r13, r0)
                            if (r3 == 0) goto L_0x0053
                            com.bytedance.jedi.arch.x r2 = new com.bytedance.jedi.arch.x
                            r2.<init>(r1)
                            r6 = r2
                            com.bytedance.jedi.arch.a r6 = (com.bytedance.jedi.arch.C11491a) r6
                            r5 = 0
                            r8 = 4
                            r9 = 0
                            r2 = r13
                            r4 = r0
                            r7 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
                            if (r2 != 0) goto L_0x0067
                        L_0x0053:
                            r5 = 0
                            r7 = 0
                            com.bytedance.jedi.arch.x r2 = new com.bytedance.jedi.arch.x
                            r2.<init>(r1)
                            r8 = r2
                            com.bytedance.jedi.arch.a r8 = (com.bytedance.jedi.arch.C11491a) r8
                            r1 = 5
                            r11 = 0
                            r4 = r13
                            r6 = r0
                            r9 = r10
                            r10 = r1
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11)
                        L_0x0067:
                            if (r2 != 0) goto L_0x00a4
                        L_0x0069:
                            boolean r0 = r14 instanceof com.bytedance.jedi.arch.C11500c
                            if (r0 == 0) goto L_0x0090
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$a r0 = r12.f31143a
                            com.bytedance.jedi.arch.ext.list.ListMiddleware r0 = r0.f31140a
                            r1 = 0
                            com.bytedance.jedi.arch.c r14 = (com.bytedance.jedi.arch.C11500c) r14
                            java.lang.Throwable r2 = r14.f31096a
                            r0.mo29079a(r1, r2)
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            com.bytedance.jedi.arch.c r0 = new com.bytedance.jedi.arch.c
                            java.lang.Throwable r14 = r14.f31096a
                            r0.<init>(r14)
                            r7 = r0
                            com.bytedance.jedi.arch.a r7 = (com.bytedance.jedi.arch.C11491a) r7
                            r8 = 0
                            r9 = 23
                            r10 = 0
                            r3 = r13
                            com.bytedance.jedi.arch.ext.list.ListState r13 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10)
                            return r13
                        L_0x0090:
                            r1 = 0
                            r2 = 0
                            r3 = 0
                            com.bytedance.jedi.arch.l r14 = new com.bytedance.jedi.arch.l
                            r14.<init>()
                            r4 = r14
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.C11491a) r4
                            r5 = 0
                            r6 = 23
                            r7 = 0
                            r0 = r13
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                        L_0x00a4:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListMiddleware.C11511a.C115121.invoke(com.bytedance.jedi.arch.ext.list.ListState, com.bytedance.jedi.arch.a):com.bytedance.jedi.arch.ext.list.ListState");
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$b */
    static final class C11513b extends Lambda implements C7563m<S, ListState<T, P>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31144a;

        /* renamed from: b */
        final /* synthetic */ C7562b f31145b;

        /* renamed from: c */
        final /* synthetic */ C7563m f31146c;

        C11513b(ListMiddleware listMiddleware, C7562b bVar, C7563m mVar) {
            this.f31144a = listMiddleware;
            this.f31145b = bVar;
            this.f31146c = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33952a((C11670t) obj, (ListState) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33952a(S s, ListState<T, P> listState) {
            C7573i.m23587b(s, "state");
            C7573i.m23587b(listState, "substate");
            if (!(listState.getRefresh() instanceof C11649l)) {
                this.f31144a.mo29181a((C7492s) this.f31145b.invoke(s), (C7563m<? super PROP, ? super C11491a<? extends T>, ? extends PROP>) new C7563m<ListState<T, P>, C11491a<? extends Pair<? extends List<? extends T>, ? extends P>>, ListState<T, P>>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11513b f31147a;

                    {
                        this.f31147a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0046, code lost:
                        if (r2 == null) goto L_0x0048;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005d, code lost:
                        if (r2 == null) goto L_0x005f;
                     */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public com.bytedance.jedi.arch.ext.list.ListState<T, P> invoke(com.bytedance.jedi.arch.ext.list.ListState<T, P> r13, com.bytedance.jedi.arch.C11491a<? extends kotlin.Pair<? extends java.util.List<? extends T>, ? extends P>> r14) {
                        /*
                            r12 = this;
                            java.lang.String r0 = "$receiver"
                            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
                            java.lang.String r0 = "refresh"
                            kotlin.jvm.internal.C7573i.m23587b(r14, r0)
                            java.lang.Object r0 = r14.mo29046a()
                            kotlin.Pair r0 = (kotlin.Pair) r0
                            if (r0 == 0) goto L_0x005f
                            java.lang.Object r1 = r0.component1()
                            java.util.List r1 = (java.util.List) r1
                            java.lang.Object r0 = r0.component2()
                            r3 = r0
                            com.bytedance.jedi.arch.ext.list.n r3 = (com.bytedance.jedi.arch.ext.list.C11583n) r3
                            com.bytedance.jedi.arch.ext.list.ListMiddleware$b r0 = r12.f31147a
                            kotlin.jvm.a.m r0 = r0.f31146c
                            java.util.List r2 = r13.getList()
                            java.lang.Object r0 = r0.invoke(r2, r1)
                            java.util.List r0 = (java.util.List) r0
                            com.bytedance.jedi.arch.ext.list.b r10 = com.bytedance.jedi.arch.ext.list.ListMiddleware.m33936a(r13, r0)
                            if (r3 == 0) goto L_0x0048
                            com.bytedance.jedi.arch.x r2 = new com.bytedance.jedi.arch.x
                            r2.<init>(r1)
                            r5 = r2
                            com.bytedance.jedi.arch.a r5 = (com.bytedance.jedi.arch.C11491a) r5
                            r6 = 0
                            r8 = 8
                            r9 = 0
                            r2 = r13
                            r4 = r0
                            r7 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
                            if (r2 != 0) goto L_0x005d
                        L_0x0048:
                            r5 = 0
                            com.bytedance.jedi.arch.x r2 = new com.bytedance.jedi.arch.x
                            r2.<init>(r1)
                            r7 = r2
                            com.bytedance.jedi.arch.a r7 = (com.bytedance.jedi.arch.C11491a) r7
                            r8 = 0
                            r1 = 9
                            r11 = 0
                            r4 = r13
                            r6 = r0
                            r9 = r10
                            r10 = r1
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11)
                        L_0x005d:
                            if (r2 != 0) goto L_0x0090
                        L_0x005f:
                            boolean r0 = r14 instanceof com.bytedance.jedi.arch.C11500c
                            if (r0 == 0) goto L_0x007c
                            r2 = 0
                            r3 = 0
                            com.bytedance.jedi.arch.c r0 = new com.bytedance.jedi.arch.c
                            com.bytedance.jedi.arch.c r14 = (com.bytedance.jedi.arch.C11500c) r14
                            java.lang.Throwable r14 = r14.f31096a
                            r0.<init>(r14)
                            r4 = r0
                            com.bytedance.jedi.arch.a r4 = (com.bytedance.jedi.arch.C11491a) r4
                            r5 = 0
                            r6 = 0
                            r7 = 27
                            r8 = 0
                            r1 = r13
                            com.bytedance.jedi.arch.ext.list.ListState r13 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                            return r13
                        L_0x007c:
                            r1 = 0
                            r2 = 0
                            com.bytedance.jedi.arch.l r14 = new com.bytedance.jedi.arch.l
                            r14.<init>()
                            r3 = r14
                            com.bytedance.jedi.arch.a r3 = (com.bytedance.jedi.arch.C11491a) r3
                            r4 = 0
                            r5 = 0
                            r6 = 27
                            r7 = 0
                            r0 = r13
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                        L_0x0090:
                            return r2
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListMiddleware.C11513b.C115141.invoke(com.bytedance.jedi.arch.ext.list.ListState, com.bytedance.jedi.arch.a):com.bytedance.jedi.arch.ext.list.ListState");
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$c */
    static final class C11515c extends Lambda implements C7562b<ListState<T, P>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31148a;

        /* renamed from: b */
        final /* synthetic */ int f31149b;

        /* renamed from: c */
        final /* synthetic */ Object f31150c;

        C11515c(ListMiddleware listMiddleware, int i, Object obj) {
            this.f31148a = listMiddleware;
            this.f31149b = i;
            this.f31150c = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m33954a((ListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33954a(ListState<T, P> listState) {
            boolean z;
            C7573i.m23587b(listState, "it");
            if (this.f31149b < 0 || this.f31149b >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C48020o.f122844a || z) {
                List d = C7525m.m23509d((Collection<? extends T>) listState.getList());
                d.add(this.f31149b, this.f31150c);
                this.f31148a.mo29081a(d);
                return;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$d */
    static final class C11516d extends Lambda implements C7562b<ListState<T, P>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31151a;

        /* renamed from: b */
        final /* synthetic */ int f31152b;

        /* renamed from: c */
        final /* synthetic */ List f31153c;

        C11516d(ListMiddleware listMiddleware, int i, List list) {
            this.f31151a = listMiddleware;
            this.f31152b = i;
            this.f31153c = list;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m33955a((ListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33955a(ListState<T, P> listState) {
            boolean z;
            C7573i.m23587b(listState, "it");
            if (this.f31152b < 0 || this.f31152b >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C48020o.f122844a || z) {
                List d = C7525m.m23509d((Collection<? extends T>) listState.getList());
                d.addAll(this.f31152b, this.f31153c);
                this.f31151a.mo29081a(d);
                return;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$e */
    static final class C11517e extends Lambda implements C7562b<ListState<T, P>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31154a;

        /* renamed from: b */
        final /* synthetic */ int f31155b;

        /* renamed from: c */
        final /* synthetic */ Object f31156c;

        C11517e(ListMiddleware listMiddleware, int i, Object obj) {
            this.f31154a = listMiddleware;
            this.f31155b = i;
            this.f31156c = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m33956a((ListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33956a(ListState<T, P> listState) {
            boolean z;
            C7573i.m23587b(listState, "it");
            if (this.f31155b < 0 || this.f31155b >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C48020o.f122844a || z) {
                List d = C7525m.m23509d((Collection<? extends T>) listState.getList());
                d.set(this.f31155b, this.f31156c);
                this.f31154a.mo29081a(d);
                return;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$f */
    static final class C11518f extends Lambda implements C7561a<C115191> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31157a;

        C11518f(ListMiddleware listMiddleware) {
            this.f31157a = listMiddleware;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C115191 invoke() {
            return new C11559a(this) {

                /* renamed from: a */
                final /* synthetic */ C11518f f31158a;

                /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$f$1$a */
                static final class C11520a extends Lambda implements C7562b<ListState<T, P>, C7581n> {

                    /* renamed from: a */
                    final /* synthetic */ C7562b f31159a;

                    C11520a(C7562b bVar) {
                        this.f31159a = bVar;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m33960a((ListState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m33960a(ListState<T, P> listState) {
                        C7573i.m23587b(listState, "it");
                        if (listState.getHasMore().f31214a) {
                            this.f31159a.invoke(Integer.valueOf(listState.getList().size()));
                        }
                    }
                }

                /* renamed from: a */
                public final void mo29086a() {
                    this.f31158a.f31157a.mo29085c();
                }

                {
                    this.f31158a = r1;
                }

                /* renamed from: a */
                public final void mo29087a(C7562b<? super Integer, C7581n> bVar) {
                    C7573i.m23587b(bVar, "itemCountSupplier");
                    this.f31158a.f31157a.mo29184a((C7562b<? super PROP, C7581n>) new C11520a<Object,C7581n>(bVar));
                }
            };
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$g */
    static final class C11521g extends Lambda implements C7562b<ListState<T, P>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31160a;

        /* renamed from: b */
        final /* synthetic */ int f31161b;

        C11521g(ListMiddleware listMiddleware, int i) {
            this.f31160a = listMiddleware;
            this.f31161b = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m33961a((ListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33961a(ListState<T, P> listState) {
            boolean z;
            C7573i.m23587b(listState, "it");
            if (this.f31161b < 0 || this.f31161b >= listState.getList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (!C48020o.f122844a || z) {
                List d = C7525m.m23509d((Collection<? extends T>) listState.getList());
                d.remove(this.f31161b);
                this.f31160a.mo29081a(d);
                return;
            }
            throw new AssertionError("Assertion failed");
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$h */
    static final class C11522h extends Lambda implements C7563m<RECEIVER, List<? extends T>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11554a f31162a;

        /* renamed from: b */
        final /* synthetic */ ListMiddleware f31163b;

        /* renamed from: c */
        final /* synthetic */ C11502e f31164c;

        /* renamed from: d */
        final /* synthetic */ boolean f31165d;

        /* renamed from: e */
        final /* synthetic */ boolean f31166e;

        /* renamed from: f */
        final /* synthetic */ C7562b f31167f;

        C11522h(C11554a aVar, ListMiddleware listMiddleware, C11502e eVar, boolean z, boolean z2, C7562b bVar) {
            this.f31162a = aVar;
            this.f31163b = listMiddleware;
            this.f31164c = eVar;
            this.f31165d = z;
            this.f31166e = z2;
            this.f31167f = bVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33962a((C11501d) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33962a(final RECEIVER receiver, List<? extends T> list) {
            C7561a aVar;
            C7573i.m23587b(receiver, "$receiver");
            C7573i.m23587b(list, "it");
            C11554a aVar2 = this.f31162a;
            final C7562b bVar = this.f31167f;
            if (bVar != null) {
                aVar = new C7561a<C7581n>() {
                    /* renamed from: a */
                    private void m33963a() {
                        bVar.invoke(receiver);
                    }

                    public final /* synthetic */ Object invoke() {
                        m33963a();
                        return C7581n.f20898a;
                    }
                };
            } else {
                aVar = null;
            }
            aVar2.mo29136a(list, aVar);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$i */
    static final class C11524i extends Lambda implements C7563m<RECEIVER, P, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7563m f31170a;

        C11524i(C7563m mVar) {
            this.f31170a = mVar;
            super(2);
        }

        /* renamed from: a */
        private void m33964a(RECEIVER receiver, P p) {
            C7573i.m23587b(receiver, "$receiver");
            C7573i.m23587b(p, "it");
            this.f31170a.invoke(receiver, p);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33964a((C11501d) obj, (C11583n) obj2);
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$j */
    static final class C11525j extends Lambda implements C7563m<RECEIVER, C11556b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7563m f31171a;

        C11525j(C7563m mVar) {
            this.f31171a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33965a((C11501d) obj, (C11556b) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33965a(RECEIVER receiver, C11556b bVar) {
            C7573i.m23587b(receiver, "$receiver");
            C7573i.m23587b(bVar, "it");
            this.f31171a.invoke(receiver, Boolean.valueOf(bVar.f31214a));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$k */
    static final class C11526k extends Lambda implements C7563m<RECEIVER, C11556b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C7563m f31172a;

        C11526k(C7563m mVar) {
            this.f31172a = mVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33966a((C11501d) obj, (C11556b) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33966a(RECEIVER receiver, C11556b bVar) {
            C7573i.m23587b(receiver, "$receiver");
            C7573i.m23587b(bVar, "it");
            this.f31172a.invoke(receiver, Boolean.valueOf(bVar.f31214a));
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$l */
    static final class C11527l extends Lambda implements C7563m<RECEIVER, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11557c f31173a;

        C11527l(C11557c cVar) {
            this.f31173a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33967a((C11501d) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33967a(RECEIVER receiver, Throwable th) {
            C7573i.m23587b(receiver, "$receiver");
            C7573i.m23587b(th, "it");
            this.f31173a.mo29139b().invoke(receiver, th);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$m */
    static final class C11528m extends Lambda implements C7562b<RECEIVER, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11557c f31174a;

        C11528m(C11557c cVar) {
            this.f31174a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m33968a((C11501d) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33968a(RECEIVER receiver) {
            C7573i.m23587b(receiver, "$receiver");
            this.f31174a.mo29138a().invoke(receiver);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$n */
    static final class C11529n extends Lambda implements C7563m<RECEIVER, List<? extends T>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11557c f31175a;

        C11529n(C11557c cVar) {
            this.f31175a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33969a((C11501d) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33969a(RECEIVER receiver, List<? extends T> list) {
            C7573i.m23587b(receiver, "$receiver");
            C7573i.m23587b(list, "it");
            this.f31175a.mo29140c().invoke(receiver, list);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$o */
    static final class C11530o extends Lambda implements C7563m<RECEIVER, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11557c f31176a;

        C11530o(C11557c cVar) {
            this.f31176a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33970a((C11501d) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33970a(RECEIVER receiver, Throwable th) {
            C7573i.m23587b(receiver, "$receiver");
            C7573i.m23587b(th, "it");
            this.f31176a.mo29139b().invoke(receiver, th);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$p */
    static final class C11531p extends Lambda implements C7562b<RECEIVER, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11557c f31177a;

        C11531p(C11557c cVar) {
            this.f31177a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m33971a((C11501d) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33971a(RECEIVER receiver) {
            C7573i.m23587b(receiver, "$receiver");
            this.f31177a.mo29138a().invoke(receiver);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$q */
    static final class C11532q extends Lambda implements C7563m<RECEIVER, List<? extends T>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C11557c f31178a;

        C11532q(C11557c cVar) {
            this.f31178a = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m33972a((C11501d) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33972a(RECEIVER receiver, List<? extends T> list) {
            C7573i.m23587b(receiver, "$receiver");
            C7573i.m23587b(list, "it");
            this.f31178a.mo29140c().invoke(receiver, list);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListMiddleware$r */
    static final class C11533r extends Lambda implements C7562b<ListState<T, P>, ListState<T, P>> {

        /* renamed from: a */
        final /* synthetic */ ListMiddleware f31179a;

        /* renamed from: b */
        final /* synthetic */ List f31180b;

        C11533r(ListMiddleware listMiddleware, List list) {
            this.f31179a = listMiddleware;
            this.f31180b = list;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ListState<T, P> invoke(ListState<T, P> listState) {
            C7573i.m23587b(listState, "$receiver");
            return ListState.copy$default(listState, null, this.f31180b, null, null, ListMiddleware.m33936a(listState, this.f31180b), 13, null);
        }
    }

    /* renamed from: a */
    public final void mo29081a(List<? extends T> list) {
        C7573i.m23587b(list, "newList");
        mo29187b(new C11533r(this, list));
    }

    /* renamed from: b */
    public final void mo29082b() {
        m33939a(this.f31138g, this.f31136e);
    }

    /* renamed from: c */
    public final void mo29085c() {
        C7562b<S, C7492s<Pair<List<T>, P>>> bVar = this.f31137f;
        if (bVar != null) {
            m33940b(this.f31139h, bVar);
        }
    }

    /* renamed from: b */
    public final void mo29083b(int i) {
        ((C115191) this.f31135d.getValue()).mo29083b(i);
    }

    /* renamed from: a */
    public final void mo29077a(int i) {
        mo29184a((C7562b<? super PROP, C7581n>) new C11521g<Object,C7581n>(this, i));
    }

    /* renamed from: a */
    private final void m33939a(C7563m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar, C7562b<? super S, ? extends C7492s<Pair<List<T>, P>>> bVar) {
        mo29185a((C7563m<? super S, ? super PROP, C7581n>) new C11513b<Object,Object,C7581n>(this, bVar, mVar));
    }

    /* renamed from: b */
    private final void m33940b(C7563m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar, C7562b<? super S, ? extends C7492s<Pair<List<T>, P>>> bVar) {
        mo29185a((C7563m<? super S, ? super PROP, C7581n>) new C11511a<Object,Object,C7581n>(this, bVar, mVar));
    }

    /* renamed from: a */
    public static C11556b m33936a(ListState<T, P> listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().f31214a) {
            return listState.isEmpty();
        }
        return new C11556b(isEmpty);
    }

    /* renamed from: b */
    public final void mo29084b(int i, T t) {
        mo29184a((C7562b<? super PROP, C7581n>) new C11515c<Object,C7581n>(this, i, t));
    }

    /* renamed from: a */
    public final void mo29078a(int i, T t) {
        mo29184a((C7562b<? super PROP, C7581n>) new C11517e<Object,C7581n>(this, i, t));
    }

    /* renamed from: a */
    public final void mo29079a(int i, Throwable th) {
        C7541d<C115191> dVar = this.f31135d;
        if (dVar.isInitialized()) {
            ((C115191) dVar.getValue()).mo29141a(i, th);
        }
    }

    /* renamed from: a */
    public final void mo29080a(int i, List<? extends T> list) {
        C7573i.m23587b(list, "data");
        mo29184a((C7562b<? super PROP, C7581n>) new C11516d<Object,C7581n>(this, i, list));
    }

    public ListMiddleware(C7562b<? super S, ? extends C7492s<Pair<List<T>, P>>> bVar, C7562b<? super S, ? extends C7492s<Pair<List<T>, P>>> bVar2, C7563m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar, C7563m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar2) {
        C7573i.m23587b(bVar, "actualRefresh");
        C7573i.m23587b(mVar, "refreshStrategy");
        C7573i.m23587b(mVar2, "loadMoreStrategy");
        this.f31136e = bVar;
        this.f31137f = bVar2;
        this.f31138g = mVar;
        this.f31139h = mVar2;
        this.f31135d = C7546e.m23569a(new C11518f(this));
    }

    public /* synthetic */ ListMiddleware(C7562b bVar, C7562b bVar2, C7563m mVar, C7563m mVar2, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            bVar2 = null;
        }
        if ((i & 4) != 0) {
            mVar = C11580m.m34045a();
        }
        if ((i & 8) != 0) {
            mVar2 = C11580m.m34046b();
        }
        this(bVar, bVar2, mVar, mVar2);
    }

    /* renamed from: a */
    private <RECEIVER extends C11501d> void m33937a(C11502e<? extends RECEIVER> eVar, C11554a<T> aVar, boolean z, boolean z2, C11557c<T, RECEIVER> cVar, C11557c<T, RECEIVER> cVar2, C7563m<? super RECEIVER, ? super Boolean, C7581n> mVar, C7563m<? super RECEIVER, ? super Boolean, C7581n> mVar2, C7562b<? super RECEIVER, C7581n> bVar, C7563m<? super RECEIVER, ? super P, C7581n> mVar3) {
        C11557c<T, RECEIVER> cVar3 = cVar;
        C11557c<T, RECEIVER> cVar4 = cVar2;
        C7563m<? super RECEIVER, ? super Boolean, C7581n> mVar4 = mVar;
        C7563m<? super RECEIVER, ? super Boolean, C7581n> mVar5 = mVar2;
        C7563m<? super RECEIVER, ? super P, C7581n> mVar6 = mVar3;
        C7573i.m23587b(eVar, "subscriber");
        if (mVar6 != null) {
            mo29179a(eVar, C11572e.f31246a, z2, z, new C11524i(mVar6));
        }
        if (mVar4 != null) {
            mo29179a(eVar, C11573f.f31247a, z2, z, new C11525j(mVar4));
        }
        if (mVar5 != null) {
            mo29179a(eVar, C11574g.f31248a, z2, z, new C11526k(mVar5));
        }
        if (cVar3 != null) {
            mo29180a(eVar, C11575h.f31249a, z2, z, new C11527l(cVar3), new C11528m(cVar3), new C11529n(cVar3));
        }
        if (cVar4 != null) {
            mo29180a(eVar, C11576i.f31250a, z2, z, new C11530o(cVar4), new C11531p(cVar4), new C11532q(cVar4));
        }
        if (aVar != null) {
            C7599l lVar = C11577j.f31251a;
            C11522h hVar = new C11522h(aVar, this, eVar, z2, z, bVar);
            mo29179a(eVar, lVar, z2, z, hVar);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m33938a(ListMiddleware listMiddleware, C11502e eVar, C11554a aVar, boolean z, boolean z2, C11557c cVar, C11557c cVar2, C7563m mVar, C7563m mVar2, C7562b bVar, C7563m mVar3, int i, Object obj) {
        C11554a aVar2;
        boolean z3;
        C11557c cVar3;
        C11557c cVar4;
        C7563m mVar4;
        int i2 = i;
        C7563m mVar5 = null;
        if ((i2 & 2) != 0) {
            aVar2 = null;
        } else {
            aVar2 = aVar;
        }
        if ((i2 & 8) != 0) {
            z3 = eVar.mo29068c();
        } else {
            z3 = z2;
        }
        if ((i2 & 16) != 0) {
            cVar3 = null;
        } else {
            cVar3 = cVar;
        }
        if ((i2 & 32) != 0) {
            cVar4 = null;
        } else {
            cVar4 = cVar2;
        }
        if ((i2 & 64) != 0) {
            mVar4 = null;
        } else {
            mVar4 = mVar;
        }
        if ((i2 & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
            mVar5 = mVar2;
        }
        listMiddleware.m33937a(eVar, aVar2, false, z3, cVar3, cVar4, mVar4, mVar5, null, null);
    }
}
