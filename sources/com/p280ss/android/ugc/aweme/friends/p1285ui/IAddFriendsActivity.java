package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.AppBarLayout.LayoutParams;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p022v4.widget.SwipeRefreshLayout.C1032b;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.C23267h;
import com.p280ss.android.ugc.aweme.base.api.exceptions.local.JSONParseException;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23658a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.discover.adapter.C26501r;
import com.p280ss.android.ugc.aweme.discover.adapter.SearchUserAdapter;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.discover.model.SearchUser;
import com.p280ss.android.ugc.aweme.discover.model.SearchUserList;
import com.p280ss.android.ugc.aweme.discover.presenter.C26845s;
import com.p280ss.android.ugc.aweme.discover.presenter.C26847t;
import com.p280ss.android.ugc.aweme.following.p1265ui.adapter.C29748a;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendAwemeViewHolder.C30016a;
import com.p280ss.android.ugc.aweme.friends.adapter.RecommendFriendListAdapter;
import com.p280ss.android.ugc.aweme.friends.experiment.SuggestionFriendsEntranceTypeExperiment;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.metrics.C33228ab.C33229a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33280v;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.profile.presenter.C36004ad;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.profile.presenter.C36042p;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43064dn;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity */
public class IAddFriendsActivity extends BaseAddFriendsActivity implements C1032b, C23267h<User>, C6905a, C25675c<SearchUser>, C30016a, C36040n, C36042p {

    /* renamed from: b */
    public ForegroundColorSpan f79149b;

    /* renamed from: c */
    public String f79150c = "";

    /* renamed from: d */
    public SearchUserAdapter f79151d;

    /* renamed from: e */
    public C36031j f79152e;

    /* renamed from: f */
    private C26847t f79153f;

    /* renamed from: g */
    private C10803a f79154g;

    /* renamed from: h */
    private C10803a f79155h;

    /* renamed from: i */
    private RecommendFriendListAdapter f79156i;

    /* renamed from: j */
    private C36004ad f79157j;

    /* renamed from: k */
    private SparseArray<String> f79158k = new SparseArray<>();

    /* renamed from: l */
    private int f79159l = 0;

    /* renamed from: m */
    private String f79160m;
    AppBarLayout mAppBarLayout;
    ImageButton mBtnSearchClear;
    DmtEditText mEditSearch;
    RecyclerView mRecyclerView;
    SwipeRefreshLayout mRefreshLayout;
    String mSearchHitString;
    LinearLayout mSearchLayout;
    DmtStatusView mStatusView;
    DmtTextView mTvSearchBtn;
    DmtTextView mTvSearchHit;

    /* renamed from: n */
    private String f79161n;

    /* renamed from: o */
    private String f79162o;

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<SearchUser> list, boolean z) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onPointerCaptureChanged(boolean z) {
    }

    public void onRefresh() {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo76505a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.mEditSearch.setCursorVisible(true);
            if (m98623k()) {
                this.f79151d.mo66502g();
                this.mStatusView.mo25939d();
            } else {
                this.mRecyclerView.setAdapter(this.f79151d);
                this.mStatusView.setBuilder(this.f79155h);
                this.mStatusView.mo25939d();
                m98621c(false);
            }
            if (!TextUtils.isEmpty(this.mTvSearchHit.getText())) {
                this.mTvSearchHit.setVisibility(0);
            }
            this.mTvSearchBtn.setVisibility(0);
        }
        return false;
    }

    /* renamed from: k */
    private boolean m98623k() {
        if (this.mTvSearchBtn == null || !this.mTvSearchBtn.isShown()) {
            return false;
        }
        return true;
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid()) {
            this.mStatusView.mo25942f();
        }
    }

    public final void aD_() {
        if (isViewValid()) {
            this.f79151d.ag_();
        }
    }

    public final void ae_() {
        if (isViewValid()) {
            this.mStatusView.mo25943g();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void mo76509h() {
        this.f79153f.mo56976a(Integer.valueOf(4), this.f79150c, Integer.valueOf(1));
    }

    public final void bd_() {
        if (SuggestionFriendsEntranceTypeExperiment.shouldShowInSuggestion() && this.f79157j != null) {
            this.f79157j.mo91635b(15, null, 3, this.f79159l, C43161e.m136882a(), C43161e.m136884b());
            this.f79156i.mo66516d(true);
            this.f79156i.ag_();
        }
    }

    public void finish() {
        if (m98623k()) {
            mo76508g();
            this.mTvSearchBtn.setVisibility(8);
            C25713b.m84474a((Activity) this, (View) this.mEditSearch);
            this.mEditSearch.setCursorVisible(false);
            this.mEditSearch.clearFocus();
            this.mRecyclerView.setAdapter(this.f79156i);
            this.mStatusView.setBuilder(this.f79154g);
            m98621c(true);
            return;
        }
        super.finish();
    }

    /* renamed from: g */
    public final void mo76508g() {
        this.mTvSearchHit.setVisibility(8);
        this.mBtnSearchClear.setVisibility(8);
        this.mTvSearchHit.setText("");
        this.mEditSearch.getText().clear();
        this.f79150c = "";
        this.f79151d.mo66502g();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onResume", true);
        super.onResume();
        if (C34315c.m110982b(4)) {
            this.f79156i.mo76230a(true);
        } else {
            this.f79156i.mo76230a(false);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onResume", false);
    }

    /* access modifiers changed from: 0000 */
    public void searchUser() {
        if (!TextUtils.isEmpty(this.f79150c)) {
            C25713b.m84474a((Activity) this, (View) this.mEditSearch);
            this.mTvSearchHit.setVisibility(8);
            this.f79153f.mo56976a(Integer.valueOf(1), this.f79150c, Integer.valueOf(1));
        }
    }

    /* renamed from: j */
    private void m98622j() {
        this.mRefreshLayout.setEnabled(false);
        this.f79156i = new RecommendFriendListAdapter(this, this);
        this.f79156i.f78942e = this;
        this.f79156i.mo66516d(false);
        this.f79156i.f67550q = getResources().getColor(R.color.a53);
        this.mRecyclerView.setLayoutManager(new WrapLinearLayoutManager(this));
        this.mRecyclerView.mo5528a((C1281m) new FrescoRecycleViewScrollListener(this));
        C43064dn.m136622b(this.mRecyclerView);
        this.mRecyclerView.setAdapter(this.f79156i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76504a(View view) {
        mo76508g();
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (isViewValid()) {
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.mo25944h();
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            this.f79151d.mo66507h();
        }
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (this.f79156i != null && !followStatus.isFollowSucess) {
            this.f79156i.mo76229a(followStatus);
        }
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.mEditSearch.setText("");
        this.f79156i.mo66502g();
    }

    /* renamed from: b */
    private void m98620b(boolean z) {
        if (z) {
            this.f79156i.mo66504a((C6905a) null);
            if (C6399b.m19944t()) {
                this.f79156i.mo66516d(false);
                return;
            }
            this.f79156i.ah_();
        }
    }

    /* renamed from: c */
    private void m98621c(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.mSearchLayout.getLayoutParams();
        if (z) {
            layoutParams.f1291a = 1;
        } else {
            layoutParams.f1291a = 0;
            this.mAppBarLayout.setExpanded(true);
        }
        this.mSearchLayout.setLayoutParams(layoutParams);
    }

    @C7709l
    public void onNotificationIndicatorEvent(C34314g gVar) {
        if (gVar.f89465a == 4) {
            if (C34315c.m110982b(gVar.f89465a)) {
                this.f79156i.mo76230a(true);
                return;
            }
            this.f79156i.mo76230a(false);
        }
    }

    /* renamed from: a */
    private void m98618a(int i) {
        if (this.f79157j.mo91636d().getNewUserCount() > 0 && i < this.f79157j.mo91636d().getNewUserCount()) {
            this.f79156i.f78941d = true;
            C1293v f = this.mRecyclerView.mo5575f(this.f79156i.f78940c);
            if (f instanceof RecommendFriendsTitleHolder) {
                RecommendFriendsTitleHolder recommendFriendsTitleHolder = (RecommendFriendsTitleHolder) f;
                if (recommendFriendsTitleHolder.f79303a) {
                    recommendFriendsTitleHolder.mo76583a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo76507b(View view) {
        this.mStatusView.mo25942f();
        this.mStatusView.mo25942f();
        if (SuggestionFriendsEntranceTypeExperiment.shouldShowInSuggestion()) {
            this.f79157j = new C36004ad(new RecommendCommonUserModel(), this);
            this.f79157j.mo91630a(15, null, 3, this.f79159l, C43161e.m136882a(), this.f79160m, C43161e.m136884b(), null, this.f79161n);
        }
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid()) {
            if (!m98623k()) {
                C22814a.m75245a(this, exc, R.string.b82);
            } else if (C23645b.m77551a(exc)) {
                C23645b.m77550a(getSupportFragmentManager(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: a */
                    public final void mo57592a() {
                        IAddFriendsActivity.this.f79152e.mo56975R_();
                    }

                    /* renamed from: b */
                    public final void mo57593b() {
                        C22814a.m75245a(IAddFriendsActivity.this, exc, R.string.b82);
                    }
                });
            } else {
                C22814a.m75245a(this, exc, R.string.b82);
            }
        }
    }

    /* renamed from: a */
    public final void mo72038a(Exception exc) {
        if (C6307b.m19566a((Collection<T>) this.f79156i.mo62312a())) {
            C10761a.m31399c((Context) this, (int) R.string.fi2).mo25750a();
            this.mStatusView.mo25944h();
        } else if (exc instanceof JSONParseException) {
            this.f79156i.ai_();
            this.f79156i.mo66504a((C6905a) null);
        } else {
            this.f79156i.mo66507h();
        }
    }

    /* renamed from: b */
    public final void mo72042b(RecommendList recommendList) {
        this.f79156i.ai_();
        this.f79156i.mo76232e(recommendList.getUserList());
        this.f79156i.mo66516d(true);
        m98620b(recommendList.hasMore());
    }

    /* renamed from: a */
    public final void mo72036a(RecommendList recommendList) {
        int i;
        if (recommendList == null || C6307b.m19566a((Collection<T>) recommendList.getUserList())) {
            this.mStatusView.mo25943g();
            this.f79156i.ai_();
            return;
        }
        List userList = recommendList.getUserList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i2 = 1;
        while (true) {
            if (i2 >= userList.size()) {
                break;
            }
            User user = (User) userList.get(0);
            if (!(user == null || user.getUid() == null || userList.get(i2) == null || !user.getUid().equals(((User) userList.get(i2)).getUid()))) {
                arrayList.add(Integer.valueOf(i2));
            }
            i2++;
        }
        for (Integer intValue : arrayList) {
            userList.remove(intValue.intValue());
        }
        recommendList.setUserList(userList);
        int newUserCount = recommendList.getNewUserCount();
        if (!(newUserCount == -1 || recommendList.getUserList() == null || newUserCount > recommendList.getUserList().size())) {
            for (i = 0; i < newUserCount; i++) {
                ((User) recommendList.getUserList().get(i)).setNewRecommend(true);
            }
        }
        this.mStatusView.setVisibility(8);
        this.f79156i.mo76231b(recommendList.getNewUserCount());
        this.f79156i.mo58045a(recommendList.getUserList());
        this.f79156i.mo66516d(true);
        this.f79156i.mo66504a((C6905a) this);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onCreate", true);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(2);
        if (getIntent() != null) {
            this.f79159l = getIntent().getIntExtra("bundle_recommend_count", 0);
            this.f79160m = getIntent().getStringExtra("bundle_puid");
            this.f79161n = getIntent().getStringExtra("bundle_puid");
            this.f79162o = getIntent().getStringExtra("request_id");
        }
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: a */
            public final void mo25895a(View view) {
                IAddFriendsActivity.this.finish();
            }

            /* renamed from: b */
            public final void mo25896b(View view) {
                C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "find_friends").f60753a);
                QRCodePermissionActivity.m119022a(IAddFriendsActivity.this, false);
            }
        });
        int intExtra = getIntent().getIntExtra("bundle_recommend_user_type", 1);
        if (intExtra == 2) {
            this.mTitleBar.getTitleView().setText(R.string.fhb);
            this.mSearchLayout.setVisibility(8);
        }
        m98622j();
        if (intExtra == 6) {
            this.f79156i.f78939b = "fans";
        } else if (intExtra == 5) {
            this.f79156i.f78939b = "following";
        } else {
            this.f79156i.f78939b = "personal_homepage";
        }
        this.f79156i.f78938a = intExtra;
        this.f79154g = C10803a.m31631a((Context) this).mo25953a().mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C30160g(this));
        MtEmptyView a = MtEmptyView.m31657a((Context) this);
        a.setStatus(new C10806a(this).mo25985a((int) R.drawable.ax3).mo25990b((int) R.string.fic).mo25993c(R.string.fid).f29135a);
        this.f79155h = C10803a.m31631a((Context) this).mo25963b((View) a).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                IAddFriendsActivity.this.searchUser();
            }
        });
        this.mStatusView.setBuilder(this.f79154g);
        this.mStatusView.mo25942f();
        this.mRecyclerView.bringToFront();
        this.f79152e = new C36031j();
        if (SuggestionFriendsEntranceTypeExperiment.shouldShowInSuggestion()) {
            this.f79157j = new C36004ad(new RecommendCommonUserModel(), this);
            this.f79157j.mo91630a(15, null, 3, this.f79159l, C43161e.m136882a(), this.f79160m, C43161e.m136884b(), null, this.f79161n);
        }
        this.f79152e.mo66537a(this);
        this.f79153f = new C26847t();
        this.f79153f.mo66537a(this);
        this.f79153f.mo69506a("find_friends");
        this.f79151d = new SearchUserAdapter(new C26501r(false), this.f79150c, new C29748a() {
            /* renamed from: a */
            public final boolean mo68090a(User user) {
                String str;
                int i = 0;
                if (IAddFriendsActivity.this.f79152e.mo66540i()) {
                    return false;
                }
                if (user.getFollowStatus() == 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                new C33280v(str).mo85341b("find_friends").mo85343c("follow_button").mo85348g(user.getUid()).mo85345e("search_result").mo85347f("other_places").mo85352o(user.getRequestId()).mo85252e();
                if (user.getFollowStatus() == 0) {
                    i = 1;
                }
                IAddFriendsActivity.this.f79152e.mo91679a(new C36034a().mo91684a(user.getUid()).mo91682a(i).mo91688c("search_result").mo91689d(user.getFollowerStatus()).mo91681a());
                return true;
            }

            /* renamed from: a */
            public final void mo68088a(User user, int i) {
                C26780aa.m87953a(i, IAddFriendsActivity.this.f79150c, 0, user.getRequestId(), user.getUid(), C26780aa.m87952a(IAddFriendsActivity.this.f79150c));
                UserProfileActivity.m117390a((Context) IAddFriendsActivity.this, user, "find_friends", "", "main_head");
            }
        });
        this.f79151d.mo66504a((C6905a) new C30161h(this));
        if (C6399b.m19946v()) {
            this.mEditSearch.setHint(R.string.cv_);
            this.mSearchHitString = getString(R.string.cv_);
        }
        this.mEditSearch.setOnTouchListener(new C30162i(this));
        this.mBtnSearchClear.setOnClickListener(new C30163j(this));
        this.f79149b = new ForegroundColorSpan(getResources().getColor(R.color.a54));
        this.mEditSearch.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                IAddFriendsActivity.this.f79150c = charSequence.toString();
                if (charSequence.length() > 0) {
                    if (IAddFriendsActivity.this.f79151d.mo62312a() != null && IAddFriendsActivity.this.f79151d.mo62312a().size() > 0) {
                        IAddFriendsActivity.this.f79151d.mo66502g();
                    }
                    IAddFriendsActivity.this.mBtnSearchClear.setVisibility(0);
                    IAddFriendsActivity.this.mTvSearchHit.setVisibility(0);
                    StringBuilder sb = new StringBuilder();
                    sb.append(IAddFriendsActivity.this.mSearchHitString);
                    sb.append("：");
                    sb.append(charSequence);
                    SpannableString spannableString = new SpannableString(sb.toString());
                    spannableString.setSpan(IAddFriendsActivity.this.f79149b, 0, IAddFriendsActivity.this.mSearchHitString.length() + 1, 17);
                    IAddFriendsActivity.this.mTvSearchHit.setText(spannableString);
                    if (IAddFriendsActivity.this.mRecyclerView.getAdapter() != IAddFriendsActivity.this.f79151d) {
                        IAddFriendsActivity.this.mRecyclerView.setAdapter(IAddFriendsActivity.this.f79151d);
                    }
                    return;
                }
                IAddFriendsActivity.this.mo76508g();
            }
        });
        this.mEditSearch.setOnEditorActionListener(new C30164k(this));
        if (C6399b.m19947w()) {
            ((ImageView) findViewById(R.id.bbw)).setImageResource(R.drawable.a24);
            ((ImageView) findViewById(R.id.pw)).setImageResource(R.drawable.a58);
            this.mTvSearchHit.setCompoundDrawables(getResources().getDrawable(R.drawable.a24), null, null, null);
            this.mTvSearchHit.setTextColor(getResources().getColor(R.color.a4p));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity", "onCreate", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76473a(boolean z) {
        String str;
        if (this.f79156i != null) {
            str = this.f79156i.f78939b;
        } else {
            str = "";
        }
        startActivity(ContactsActivity.m98571a(this, str, true));
    }

    /* renamed from: a_ */
    public final void mo76228a_(String str, int i) {
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(str);
        a.mo18682a(C7203u.m22460a(sb.toString()).mo18694a("refer", "find_friends").mo18695a());
        m98618a(i);
    }

    /* renamed from: b */
    public final void mo59108b(List<SearchUser> list, boolean z) {
        if (isViewValid() && m98623k() && !this.mTvSearchHit.isShown()) {
            if (C6399b.m19944t()) {
                z = this.f79153f.mo69507e();
            } else if (list == null || list.isEmpty()) {
                z = false;
            }
            if (z) {
                this.f79151d.ai_();
            } else if (C6399b.m19944t()) {
                this.f79151d.mo66516d(false);
            } else {
                this.f79151d.ah_();
            }
            this.f79151d.mo61577b(list);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<SearchUser> list, boolean z) {
        if (isViewValid() && m98623k() && !this.mTvSearchHit.isShown()) {
            this.f79151d.mo66516d(true);
            if (z) {
                this.f79151d.ai_();
            } else if (C6399b.m19944t()) {
                this.f79151d.mo66516d(false);
            } else {
                this.f79151d.ah_();
            }
            this.mStatusView.mo25939d();
            this.f79151d.mo58045a(list);
            C22984d a = C22984d.m75611a();
            a.mo59973a("enter_from", "find_friends").mo59973a("search_keyword", this.f79150c).mo59973a("log_pb", new C6600e().mo15979b((Object) ((SearchUserList) ((C26845s) this.f79153f.mo66539h()).getData()).logPb));
            C6907h.m21525a("search_user", C33230ac.m107211a(a.f60753a));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo76506a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        searchUser();
        return true;
    }

    /* renamed from: a */
    public static Intent m98617a(Context context, int i, int i2, String str) {
        Intent intent = new Intent(context, IAddFriendsActivity.class);
        intent.putExtra("bundle_recommend_count", i);
        intent.putExtra("bundle_recommend_user_type", i2);
        intent.putExtra("request_id", str);
        return intent;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo60535a(int i, User user, int i2, View view, String str) {
        int i3;
        String str2;
        String str3;
        if (i == 101) {
            C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "find_friends").mo59973a("to_user_id", user.getUid()).mo59973a("enter_method", "card").mo59973a("rec_reason", user.getRecommendReason()).mo59975b().f60753a);
            String str4 = "follow_card";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", "find_friends").mo59973a("rec_uid", user.getUid()).mo59973a("event_type", "enter_profile").mo59970a("impr_order", i2).mo59973a("req_id", (String) this.f79158k.get(i2)).mo59973a("trigger_reason", "friend_rec_message").mo59973a("rec_reason", user.getRecommendReason());
            String str5 = "card_type";
            if (user.isNewRecommend()) {
                str3 = "new";
            } else {
                str3 = "past";
            }
            C6907h.m21524a(str4, (Map) a.mo59973a(str5, str3).f60753a);
            UserProfileActivity.m117390a((Context) this, user, "find_friends", this.f79162o, "main_head");
            m98618a(i2);
        } else if (i == 100 && isViewValid()) {
            if (!C30165l.m98795a(this)) {
                C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
                return;
            }
            if (user.getFollowStatus() != 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i4 = i3 ^ 1;
            C42961az.m136380a(new C23658a(i4, user));
            if (this.f79152e != null && i4 == 1) {
                C33228ab.m107200a("follow").mo85057b("enter_from", "find_friends").mo85057b("to_user_id", user.getUid()).mo85057b("enter_method", "card").mo85057b("rec_reason", user.getRecommendReason()).mo85058h().mo85252e();
                C33229a b = C33228ab.m107200a("follow_card").mo85057b("enter_from", "find_friends").mo85057b("rec_uid", user.getUid()).mo85057b("event_type", "follow").mo85057b("rec_reason", user.getRecommendReason()).mo85057b("impr_order", String.valueOf(i2)).mo85057b("req_id", (String) this.f79158k.get(i2)).mo85057b("trigger_reason", "friend_rec_message").mo85057b("rec_reason", user.getRecommendReason());
                String str6 = "card_type";
                if (user.isNewRecommend()) {
                    str2 = "new";
                } else {
                    str2 = "past";
                }
                b.mo85057b(str6, str2).mo85252e();
            }
        }
    }
}
