package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11649l;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.IListState;
import com.bytedance.jedi.arch.ext.list.differ.C11559a;
import com.bytedance.jedi.arch.ext.list.differ.C11567e.C11569b;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7492s;

public abstract class ListViewModel<T, P extends C11583n, S extends IListState<T, P>> extends JediViewModel<S> implements C11569b {

    /* renamed from: c */
    public final C7563m<List<? extends T>, List<? extends T>, List<T>> f31195c = C11580m.m34045a();

    /* renamed from: d */
    private final C7562b<S, C7492s<Pair<List<T>, P>>> f31196d;

    /* renamed from: e */
    private final C7563m<List<? extends T>, List<? extends T>, List<T>> f31197e = C11580m.m34046b();

    /* renamed from: f */
    private final C7541d<C115461> f31198f = C7546e.m23569a(new C11545c(this));

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$a */
    static final class C11541a extends Lambda implements C7562b<S, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f31199a;

        /* renamed from: b */
        final /* synthetic */ C7562b f31200b;

        /* renamed from: c */
        final /* synthetic */ C7563m f31201c;

        C11541a(ListViewModel listViewModel, C7562b bVar, C7563m mVar) {
            this.f31199a = listViewModel;
            this.f31200b = bVar;
            this.f31201c = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m33991a((IListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33991a(S s) {
            C7573i.m23587b(s, "rawState");
            ListState listState = (ListState) s.getSubstate();
            if (listState.getHasMore().f31214a && !(listState.getLoadMore() instanceof C11649l)) {
                this.f31199a.mo29031a((C7492s) this.f31200b.invoke(s), (C7563m<? super S, ? super C11491a<? extends T>, ? extends S>) new C7563m<S, C11491a<? extends Pair<? extends List<? extends T>, ? extends P>>, S>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11541a f31202a;

                    {
                        this.f31202a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0068, code lost:
                        if (r2 == null) goto L_0x006a;
                     */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public S invoke(S r13, com.bytedance.jedi.arch.C11491a<? extends kotlin.Pair<? extends java.util.List<? extends T>, ? extends P>> r14) {
                        /*
                            r12 = this;
                            java.lang.String r0 = "$receiver"
                            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
                            java.lang.String r0 = "loadMore"
                            kotlin.jvm.internal.C7573i.m23587b(r14, r0)
                            java.lang.Object r0 = r14.mo29046a()
                            kotlin.Pair r0 = (kotlin.Pair) r0
                            if (r0 == 0) goto L_0x0099
                            java.lang.Object r1 = r0.component1()
                            java.util.List r1 = (java.util.List) r1
                            java.lang.Object r0 = r0.component2()
                            r3 = r0
                            com.bytedance.jedi.arch.ext.list.n r3 = (com.bytedance.jedi.arch.ext.list.C11583n) r3
                            com.bytedance.jedi.arch.ext.list.ListViewModel$a r0 = r12.f31202a
                            com.bytedance.jedi.arch.ext.list.ListViewModel r0 = r0.f31199a
                            int r2 = r1.size()
                            r4 = 0
                            r0.mo29114a(r2, r4)
                            com.bytedance.jedi.arch.ext.list.ListViewModel$a r0 = r12.f31202a
                            kotlin.jvm.a.m r0 = r0.f31201c
                            com.bytedance.jedi.arch.t r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            java.util.List r2 = r2.getList()
                            java.lang.Object r0 = r0.invoke(r2, r1)
                            java.util.List r0 = (java.util.List) r0
                            com.bytedance.jedi.arch.t r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            com.bytedance.jedi.arch.ext.list.b r10 = com.bytedance.jedi.arch.ext.list.ListViewModel.m33981a(r2, r0)
                            if (r3 == 0) goto L_0x006a
                            com.bytedance.jedi.arch.t r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            com.bytedance.jedi.arch.x r4 = new com.bytedance.jedi.arch.x
                            r4.<init>(r1)
                            r6 = r4
                            com.bytedance.jedi.arch.a r6 = (com.bytedance.jedi.arch.C11491a) r6
                            r5 = 0
                            r8 = 4
                            r9 = 0
                            r4 = r0
                            r7 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
                            com.bytedance.jedi.arch.t r2 = (com.bytedance.jedi.arch.C11670t) r2
                            com.bytedance.jedi.arch.NestedState r2 = r13.newSubstate(r2)
                            if (r2 != 0) goto L_0x008a
                        L_0x006a:
                            com.bytedance.jedi.arch.t r2 = r13.getSubstate()
                            r4 = r2
                            com.bytedance.jedi.arch.ext.list.ListState r4 = (com.bytedance.jedi.arch.ext.list.ListState) r4
                            r5 = 0
                            r7 = 0
                            com.bytedance.jedi.arch.x r2 = new com.bytedance.jedi.arch.x
                            r2.<init>(r1)
                            r8 = r2
                            com.bytedance.jedi.arch.a r8 = (com.bytedance.jedi.arch.C11491a) r8
                            r1 = 5
                            r11 = 0
                            r6 = r0
                            r9 = r10
                            r10 = r1
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11)
                            com.bytedance.jedi.arch.t r0 = (com.bytedance.jedi.arch.C11670t) r0
                            com.bytedance.jedi.arch.NestedState r2 = r13.newSubstate(r0)
                        L_0x008a:
                            if (r2 == 0) goto L_0x0091
                            com.bytedance.jedi.arch.ext.list.IListState r2 = (com.bytedance.jedi.arch.ext.list.IListState) r2
                            if (r2 != 0) goto L_0x00f1
                            goto L_0x0099
                        L_0x0091:
                            kotlin.TypeCastException r13 = new kotlin.TypeCastException
                            java.lang.String r14 = "null cannot be cast to non-null type S"
                            r13.<init>(r14)
                            throw r13
                        L_0x0099:
                            boolean r0 = r14 instanceof com.bytedance.jedi.arch.C11500c
                            if (r0 == 0) goto L_0x00cc
                            com.bytedance.jedi.arch.ext.list.ListViewModel$a r0 = r12.f31202a
                            com.bytedance.jedi.arch.ext.list.ListViewModel r0 = r0.f31199a
                            r1 = 0
                            com.bytedance.jedi.arch.c r14 = (com.bytedance.jedi.arch.C11500c) r14
                            java.lang.Throwable r2 = r14.f31096a
                            r0.mo29114a(r1, r2)
                            com.bytedance.jedi.arch.t r0 = r13.getSubstate()
                            r1 = r0
                            com.bytedance.jedi.arch.ext.list.ListState r1 = (com.bytedance.jedi.arch.ext.list.ListState) r1
                            r2 = 0
                            r3 = 0
                            r4 = 0
                            com.bytedance.jedi.arch.c r0 = new com.bytedance.jedi.arch.c
                            java.lang.Throwable r14 = r14.f31096a
                            r0.<init>(r14)
                            r5 = r0
                            com.bytedance.jedi.arch.a r5 = (com.bytedance.jedi.arch.C11491a) r5
                            r6 = 0
                            r7 = 23
                            r8 = 0
                            com.bytedance.jedi.arch.ext.list.ListState r14 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                            com.bytedance.jedi.arch.t r14 = (com.bytedance.jedi.arch.C11670t) r14
                            com.bytedance.jedi.arch.NestedState r13 = r13.newSubstate(r14)
                            goto L_0x00ec
                        L_0x00cc:
                            com.bytedance.jedi.arch.t r14 = r13.getSubstate()
                            r0 = r14
                            com.bytedance.jedi.arch.ext.list.ListState r0 = (com.bytedance.jedi.arch.ext.list.ListState) r0
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
                            com.bytedance.jedi.arch.ext.list.ListState r14 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                            com.bytedance.jedi.arch.t r14 = (com.bytedance.jedi.arch.C11670t) r14
                            com.bytedance.jedi.arch.NestedState r13 = r13.newSubstate(r14)
                        L_0x00ec:
                            if (r13 == 0) goto L_0x00f2
                            r2 = r13
                            com.bytedance.jedi.arch.ext.list.IListState r2 = (com.bytedance.jedi.arch.ext.list.IListState) r2
                        L_0x00f1:
                            return r2
                        L_0x00f2:
                            kotlin.TypeCastException r13 = new kotlin.TypeCastException
                            java.lang.String r14 = "null cannot be cast to non-null type S"
                            r13.<init>(r14)
                            throw r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListViewModel.C11541a.C115421.invoke(com.bytedance.jedi.arch.ext.list.IListState, com.bytedance.jedi.arch.a):com.bytedance.jedi.arch.ext.list.IListState");
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$b */
    static final class C11543b extends Lambda implements C7562b<S, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f31203a;

        /* renamed from: b */
        final /* synthetic */ C7562b f31204b;

        /* renamed from: c */
        final /* synthetic */ C7563m f31205c;

        C11543b(ListViewModel listViewModel, C7562b bVar, C7563m mVar) {
            this.f31203a = listViewModel;
            this.f31204b = bVar;
            this.f31205c = mVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m33993a((IListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m33993a(S s) {
            C7573i.m23587b(s, "rawState");
            if (!(((ListState) s.getSubstate()).getRefresh() instanceof C11649l)) {
                this.f31203a.mo29031a((C7492s) this.f31204b.invoke(s), (C7563m<? super S, ? super C11491a<? extends T>, ? extends S>) new C7563m<S, C11491a<? extends Pair<? extends List<? extends T>, ? extends P>>, S>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11543b f31206a;

                    {
                        this.f31206a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* JADX WARNING: Code restructure failed: missing block: B:5:0x005d, code lost:
                        if (r2 == null) goto L_0x005f;
                     */
                    /* renamed from: a */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public S invoke(S r13, com.bytedance.jedi.arch.C11491a<? extends kotlin.Pair<? extends java.util.List<? extends T>, ? extends P>> r14) {
                        /*
                            r12 = this;
                            java.lang.String r0 = "$receiver"
                            kotlin.jvm.internal.C7573i.m23587b(r13, r0)
                            java.lang.String r0 = "refresh"
                            kotlin.jvm.internal.C7573i.m23587b(r14, r0)
                            java.lang.Object r0 = r14.mo29046a()
                            kotlin.Pair r0 = (kotlin.Pair) r0
                            if (r0 == 0) goto L_0x008f
                            java.lang.Object r1 = r0.component1()
                            java.util.List r1 = (java.util.List) r1
                            java.lang.Object r0 = r0.component2()
                            r3 = r0
                            com.bytedance.jedi.arch.ext.list.n r3 = (com.bytedance.jedi.arch.ext.list.C11583n) r3
                            com.bytedance.jedi.arch.ext.list.ListViewModel$b r0 = r12.f31206a
                            kotlin.jvm.a.m r0 = r0.f31205c
                            com.bytedance.jedi.arch.t r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            java.util.List r2 = r2.getList()
                            java.lang.Object r0 = r0.invoke(r2, r1)
                            java.util.List r0 = (java.util.List) r0
                            com.bytedance.jedi.arch.t r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            com.bytedance.jedi.arch.ext.list.b r10 = com.bytedance.jedi.arch.ext.list.ListViewModel.m33981a(r2, r0)
                            if (r3 == 0) goto L_0x005f
                            com.bytedance.jedi.arch.t r2 = r13.getSubstate()
                            com.bytedance.jedi.arch.ext.list.ListState r2 = (com.bytedance.jedi.arch.ext.list.ListState) r2
                            com.bytedance.jedi.arch.x r4 = new com.bytedance.jedi.arch.x
                            r4.<init>(r1)
                            r5 = r4
                            com.bytedance.jedi.arch.a r5 = (com.bytedance.jedi.arch.C11491a) r5
                            r6 = 0
                            r8 = 8
                            r9 = 0
                            r4 = r0
                            r7 = r10
                            com.bytedance.jedi.arch.ext.list.ListState r2 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r2, r3, r4, r5, r6, r7, r8, r9)
                            com.bytedance.jedi.arch.t r2 = (com.bytedance.jedi.arch.C11670t) r2
                            com.bytedance.jedi.arch.NestedState r2 = r13.newSubstate(r2)
                            if (r2 != 0) goto L_0x0080
                        L_0x005f:
                            com.bytedance.jedi.arch.t r2 = r13.getSubstate()
                            r4 = r2
                            com.bytedance.jedi.arch.ext.list.ListState r4 = (com.bytedance.jedi.arch.ext.list.ListState) r4
                            r5 = 0
                            com.bytedance.jedi.arch.x r2 = new com.bytedance.jedi.arch.x
                            r2.<init>(r1)
                            r7 = r2
                            com.bytedance.jedi.arch.a r7 = (com.bytedance.jedi.arch.C11491a) r7
                            r8 = 0
                            r1 = 9
                            r11 = 0
                            r6 = r0
                            r9 = r10
                            r10 = r1
                            com.bytedance.jedi.arch.ext.list.ListState r0 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r4, r5, r6, r7, r8, r9, r10, r11)
                            com.bytedance.jedi.arch.t r0 = (com.bytedance.jedi.arch.C11670t) r0
                            com.bytedance.jedi.arch.NestedState r2 = r13.newSubstate(r0)
                        L_0x0080:
                            if (r2 == 0) goto L_0x0087
                            com.bytedance.jedi.arch.ext.list.IListState r2 = (com.bytedance.jedi.arch.ext.list.IListState) r2
                            if (r2 != 0) goto L_0x00dd
                            goto L_0x008f
                        L_0x0087:
                            kotlin.TypeCastException r13 = new kotlin.TypeCastException
                            java.lang.String r14 = "null cannot be cast to non-null type S"
                            r13.<init>(r14)
                            throw r13
                        L_0x008f:
                            boolean r0 = r14 instanceof com.bytedance.jedi.arch.C11500c
                            if (r0 == 0) goto L_0x00b8
                            com.bytedance.jedi.arch.t r0 = r13.getSubstate()
                            r1 = r0
                            com.bytedance.jedi.arch.ext.list.ListState r1 = (com.bytedance.jedi.arch.ext.list.ListState) r1
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
                            com.bytedance.jedi.arch.ext.list.ListState r14 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r1, r2, r3, r4, r5, r6, r7, r8)
                            com.bytedance.jedi.arch.t r14 = (com.bytedance.jedi.arch.C11670t) r14
                            com.bytedance.jedi.arch.NestedState r13 = r13.newSubstate(r14)
                            goto L_0x00d8
                        L_0x00b8:
                            com.bytedance.jedi.arch.t r14 = r13.getSubstate()
                            r0 = r14
                            com.bytedance.jedi.arch.ext.list.ListState r0 = (com.bytedance.jedi.arch.ext.list.ListState) r0
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
                            com.bytedance.jedi.arch.ext.list.ListState r14 = com.bytedance.jedi.arch.ext.list.ListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7)
                            com.bytedance.jedi.arch.t r14 = (com.bytedance.jedi.arch.C11670t) r14
                            com.bytedance.jedi.arch.NestedState r13 = r13.newSubstate(r14)
                        L_0x00d8:
                            if (r13 == 0) goto L_0x00de
                            r2 = r13
                            com.bytedance.jedi.arch.ext.list.IListState r2 = (com.bytedance.jedi.arch.ext.list.IListState) r2
                        L_0x00dd:
                            return r2
                        L_0x00de:
                            kotlin.TypeCastException r13 = new kotlin.TypeCastException
                            java.lang.String r14 = "null cannot be cast to non-null type S"
                            r13.<init>(r14)
                            throw r13
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.arch.ext.list.ListViewModel.C11543b.C115441.invoke(com.bytedance.jedi.arch.ext.list.IListState, com.bytedance.jedi.arch.a):com.bytedance.jedi.arch.ext.list.IListState");
                    }
                });
            }
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$c */
    static final class C11545c extends Lambda implements C7561a<C115461> {

        /* renamed from: a */
        final /* synthetic */ ListViewModel f31207a;

        C11545c(ListViewModel listViewModel) {
            this.f31207a = listViewModel;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C115461 invoke() {
            return new C11559a(this) {

                /* renamed from: a */
                final /* synthetic */ C11545c f31208a;

                /* renamed from: com.bytedance.jedi.arch.ext.list.ListViewModel$c$1$a */
                static final class C11547a extends Lambda implements C7562b<S, C7581n> {

                    /* renamed from: a */
                    final /* synthetic */ C7562b f31209a;

                    C11547a(C7562b bVar) {
                        this.f31209a = bVar;
                        super(1);
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m33998a((IListState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m33998a(S s) {
                        C7573i.m23587b(s, "it");
                        if (((ListState) s.getSubstate()).getHasMore().f31214a) {
                            this.f31209a.invoke(Integer.valueOf(((ListState) s.getSubstate()).getList().size()));
                        }
                    }
                }

                /* renamed from: a */
                public final void mo29086a() {
                    this.f31208a.f31207a.mo29117l();
                }

                {
                    this.f31208a = r1;
                }

                /* renamed from: a */
                public final void mo29087a(C7562b<? super Integer, C7581n> bVar) {
                    C7573i.m23587b(bVar, "itemCountSupplier");
                    this.f31208a.f31207a.mo29036b(new C11547a(bVar));
                }
            };
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract C7562b<S, C7492s<Pair<List<T>, P>>> mo29071h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C7562b<S, C7492s<Pair<List<T>, P>>> mo29072i() {
        return this.f31196d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C7563m<List<? extends T>, List<? extends T>, List<T>> mo29115j() {
        return this.f31197e;
    }

    /* renamed from: k */
    public final void mo29116k() {
        m33982a(this.f31195c, mo29071h());
    }

    /* renamed from: l */
    public final void mo29117l() {
        C7562b i = mo29072i();
        if (i != null) {
            m33983b(mo29115j(), i);
        }
    }

    /* renamed from: b */
    public final void mo29083b(int i) {
        ((C115461) this.f31198f.getValue()).mo29083b(i);
    }

    /* renamed from: a */
    public static C11556b m33981a(ListState<T, P> listState, List<? extends T> list) {
        boolean isEmpty = list.isEmpty();
        if (isEmpty == listState.isEmpty().f31214a) {
            return listState.isEmpty();
        }
        return new C11556b(isEmpty);
    }

    /* renamed from: b */
    private void m33983b(C7563m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar, C7562b<? super S, ? extends C7492s<Pair<List<T>, P>>> bVar) {
        C7573i.m23587b(mVar, "loadMoreStrategy");
        C7573i.m23587b(bVar, "loadMoreCall");
        mo29036b(new C11541a(this, bVar, mVar));
    }

    /* renamed from: a */
    private void m33982a(C7563m<? super List<? extends T>, ? super List<? extends T>, ? extends List<? extends T>> mVar, C7562b<? super S, ? extends C7492s<Pair<List<T>, P>>> bVar) {
        C7573i.m23587b(mVar, "refreshStrategy");
        C7573i.m23587b(bVar, "refreshCall");
        mo29036b(new C11543b(this, bVar, mVar));
    }

    /* renamed from: a */
    public final void mo29114a(int i, Throwable th) {
        C7541d<C115461> dVar = this.f31198f;
        if (dVar.isInitialized()) {
            ((C115461) dVar.getValue()).mo29141a(i, th);
        }
    }
}
