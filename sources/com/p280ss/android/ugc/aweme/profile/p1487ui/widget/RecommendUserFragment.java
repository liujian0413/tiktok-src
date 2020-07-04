package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.discover.api.DiscoverApi;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.RecommendContact;
import com.p280ss.android.ugc.aweme.profile.adapter.EmptyRecommendUserAdapter;
import com.p280ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36341a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileListFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.header.UserHeaderData;
import com.p280ss.android.ugc.aweme.profile.presenter.C36004ad;
import com.p280ss.android.ugc.aweme.profile.presenter.C36042p;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserFragment */
public final class RecommendUserFragment extends ProfileListFragment implements C23267h<User>, C25766a, C36042p {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f96214e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RecommendUserFragment.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/profile/adapter/EmptyRecommendUserAdapter;"))};

    /* renamed from: g */
    public static final C36640a f96215g = new C36640a(null);

    /* renamed from: f */
    public C36341a f96216f;

    /* renamed from: h */
    private final C7541d f96217h = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C36642c(this));

    /* renamed from: i */
    private C36004ad f96218i;

    /* renamed from: j */
    private UserHeaderData f96219j;

    /* renamed from: k */
    private boolean f96220k = true;

    /* renamed from: l */
    private HashMap f96221l;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserFragment$a */
    public static final class C36640a {
        private C36640a() {
        }

        public /* synthetic */ C36640a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static RecommendUserFragment m118260a(UserHeaderData userHeaderData) {
            C7573i.m23587b(userHeaderData, "userHeadData");
            RecommendUserFragment recommendUserFragment = new RecommendUserFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("user_header_data", userHeaderData);
            recommendUserFragment.setArguments(bundle);
            return recommendUserFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserFragment$b */
    static final class C36641b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserFragment f96222a;

        C36641b(RecommendUserFragment recommendUserFragment) {
            this.f96222a = recommendUserFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f96222a.mo92963i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserFragment$c */
    static final class C36642c extends Lambda implements C7561a<EmptyRecommendUserAdapter> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserFragment f96223a;

        /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.RecommendUserFragment$c$a */
        static final class C36643a implements C6905a {

            /* renamed from: a */
            final /* synthetic */ C36642c f96224a;

            C36643a(C36642c cVar) {
                this.f96224a = cVar;
            }

            public final void bd_() {
                this.f96224a.f96223a.mo92964k();
            }
        }

        C36642c(RecommendUserFragment recommendUserFragment) {
            this.f96223a = recommendUserFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public EmptyRecommendUserAdapter invoke() {
            EmptyRecommendUserAdapter emptyRecommendUserAdapter = new EmptyRecommendUserAdapter(this.f96223a);
            emptyRecommendUserAdapter.mo66504a((C6905a) new C36643a(this));
            return emptyRecommendUserAdapter;
        }
    }

    /* renamed from: b */
    private View m118241b(int i) {
        if (this.f96221l == null) {
            this.f96221l = new HashMap();
        }
        View view = (View) this.f96221l.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f96221l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public static final RecommendUserFragment m118242b(UserHeaderData userHeaderData) {
        return C36640a.m118260a(userHeaderData);
    }

    /* renamed from: l */
    private final EmptyRecommendUserAdapter m118246l() {
        return (EmptyRecommendUserAdapter) this.f96217h.getValue();
    }

    /* renamed from: p */
    private void m118250p() {
        if (this.f96221l != null) {
            this.f96221l.clear();
        }
    }

    public final boolean aO_() {
        return true;
    }

    public final void aT_() {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m118250p();
    }

    public final void onDestroy() {
        super.onDestroy();
        C36004ad adVar = this.f96218i;
        if (adVar != null) {
            adVar.mo86692c();
        }
    }

    /* renamed from: n */
    private final void m118248n() {
        if (this.f96218i == null) {
            this.f96218i = new C36004ad(new RecommendCommonUserModel(), this);
        }
        mo92963i();
    }

    /* renamed from: o */
    private boolean m118249o() {
        if (!isViewValid() || m118246l().getItemCount() == 0) {
            return true;
        }
        return false;
    }

    public final void aS_() {
        if (!m118249o()) {
            ((FpsRecyclerView) m118241b((int) R.id.cqd)).mo5561d(0);
        }
    }

    /* renamed from: g */
    public final void mo92962g() {
        m118246l().mo66502g();
        m118246l().mo66516d(false);
        this.f96220k = true;
    }

    /* renamed from: j */
    public final View mo61750j() {
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) m118241b((int) R.id.cqd);
        C7573i.m23582a((Object) fpsRecyclerView, "recyclerView");
        return fpsRecyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r0 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void aQ_() {
        /*
            r3 = this;
            boolean r0 = r3.f96220k
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001e
            com.ss.android.ugc.aweme.profile.adapter.EmptyRecommendUserAdapter r0 = r3.m118246l()
            java.util.List r0 = r0.mo62312a()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            r3.f96220k = r1
            r3.m118248n()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserFragment.aQ_():void");
    }

    /* renamed from: k */
    public final void mo92964k() {
        if (this.f96219j != null) {
            UserHeaderData userHeaderData = this.f96219j;
            if (userHeaderData != null) {
                m118246l().ag_();
                C36004ad adVar = this.f96218i;
                if (adVar != null) {
                    adVar.mo91629a(20, userHeaderData.getmUserId(), 1, C43161e.m136882a(), C43161e.m136884b(), userHeaderData.getSecUserId());
                }
            }
        }
    }

    /* renamed from: m */
    private final void m118247m() {
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) m118241b((int) R.id.cqd);
        fpsRecyclerView.setLayoutManager(new WrapLinearLayoutManager(fpsRecyclerView.getContext()));
        fpsRecyclerView.setAdapter(m118246l());
        ((DmtStatusView) m118241b((int) R.id.dav)).setBuilder(C10803a.m31631a(getContext()).mo25959a((int) R.string.c48, (OnClickListener) new C36641b(this)));
    }

    /* renamed from: i */
    public final void mo92963i() {
        if (isViewValid() && this.f96219j != null && this.f96220k) {
            if (!C36674i.m118324a(getActivity())) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
                ((DmtStatusView) m118241b((int) R.id.dav)).mo25944h();
                this.f96220k = true;
                return;
            }
            UserHeaderData userHeaderData = this.f96219j;
            if (userHeaderData != null) {
                m118246l().mo66516d(false);
                ((DmtStatusView) m118241b((int) R.id.dav)).mo25942f();
                C36004ad adVar = this.f96218i;
                if (adVar != null) {
                    adVar.mo91632a(20, userHeaderData.getmUserId(), 1, C43161e.m136882a(), (String) null, C43161e.m136884b(), userHeaderData.getSecUserId());
                }
            }
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
    }

    /* renamed from: a */
    public final void mo72036a(RecommendList recommendList) {
        boolean z;
        this.f96220k = false;
        if (isViewValid() && recommendList != null) {
            ((DmtStatusView) m118241b((int) R.id.dav)).mo25939d();
            Collection userList = recommendList.getUserList();
            if (userList == null || userList.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m118246l().mo66502g();
                ((DmtStatusView) m118241b((int) R.id.dav)).mo25939d();
                m118246l().mo66516d(false);
                C36341a aVar = this.f96216f;
                if (aVar != null) {
                    aVar.mo91881a(false, 13);
                }
            } else {
                m118246l().mo66516d(true);
                m118246l().mo58045a(recommendList.getUserList());
                C36341a aVar2 = this.f96216f;
                if (aVar2 != null) {
                    aVar2.mo91882b(false, 13);
                }
                if (recommendList.hasMore()) {
                    m118246l().ai_();
                    return;
                }
                m118246l().ah_();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72042b(com.p280ss.android.ugc.aweme.friends.model.RecommendList r4) {
        /*
            r3 = this;
            r0 = 0
            r3.f96220k = r0
            boolean r1 = r3.isViewValid()
            if (r1 == 0) goto L_0x0043
            if (r4 != 0) goto L_0x000c
            goto L_0x0043
        L_0x000c:
            java.util.List r1 = r4.getUserList()
            com.ss.android.ugc.aweme.profile.presenter.ad r2 = r3.f96218i
            if (r2 == 0) goto L_0x0019
            int r2 = r2.mo91638f()
            goto L_0x001a
        L_0x0019:
            r2 = 0
        L_0x001a:
            if (r2 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.profile.adapter.EmptyRecommendUserAdapter r2 = r3.m118246l()
            r2.mo61577b(r1)
            boolean r4 = r4.hasMore()
            if (r4 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.profile.adapter.EmptyRecommendUserAdapter r4 = r3.m118246l()
            r4.ai_()
            goto L_0x0038
        L_0x0031:
            com.ss.android.ugc.aweme.profile.adapter.EmptyRecommendUserAdapter r4 = r3.m118246l()
            r4.ah_()
        L_0x0038:
            com.ss.android.ugc.aweme.profile.ui.al$a r4 = r3.f96216f
            if (r4 == 0) goto L_0x0042
            r1 = 13
            r4.mo91882b(r0, r1)
            return
        L_0x0042:
            return
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserFragment.mo72042b(com.ss.android.ugc.aweme.friends.model.RecommendList):void");
    }

    /* renamed from: a */
    public final void mo92961a(UserHeaderData userHeaderData) {
        String str;
        C7573i.m23587b(userHeaderData, "userHeaderData");
        UserHeaderData userHeaderData2 = this.f96219j;
        if (userHeaderData2 != null) {
            str = userHeaderData2.getmUserId();
        } else {
            str = null;
        }
        if (!C7573i.m23585a((Object) str, (Object) userHeaderData.getmUserId())) {
            m118246l().mo90535f();
            this.f96220k = true;
        }
        C36004ad adVar = this.f96218i;
        if (adVar != null) {
            adVar.mo91637e();
        }
        this.f96219j = userHeaderData;
        m118248n();
    }

    /* renamed from: a */
    public final void mo72038a(Exception exc) {
        boolean z;
        this.f96220k = true;
        if (isViewValid()) {
            Collection a = m118246l().mo62312a();
            if (a == null || a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m118246l().mo66516d(true);
                m118246l().mo66508i();
                C36341a aVar = this.f96216f;
                if (aVar != null) {
                    aVar.mo91882b(false, 13);
                }
            } else {
                ((DmtStatusView) m118241b((int) R.id.dav)).mo25944h();
                m118246l().mo66516d(false);
                C36341a aVar2 = this.f96216f;
                if (aVar2 != null) {
                    aVar2.mo91881a(false, 13);
                }
            }
        }
    }

    /* renamed from: a */
    private final void m118239a(User user, int i) {
        m118240a(user, i, "impression");
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("user_header_data");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof UserHeaderData)) {
            serializable = null;
        }
        this.f96219j = (UserHeaderData) serializable;
        m118247m();
        m118248n();
    }

    /* renamed from: d */
    private final void m118245d(User user, int i) {
        if (isViewValid()) {
            if (!C36674i.m118324a(getContext())) {
                C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
                return;
            }
            m118246l().mo90533a(user);
            C10761a.m31409e(getContext(), (int) R.string.tu).mo25750a();
            if (!(user instanceof RecommendContact)) {
                DiscoverApi.m87296a(user.getUid());
                m118240a(user, i, "delete");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0073, code lost:
        if (r4 == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009f, code lost:
        if (r2 == null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0043, code lost:
        if (r5 == null) goto L_0x0045;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m118243b(com.p280ss.android.ugc.aweme.profile.model.User r7, int r8) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.router.s r0 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            android.support.v4.app.FragmentActivity r1 = r6.getActivity()
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "aweme://user/profile/"
            r2.<init>(r3)
            java.lang.String r3 = r7.getUid()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.ugc.aweme.router.u r2 = com.p280ss.android.ugc.aweme.router.C7203u.m22460a(r2)
            java.lang.String r3 = "sec_user_id"
            java.lang.String r4 = r7.getSecUid()
            com.ss.android.ugc.aweme.router.u r2 = r2.mo18694a(r3, r4)
            java.lang.String r3 = "from_recommend_card"
            r4 = 1
            com.ss.android.ugc.aweme.router.u r2 = r2.mo18693a(r3, r4)
            java.lang.String r3 = "enter_from"
            java.lang.String r5 = "others_homepage"
            com.ss.android.ugc.aweme.router.u r2 = r2.mo18694a(r3, r5)
            java.lang.String r3 = "extra_previous_page_position"
            com.ss.android.ugc.aweme.profile.ui.header.UserHeaderData r5 = r6.f96219j
            if (r5 == 0) goto L_0x0045
            java.lang.String r5 = r5.getmPreviousPagePosition()
            if (r5 != 0) goto L_0x0047
        L_0x0045:
            java.lang.String r5 = ""
        L_0x0047:
            com.ss.android.ugc.aweme.router.u r2 = r2.mo18694a(r3, r5)
            java.lang.String r3 = "need_track_compare_recommend_reason"
            com.ss.android.ugc.aweme.router.u r2 = r2.mo18693a(r3, r4)
            java.lang.String r3 = "previous_recommend_reason"
            java.lang.String r4 = r7.getRecommendReason()
            com.ss.android.ugc.aweme.router.u r2 = r2.mo18694a(r3, r4)
            java.lang.String r3 = "recommend_from_type"
            java.lang.String r4 = "list"
            com.ss.android.ugc.aweme.router.u r2 = r2.mo18694a(r3, r4)
            java.lang.String r3 = "enter_from_request_id"
            com.ss.android.ugc.aweme.profile.presenter.ad r4 = r6.f96218i
            if (r4 == 0) goto L_0x0075
            com.ss.android.ugc.aweme.friends.model.RecommendList r4 = r4.mo91636d()
            if (r4 == 0) goto L_0x0075
            java.lang.String r4 = r4.getRid()
            if (r4 != 0) goto L_0x0077
        L_0x0075:
            java.lang.String r4 = ""
        L_0x0077:
            com.ss.android.ugc.aweme.router.u r2 = r2.mo18694a(r3, r4)
            java.lang.String r2 = r2.mo18695a()
            r0.mo18679a(r1, r2)
            java.lang.String r0 = "enter_profile"
            r6.m118240a(r7, r8, r0)
            java.lang.String r8 = "enter_personal_detail"
            com.ss.android.ugc.aweme.app.g.d r0 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = "others_homepage"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "previous_page"
            com.ss.android.ugc.aweme.profile.ui.header.UserHeaderData r2 = r6.f96219j
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = r2.getmPreviousPage()
            if (r2 != 0) goto L_0x00a3
        L_0x00a1:
            java.lang.String r2 = ""
        L_0x00a3:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "to_user_id"
            java.lang.String r2 = r7.getUid()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "rec_uid"
            java.lang.String r2 = r7.getUid()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r2)
            java.lang.String r1 = "rec_user_type"
            java.lang.String r7 = com.p280ss.android.ugc.aweme.familiar.p966b.C21718a.m72637a(r7)
            com.ss.android.ugc.aweme.app.g.d r7 = r0.mo59973a(r1, r7)
            java.lang.String r0 = "enter_method"
            java.lang.String r1 = "click_head"
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserFragment.m118243b(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r3 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c9, code lost:
        if (r0 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ec, code lost:
        if (r3 == null) goto L_0x00ee;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m118244c(com.p280ss.android.ugc.aweme.profile.model.User r6, int r7) {
        /*
            r5 = this;
            boolean r0 = r5.isViewValid()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.content.Context r0 = r5.getContext()
            boolean r0 = com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36674i.m118324a(r0)
            if (r0 != 0) goto L_0x0020
            android.content.Context r6 = r5.getContext()
            r7 = 2131825043(0x7f111193, float:1.928293E38)
            com.bytedance.ies.dmt.ui.c.a r6 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r6, r7)
            r6.mo25750a()
            return
        L_0x0020:
            int r0 = r6.getFollowStatus()
            r1 = 1
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r0 = r0 ^ r1
            com.ss.android.ugc.aweme.profile.adapter.EmptyRecommendUserAdapter r2 = r5.m118246l()
            int r3 = r6.getFollowStatus()
            r2.mo90534a(r6, r3)
            if (r0 != r1) goto L_0x00b6
            java.lang.String r0 = "follow"
            r5.m118240a(r6, r7, r0)
            com.ss.android.ugc.aweme.profile.presenter.ad r0 = r5.f96218i
            if (r0 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = r0.mo91636d()
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r0.getRid()
            if (r0 != 0) goto L_0x004f
        L_0x004d:
            java.lang.String r0 = ""
        L_0x004f:
            java.lang.String r1 = "follow"
            com.ss.android.ugc.aweme.app.g.d r2 = new com.ss.android.ugc.aweme.app.g.d
            r2.<init>()
            java.lang.String r3 = "req_id"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r0)
            java.lang.String r3 = "log_pb"
            com.ss.android.ugc.aweme.feed.ae r4 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            java.lang.String r0 = r4.mo71791a(r0)
            com.ss.android.ugc.aweme.app.g.d r0 = r2.mo59973a(r3, r0)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "others_homepage"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "previous_page"
            com.ss.android.ugc.aweme.profile.ui.header.UserHeaderData r3 = r5.f96219j
            if (r3 == 0) goto L_0x007e
            java.lang.String r3 = r3.getmPreviousPage()
            if (r3 != 0) goto L_0x0080
        L_0x007e:
            java.lang.String r3 = ""
        L_0x0080:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "rec_reason"
            java.lang.String r3 = r6.getRecommendReason()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "to_user_id"
            java.lang.String r3 = r6.getUid()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "rec_uid"
            java.lang.String r6 = r6.getUid()
            com.ss.android.ugc.aweme.app.g.d r6 = r0.mo59973a(r2, r6)
            java.lang.String r0 = "impr_order"
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59970a(r0, r7)
            java.lang.String r7 = "enter_method"
            java.lang.String r0 = "follow_button"
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r7, r0)
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r6)
            return
        L_0x00b6:
            java.lang.String r0 = "follow_cancel"
            r5.m118240a(r6, r7, r0)
            com.ss.android.ugc.aweme.profile.presenter.ad r0 = r5.f96218i
            if (r0 == 0) goto L_0x00cb
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = r0.mo91636d()
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = r0.getRid()
            if (r0 != 0) goto L_0x00cd
        L_0x00cb:
            java.lang.String r0 = ""
        L_0x00cd:
            java.lang.String r1 = "follow_cancel"
            com.ss.android.ugc.aweme.app.g.d r2 = new com.ss.android.ugc.aweme.app.g.d
            r2.<init>()
            java.lang.String r3 = "req_id"
            com.ss.android.ugc.aweme.app.g.d r0 = r2.mo59973a(r3, r0)
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "others_homepage"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "previous_page"
            com.ss.android.ugc.aweme.profile.ui.header.UserHeaderData r3 = r5.f96219j
            if (r3 == 0) goto L_0x00ee
            java.lang.String r3 = r3.getmPreviousPage()
            if (r3 != 0) goto L_0x00f0
        L_0x00ee:
            java.lang.String r3 = ""
        L_0x00f0:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "rec_reason"
            java.lang.String r3 = r6.getRecommendReason()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "rec_uid"
            java.lang.String r3 = r6.getUid()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "to_user_id"
            java.lang.String r3 = r6.getUid()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r2, r3)
            java.lang.String r2 = "impr_order"
            com.ss.android.ugc.aweme.app.g.d r7 = r0.mo59970a(r2, r7)
            java.lang.String r0 = "rec_user_type"
            java.lang.String r6 = com.p280ss.android.ugc.aweme.familiar.p966b.C21718a.m72637a(r6)
            com.ss.android.ugc.aweme.app.g.d r6 = r7.mo59973a(r0, r6)
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserFragment.m118244c(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.q_, viewGroup, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        if (r4 == null) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00df, code lost:
        if (r0 == null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m118240a(com.p280ss.android.ugc.aweme.profile.model.User r6, int r7, java.lang.String r8) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.profile.presenter.ad r0 = r5.f96218i
            if (r0 == 0) goto L_0x0010
            com.ss.android.ugc.aweme.friends.model.RecommendList r0 = r0.mo91636d()
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.getRid()
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = ""
        L_0x0012:
            com.ss.android.ugc.aweme.common.MobClick r1 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r2 = "follow_card"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setEventName(r2)
            java.lang.String r2 = "find_friends"
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setLabelName(r2)
            java.lang.String r2 = r6.getUid()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setValue(r2)
            com.ss.android.ugc.aweme.app.g.c r2 = new com.ss.android.ugc.aweme.app.g.c
            r2.<init>()
            java.lang.String r3 = "rec_uid"
            java.lang.String r4 = r6.getUid()
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "others_homepage"
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            java.lang.String r3 = "event_type"
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r8)
            java.lang.String r3 = "impr_order"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16885a(r3, r4)
            java.lang.String r3 = "previous_page"
            com.ss.android.ugc.aweme.profile.ui.header.UserHeaderData r4 = r5.f96219j
            if (r4 == 0) goto L_0x005d
            java.lang.String r4 = r4.getmPreviousPage()
            if (r4 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r4 = ""
        L_0x005f:
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            java.lang.String r3 = "req_id"
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r0)
            java.lang.String r3 = "rec_reason"
            java.lang.String r4 = r6.getRecommendReason()
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            java.lang.String r3 = "card_type"
            java.lang.String r4 = "total"
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            java.lang.String r3 = "rec_user_type"
            java.lang.String r4 = com.p280ss.android.ugc.aweme.familiar.p966b.C21718a.m72637a(r6)
            com.ss.android.ugc.aweme.app.g.c r2 = r2.mo16887a(r3, r4)
            org.json.JSONObject r2 = r2.mo16888b()
            com.ss.android.ugc.aweme.common.MobClick r1 = r1.setJsonObject(r2)
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r1)
            java.lang.String r1 = "follow_card"
            com.ss.android.ugc.aweme.app.g.d r2 = new com.ss.android.ugc.aweme.app.g.d
            r2.<init>()
            java.lang.String r3 = "req_id"
            com.ss.android.ugc.aweme.app.g.d r0 = r2.mo59973a(r3, r0)
            java.lang.String r2 = "event_type"
            com.ss.android.ugc.aweme.app.g.d r8 = r0.mo59973a(r2, r8)
            java.lang.String r0 = "enter_from"
            java.lang.String r2 = "others_homepage"
            com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r0, r2)
            java.lang.String r0 = "trigger_reason"
            java.lang.String r2 = "cold_launch"
            com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r0, r2)
            java.lang.String r0 = "card_type"
            java.lang.String r2 = "total"
            com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r0, r2)
            java.lang.String r0 = "rec_reason"
            java.lang.String r2 = r6.getRecommendReason()
            com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r0, r2)
            java.lang.String r0 = "rec_uid"
            java.lang.String r2 = r6.getUid()
            com.ss.android.ugc.aweme.app.g.d r8 = r8.mo59973a(r0, r2)
            java.lang.String r0 = "impr_order"
            com.ss.android.ugc.aweme.app.g.d r7 = r8.mo59970a(r0, r7)
            java.lang.String r8 = "previous_page"
            com.ss.android.ugc.aweme.profile.ui.header.UserHeaderData r0 = r5.f96219j
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r0.getmPreviousPage()
            if (r0 != 0) goto L_0x00e3
        L_0x00e1:
            java.lang.String r0 = ""
        L_0x00e3:
            com.ss.android.ugc.aweme.app.g.d r7 = r7.mo59973a(r8, r0)
            java.lang.String r8 = "rec_user_type"
            java.lang.String r6 = com.p280ss.android.ugc.aweme.familiar.p966b.C21718a.m72637a(r6)
            com.ss.android.ugc.aweme.app.g.d r6 = r7.mo59973a(r8, r6)
            java.util.Map<java.lang.String, java.lang.String> r6 = r6.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserFragment.m118240a(com.ss.android.ugc.aweme.profile.model.User, int, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo60535a(int i, User user, int i2, View view, String str) {
        if (user != null) {
            switch (i) {
                case 100:
                    m118244c(user, i2);
                    return;
                case BaseNotice.HASHTAG /*101*/:
                    m118243b(user, i2);
                    return;
                case 102:
                    m118245d(user, i2);
                    break;
                case 103:
                    m118239a(user, i2);
                    return;
            }
        }
    }
}
