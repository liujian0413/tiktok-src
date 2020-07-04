package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.internal.ImmutableMap;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.monitor.C19906a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.services.C23038h;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.experiment.p1209a.C27687b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30472f;
import com.p280ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity;
import com.p280ss.android.ugc.aweme.i18n.settings.privacy.MusPrivacyActivity;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.C30560g;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.ProfileNewStyleExperiment;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37543ad;
import com.p280ss.android.ugc.aweme.setting.C37554ag;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.p1521i.C37651a;
import com.p280ss.android.ugc.aweme.setting.secret.C37702c;
import com.p280ss.android.ugc.aweme.setting.secret.MusPrivacyAccountTipActivity;
import com.p280ss.android.ugc.aweme.setting.secret.p1526a.C37699a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1528ui.PushSettingManagerActivity;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41564p;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42936aq;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.aweme.wallet.C43395a;
import com.p280ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.p280ss.android.ugc.trill.setting.ContentPreferenceActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.MusSettingNewVersionActivity */
public class MusSettingNewVersionActivity extends SettingNewVersionActivity {

    /* renamed from: e */
    private static final boolean f98473e = C7163a.m22363a();

    /* renamed from: a */
    protected C10730a f98474a;

    /* renamed from: q */
    private String f98475q;

    /* renamed from: r */
    private boolean f98476r;

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingNewVersionActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingNewVersionActivity", "onCreate", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingNewVersionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo95202r() {
        C37554ag.m120306c(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo95204t() {
        C37554ag.m120307d(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo95181A() {
        C37554ag.f97960a.mo94843b(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo95182B() {
        C37554ag.f97960a.mo94842a((Activity) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo95196n() {
        C37554ag.m120305b(this, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo95201q() {
        C37554ag.f97960a.mo94844e(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo95203s() {
        C37554ag.m120304a(this, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo95193k() {
        super.mo95193k();
        startActivity(new Intent(this, MusSettingManageMyAccountActivity.class));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo95197o() {
        startActivity(new Intent(this, ContentPreferenceActivity.class));
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final void mo95183C() {
        super.mo95183C();
        AgreementActivity.m99747a(this, C25789b.m84762i(), false, getString(R.string.dn6));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo95184D() {
        super.mo95184D();
        StringBuilder sb = new StringBuilder("https://m.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=");
        sb.append(C43098ej.m136708a(44));
        AddWikiActivity.m138064a(this, sb.toString(), new HashMap());
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo95191i() {
        super.mo95191i();
        if (C43122ff.m136767b()) {
            this.mInsights.setVisibility(8);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C6861a.m21332a().removeLoginOrLogoutListener(this);
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03).init();
    }

    /* renamed from: u */
    public final void mo95205u() {
        if (!C37930u.m121192a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
        } else {
            C37543ad.m120266a(this, true);
        }
    }

    /* renamed from: K */
    private void m120833K() {
        if (C43122ff.m136767b()) {
            C23487o.m77146a(false, this.mMyWalletItem, this.mShareProfileItem, this.mNotificationManagerItem, this.mPrivacyManagerItem, this.mLocalLiveWallpaper);
        }
    }

    /* renamed from: L */
    private void m120834L() {
        this.rootView.setBackgroundColor(getResources().getColor(R.color.a7f));
        this.mTitleBar.setBackgroundColor(getResources().getColor(R.color.a6c));
        this.mEditUserProfile.setVisibility(8);
    }

    /* renamed from: M */
    private void m120835M() {
        if (TextUtils.isEmpty(this.f98475q)) {
            String aD = C7213d.m22500a().mo18741aD();
            if (TextUtils.isEmpty(aD)) {
                aD = "m.tiktok.com";
            }
            StringBuilder sb = new StringBuilder("https://");
            sb.append(aD);
            sb.append("/falcon/tiktok_rn_web/feedback/");
            this.f98475q = sb.toString();
        }
    }

    /* renamed from: N */
    private void m120836N() {
        C33228ab.m107200a("click_clean_cache_button").mo85057b("enter_from", "settings_page").mo85252e();
        C1592h.m7853a((Callable<TResult>) new C37926q<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C37927r<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: O */
    private void m120837O() {
        new C10741a(this).mo25649a((int) R.string.ap9).mo25657b((int) R.string.ap3).mo25650a((int) R.string.ap5, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }).mo25656a().mo25637a();
    }

    /* renamed from: P */
    private void m120838P() {
        if (this.f98476r && this.mInsights != null) {
            this.mInsights.setVisibility(0);
            C23338f.m76571i().mo60634b("show_insights_red", true);
            m120837O();
            this.f98476r = false;
        }
        C23338f.m76571i().mo60627a("show_insights_red", false);
        this.mInsights.mo25777b();
    }

    /* renamed from: Q */
    private void m120839Q() {
        if (C37699a.m120556a()) {
            Intent intent = new Intent(this, MusPrivacyAccountTipActivity.class);
            intent.putExtra("isFirstLaunch", false);
            startActivity(intent);
            if (C21115b.m71197a().getCurUser().isForcePrivateAccount()) {
                C37699a.m120558b("privacy_account_setting_show", false);
                return;
            }
            C37699a.m120555a("privacy_account_setting_show", false);
        }
    }

    /* renamed from: d */
    public final View[] mo59893d() {
        return new View[]{this.mEditUserProfile, this.mMyWalletItem, this.mAccountAndSafetyItem, this.mShareProfileItem, this.mNotificationManagerItem, this.mUnderAgeProtection, this.mAccessibility, this.mLogout, this.mMyQrCode};
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo95192j() {
        super.mo95192j();
        if (C27687b.m90836a()) {
            this.mClearCacheItem.setLeftIcon(R.drawable.ab4);
            this.mClearCacheItem.setLeftText(getString(R.string.dql));
            return;
        }
        C7492s.m23282a((C7495v<T>) new C37924o<T>(this)).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C37925p<Object>(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo95194l() {
        C6907h.m21524a("enter_notification_setting", (Map) C22984d.m75611a().mo59973a("previous_page", "settings_page").mo59973a("enter_method", "click_button").f60753a);
        C6907h.onEvent(MobClick.obtain().setEventName("notification_setting").setLabelName("settings_page"));
        startActivity(new Intent(this, PushSettingManagerActivity.class));
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo95195m() {
        C33228ab.m107200a("enter_privacy_setting").mo85057b("previous_page", "settings_page").mo85057b("enter_method", "click_button").mo85252e();
        startActivity(new Intent(this, MusPrivacyActivity.class));
        C30560g.m99822c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo95206v() {
        boolean a = C27687b.m90836a();
        StringBuilder sb = new StringBuilder("enableSettingDiskManager: ");
        sb.append(a);
        C6921a.m21552a(3, "clear-cache", sb.toString());
        if (a) {
            startActivity(new Intent(this, DiskManagerActivity.class));
        } else {
            m120836N();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo95207w() {
        User curUser = C21115b.m71197a().getCurUser();
        QRCodeActivityV2.m119235a(this, new C36995a().mo93428a(4, C43122ff.m136788s(curUser), "personal_homepage").mo93433a(C43122ff.m136789t(curUser), C43122ff.m136790u(curUser), C43122ff.m136783n(curUser)).f96920a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo95208x() {
        C37651a.m120476d();
        this.mMusInviteFriend.mo25777b();
        String b = C37651a.m120474b();
        Intent intent = new Intent(this, CrossPlatformActivity.class);
        intent.putExtra("use_webview_title", true);
        intent.setData(Uri.parse(b));
        startActivity(intent);
        C6907h.m21524a("click_referral_invite_friends", ImmutableMap.m38917of("enter_from", "settings_page"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo95210z() {
        C41989d.m133477a("settings_page");
        C6907h.onEvent(new MobClick().setEventName("wallet").setLabelName("setting"));
        C6907h.m21524a("wallet_click", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").f60753a);
        C43395a.m137716a(this, IWalletMainProxy.KEY_PAGE_INDEX);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public final /* synthetic */ Object mo95185E() throws Exception {
        C6921a.m21552a(3, "clear-cache", "start clear cache without disk manager");
        ((IAVService) ServiceManager.get().getService(IAVService.class)).clearMusicIdPathList();
        C19906a.m65710c();
        C7276d.m22810b(getCacheDir());
        C43305j.m137386g().mo105030c();
        C30553b.m99810g().clearAudioDownloadCache();
        C41564p.m132369a(true);
        C42973bg.m136431c(((IAVService) ServiceManager.get().getService(IAVService.class)).effectService().getCacheDir());
        C6921a.m21552a(3, "clear-cache", "finish clear cache without disk manager");
        return null;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingNewVersionActivity", "onResume", true);
        super.onResume();
        if (!C6861a.m21337f().isLogin()) {
            if (!MusPrivacyActivity.m99753j()) {
                this.mPrivacyManagerItem.setVisibility(0);
            } else {
                this.mPrivacyManagerItem.setVisibility(8);
            }
        } else if (this.mPrivacyManagerItem.getVisibility() != 0 && !C43122ff.m136767b()) {
            this.mPrivacyManagerItem.setVisibility(0);
        }
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser != null && !curUser.getIsCreater() && !this.f98476r) {
            this.mInsights.setVisibility(8);
        }
        m120838P();
        mo95244I();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.MusSettingNewVersionActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo95209y() {
        if (this.f98474a == null) {
            C10741a aVar = new C10741a(this);
            aVar.mo25649a((int) R.string.ag0).mo25658b((int) R.string.w_, (OnClickListener) new C37928s(this)).mo25650a((int) R.string.c5h, (OnClickListener) new C37929t(this));
            if (C7213d.m22500a().mo18722O()) {
                StringBuilder sb = new StringBuilder("@");
                sb.append(C43122ff.m136777h(C21115b.m71197a().getCurUser()));
                aVar.mo25660b(sb.toString());
            }
            this.f98474a = aVar.mo25656a();
        }
        this.f98474a.mo25637a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo58711c() {
        String str;
        super.mo58711c();
        if (!C43395a.m137718b() || TextUtils.equals(C6399b.m19941q(), "amazon")) {
            this.mMyWalletItem.setVisibility(8);
        } else {
            this.mMyWalletItem.setVisibility(0);
        }
        if (C37651a.m120473a()) {
            this.mMusInviteFriend.setVisibility(0);
            if (C37651a.m120475c()) {
                this.mMusInviteFriend.mo25776a();
            }
        }
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW()) {
            if (this.mShareProfileItem != null) {
                this.mShareProfileItem.setVisibility(8);
            }
            if (this.mMyWalletItem != null) {
                this.mMyWalletItem.setVisibility(8);
            }
        }
        this.mGuidanceForParentsItem.setVisibility(8);
        this.mAboutAmeItem.setVisibility(8);
        this.mMicroApp.setVisibility(8);
        C23487o.m77146a(true, this.mSafetyCenter);
        if (C7213d.m22500a().mo18722O() && !C43122ff.m136767b()) {
            this.mMyQrCode.setVisibility(0);
        }
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
        m120833K();
        m120834L();
        if (getIntent() != null) {
            this.f98476r = getIntent().getBooleanExtra("from_pro_account", false);
        }
        mo95241F();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo95200p() {
        C19290j jVar;
        C6907h.m21524a("FAQ", (Map) C22984d.m75611a().mo59973a("enter_from", "settings").f60753a);
        C6907h.m21524a("click_feedback_entrance", (Map) new C22984d().mo59973a("enter_from", "settings").f60753a);
        Intent intent = new Intent(this, CrossPlatformActivity.class);
        m120835M();
        if (C43122ff.m136767b()) {
            jVar = new C19290j("https://m.tiktok.com/aweme/inapp/v2/c_feedback");
        } else {
            try {
                C7195s.m22438a().mo18682a(C30199h.m98861a().getFeedbackConf().getNormalEntry());
                return;
            } catch (Exception unused) {
                jVar = new C19290j(this.f98475q);
                jVar.mo51188a("locale", C30472f.m99529a(this).getLanguage());
            }
        }
        jVar.mo51188a("enter_from", "settings");
        intent.setData(Uri.parse(jVar.toString()));
        intent.putExtra("hide_nav_bar", true);
        startActivity(intent);
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public void onEvent(C37702c cVar) {
        m120839Q();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95189a(String str) throws Exception {
        this.mClearCacheItem.setRightText(str);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f98476r = intent.getBooleanExtra("from_pro_account", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo95186a(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            this.mClearCacheItem.setRightText("0.0MB");
            C10761a.m31383a((Context) this, (int) R.string.a53).mo25750a();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95188a(C47870u uVar) throws Exception {
        String str;
        try {
            str = C42936aq.m136292b(getCacheDir(), C7276d.m22808b(), new File(((IAVService) ServiceManager.get().getService(IAVService.class)).shortVideoConfig().stickerDir()), C19906a.m65709b(), C30553b.m99810g().getAudioDownloadCachePath());
        } catch (Exception unused) {
            str = "0.0MB";
        }
        uVar.mo19239a((Object) str);
        uVar.mo19238a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo95190b(DialogInterface dialogInterface, int i) {
        C19282c.m63182a(this, "log_out_popup", "cancel");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95187a(DialogInterface dialogInterface, int i) {
        if (!C37930u.m121192a(this)) {
            C10761a.m31399c((Context) this, (int) R.string.cjs).mo25750a();
            return;
        }
        C19282c.m63182a(this, "log_out_popup", "confirm");
        C6907h.m21524a("log_out", (Map) C22984d.m75611a().mo59973a("enter_from", "settings_page").mo59970a("f_mode", C43122ff.m136767b() ? 1 : 0).f60753a);
        C6861a.m21332a().addLoginOrLogoutListener(this);
        mo95243H();
        C6861a.m21333b().logout("user_logout", "user_logout");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 19 && i2 == -1) {
            C37543ad.m120268a("app_update_click");
        }
    }
}
