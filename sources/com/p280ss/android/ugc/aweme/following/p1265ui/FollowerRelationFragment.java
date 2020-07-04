package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11502e.C11503a;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11674x;
import com.bytedance.jedi.arch.ext.list.C11556b;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.following.model.C29574i;
import com.p280ss.android.ugc.aweme.following.model.C29575j;
import com.p280ss.android.ugc.aweme.following.p1265ui.SimpleUserFragment.PageType;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.FollowListAdapter;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationViewModel;
import com.p280ss.android.ugc.aweme.following.repository.C29607i;
import com.p280ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p280ss.android.ugc.aweme.friends.p1285ui.CustomItemAnimator;
import com.p280ss.android.ugc.aweme.profile.expriment.RecUserExpansionAB;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.C37182a;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43064dn;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment */
public final class FollowerRelationFragment extends BaseRelationFragment {

    /* renamed from: k */
    static final /* synthetic */ C7595j[] f78055k = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowerRelationFragment.class), "mFollowerRelationViewModel", "getMFollowerRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowerRelationViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(FollowerRelationFragment.class), "mRecommendUserLisViewModel", "getMRecommendUserLisViewModel()Lcom/ss/android/ugc/aweme/recommend/viewmodel/RecommendUserListViewModel;"))};

    /* renamed from: l */
    public FollowListAdapter f78056l;

    /* renamed from: m */
    private final lifecycleAwareLazy f78057m;

    /* renamed from: n */
    private final lifecycleAwareLazy f78058n;

    /* renamed from: o */
    private HashMap f78059o;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$a */
    static final class C29634a implements C6905a {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78060a;

        C29634a(FollowerRelationFragment followerRelationFragment) {
            this.f78060a = followerRelationFragment;
        }

        public final void bd_() {
            this.f78060a.mo29066a(this.f78060a.mo75630t(), new C7562b<FollowerRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29634a f78061a;

                {
                    this.f78061a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97263a((FollowerRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97263a(FollowerRelationState followerRelationState) {
                    boolean z;
                    C7573i.m23587b(followerRelationState, "it");
                    if (((C29607i) followerRelationState.getListState().getPayload()).f77976c == 0) {
                        Collection recommendList = followerRelationState.getRecommendList();
                        if (recommendList == null || recommendList.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                    }
                    this.f78061a.f78060a.mo75657v();
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$b */
    public static final class C29636b implements C11557c<Object, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f78062a;

        /* renamed from: b */
        final /* synthetic */ C7563m f78063b;

        /* renamed from: c */
        final /* synthetic */ C7563m f78064c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f78065d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f78066e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Object>, C7581n> f78067f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f78065d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f78066e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Object>, C7581n> mo29140c() {
            return this.f78067f;
        }

        public C29636b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f78062a = bVar;
            this.f78063b = mVar;
            this.f78064c = mVar2;
            this.f78065d = bVar;
            this.f78066e = mVar;
            this.f78067f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$c */
    public static final class C29637c implements C11557c<Object, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f78068a;

        /* renamed from: b */
        final /* synthetic */ C7563m f78069b;

        /* renamed from: c */
        final /* synthetic */ C7563m f78070c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f78071d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f78072e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Object>, C7581n> f78073f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f78071d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f78072e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Object>, C7581n> mo29140c() {
            return this.f78073f;
        }

        public C29637c(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f78068a = bVar;
            this.f78069b = mVar;
            this.f78070c = mVar2;
            this.f78071d = bVar;
            this.f78072e = mVar;
            this.f78073f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$d */
    static final class C29638d extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78074a;

        C29638d(FollowerRelationFragment followerRelationFragment) {
            this.f78074a = followerRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97270a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97270a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            ((DmtStatusView) this.f78074a.mo60553a((int) R.id.dav)).mo25942f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$e */
    static final class C29639e extends Lambda implements C48006q<C11585f, ListState<Object, C29607i>, List<? extends Object>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78075a;

        C29639e(FollowerRelationFragment followerRelationFragment) {
            this.f78075a = followerRelationFragment;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m97271a((C11585f) obj, (ListState) obj2, (List) obj3);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97271a(C11585f fVar, ListState<Object, C29607i> listState, List<? extends Object> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(listState, "listState");
            C7573i.m23587b(list, "recommendList");
            FollowerRelationFragment.m97244a(this.f78075a).mo60555a(C7525m.m23506c((Collection<? extends T>) listState.getList(), (Iterable<? extends T>) list));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$f */
    static final class C29640f extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78076a;

        C29640f(FollowerRelationFragment followerRelationFragment) {
            this.f78076a = followerRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97272a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97272a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            if (this.f78076a.mo75659x()) {
                ((DmtStatusView) this.f78076a.mo60553a((int) R.id.dav)).mo25942f();
            } else {
                FollowerRelationFragment.m97244a(this.f78076a).ag_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$g */
    static final class C29641g extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78077a;

        C29641g(FollowerRelationFragment followerRelationFragment) {
            this.f78077a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97273a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97273a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "error");
            if (this.f78077a.mo75659x()) {
                ((DmtStatusView) this.f78077a.mo60553a((int) R.id.dav)).mo25943g();
            } else {
                FollowerRelationFragment.m97244a(this.f78077a).ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$h */
    static final class C29642h extends Lambda implements C7563m<C11585f, List<? extends User>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78078a;

        C29642h(FollowerRelationFragment followerRelationFragment) {
            this.f78078a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97274a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97274a(C11585f fVar, List<? extends User> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            if (!this.f78078a.mo75659x() || !list.isEmpty()) {
                if (this.f78078a.mo75659x()) {
                    ((DmtStatusView) this.f78078a.mo60553a((int) R.id.dav)).mo25939d();
                    this.f78078a.mo75630t().mo29069f();
                }
                return;
            }
            ((DmtStatusView) this.f78078a.mo60553a((int) R.id.dav)).mo25943g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$i */
    static final class C29643i extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78079a;

        C29643i(FollowerRelationFragment followerRelationFragment) {
            this.f78079a = followerRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97275a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97275a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            FollowerRelationFragment.m97244a(this.f78079a).ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$j */
    static final class C29644j extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78080a;

        C29644j(FollowerRelationFragment followerRelationFragment) {
            this.f78080a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97276a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97276a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            FollowerRelationFragment.m97244a(this.f78080a).mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$k */
    static final class C29645k extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78081a;

        C29645k(FollowerRelationFragment followerRelationFragment) {
            this.f78081a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97277a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97277a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "error");
            FollowerRelationFragment followerRelationFragment = this.f78081a;
            DmtStatusView dmtStatusView = (DmtStatusView) this.f78081a.mo60553a((int) R.id.dav);
            C7573i.m23582a((Object) dmtStatusView, "status_view");
            followerRelationFragment.mo75618a(dmtStatusView, (Exception) th);
            ((DmtStatusView) this.f78081a.mo60553a((int) R.id.dav)).mo25944h();
            FollowerRelationFragment.m97244a(this.f78081a).ah_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$l */
    static final class C29646l extends Lambda implements C7563m<C11585f, List<? extends User>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78082a;

        C29646l(FollowerRelationFragment followerRelationFragment) {
            this.f78082a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97278a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97278a(C11585f fVar, List<? extends User> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "list");
            List arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (Object next : list) {
                int i3 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                User user = (User) next;
                if (user instanceof RecommendContact) {
                    arrayList.add(user);
                } else {
                    String requestId = user.getRequestId();
                    C7573i.m23582a((Object) requestId, "user.requestId");
                    arrayList.add(new C29575j(2, user, i2, requestId));
                    i2++;
                }
                i = i3;
            }
            if (!list.isEmpty()) {
                String string = this.f78082a.getResources().getString(R.string.ag_);
                C7573i.m23582a((Object) string, "resources.getString(R.st…relation_recommend_title)");
                arrayList.add(0, new C29574i(4, string));
            }
            this.f78082a.mo75630t().mo75812a(arrayList);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$m */
    static final class C29647m extends Lambda implements C48006q<C11585f, List<? extends User>, C11556b, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78083a;

        C29647m(FollowerRelationFragment followerRelationFragment) {
            this.f78083a = followerRelationFragment;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m97279a((C11585f) obj, (List) obj2, (C11556b) obj3);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97279a(C11585f fVar, List<? extends User> list, C11556b bVar) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "list");
            C7573i.m23587b(bVar, "hasMore");
            if (bVar.f31214a) {
                FollowerRelationFragment.m97244a(this.f78083a).ai_();
                return;
            }
            if (!this.f78083a.mo75659x() || !list.isEmpty()) {
                FollowerRelationFragment.m97244a(this.f78083a).ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$n */
    static final class C29648n extends Lambda implements C7563m<C11585f, List<? extends Object>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78084a;

        C29648n(FollowerRelationFragment followerRelationFragment) {
            this.f78084a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97280a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97280a(C11585f fVar, List<? extends Object> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            if (!C6307b.m19566a((Collection<T>) list)) {
                ((DmtStatusView) this.f78084a.mo60553a((int) R.id.dav)).mo25939d();
            }
            fVar.mo29066a(this.f78084a.mo75630t(), new C7562b<FollowerRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29648n f78085a;

                {
                    this.f78085a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97281a((FollowerRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97281a(FollowerRelationState followerRelationState) {
                    C7573i.m23587b(followerRelationState, "it");
                    if (!this.f78085a.f78084a.mo75630t().mo75813a(((C29607i) followerRelationState.getListState().getPayload()).f31254a.f31214a, ((C29607i) followerRelationState.getListState().getPayload()).f77978e, ((C29607i) followerRelationState.getListState().getPayload()).f77979f)) {
                        if (!this.f78085a.f78084a.mo75659x() || this.f78085a.f78084a.mo75658w()) {
                            ((DmtStatusView) this.f78085a.f78084a.mo60553a((int) R.id.dav)).mo25939d();
                        } else {
                            ((DmtStatusView) this.f78085a.f78084a.mo60553a((int) R.id.dav)).mo25943g();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$o */
    static final class C29650o extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78086a;

        C29650o(FollowerRelationFragment followerRelationFragment) {
            this.f78086a = followerRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97282a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97282a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            fVar.mo29066a(this.f78086a.mo75630t(), new C7562b<FollowerRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29650o f78087a;

                {
                    this.f78087a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97283a((FollowerRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97283a(FollowerRelationState followerRelationState) {
                    C7573i.m23587b(followerRelationState, "it");
                    if (followerRelationState.getListState().isEmpty().f31214a) {
                        ((DmtStatusView) this.f78087a.f78086a.mo60553a((int) R.id.dav)).mo25942f();
                    } else {
                        FollowerRelationFragment.m97244a(this.f78087a.f78086a).ag_();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$p */
    static final class C29652p extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78088a;

        C29652p(FollowerRelationFragment followerRelationFragment) {
            this.f78088a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97284a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97284a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            FollowerRelationFragment.m97244a(this.f78088a).mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$q */
    static final class C29653q extends Lambda implements C7563m<C11585f, List<? extends Object>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78089a;

        C29653q(FollowerRelationFragment followerRelationFragment) {
            this.f78089a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97285a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97285a(C11585f fVar, List<? extends Object> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "it");
            fVar.mo29066a(this.f78089a.mo75630t(), new C7562b<FollowerRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29653q f78090a;

                {
                    this.f78090a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97286a((FollowerRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97286a(FollowerRelationState followerRelationState) {
                    C7573i.m23587b(followerRelationState, "it");
                    if (!this.f78090a.f78089a.mo75630t().mo75813a(((C29607i) followerRelationState.getListState().getPayload()).f31254a.f31214a, ((C29607i) followerRelationState.getListState().getPayload()).f77978e, ((C29607i) followerRelationState.getListState().getPayload()).f77979f)) {
                        if (!this.f78090a.f78089a.mo75659x() || this.f78090a.f78089a.mo75658w()) {
                            ((DmtStatusView) this.f78090a.f78089a.mo60553a((int) R.id.dav)).mo25939d();
                        } else {
                            ((DmtStatusView) this.f78090a.f78089a.mo60553a((int) R.id.dav)).mo25943g();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$r */
    static final class C29655r extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78091a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$r$a */
        static final class C29656a extends Lambda implements C7562b<RecommendUserListState, C37182a> {

            /* renamed from: a */
            public static final C29656a f78092a = new C29656a();

            C29656a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m97288a((RecommendUserListState) obj);
            }

            /* renamed from: a */
            private static C37182a m97288a(RecommendUserListState recommendUserListState) {
                C7573i.m23587b(recommendUserListState, "state");
                return recommendUserListState.getRecommendMobParams();
            }
        }

        C29655r(FollowerRelationFragment followerRelationFragment) {
            this.f78091a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97287a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97287a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                FollowerRelationFragment.m97244a(this.f78091a).ai_();
            } else if (this.f78091a.mo75658w()) {
                if (!this.f78091a.mo75659x()) {
                    this.f78091a.mo75656u().mo93673a(C37182a.m119514a(((C37182a) fVar.mo29066a(this.f78091a.mo75656u(), C29656a.f78092a)).f97284a, ((C37182a) fVar.mo29066a(this.f78091a.mo75656u(), C29656a.f78092a)).f97285b, "nonempty"));
                }
                this.f78091a.mo75656u().mo29116k();
            } else if (this.f78091a.mo75624o()) {
                this.f78091a.mo75630t().mo75814g();
                FollowerRelationFragment.m97244a(this.f78091a).ai_();
            } else {
                FollowerRelationFragment.m97244a(this.f78091a).ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$s */
    static final class C29657s extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78093a;

        C29657s(FollowerRelationFragment followerRelationFragment) {
            this.f78093a = followerRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97289a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97289a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z && !this.f78093a.mo75658w()) {
                fVar.mo29066a(this.f78093a.mo75630t(), new C7562b<FollowerRelationState, C7581n>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C29657s f78094a;

                    {
                        this.f78094a = r1;
                    }

                    public final /* synthetic */ Object invoke(Object obj) {
                        m97290a((FollowerRelationState) obj);
                        return C7581n.f20898a;
                    }

                    /* renamed from: a */
                    private void m97290a(FollowerRelationState followerRelationState) {
                        C7573i.m23587b(followerRelationState, "it");
                        if (followerRelationState.getListState().isEmpty().f31214a && !((C29607i) followerRelationState.getListState().getPayload()).f31254a.f31214a) {
                            if ((followerRelationState.getListState().getLoadMore() instanceof C11674x) || (followerRelationState.getListState().getRefresh() instanceof C11674x)) {
                                ((DmtStatusView) this.f78094a.f78093a.mo60553a((int) R.id.dav)).mo25943g();
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$t */
    static final class C29659t extends Lambda implements C7562b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        public static final C29659t f78095a = new C29659t();

        C29659t() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m97291a((FollowerRelationState) obj));
        }

        /* renamed from: a */
        private static boolean m97291a(FollowerRelationState followerRelationState) {
            boolean z;
            boolean z2;
            C7573i.m23587b(followerRelationState, "it");
            Collection collection = (Collection) followerRelationState.getListState().getRefresh().mo29046a();
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Collection collection2 = (Collection) followerRelationState.getListState().getLoadMore().mo29046a();
                if (collection2 == null || collection2.isEmpty()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$u */
    static final class C29660u extends Lambda implements C7563m<FollowerRelationState, Bundle, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78096a;

        C29660u(FollowerRelationFragment followerRelationFragment) {
            this.f78096a = followerRelationFragment;
            super(2);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (r9 == null) goto L_0x001d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState invoke(com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState r8, android.os.Bundle r9) {
            /*
                r7 = this;
                java.lang.String r9 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r8, r9)
                com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment r9 = r7.f78096a
                java.lang.String r9 = r9.f77981f
                if (r9 != 0) goto L_0x000d
                java.lang.String r9 = ""
            L_0x000d:
                r1 = r9
                com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment r9 = r7.f78096a
                com.ss.android.ugc.aweme.profile.model.User r9 = r9.f77982g
                if (r9 == 0) goto L_0x001d
                java.lang.String r9 = r9.getSecUid()
                if (r9 != 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r2 = r9
                goto L_0x0020
            L_0x001d:
                java.lang.String r9 = ""
                goto L_0x001b
            L_0x0020:
                r3 = 0
                r4 = 0
                r5 = 12
                r6 = 0
                r0 = r8
                com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState r8 = com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState.copy$default(r0, r1, r2, r3, r4, r5, r6)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.FollowerRelationFragment.C29660u.invoke(com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState, android.os.Bundle):com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$v */
    static final class C29661v extends Lambda implements C7563m<RecommendUserListState, Bundle, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78097a;

        C29661v(FollowerRelationFragment followerRelationFragment) {
            this.f78097a = followerRelationFragment;
            super(2);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
            if (r12 == null) goto L_0x001d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState invoke(com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState r11, android.os.Bundle r12) {
            /*
                r10 = this;
                java.lang.String r12 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r11, r12)
                com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment r12 = r10.f78097a
                java.lang.String r12 = r12.f77981f
                if (r12 != 0) goto L_0x000d
                java.lang.String r12 = ""
            L_0x000d:
                r1 = r12
                com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment r12 = r10.f78097a
                com.ss.android.ugc.aweme.profile.model.User r12 = r12.f77982g
                if (r12 == 0) goto L_0x001d
                java.lang.String r12 = r12.getSecUid()
                if (r12 != 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r2 = r12
                goto L_0x0020
            L_0x001d:
                java.lang.String r12 = ""
                goto L_0x001b
            L_0x0020:
                com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment r12 = r10.f78097a
                boolean r3 = r12.mo75620k()
                r4 = 14
                r5 = 0
                com.ss.android.ugc.aweme.recommend.viewmodel.a r6 = new com.ss.android.ugc.aweme.recommend.viewmodel.a
                com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment r12 = r10.f78097a
                java.lang.String r12 = r12.mo75622m()
                com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment r0 = r10.f78097a
                java.lang.String r0 = r0.mo75623n()
                java.lang.String r7 = "empty"
                r6.<init>(r12, r0, r7)
                r7 = 0
                r8 = 80
                r9 = 0
                r0 = r11
                com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState r11 = com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState.copy$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.FollowerRelationFragment.C29661v.invoke(com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState, android.os.Bundle):com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$w */
    static final class C29662w extends Lambda implements C7562b<FollowerRelationState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ FollowerRelationFragment f78098a;

        C29662w(FollowerRelationFragment followerRelationFragment) {
            this.f78098a = followerRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97294a((FollowerRelationState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97294a(FollowerRelationState followerRelationState) {
            boolean z;
            C7573i.m23587b(followerRelationState, "it");
            Collection recommendList = followerRelationState.getRecommendList();
            if (recommendList == null || recommendList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f78098a.mo75630t().f78390e.mo29085c();
            } else {
                this.f78098a.mo75656u().mo29117l();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.FollowerRelationFragment$x */
    static final class C29663x extends Lambda implements C7562b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        public static final C29663x f78099a = new C29663x();

        C29663x() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m97295a((FollowerRelationState) obj));
        }

        /* renamed from: a */
        private static boolean m97295a(FollowerRelationState followerRelationState) {
            C7573i.m23587b(followerRelationState, "it");
            if (!followerRelationState.getListState().getHasMore().f31214a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f78059o == null) {
            this.f78059o = new HashMap();
        }
        View view = (View) this.f78059o.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f78059o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f78059o != null) {
            this.f78059o.clear();
        }
    }

    /* renamed from: j */
    public final int mo75619j() {
        return R.layout.o9;
    }

    /* renamed from: l */
    public final int mo75621l() {
        return R.string.d7t;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    /* renamed from: t */
    public final FollowerRelationViewModel mo75630t() {
        return (FollowerRelationViewModel) this.f78057m.getValue();
    }

    /* renamed from: u */
    public final RecommendUserListViewModel mo75656u() {
        return (RecommendUserListViewModel) this.f78058n.getValue();
    }

    /* renamed from: B */
    private final int m97243B() {
        User user = this.f77982g;
        if (user != null) {
            return user.getFollowerCount();
        }
        return 0;
    }

    /* renamed from: m */
    public final String mo75622m() {
        if (mo75620k()) {
            return "fans";
        }
        return "other_fans";
    }

    /* renamed from: p */
    public final void mo75625p() {
        mo75630t().f78390e.mo29082b();
    }

    /* renamed from: q */
    public final int mo75626q() {
        if (C6399b.m19944t()) {
            return R.drawable.ax1;
        }
        return R.drawable.b7d;
    }

    /* renamed from: s */
    public final int mo75628s() {
        if (mo75620k()) {
            if (C6399b.m19944t()) {
                return R.string.b97;
            }
            return R.string.fi6;
        } else if (C6399b.m19944t()) {
            return R.string.b97;
        } else {
            return R.string.fim;
        }
    }

    /* renamed from: v */
    public final void mo75657v() {
        mo29066a(mo75630t(), new C29662w(this));
    }

    /* renamed from: x */
    public final boolean mo75659x() {
        return ((Boolean) mo29066a(mo75630t(), C29659t.f78095a)).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo75624o() {
        if (C6399b.m19944t() || !RecUserExpansionAB.INSTANCE.enableFollowRelationRec() || !mo75620k() || m97243B() <= 5) {
            return false;
        }
        return ((Boolean) mo29066a(mo75630t(), C29663x.f78099a)).booleanValue();
    }

    /* renamed from: r */
    public final int mo75627r() {
        if (mo75620k()) {
            if (C6399b.m19944t()) {
                return R.string.b98;
            }
            return R.string.fi7;
        } else if (C6399b.m19944t()) {
            return R.string.b99;
        } else {
            return R.string.fin;
        }
    }

    /* renamed from: w */
    public final boolean mo75658w() {
        if (mo75620k()) {
            if (C6399b.m19944t() || !RecUserExpansionAB.INSTANCE.enableFollowRelationRec() || m97243B() > 5) {
                return false;
            }
            return true;
        } else if (C6399b.m19944t() || !RecUserExpansionAB.INSTANCE.enableFollowRelationRec()) {
            return false;
        } else {
            return true;
        }
    }

    public FollowerRelationFragment() {
        C7563m uVar = new C29660u(this);
        C7584c a = C7575l.m23595a(FollowerRelationViewModel.class);
        C7561a followerRelationFragment$$special$$inlined$viewModel$1 = new FollowerRelationFragment$$special$$inlined$viewModel$1(a);
        C0043i iVar = this;
        this.f78057m = new lifecycleAwareLazy(iVar, followerRelationFragment$$special$$inlined$viewModel$1, new FollowerRelationFragment$$special$$inlined$viewModel$2(this, followerRelationFragment$$special$$inlined$viewModel$1, a, uVar));
        C7563m vVar = new C29661v(this);
        C7584c a2 = C7575l.m23595a(RecommendUserListViewModel.class);
        C7561a followerRelationFragment$$special$$inlined$viewModel$3 = new FollowerRelationFragment$$special$$inlined$viewModel$3(a2);
        this.f78058n = new lifecycleAwareLazy(iVar, followerRelationFragment$$special$$inlined$viewModel$3, new FollowerRelationFragment$$special$$inlined$viewModel$4(this, followerRelationFragment$$special$$inlined$viewModel$3, a2, vVar));
    }

    /* renamed from: z */
    private final void m97246z() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo60553a((int) R.id.d9t);
        C7573i.m23582a((Object) swipeRefreshLayout, "srl_refresh");
        swipeRefreshLayout.setEnabled(false);
        DmtStatusView dmtStatusView = (DmtStatusView) mo60553a((int) R.id.dav);
        C7573i.m23582a((Object) dmtStatusView, "status_view");
        mo75617a(dmtStatusView);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        RecyclerView recyclerView = (RecyclerView) mo60553a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo60553a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView2, "rv_list");
        recyclerView2.setItemAnimator(new CustomItemAnimator());
        C43064dn.m136622b((RecyclerView) mo60553a((int) R.id.cxi));
    }

    /* renamed from: y */
    private final void m97245y() {
        m97246z();
        this.f78056l = new FollowListAdapter(this, "follower_relation", mo75620k());
        if (C6399b.m19944t()) {
            FollowListAdapter followListAdapter = this.f78056l;
            if (followListAdapter == null) {
                C7573i.m23583a("mFollowerListAdapter");
            }
            followListAdapter.f67550q = getResources().getColor(R.color.a3z);
        }
        RecyclerView recyclerView = (RecyclerView) mo60553a((int) R.id.cxi);
        C7573i.m23582a((Object) recyclerView, "rv_list");
        FollowListAdapter followListAdapter2 = this.f78056l;
        if (followListAdapter2 == null) {
            C7573i.m23583a("mFollowerListAdapter");
        }
        recyclerView.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.f78056l;
        if (followListAdapter3 == null) {
            C7573i.m23583a("mFollowerListAdapter");
        }
        followListAdapter3.mo66504a((C6905a) new C29634a(this));
        FollowerCardViewHolder a = C29765j.m97497a(getContext(), (RecyclerView) mo60553a((int) R.id.cxi), new FollowingFollowerPageParam(this.f77981f, mo75620k(), PageType.follower));
        C7573i.m23582a((Object) a, "FollowingHeaderViewFacto…      rv_list, pageParam)");
        if (a.mo75643c()) {
            FollowListAdapter followListAdapter4 = this.f78056l;
            if (followListAdapter4 == null) {
                C7573i.m23583a("mFollowerListAdapter");
            }
            followListAdapter4.mo60562b_(a.mo75642b());
        }
        m97242A();
    }

    /* renamed from: A */
    private final void m97242A() {
        ListMiddleware<FollowerRelationState, Object, C29607i> listMiddleware = mo75630t().f78390e;
        C11502e eVar = this;
        FollowListAdapter followListAdapter = this.f78056l;
        if (followListAdapter == null) {
            C7573i.m23583a("mFollowerListAdapter");
        }
        ListMiddleware.m33938a(listMiddleware, eVar, followListAdapter, false, false, new C29636b(new C29638d(this), new C29645k(this), new C29648n(this)), new C29637c(new C29650o(this), new C29652p(this), new C29653q(this)), new C29655r(this), new C29657s(this), null, null, 780, null);
        mo29064a(mo75630t(), C29764i.f78300a, C29758c.f78294a, C11640h.m34110a(), new C29639e(this));
        C11503a.m33919a(this, mo75656u(), C29759d.f78295a, null, new C29641g(this), new C29640f(this), new C29642h(this), 2, null);
        C11503a.m33919a(this, mo75656u(), C29760e.f78296a, null, new C29644j(this), new C29643i(this), null, 18, null);
        mo29062a(mo75656u(), C29761f.f78297a, C11640h.m34110a(), new C29646l(this));
        mo29064a(mo75656u(), C29762g.f78298a, C29763h.f78299a, C11640h.m34110a(), new C29647m(this));
        if (!this.f77983h) {
            mo75630t().f78390e.mo29082b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FollowListAdapter m97244a(FollowerRelationFragment followerRelationFragment) {
        FollowListAdapter followListAdapter = followerRelationFragment.f78056l;
        if (followListAdapter == null) {
            C7573i.m23583a("mFollowerListAdapter");
        }
        return followListAdapter;
    }

    @C7709l
    public final void onAntiCrawlerEvent(C23281a aVar) {
        C7573i.m23587b(aVar, "event");
        String str = aVar.f61317a;
        if (str != null) {
            CharSequence charSequence = str;
            if (C7634n.m23776c(charSequence, (CharSequence) "/aweme/v1/user/follower/list/?", false) || C7634n.m23776c(charSequence, (CharSequence) "/aweme/v1/user/following/list/?", false)) {
                C42961az.m136385f(aVar);
                mo75625p();
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m97245y();
    }
}
