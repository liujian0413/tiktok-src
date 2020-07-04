package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.provider.Telephony.Sms;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.captcha.C23637b;
import com.p280ss.android.ugc.aweme.captcha.p1080c.C23645b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.friends.adapter.FriendsAdapter;
import com.p280ss.android.ugc.aweme.friends.adapter.FriendsViewHolder;
import com.p280ss.android.ugc.aweme.friends.model.ContactModel;
import com.p280ss.android.ugc.aweme.friends.model.Friend;
import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.p280ss.android.ugc.aweme.friends.model.InviteContactFriendsModel.InviteFriendsCallback;
import com.p280ss.android.ugc.aweme.friends.model.ThirdPartyFriendModel;
import com.p280ss.android.ugc.aweme.friends.p1281a.C29999a;
import com.p280ss.android.ugc.aweme.friends.p1282b.C30036a;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30041c;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30041c.C30043b;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.p1003am.C22491a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j.C36034a;
import com.p280ss.android.ugc.aweme.profile.presenter.C36040n;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import com.p280ss.android.ugc.aweme.utils.C42925am.C42929a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.p280ss.android.ugc.aweme.utils.permission.C43155b;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ContactsActivity */
public class ContactsActivity extends AmeSSActivity implements C6905a, C25675c, C36040n {

    /* renamed from: a */
    public FriendsAdapter<Friend> f79087a;

    /* renamed from: b */
    public C25674b<ThirdPartyFriendModel> f79088b;

    /* renamed from: c */
    public C36031j f79089c;

    /* renamed from: d */
    DividerItemDecoration f79090d;

    /* renamed from: e */
    public String f79091e = "";
    RelativeLayout enterBindRl;

    /* renamed from: f */
    public C30041c f79092f;

    /* renamed from: g */
    public List<Friend> f79093g = new ArrayList();

    /* renamed from: h */
    private boolean f79094h;

    /* renamed from: i */
    private InviteContactFriendsModel f79095i = new InviteContactFriendsModel("contact");
    ImageView ivBindPhone;

    /* renamed from: j */
    private C29999a f79096j = new C29999a() {
        /* renamed from: a */
        public final boolean mo76196a(final Friend friend) {
            final ContactModel contactModel = new ContactModel(friend.getSocialName(), friend.getNickname());
            if (C30036a.m98493b().mo76284c() == 0) {
                friend.setInvited(true);
                ((ThirdPartyFriendModel) ContactsActivity.this.f79088b.mo66539h()).addInvitedContact(friend.getSocialName());
                int a = ContactsActivity.this.f79087a.mo76209a(contactModel);
                if (a != -1) {
                    FriendsViewHolder friendsViewHolder = (FriendsViewHolder) ContactsActivity.this.mListView.mo5575f(a);
                    if (friendsViewHolder != null) {
                        friendsViewHolder.mo76221b();
                    }
                }
                User curUser = C21115b.m71197a().getCurUser();
                ContactsActivity.this.f79092f.mo76295a(C30041c.m98501a(ContactsActivity.this.f79092f.mo76300e(), "", "invitesinglesms", "find_contact_friends", true), (C30043b) new C30158e(this, curUser, contactModel));
            } else if (ContactsActivity.this.f79093g.contains(friend)) {
                return false;
            } else {
                ContactsActivity.this.f79093g.add(friend);
                User curUser2 = C21115b.m71197a().getCurUser();
                ContactsActivity.this.f79092f.mo76294a(curUser2, Arrays.asList(new ContactModel[]{contactModel}), "find_contact_friends", new InviteFriendsCallback() {
                    public final void onSuccess() {
                        if (ContactsActivity.this.isViewValid()) {
                            friend.setInvited(true);
                            ContactsActivity.this.f79093g.remove(friend);
                            int a = ContactsActivity.this.f79087a.mo76209a(contactModel);
                            if (a != -1) {
                                FriendsViewHolder friendsViewHolder = (FriendsViewHolder) ContactsActivity.this.mListView.mo5575f(a);
                                if (friendsViewHolder != null) {
                                    friendsViewHolder.mo76221b();
                                }
                            }
                            ((ThirdPartyFriendModel) ContactsActivity.this.f79088b.mo66539h()).addInvitedContact(friend.getSocialName());
                        }
                    }

                    public final void onFailed(String str) {
                        ContactsActivity.this.f79093g.remove(friend);
                        C10761a.m31399c((Context) ContactsActivity.this, (int) R.string.dyk).mo25750a();
                    }
                });
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo76483a(User user, ContactModel contactModel, String str) {
            Intent intent;
            StringBuilder sb = new StringBuilder();
            sb.append(ContactsActivity.this.f79092f.mo76292a(C43122ff.m136789t(user)));
            sb.append(str);
            String sb2 = sb.toString();
            if (VERSION.SDK_INT >= 19) {
                StringBuilder sb3 = new StringBuilder("smsto:");
                sb3.append(contactModel.phoneNumber);
                intent = new Intent("android.intent.action.SENDTO", Uri.parse(sb3.toString()));
                intent.putExtra("sms_body", sb2);
                intent.setPackage(Sms.getDefaultSmsPackage(ContactsActivity.this));
            } else {
                intent = new Intent("android.intent.action.VIEW");
                intent.setType("vnd.android-dir/mms-sms");
                intent.putExtra("address", contactModel.phoneNumber);
                intent.putExtra("sms_body", sb2);
            }
            if (ContactsActivity.m98574a(ContactsActivity.this.getApplicationContext(), intent)) {
                ContactsActivity.this.startActivity(intent);
            } else {
                C30159f.m98793a(Toast.makeText(ContactsActivity.this.getApplicationContext(), R.string.bv2, 1));
            }
        }

        /* renamed from: a */
        public final boolean mo76197a(String str, String str2, int i, int i2) {
            if (!C30159f.m98794a((Context) ContactsActivity.this)) {
                C10761a.m31399c((Context) ContactsActivity.this, (int) R.string.cjs).mo25750a();
                return false;
            } else if (ContactsActivity.this.f79089c == null || ContactsActivity.this.f79089c.mo66540i()) {
                return false;
            } else {
                ContactsActivity.this.f79089c.mo91679a(new C36034a().mo91684a(str).mo91686b(str2).mo91682a(i2).mo91685b(4).mo91688c(ContactsActivity.this.f79091e).mo91689d(i).mo91681a());
                return true;
            }
        }
    };
    RecyclerView mListView;
    SwipeRefreshLayout mRefreshLayout;
    DmtStatusView mStatusView;
    TextTitleBar mTitleBar;

    public final void aE_() {
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List list, boolean z) {
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onFollowSuccess(FollowStatus followStatus) {
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C10994a.m32208b(this);
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
            this.f79087a.ag_();
        }
    }

    public void enterBindPhone() {
        C6861a.m21335d().bindMobile(this, "", null, null);
    }

    public final void bd_() {
        this.f79088b.mo56976a(Integer.valueOf(4));
    }

    public void closeBindPhoneHint() {
        this.enterBindRl.setVisibility(8);
        SharePrefCache.inst().getHasEnterBindPhone().mo59871a(Boolean.valueOf(true));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo76480f() {
        if (this.f79088b != null) {
            this.f79088b.mo56976a(Integer.valueOf(1));
            return;
        }
        this.mRefreshLayout.setRefreshing(false);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f79088b != null) {
            this.f79088b.mo59134U_();
        }
        if (this.f79089c != null) {
            this.f79089c.mo59134U_();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", true);
        super.onResume();
        if (this.f79094h) {
            m98575g();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onResume", false);
    }

    /* renamed from: g */
    private void m98575g() {
        this.f79094h = false;
        if (C42925am.m136275c(this)) {
            mo76478e();
            return;
        }
        C6907h.m21524a("contact_notify_show", (Map) C22984d.m75611a().mo59973a("pop_logic", "add_friend").mo59973a("enter_from", "contact").f60753a);
        C42925am.m136271a((Activity) this, (C42929a) new C42929a() {
            /* renamed from: b */
            public final void mo71409b() {
                C43155b.m136878a(R.string.cm3, R.string.cm2, ContactsActivity.this);
            }

            /* renamed from: a */
            public final void mo71408a() {
                C6907h.m21524a("contact_notify_confirm", (Map) C22984d.m75611a().mo59973a("enter_from", "contact").f60753a);
                ContactsActivity.this.mo76478e();
            }
        });
    }

    public final void ae_() {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            this.f79087a.mo58045a(null);
            this.f79087a.ai_();
            this.mStatusView.setVisibility(0);
            this.mStatusView.mo25943g();
        }
    }

    /* renamed from: e */
    public final void mo76478e() {
        C9738o.m28712b((View) this.mStatusView, 0);
        this.mStatusView.mo25942f();
        this.f79087a = new FriendsAdapter<>(0, this.f79096j);
        this.f79087a.mo66504a((C6905a) this);
        this.f79087a.f67550q = getResources().getColor(R.color.a53);
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(this);
        wrapLinearLayoutManager.mo5427b(1);
        this.mListView.setLayoutManager(wrapLinearLayoutManager);
        this.mListView.setOverScrollMode(2);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getColor(R.color.a02), (int) C9738o.m28708b((Context) this, 0.5f), 1, C9738o.m28708b((Context) this, 20.0f), C9738o.m28708b((Context) this, 20.0f));
        this.f79090d = dividerItemDecoration;
        this.mListView.mo5525a((C1272h) this.f79090d);
        this.mListView.setAdapter(this.f79087a);
        this.f79092f.mo76293a();
        this.mRefreshLayout.setOnRefreshListener(new C30157d(this));
        this.f79088b = new C25674b<>();
        this.f79088b.mo66537a(this);
        this.f79088b.mo66536a(new ThirdPartyFriendModel("contact"));
        this.f79088b.mo56976a(Integer.valueOf(1));
        this.f79089c = new C36031j();
        this.f79089c.mo66537a(this);
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        m98572a(followStatus);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76474a(DialogInterface dialogInterface) {
        if (!this.f79094h) {
            m98575g();
        }
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (this.f79087a.mo62312a() == null) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo25943g();
            }
        }
    }

    /* renamed from: a */
    private void m98572a(FollowStatus followStatus) {
        if (isViewValid()) {
            this.f79087a.mo76212a(followStatus);
            int a = this.f79087a.mo76210a(followStatus.userId);
            if (a != -1) {
                FriendsViewHolder friendsViewHolder = (FriendsViewHolder) this.mListView.mo5575f(a);
                if (friendsViewHolder != null) {
                    friendsViewHolder.mo76218a();
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo76477d(Exception exc) {
        C22814a.m75245a(this, exc, R.string.b82);
        int a = this.f79087a.mo76210a(this.f79089c.f94273d);
        if (a >= 0) {
            FriendsViewHolder friendsViewHolder = (FriendsViewHolder) this.mListView.mo5575f(a);
            if (friendsViewHolder != null) {
                friendsViewHolder.mo76218a();
            }
        }
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid() && this.f79089c != null && this.f79087a != null) {
            if (C23645b.m77551a(exc)) {
                C23645b.m77550a(getSupportFragmentManager(), (ApiServerException) exc, new C23637b() {
                    /* renamed from: a */
                    public final void mo57592a() {
                        ContactsActivity.this.f79089c.mo56975R_();
                    }

                    /* renamed from: b */
                    public final void mo57593b() {
                        ContactsActivity.this.mo76477d(exc);
                    }
                });
            } else {
                mo76477d(exc);
            }
        }
    }

    /* renamed from: a */
    private void m98573a(boolean z) {
        if (!z) {
            if (C6399b.m19944t()) {
                this.f79087a.mo66516d(false);
            } else {
                this.f79087a.ah_();
            }
            this.f79087a.mo66504a((C6905a) null);
            return;
        }
        this.f79087a.ai_();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b2);
        if (getIntent().hasExtra("enter_from")) {
            this.f79091e = getIntent().getStringExtra("enter_from");
        }
        User curUser = C21115b.m71197a().getCurUser();
        if (((Boolean) SharePrefCache.inst().getHasEnterBindPhone().mo59877d()).booleanValue() || curUser.isPhoneBinded()) {
            this.enterBindRl.setVisibility(8);
        } else {
            this.enterBindRl.setVisibility(0);
        }
        if (C6399b.m19946v()) {
            this.enterBindRl.setVisibility(8);
        }
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                ContactsActivity.this.onBackPressed();
            }
        });
        this.mTitleBar.setTitle(getText(R.string.c_k));
        this.mTitleBar.setTitleColor(getResources().getColor(R.color.a5d));
        if (C34315c.m110982b(4)) {
            C34315c.m110984c(4);
            C42961az.m136380a(new C34314g(4));
        }
        C10803a a = C10803a.m31631a((Context) this).mo25953a();
        if (C6399b.m19944t()) {
            MtEmptyView a2 = MtEmptyView.m31657a((Context) this);
            a2.setStatus(new C10806a(this).mo25985a((int) R.drawable.ax1).mo25990b((int) R.string.bzv).mo25993c(R.string.b0o).f29135a);
            a.mo25963b((View) a2);
        } else {
            a.mo25955a((int) R.string.bzv, (int) R.string.b0o);
        }
        this.mStatusView.setBuilder(a);
        this.f79092f = new C30041c(this.f79095i, null);
        if (curUser.isPhoneBinded()) {
            m98575g();
        } else {
            C6907h.m21524a("phone_bundling_show", (Map) C22984d.m75611a().mo59973a("enter_from", "contact").f60753a);
            C10741a aVar = new C10741a(this);
            aVar.mo25649a((int) R.string.bzr).mo25657b((int) R.string.bzq).mo25658b((int) R.string.duy, C30149a.f79370a).mo25650a((int) R.string.bzp, (OnClickListener) new C30155b(this));
            Dialog a3 = aVar.mo25656a().mo25637a();
            a3.setOnDismissListener(new C30156c(this));
            a3.setCanceledOnTouchOutside(false);
            a3.setCancelable(false);
            a3.show();
        }
        C25713b.m84475a(findViewById(R.id.dal));
        if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isNeedLightStatusBar()) {
            C43098ej.m136715c(this);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.friends.ui.ContactsActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo59108b(List list, boolean z) {
        if (isViewValid()) {
            this.f79087a.ai_();
            this.f79087a.mo61577b(list);
            this.mStatusView.setVisibility(4);
            m98573a(z);
        }
    }

    /* renamed from: a */
    public static boolean m98574a(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo76475a(DialogInterface dialogInterface, int i) {
        C6907h.m21524a("phone_bundling_click", (Map) C22984d.m75611a().mo59973a("enter_from", "contact").f60753a);
        this.f79094h = true;
        C6399b.m19946v();
        C6861a.m21335d().bindMobile(this, "contact", null, null);
    }

    /* renamed from: a */
    public final void mo59099a(List list, boolean z) {
        if (isViewValid()) {
            this.mRefreshLayout.setRefreshing(false);
            if (list == null) {
                this.mStatusView.setVisibility(0);
                return;
            }
            if (C6399b.m19944t()) {
                this.f79087a.mo66516d(true);
            }
            this.f79087a.ai_();
            this.mStatusView.mo25939d();
            this.f79087a.mo58045a(list);
            this.mStatusView.setVisibility(4);
            m98573a(z);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* renamed from: a */
    public static Intent m98571a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, ContactsActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("enter_from", str);
        }
        intent.putExtra("just_granted_read_contacts", z);
        return intent;
    }
}
