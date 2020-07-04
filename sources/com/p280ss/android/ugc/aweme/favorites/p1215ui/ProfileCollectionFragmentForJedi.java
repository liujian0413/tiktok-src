package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
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
import com.bytedance.jedi.arch.ext.list.C11583n;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.arch.C23274b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.favorites.adapter.ProfileCollectionAdapterForJediV2;
import com.p280ss.android.ugc.aweme.favorites.api.notice.C27739a;
import com.p280ss.android.ugc.aweme.favorites.api.notice.C27739a.C27741a;
import com.p280ss.android.ugc.aweme.favorites.api.notice.CollectionNotice;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27707j;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionState;
import com.p280ss.android.ugc.aweme.favorites.viewmodel.ProfileCollectionViewModel;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28504t;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.C33369c;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.C33369c.C33370a;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35670h;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.utils.C42967ba;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.collections.C7525m;
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
import org.greenrobot.eventbus.C7709l;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi */
public final class ProfileCollectionFragmentForJedi extends ProfileListFragment implements C11497af<C23274b>, C11592h, C33370a {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f73285e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ProfileCollectionFragmentForJedi.class), "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/favorites/viewmodel/ProfileCollectionViewModel;"))};

    /* renamed from: f */
    public final C23274b f73286f = new C23274b();

    /* renamed from: g */
    public ProfileCollectionAdapterForJediV2 f73287g;

    /* renamed from: h */
    public boolean f73288h = true;

    /* renamed from: i */
    public String f73289i = "";

    /* renamed from: j */
    private final lifecycleAwareLazy f73290j;

    /* renamed from: k */
    private C10803a f73291k;

    /* renamed from: l */
    private ViewStub f73292l;

    /* renamed from: m */
    private View f73293m;

    /* renamed from: n */
    private boolean f73294n;

    /* renamed from: o */
    private C27739a f73295o;

    /* renamed from: p */
    private HashMap f73296p;

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi$a */
    static final class C27797a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ProfileCollectionFragmentForJedi f73297a;

        C27797a(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            this.f73297a = profileCollectionFragmentForJedi;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f73297a.mo71287g().f73420f.mo29082b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi$b */
    public static final class C27798b implements C11557c<C27707j, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f73298a;

        /* renamed from: b */
        final /* synthetic */ C7563m f73299b;

        /* renamed from: c */
        final /* synthetic */ C7563m f73300c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f73301d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f73302e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends C27707j>, C7581n> f73303f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f73301d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f73302e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends C27707j>, C7581n> mo29140c() {
            return this.f73303f;
        }

        public C27798b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f73298a = bVar;
            this.f73299b = mVar;
            this.f73300c = mVar2;
            this.f73301d = bVar;
            this.f73302e = mVar;
            this.f73303f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi$c */
    static final class C27799c extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ProfileCollectionFragmentForJedi f73304a;

        C27799c(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            this.f73304a = profileCollectionFragmentForJedi;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m91179a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91179a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            if (this.f73304a.isViewValid()) {
                ProfileCollectionFragmentForJedi.m91153b("0", "");
                if (!C27813d.m91214a(this.f73304a.getActivity())) {
                    this.f73304a.f73288h = true;
                    C10761a.m31399c((Context) this.f73304a.getActivity(), (int) R.string.cjs).mo25750a();
                    return;
                }
                IAccountUserService a = C21115b.m71197a();
                C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                if (!TextUtils.isEmpty(a.getCurUserId())) {
                    this.f73304a.f73288h = false;
                    if (this.f73304a.mo71288i()) {
                        ((DmtStatusView) this.f73304a.mo71286a((int) R.id.dav)).mo25942f();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi$d */
    static final class C27800d extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ProfileCollectionFragmentForJedi f73305a;

        C27800d(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            this.f73305a = profileCollectionFragmentForJedi;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91180a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91180a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "error");
            ProfileCollectionFragmentForJedi.m91153b("2", th.toString());
            ProfileCollectionFragmentForJedi.m91151a(th.toString());
            this.f73305a.f73288h = true;
            ((DmtStatusView) this.f73305a.mo71286a((int) R.id.dav)).mo25944h();
            ProfileCollectionFragmentForJedi.m91148a(this.f73305a).ai_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi$e */
    static final class C27801e extends Lambda implements C7563m<C11585f, List<? extends C27707j>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ProfileCollectionFragmentForJedi f73306a;

        C27801e(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            this.f73306a = profileCollectionFragmentForJedi;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m91181a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m91181a(C11585f fVar, List<C27707j> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            ProfileCollectionFragmentForJedi.m91153b("1", "");
            fVar.mo29066a(this.f73306a.mo71287g(), new C7562b<ProfileCollectionState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C27801e f73307a;

                {
                    this.f73307a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m91182a((ProfileCollectionState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m91182a(ProfileCollectionState profileCollectionState) {
                    C7573i.m23587b(profileCollectionState, "it");
                    if (C6307b.m19566a((Collection<T>) profileCollectionState.getProfileCollectionItemStructListState().getList())) {
                        RecyclerView recyclerView = (RecyclerView) this.f73307a.f73306a.mo71286a((int) R.id.y4);
                        C7573i.m23582a((Object) recyclerView, "collect_list");
                        recyclerView.setVisibility(4);
                        ((DmtStatusView) this.f73307a.f73306a.mo71286a((int) R.id.dav)).mo25943g();
                        return;
                    }
                    RecyclerView recyclerView2 = (RecyclerView) this.f73307a.f73306a.mo71286a((int) R.id.y4);
                    C7573i.m23582a((Object) recyclerView2, "collect_list");
                    recyclerView2.setVisibility(0);
                    ((DmtStatusView) this.f73307a.f73306a.mo71286a((int) R.id.dav)).mo25939d();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi$f */
    static final class C27803f implements C27741a {

        /* renamed from: a */
        final /* synthetic */ ProfileCollectionFragmentForJedi f73308a;

        C27803f(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            this.f73308a = profileCollectionFragmentForJedi;
        }

        /* renamed from: a */
        public final void mo71225a(CollectionNotice collectionNotice) {
            this.f73308a.mo71287g().f73419e = false;
            if (collectionNotice != null && collectionNotice.getMixStatus()) {
                this.f73308a.mo71287g().f73419e = true;
                this.f73308a.mo29066a(this.f73308a.mo71287g(), new C7562b<ProfileCollectionState, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C27803f f73309a;

                    {
                        this.f73309a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m91184a((ProfileCollectionState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m91184a(ProfileCollectionState profileCollectionState) {
                        C27707j jVar;
                        C7573i.m23587b(profileCollectionState, "it");
                        List d = C7525m.m23509d((Collection<? extends T>) profileCollectionState.getProfileCollectionItemStructListState().getList());
                        int size = d.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                i = -1;
                                jVar = null;
                                break;
                            }
                            C27707j jVar2 = (C27707j) d.get(i);
                            if (jVar2.f73046d == 7) {
                                jVar = new C27707j(jVar2.f73043a, jVar2.f73044b, jVar2.f73045c, jVar2.f73046d, jVar2.f73047e, jVar2.f73048f, jVar2.f73049g, true);
                                break;
                            }
                            i++;
                        }
                        if (i >= 0 && jVar != null) {
                            d.set(i, jVar);
                        }
                        this.f73309a.f73308a.mo71287g().f73420f.mo29081a(d);
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.ui.ProfileCollectionFragmentForJedi$g */
    static final class C27805g extends Lambda implements C7563m<ProfileCollectionState, Bundle, ProfileCollectionState> {

        /* renamed from: a */
        final /* synthetic */ ProfileCollectionFragmentForJedi f73310a;

        C27805g(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
            this.f73310a = profileCollectionFragmentForJedi;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ProfileCollectionState invoke(ProfileCollectionState profileCollectionState, Bundle bundle) {
            C7573i.m23587b(profileCollectionState, "$receiver");
            return ProfileCollectionState.copy$default(profileCollectionState, this.f73310a.f73289i, null, 2, null);
        }
    }

    /* renamed from: o */
    private void m91157o() {
        if (this.f73296p != null) {
            this.f73296p.clear();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo71286a(int i) {
        if (this.f73296p == null) {
            this.f73296p = new HashMap();
        }
        View view = (View) this.f73296p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f73296p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean aO_() {
        return this.f73288h;
    }

    /* renamed from: g */
    public final ProfileCollectionViewModel mo71287g() {
        return (ProfileCollectionViewModel) this.f73290j.getValue();
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m91157o();
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

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11593a.m34074a(this, vm1, bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public C11585f mo29191e() {
        return C11593a.m34077d(this);
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
        return this.f73286f;
    }

    public final void onDestroy() {
        C33369c.m107934b(this);
        super.onDestroy();
    }

    /* renamed from: i */
    public final boolean mo71288i() {
        ProfileCollectionAdapterForJediV2 profileCollectionAdapterForJediV2 = this.f73287g;
        if (profileCollectionAdapterForJediV2 == null) {
            C7573i.m23583a("mAdapter");
        }
        if (profileCollectionAdapterForJediV2.getItemCount() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final View mo61750j() {
        RecyclerView recyclerView = (RecyclerView) mo71286a((int) R.id.y4);
        C7573i.m23582a((Object) recyclerView, "collect_list");
        return recyclerView;
    }

    public ProfileCollectionFragmentForJedi() {
        C7563m gVar = new C27805g(this);
        C7584c a = C7575l.m23595a(ProfileCollectionViewModel.class);
        C7561a profileCollectionFragmentForJedi$$special$$inlined$viewModel$1 = new ProfileCollectionFragmentForJedi$$special$$inlined$viewModel$1(a);
        this.f73290j = new lifecycleAwareLazy(this, profileCollectionFragmentForJedi$$special$$inlined$viewModel$1, new ProfileCollectionFragmentForJedi$$special$$inlined$viewModel$2(this, profileCollectionFragmentForJedi$$special$$inlined$viewModel$1, a, gVar));
    }

    /* renamed from: m */
    private final void m91155m() {
        ListMiddleware<ProfileCollectionState, C27707j, C11583n> listMiddleware = mo71287g().f73420f;
        C11502e eVar = this;
        ProfileCollectionAdapterForJediV2 profileCollectionAdapterForJediV2 = this.f73287g;
        if (profileCollectionAdapterForJediV2 == null) {
            C7573i.m23583a("mAdapter");
        }
        ListMiddleware.m33938a(listMiddleware, eVar, profileCollectionAdapterForJediV2, false, false, new C27798b(new C27799c(this), new C27800d(this), new C27801e(this)), null, null, null, null, null, LiveRoomStruct.ROOM_LONGTIME_NO_NET, null);
    }

    public final void aS_() {
        if (isViewValid()) {
            RecyclerView recyclerView = (RecyclerView) mo71286a((int) R.id.y4);
            C7573i.m23582a((Object) recyclerView, "collect_list");
            if (recyclerView.getChildCount() > 0) {
                ((RecyclerView) mo71286a((int) R.id.y4)).mo5561d(0);
            }
        }
    }

    public final void aT_() {
        if (this.mUserVisibleHint) {
            if (((DmtStatusView) mo71286a((int) R.id.dav)) == null || (!this.f73294n && !TimeLockRuler.isTeenModeON())) {
                mo71287g().f73420f.mo29082b();
            } else {
                DmtStatusView dmtStatusView = (DmtStatusView) mo71286a((int) R.id.dav);
                if (dmtStatusView == null) {
                    C7573i.m23580a();
                }
                dmtStatusView.setVisibility(4);
                View view = this.f73293m;
                if (view == null) {
                    C7573i.m23583a("mPrivateAccountView");
                }
                view.setVisibility(0);
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (C28504t.m93691a()) {
            if (this.f73295o == null) {
                this.f73295o = new C27739a();
            }
            C27739a aVar = this.f73295o;
            if (aVar != null) {
                aVar.mo71222a((C27741a) new C27803f(this));
            }
        }
    }

    public final void aQ_() {
        if (isViewValid()) {
            if (((DmtStatusView) mo71286a((int) R.id.dav)) == null || (!this.f73294n && !TimeLockRuler.isTeenModeON())) {
                mo71287g().f73420f.mo29082b();
            } else {
                DmtStatusView dmtStatusView = (DmtStatusView) mo71286a((int) R.id.dav);
                if (dmtStatusView == null) {
                    C7573i.m23580a();
                }
                dmtStatusView.setVisibility(4);
                View view = this.f73293m;
                if (view == null) {
                    C7573i.m23583a("mPrivateAccountView");
                }
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: k */
    public final void mo71289k() {
        if (isViewValid() && this.mUserVisibleHint) {
            if (((DmtStatusView) mo71286a((int) R.id.dav)) == null || (!this.f73294n && !TimeLockRuler.isTeenModeON())) {
                mo71287g().f73420f.mo29082b();
            } else {
                DmtStatusView dmtStatusView = (DmtStatusView) mo71286a((int) R.id.dav);
                if (dmtStatusView == null) {
                    C7573i.m23580a();
                }
                dmtStatusView.setVisibility(4);
                View view = this.f73293m;
                if (view == null) {
                    C7573i.m23583a("mPrivateAccountView");
                }
                view.setVisibility(0);
            }
        }
    }

    /* renamed from: l */
    private final void m91154l() {
        DmtTextView b = m91152b(R.string.c48);
        b.setOnClickListener(new C27797a(this));
        C10803a c = new C10803a(getContext()).mo25953a().mo25963b((View) m91152b(R.string.d5x)).mo25966c((View) b);
        C7573i.m23582a((Object) c, "DmtStatusView.Builder(co… .setErrorView(errorView)");
        this.f73291k = c;
        DmtStatusView dmtStatusView = (DmtStatusView) mo71286a((int) R.id.dav);
        C10803a aVar = this.f73291k;
        if (aVar == null) {
            C7573i.m23583a("mStatusViewBuilder");
        }
        dmtStatusView.setBuilder(aVar);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity(), 1, false);
        RecyclerView recyclerView = (RecyclerView) mo71286a((int) R.id.y4);
        C7573i.m23582a((Object) recyclerView, "collect_list");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        this.f73287g = new ProfileCollectionAdapterForJediV2(this);
        ProfileCollectionAdapterForJediV2 profileCollectionAdapterForJediV2 = this.f73287g;
        if (profileCollectionAdapterForJediV2 == null) {
            C7573i.m23583a("mAdapter");
        }
        profileCollectionAdapterForJediV2.ai_();
        RecyclerView recyclerView2 = (RecyclerView) mo71286a((int) R.id.y4);
        C7573i.m23582a((Object) recyclerView2, "collect_list");
        ProfileCollectionAdapterForJediV2 profileCollectionAdapterForJediV22 = this.f73287g;
        if (profileCollectionAdapterForJediV22 == null) {
            C7573i.m23583a("mAdapter");
        }
        recyclerView2.setAdapter(profileCollectionAdapterForJediV22);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C11593a.m34068a(this);
    }

    /* renamed from: a */
    public static final /* synthetic */ ProfileCollectionAdapterForJediV2 m91148a(ProfileCollectionFragmentForJedi profileCollectionFragmentForJedi) {
        ProfileCollectionAdapterForJediV2 profileCollectionAdapterForJediV2 = profileCollectionFragmentForJedi.f73287g;
        if (profileCollectionAdapterForJediV2 == null) {
            C7573i.m23583a("mAdapter");
        }
        return profileCollectionAdapterForJediV2;
    }

    @C7709l
    public final void onUserCollectEvent(C35670h hVar) {
        C7573i.m23587b(hVar, "event");
        mo71289k();
    }

    /* renamed from: a */
    public static void m91151a(String str) {
        C42967ba a = C42967ba.m136396a();
        a.mo104680a("error_msg", str);
        C6877n.m21407a("poi_log", "profile_collection", a.mo104681b());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r2) {
        /*
            r1 = this;
            super.onCreate(r2)
            android.os.Bundle r2 = r1.getArguments()
            if (r2 == 0) goto L_0x0011
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = r2.getString(r0)
            if (r2 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r2 = ""
        L_0x0013:
            r1.f73289i = r2
            r2 = r1
            com.ss.android.ugc.aweme.miniapp.appgroup.c$a r2 = (com.p280ss.android.ugc.aweme.miniapp.appgroup.C33369c.C33370a) r2
            com.p280ss.android.ugc.aweme.miniapp.appgroup.C33369c.m107933a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.favorites.p1215ui.ProfileCollectionFragmentForJedi.onCreate(android.os.Bundle):void");
    }

    /* renamed from: b */
    private final DmtTextView m91152b(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.ss));
        dmtTextView.setTextColor(getResources().getColor(R.color.a51));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    /* renamed from: a */
    private final void m91149a(View view) {
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.dcm);
        C7573i.m23582a((Object) viewStub, "stub_private_account");
        this.f73292l = viewStub;
        ViewStub viewStub2 = this.f73292l;
        if (viewStub2 == null) {
            C7573i.m23583a("mPrivateAccountStub");
        }
        View inflate = viewStub2.inflate();
        C7573i.m23582a((Object) inflate, "mPrivateAccountStub.inflate()");
        this.f73293m = inflate;
        if (TimeLockRuler.isTeenModeON()) {
            View view2 = this.f73293m;
            if (view2 == null) {
                C7573i.m23583a("mPrivateAccountView");
            }
            ((TextView) view2.findViewById(R.id.title)).setText(R.string.e6j);
            View view3 = this.f73293m;
            if (view3 == null) {
                C7573i.m23583a("mPrivateAccountView");
            }
            ((TextView) view3.findViewById(R.id.a1q)).setText(R.string.e69);
        }
        View view4 = this.f73293m;
        if (view4 == null) {
            C7573i.m23583a("mPrivateAccountView");
        }
        view4.setVisibility(4);
    }

    /* renamed from: b */
    public static void m91153b(String str, String str2) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("request_status", str);
        if (!TextUtils.isEmpty(str2)) {
            a.mo59973a("err_msg", str2);
        }
        C6907h.m21524a("profile_collection_request", (Map) a.f60753a);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m91154l();
        m91149a(view);
        m91155m();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ah1, viewGroup, false);
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
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C11593a.m34071a(this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }
}
