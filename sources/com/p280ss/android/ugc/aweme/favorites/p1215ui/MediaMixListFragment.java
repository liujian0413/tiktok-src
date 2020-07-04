package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11497af;
import com.bytedance.jedi.arch.C11502e;
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
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.arch.C23273a;
import com.p280ss.android.ugc.aweme.base.arch.C23274b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.favorites.adapter.MediaMixListAdapter;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixListViewModel;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment */
public final class MediaMixListFragment extends BaseCollectListFragment implements C11497af<C23274b>, C11592h {

    /* renamed from: j */
    static final /* synthetic */ C7595j[] f73253j = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MediaMixListFragment.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/favorites/viewmodel/MediaMixListViewModel;"))};

    /* renamed from: k */
    public C23274b f73254k = new C23274b();

    /* renamed from: l */
    public MediaMixListAdapter f73255l;

    /* renamed from: m */
    private final lifecycleAwareLazy f73256m;

    /* renamed from: n */
    private HashMap f73257n;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment$a */
    static final class C27786a extends Lambda implements C7563m<MediaMixState, Bundle, MediaMixState> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListFragment f73258a;

        C27786a(MediaMixListFragment mediaMixListFragment) {
            this.f73258a = mediaMixListFragment;
            super(2);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
            if (r9 == null) goto L_0x0044;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
            if (r9 == null) goto L_0x0018;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
            if (r9 == null) goto L_0x002e;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState invoke(com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r8, android.os.Bundle r9) {
            /*
                r7 = this;
                java.lang.String r9 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r8, r9)
                com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment r9 = r7.f73258a
                android.os.Bundle r9 = r9.getArguments()
                if (r9 == 0) goto L_0x0018
                java.lang.String r0 = "enter_from"
                java.lang.String r9 = r9.getString(r0)
                if (r9 != 0) goto L_0x0016
                goto L_0x0018
            L_0x0016:
                r1 = r9
                goto L_0x001b
            L_0x0018:
                java.lang.String r9 = ""
                goto L_0x0016
            L_0x001b:
                com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment r9 = r7.f73258a
                android.os.Bundle r9 = r9.getArguments()
                if (r9 == 0) goto L_0x002e
                java.lang.String r0 = "enter_method"
                java.lang.String r9 = r9.getString(r0)
                if (r9 != 0) goto L_0x002c
                goto L_0x002e
            L_0x002c:
                r2 = r9
                goto L_0x0031
            L_0x002e:
                java.lang.String r9 = ""
                goto L_0x002c
            L_0x0031:
                com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment r9 = r7.f73258a
                android.os.Bundle r9 = r9.getArguments()
                if (r9 == 0) goto L_0x0044
                java.lang.String r0 = "search_keyword"
                java.lang.String r9 = r9.getString(r0)
                if (r9 != 0) goto L_0x0042
                goto L_0x0044
            L_0x0042:
                r3 = r9
                goto L_0x0047
            L_0x0044:
                java.lang.String r9 = ""
                goto L_0x0042
            L_0x0047:
                r4 = 0
                r5 = 8
                r6 = 0
                r0 = r8
                com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState r8 = com.p280ss.android.ugc.aweme.favorites.viewmodel.MediaMixState.copy$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.p1215ui.MediaMixListFragment.C27786a.invoke(com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState, android.os.Bundle):com.ss.android.ugc.aweme.favorites.viewmodel.MediaMixState");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment$b */
    public static final class C27787b implements C11557c<MixStruct, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f73259a;

        /* renamed from: b */
        final /* synthetic */ C7563m f73260b;

        /* renamed from: c */
        final /* synthetic */ C7563m f73261c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f73262d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f73263e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends MixStruct>, C7581n> f73264f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f73262d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f73263e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends MixStruct>, C7581n> mo29140c() {
            return this.f73264f;
        }

        public C27787b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f73259a = bVar;
            this.f73260b = mVar;
            this.f73261c = mVar2;
            this.f73262d = bVar;
            this.f73263e = mVar;
            this.f73264f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment$c */
    public static final class C27788c implements C11557c<MixStruct, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f73265a;

        /* renamed from: b */
        final /* synthetic */ C7563m f73266b;

        /* renamed from: c */
        final /* synthetic */ C7563m f73267c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f73268d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f73269e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends MixStruct>, C7581n> f73270f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f73268d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f73269e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends MixStruct>, C7581n> mo29140c() {
            return this.f73270f;
        }

        public C27788c(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f73265a = bVar;
            this.f73266b = mVar;
            this.f73267c = mVar2;
            this.f73268d = bVar;
            this.f73269e = mVar;
            this.f73270f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment$d */
    static final class C27789d extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListFragment f73271a;

        C27789d(MediaMixListFragment mediaMixListFragment) {
            this.f73271a = mediaMixListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91115a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91115a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f73271a.mStatusView.mo25942f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment$e */
    static final class C27790e extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListFragment f73272a;

        C27790e(MediaMixListFragment mediaMixListFragment) {
            this.f73272a = mediaMixListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91116a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91116a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f73272a.mStatusView.mo25944h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment$f */
    static final class C27791f extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListFragment f73273a;

        C27791f(MediaMixListFragment mediaMixListFragment) {
            this.f73273a = mediaMixListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91117a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91117a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            MediaMixListFragment.m91085a(this.f73273a).ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment$g */
    static final class C27792g extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListFragment f73274a;

        C27792g(MediaMixListFragment mediaMixListFragment) {
            this.f73274a = mediaMixListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91118a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91118a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            MediaMixListFragment.m91085a(this.f73274a).mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment$h */
    static final class C27793h extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListFragment f73275a;

        C27793h(MediaMixListFragment mediaMixListFragment) {
            this.f73275a = mediaMixListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91119a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91119a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                MediaMixListFragment.m91085a(this.f73275a).ai_();
            } else {
                MediaMixListFragment.m91085a(this.f73275a).ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.MediaMixListFragment$i */
    static final class C27794i extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaMixListFragment f73276a;

        C27794i(MediaMixListFragment mediaMixListFragment) {
            this.f73276a = mediaMixListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91120a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91120a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                this.f73276a.mStatusView.mo25943g();
            } else {
                this.f73276a.mStatusView.mo25939d();
            }
        }
    }

    /* renamed from: k */
    private final MediaMixListViewModel m91086k() {
        return (MediaMixListViewModel) this.f73256m.getValue();
    }

    /* renamed from: u */
    private void m91088u() {
        if (this.f73257n != null) {
            this.f73257n.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo71263m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final BaseAdapter<?> mo71264n() {
        return null;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m91088u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo71266p() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo71269s() {
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public C11585f mo29191e() {
        return C11593a.m34077d(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C11593a.m34068a(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C11593a.m34075b(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C11593a.m34078e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C11593a.m34076c(this);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0067b mo29056f() {
        return this.f73254k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo71261g() {
        m91086k().f73404i.mo29082b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo71262i() {
        m91086k().f73404i.mo29085c();
    }

    public final void onResume() {
        super.onResume();
        m91086k().mo29069f();
    }

    public MediaMixListFragment() {
        C7563m aVar = new C27786a(this);
        C7584c a = C7575l.m23595a(MediaMixListViewModel.class);
        C7561a mediaMixListFragment$$special$$inlined$viewModel$1 = new MediaMixListFragment$$special$$inlined$viewModel$1(a);
        this.f73256m = new lifecycleAwareLazy(this, mediaMixListFragment$$special$$inlined$viewModel$1, new MediaMixListFragment$$special$$inlined$viewModel$2(this, mediaMixListFragment$$special$$inlined$viewModel$1, a, aVar));
    }

    /* renamed from: o */
    public final boolean mo71265o() {
        if (!isViewValid()) {
            return false;
        }
        if (!C27812c.m91213a(getActivity())) {
            if (!this.f73217g) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            }
            this.f73217g = true;
            return false;
        }
        this.f73217g = false;
        if (TextUtils.isEmpty(this.f73216f)) {
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            this.f73216f = a.getCurUserId();
        }
        m91086k().f73404i.mo29082b();
        return true;
    }

    /* renamed from: a */
    public static final /* synthetic */ MediaMixListAdapter m91085a(MediaMixListFragment mediaMixListFragment) {
        MediaMixListAdapter mediaMixListAdapter = mediaMixListFragment.f73255l;
        if (mediaMixListAdapter == null) {
            C7573i.m23583a("mMixAdapter");
        }
        return mediaMixListAdapter;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Serializable serializable = arguments.getSerializable("mix_ids");
            if (serializable != null) {
                MediaMixListViewModel k = m91086k();
                if (serializable != null) {
                    k.mo71319a((ArrayList) serializable);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<kotlin.Long>");
                }
            }
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            Serializable serializable2 = arguments2.getSerializable("mix_push_ids");
            if (serializable2 != null) {
                MediaMixListViewModel k2 = m91086k();
                if (serializable2 != null) {
                    k2.mo71320b((ArrayList) serializable2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<kotlin.String>");
                }
            }
        }
        this.f73255l = new MediaMixListAdapter(this);
        RecyclerView recyclerView = this.mListView;
        C7573i.m23582a((Object) recyclerView, "mListView");
        MediaMixListAdapter mediaMixListAdapter = this.f73255l;
        if (mediaMixListAdapter == null) {
            C7573i.m23583a("mMixAdapter");
        }
        recyclerView.setAdapter(mediaMixListAdapter);
        ListMiddleware<MediaMixState, MixStruct, C23273a> listMiddleware = m91086k().f73404i;
        C11502e eVar = this;
        RecyclerView recyclerView2 = this.mListView;
        C7573i.m23582a((Object) recyclerView2, "mListView");
        C1262a adapter = recyclerView2.getAdapter();
        if (adapter != null) {
            ListMiddleware.m33938a(listMiddleware, eVar, (MediaMixListAdapter) adapter, false, false, new C27787b(new C27789d(this), new C27790e(this), MediaMixListFragment$onViewCreated$$inlined$ListListener$1.INSTANCE), new C27788c(new C27791f(this), new C27792g(this), MediaMixListFragment$onViewCreated$$inlined$ListListener$3.INSTANCE), new C27793h(this), new C27794i(this), null, null, 780, null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.adapter.MediaMixListAdapter");
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11593a.m34074a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34069a(this, jediViewModel, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34070a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C11593a.m34072a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C11593a.m34071a(this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C11593a.m34073a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }
}
