package com.p280ss.android.ugc.aweme.feed.guide;

import android.app.Activity;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.ButtonStyle;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.local.JSONParseException;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.C23389b;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23661d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.common.p1142c.C25664e;
import com.p280ss.android.ugc.aweme.experiment.C27689c;
import com.p280ss.android.ugc.aweme.experiment.RecommendSuperAccountExperiment;
import com.p280ss.android.ugc.aweme.feed.adapter.C28143ao;
import com.p280ss.android.ugc.aweme.feed.adapter.SuperRecommendViewHolder;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28446ab;
import com.p280ss.android.ugc.aweme.feed.p1238ui.FeedFollowFragment;
import com.p280ss.android.ugc.aweme.feed.panel.C28588ab;
import com.p280ss.android.ugc.aweme.follow.p1259b.C29444b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.experiment.SuggestionFriendsEntranceTypeExperiment;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.p280ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.p280ss.android.ugc.aweme.friends.p1285ui.ContactsActivity;
import com.p280ss.android.ugc.aweme.friends.p1285ui.IAddFriendsActivity;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainFragment;
import com.p280ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendCommonUserView.C36620a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserAdapter.C36630b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.RecommendUserCardViewHolder;
import com.p280ss.android.ugc.aweme.profile.presenter.C36004ad;
import com.p280ss.android.ugc.aweme.profile.presenter.C36042p;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import com.p280ss.android.ugc.aweme.utils.C42925am.C42929a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2 */
public class EmptyGuideV2 implements C0042h, C25663d<RecommendUserCardViewHolder>, C25664e<SuperRecommendViewHolder>, C28393i, C28588ab, C36042p {

    /* renamed from: a */
    public static final String f74719a = "EmptyGuideV2";

    /* renamed from: b */
    public RecommendCommonUserView f74720b;

    /* renamed from: c */
    public Activity f74721c;

    /* renamed from: d */
    public String f74722d;

    /* renamed from: e */
    public C34029b f74723e;

    /* renamed from: f */
    public C28395k f74724f = C28395k.f74837a;

    /* renamed from: g */
    private final View f74725g;

    /* renamed from: h */
    private SimpleDMTDefaultView f74726h;

    /* renamed from: i */
    private DmtStatusView f74727i;

    /* renamed from: j */
    private RecommendSuperUserView f74728j;

    /* renamed from: k */
    private List<String> f74729k;

    /* renamed from: l */
    private C23389b f74730l;

    /* renamed from: a */
    public final View mo72032a() {
        return this.f74725g;
    }

    /* renamed from: a */
    public final void mo72039a(boolean z) {
        m93193e();
        if (z || C27689c.m90842b()) {
            m93195g();
        } else {
            m93194f();
        }
    }

    /* renamed from: a */
    public final void mo72038a(Exception exc) {
        if (this.f74727i != null) {
            this.f74727i.setVisibility(8);
        }
        if (this.f74730l != null) {
            this.f74730l.setRefreshing(false);
        }
        if (exc instanceof JSONParseException) {
            mo72040b();
        } else {
            C22814a.m75244a((Context) this.f74721c, (Throwable) exc);
        }
    }

    /* renamed from: a */
    public final void mo72037a(SuperAccountList superAccountList) {
        if (this.f74727i != null) {
            this.f74727i.mo25939d();
        }
        if (superAccountList == null || superAccountList.getUserList() == null || superAccountList.getUserList().size() <= 0) {
            mo72040b();
            return;
        }
        this.f74722d = superAccountList.logPb.getImprId();
        ArrayList arrayList = new ArrayList();
        for (UserWithAweme userWithAweme : superAccountList.getUserList()) {
            if (!(userWithAweme == null || userWithAweme.getUser() == null || userWithAweme.getAweme() == null)) {
                arrayList.add(userWithAweme);
            }
        }
        this.f74728j.setData(arrayList);
        this.f74728j.f74764c.f74738a = 0;
        this.f74728j.setOnItemOperationListener(new C36630b() {
            /* renamed from: b */
            public final void mo72051b(User user, int i) {
            }

            /* renamed from: d */
            public final void mo72053d(User user, int i) {
                C34138b.m109981a(user, "enter_profile", EmptyGuideV2.this.mo72031a(user), EmptyGuideV2.this.f74722d, "cold_launch");
                C34138b.m109986a(EmptyGuideV2.this.f74722d, user);
            }

            /* renamed from: a */
            public final void mo72050a(User user, int i) {
                C34138b.m109981a(user, "delete", EmptyGuideV2.this.mo72031a(user), EmptyGuideV2.this.f74722d, "cold_launch");
                if (EmptyGuideV2.this.f74723e != null) {
                    ((C28446ab) EmptyGuideV2.this.f74723e).mo72178a(user);
                }
            }

            /* renamed from: c */
            public final void mo72052c(User user, int i) {
                if (user.getFollowStatus() == 0) {
                    C34138b.m109981a(user, "follow", EmptyGuideV2.this.mo72031a(user), EmptyGuideV2.this.f74722d, "cold_launch");
                    C34138b.m109979a(user);
                    return;
                }
                C34138b.m109981a(user, "follow_cancel", EmptyGuideV2.this.mo72031a(user), EmptyGuideV2.this.f74722d, "cold_launch");
                C34138b.m109998b(user);
            }
        });
        m93199k();
    }

    /* renamed from: d */
    public final void mo72045d() {
        m93191b(true);
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
        this.f74728j.mo72063c();
    }

    /* renamed from: c */
    public final void mo72043c() {
        mo72039a(C6861a.m21337f().isLogin());
        m93192c(true);
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        if (this.f74727i != null) {
            this.f74727i.setVisibility(8);
        }
    }

    /* renamed from: j */
    private boolean m93198j() {
        if ((this.f74720b == null || this.f74720b.getVisibility() != 0) && (this.f74728j == null || this.f74728j.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        if (m93189a(this.f74721c) && this.f74728j != null && this.f74728j.getVisibility() == 0) {
            this.f74728j.mo72062b();
        }
    }

    /* renamed from: e */
    private void m93193e() {
        this.f74726h.mo72088f((int) C9738o.m28708b((Context) this.f74721c, 7.0f)).mo72089g((int) C9738o.m28708b((Context) this.f74721c, 16.0f)).mo72087e(C9738o.m28709b((Context) this.f74721c) / 5).mo72084b((int) C9738o.m28708b((Context) this.f74721c, 247.0f)).mo72078a();
    }

    /* renamed from: g */
    private void m93195g() {
        if (!((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isNeedContactsFriends(true) || ((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo59877d()).booleanValue()) {
            m93197i();
        } else {
            m93196h();
        }
    }

    /* renamed from: h */
    private void m93196h() {
        m93197i();
        if (((Boolean) SharePrefCache.inst().getIsEuropeCountry().mo59877d()).booleanValue() || C27689c.m90842b()) {
            this.f74726h.mo72083b();
        } else {
            this.f74726h.mo72081a(ButtonStyle.SOLID, R.drawable.a7h, R.string.agd).mo72080a((OnClickListener) new C28389d(this));
        }
    }

    /* renamed from: f */
    private void m93194f() {
        if (MainTabStripSwipeSwitchExperiment.INSTANCE.getEnableSwipeMode()) {
            this.f74726h.mo72082a("").mo72087e((C9738o.m28709b((Context) this.f74721c) - ((int) C9738o.m28708b((Context) this.f74721c, 172.0f))) / 2).mo72084b((int) C9738o.m28708b((Context) this.f74721c, 180.0f)).mo72086d(R.string.d7y).mo72079a((int) R.drawable.axg).mo72081a(ButtonStyle.SOLID, -1, R.string.d7x).mo72080a((OnClickListener) new C28387b(this));
        } else {
            this.f74726h.mo72085c(R.string.cnb).mo72086d(R.string.b8c).mo72081a(ButtonStyle.SOLID, -1, R.string.c5o).mo72080a((OnClickListener) new C28388c(this));
        }
    }

    /* renamed from: i */
    private void m93197i() {
        int i;
        if (C27689c.m90842b()) {
            this.f74726h.mo72085c(R.string.b81).mo72086d(R.string.b7z).mo72090h(20).mo72087e(((int) C9738o.m28708b((Context) this.f74721c, 80.0f)) + (C9738o.m28709b((Context) this.f74721c) / 20)).mo72088f((int) C9738o.m28708b((Context) this.f74721c, 12.0f)).mo72083b();
            return;
        }
        if (C6861a.m21337f().isLogin()) {
            i = C6861a.m21337f().getCurUser().getFollowingCount();
        } else {
            i = 0;
        }
        if (i == 0) {
            this.f74726h.mo72085c(R.string.b8l);
        } else {
            this.f74726h.mo72082a("");
        }
        this.f74726h.mo72086d(R.string.b8c).mo72083b();
    }

    /* renamed from: k */
    private void m93199k() {
        if (this.f74730l != null) {
            this.f74730l.setRefreshing(false);
        }
        if (this.f74724f.mo72128b()) {
            mo72039a(C6861a.m21337f().isLogin());
            if (C27689c.m90841a()) {
                this.f74728j.setVisibility(0);
                this.f74728j.setOnViewFirstShowListener(this);
            } else {
                this.f74720b.setVisibility(0);
                this.f74720b.setReminderText(R.string.d7o);
                this.f74720b.setBackgroundResource(R.color.ayd);
                this.f74720b.setOnViewAttachedToWindowListener(this);
            }
            this.f74724f.mo72130d();
        }
    }

    /* renamed from: b */
    public final void mo72040b() {
        if (this.f74730l != null) {
            this.f74730l.setRefreshing(false);
        }
        if (this.f74724f.mo72128b()) {
            if (C27689c.m90841a()) {
                this.f74728j.setVisibility(8);
                this.f74728j.mo72063c();
            } else {
                this.f74720b.setVisibility(8);
            }
            mo72039a(C6861a.m21337f().isLogin());
            this.f74724f.mo72131e();
        }
    }

    /* renamed from: b */
    public final void mo72042b(RecommendList recommendList) {
        mo72036a(recommendList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo66550b(SuperRecommendViewHolder superRecommendViewHolder) {
        if (superRecommendViewHolder != null) {
            UserWithAweme userWithAweme = superRecommendViewHolder.f74044h;
            if (userWithAweme != null) {
                User user = userWithAweme.getUser();
                if (user != null) {
                    m93190b(user);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo72041b(View view) {
        C32656f.m105744a(this.f74721c, "homepage_follow", "click_follow_tab", (Bundle) null, (C23305g) new C23305g() {
            /* renamed from: a */
            public final void mo58664a(Bundle bundle) {
            }

            /* renamed from: a */
            public final void mo58663a() {
                EmptyGuideV2.this.mo72039a(true);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo61737a(RecommendUserCardViewHolder recommendUserCardViewHolder) {
        if (recommendUserCardViewHolder != null) {
            User user = recommendUserCardViewHolder.f96181a;
            if (user != null) {
                m93190b(user);
            }
        }
    }

    /* renamed from: c */
    private void m93192c(boolean z) {
        boolean z2;
        RecommendCommonUserView recommendCommonUserView = this.f74720b;
        if (!C6861a.m21337f().isLogin() || !SuggestionFriendsEntranceTypeExperiment.shouldShowInSuggestion() || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        recommendCommonUserView.setShowLookMore(z2);
    }

    /* renamed from: a */
    private static boolean m93189a(Activity activity) {
        if (activity != null && (activity instanceof MainActivity)) {
            MainActivity mainActivity = (MainActivity) activity;
            if (mainActivity.isUnderMainTab() && (mainActivity.getCurFragment() instanceof MainFragment)) {
                MainFragment mainFragment = (MainFragment) mainActivity.getCurFragment();
                if (mainFragment.mUserVisibleHint && (mainFragment.mo84447b() instanceof FeedFollowFragment)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m93190b(User user) {
        if (this.f74729k == null) {
            this.f74729k = new ArrayList();
        }
        if (!this.f74729k.contains(user.getUid())) {
            C34138b.m109981a(user, "impression", mo72031a(user), this.f74722d, "cold_launch");
            this.f74729k.add(user.getUid());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo72044c(View view) {
        C32656f.m105744a(this.f74721c, "homepage_follow", "click_follow_tab", (Bundle) null, (C23305g) new C23305g() {
            /* renamed from: a */
            public final void mo58664a(Bundle bundle) {
            }

            /* renamed from: a */
            public final void mo58663a() {
                EmptyGuideV2.this.mo72039a(true);
                C42961az.m136380a(new C29444b());
            }
        });
    }

    /* renamed from: a */
    public final int mo72031a(User user) {
        int i;
        if (this.f74723e instanceof C36004ad) {
            i = ((C36004ad) this.f74723e).mo91625a(user.getUid());
        } else if (this.f74723e instanceof C28446ab) {
            i = ((C28446ab) this.f74723e).mo72176a(user.getUid());
        } else {
            i = 0;
        }
        if (user != null) {
            return i;
        }
        return 0;
    }

    /* renamed from: b */
    private void m93191b(boolean z) {
        String str;
        if (this.f74724f.mo72128b()) {
            mo72040b();
            if (this.f74730l != null && m93198j()) {
                this.f74730l.setRefreshing(true);
            }
            if (C27689c.m90841a()) {
                if (this.f74723e == null) {
                    this.f74723e = new C28446ab(new C28143ao(), this);
                }
                ((C28446ab) this.f74723e).mo72177a();
            } else if (z || this.f74723e == null || C27689c.m90842b()) {
                if (this.f74723e == null) {
                    this.f74723e = new C36004ad(new RecommendCommonUserModel(), this);
                }
                C36004ad adVar = (C36004ad) this.f74723e;
                if (C6861a.m21337f().isLogin()) {
                    str = C6861a.m21337f().getCurUserId();
                } else {
                    str = "0";
                }
                adVar.mo91628a(30, str, 2, C43161e.m136882a(), C43161e.m136884b(), C6384b.m19835a().mo15287a(RecommendSuperAccountExperiment.class, true, "show_super_accounts_to_unlogged_users", C6384b.m19835a().mo15295d().show_super_accounts_to_unlogged_users, 0));
            } else {
                return;
            }
            if (this.f74727i != null) {
                this.f74727i.mo25942f();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo72033a(View view) {
        if (this.f74721c != null) {
            C6907h.onEvent(MobClick.obtain().setEventName("phone_number").setLabelName("click"));
            Fragment c = this.f74724f.mo72129c();
            if (C42925am.m136275c(this.f74721c)) {
                Intent intent = new Intent(this.f74721c, ContactsActivity.class);
                if (c != null) {
                    c.startActivityForResult(intent, 1);
                } else {
                    this.f74721c.startActivity(intent);
                }
            } else {
                C10761a.m31409e((Context) this.f74721c, (int) R.string.i2).mo25750a();
                C42925am.m136271a(this.f74721c, (C42929a) new C42929a() {
                    /* renamed from: b */
                    public final void mo71409b() {
                    }

                    /* renamed from: a */
                    public final void mo71408a() {
                        Intent a = ContactsActivity.m98571a(EmptyGuideV2.this.f74721c, "", true);
                        Fragment c = EmptyGuideV2.this.f74724f.mo72129c();
                        if (c != null) {
                            c.startActivityForResult(a, 1);
                        } else {
                            EmptyGuideV2.this.f74721c.startActivity(a);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo72034a(C23389b bVar) {
        this.f74730l = bVar;
        mo72039a(C6861a.m21337f().isLogin());
        m93191b(false);
    }

    /* renamed from: a */
    public final void mo72035a(C23661d dVar) {
        if (dVar.f62380b instanceof User) {
            int i = 0;
            if (this.f74720b != null && !C6307b.m19566a((Collection<T>) this.f74720b.getData())) {
                List data = this.f74720b.getData();
                User user = (User) dVar.f62380b;
                int size = data.size();
                while (i < size) {
                    User user2 = (User) data.get(i);
                    if (TextUtils.equals(user2.getUid(), user.getUid())) {
                        user2.setFollowStatus(dVar.f62379a);
                        if (this.f74723e instanceof C36004ad) {
                            ((C36004ad) this.f74723e).mo91634a(data);
                            this.f74720b.mo92911a(data, user2.getRequestId());
                        }
                        return;
                    }
                    i++;
                }
            } else if (this.f74728j != null && !C6307b.m19566a((Collection<T>) this.f74728j.getMCardItems())) {
                List mCardItems = this.f74728j.getMCardItems();
                User user3 = (User) dVar.f62380b;
                int size2 = mCardItems.size();
                while (i < size2) {
                    User user4 = ((UserWithAweme) mCardItems.get(i)).getUser();
                    if (TextUtils.equals(user4.getUid(), user3.getUid())) {
                        user4.setFollowStatus(dVar.f62379a);
                        if (this.f74723e instanceof C28446ab) {
                            this.f74728j.mo72061a();
                        }
                        return;
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo72036a(RecommendList recommendList) {
        if (this.f74727i != null) {
            this.f74727i.mo25939d();
        }
        if (recommendList == null || recommendList.getUserList() == null || recommendList.getUserList().size() <= 0) {
            mo72040b();
            return;
        }
        this.f74722d = recommendList.getRid();
        this.f74720b.mo92911a(recommendList.getUserList(), recommendList.getRid());
        m93192c(recommendList.hasMore());
        if (C27689c.m90842b()) {
            this.f74720b.mo92909a();
        }
        this.f74720b.setOnItemOperationListener(new C36630b() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo72049a() {
                EmptyGuideV2.this.mo72040b();
            }

            /* renamed from: d */
            public final void mo72053d(User user, int i) {
                C34138b.m109981a(user, "enter_profile", EmptyGuideV2.this.mo72031a(user), EmptyGuideV2.this.f74722d, "cold_launch");
                C34138b.m109986a(EmptyGuideV2.this.f74722d, user);
            }

            /* renamed from: a */
            public final void mo72050a(User user, int i) {
                C34138b.m109981a(user, "delete", EmptyGuideV2.this.mo72031a(user), EmptyGuideV2.this.f74722d, "cold_launch");
                if (EmptyGuideV2.this.f74723e != null) {
                    ((C36004ad) EmptyGuideV2.this.f74723e).mo91633a(user);
                }
            }

            /* renamed from: b */
            public final void mo72051b(User user, int i) {
                if (C6861a.m21337f().isLogin()) {
                    ((C36004ad) EmptyGuideV2.this.f74723e).mo91627a(30, C6861a.m21337f().getCurUserId(), 2, C43161e.m136882a(), C43161e.m136884b());
                } else {
                    EmptyGuideV2.this.f74720b.post(new C28390e(this));
                }
            }

            /* renamed from: c */
            public final void mo72052c(User user, int i) {
                if (user.getFollowStatus() == 0) {
                    C34138b.m109981a(user, "follow", EmptyGuideV2.this.mo72031a(user), EmptyGuideV2.this.f74722d, "cold_launch");
                    C34138b.m109979a(user);
                    return;
                }
                C34138b.m109981a(user, "follow_cancel", EmptyGuideV2.this.mo72031a(user), EmptyGuideV2.this.f74722d, "cold_launch");
                C34138b.m109998b(user);
            }
        });
        this.f74720b.setOnLookMoreUserListener(new C36620a() {
            /* renamed from: a */
            public final void mo72054a(String str, boolean z) {
                EmptyGuideV2.this.f74721c.startActivity(IAddFriendsActivity.m98617a(EmptyGuideV2.this.f74721c, -1, 2, str));
                C34138b.m110012d("click_card", "cold_launch_non_login");
            }
        });
        m93199k();
    }

    public EmptyGuideV2(Fragment fragment, C28395k kVar) {
        this.f74721c = fragment.getActivity();
        this.f74725g = LayoutInflater.from(this.f74721c).inflate(R.layout.m_, null);
        this.f74726h = (SimpleDMTDefaultView) this.f74725g.findViewById(R.id.a6y);
        this.f74720b = (RecommendCommonUserView) this.f74725g.findViewById(R.id.ed6);
        this.f74728j = (RecommendSuperUserView) this.f74725g.findViewById(R.id.ddi);
        this.f74727i = (DmtStatusView) this.f74725g.findViewById(R.id.dav);
        this.f74727i.setBuilder(C10803a.m31631a((Context) this.f74721c));
        mo72039a(C6861a.m21337f().isLogin());
        this.f74724f = kVar;
        fragment.getLifecycle().mo55a(this);
    }
}
