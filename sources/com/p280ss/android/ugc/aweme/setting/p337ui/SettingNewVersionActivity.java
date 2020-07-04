package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.C0991u;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.benchmark.p062bl.C1983a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.ugc.aweme.IAccountService.C21077a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.C22573a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a.C23469a;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.experiment.p1209a.C27687b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.legoImp.task.AssistantTask;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32577e;
import com.p280ss.android.ugc.aweme.livewallpaper.p1370ui.LocalLiveWallPaperActivity;
import com.p280ss.android.ugc.aweme.login.C32654d;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditActivity;
import com.p280ss.android.ugc.aweme.profile.util.C36717ag;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37653j;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p1519g.C37632a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37722a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.utils.C42919ag;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.SettingNewVersionActivity */
public abstract class SettingNewVersionActivity extends AmeBaseActivity implements OnClickListener, C21077a {

    /* renamed from: a */
    private int f98541a;

    /* renamed from: b */
    protected AwemeAppData f98542b;

    /* renamed from: c */
    protected List<CommonItemView> f98543c = new ArrayList();

    /* renamed from: d */
    protected HashSet<View> f98544d;

    /* renamed from: e */
    private long f98545e;
    CommonItemView mAboutAmeItem;
    CommonItemView mAccessibility;
    CommonItemView mAccountAndSafetyItem;
    CommonItemView mAddAccount;
    CommonItemView mCheckUpdate;
    CommonItemView mClearCacheItem;
    CommonItemView mCommonProtocolItem;
    CommonItemView mCommunityPolicyItem;
    CommonItemView mContentPreferenceItem;
    CommonItemView mCopyRightPolicyItem;
    CommonItemView mDataSaver;
    CommonItemView mEditUserProfile;
    CommonItemView mFeedbackAndHelpItem;
    CommonItemView mGuidanceForParentsItem;
    CommonItemView mHelperCenter;
    CommonItemView mImPressumItem;
    CommonItemView mInsights;
    CommonItemView mJoinTesters;
    CommonItemView mLocalLiveWallpaper;
    CommonItemView mLogout;
    CommonItemView mMicroApp;
    CommonItemView mMusInviteFriend;
    CommonItemView mMyQrCode;
    CommonItemView mMyWalletItem;
    CommonItemView mNotificationManagerItem;
    CommonItemView mOpenDebugTest;
    CommonItemView mPrivacyManagerItem;
    CommonItemView mPrivacyPolicyItem;
    CommonItemView mProtocolItem;
    CommonItemView mSafetyCenter;
    CommonItemView mShareProfileItem;
    TextTitleBar mTitleBar;
    CommonItemView mUnderAgeProtection;
    TextView mUserInfo;
    TextView mVersionView;

    /* renamed from: q */
    private List<Aweme> f98546q;

    /* renamed from: r */
    private C32654d f98547r;
    ViewGroup rootView;
    View statusBar;

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo95181A();

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public abstract void mo95182B();

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.er;
    }

    /* renamed from: d */
    public abstract View[] mo59893d();

    public boolean isRegisterEventBus() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract void mo95194l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract void mo95195m();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo95197o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract void mo95200p();

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract void mo95201q();

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo95202r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo95203s();

    public void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo95204t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo95205u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo95206v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public void mo95207w() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo95208x() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo95209y();

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract void mo95210z();

    /* renamed from: K */
    private void m120966K() {
        this.statusBar.getLayoutParams().height = C10994a.m32204a((Context) this);
    }

    /* renamed from: O */
    private void m120970O() {
        startActivity(new Intent(this, AccessibilitySettingActivity.class));
    }

    /* renamed from: P */
    private void m120971P() {
        startActivity(new Intent(this, DataSaverSettingActivity.class));
        C6907h.onEventV3("enter_data_saver");
    }

    /* renamed from: V */
    private void m120977V() {
        if (C7163a.m22363a()) {
            AssistantTask.openDebugPage(this);
        }
    }

    /* renamed from: X */
    private void m120979X() {
        ParentalPlatformManager.m74627a((C22573a) new C22573a() {
            /* renamed from: a */
            public final void mo59223a(Exception exc) {
                SettingNewVersionActivity.this.mo95246a(true);
            }

            /* renamed from: a */
            public final void mo59222a(C37723b bVar, boolean z) {
                SettingNewVersionActivity.this.mo95246a(true);
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo95243H() {
        runOnUiThread(new C37879af(this));
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.c2, R.anim.cf);
    }

    public void onDestroy() {
        super.onDestroy();
        C28479b.m93598b(this.f98546q);
    }

    /* renamed from: N */
    private static boolean m120969N() {
        if (!C6399b.m19944t() || !C25789b.f68199a.mo66979h()) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    private void m120972Q() {
        C6907h.m21524a("edit_profile", (Map) C22984d.m75611a().mo59973a("enter_method", "click_setting_profile").f60753a);
        startActivity(new Intent(this, ProfileEditActivity.class));
    }

    /* renamed from: R */
    private void m120973R() {
        C6907h.m21524a("enter_teen_protection", (Map) C22984d.m75611a().mo59973a("enter_method", "click_button").mo59973a("enter_from", "settings_page").f60753a);
        ParentalPlatformManager.m74625a((Activity) this);
    }

    /* renamed from: S */
    private void m120974S() {
        if (!C37880ag.m121126a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
        } else {
            C7195s.m22438a().mo18679a((Activity) this, "aweme://about_activity");
        }
    }

    /* renamed from: U */
    private void m120976U() {
        C6907h.m21524a("live_photo_manage", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
        startActivity(new Intent(this, LocalLiveWallPaperActivity.class));
    }

    /* renamed from: Z */
    private void m120981Z() {
        if (!isFinishing() && this.f98547r != null && this.f98547r.isShowing()) {
            this.f98547r.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public final /* synthetic */ void mo95245J() {
        if (this.f98547r == null) {
            this.f98547r = new C32654d(this);
        }
        this.f98547r.show();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo95193k() {
        C6907h.m21524a("enter_account_safety", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo95196n() {
        C6907h.m21524a("display_settings", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
    }

    /* renamed from: M */
    private static boolean m120968M() {
        C37722a a = C37632a.m120438a();
        if (!C6399b.m19944t() || C43122ff.m136767b() || a == null || ((!a.f98241a || TextUtils.isEmpty(a.f98242b)) && !TextUtils.equals(C6399b.m19941q(), "beta"))) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    private void m120975T() {
        C37722a a = C37632a.m120438a();
        if (a != null && !TextUtils.isEmpty(a.f98242b)) {
            Intent intent = new Intent(this, CrossPlatformActivity.class);
            intent.putExtra("title", getString(R.string.bx0));
            intent.setData(Uri.parse(a.f98242b));
            startActivity(intent);
        }
    }

    /* renamed from: W */
    private boolean m120978W() {
        if (TimeLockRuler.isSelfContentFilterOn()) {
            C22603f.m74722a((C23469a<Boolean>) new C23469a<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo59227a(Boolean bool) {
                    SettingNewVersionActivity.this.mo95242G();
                }
            }, "add_account");
            return true;
        } else if (!TimeLockRuler.isParentalPlatformContentFilterOn()) {
            return false;
        } else {
            C10761a.m31409e((Context) this, (int) R.string.b31).mo25750a();
            return true;
        }
    }

    /* renamed from: Y */
    private void m120980Y() {
        C6907h.m21524a("click_share_person", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser != null) {
            C36717ag.m118376a(this, curUser, this.f98546q);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo95183C() {
        if (!C37880ag.m121126a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
        } else {
            C6907h.m21524a("enter_imprint", (Map) C22984d.m75611a().mo59973a("previous_page", "settings_page").mo59973a("enter_method", "click_button").f60753a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo95184D() {
        C6759a.m20910a("click_insight", (JSONObject) null);
        C6907h.m21524a("click_insight", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
        C6907h.m21524a("enter_insight_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public final void mo95241F() {
        if (!C6861a.m21337f().isLogin()) {
            if (this.f98544d == null) {
                this.f98544d = new HashSet<>();
            }
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).handleUnloginForSetting(this, this.f98544d);
        }
    }

    /* renamed from: G */
    public final void mo95242G() {
        if (C21115b.m71197a().allUidList().size() < 3) {
            MultiAccountViewModel.m118557a((FragmentActivity) this, "", "add_account_setting");
        } else {
            C10761a.m31409e((Context) this, (int) R.string.ei).mo25750a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo95192j() {
        if (C27687b.m90836a()) {
            C7492s.m23282a(C37878ae.f98722a).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<Boolean>() {
                public final void onComplete() {
                }

                public final void onError(Throwable th) {
                }

                public final void onSubscribe(C7321c cVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(Boolean bool) {
                    if (bool.booleanValue()) {
                        SettingNewVersionActivity.this.mClearCacheItem.mo25776a();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo95244I() {
        List g = C25789b.m84761g();
        if (!C6307b.m19566a((Collection<T>) g)) {
            ViewGroup viewGroup = (ViewGroup) this.rootView.findViewById(R.id.bsd);
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        Object tag = childAt.getTag();
                        if (tag instanceof String) {
                            String str = (String) tag;
                            if (!TextUtils.isEmpty(str) && g.contains(str)) {
                                childAt.setVisibility(8);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: E */
    private void mo95185E() {
        this.f98543c.add(this.mEditUserProfile);
        this.f98543c.add(this.mAccountAndSafetyItem);
        this.f98543c.add(this.mContentPreferenceItem);
        this.f98543c.add(this.mNotificationManagerItem);
        this.f98543c.add(this.mPrivacyManagerItem);
        this.f98543c.add(this.mUnderAgeProtection);
        this.f98543c.add(this.mCommonProtocolItem);
        this.f98543c.add(this.mHelperCenter);
        this.f98543c.add(this.mFeedbackAndHelpItem);
        this.f98543c.add(this.mProtocolItem);
        this.f98543c.add(this.mAboutAmeItem);
        this.f98543c.add(this.mPrivacyPolicyItem);
        this.f98543c.add(this.mCopyRightPolicyItem);
        this.f98543c.add(this.mClearCacheItem);
        this.f98543c.add(this.mOpenDebugTest);
        this.f98543c.add(this.mLocalLiveWallpaper);
        this.f98543c.add(this.mAddAccount);
        this.f98543c.add(this.mLogout);
        this.f98543c.add(this.mMyWalletItem);
        this.f98543c.add(this.mShareProfileItem);
        this.f98543c.add(this.mMyQrCode);
        this.f98543c.add(this.mCommunityPolicyItem);
        this.f98543c.add(this.mGuidanceForParentsItem);
        this.f98543c.add(this.mInsights);
        this.f98543c.add(this.mMicroApp);
        this.f98543c.add(this.mSafetyCenter);
        this.f98543c.add(this.mMusInviteFriend);
        this.f98543c.add(this.mAccessibility);
        this.f98543c.add(this.mDataSaver);
        this.f98543c.add(this.mCheckUpdate);
        this.f98543c.add(this.mJoinTesters);
        if (C6399b.m19944t()) {
            for (CommonItemView rightIconRes : this.f98543c) {
                rightIconRes.setRightIconRes(0);
            }
        }
    }

    /* renamed from: L */
    private void m120967L() {
        this.mEditUserProfile.setOnClickListener(this);
        this.mAccountAndSafetyItem.setOnClickListener(this);
        this.mNotificationManagerItem.setOnClickListener(this);
        this.mPrivacyManagerItem.setOnClickListener(this);
        this.mUnderAgeProtection.setOnClickListener(this);
        this.mCommonProtocolItem.setOnClickListener(this);
        this.mFeedbackAndHelpItem.setOnClickListener(this);
        this.mHelperCenter.setOnClickListener(this);
        this.mProtocolItem.setOnClickListener(this);
        this.mAboutAmeItem.setOnClickListener(this);
        this.mPrivacyPolicyItem.setOnClickListener(this);
        this.mCopyRightPolicyItem.setOnClickListener(this);
        this.mClearCacheItem.setOnClickListener(this);
        this.mOpenDebugTest.setOnClickListener(this);
        this.mLocalLiveWallpaper.setOnClickListener(this);
        this.mAddAccount.setOnClickListener(this);
        this.mLogout.setOnClickListener(this);
        this.mMyWalletItem.setOnClickListener(this);
        this.mShareProfileItem.setOnClickListener(this);
        this.mMyQrCode.setOnClickListener(this);
        this.mCommunityPolicyItem.setOnClickListener(this);
        this.mGuidanceForParentsItem.setOnClickListener(this);
        this.mInsights.setOnClickListener(this);
        this.mSafetyCenter.setOnClickListener(this);
        this.mMusInviteFriend.setOnClickListener(this);
        this.mAccessibility.setOnClickListener(this);
        if (C37653j.m120481c()) {
            this.mDataSaver.setOnClickListener(this);
        }
        this.mCheckUpdate.setOnClickListener(this);
        if (m120969N()) {
            this.mImPressumItem.setOnClickListener(this);
        }
        if (m120968M()) {
            this.mJoinTesters.setOnClickListener(this);
        }
        this.mContentPreferenceItem.setOnClickListener(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo58711c() {
        mo95185E();
        this.mTitleBar.setTitle((int) R.string.e_2);
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                SettingNewVersionActivity.this.exit(view);
            }
        });
        if (!C6399b.m19944t()) {
            C0991u.m4206c((View) this.mTitleBar.getEndText(), 2);
        }
        this.f98542b = AwemeAppData.m65765a();
        if (C6399b.m19944t() || C32577e.m105506d()) {
            this.mLocalLiveWallpaper.setVisibility(8);
        } else {
            this.mLocalLiveWallpaper.setVisibility(0);
        }
        if (VERSION.SDK_INT >= 19) {
            m120966K();
        }
        if (C7213d.m22500a().mo18722O() && C6861a.m21337f().isLogin()) {
            this.mAddAccount.setVisibility(0);
        }
        if (C43122ff.m136767b()) {
            this.mAccessibility.setVisibility(8);
        }
        if (C37653j.m120481c()) {
            this.mDataSaver.setVisibility(0);
        }
        if (!C6399b.m19944t()) {
            this.mContentPreferenceItem.setVisibility(8);
        }
        if (C6399b.m19944t() && VERSION.SDK_INT >= 21 && "googleplay".equals(C6399b.m19941q()) && (C30199h.m98861a().getInappUpdateSwitchStrategy().intValue() == 3 || C30199h.m98861a().getInappUpdateSwitchStrategy().intValue() == 2)) {
            this.mCheckUpdate.setVisibility(0);
        }
        if (m120968M()) {
            this.mJoinTesters.setVisibility(0);
        }
        if (m120969N()) {
            this.mImPressumItem.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo95191i() {
        this.mOpenDebugTest.setLeftText("Debug Test");
        this.mOpenDebugTest.setVisibility(8);
        if (C21115b.m71197a().getCurUser() != null && C21115b.m71197a().getCurUser().getIsCreater() && ((Boolean) SharePrefCache.inst().getCanCreateInsights().mo59877d()).booleanValue()) {
            this.mInsights.setVisibility(0);
        }
        this.f98546q = C28479b.m93596b();
        if (this.f98546q == null) {
            this.f98546q = (List) getIntent().getSerializableExtra("aweme_list");
        }
        if (C6399b.m19946v() && this.f98546q == null) {
            String stringExtra = getIntent().getStringExtra("aweme_list_str");
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    this.f98546q = (List) new C6600e().mo15975a(stringExtra, new C6597a<List<Aweme>>() {
                    }.type);
                } catch (Exception unused) {
                }
            }
        }
        mo95192j();
    }

    public void exit(View view) {
        finish();
    }

    @C7709l
    public void onEvent(ShareCompleteEvent shareCompleteEvent) {
        if (TextUtils.equals("user", shareCompleteEvent.itemType)) {
            C43091ed.m136696a(this, this.rootView, shareCompleteEvent);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m120982b(C47870u uVar) throws Exception {
        try {
            uVar.mo19239a((Object) Boolean.valueOf(DiskManagerActivity.m120729k()));
            uVar.mo19238a();
        } catch (Exception e) {
            uVar.mo19240a((Throwable) e);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo58711c();
        mo95191i();
        m120967L();
        C1983a.m9029b().mo7629a(1);
    }

    public void onUserInfoClick(View view) {
        int i;
        C42919ag.m136264a("user_info", this, this.mUserInfo.getText().toString());
        if (C6399b.m19944t()) {
            i = R.string.a5n;
        } else {
            i = R.string.bfr;
        }
        C10761a.m31383a((Context) this, i).mo25750a();
    }

    /* renamed from: b */
    private boolean m120983b(boolean z) {
        int i;
        if (!TimeLockRuler.isRuleValid()) {
            return false;
        }
        if (ParentalPlatformConfig.f60133a.mo59214b() != Role.CHILD && ParentalPlatformConfig.f60133a.mo59214b() != Role.UNLINK_LOCKED) {
            C22603f.m74722a((C23469a<Boolean>) new C23469a<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo59227a(Boolean bool) {
                    SettingNewVersionActivity.this.mo95209y();
                }
            }, "logout");
            return true;
        } else if (!z) {
            m120979X();
            return true;
        } else {
            boolean isTimeLockOn = TimeLockRuler.isTimeLockOn();
            boolean isContentFilterOn = TimeLockRuler.isContentFilterOn();
            if (!isTimeLockOn && !isContentFilterOn) {
                return false;
            }
            if (isContentFilterOn) {
                i = R.string.wp;
            } else {
                i = R.string.wq;
            }
            C10761a.m31383a((Context) this, i).mo25750a();
            return true;
        }
    }

    /* renamed from: a */
    public final void mo95246a(boolean z) {
        if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown() && !((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished()) {
            C10761a.m31399c((Context) this, (int) R.string.d9e).mo25750a();
        } else if (!C37880ag.m121126a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
        } else if (isActive() && !m120983b(z)) {
            mo95209y();
        }
    }

    public void onVersionClick(View view) {
        if (System.currentTimeMillis() - this.f98545e < 500) {
            this.f98541a++;
        } else {
            this.f98541a = 0;
        }
        if (this.f98541a >= 4) {
            this.mUserInfo.setVisibility(0);
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId == null) {
                serverDeviceId = "";
            }
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("UserId: ");
            sb2.append(C21115b.m71197a().getCurUserId());
            sb.append(sb2.toString());
            sb.append("\n");
            StringBuilder sb3 = new StringBuilder("DeviceId: ");
            sb3.append(serverDeviceId);
            sb.append(sb3.toString());
            sb.append("\n");
            StringBuilder sb4 = new StringBuilder("UpdateVerionCode: ");
            sb4.append(C6399b.m19932h());
            sb.append(sb4.toString());
            sb.append("\n");
            StringBuilder sb5 = new StringBuilder("GitSHA: ");
            sb5.append(C6399b.m19937m());
            sb.append(sb5.toString());
            sb.append("\n");
            StringBuilder sb6 = new StringBuilder("VESDK: ");
            sb6.append(iAVService.getVESDKVersion());
            sb.append(sb6.toString());
            sb.append("\n");
            StringBuilder sb7 = new StringBuilder("EffectSdk: ");
            sb7.append(iAVService.getEffectSDKVersion());
            sb.append(sb7.toString());
            sb.append("\n");
            sb.append(AwemeAppData.m65765a().mo53436b());
            this.mUserInfo.setText(sb.toString());
            this.f98541a = 0;
        }
        this.f98545e = System.currentTimeMillis();
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.acq) {
            if (!C27326a.m89578a(view)) {
                m120972Q();
            }
        } else if (id == R.id.x) {
            if (!C27326a.m89578a(view)) {
                mo95193k();
            }
        } else if (id == R.id.c7c) {
            if (!C27326a.m89578a(view)) {
                mo95194l();
            }
        } else if (id == R.id.cjj) {
            if (!C27326a.m89578a(view)) {
                mo95195m();
            }
        } else if (id == R.id.e7m) {
            if (!C27326a.m89578a(view)) {
                m120973R();
            }
        } else if (id == R.id.a0t) {
            if (!C27326a.m89578a(view)) {
                mo95196n();
            }
        } else if (id == R.id.ajq) {
            if (!C27326a.m89578a(view)) {
                mo95200p();
            }
        } else if (id == R.id.avd) {
            if (!C27326a.m89578a(view)) {
                mo95201q();
            }
        } else if (id == R.id.dh5) {
            if (!C27326a.m89578a(view)) {
                mo95202r();
            }
        } else if (id == R.id.v) {
            if (!C27326a.m89578a(view)) {
                m120974S();
            }
        } else if (id == R.id.cjs) {
            if (!C27326a.m89578a(view)) {
                mo95203s();
            }
        } else if (id == R.id.a33) {
            if (!C27326a.m89578a(view)) {
                mo95204t();
            }
        } else if (id == R.id.b0d) {
            if (!C27326a.m89578a(view)) {
                mo95183C();
            }
        } else if (id == R.id.wm) {
            if (!C27326a.m89578a(view)) {
                if (this.mClearCacheItem.f28907d) {
                    this.mClearCacheItem.mo25777b();
                    DiskManagerActivity.m120730l();
                }
                mo95206v();
            }
        } else if (id == R.id.c8v) {
            if (!C27326a.m89578a(view)) {
                m120977V();
            }
        } else if (id == R.id.bue) {
            if (!C27326a.m89578a(view)) {
                m120976U();
            }
        } else if (id == R.id.dz) {
            if (!C27326a.m89578a(view) && !m120978W()) {
                mo95242G();
            }
        } else if (id == R.id.bvv) {
            if (!C27326a.m89578a(view)) {
                mo95246a(false);
            }
        } else if (id == R.id.c31) {
            if (!C27326a.m89578a(view)) {
                mo95210z();
            }
        } else if (id == R.id.d5y) {
            if (!C27326a.m89578a(view)) {
                m120980Y();
            }
        } else if (id == R.id.c2r) {
            if (!C27326a.m89578a(view)) {
                mo95207w();
            }
        } else if (id == R.id.a0u) {
            if (!C27326a.m89578a(view)) {
                mo95181A();
            }
        } else if (id == R.id.ate) {
            if (!C27326a.m89578a(view)) {
            }
        } else if (id == R.id.b23) {
            if (!C27326a.m89578a(view)) {
                C23338f.m76571i().mo60634b("show_insights_red", false);
                mo95184D();
            }
        } else if (id == R.id.cxw) {
            if (!C27326a.m89578a(view)) {
                mo95182B();
            }
        } else if (id == R.id.b2v) {
            if (!C27326a.m89578a(view)) {
                mo95208x();
            }
        } else if (id == R.id.w) {
            if (!C27326a.m89578a(view)) {
                m120970O();
            }
        } else if (id == R.id.a69) {
            if (!C27326a.m89578a(view)) {
                m120971P();
            }
        } else if (id == R.id.ve) {
            if (!C27326a.m89578a(view)) {
                mo95205u();
            }
        } else if (id == R.id.bff) {
            if (!C27326a.m89578a(view)) {
                m120975T();
            }
        } else if (id == R.id.a2b && !C27326a.m89578a(view)) {
            mo95197o();
        }
    }

    /* renamed from: a */
    public final void mo56854a(int i, boolean z, int i2, User user) {
        m120981Z();
    }
}
