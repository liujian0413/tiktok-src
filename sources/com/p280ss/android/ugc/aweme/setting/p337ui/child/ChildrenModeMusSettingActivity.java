package com.p280ss.android.ugc.aweme.setting.p337ui.child;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.benchmark.p062bl.C1983a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.monitor.C19906a;
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
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.services.C23038h;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.p308ui.session.C23468a.C23469a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.legoImp.task.AssistantTask;
import com.p280ss.android.ugc.aweme.login.C32654d;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37554ag;
import com.p280ss.android.ugc.aweme.setting.C37575au;
import com.p280ss.android.ugc.aweme.setting.C37653j;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p337ui.DataSaverSettingActivity;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41564p;
import com.p280ss.android.ugc.aweme.utils.C42936aq;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43091ed;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeMusSettingActivity */
public class ChildrenModeMusSettingActivity extends AmeBaseActivity implements OnClickListener, C21077a {

    /* renamed from: a */
    protected AwemeAppData f98749a;

    /* renamed from: b */
    protected C10730a f98750b;

    /* renamed from: c */
    private int f98751c;

    /* renamed from: d */
    private long f98752d;

    /* renamed from: e */
    private C32654d f98753e;
    CommonItemView mAccountAndSafetyItem;
    CommonItemView mClearCacheItem;
    CommonItemView mCommonProtocolItem;
    CommonItemView mCommunityPolicyItem;
    CommonItemView mCopyRightPolicyItem;
    CommonItemView mDataSaver;
    CommonItemView mFeedbackAndHelpItem;
    CommonItemView mHelperCenter;
    CommonItemView mLogout;
    CommonItemView mOpenDebugTest;
    CommonItemView mPrivacyPolicyItem;
    CommonItemView mProtocolItem;
    CommonItemView mSafetyCenter;
    TextTitleBar mTitleBar;
    CommonItemView mUnderAgeProtection;
    TextView mUserInfo;
    TextView mVersionView;

    /* renamed from: q */
    private String f98754q;
    ViewGroup rootView;
    View statusBar;

    /* renamed from: A */
    private void m121145A() {
        C37554ag.m120307d(this);
    }

    /* renamed from: y */
    private void m121165y() {
        C37554ag.m120306c(this);
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.ar;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeMusSettingActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeMusSettingActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeMusSettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: C */
    private void m121147C() {
        C37554ag.f97960a.mo94843b(this);
    }

    /* renamed from: D */
    private void m121148D() {
        C37554ag.f97960a.mo94842a((Activity) this);
    }

    /* renamed from: u */
    private void m121161u() {
        C37554ag.m120305b(this, true);
    }

    /* renamed from: x */
    private void m121164x() {
        C37554ag.f97960a.mo94844e(this);
    }

    /* renamed from: z */
    private void m121166z() {
        C37554ag.m120304a(this, true);
    }

    /* renamed from: l */
    private void m121152l() {
        this.statusBar.getLayoutParams().height = C10994a.m32204a((Context) this);
    }

    /* renamed from: n */
    private void m121154n() {
        startActivity(new Intent(this, DataSaverSettingActivity.class));
        C6907h.onEventV3("enter_data_saver");
    }

    /* renamed from: p */
    private void m121156p() {
        if (C7163a.m22363a()) {
            AssistantTask.openDebugPage(this);
        }
    }

    /* renamed from: q */
    private void m121157q() {
        ParentalPlatformManager.m74627a((C22573a) new C22573a() {
            /* renamed from: a */
            public final void mo59223a(Exception exc) {
                ChildrenModeMusSettingActivity.this.mo95342a(true);
            }

            /* renamed from: a */
            public final void mo59222a(C37723b bVar, boolean z) {
                ChildrenModeMusSettingActivity.this.mo95342a(true);
            }
        });
    }

    /* renamed from: r */
    private void m121158r() {
        runOnUiThread(new C37908c(this));
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.c2, R.anim.cf);
    }

    /* renamed from: o */
    private void m121155o() {
        C6907h.m21524a("enter_teen_protection", (Map) C22984d.m75611a().mo59973a("enter_method", "click_button").mo59973a("enter_from", "settings_page").f60753a);
        ParentalPlatformManager.m74625a((Activity) this);
    }

    /* renamed from: s */
    private void m121159s() {
        if (!isFinishing() && this.f98753e != null && this.f98753e.isShowing()) {
            this.f98753e.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo95345i() {
        if (this.f98753e == null) {
            this.f98753e = new C32654d(this);
        }
        this.f98753e.show();
    }

    public void onDestroy() {
        super.onDestroy();
        C6861a.m21332a().removeLoginOrLogoutListener(this);
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
    }

    /* renamed from: B */
    private void m121146B() {
        C33228ab.m107200a("click_clean_cache_button").mo85057b("enter_from", "settings_page").mo85252e();
        C1592h.m7853a((Callable<TResult>) new C37909d<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C37910e<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: t */
    private void m121160t() {
        C6907h.m21524a("enter_account_safety", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
        if (this.mAccountAndSafetyItem.f28907d) {
            this.mAccountAndSafetyItem.mo25777b();
            C23338f.m76564b().mo60629b("has_notified_email_verification", 1);
        }
        startActivity(new Intent(this, ChildrenModeManageMyAccountActivity.class));
    }

    /* renamed from: w */
    private void m121163w() {
        if (TextUtils.isEmpty(this.f98754q)) {
            String aD = C7213d.m22500a().mo18741aD();
            if (TextUtils.isEmpty(aD)) {
                aD = "m.tiktok.com";
            }
            StringBuilder sb = new StringBuilder("https://");
            sb.append(aD);
            sb.append("/falcon/tiktok_rn_web/feedback/");
            this.f98754q = sb.toString();
        }
    }

    /* renamed from: k */
    private void m121151k() {
        this.mOpenDebugTest.setLeftText("Debug Test");
        this.mOpenDebugTest.setVisibility(8);
        try {
            String b = C42936aq.m136292b(getCacheDir(), C7276d.m22808b(), new File(((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().stickerDir()), C19906a.m65709b(), C30553b.m99810g().getAudioDownloadCachePath());
            if (!C6319n.m19593a(b)) {
                this.mClearCacheItem.setRightText(b);
            }
        } catch (Exception unused) {
            this.mClearCacheItem.setRightText("0.00M");
        }
    }

    /* renamed from: m */
    private void m121153m() {
        this.mAccountAndSafetyItem.setOnClickListener(this);
        this.mUnderAgeProtection.setOnClickListener(this);
        this.mCommonProtocolItem.setOnClickListener(this);
        this.mFeedbackAndHelpItem.setOnClickListener(this);
        this.mHelperCenter.setOnClickListener(this);
        this.mProtocolItem.setOnClickListener(this);
        this.mPrivacyPolicyItem.setOnClickListener(this);
        this.mCopyRightPolicyItem.setOnClickListener(this);
        this.mClearCacheItem.setOnClickListener(this);
        this.mOpenDebugTest.setOnClickListener(this);
        this.mLogout.setOnClickListener(this);
        this.mCommunityPolicyItem.setOnClickListener(this);
        this.mSafetyCenter.setOnClickListener(this);
        this.mDataSaver.setOnClickListener(this);
    }

    /* renamed from: v */
    private void m121162v() {
        C6907h.m21524a("FAQ", (Map) C22984d.m75611a().mo59973a("enter_from", "settings").f60753a);
        C6907h.m21524a("click_feedback_entrance", (Map) new C22984d().mo59973a("enter_from", "settings").f60753a);
        Intent intent = new Intent(this, CrossPlatformActivity.class);
        m121163w();
        C19290j jVar = new C19290j("https://m.tiktok.com/aweme/inapp/v2/c_feedback");
        jVar.mo51188a("enter_from", "settings");
        intent.setData(Uri.parse(jVar.toString()));
        intent.putExtra("hide_nav_bar", true);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo58711c() {
        if (this.f98750b == null) {
            C10741a aVar = new C10741a(this);
            aVar.mo25649a((int) R.string.ag0).mo25658b((int) R.string.w_, (DialogInterface.OnClickListener) new C37911f(this)).mo25650a((int) R.string.c5h, (DialogInterface.OnClickListener) new C37912g(this));
            if (C7213d.m22500a().mo18722O()) {
                StringBuilder sb = new StringBuilder("@");
                sb.append(C43122ff.m136777h(C21115b.m71197a().getCurUser()));
                aVar.mo25660b(sb.toString());
            }
            this.f98750b = aVar.mo25656a();
        }
        this.f98750b.mo25637a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ Object mo59893d() throws Exception {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).clearMusicIdPathList();
        C19906a.m65710c();
        C7276d.m22810b(getCacheDir());
        C43305j.m137386g().mo105030c();
        C30553b.m99810g().clearAudioDownloadCache();
        C41564p.m132369a(true);
        C42973bg.m136431c(((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getCacheDir());
        return null;
    }

    /* renamed from: j */
    private void m121150j() {
        String str;
        this.mTitleBar.setTitle((int) R.string.e_2);
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                ChildrenModeMusSettingActivity.this.exit(view);
            }
        });
        this.f98749a = AwemeAppData.m65765a();
        if (VERSION.SDK_INT >= 19) {
            m121152l();
        }
        C23487o.m77146a(true, this.mSafetyCenter);
        String a = C1642a.m8034a(getString(R.string.dok), new Object[]{"14.7.4", "2021407040"});
        if (C7163a.m22363a()) {
            StringBuilder sb = new StringBuilder(" ");
            sb.append(C23038h.m75714a(this).mo60010a("aweme_build_version", ""));
            str = sb.toString();
        } else {
            str = "";
        }
        TextView textView = this.mVersionView;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(str);
        textView.setText(sb2.toString());
        this.rootView.setBackgroundColor(getResources().getColor(R.color.a7f));
        this.mTitleBar.setBackgroundColor(getResources().getColor(R.color.a6c));
        C23487o.m77146a(C37653j.m120481c(), this.mDataSaver);
        C37575au.m120344a(R.array.a3, (ViewGroup) this.rootView.findViewById(R.id.bsd));
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

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo95340a(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            this.mClearCacheItem.setRightText("0 M");
            C10761a.m31383a((Context) this, (int) R.string.a53).mo25750a();
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeMusSettingActivity", "onCreate", true);
        super.onCreate(bundle);
        m121150j();
        m121151k();
        m121153m();
        C1983a.m9029b().mo7629a(1);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.child.ChildrenModeMusSettingActivity", "onCreate", false);
    }

    /* renamed from: b */
    private boolean m121149b(boolean z) {
        int i;
        if (!TimeLockRuler.isRuleValid()) {
            return false;
        }
        if (ParentalPlatformConfig.f60133a.mo59214b() != Role.CHILD) {
            C22603f.m74722a((C23469a<Boolean>) new C23469a<Boolean>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo59227a(Boolean bool) {
                    ChildrenModeMusSettingActivity.this.mo58711c();
                }
            }, "logout");
            return true;
        } else if (!z) {
            m121157q();
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
    public final void mo95342a(boolean z) {
        if (!((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isUnKnown() && !((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishFinished()) {
            C10761a.m31399c((Context) this, (int) R.string.d9e).mo25750a();
        } else if (!C37913h.m121183a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
        } else if (isActive() && !m121149b(z)) {
            mo58711c();
        }
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.x) {
            if (!C27326a.m89578a(view)) {
                m121160t();
            }
        } else if (id == R.id.e7m) {
            if (!C27326a.m89578a(view)) {
                m121155o();
            }
        } else if (id == R.id.a69) {
            if (!C27326a.m89578a(view)) {
                m121154n();
            }
        } else if (id == R.id.a0t) {
            if (!C27326a.m89578a(view)) {
                m121161u();
            }
        } else if (id == R.id.ajq) {
            if (!C27326a.m89578a(view)) {
                m121162v();
            }
        } else if (id == R.id.avd) {
            if (!C27326a.m89578a(view)) {
                m121164x();
            }
        } else if (id == R.id.dh5) {
            if (!C27326a.m89578a(view)) {
                m121165y();
            }
        } else if (id == R.id.cjs) {
            if (!C27326a.m89578a(view)) {
                m121166z();
            }
        } else if (id == R.id.a33) {
            if (!C27326a.m89578a(view)) {
                m121145A();
            }
        } else if (id == R.id.wm) {
            if (!C27326a.m89578a(view)) {
                m121146B();
            }
        } else if (id == R.id.c8v) {
            if (!C27326a.m89578a(view)) {
                m121156p();
            }
        } else if (id == R.id.bvv) {
            if (!C27326a.m89578a(view)) {
                mo95342a(false);
            }
        } else if (id == R.id.a0u) {
            if (!C27326a.m89578a(view)) {
                m121147C();
            }
        } else if (id == R.id.cxw && !C27326a.m89578a(view)) {
            m121148D();
        }
    }

    public void onVersionClick(View view) {
        if (System.currentTimeMillis() - this.f98752d < 500) {
            this.f98751c++;
        } else {
            this.f98751c = 0;
        }
        if (this.f98751c >= 4) {
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
            this.f98751c = 0;
        }
        this.f98752d = System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo95343b(DialogInterface dialogInterface, int i) {
        C19282c.m63182a(this, "log_out_popup", "cancel");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95341a(DialogInterface dialogInterface, int i) {
        if (!C37913h.m121183a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
            return;
        }
        C19282c.m63182a(this, "log_out_popup", "confirm");
        C6907h.m21524a("log_out", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").mo59970a("f_mode", 1).f60753a);
        C6861a.m21332a().addLoginOrLogoutListener(this);
        m121158r();
        C6861a.m21333b().logout("user_logout", "user_logout");
    }

    /* renamed from: a */
    public final void mo56854a(int i, boolean z, int i2, User user) {
        m121159s();
    }
}
