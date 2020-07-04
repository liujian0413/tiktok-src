package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lobby.auth.C12196a;
import com.bytedance.lobby.auth.C12198c.C12200a;
import com.bytedance.lobby.internal.C12226d;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.friends.adapter.FriendsAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.FriendsViewHolder;
import com.p280ss.android.ugc.aweme.friends.model.Friend;
import com.p280ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import com.p280ss.android.ugc.aweme.friends.p1281a.C29999a;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30039a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38317n;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38331u;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38335w;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p280ss.android.ugc.trill.p1760c.p1761a.C44985a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity */
public class InviteUserListActivity extends AmeSSActivity implements C12196a, C6905a, C25675c<Friend>, C36040n {

    /* renamed from: e */
    private static final boolean f79236e = C7163a.m22363a();

    /* renamed from: a */
    public boolean f79237a;

    /* renamed from: b */
    public C25674b<C30039a> f79238b;

    /* renamed from: c */
    public C36031j f79239c;

    /* renamed from: d */
    public String f79240d;

    /* renamed from: f */
    private FriendsAdapter f79241f;

    /* renamed from: g */
    private DividerItemDecoration f79242g;

    /* renamed from: h */
    private C12226d f79243h;

    /* renamed from: i */
    private int f79244i = 3;

    /* renamed from: j */
    private String f79245j;

    /* renamed from: k */
    private String f79246k;

    /* renamed from: l */
    private C29999a f79247l = new C29999a() {
        /* renamed from: a */
        public final boolean mo76196a(Friend friend) {
            if (!C30175v.m98803a(InviteUserListActivity.this)) {
                C10761a.m31399c((Context) InviteUserListActivity.this, (int) R.string.cjs).mo25750a();
                return false;
            } else if (InviteUserListActivity.this.f79237a) {
                return false;
            } else {
                InviteUserListActivity.this.f79237a = true;
                return true;
            }
        }

        /* renamed from: a */
        public final boolean mo76197a(String str, String str2, int i, int i2) {
            if (!C30175v.m98803a(InviteUserListActivity.this)) {
                C10761a.m31399c((Context) InviteUserListActivity.this, (int) R.string.cjs).mo25750a();
                return false;
            } else if (InviteUserListActivity.this.f79238b == null || InviteUserListActivity.this.f79239c.mo66540i()) {
                return false;
            } else {
                InviteUserListActivity.this.f79239c.mo91679a(new C36034a().mo91684a(str).mo91686b(str2).mo91682a(i2).mo91688c(InviteUserListActivity.this.f79240d).mo91689d(i).mo91681a());
                return true;
            }
        }
    };
    TextView mInviteText;
    RecyclerView mListView;
    SwipeRefreshLayout mRefreshLayout;
    DmtStatusView mStatusView;
    ButtonTitleBar mTitleBar;
    TextView mTitleView;

    public final void aE_() {
    }

    public void back() {
        onBackPressed();
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<Friend> list, boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ Activity mo76554f() {
        return this;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onFollowSuccess(FollowStatus followStatus) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    /* renamed from: j */
    private boolean m98694j() {
        if (!TextUtils.isEmpty(this.f79245j)) {
            return true;
        }
        return false;
    }

    public final void aD_() {
        if (isViewValid()) {
            this.f79241f.ag_();
        }
    }

    public final void bd_() {
        if (isViewValid()) {
            this.f79238b.mo56976a(Integer.valueOf(4));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f79238b != null) {
            this.f79238b.mo59134U_();
        }
        if (this.f79239c != null) {
            this.f79239c.mo59134U_();
        }
        ImmersionBar.with((Activity) this).destroy();
    }

    /* renamed from: k */
    private void m98695k() {
        if (this.f79244i == 3) {
            this.f79245j = C44985a.m141938a();
        } else if (this.f79244i == 2) {
            this.f79245j = C44985a.m141941b();
            this.f79246k = C44985a.m141945c();
        } else {
            if (this.f79244i == 4) {
                this.f79245j = this.f79243h.mo29966a("vk");
            }
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid()) {
            if (this.f79241f.mo60557c() == 0) {
                this.mRefreshLayout.setRefreshing(false);
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo25942f();
                return;
            }
            this.mRefreshLayout.setRefreshing(true);
        }
    }

    public final void ae_() {
        if (isViewValid()) {
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo25943g();
            this.mRefreshLayout.setRefreshing(false);
            if (this.f79241f.f67566v) {
                this.f79241f.mo66516d(false);
                this.f79241f.notifyDataSetChanged();
            }
        }
    }

    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            C7195s.m22438a().mo18679a((Activity) this, C7203u.m22460a("aweme://main").mo18694a("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION").mo18695a());
        }
    }

    /* renamed from: l */
    private C38358i m98696l() {
        String str;
        User curUser = C21115b.m71197a().getCurUser();
        String a = C1642a.m8034a(getString(R.string.bv_), new Object[]{C43122ff.m136777h(curUser)});
        if (C6399b.m19946v()) {
            StringBuilder sb = new StringBuilder("https://musical.ly/invitef/download?username=");
            sb.append(C43122ff.m136777h(curUser));
            str = sb.toString();
        } else {
            str = "https://tiktokv.com/invitef/download";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(" ");
        sb2.append(str);
        return new C38358i(sb2.toString());
    }

    /* renamed from: e */
    public final void mo76553e() {
        if (this.f79244i == 3) {
            this.f79238b.mo66536a(new ThirdPartyFriendModel("facebook", this.f79245j, null));
        } else if (this.f79244i == 2) {
            this.f79238b.mo66536a(new ThirdPartyFriendModel("twitter", this.f79245j, this.f79246k));
        } else if (this.f79244i == 4) {
            this.f79238b.mo66536a(new ThirdPartyFriendModel("vk", this.f79245j, this.f79246k));
        } else {
            return;
        }
        this.f79238b.mo56976a(Integer.valueOf(1));
        this.f79239c = new C36031j();
        this.f79239c.mo66537a(this);
        this.f79237a = false;
    }

    /* renamed from: g */
    private void m98692g() {
        if (this.f79244i == 2) {
            C6907h.m21524a("friend_list_notify_show", (Map) C22984d.m75611a().mo59973a("enter_from", "twitter").f60753a);
            C12226d.m35547a(new C12200a(this).mo29933a("twitter").mo29932a((C12196a) this).mo29934a());
        } else if (this.f79244i == 3) {
            C6907h.m21524a("friend_list_notify_show", (Map) C22984d.m75611a().mo59973a("enter_from", "facebook").f60753a);
            C12226d.m35547a(new C12200a(this).mo29933a("facebook").mo29931a(new C42914ab().mo104633a("fb_read_permissions", "public_profile, user_friends, user_age_range, email").f111445a).mo29932a((C12196a) this).mo29934a());
        } else {
            if (this.f79244i == 4) {
                C6907h.m21524a("friend_list_notify_show", (Map) C22984d.m75611a().mo59973a("enter_from", "vk").f60753a);
                C12226d.m35547a(new C12200a(this).mo29933a("vk").mo29932a((C12196a) this).mo29934a());
            }
        }
    }

    /* renamed from: h */
    private void m98693h() {
        if (C6399b.m19947w()) {
            findViewById(R.id.b2t).setBackgroundColor(getResources().getColor(R.color.a7f));
        }
        this.mInviteText.setText(R.string.bv4);
        if (this.f79244i == 3) {
            this.mTitleView.setText(R.string.b2y);
        } else if (this.f79244i == 2) {
            this.mTitleView.setText(R.string.fh5);
        } else if (this.f79244i == 4) {
            this.mTitleView.setText(R.string.fpw);
        }
        this.mStatusView.setBuilder(C10803a.m31631a((Context) this).mo25954a((int) R.string.b12));
        this.mRefreshLayout.setOnRefreshListener(new C23386b() {
            /* renamed from: a */
            public final void mo60744a() {
                if (!C30174u.m98802a(InviteUserListActivity.this.getApplicationContext())) {
                    C10761a.m31399c(InviteUserListActivity.this.getApplicationContext(), (int) R.string.cjs).mo25750a();
                    InviteUserListActivity.this.mRefreshLayout.setRefreshing(false);
                    return;
                }
                InviteUserListActivity.this.mo76553e();
            }
        });
        this.mListView.setLayoutManager(new WrapLinearLayoutManager(this));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getColor(R.color.a6c), (int) C9738o.m28708b((Context) this, 0.5f), 1, C9738o.m28708b((Context) this, 20.0f), C9738o.m28708b((Context) this, 20.0f));
        this.f79242g = dividerItemDecoration;
        this.mListView.mo5525a((C1272h) this.f79242g);
        this.f79241f = new FriendsAdapter(this.f79244i, this.f79247l);
        this.f79241f.mo66504a((C6905a) this);
        this.f79241f.mo66516d(false);
        this.mListView.setAdapter(this.f79241f);
        this.f79238b = new C25674b<>();
        this.f79238b.mo66537a(this);
        this.f79243h = C12226d.m35546a();
        m98695k();
        if (m98694j()) {
            mo76553e();
        } else {
            m98692g();
        }
        this.f79241f.f67550q = getResources().getColor(R.color.a53);
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        m98689a(followStatus);
    }

    /* renamed from: e */
    private static boolean m98691e(Exception exc) {
        if (exc == null || !(exc instanceof ApiServerException) || ((ApiServerException) exc).getErrorCode() != 101) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            this.f79241f.mo66507h();
            if (m98691e(exc)) {
                m98692g();
            }
        }
    }

    /* renamed from: a */
    private void m98689a(FollowStatus followStatus) {
        if (isViewValid()) {
            this.f79241f.mo76212a(followStatus);
            int a = this.f79241f.mo76210a(followStatus.userId);
            if (a != -1) {
                FriendsViewHolder friendsViewHolder = (FriendsViewHolder) this.mListView.mo5575f(a);
                if (friendsViewHolder != null) {
                    friendsViewHolder.mo76218a();
                }
            }
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo25943g();
            if (this.f79241f.f67566v) {
                this.f79241f.mo66516d(false);
                this.f79241f.notifyDataSetChanged();
            }
            this.mRefreshLayout.setRefreshing(false);
        }
    }

    /* renamed from: d */
    public final void mo76552d(Exception exc) {
        C22814a.m75245a(this, exc, R.string.b82);
        int a = this.f79241f.mo76210a(this.f79239c.f94273d);
        if (a >= 0) {
            FriendsViewHolder friendsViewHolder = (FriendsViewHolder) this.mListView.mo5575f(a);
            if (friendsViewHolder != null) {
                friendsViewHolder.mo76218a();
            }
        }
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid() && this.f79239c != null && this.f79241f != null) {
            if (C23645b.m77551a(exc)) {
                C23645b.m77550a(getSupportFragmentManager(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: a */
                    public final void mo57592a() {
                        InviteUserListActivity.this.f79239c.mo56975R_();
                    }

                    /* renamed from: b */
                    public final void mo57593b() {
                        InviteUserListActivity.this.mo76552d(exc);
                    }
                });
            } else {
                mo76552d(exc);
            }
        }
    }

    /* renamed from: a */
    private void m98690a(boolean z) {
        if (!z) {
            if (C6399b.m19944t()) {
                this.f79241f.mo66516d(false);
            } else {
                this.f79241f.ah_();
            }
            this.f79241f.mo66504a((C6905a) null);
            return;
        }
        this.f79241f.ai_();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cf);
        this.f79244i = getIntent().getIntExtra("type", 3);
        this.f79240d = getIntent().getStringExtra("enter_from");
        m98693h();
        if (TextUtils.equals(this.f79240d, "guide_to_invite_third_friends")) {
            findViewById(R.id.b2t).setVisibility(8);
            this.mTitleBar.getStartBtn().setVisibility(4);
            DmtTextView endBtn = this.mTitleBar.getEndBtn();
            endBtn.setVisibility(0);
            endBtn.setTextColor(getResources().getColor(R.color.a2w));
            endBtn.setTextSize(17.0f);
            endBtn.setText(R.string.atp);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity", "onCreate", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r0.equals("facebook") == false) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29929a(com.bytedance.lobby.auth.AuthResult r7) {
        /*
            r6 = this;
            boolean r0 = r6.mStatusDestroyed
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r7.f32438a
            r1 = 2131824096(0x7f110de0, float:1.928101E38)
            r2 = 0
            if (r0 != 0) goto L_0x002e
            boolean r7 = r7.f32439b
            if (r7 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout r7 = r6.mRefreshLayout
            r7.setRefreshing(r2)
            r6.mo76553e()
            return
        L_0x001a:
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r7 = r7.getString(r1)
            r6.showCustomToast(r7)
            com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout r7 = r6.mRefreshLayout
            r7.setRefreshing(r2)
            r6.finish()
            return
        L_0x002e:
            java.lang.String r0 = r7.f32441d
            r3 = -1
            int r4 = r0.hashCode()
            r5 = -916346253(0xffffffffc961aa73, float:-924327.2)
            if (r4 == r5) goto L_0x0057
            r5 = 3765(0xeb5, float:5.276E-42)
            if (r4 == r5) goto L_0x004d
            r5 = 497130182(0x1da19ac6, float:4.2776377E-21)
            if (r4 == r5) goto L_0x0044
            goto L_0x0061
        L_0x0044:
            java.lang.String r4 = "facebook"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x004d:
            java.lang.String r2 = "vk"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0061
            r2 = 2
            goto L_0x0062
        L_0x0057:
            java.lang.String r2 = "twitter"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0061
            r2 = 1
            goto L_0x0062
        L_0x0061:
            r2 = -1
        L_0x0062:
            switch(r2) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x0070;
                case 2: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x00e9
        L_0x0067:
            java.lang.String r7 = r7.f32443f
            r6.f79245j = r7
            r6.mo76553e()
            goto L_0x00e9
        L_0x0070:
            java.lang.String r0 = r7.f32443f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a7
            java.lang.String r0 = r7.f32444g
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0081
            goto L_0x00a7
        L_0x0081:
            java.lang.String r0 = "friend_list_notify_confirm"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "twitter"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            java.lang.String r0 = r7.f32443f
            r6.f79245j = r0
            java.lang.String r7 = r7.f32444g
            r6.f79246k = r7
            java.lang.String r7 = r6.f79245j
            java.lang.String r0 = r6.f79246k
            com.p280ss.android.ugc.trill.p1760c.p1761a.C44985a.m141940a(r7, r0)
            r6.mo76553e()
            return
        L_0x00a7:
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r7 = r7.getString(r1)
            r6.showCustomToast(r7)
            return
        L_0x00b3:
            java.lang.String r0 = "friend_list_notify_confirm"
            com.ss.android.ugc.aweme.app.g.d r2 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r3 = "enter_from"
            java.lang.String r4 = "facebook"
            com.ss.android.ugc.aweme.app.g.d r2 = r2.mo59973a(r3, r4)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r2)
            java.lang.String r0 = r7.f32443f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00da
            android.content.res.Resources r7 = r6.getResources()
            java.lang.String r7 = r7.getString(r1)
            r6.showCustomToast(r7)
            return
        L_0x00da:
            java.lang.String r0 = r7.f32443f
            r6.f79245j = r0
            java.lang.String r0 = r6.f79245j
            long r1 = r7.f32445h
            com.p280ss.android.ugc.trill.p1760c.p1761a.C44985a.m141939a(r0, r1)
            r6.mo76553e()
            return
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.friends.p1285ui.InviteUserListActivity.mo29929a(com.bytedance.lobby.auth.AuthResult):void");
    }

    public void onClick(View view) {
        if (view.getId() == R.id.b2t) {
            if (this.f79244i == 3) {
                C6907h.m21524a("invite_friend", (Map) C22984d.m75611a().mo59973a("enter_from", "facebook").f60753a);
                C38317n nVar = new C38317n(new C30173t(this));
                if (nVar.mo95743a(this)) {
                    nVar.mo95745a(m98696l(), (Context) this);
                } else {
                    C10761a.m31399c((Context) this, (int) R.string.c9j).mo25750a();
                }
            } else if (this.f79244i == 2) {
                C6907h.m21524a("invite_friend", (Map) C22984d.m75611a().mo59973a("enter_from", "twitter").f60753a);
                new C38331u().mo95745a(m98696l(), (Context) this);
            } else if (this.f79244i == 4) {
                C6907h.m21524a("invite_friend", (Map) C22984d.m75611a().mo59973a("enter_from", "vk").f60753a);
                new C38335w().mo95745a(m98696l(), (Context) this);
            }
        } else if (view.getId() == R.id.ct5) {
            setResult(-1);
            finish();
        }
    }

    /* renamed from: a */
    public static Intent m98688a(Context context, int i) {
        Intent intent = new Intent(context, InviteUserListActivity.class);
        intent.putExtra("type", i);
        return intent;
    }

    /* renamed from: b */
    public final void mo59108b(List<Friend> list, boolean z) {
        if (isViewValid()) {
            m98690a(z);
            this.f79241f.mo61577b(list);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<Friend> list, boolean z) {
        if (isViewValid()) {
            this.mStatusView.mo25939d();
            this.mStatusView.setVisibility(8);
            this.mRefreshLayout.setRefreshing(false);
            this.f79241f.mo66516d(true);
            this.f79241f.mo58045a(list);
            m98690a(z);
        }
    }
}
