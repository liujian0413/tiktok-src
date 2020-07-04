package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.C29748a;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.FollowingAdapter;
import com.p280ss.android.ugc.aweme.metrics.C33276r;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RemarkEditDialog;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.profile.util.C36748p;
import com.p280ss.android.ugc.aweme.utils.C43064dn;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.SimpleUserFragment */
public abstract class SimpleUserFragment extends AmeBaseFragment implements C10797a, C23267h<User>, C25675c<User>, C36040n {

    /* renamed from: f */
    protected FollowingAdapter f78183f;

    /* renamed from: g */
    protected C36031j f78184g;

    /* renamed from: h */
    protected FollowingFollowerPageParam f78185h;

    /* renamed from: i */
    protected int f78186i;

    /* renamed from: j */
    protected C10803a f78187j;
    RecyclerView mListView;
    SwipeRefreshLayout mRefreshLayout;
    DmtStatusView mStatusView;
    protected TextTitleBar mTitleBar;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.SimpleUserFragment$PageType */
    public enum PageType implements Serializable {
        following,
        follower
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.SimpleUserFragment$a */
    class C29714a implements C29748a {
        private C29714a() {
        }

        /* renamed from: a */
        public final boolean mo68090a(User user) {
            int i = 0;
            if (SimpleUserFragment.this.f78184g.mo66540i()) {
                return false;
            }
            if (user.getFollowStatus() == 0) {
                i = 1;
            }
            SimpleUserFragment.this.f78184g.mo91679a(new C36034a().mo91684a(user.getUid()).mo91686b(user.getSecUid()).mo91682a(i).mo91689d(user.getFollowerStatus()).mo91681a());
            return true;
        }

        /* renamed from: a */
        public final void mo68088a(User user, int i) {
            UserProfileActivity.m117388a((Context) SimpleUserFragment.this.getActivity(), user, SimpleUserFragment.this.mo75702q());
            SimpleUserFragment.m97382a(user.getUid(), SimpleUserFragment.this.mo75647i());
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo60535a(int i, Object obj, int i2, View view, String str) {
    }

    public final void aE_() {
    }

    /* renamed from: b */
    public void mo25896b(View view) {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<User> list, boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo75644e();

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public abstract int mo75645f();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo75647i();

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract int mo75648j();

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo75649k();

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract int mo75650l();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo75652n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract C25674b mo75653o();

    public final void aD_() {
        if (isViewValid()) {
            this.f78183f.ag_();
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid() && C6307b.m19566a((Collection<T>) this.f78183f.mo62312a())) {
            this.mStatusView.mo25942f();
        }
    }

    public final void ae_() {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f78183f.mo58045a(null);
            this.f78183f.ah_();
            this.mStatusView.mo25943g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public boolean mo75651m() {
        return C21115b.m71197a().getCurUserId().equals(this.f78185h.getUid());
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f78184g != null) {
            this.f78184g.mo59134U_();
        }
        if (mo75653o() != null) {
            mo75653o().mo59134U_();
        }
    }

    /* renamed from: p */
    public final boolean mo75701p() {
        if (!C29776u.m97499a(getContext())) {
            C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
            return false;
        }
        return mo75653o().mo56976a(Integer.valueOf(1));
    }

    /* renamed from: r */
    private void m97385r() {
        this.f78183f = new FollowingAdapter(this);
        this.f78183f.mo75718a(this.f78185h);
        this.f78183f.mo66504a((C6905a) new C6905a() {
            public final void bd_() {
                if (SimpleUserFragment.this.isViewValid()) {
                    SimpleUserFragment.this.mo75653o().mo56976a(Integer.valueOf(4));
                }
            }
        });
        this.f78183f.f78249f = new C29714a();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.mo5427b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.setOverScrollMode(2);
        this.mListView.setAdapter(this.f78183f);
        this.mListView.getItemAnimator().f4940i = 0;
        ((SimpleItemAnimator) this.mListView.getItemAnimator()).f5112m = false;
        this.mRefreshLayout.setOnRefreshListener(new C23386b() {
            /* renamed from: a */
            public final void mo60744a() {
                if (SimpleUserFragment.this.mo75653o() != null) {
                    SimpleUserFragment.this.mo75701p();
                } else {
                    SimpleUserFragment.this.mRefreshLayout.setRefreshing(false);
                }
            }
        });
        mo75644e();
        mo75701p();
        this.f78184g = new C36031j();
        this.f78184g.mo66537a(this);
    }

    /* renamed from: q */
    public final String mo75702q() {
        if (TextUtils.isEmpty(mo75647i())) {
            return "";
        }
        String i = mo75647i();
        char c = 65535;
        int hashCode = i.hashCode();
        if (hashCode != -198284867) {
            if (hashCode == 1539074444 && i.equals("following_list")) {
                c = 0;
            }
        } else if (i.equals("fans_list")) {
            c = 1;
        }
        switch (c) {
            case 0:
                if (mo75651m()) {
                    return "following";
                }
                return "other_following";
            case 1:
                if (mo75651m()) {
                    return "fans";
                }
                return "other_fans";
            default:
                return "";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo75646g() {
        this.mTitleBar.setTitle(mo75652n());
        this.mTitleBar.setTitleColor(getResources().getColor(R.color.a0y));
        this.mTitleBar.setOnTitleBarClickListener(this);
        C43064dn.m136622b(this.mListView);
        this.f78187j = C10803a.m31631a(getContext()).mo25964b(C43361b.m137644a(getContext(), new C29774s(this)));
        if (C6399b.m19944t()) {
            MtEmptyView a = MtEmptyView.m31657a(getContext());
            a.setStatus(new C10806a(getContext()).mo25985a(mo75648j()).mo25990b(mo75649k()).mo25993c(mo75650l()).f29135a);
            this.f78187j.mo25963b((View) a);
        } else {
            this.f78187j.mo25961a(new C10806a(getContext()).mo25985a((int) R.drawable.b7d).mo25990b(mo75649k()).mo25993c(mo75650l()).f29135a);
        }
        this.mStatusView.setBuilder(this.f78187j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo75699c(View view) {
        mo75701p();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        m97381a(followStatus);
    }

    /* renamed from: a */
    private void m97381a(FollowStatus followStatus) {
        if (isViewValid() && this.f78183f != null) {
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            this.f78183f.mo66508i();
        }
    }

    /* renamed from: a */
    public final void mo25895a(View view) {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    /* renamed from: a */
    private C10805b m97380a(int i) {
        int i2;
        C10806a aVar = new C10806a(getContext());
        if (C6399b.m19944t()) {
            i2 = R.drawable.awz;
        } else {
            i2 = R.drawable.b6w;
        }
        return aVar.mo25985a(i2).mo25990b((int) R.string.tl).mo25993c(i).f29135a;
    }

    /* renamed from: d */
    private void m97383d(Exception exc) {
        if (!mo75651m() && getContext() != null) {
            int e = m97384e(exc);
            if (!(e == 0 || this.f78187j == null || this.mStatusView == null)) {
                this.mStatusView.mo25939d();
                this.f78187j.mo25964b(m97380a(e));
                this.mStatusView.setBuilder(this.f78187j);
            }
        }
    }

    /* renamed from: e */
    private int m97384e(Exception exc) {
        Throwable a = C22814a.m75241a((Throwable) exc);
        if ((a instanceof ApiServerException) && this.f78185h != null) {
            ApiServerException apiServerException = (ApiServerException) a;
            User user = this.f78185h.getUser();
            if (user != null) {
                if (apiServerException.getErrorCode() == 2077 && user.isBlock) {
                    return R.string.tw;
                }
                if (apiServerException.getErrorCode() == 2078 && user.isBlocked()) {
                    return R.string.bvj;
                }
            }
        }
        return 0;
    }

    /* renamed from: a_ */
    public void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f78183f.mo58045a(null);
            this.f78183f.ah_();
            m97383d(exc);
            this.mStatusView.mo25944h();
        }
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid()) {
            if (C23645b.m77551a(exc)) {
                C23645b.m77550a(getChildFragmentManager(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: a */
                    public final void mo57592a() {
                        SimpleUserFragment.this.f78184g.mo56975R_();
                    }

                    /* renamed from: b */
                    public final void mo57593b() {
                        C22814a.m75245a(SimpleUserFragment.this.getContext(), exc, R.string.b82);
                    }
                });
            } else {
                C22814a.m75245a(getContext(), exc, R.string.b82);
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (isViewValid()) {
            m97381a(followStatus);
            User a = this.f78183f.mo75717a(followStatus.userId);
            if (a != null && C36748p.m118458a(getContext(), a, followStatus)) {
                RemarkEditDialog remarkEditDialog = new RemarkEditDialog(getContext());
                remarkEditDialog.f96236f = a;
                remarkEditDialog.f96237g = followStatus.contactName;
                remarkEditDialog.f96238h = 1;
                remarkEditDialog.f96235e = new C29775t(this, a, followStatus);
                remarkEditDialog.show();
            }
            if (followStatus.followStatus == 0 && a != null && !TextUtils.isEmpty(a.getRemarkName())) {
                a.setRemarkName("");
                int b = this.f78183f.mo75719b(followStatus.userId);
                if (b != -1) {
                    this.f78183f.notifyItemChanged(b);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo59108b(List<User> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (z) {
            this.f78183f.ai_();
        } else if (C6399b.m19944t()) {
            this.f78183f.mo66516d(false);
        } else {
            this.f78183f.ah_();
        }
        this.f78183f.mo61577b(list);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f78185h = (FollowingFollowerPageParam) getArguments().getSerializable("following_page_param");
        this.f78186i = getArguments().getInt("following_or_follower_count", 0);
        mo75646g();
        m97385r();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo75698a(User user, FollowStatus followStatus) {
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            int b = this.f78183f.mo75719b(followStatus.userId);
            if (b != -1) {
                this.f78183f.notifyItemChanged(b);
            }
        }
    }

    /* renamed from: a */
    public static void m97382a(String str, String str2) {
        if (C6399b.m19946v()) {
            if ("following_list".equals(str2) || "fans_list".equals(str2)) {
                ((C33276r) new C33276r().mo85310b(str2).mo85048a("click_card")).mo85322o(str).mo85252e();
            }
        } else if ("following_list".equals(str2)) {
            C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "following_list").mo59973a("to_user_id", str).mo59973a("enter_method", "click_head").mo59975b().f60753a);
            if (!C6399b.m19947w()) {
                C6907h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(str).setJsonObject(new C6869c().mo16887a("enter_from", "following_list").mo16887a("enter_method", "click_head").mo16888b()));
            }
        }
    }

    /* renamed from: a */
    public void mo59099a(List<User> list, boolean z) {
        if (isViewValid()) {
            if (C6399b.m19944t()) {
                this.f78183f.mo66516d(true);
            }
            this.mRefreshLayout.setRefreshing(false);
            this.f78183f.mo58045a(list);
            this.mStatusView.mo25939d();
            if (z) {
                this.f78183f.ai_();
            } else if (C6399b.m19944t()) {
                this.f78183f.mo66516d(false);
            } else {
                this.f78183f.ah_();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo75645f(), viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }
}
