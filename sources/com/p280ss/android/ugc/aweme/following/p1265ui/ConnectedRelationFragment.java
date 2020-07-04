package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.ConnectedRelationAdapter;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.C29850c;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationListViewModel;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationState;
import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationTabViewModel;
import com.p280ss.android.ugc.aweme.friends.p1285ui.CustomItemAnimator;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment */
public final class ConnectedRelationFragment extends BaseRelationFragment {

    /* renamed from: k */
    static final /* synthetic */ C7595j[] f77987k = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ConnectedRelationFragment.class), "mConnectedRelationViewModel", "getMConnectedRelationViewModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/ConnectedRelationListViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ConnectedRelationFragment.class), "mFollowRelationModel", "getMFollowRelationModel()Lcom/ss/android/ugc/aweme/following/ui/viewmodel/FollowRelationTabViewModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(ConnectedRelationFragment.class), "mConnectedRelationAdapter", "getMConnectedRelationAdapter()Lcom/ss/android/ugc/aweme/following/ui/adapter/ConnectedRelationAdapter;"))};

    /* renamed from: l */
    private FragmentActivity f77988l;

    /* renamed from: m */
    private final lifecycleAwareLazy f77989m;

    /* renamed from: n */
    private final C7541d f77990n;

    /* renamed from: o */
    private final C7541d f77991o = C7546e.m23569a(new C29620i(this));

    /* renamed from: p */
    private HashMap f77992p;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$a */
    public static final class C29611a implements C11557c<Object, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f77993a;

        /* renamed from: b */
        final /* synthetic */ C7563m f77994b;

        /* renamed from: c */
        final /* synthetic */ C7563m f77995c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f77996d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f77997e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Object>, C7581n> f77998f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f77996d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f77997e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Object>, C7581n> mo29140c() {
            return this.f77998f;
        }

        public C29611a(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f77993a = bVar;
            this.f77994b = mVar;
            this.f77995c = mVar2;
            this.f77996d = bVar;
            this.f77997e = mVar;
            this.f77998f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$b */
    public static final class C29612b implements C11557c<Object, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f77999a;

        /* renamed from: b */
        final /* synthetic */ C7563m f78000b;

        /* renamed from: c */
        final /* synthetic */ C7563m f78001c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f78002d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f78003e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Object>, C7581n> f78004f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f78002d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f78003e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Object>, C7581n> mo29140c() {
            return this.f78004f;
        }

        public C29612b(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f77999a = bVar;
            this.f78000b = mVar;
            this.f78001c = mVar2;
            this.f78002d = bVar;
            this.f78003e = mVar;
            this.f78004f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$c */
    static final class C29613c extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationFragment f78005a;

        C29613c(ConnectedRelationFragment connectedRelationFragment) {
            this.f78005a = connectedRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97182a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97182a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                this.f78005a.mo75632v().ai_();
            } else {
                this.f78005a.mo75632v().ah_();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$d */
    static final class C29614d extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationFragment f78006a;

        C29614d(ConnectedRelationFragment connectedRelationFragment) {
            this.f78006a = connectedRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97183a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97183a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            ((DmtStatusView) this.f78006a.mo60553a(R.id.dav)).mo25942f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$e */
    static final class C29615e extends Lambda implements C7563m<C11585f, List<? extends Object>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationFragment f78007a;

        C29615e(ConnectedRelationFragment connectedRelationFragment) {
            this.f78007a = connectedRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97184a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97184a(C11585f fVar, List<? extends Object> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            if (list.isEmpty()) {
                ((DmtStatusView) this.f78007a.mo60553a(R.id.dav)).mo25943g();
            } else {
                ((DmtStatusView) this.f78007a.mo60553a(R.id.dav)).mo25939d();
            }
            fVar.mo29066a(this.f78007a.mo75630t(), new C7562b<ConnectedRelationState, C7581n>(this) {

                /* renamed from: a */
                final /* synthetic */ C29615e f78008a;

                {
                    this.f78008a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    m97185a((ConnectedRelationState) obj);
                    return C7581n.f20898a;
                }

                /* renamed from: a */
                private void m97185a(ConnectedRelationState connectedRelationState) {
                    C7573i.m23587b(connectedRelationState, "it");
                    this.f78008a.f78007a.mo75631u().mo75795a(((C29850c) connectedRelationState.getListState().getPayload()).f78423d);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$f */
    static final class C29617f extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationFragment f78009a;

        C29617f(ConnectedRelationFragment connectedRelationFragment) {
            this.f78009a = connectedRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97186a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97186a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "throwable");
            ConnectedRelationFragment connectedRelationFragment = this.f78009a;
            DmtStatusView dmtStatusView = (DmtStatusView) this.f78009a.mo60553a(R.id.dav);
            C7573i.m23582a((Object) dmtStatusView, "status_view");
            connectedRelationFragment.mo75618a(dmtStatusView, (Exception) th);
            ((DmtStatusView) this.f78009a.mo60553a(R.id.dav)).mo25944h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$g */
    static final class C29618g extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationFragment f78010a;

        C29618g(ConnectedRelationFragment connectedRelationFragment) {
            this.f78010a = connectedRelationFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m97187a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97187a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f78010a.mo75632v().ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$h */
    static final class C29619h extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationFragment f78011a;

        C29619h(ConnectedRelationFragment connectedRelationFragment) {
            this.f78011a = connectedRelationFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m97188a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m97188a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f78011a.mo75632v().mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$i */
    static final class C29620i extends Lambda implements C7561a<ConnectedRelationAdapter> {

        /* renamed from: a */
        final /* synthetic */ ConnectedRelationFragment f78012a;

        /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$i$a */
        static final class C29621a implements C6905a {

            /* renamed from: a */
            final /* synthetic */ C29620i f78013a;

            C29621a(C29620i iVar) {
                this.f78013a = iVar;
            }

            public final void bd_() {
                this.f78013a.f78012a.mo75630t().mo75770g();
            }
        }

        C29620i(ConnectedRelationFragment connectedRelationFragment) {
            this.f78012a = connectedRelationFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ConnectedRelationAdapter invoke() {
            ConnectedRelationAdapter connectedRelationAdapter = new ConnectedRelationAdapter(this.f78012a, null, 2, null);
            connectedRelationAdapter.mo66504a((C6905a) new C29621a(this));
            connectedRelationAdapter.mo66506d(R.string.am0);
            return connectedRelationAdapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.ConnectedRelationFragment$j */
    static final class C29622j extends Lambda implements C7563m<ConnectedRelationState, Bundle, ConnectedRelationState> {

        /* renamed from: a */
        public static final C29622j f78014a = new C29622j();

        C29622j() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m97190a((ConnectedRelationState) obj, (Bundle) obj2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
            if (r0 == null) goto L_0x0012;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
            if (r9 == null) goto L_0x0022;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationState m97190a(com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationState r8, android.os.Bundle r9) {
            /*
                java.lang.String r0 = "$receiver"
                kotlin.jvm.internal.C7573i.m23587b(r8, r0)
                if (r9 == 0) goto L_0x0012
                java.lang.String r0 = "uid"
                java.lang.String r0 = r9.getString(r0)
                if (r0 != 0) goto L_0x0010
                goto L_0x0012
            L_0x0010:
                r2 = r0
                goto L_0x0015
            L_0x0012:
                java.lang.String r0 = ""
                goto L_0x0010
            L_0x0015:
                if (r9 == 0) goto L_0x0022
                java.lang.String r0 = "sec_uid"
                java.lang.String r9 = r9.getString(r0)
                if (r9 != 0) goto L_0x0020
                goto L_0x0022
            L_0x0020:
                r3 = r9
                goto L_0x0025
            L_0x0022:
                java.lang.String r9 = ""
                goto L_0x0020
            L_0x0025:
                r4 = 0
                r5 = 0
                r6 = 12
                r7 = 0
                r1 = r8
                com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState r8 = com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.ConnectedRelationState.copy$default(r1, r2, r3, r4, r5, r6, r7)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.following.p1265ui.ConnectedRelationFragment.C29622j.m97190a(com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState, android.os.Bundle):com.ss.android.ugc.aweme.following.ui.viewmodel.ConnectedRelationState");
        }
    }

    /* renamed from: a */
    public final View mo60553a(int i) {
        if (this.f77992p == null) {
            this.f77992p = new HashMap();
        }
        View view = (View) this.f77992p.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f77992p.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: g */
    public final void mo60554g() {
        if (this.f77992p != null) {
            this.f77992p.clear();
        }
    }

    /* renamed from: j */
    public final int mo75619j() {
        return R.layout.nj;
    }

    /* renamed from: l */
    public final int mo75621l() {
        return R.string.d7u;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    /* renamed from: q */
    public final int mo75626q() {
        return R.drawable.arw;
    }

    /* renamed from: r */
    public final int mo75627r() {
        return R.string.ag8;
    }

    /* renamed from: s */
    public final int mo75628s() {
        return R.string.ag9;
    }

    /* renamed from: t */
    public final ConnectedRelationListViewModel mo75630t() {
        return (ConnectedRelationListViewModel) this.f77989m.getValue();
    }

    /* renamed from: u */
    public final FollowRelationTabViewModel mo75631u() {
        return (FollowRelationTabViewModel) this.f77990n.getValue();
    }

    /* renamed from: v */
    public final ConnectedRelationAdapter mo75632v() {
        return (ConnectedRelationAdapter) this.f77991o.getValue();
    }

    /* renamed from: p */
    public final void mo75625p() {
        mo75630t().mo29069f();
    }

    public ConnectedRelationFragment() {
        C7563m mVar = C29622j.f78014a;
        C7584c a = C7575l.m23595a(ConnectedRelationListViewModel.class);
        C7561a connectedRelationFragment$$special$$inlined$viewModel$1 = new ConnectedRelationFragment$$special$$inlined$viewModel$1(a);
        this.f77989m = new lifecycleAwareLazy(this, connectedRelationFragment$$special$$inlined$viewModel$1, new ConnectedRelationFragment$$special$$inlined$viewModel$2(this, connectedRelationFragment$$special$$inlined$viewModel$1, a, mVar));
        C7584c a2 = C7575l.m23595a(FollowRelationTabViewModel.class);
        this.f77990n = C7546e.m23569a(new ConnectedRelationFragment$$special$$inlined$activityViewModel$1(this, a2, a2));
    }

    /* renamed from: w */
    private final void m97163w() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo60553a(R.id.dav);
        C7573i.m23582a((Object) dmtStatusView, "status_view");
        mo75617a(dmtStatusView);
        RecyclerView recyclerView = (RecyclerView) mo60553a(R.id.cqp);
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(new CustomItemAnimator());
        recyclerView.setAdapter(mo75632v());
        recyclerView.bringToFront();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo60553a(R.id.cr7);
        C7573i.m23582a((Object) swipeRefreshLayout, "refresh_layout");
        swipeRefreshLayout.setEnabled(false);
    }

    /* renamed from: x */
    private final void m97164x() {
        mo75630t().mo75767a(this, mo75632v(), new C29611a(new C29614d(this), new C29617f(this), new C29615e(this)), new C29612b(new C29618g(this), new C29619h(this), ConnectedRelationFragment$initViewModel$$inlined$ListListener$2.INSTANCE), new C29613c(this));
        if (!this.f77983h) {
            mo75630t().mo29069f();
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context != null) {
            this.f77988l = (FragmentActivity) context;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m97163w();
        m97164x();
    }
}
