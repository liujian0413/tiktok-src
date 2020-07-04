package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.adapter.AtFriendsAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.AtFriendsSearchAdapter.C30012a;
import com.p280ss.android.ugc.aweme.friends.model.AtFriendsViewModel;
import com.p280ss.android.ugc.aweme.friends.model.AtFriendsViewModel.Companion.AllFriends;
import com.p280ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30040b;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30049g;
import com.p280ss.android.ugc.aweme.friends.p1285ui.IndexView.C30109a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment */
public final class AtFriendsFragment extends AmeBaseFragment implements C30040b {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f79055e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AtFriendsFragment.class), "mSummonFriendSearchPresenter", "getMSummonFriendSearchPresenter()Lcom/ss/android/ugc/aweme/friends/presenter/SummonFriendSearchPresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AtFriendsFragment.class), "normalEmptyView", "getNormalEmptyView()Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AtFriendsFragment.class), "searchEmptyView", "getSearchEmptyView()Lcom/bytedance/ies/dmt/ui/widget/DmtDefaultStatus;"))};

    /* renamed from: l */
    public static final C30071a f79056l = new C30071a(null);

    /* renamed from: f */
    public final AtFriendsViewModel f79057f = new AtFriendsViewModel();

    /* renamed from: g */
    public final AtFriendsAdapter f79058g = new AtFriendsAdapter();

    /* renamed from: h */
    public final AtFriendsSearchAdapter f79059h = new AtFriendsSearchAdapter();

    /* renamed from: i */
    public LinearLayoutManager f79060i;

    /* renamed from: j */
    public FloatingBarItemDecoration f79061j;

    /* renamed from: k */
    public int f79062k;

    /* renamed from: m */
    private final C7541d f79063m = C7546e.m23569a(C30072b.f79068a);

    /* renamed from: n */
    private final C7541d f79064n = C7546e.m23569a(new C30073c(this));

    /* renamed from: o */
    private final C7541d f79065o = C7546e.m23569a(new C30084m(this));

    /* renamed from: p */
    private String f79066p;

    /* renamed from: q */
    private HashMap f79067q;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$a */
    public static final class C30071a {
        private C30071a() {
        }

        public /* synthetic */ C30071a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AtFriendsFragment m98559a(String str, int i) {
            C7573i.m23587b(str, "videoId");
            Bundle bundle = new Bundle();
            bundle.putString("video_id", str);
            bundle.putInt("source", i);
            AtFriendsFragment atFriendsFragment = new AtFriendsFragment();
            atFriendsFragment.setArguments(bundle);
            return atFriendsFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$b */
    static final class C30072b extends Lambda implements C7561a<C30049g> {

        /* renamed from: a */
        public static final C30072b f79068a = new C30072b();

        C30072b() {
            super(0);
        }

        /* renamed from: a */
        private static C30049g m98560a() {
            return new C30049g();
        }

        public final /* synthetic */ Object invoke() {
            return m98560a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$c */
    static final class C30073c extends Lambda implements C7561a<C10805b> {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79069a;

        C30073c(AtFriendsFragment atFriendsFragment) {
            this.f79069a = atFriendsFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C10805b invoke() {
            return new C10806a(this.f79069a.getContext()).mo25985a((int) R.drawable.b7d).mo25990b((int) R.string.lo).mo25993c(R.string.lp).f29135a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$d */
    static final class C30074d<TTaskResult, TContinuationResult> implements C1591g<AllFriends, Void> {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79070a;

        C30074d(AtFriendsFragment atFriendsFragment) {
            this.f79070a = atFriendsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<AllFriends> hVar) {
            int i;
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6887c() && !hVar.mo6889d()) {
                C7573i.m23582a((Object) iUserService, "userService");
                if (iUserService.isLogin()) {
                    AtFriendsFragment atFriendsFragment = this.f79070a;
                    FloatingBarItemDecoration floatingBarItemDecoration = new FloatingBarItemDecoration(this.f79070a.getContext(), ((AllFriends) hVar.mo6890e()).indexLabels, ((AllFriends) hVar.mo6890e()).indexLabelCount);
                    ((RecyclerView) this.f79070a.mo76466c(R.id.cqd)).mo5525a((C1272h) floatingBarItemDecoration);
                    atFriendsFragment.f79061j = floatingBarItemDecoration;
                    ((IndexView) this.f79070a.mo76466c(R.id.b0k)).mo76520a(((AllFriends) hVar.mo6890e()).indexLabels, ((AllFriends) hVar.mo6890e()).indexLabelCount);
                    this.f79070a.f79058g.mo76200a((AllFriends) hVar.mo6890e());
                    this.f79070a.f79058g.notifyDataSetChanged();
                    AtFriendsFragment atFriendsFragment2 = this.f79070a;
                    if (this.f79070a.f79058g.getItemCount() == 0) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    atFriendsFragment2.mo76465b(i);
                    return null;
                }
            }
            ((DmtStatusView) this.f79070a.mo76466c(R.id.daj)).mo25943g();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$e */
    static final class C30075e implements C6905a {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79071a;

        C30075e(AtFriendsFragment atFriendsFragment) {
            this.f79071a = atFriendsFragment;
        }

        public final void bd_() {
            this.f79071a.f79059h.ag_();
            this.f79071a.mo76464a().mo56976a(Boolean.valueOf(false), this.f79071a.f79057f.latestSearchKey, AtFriendsFragment.m98547a(this.f79071a.f79062k));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$f */
    public static final class C30076f implements C30012a {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79072a;

        /* renamed from: a */
        public final String mo76208a() {
            String str = this.f79072a.mo76464a().f79024a;
            C7573i.m23582a((Object) str, "mSummonFriendSearchPresenter.requestId");
            return str;
        }

        C30076f(AtFriendsFragment atFriendsFragment) {
            this.f79072a = atFriendsFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$g */
    static final class C30077g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79073a;

        C30077g(AtFriendsFragment atFriendsFragment) {
            this.f79073a = atFriendsFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f79073a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$h */
    static final class C30078h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79074a;

        C30078h(AtFriendsFragment atFriendsFragment) {
            this.f79074a = atFriendsFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f79074a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$i */
    static final class C30079i implements OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79075a;

        C30079i(AtFriendsFragment atFriendsFragment) {
            this.f79075a = atFriendsFragment;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 66) {
                return false;
            }
            C25713b.m84474a((Activity) this.f79075a.getActivity(), (View) (DmtEditText) this.f79075a.mo76466c(R.id.czp));
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$j */
    public static final class C30080j extends C23467g {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79076a;

        /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$j$a */
        static final class C30081a<TTaskResult, TContinuationResult> implements C1591g<List<? extends IMUser>, Void> {

            /* renamed from: a */
            final /* synthetic */ C30080j f79077a;

            C30081a(C30080j jVar) {
                this.f79077a = jVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<List<IMUser>> hVar) {
                C7573i.m23582a((Object) hVar, "task");
                if (hVar.mo6887c() || hVar.mo6889d()) {
                    ((DmtStatusView) this.f79077a.f79076a.mo76466c(R.id.daj)).mo25942f();
                } else {
                    this.f79077a.f79076a.f79059h.f78860a = (List) hVar.mo6890e();
                    List list = (List) hVar.mo6890e();
                    if (list != null && (!list.isEmpty())) {
                        this.f79077a.f79076a.m98549a((Integer) null);
                    }
                    this.f79077a.f79076a.f79059h.notifyDataSetChanged();
                }
                this.f79077a.f79076a.mo76464a().mo56976a(Boolean.valueOf(true), this.f79077a.f79076a.f79057f.latestSearchKey, AtFriendsFragment.m98547a(this.f79077a.f79076a.f79062k));
                return null;
            }
        }

        C30080j(AtFriendsFragment atFriendsFragment) {
            this.f79076a = atFriendsFragment;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            int i;
            int i2;
            C7573i.m23587b(editable, "s");
            boolean z2 = false;
            if (editable.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            ImageButton imageButton = (ImageButton) this.f79076a.mo76466c(R.id.wj);
            C7573i.m23582a((Object) imageButton, "clearSearchInput");
            if (imageButton.getVisibility() != i) {
                if (i == 8) {
                    AtFriendsFragment atFriendsFragment = this.f79076a;
                    if (this.f79076a.f79058g.getItemCount() == 0) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    atFriendsFragment.mo76465b(i2);
                }
                ImageButton imageButton2 = (ImageButton) this.f79076a.mo76466c(R.id.wj);
                C7573i.m23582a((Object) imageButton2, "clearSearchInput");
                imageButton2.setVisibility(i);
            }
            String obj = editable.toString();
            if (obj != null) {
                String obj2 = C7634n.m23762b(obj).toString();
                this.f79076a.f79059h.mo76203a(obj2);
                if (obj2.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    if (!this.f79076a.mo76464a().ap_()) {
                        this.f79076a.mo76464a().mo66537a(this.f79076a);
                    }
                    if (this.f79076a.f79058g.getItemCount() == 0) {
                        ((DmtStatusView) this.f79076a.mo76466c(R.id.daj)).mo25942f();
                    }
                    AtFriendsViewModel atFriendsViewModel = this.f79076a.f79057f;
                    List<? extends IMUser> list = this.f79076a.f79058g.f78844a;
                    if (list == null) {
                        list = C7525m.m23461a();
                    }
                    atFriendsViewModel.searchKeyWord(obj2, list).mo6876a((C1591g<TResult, TContinuationResult>) new C30081a<TResult,TContinuationResult>(this), C1592h.f5958b);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$k */
    static final class C30082k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79078a;

        C30082k(AtFriendsFragment atFriendsFragment) {
            this.f79078a = atFriendsFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            ((DmtEditText) this.f79078a.mo76466c(R.id.czp)).setText("");
            ((DmtEditText) this.f79078a.mo76466c(R.id.czp)).clearFocus();
            C25713b.m84474a((Activity) this.f79078a.getActivity(), (View) (DmtEditText) this.f79078a.mo76466c(R.id.czp));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$l */
    static final class C30083l implements C30109a {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79079a;

        C30083l(AtFriendsFragment atFriendsFragment) {
            this.f79079a = atFriendsFragment;
        }

        /* renamed from: a */
        public final void mo76471a(String str, int i) {
            AtFriendsFragment.m98545a(this.f79079a).mo5417a(((IndexView) this.f79079a.mo76466c(R.id.b0k)).mo76519a(i), 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$m */
    static final class C30084m extends Lambda implements C7561a<C10805b> {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79080a;

        C30084m(AtFriendsFragment atFriendsFragment) {
            this.f79080a = atFriendsFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C10805b invoke() {
            return new C10806a(this.f79080a.getContext()).mo25985a((int) R.drawable.b7c).mo25990b((int) R.string.fic).mo25993c(R.string.fid).f29135a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.AtFriendsFragment$n */
    static final class C30085n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AtFriendsFragment f79081a;

        C30085n(AtFriendsFragment atFriendsFragment) {
            this.f79081a = atFriendsFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f79081a.mo76464a().mo56976a(Boolean.valueOf(true), this.f79081a.f79057f.latestSearchKey, AtFriendsFragment.m98547a(this.f79081a.f79062k));
        }
    }

    /* renamed from: a */
    public static final AtFriendsFragment m98546a(String str, int i) {
        return C30071a.m98559a(str, i);
    }

    /* renamed from: a */
    public static String m98547a(int i) {
        return i == 1 ? "comment_user" : i == 0 ? "at_user" : "";
    }

    /* renamed from: d */
    private final C10805b m98550d() {
        return (C10805b) this.f79064n.getValue();
    }

    /* renamed from: f */
    private final C10805b m98551f() {
        return (C10805b) this.f79065o.getValue();
    }

    /* renamed from: g */
    private void m98552g() {
        if (this.f79067q != null) {
            this.f79067q.clear();
        }
    }

    /* renamed from: a */
    public final C30049g mo76464a() {
        return (C30049g) this.f79063m.getValue();
    }

    /* renamed from: c */
    public final View mo76466c(int i) {
        if (this.f79067q == null) {
            this.f79067q = new HashMap();
        }
        View view = (View) this.f79067q.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f79067q.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m98552g();
    }

    /* renamed from: e */
    public final void mo76291e() {
        if (isViewValid() && this.f79059h.getItemCount() == 0) {
            ((DmtStatusView) mo76466c(R.id.daj)).mo25942f();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearLayoutManager m98545a(AtFriendsFragment atFriendsFragment) {
        LinearLayoutManager linearLayoutManager = atFriendsFragment.f79060i;
        if (linearLayoutManager == null) {
            C7573i.m23583a("linearLayoutManager");
        }
        return linearLayoutManager;
    }

    /* renamed from: d */
    public final void mo76290d(Exception exc) {
        if (isViewValid()) {
            if (this.f79059h.getItemCount() == 0) {
                ((DmtStatusView) mo76466c(R.id.daj)).mo25944h();
            }
            C25713b.m84474a((Activity) getActivity(), (View) (DmtEditText) mo76466c(R.id.czp));
        }
    }

    /* renamed from: b */
    public final void mo76465b(int i) {
        RecyclerView recyclerView = (RecyclerView) mo76466c(R.id.cqd);
        C7573i.m23582a((Object) recyclerView, "recyclerView");
        if (!C7573i.m23585a((Object) recyclerView.getAdapter(), (Object) this.f79058g)) {
            FloatingBarItemDecoration floatingBarItemDecoration = this.f79061j;
            if (floatingBarItemDecoration != null) {
                C1272h hVar = floatingBarItemDecoration;
                ((RecyclerView) mo76466c(R.id.cqd)).mo5542b(hVar);
                ((RecyclerView) mo76466c(R.id.cqd)).mo5525a(hVar);
            }
            RecyclerView recyclerView2 = (RecyclerView) mo76466c(R.id.cqd);
            C7573i.m23582a((Object) recyclerView2, "recyclerView");
            recyclerView2.setAdapter(this.f79058g);
            IndexView indexView = (IndexView) mo76466c(R.id.b0k);
            C7573i.m23582a((Object) indexView, "indexView");
            indexView.setVisibility(0);
        }
        C10803a a = C10803a.m31631a(getContext());
        if (C6399b.m19944t()) {
            MtEmptyView a2 = MtEmptyView.m31657a(getContext());
            a2.setStatus(new C10806a(getContext()).mo25985a((int) R.drawable.ax1).mo25990b((int) R.string.lo).mo25993c(R.string.lp).f29135a);
            a.mo25963b((View) a2);
        } else {
            a.mo25961a(m98550d());
        }
        ((DmtStatusView) mo76466c(R.id.daj)).setBuilder(a);
        ((DmtStatusView) mo76466c(R.id.daj)).setStatus(-1);
        ((DmtStatusView) mo76466c(R.id.daj)).setStatus(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m98549a(Integer num) {
        RecyclerView recyclerView = (RecyclerView) mo76466c(R.id.cqd);
        C7573i.m23582a((Object) recyclerView, "recyclerView");
        int i = 1;
        if (!C7573i.m23585a((Object) recyclerView.getAdapter(), (Object) this.f79059h)) {
            if (this.f79061j != null) {
                RecyclerView recyclerView2 = (RecyclerView) mo76466c(R.id.cqd);
                FloatingBarItemDecoration floatingBarItemDecoration = this.f79061j;
                if (floatingBarItemDecoration == null) {
                    C7573i.m23580a();
                }
                recyclerView2.mo5542b((C1272h) floatingBarItemDecoration);
            }
            RecyclerView recyclerView3 = (RecyclerView) mo76466c(R.id.cqd);
            C7573i.m23582a((Object) recyclerView3, "recyclerView");
            recyclerView3.setAdapter(this.f79059h);
            IndexView indexView = (IndexView) mo76466c(R.id.b0k);
            C7573i.m23582a((Object) indexView, "indexView");
            indexView.setVisibility(4);
        }
        if (num != null) {
            i = num.intValue();
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) mo76466c(R.id.daj);
            C7573i.m23582a((Object) dmtStatusView, "statusView");
            if (dmtStatusView.mo25945i()) {
                i = 0;
            } else {
                DmtStatusView dmtStatusView2 = (DmtStatusView) mo76466c(R.id.daj);
                C7573i.m23582a((Object) dmtStatusView2, "statusView");
                if (!dmtStatusView2.mo25946j()) {
                    DmtStatusView dmtStatusView3 = (DmtStatusView) mo76466c(R.id.daj);
                    C7573i.m23582a((Object) dmtStatusView3, "statusView");
                    if (dmtStatusView3.mo25947k()) {
                        i = 2;
                    } else {
                        i = -1;
                    }
                }
            }
        }
        C10803a a = C10803a.m31631a(getContext()).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C30085n(this));
        if (C6399b.m19944t()) {
            MtEmptyView a2 = MtEmptyView.m31657a(getContext());
            a2.setStatus(new C10806a(getContext()).mo25985a((int) R.drawable.ax3).mo25990b((int) R.string.fic).mo25993c(R.string.fid).f29135a);
            a.mo25963b((View) a2);
        } else {
            a.mo25961a(m98551f());
        }
        ((DmtStatusView) mo76466c(R.id.daj)).setBuilder(a);
        ((DmtStatusView) mo76466c(R.id.daj)).setStatus(-1);
        ((DmtStatusView) mo76466c(R.id.daj)).setStatus(i);
    }

    /* renamed from: a */
    public final void mo76289a(List<SummonFriendItem> list, String str) {
        List<? extends SummonFriendItem> list2;
        if (this.f79062k == 0 && C6399b.m19944t()) {
            C6907h.m21528b("search_video_at", C33230ac.m107211a(C22984d.m75611a().mo59973a("search_keyword", str).mo59973a("log_pb", C28199ae.m92689a().mo71791a(mo76464a().f79024a)).f60753a));
        }
        if (isViewValid() && !TextUtils.isEmpty(this.f79059h.f78862c)) {
            if (mo76464a().mo76310e()) {
                this.f79059h.ai_();
            } else {
                this.f79059h.ah_();
            }
            AtFriendsSearchAdapter atFriendsSearchAdapter = this.f79059h;
            int i = 1;
            if (list != null) {
                Iterable iterable = list;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    SummonFriendItem summonFriendItem = (SummonFriendItem) next;
                    AtFriendsViewModel atFriendsViewModel = this.f79057f;
                    User user = summonFriendItem.mUser;
                    C7573i.m23582a((Object) user, "it.user");
                    String uid = user.getUid();
                    C7573i.m23582a((Object) uid, "it.user.uid");
                    if (!atFriendsViewModel.latestSearchUsersContain(uid)) {
                        arrayList.add(next);
                    }
                }
                list2 = (List) arrayList;
            } else {
                list2 = null;
            }
            atFriendsSearchAdapter.f78861b = list2;
            this.f79059h.notifyDataSetChanged();
            if (this.f79059h.getItemCount() != 0) {
                i = -1;
            }
            m98549a(Integer.valueOf(i));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        C23487o.m77137a((Activity) getActivity(), getResources().getColor(R.color.a3z));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f79066p = arguments.getString("video_id");
            this.f79062k = arguments.getInt("source");
        }
        this.f79058g.f78846c = this.f79062k;
        this.f79059h.f78863d = this.f79062k;
        this.f79059h.f78864e = new C30076f(this);
        if (C6399b.m19944t()) {
            TextTitleBar textTitleBar = (TextTitleBar) mo76466c(R.id.djr);
            C7573i.m23582a((Object) textTitleBar, "titleBar");
            textTitleBar.setUseBackIcon(true);
            TextTitleBar textTitleBar2 = (TextTitleBar) mo76466c(R.id.djr);
            C7573i.m23582a((Object) textTitleBar2, "titleBar");
            textTitleBar2.getBackBtn().setImageResource(R.drawable.apy);
            TextTitleBar textTitleBar3 = (TextTitleBar) mo76466c(R.id.djr);
            C7573i.m23582a((Object) textTitleBar3, "titleBar");
            textTitleBar3.getBackBtn().setOnClickListener(new C30077g(this));
        }
        TextTitleBar textTitleBar4 = (TextTitleBar) mo76466c(R.id.djr);
        C7573i.m23582a((Object) textTitleBar4, "titleBar");
        textTitleBar4.getStartText().setOnClickListener(new C30078h(this));
        if (C6399b.m19944t()) {
            ((DmtEditText) mo76466c(R.id.czp)).setHint(R.string.cv_);
        }
        ((DmtEditText) mo76466c(R.id.czp)).setOnKeyListener(new C30079i(this));
        ((DmtEditText) mo76466c(R.id.czp)).addTextChangedListener(new C30080j(this));
        ((ImageButton) mo76466c(R.id.wj)).setOnClickListener(new C30082k(this));
        this.f79060i = new WrapLinearLayoutManager(getContext());
        RecyclerView recyclerView = (RecyclerView) mo76466c(R.id.cqd);
        C7573i.m23582a((Object) recyclerView, "recyclerView");
        LinearLayoutManager linearLayoutManager = this.f79060i;
        if (linearLayoutManager == null) {
            C7573i.m23583a("linearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        ((RecyclerView) mo76466c(R.id.cqd)).mo5528a((C1281m) new AtFriendsFragment$onViewCreated$8(this, view, view.getContext()));
        ((IndexView) mo76466c(R.id.b0k)).setIndexLetterTv((TextView) mo76466c(R.id.b0j));
        ((IndexView) mo76466c(R.id.b0k)).setOnLetterTouchListener(new C30083l(this));
        mo76465b(0);
        this.f79057f.loadAllFriends().mo6876a((C1591g<TResult, TContinuationResult>) new C30074d<TResult,TContinuationResult>(this), C1592h.f5958b);
        this.f79059h.mo66516d(true);
        this.f79059h.mo66504a((C6905a) new C30075e(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.n8, viewGroup, false);
    }
}
