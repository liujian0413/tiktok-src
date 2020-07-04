package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Telephony.Sms;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.SectionIndexer;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.common.C6394b;
import com.bytedance.ies.dmt.p262ui.p562b.C10743b;
import com.bytedance.ies.dmt.p262ui.p562b.C10744c;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.adapter.C30022a;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.friends.adapter.FloatingBarItemDecoration;
import com.p280ss.android.ugc.aweme.friends.adapter.FriendsAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.FriendsViewHolder;
import com.p280ss.android.ugc.aweme.friends.model.ContactModel;
import com.p280ss.android.ugc.aweme.friends.model.Friend;
import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback;
import com.p280ss.android.ugc.aweme.friends.p1281a.C29999a;
import com.p280ss.android.ugc.aweme.friends.p1282b.C30036a;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30041c;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30041c.C30042a;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30041c.C30043b;
import com.p280ss.android.ugc.aweme.mobile.C33606d;
import com.p280ss.android.ugc.aweme.mobile.C33606d.C33607a;
import com.p280ss.android.ugc.aweme.p1003am.C22491a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38142a;
import com.p280ss.android.ugc.aweme.share.improve.p1542e.C38171a;
import com.p280ss.android.ugc.aweme.share.improve.pkg.InviteFriendSharePackage;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.C38379c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.ShareChannelBar;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import com.p280ss.android.ugc.aweme.utils.C42925am.C42929a;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.ugc.aweme.utils.permission.C43155b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity */
public class InviteFriendsActivity extends AmeSSActivity implements C6905a, C25675c<Friend>, C30042a {

    /* renamed from: q */
    private static String f79201q = "invite_friends";

    /* renamed from: a */
    public View f79202a;

    /* renamed from: b */
    View f79203b;

    /* renamed from: c */
    View f79204c;

    /* renamed from: d */
    ShareChannelBar f79205d;

    /* renamed from: e */
    public C30041c f79206e;

    /* renamed from: f */
    public FriendsAdapter<Friend> f79207f;

    /* renamed from: g */
    public C25674b<InviteContactFriendsModel> f79208g;

    /* renamed from: h */
    DividerItemDecoration f79209h;

    /* renamed from: i */
    public View f79210i;

    /* renamed from: j */
    public boolean f79211j;

    /* renamed from: k */
    public int f79212k;

    /* renamed from: l */
    public float f79213l;

    /* renamed from: m */
    public int f79214m = 0;
    TextView mBtnFloatInviteAll;
    View mBtnFloatInviteAllContainer;
    RecyclerView mListView;
    SwipeRefreshLayout mRefreshLayout;
    DmtStatusView mStatusView;
    TextTitleBar mTitleBar;

    /* renamed from: n */
    public boolean f79215n = false;

    /* renamed from: o */
    public boolean f79216o = false;

    /* renamed from: p */
    public List<Friend> f79217p = new ArrayList();

    /* renamed from: r */
    private InviteContactFriendsModel f79218r = new InviteContactFriendsModel("contact");

    /* renamed from: s */
    private FloatingBarItemDecoration f79219s;

    /* renamed from: t */
    private ValueAnimator f79220t;

    /* renamed from: u */
    private AnimatorListener f79221u = new AnimatorListener() {
        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            InviteFriendsActivity.this.mListView.setPadding(0, 0, 0, 0);
        }
    };

    /* renamed from: v */
    private AnimatorListener f79222v = new AnimatorListener() {
        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            InviteFriendsActivity.this.mListView.setPadding(0, 0, 0, (int) InviteFriendsActivity.this.f79213l);
        }
    };

    /* renamed from: w */
    private C29999a f79223w = new C29999a() {
        /* renamed from: a */
        public final boolean mo76197a(String str, String str2, int i, int i2) {
            return false;
        }

        /* renamed from: a */
        public final boolean mo76196a(final Friend friend) {
            if (InviteFriendsActivity.this.f79217p.contains(friend)) {
                return false;
            }
            InviteFriendsActivity.this.f79217p.add(friend);
            final ContactModel contactModel = new ContactModel(friend.getSocialName(), friend.getNickname());
            if (C30036a.m98493b().mo76284c() > 0) {
                User curUser = C21115b.m71197a().getCurUser();
                InviteFriendsActivity.this.f79206e.mo76294a(curUser, Arrays.asList(new ContactModel[]{contactModel}), "invite_friends", new InviteFriendsCallback() {
                    public final void onSuccess() {
                        if (InviteFriendsActivity.this.isViewValid()) {
                            friend.setInvited(true);
                            InviteFriendsActivity.this.f79217p.remove(friend);
                            int a = InviteFriendsActivity.this.f79207f.mo76209a(contactModel) + 1;
                            if (a != -1) {
                                FriendsViewHolder friendsViewHolder = (FriendsViewHolder) InviteFriendsActivity.this.mListView.mo5575f(a);
                                if (friendsViewHolder != null) {
                                    friendsViewHolder.mo76221b();
                                }
                            }
                            ((InviteContactFriendsModel) InviteFriendsActivity.this.f79208g.mo66539h()).addInvitedContact(friend.getSocialName());
                        }
                    }

                    public final void onFailed(String str) {
                        InviteFriendsActivity.this.f79217p.remove(friend);
                        C10761a.m31399c((Context) InviteFriendsActivity.this, (int) R.string.dyk).mo25750a();
                    }
                });
            } else {
                InviteFriendsActivity.this.mo76531a(contactModel);
                friend.setInvited(true);
                InviteFriendsActivity.this.f79217p.remove(friend);
                int a = InviteFriendsActivity.this.f79207f.mo76209a(contactModel) + 1;
                if (a != -1) {
                    FriendsViewHolder friendsViewHolder = (FriendsViewHolder) InviteFriendsActivity.this.mListView.mo5575f(a);
                    if (friendsViewHolder != null) {
                        friendsViewHolder.mo76221b();
                    }
                }
                ((InviteContactFriendsModel) InviteFriendsActivity.this.f79208g.mo66539h()).addInvitedContact(friend.getSocialName());
            }
            C6907h.m21524a("invite_friend_click", (Map) C22984d.m75611a().mo59973a("enter_from", "invite_friends").f60753a);
            return true;
        }
    };

    public final void aE_() {
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
    }

    public final void bd_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<Friend> list, boolean z) {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: a */
    public final void mo76534a(boolean z) {
        if (this.f79220t != null && this.f79220t.isRunning()) {
            this.f79220t.cancel();
        }
        if (z) {
            this.f79220t = ValueAnimator.ofFloat(new float[]{this.mBtnFloatInviteAllContainer.getTranslationY(), 0.0f});
        } else {
            this.f79220t = ValueAnimator.ofFloat(new float[]{this.mBtnFloatInviteAllContainer.getTranslationY(), this.f79213l});
        }
        this.f79220t.setDuration(500);
        this.f79220t.addUpdateListener(new C30169p(this));
        this.f79220t.addListener(z ? this.f79222v : this.f79221u);
        this.f79220t.setInterpolator(z ? new C10743b() : new C10744c());
        this.f79220t.start();
    }

    /* renamed from: a */
    public final void mo59099a(List<Friend> list, boolean z) {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (list == null) {
                this.mStatusView.setVisibility(0);
            } else {
                this.f79207f.ai_();
                List<String> list2 = ((InviteContactFriendsModel) this.f79208g.mo66539h()).mIndexLetters;
                List<Integer> list3 = ((InviteContactFriendsModel) this.f79208g.mo66539h()).mIndexCounts;
                if (this.f79219s != null) {
                    this.mListView.mo5542b((C1272h) this.f79219s);
                    this.f79219s = null;
                }
                if (!list2.isEmpty() && !list3.isEmpty()) {
                    C30022a a = m98657a(list2, list3);
                    this.f79219s = new FloatingBarItemDecoration(this, a, this.f79207f.mo61150d());
                    this.mListView.mo5525a((C1272h) this.f79219s);
                    this.f79207f.mo76211a((SectionIndexer) a);
                }
                this.f79207f.mo58045a(list);
                this.mStatusView.mo25939d();
                this.mStatusView.setVisibility(4);
                m98660c(z);
            }
            this.f79214m = 0;
            mo76303e();
            C9738o.m28712b((View) this.mRefreshLayout, 0);
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid()) {
        }
    }

    public void finish() {
        super.finish();
        C22491a.m74384a(this);
    }

    public final void aD_() {
        if (isViewValid()) {
            this.f79207f.ag_();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo76538j() {
        if (this.f79208g != null) {
            this.f79208g.mo56976a(Integer.valueOf(1));
            return;
        }
        this.mRefreshLayout.setRefreshing(false);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f79220t != null && this.f79220t.isRunning()) {
            this.f79220t.cancel();
        }
    }

    /* renamed from: e */
    public final void mo76303e() {
        int i;
        View view = this.f79210i;
        int i2 = 0;
        if (m98659b(false)) {
            i = 0;
        } else {
            i = 8;
        }
        C9738o.m28712b(view, i);
        View view2 = this.mBtnFloatInviteAllContainer;
        if (!m98659b(true)) {
            i2 = 8;
        }
        C9738o.m28712b(view2, i2);
    }

    /* renamed from: f */
    public final void mo76535f() {
        C7163a.m22363a();
        if (C42925am.m136275c(this)) {
            mo76537h();
            mo76536g();
            return;
        }
        C6907h.m21524a("contact_notify_show", (Map) C22984d.m75611a().mo59973a("pop_logic", "bond_phone").mo59973a("enter_from", "invite_friends").f60753a);
        C42925am.m136271a((Activity) this, (C42929a) new C42929a() {
            /* access modifiers changed from: 0000 */
            /* renamed from: c */
            public final /* synthetic */ void mo76542c() {
                InviteFriendsActivity.this.f79211j = true;
            }

            /* renamed from: a */
            public final void mo71408a() {
                C6907h.m21524a("contact_notify_confirm", (Map) C22984d.m75611a().mo59973a("enter_from", "invite_friends").f60753a);
                InviteFriendsActivity.this.mo76537h();
                InviteFriendsActivity.this.mo76536g();
            }

            /* renamed from: b */
            public final void mo71409b() {
                C43155b.m136879a(R.string.cm3, R.string.cm2, InviteFriendsActivity.this, new C30171r(this));
            }
        });
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onResume", true);
        super.onResume();
        if (this.f79211j) {
            this.f79211j = false;
            if (C42925am.m136275c(this)) {
                mo76537h();
                mo76536g();
            } else {
                finish();
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onResume", false);
    }

    public final void ae_() {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f79207f.mo58045a(null);
            this.f79207f.ai_();
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo25943g();
            if (this.f79205d.getVisibility() != 8) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mStatusView.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) C9738o.m28708b((Context) this, 134.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                this.mStatusView.setLayoutParams(marginLayoutParams);
            }
            C9738o.m28712b(this.f79210i, 8);
            C9738o.m28712b((View) this.mRefreshLayout, 0);
        }
    }

    /* renamed from: g */
    public final void mo76536g() {
        C9738o.m28712b(this.f79204c, 0);
        C9738o.m28712b(this.f79203b, 0);
        C9738o.m28712b((View) this.f79205d, 0);
        InviteFriendSharePackage b = InviteFriendSharePackage.m122006b(this.f79206e);
        C38382b bVar = new C38382b();
        C37984ap.m121301a().injectUniversalConfig(bVar, this, true);
        bVar.mo95964a((SharePackage) b).mo95963a((C38343b) new C38142a());
        C38380c a = bVar.mo95972a();
        if (a.f99631d) {
            Iterator it = a.f99628a.iterator();
            while (it.hasNext()) {
                if (!((C38343b) it.next()).mo95743a(this)) {
                    it.remove();
                }
            }
        }
        if (!C38037a.m121403a() && a.f99628a.size() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = a.f99628a.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C38171a((C38343b) it2.next()));
                it2.remove();
            }
            a.f99628a.addAll(arrayList);
        }
        this.f79205d.mo95959a(a.f99628a);
        this.f79205d.mo95958a((C38379c) new C30166m(this, b));
    }

    /* renamed from: h */
    public final void mo76537h() {
        int i;
        C9738o.m28712b((View) this.mStatusView, 0);
        this.mStatusView.mo25942f();
        this.f79207f = new FriendsAdapter<>(0, this.f79223w);
        this.f79207f.mo66504a((C6905a) this);
        this.f79207f.f67550q = getResources().getColor(R.color.a53);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.mo5427b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.setOverScrollMode(2);
        this.f79202a = LayoutInflater.from(this).inflate(R.layout.s0, this.mListView, false);
        this.f79207f.mo61149c_(this.f79202a);
        this.f79210i = this.f79202a.findViewById(R.id.b2s);
        this.f79203b = this.f79202a.findViewById(R.id.b2u);
        this.f79204c = this.f79202a.findViewById(R.id.b2y);
        this.f79205d = (ShareChannelBar) this.f79202a.findViewById(R.id.bse);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getColor(R.color.a02), (int) C9738o.m28708b((Context) this, 0.5f), 1, C9738o.m28708b((Context) this, 20.0f), C9738o.m28708b((Context) this, 20.0f));
        this.f79209h = dividerItemDecoration;
        this.mListView.mo5525a((C1272h) this.f79209h);
        this.mListView.setAdapter(this.f79207f);
        View view = this.f79203b;
        Resources resources = getResources();
        if (C6394b.m19908c()) {
            i = R.color.ax0;
        } else {
            i = R.color.awz;
        }
        view.setBackgroundColor(resources.getColor(i));
        this.mRefreshLayout.setOnRefreshListener(new C30167n(this));
        this.f79208g = new C25674b<>();
        this.f79208g.mo66537a(this);
        this.f79208g.mo66536a(this.f79218r);
        this.f79208g.mo56976a(Integer.valueOf(1));
        this.f79206e.mo76293a();
        C30168o oVar = new C30168o(this);
        this.mBtnFloatInviteAll.setOnClickListener(oVar);
        this.f79210i.setOnClickListener(oVar);
        this.f79213l = C9738o.m28708b((Context) this, 84.0f);
        this.mBtnFloatInviteAllContainer.setTranslationY(this.f79213l);
        this.mListView.mo5528a((C1281m) new C1281m() {
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                boolean z;
                super.onScrolled(recyclerView, i, i2);
                InviteFriendsActivity.this.f79214m += i2;
                if (InviteFriendsActivity.this.f79214m < 0) {
                    InviteFriendsActivity.this.f79214m = 0;
                }
                if (InviteFriendsActivity.this.mBtnFloatInviteAllContainer.getVisibility() == 0) {
                    int j = ((LinearLayoutManager) recyclerView.getLayoutManager()).mo5445j();
                    int computeVerticalScrollOffset = InviteFriendsActivity.this.mListView.computeVerticalScrollOffset();
                    StringBuilder sb = new StringBuilder(" scrollY = ");
                    sb.append(computeVerticalScrollOffset);
                    sb.append(", ");
                    if (computeVerticalScrollOffset > InviteFriendsActivity.this.f79212k) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    if (InviteFriendsActivity.this.f79212k <= 0) {
                        int measuredHeight = InviteFriendsActivity.this.f79202a.getMeasuredHeight();
                        if (measuredHeight > 0) {
                            InviteFriendsActivity.this.f79212k = measuredHeight;
                        } else {
                            return;
                        }
                    }
                    if (j > 0) {
                        if (i2 > 0 && !InviteFriendsActivity.this.f79215n) {
                            InviteFriendsActivity.this.mo76534a(true);
                            InviteFriendsActivity.this.f79215n = true;
                        }
                    } else if (i2 < 0 && InviteFriendsActivity.this.f79215n) {
                        InviteFriendsActivity.this.mo76534a(false);
                        InviteFriendsActivity.this.f79215n = false;
                    }
                }
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76529a(ValueAnimator valueAnimator) {
        this.mBtnFloatInviteAllContainer.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: c */
    private void m98660c(boolean z) {
        if (!z) {
            if (C6399b.m19944t()) {
                this.f79207f.mo66516d(false);
            } else {
                this.f79207f.ah_();
            }
            this.f79207f.mo66504a((C6905a) null);
            return;
        }
        this.f79207f.ai_();
    }

    /* renamed from: b */
    private boolean m98659b(boolean z) {
        if (C30036a.m98493b().mo76284c() <= 0) {
            return false;
        }
        if (z) {
            if (!this.f79206e.mo76298c()) {
                return false;
            }
        } else if (!this.f79206e.mo76297b()) {
            return false;
        }
        if (this.f79207f != null) {
            List a = this.f79207f.mo62312a();
            if (a == null || a.size() > this.f79206e.mo76299d() || a.isEmpty()) {
                return false;
            }
        }
        if (SharePrefCache.inst().getLastInviteAllTimeStamp() + 604800000 <= System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (this.f79207f.mo62312a() == null) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo25943g();
                if (this.f79205d.getVisibility() != 8) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mStatusView.getLayoutParams();
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) C9738o.m28708b((Context) this, 134.0f), marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    this.mStatusView.setLayoutParams(marginLayoutParams);
                }
                C9738o.m28712b(this.f79210i, 8);
            }
            C9738o.m28712b((View) this.mRefreshLayout, 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76530a(View view) {
        if (isViewValid() && this.f79207f != null && this.f79206e != null && !this.f79216o) {
            List<Friend> a = this.f79207f.mo62312a();
            if (!C6307b.m19566a((Collection<T>) a)) {
                ArrayList arrayList = new ArrayList(a.size());
                for (Friend friend : a) {
                    if (friend != null) {
                        arrayList.add(new ContactModel(friend.getSocialName(), friend.getNickname()));
                    }
                }
                User curUser = C21115b.m71197a().getCurUser();
                this.f79216o = true;
                this.f79206e.mo76294a(curUser, arrayList, "invite_friends", new InviteFriendsCallback() {
                    public final void onSuccess() {
                        InviteFriendsActivity.this.f79216o = false;
                        if (InviteFriendsActivity.this.isViewValid()) {
                            C9738o.m28712b(InviteFriendsActivity.this.f79210i, 8);
                            C9738o.m28712b(InviteFriendsActivity.this.mBtnFloatInviteAllContainer, 8);
                            InviteFriendsActivity.this.mListView.setPadding(0, 0, 0, 0);
                            SharePrefCache.inst().setLastInviteAllTimeStamp(System.currentTimeMillis());
                            C10761a.m31399c((Context) InviteFriendsActivity.this, (int) R.string.dyl).mo25750a();
                        }
                    }

                    public final void onFailed(String str) {
                        InviteFriendsActivity.this.f79216o = false;
                        C10761a.m31399c((Context) InviteFriendsActivity.this, (int) R.string.dyk).mo25750a();
                    }
                });
                C6907h.m21524a("invite_all", (Map) C22984d.m75611a().mo59970a("invite_num", arrayList.size()).f60753a);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ce);
        if (getIntent().hasExtra("enter_from")) {
            f79201q = getIntent().getStringExtra("enter_from");
        }
        User curUser = C21115b.m71197a().getCurUser();
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                InviteFriendsActivity.this.onBackPressed();
            }
        });
        this.mTitleBar.setTitle(getText(R.string.bv6));
        this.mTitleBar.setTitleColor(getResources().getColor(R.color.a5d));
        this.mStatusView.setBuilder(C10803a.m31631a((Context) this).mo25953a().mo25955a((int) R.string.bzv, (int) R.string.b0p));
        this.f79206e = new C30041c(this.f79218r, this);
        if (curUser.isPhoneBinded()) {
            mo76535f();
        } else {
            C6907h.m21524a("phone_bundling_show", (Map) C22984d.m75611a().mo59973a("enter_from", "invite_friends").f60753a);
            C33606d dVar = new C33606d(this, new C33607a() {
                /* renamed from: b */
                public final void mo76541b(Dialog dialog) {
                    InviteFriendsActivity.this.mo76535f();
                }

                /* renamed from: a */
                public final void mo76540a(Dialog dialog) {
                    C6907h.m21524a("phone_bundling_click", (Map) C22984d.m75611a().mo59973a("enter_from", "invite_friends").f60753a);
                    InviteFriendsActivity.this.mo76535f();
                }
            }, null);
            dVar.f87722a = "invite_friends";
            dVar.mo85938a();
        }
        C25713b.m84475a(findViewById(R.id.dal));
        if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isNeedLightStatusBar()) {
            C43098ej.m136715c(this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo76531a(ContactModel contactModel) {
        User curUser = C21115b.m71197a().getCurUser();
        this.f79206e.mo76295a(C30041c.m98501a(this.f79206e.mo76300e(), "", "invitesinglesms", "invite_friends", true), (C30043b) new C30170q(this, curUser, contactModel));
    }

    /* renamed from: a */
    public static Intent m98656a(Context context, String str) {
        Intent intent = new Intent(context, InviteFriendsActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str);
        }
        return intent;
    }

    /* renamed from: b */
    public final void mo59108b(List<Friend> list, boolean z) {
        if (isViewValid()) {
            this.f79207f.ai_();
            this.f79207f.mo61577b(list);
            this.mStatusView.setVisibility(4);
            m98660c(z);
            mo76303e();
        }
    }

    /* renamed from: a */
    private static C30022a m98657a(List<String> list, List<Integer> list2) {
        int[] iArr = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            iArr[i] = ((Integer) list2.get(i)).intValue();
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return new C30022a(strArr, iArr);
    }

    /* renamed from: a */
    private static boolean m98658a(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76533a(InviteFriendSharePackage inviteFriendSharePackage, C38343b bVar) {
        if (!inviteFriendSharePackage.mo18861a(bVar, (Context) this)) {
            bVar.mo71406a(inviteFriendSharePackage.mo18860a(bVar), (Context) this);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76532a(User user, ContactModel contactModel, String str) {
        Intent intent;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f79206e.mo76292a(C43122ff.m136789t(user)));
        sb.append(str);
        String sb2 = sb.toString();
        if (VERSION.SDK_INT >= 19) {
            StringBuilder sb3 = new StringBuilder("smsto:");
            sb3.append(contactModel.phoneNumber);
            intent = new Intent("android.intent.action.SENDTO", Uri.parse(sb3.toString()));
            intent.putExtra("sms_body", sb2);
            intent.setPackage(Sms.getDefaultSmsPackage(this));
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setType("vnd.android-dir/mms-sms");
            intent.putExtra("address", contactModel.phoneNumber);
            intent.putExtra("sms_body", sb2);
        }
        try {
            if (m98658a(getApplicationContext(), intent)) {
                startActivity(intent);
            } else {
                C30172s.m98800a(Toast.makeText(getApplicationContext(), R.string.bv2, 1));
            }
        } catch (Exception unused) {
        }
    }
}
