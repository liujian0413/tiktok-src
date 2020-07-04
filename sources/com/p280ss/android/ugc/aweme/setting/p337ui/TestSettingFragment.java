package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AlertDialog.C1081a;
import android.text.TextUtils;
import android.text.method.ReplacementTransformationMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;
import com.C1642a;
import com.benchmark.p062bl.C1983a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase.C10813a;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemSwitch;
import com.bytedance.ies.geckoclient.C10873f;
import com.bytedance.ies.ugc.appcontext.ApkUtil;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p471b.p472a.C9661a;
import com.bytedance.router.SmartRouterTestActivity;
import com.p280ss.android.anywheredoor_api.IAnyWhereDoor;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.config.AppConfig;
import com.p280ss.android.common.util.C6772a;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.newmedia.redbadge.C19991g;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.sdk.p899a.C20098b;
import com.p280ss.android.ugc.aweme.C21673bf;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C22766ac;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.application.C22863b;
import com.p280ss.android.ugc.aweme.app.debug.AbTestSettingActivity;
import com.p280ss.android.ugc.aweme.app.debug.AbTestSettingPageParam;
import com.p280ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity;
import com.p280ss.android.ugc.aweme.app.debug.FlowWindowService;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.p280ss.android.ugc.aweme.bullet.C23563b;
import com.p280ss.android.ugc.aweme.colortemplate.ColorTemplateActivity;
import com.p280ss.android.ugc.aweme.commerce.service.C24436a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25220ac;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25225af;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25914c;
import com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.C25935n;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.C32326h.C32327a;
import com.p280ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask;
import com.p280ss.android.ugc.aweme.live.LiveFeedActivity;
import com.p280ss.android.ugc.aweme.live.LivePlayActivity;
import com.p280ss.android.ugc.aweme.live.LiveSettingActivity;
import com.p280ss.android.ugc.aweme.localtest.LocalTest;
import com.p280ss.android.ugc.aweme.miniapp_api.services.C7167b;
import com.p280ss.android.ugc.aweme.optimize.OptimizeSettingActivity;
import com.p280ss.android.ugc.aweme.p1685ug.praise.C42727a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p331m.p1377a.C32815a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.privacychecker.api.PrivacyCheckerService;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.ScanQRCodeActivityV2;
import com.p280ss.android.ugc.aweme.requesttask.idle.C37256o;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37557aj;
import com.p280ss.android.ugc.aweme.setting.C7208as;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.LocalAbTestModel;
import com.p280ss.android.ugc.aweme.setting.p336a.C37531c;
import com.p280ss.android.ugc.aweme.ttwebview.C42652a;
import com.p280ss.android.ugc.aweme.util.C42877f;
import com.p280ss.android.ugc.aweme.util.C42881i;
import com.p280ss.android.ugc.aweme.util.C42886m;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import com.p280ss.android.ugc.aweme.utils.C43118fb;
import com.p280ss.android.ugc.aweme.zhima.C43584b;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestSettingFragment */
public class TestSettingFragment extends AmeBaseFragment implements C10813a {

    /* renamed from: e */
    public static final boolean f98610e = C7163a.m22363a();
    SettingItemSwitch adWebCheckerSwitch;
    SettingItem colorTemplate;
    SettingItemSwitch cronetItem;
    EditText debugCommandInput;
    SettingItemSwitch debugWebBar;
    SettingItemSwitch enableAVStorageMonitor;
    SettingItemSwitch enableAnrChecker;
    SettingItemSwitch enableConanChecker;
    SettingItemSwitch enableMessagePb2Json;
    SettingItemSwitch enableMicroAppItem;
    SettingItemSwitch enablePrivacyCheckerLog;
    EditText etInput;

    /* renamed from: f */
    private C21673bf f98611f = new C21673bf() {
    };

    /* renamed from: g */
    private AwemeAppData f98612g;
    SettingItemSwitch geckoDebugItem;
    SettingItemSwitch geckoItem;
    SettingItem geckoTestHelperItem;
    SettingItemSwitch hostItem;
    SettingItemSwitch httpsItem;
    SettingItemSwitch iesOfflineItem;
    SettingItemSwitch interactStickerDebug;
    SettingItem itemApplyRedbadge;
    SettingItem itemClearDid;
    SettingItem itemClearMemoryCache;
    SettingItem itemDeeplinkTestPage;
    SettingItem itemEnterOptimizeSetting;
    SettingItem itemLoadBenchmarkTest;
    SettingItem itemSearchAb;
    SettingItemSwitch itemSecUidChecker;
    SettingItem itemUnbindFlipChat;
    SettingItem liveDebugItem;
    SettingItemSwitch liveMoneyItem;
    SettingItemSwitch livePressureItem;
    SettingItemSwitch liveResolutionItem;
    SettingItemSwitch logItem;
    SettingItem mAbTestItem;
    SettingItem mAutoDadian;
    SettingItemSwitch mCloseReactionOrigin;
    SettingItemSwitch mCommerceAnyDoor;
    SettingItemSwitch mCommerceNetMonitor;
    EditText mEventHostEditText;
    Button mEventHostOkBtn;
    View mEventHostView;
    SettingItemSwitch mExoPlayerSwitch;
    SettingItemSwitch mLongVideoSwitch;
    SettingItemSwitch mMakeClientWatermark;
    LinearLayout mSettingContainer;
    EditText mSettingIntervalEditText;
    Button mSettingIntervalOkBtn;
    SettingItemSwitch mShowWatermarkInfo;
    TextView mTvDeveice;
    TextView mTvToolSdkVersion;
    SettingItemSwitch mUeTool;
    EditText mUrlInput;
    SettingItemSwitch mUseTestHost;
    EditText mWebusedefaultEditText;
    Button mWebusedefaultOkBtn;
    SettingItem mtVisitInChina;
    Button openDebugBoxButton;
    SettingItemSwitch openVEHook;
    SettingItem patchInfoItem;
    SettingItemSwitch rnFallback;
    SettingItemSwitch showPLayerInfoUI;
    SettingItemSwitch showVideoBitrateInfo;
    SettingItemSwitch switchToolsDir;
    SettingItem testMemory;
    SettingItemSwitch ttWebViewDebugItem;
    SettingItemSwitch webOfflineDebugItem;
    SettingItem webRippleView;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestSettingFragment$a */
    static class C37838a extends ReplacementTransformationMethod {
        C37838a() {
        }

        /* access modifiers changed from: protected */
        public final char[] getOriginal() {
            return new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        }

        /* access modifiers changed from: protected */
        public final char[] getReplacement() {
            return new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        }
    }

    public void qrClick() {
    }

    /* renamed from: X */
    private static C10873f m121068X() {
        return C42983bo.m136468d();
    }

    /* renamed from: Y */
    private static C10873f m121069Y() {
        return C42983bo.m136460b();
    }

    public void openDebugbox() {
        C42881i.m136165b(getActivity());
    }

    public void praiseGuideDialogTest() {
        C42727a.m135636a(getContext());
    }

    /* renamed from: E */
    private void m121049E() {
        this.mUeTool.isChecked();
        this.mUeTool.setChecked(false);
    }

    /* renamed from: aa */
    private void m121073aa() {
        this.webOfflineDebugItem.setChecked(true);
        getContext();
    }

    /* renamed from: ab */
    private void m121074ab() {
        this.geckoDebugItem.setChecked(true);
        getContext();
    }

    /* renamed from: l */
    private void m121087l() {
        LocalTest.m105652a().openRobustActivity(getActivity());
    }

    /* renamed from: n */
    private void m121089n() {
        startActivity(new Intent(getActivity(), OptimizeSettingActivity.class));
    }

    /* renamed from: o */
    private void m121090o() {
        startActivity(new Intent(getActivity(), MemoryTestActivity.class));
    }

    /* renamed from: s */
    private void m121094s() {
        startActivity(new Intent(getContext(), ColorTemplateActivity.class));
    }

    public void clearUserRealNameVerify() {
        new C43584b().mo105519a();
    }

    public void goDependencies() {
        startActivity(new Intent(getActivity(), TestDependenciesActivity.class));
    }

    public void goPlugin() {
        C7195s.m22438a().mo18679a((Activity) getActivity(), "aweme://pluginlist/");
    }

    public void onClickAppLogFloatingTest() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C25225af.f66549a.mo65839a((Activity) activity);
        }
    }

    public void onConfigPoiOverseas() {
        startActivity(new Intent(getActivity(), TestPoiOverseasActivity.class));
    }

    public void onDestroyView() {
        super.onDestroyView();
        C6861a.m21335d().setAuthorzieBindResult(null);
    }

    public void onEnterLivingFeed() {
        startActivity(new Intent(getActivity(), LiveFeedActivity.class));
    }

    public void onEnterLivingSetting() {
        startActivity(new Intent(getActivity(), LiveSettingActivity.class));
    }

    public void onEnterMicroAppList() {
        C7167b.m22380b().mo18647a().openMircoAppList(getActivity());
    }

    public void openPayTest() {
        C24436a.m80356a().launchPayTest(getActivity());
    }

    public void qrAdTestClick() {
        ScanQRCodeActivityV2.m119265a((Context) getActivity(), 1);
    }

    public void scanChange() {
        QRCodePermissionActivity.m119023a((Context) getActivity(), true, 2);
    }

    public void testHotFix() {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                new DelayedBaceSpeedMethodTestTask().run();
            }
        });
    }

    /* renamed from: A */
    private void m121046A() {
        this.mMakeClientWatermark.setChecked(!this.mMakeClientWatermark.isChecked());
        LocalAbTestModel e = C7213d.m22500a().mo18805e();
        if (e != null) {
            e.forceMakeClientWatermark = this.mMakeClientWatermark.isChecked();
        }
    }

    /* renamed from: B */
    private void m121047B() {
        this.mShowWatermarkInfo.setChecked(!this.mShowWatermarkInfo.isChecked());
        LocalAbTestModel e = C7213d.m22500a().mo18805e();
        if (e != null) {
            e.showWatermarkDebugInfo = this.mShowWatermarkInfo.isChecked();
        }
    }

    /* renamed from: D */
    private void m121048D() {
        this.mCloseReactionOrigin.setChecked(!this.mCloseReactionOrigin.isChecked());
        LocalAbTestModel e = C7213d.m22500a().mo18805e();
        if (e != null) {
            e.reactionOnlyViewVideo = this.mCloseReactionOrigin.isChecked();
        }
    }

    /* renamed from: U */
    private void m121065U() {
        this.itemSecUidChecker.setChecked(!this.itemSecUidChecker.mo26028a());
        C43077dz.m136657a().f111691e = this.itemSecUidChecker.mo26028a();
    }

    /* renamed from: V */
    private void m121066V() {
        boolean a = this.adWebCheckerSwitch.mo26028a();
        this.adWebCheckerSwitch.setChecked(!a);
        C25220ac.f66537b.mo65836a(!a);
    }

    /* renamed from: ac */
    private void m121075ac() {
        if (C42652a.m135465b()) {
            this.ttWebViewDebugItem.setChecked(false);
            C42652a.m135464a(false);
            return;
        }
        this.ttWebViewDebugItem.setChecked(true);
        C42652a.m135464a(true);
    }

    /* renamed from: e */
    private void m121081e() {
        this.mEventHostEditText.setText(C7285c.m22838a(getActivity(), "test_data", 0).getString("host", ""));
    }

    /* renamed from: f */
    private void m121082f() {
        Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
        intent.setData(Uri.parse("http://aweme.snssdk.com/falcon/douyin_falcon/jsbridge_test/"));
        intent.putExtra("title", "Web测试页");
        startActivity(intent);
    }

    /* renamed from: g */
    private void m121083g() {
        if (this.mEventHostEditText != null) {
            C42886m.m136179a(this.mEventHostEditText.getEditableText().toString(), (Context) getActivity());
        }
    }

    /* renamed from: t */
    private void m121095t() {
        Intent intent = new Intent(getContext(), CrossPlatformActivity.class);
        intent.setData(Uri.parse("http://rock.bytedance.net/ezconfig-ab/#/tiktokVisitSwitch"));
        startActivity(intent);
    }

    /* renamed from: w */
    private void m121098w() {
        if (!this.openVEHook.mo26028a()) {
            this.openVEHook.toggle();
            C37256o.m119711a(true);
            C37256o.m119713b();
        }
    }

    public void clickChangeRegion() {
        C32326h.m104875a((Activity) getActivity(), C32326h.m104885g(), (C32327a) new C32327a() {
            /* renamed from: a */
            public final void mo83540a(String str) {
                TestSettingFragment.this.etInput.setText(str);
                TestSettingFragment.this.etInput.setSelection(str.length());
                TestSettingFragment.this.setCarrierRegion();
            }
        });
    }

    public void onEnterFreeFlowData() {
        if (C6399b.m19944t()) {
            C10761a.m31403c((Context) getActivity(), "I18n没有相关数据");
        } else {
            startActivity(new Intent(getActivity(), FreeFlowDataTestActivity.class));
        }
    }

    public void onTestFreeFlowMemberUpdate() {
        if (C6399b.m19944t()) {
            C10761a.m31403c((Context) getActivity(), "I18n没有相关数据").mo25750a();
        }
    }

    public void openAVSchemaTest() {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).openAVSchemaTestActivity(getActivity());
    }

    public void setCarrierRegion() {
        C32326h.m104876a(getActivity(), this.etInput.getText().toString(), null, null);
        C10761a.m31387a((Context) getActivity(), "保存成功, 重启后生效").mo25750a();
    }

    public void toAb() {
        AbTestSettingPageParam abTestSettingPageParam = new AbTestSettingPageParam();
        abTestSettingPageParam.category = getString(R.string.az);
        AbTestSettingActivity.m75419a(getActivity(), abTestSettingPageParam);
    }

    /* renamed from: F */
    private void m121050F() {
        this.enableMicroAppItem.setChecked(!this.enableMicroAppItem.isChecked());
        if (this.enableMicroAppItem.isChecked()) {
            SharePrefCache.inst().getDownloadMicroApp().mo59871a(Integer.valueOf(1));
        } else {
            SharePrefCache.inst().getDownloadMicroApp().mo59871a(Integer.valueOf(0));
        }
    }

    /* renamed from: G */
    private void m121051G() {
        this.httpsItem.setChecked(!this.httpsItem.mo26028a());
        AppConfig.getInstance(getActivity()).setUseHttps(this.httpsItem.mo26028a());
        SharePrefCache.inst().getUseHttps().mo59871a(Boolean.valueOf(this.httpsItem.mo26028a()));
    }

    /* renamed from: I */
    private void m121053I() {
        this.rnFallback.setChecked(!this.rnFallback.isChecked());
        SharePrefCache.inst().getRnFallback().mo59871a(Boolean.valueOf(this.rnFallback.mo26028a()));
    }

    /* renamed from: J */
    private void m121054J() {
        this.debugWebBar.setChecked(!this.debugWebBar.isChecked());
        SharePrefCache.inst().getDebugWebBar().mo59871a(Boolean.valueOf(this.debugWebBar.mo26028a()));
    }

    /* renamed from: K */
    private void m121055K() {
        this.cronetItem.setChecked(!this.cronetItem.mo26028a());
        SharePrefCache.inst().getUseCronet().mo59871a(Boolean.valueOf(this.cronetItem.mo26028a()));
    }

    /* renamed from: L */
    private void m121056L() {
        if (!this.logItem.mo26028a()) {
            this.logItem.setChecked(true);
            getActivity().startService(new Intent(getActivity(), FlowWindowService.class));
        }
    }

    /* renamed from: M */
    private void m121057M() {
        this.mUseTestHost.setChecked(!this.mUseTestHost.mo26028a());
        C6887b.m21436b().mo16902a((Context) getActivity(), "is_use_test_host", this.mUseTestHost.mo26028a());
    }

    /* renamed from: N */
    private void m121058N() {
        this.livePressureItem.setChecked(!this.livePressureItem.mo26028a());
        SharePrefCache.inst().mockLiveSend().mo59871a(Boolean.valueOf(this.livePressureItem.mo26028a()));
        this.livePressureItem.mo26028a();
    }

    /* renamed from: O */
    private void m121059O() {
        this.liveMoneyItem.setChecked(!this.liveMoneyItem.mo26028a());
        SharePrefCache.inst().mockLiveMoney().mo59871a(Boolean.valueOf(this.liveMoneyItem.mo26028a()));
    }

    /* renamed from: P */
    private void m121060P() {
        this.liveResolutionItem.setChecked(!this.liveResolutionItem.mo26028a());
        SharePrefCache.inst().mockLiveResolution().mo59871a(Boolean.valueOf(this.liveResolutionItem.mo26028a()));
    }

    /* renamed from: Q */
    private void m121061Q() {
        this.geckoItem.setChecked(!this.geckoItem.mo26028a());
        SharePrefCache.inst().getGeckoLocalTestUseOnline().mo59871a(Boolean.valueOf(this.geckoItem.mo26028a()));
    }

    /* renamed from: R */
    private void m121062R() {
        new C1081a(getActivity()).mo4236a((CharSequence[]) new String[]{"IJK", "IJK_HARDWARE", "EXO"}, (OnClickListener) new C37895av(this)).mo4242b().show();
    }

    /* renamed from: S */
    private void m121063S() {
        this.mLongVideoSwitch.setChecked(!this.mLongVideoSwitch.mo26028a());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).setLongVideoPermitted(this.mLongVideoSwitch.mo26028a());
    }

    /* renamed from: T */
    private void m121064T() {
        this.showPLayerInfoUI.setChecked(!this.showPLayerInfoUI.mo26028a());
        SharePrefCache.inst().getShowPlayerInfoUI().mo59871a(Boolean.valueOf(this.showPLayerInfoUI.mo26028a()));
    }

    /* renamed from: i */
    private void m121084i() {
        String obj = this.mWebusedefaultEditText.getEditableText().toString();
        if (!TextUtils.isEmpty(obj)) {
            String trim = obj.trim();
            Intent intent = new Intent(getActivity(), CrossPlatformActivity.class);
            intent.setData(Uri.parse(trim));
            intent.putExtra("title", "Web测试页");
            startActivity(intent);
        }
    }

    /* renamed from: j */
    private void m121085j() {
        if (getActivity() != null) {
            boolean isChecked = this.mCommerceNetMonitor.isChecked();
            IAnyWhereDoor iAnyWhereDoor = (IAnyWhereDoor) ServiceManager.get().getService(IAnyWhereDoor.class);
            if (iAnyWhereDoor != null && iAnyWhereDoor.switchNetworkCounter(getActivity(), !isChecked)) {
                this.mCommerceNetMonitor.setChecked(!isChecked);
            }
        }
    }

    /* renamed from: m */
    private void m121088m() {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).storageService().setMonitorLocalSwitch(!this.enableAVStorageMonitor.mo26028a());
        this.enableAVStorageMonitor.setChecked(((IAVService) ServiceManager.get().getService(IAVService.class)).storageService().isMonitorEnabled());
    }

    /* renamed from: p */
    private void m121091p() {
        String str;
        String str2;
        boolean e = C6789d.m21085e(getContext());
        C6789d.m21059a(getContext(), !e);
        Context context = getContext();
        String str3 = "新用户模式: %s \n请在设置页面清除所有数据";
        Object[] objArr = new Object[1];
        if (e) {
            str = "关闭";
        } else {
            str = "打开";
        }
        objArr[0] = str;
        C10761a.m31404c(context, C1642a.m8034a(str3, objArr), 1).mo25750a();
        if (e) {
            str2 = "打开新用户模式";
        } else {
            str2 = "关闭新用户模式";
        }
        this.itemClearDid.setRightTxt(str2);
    }

    /* renamed from: q */
    private void m121092q() {
        this.enableMessagePb2Json.setChecked(!this.enableMessagePb2Json.mo26028a());
        SharePrefCache.inst().isEnableMessagePb2Json().mo59871a(Boolean.valueOf(this.enableMessagePb2Json.mo26028a()));
    }

    /* renamed from: r */
    private void m121093r() {
        this.interactStickerDebug.setChecked(!this.interactStickerDebug.mo26028a());
        Editor edit = C7285c.m22838a(getActivity(), "test_data", 0).edit();
        edit.putBoolean("sp_interact_stickers_test", this.interactStickerDebug.isChecked());
        edit.apply();
    }

    /* renamed from: u */
    private void m121096u() {
        this.enableAnrChecker.setChecked(!this.enableAnrChecker.mo26028a());
        Editor edit = C7285c.m22838a(getActivity(), "test_data", 0).edit();
        edit.putBoolean("sp_key_enable_anr", this.enableAnrChecker.isChecked());
        edit.apply();
    }

    /* renamed from: v */
    private void m121097v() {
        this.switchToolsDir.setChecked(!this.switchToolsDir.mo26028a());
        Editor edit = C7285c.m22838a(getActivity(), "test_data", 0).edit();
        edit.putBoolean("sp_key_tools_dir_external", this.switchToolsDir.isChecked());
        edit.apply();
    }

    /* renamed from: x */
    private void m121099x() {
        this.enableConanChecker.setChecked(!this.enableConanChecker.mo26028a());
        try {
            if (this.enableConanChecker.isChecked()) {
                C42877f.m136147a(getActivity().getApplication(), false);
            } else {
                C42877f.m136146a();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    private void m121100y() {
        try {
            PrivacyCheckerService privacyCheckerService = (PrivacyCheckerService) ServiceManager.get().getService(PrivacyCheckerService.class);
            privacyCheckerService.enableLog(!this.enablePrivacyCheckerLog.isChecked());
            this.enablePrivacyCheckerLog.setChecked(privacyCheckerService.isLogEnabled());
        } catch (Exception unused) {
        }
    }

    /* renamed from: z */
    private void m121101z() {
        this.showVideoBitrateInfo.setChecked(!this.showVideoBitrateInfo.mo26028a());
        SharePrefCache.inst().getShowVideoBitrateInfo().mo59871a(Boolean.valueOf(this.showVideoBitrateInfo.mo26028a()));
    }

    public void douLabTestDialog() {
        if (C6399b.m19944t()) {
            C10761a.m31387a((Context) getActivity(), "MT没有该功能").mo25750a();
        } else {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDouLabService().mo105515a(getActivity());
        }
    }

    public void languageDialogTest() {
        if (C6399b.m19944t()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).openLanguageTestDialog(getActivity());
        } else {
            C10761a.m31387a((Context) getActivity(), "抖音没有该功能").mo25750a();
        }
    }

    public void onEnterFTwoRoom() {
        C1081a aVar = new C1081a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.l_, null);
        aVar.mo4239b(inflate);
        aVar.mo4244c((CharSequence) "进入F2活动页面", (OnClickListener) new C37890aq(this, (EditText) inflate.findViewById(R.id.bq_)));
        aVar.mo4233a((CharSequence) "进入F2活动页面");
        aVar.mo4242b().show();
    }

    public void onEnterLivingRoom() {
        C1081a aVar = new C1081a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.l_, null);
        aVar.mo4239b(inflate);
        aVar.mo4244c((CharSequence) "进入直播间", (OnClickListener) new C37889ap(this, (EditText) inflate.findViewById(R.id.bq_)));
        aVar.mo4233a((CharSequence) "进入直播间");
        aVar.mo4242b().show();
    }

    public void runCommandClick() {
        if (this.debugCommandInput.getText() != null) {
            C32815a.m106204a(this.debugCommandInput.getText().toString());
        } else {
            C10761a.m31403c((Context) getActivity(), "input command").mo25750a();
        }
    }

    /* renamed from: H */
    private void m121052H() {
        this.hostItem.setChecked(!this.hostItem.isChecked());
        SharePrefCache.inst().getUseDefaultHost().mo59871a(Boolean.valueOf(this.hostItem.isChecked()));
        if (this.hostItem.isChecked()) {
            String str = "data.bytedance.net/et_api/logview/verify";
            C6772a.m20923a().f19270a = str;
            C7285c.m22838a(getActivity(), "test_data", 0).edit().putString("host", str).apply();
            C6772a.m20923a().mo16564a(true);
        } else {
            C6772a.m20923a().mo16564a(false);
        }
        SharePrefCache.inst().getUseHttps().mo59871a(Boolean.valueOf(this.hostItem.isChecked()));
    }

    /* renamed from: W */
    private void m121067W() {
        C1081a aVar = new C1081a(getActivity());
        EditText editText = new EditText(getActivity());
        editText.setHint("请输入site包channel数字");
        editText.setText("6734278183694106632");
        aVar.mo4236a((CharSequence[]) new String[]{"清除Common包", "清除Site包", "Common包是否存在", "site包是否存在"}, (OnClickListener) new C37887an(this, editText));
        aVar.mo4239b((View) editText);
        aVar.mo4242b().show();
    }

    /* renamed from: k */
    private void m121086k() {
        if (getActivity() != null) {
            boolean isChecked = this.mCommerceAnyDoor.isChecked();
            IAnyWhereDoor iAnyWhereDoor = (IAnyWhereDoor) ServiceManager.get().getService(IAnyWhereDoor.class);
            if (iAnyWhereDoor != null && iAnyWhereDoor.switchEnable(getActivity(), !isChecked)) {
                this.mCommerceAnyDoor.setChecked(!isChecked);
            }
            if (isChecked && this.mCommerceNetMonitor != null && this.mCommerceNetMonitor.isChecked() && iAnyWhereDoor != null && iAnyWhereDoor.switchNetworkCounter(getActivity(), false)) {
                this.mCommerceNetMonitor.setChecked(false);
            }
        }
    }

    public void jumpToH5() {
        String trim = this.mUrlInput.getText().toString().trim();
        if (TextUtils.isEmpty(trim) || !trim.startsWith(WebKitApi.SCHEME_HTTP)) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.b2k).mo25750a();
            return;
        }
        StringBuilder sb = new StringBuilder("aweme://webview/?url=");
        sb.append(trim);
        C7195s.m22438a().mo18682a(sb.toString());
    }

    public void onConfigReactNative() {
        C1081a aVar = new C1081a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.re, null);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        Editor edit = defaultSharedPreferences.edit();
        String string = defaultSharedPreferences.getString("test_schema", "aweme://reactnative?dev=1&channel_name=rn_patch&bundle_name=business&module_name=page_business");
        EditText editText = (EditText) inflate.findViewById(R.id.cvs);
        editText.setText(defaultSharedPreferences.getString("debug_http_host", "10.1.57.172:8081"));
        EditText editText2 = (EditText) inflate.findViewById(R.id.cvr);
        editText2.setText(string);
        aVar.mo4239b(inflate);
        aVar.mo4233a((CharSequence) "React Native 测试页");
        aVar.mo4234a((CharSequence) "使用bullet打开", (OnClickListener) new C37891ar(this, editText2));
        aVar.mo4244c((CharSequence) "schema跳转", (OnClickListener) new C37892as(edit, editText, editText2));
        aVar.mo4242b().show();
    }

    public void onJsbSettingsClick() {
        C1081a aVar = new C1081a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.rd, null);
        EditText editText = (EditText) inflate.findViewById(R.id.bfg);
        String str = C25914c.m85209a().f68562a;
        if (!TextUtils.isEmpty(str)) {
            editText.setText(str);
        }
        aVar.mo4239b(inflate);
        aVar.mo4233a((CharSequence) "Jsb 测试设置");
        aVar.mo4244c((CharSequence) "Confirm", (OnClickListener) new C37894au(editText));
        aVar.mo4242b().show();
    }

    public void onReactNativeSettingsClick() {
        C1081a aVar = new C1081a(getActivity());
        View inflate = getLayoutInflater().inflate(R.layout.rf, null);
        EditText editText = (EditText) inflate.findViewById(R.id.cvt);
        String str = C25935n.m85247a().f68609a;
        if (!TextUtils.isEmpty(str)) {
            editText.setText(str);
        }
        aVar.mo4239b(inflate);
        aVar.mo4233a((CharSequence) "React Native 测试设置");
        aVar.mo4244c((CharSequence) "Confirm", (OnClickListener) new C37893at(editText));
        aVar.mo4242b().show();
    }

    /* renamed from: Z */
    private void m121070Z() {
        if (f98610e) {
            String str = C22863b.f60589a;
            String str2 = "";
            try {
                Class cls = Class.forName("com.ss.android.module.verify_applog.AppLogVerifyClient");
                Method declaredMethod = cls.getDeclaredMethod("init", new Class[]{String.class, String.class, Boolean.TYPE});
                Method declaredMethod2 = cls.getDeclaredMethod("getUserOrNull", new Class[]{Context.class});
                cls.getDeclaredMethod("saveUser", new Class[]{Context.class, String.class});
                Method declaredMethod3 = cls.getDeclaredMethod("beginVerifyAppLog", new Class[]{Activity.class, String.class});
                Method declaredMethod4 = cls.getDeclaredMethod("inst", new Class[0]);
                Method declaredMethod5 = cls.getDeclaredMethod("tryInit", new Class[]{Context.class, String.class, String.class});
                declaredMethod.invoke(null, new Object[]{str, str2, Boolean.valueOf(true)});
                declaredMethod3.invoke(null, new Object[]{getActivity(), (String) declaredMethod2.invoke(null, new Object[]{getContext()})});
                declaredMethod5.invoke(declaredMethod4.invoke(null, new Object[0]), new Object[]{getContext(), str, str2});
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo95272a() {
        if (this.mSettingIntervalEditText != null) {
            try {
                int intValue = Integer.valueOf(this.mSettingIntervalEditText.getEditableText().toString()).intValue();
                if (intValue > 0 || ((long) intValue) <= TimeUnit.DAYS.toMillis(1)) {
                    C7208as.f20148a = intValue * 1000;
                    C10761a.m31383a((Context) getActivity(), (int) R.string.d9p).mo25750a();
                } else {
                    C10761a.m31399c((Context) getActivity(), (int) R.string.d9m).mo25750a();
                }
            } catch (NumberFormatException unused) {
                C10761a.m31399c((Context) getActivity(), (int) R.string.d9m).mo25750a();
            }
        }
    }

    /* renamed from: d */
    private void m121079d() {
        m121072a(this.iesOfflineItem, this.geckoItem, this.livePressureItem, this.liveMoneyItem, this.liveResolutionItem, this.mExoPlayerSwitch, this.mLongVideoSwitch, this.showPLayerInfoUI, this.showVideoBitrateInfo, this.mUseTestHost, this.httpsItem, this.hostItem, this.rnFallback, this.debugWebBar, this.cronetItem, this.logItem, this.mMakeClientWatermark, this.mCommerceAnyDoor, this.mCommerceNetMonitor, this.mShowWatermarkInfo, this.webRippleView, this.mCloseReactionOrigin, this.mUeTool, this.enableMicroAppItem, this.testMemory, this.enableMessagePb2Json, this.mAutoDadian, this.geckoTestHelperItem, this.liveDebugItem, this.itemApplyRedbadge, this.itemClearMemoryCache, this.interactStickerDebug, this.itemUnbindFlipChat, this.enableAnrChecker, this.openVEHook, this.enableAVStorageMonitor, this.enableConanChecker, this.enablePrivacyCheckerLog, this.itemSecUidChecker, this.adWebCheckerSwitch, this.itemSearchAb, this.itemDeeplinkTestPage, this.itemClearDid, this.switchToolsDir, this.itemEnterOptimizeSetting, this.patchInfoItem, this.itemLoadBenchmarkTest, this.geckoDebugItem, this.webOfflineDebugItem, this.colorTemplate, this.ttWebViewDebugItem, this.mtVisitInChina);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95274a(View view) {
        m121084i();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo95277b(View view) {
        m121083g();
    }

    public void crash(View view) {
        throw new IllegalStateException("test a crash");
    }

    /* renamed from: a */
    private void m121072a(SettingItemBase... settingItemBaseArr) {
        for (int i = 0; i < 52; i++) {
            SettingItemBase settingItemBase = settingItemBaseArr[i];
            if (settingItemBase != null) {
                settingItemBase.setOnSettingItemClickListener(this);
            }
        }
    }

    /* renamed from: d */
    private void m121080d(View view) {
        this.iesOfflineItem.setChecked(!this.iesOfflineItem.mo26028a());
        this.iesOfflineItem.mo26028a();
        SharePrefCache.inst().getIesOffline().mo59871a(Boolean.valueOf(this.iesOfflineItem.mo26028a()));
    }

    /* renamed from: c */
    private void m121077c(View view) {
        int i;
        String str;
        String str2;
        SharePrefCache inst = SharePrefCache.inst();
        this.httpsItem.setChecked(((Boolean) inst.getUseHttps().mo59877d()).booleanValue());
        this.hostItem.setChecked(((Boolean) inst.getUseDefaultHost().mo59877d()).booleanValue());
        this.rnFallback.setChecked(((Boolean) inst.getRnFallback().mo59877d()).booleanValue());
        this.debugWebBar.setChecked(((Boolean) inst.getDebugWebBar().mo59877d()).booleanValue());
        this.cronetItem.setChecked(((Boolean) inst.getUseCronet().mo59877d()).booleanValue());
        this.iesOfflineItem.setChecked(((Boolean) inst.getIesOffline().mo59877d()).booleanValue());
        this.geckoItem.setChecked(((Boolean) inst.getGeckoLocalTestUseOnline().mo59877d()).booleanValue());
        this.f98612g = AwemeAppData.m65765a();
        this.mEventHostEditText.setText(C22766ac.m75145a().mo59819b());
        this.mEventHostEditText.setOnEditorActionListener(new C37885al(this));
        this.mEventHostOkBtn = (Button) view.findViewById(R.id.awc);
        this.mEventHostOkBtn.setOnClickListener(new C37886am(this));
        this.mWebusedefaultOkBtn = (Button) view.findViewById(R.id.eg_);
        this.mWebusedefaultOkBtn.setOnClickListener(new C37888ao(this));
        this.mSettingIntervalEditText.setText(String.valueOf(C7208as.f20148a / 1000));
        this.mSettingIntervalEditText.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6 && i != 0) {
                    return false;
                }
                TestSettingFragment.this.mo95272a();
                return true;
            }
        });
        this.mSettingIntervalOkBtn.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TestSettingFragment.this.mo95272a();
            }
        });
        TextView textView = this.mTvDeveice;
        StringBuilder sb = new StringBuilder("\nApkInfo: ");
        sb.append(ApkUtil.m19911a(getActivity().getApplicationInfo().sourceDir, 1903654775));
        sb.append("\nChannel: ");
        sb.append(C6399b.m19941q());
        sb.append("\nDeviceId: ");
        sb.append(AppLog.getServerDeviceId());
        sb.append("\nFLAVOR: musicallyI18n");
        sb.append("\nFLAVOR_app: musically");
        sb.append("\nFLAVOR_mode: i18n");
        sb.append("\nUserId: ");
        sb.append(C21115b.m71197a().getCurUserId());
        sb.append("\nWebViewType: ");
        sb.append(C42652a.m135463a());
        textView.setText(sb.toString());
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        TextView textView2 = this.mTvToolSdkVersion;
        StringBuilder sb2 = new StringBuilder("\nVESdk version: ");
        sb2.append(iAVService.getVESDKVersion());
        sb2.append("\nEffectSdk version: ");
        sb2.append(iAVService.getEffectSDKVersion());
        textView2.setText(sb2.toString());
        this.livePressureItem.setChecked(((Boolean) inst.mockLiveSend().mo59877d()).booleanValue());
        this.liveMoneyItem.setChecked(((Boolean) inst.mockLiveMoney().mo59877d()).booleanValue());
        this.liveResolutionItem.setChecked(((Boolean) inst.mockLiveResolution().mo59877d()).booleanValue());
        SettingItemSwitch settingItemSwitch = this.enableMicroAppItem;
        boolean z = true;
        if (((Integer) SharePrefCache.inst().getDownloadMicroApp().mo59877d()).intValue() != 1) {
            z = false;
        }
        settingItemSwitch.setChecked(z);
        this.enableMessagePb2Json.setChecked(((Boolean) SharePrefCache.inst().isEnableMessagePb2Json().mo59877d()).booleanValue());
        this.ttWebViewDebugItem.setChecked(C42652a.m135465b());
        Type a = C37557aj.m120314a();
        String str3 = "";
        if (a == Type.Ijk) {
            str3 = "IJK";
        } else if (a == Type.IjkHardware) {
            str3 = "IJK_HARDWARE";
        } else if (a == Type.EXO) {
            str3 = "EXO";
        }
        this.mExoPlayerSwitch.setStartText(str3);
        String g = C32326h.m104885g();
        EditText editText = this.etInput;
        if (C6399b.m19944t()) {
            i = 0;
        } else {
            i = 8;
        }
        editText.setVisibility(i);
        this.etInput.setText(g);
        this.etInput.setSelection(g.length());
        this.etInput.setTransformationMethod(new C37838a());
        this.mLongVideoSwitch.setChecked(((IAVService) ServiceManager.get().getService(IAVService.class)).isLongVideoPermitted());
        this.mUseTestHost.setChecked(C6887b.m21436b().mo16909b((Context) getActivity(), "is_use_test_host", false));
        this.mCommerceAnyDoor.setChecked(C6887b.m21436b().mo16909b((Context) getActivity(), "aweme_commerce_anywheredoor", false));
        this.mCommerceNetMonitor.setChecked(C6887b.m21436b().mo16909b((Context) getActivity(), "aweme_commerce_monitor", false));
        this.showPLayerInfoUI.setChecked(((Boolean) inst.getShowPlayerInfoUI().mo59877d()).booleanValue());
        this.showVideoBitrateInfo.setChecked(((Boolean) inst.getShowVideoBitrateInfo().mo59877d()).booleanValue());
        if (C7163a.m22363a() && C7213d.m22500a().mo18805e() != null) {
            this.mMakeClientWatermark.setChecked(C7213d.m22500a().mo18805e().forceMakeClientWatermark);
            this.mShowWatermarkInfo.setChecked(C7213d.m22500a().mo18805e().showWatermarkDebugInfo);
        }
        SharedPreferences a2 = C7285c.m22838a(getActivity(), "test_data", 0);
        this.interactStickerDebug.setChecked(a2.getBoolean("sp_interact_stickers_test", false));
        this.enableAnrChecker.setChecked(a2.getBoolean("sp_key_enable_anr", false));
        this.openVEHook.setChecked(C37256o.m119712a());
        this.enableAVStorageMonitor.setChecked(((IAVService) ServiceManager.get().getService(IAVService.class)).storageService().isMonitorEnabled());
        this.enableConanChecker.setChecked(false);
        this.enablePrivacyCheckerLog.setChecked(((PrivacyCheckerService) ServiceManager.get().getService(PrivacyCheckerService.class)).isLogEnabled());
        this.switchToolsDir.setChecked(a2.getBoolean("sp_key_tools_dir_external", false));
        C6861a.m21335d().setAuthorzieBindResult(this.f98611f);
        SettingItem settingItem = this.itemUnbindFlipChat;
        if (C20098b.m66270a().mo53819a("flipchat")) {
            str = "已绑定";
        } else {
            str = "未绑定";
        }
        settingItem.setRightTxt(str);
        this.itemSecUidChecker.setChecked(C43077dz.m136657a().f111691e);
        this.adWebCheckerSwitch.setChecked(C25220ac.m82918a());
        boolean e = C6789d.m21085e(getContext());
        SettingItem settingItem2 = this.itemClearDid;
        StringBuilder sb3 = new StringBuilder();
        if (e) {
            str2 = "关闭";
        } else {
            str2 = "打开";
        }
        sb3.append(str2);
        sb3.append("新用户模式");
        settingItem2.setRightTxt(sb3.toString());
    }

    public void OnSettingItemClick(View view) {
        int id = view.getId();
        if (id == R.id.eg7) {
            m121082f();
        } else if (id == R.id.ay1) {
            m121080d(view);
        } else if (id == R.id.b5d) {
            if (C20098b.m66270a().mo53819a("flipchat")) {
                C37896aw.m121130a(Toast.makeText(getActivity(), "飞聊已经绑定，正在解绑", 1));
                getActivity();
                new Object() {
                };
                return;
            }
            Intent authorizeActivityStartIntent = C6861a.m21335d().getAuthorizeActivityStartIntent(getActivity());
            authorizeActivityStartIntent.putExtra("platform", "flipchat");
            authorizeActivityStartIntent.putExtra("is_login", false);
            startActivityForResult(authorizeActivityStartIntent, 10005);
        } else if (id == R.id.bpe) {
            m121058N();
        } else if (id == R.id.aq3) {
            m121061Q();
        } else if (id == R.id.bpa) {
            m121059O();
        } else if (id == R.id.bpr) {
            m121060P();
        } else if (id == R.id.ah1) {
            m121062R();
        } else if (id == R.id.bvz) {
            m121063S();
        } else if (id == R.id.awq) {
            m121051G();
        } else if (id == R.id.awb) {
            m121052H();
        } else if (id == R.id.a6j) {
            m121054J();
        } else if (id == R.id.cvf) {
            m121053I();
        } else if (id == R.id.a58) {
            m121055K();
        } else if (id == R.id.b3z) {
            m121056L();
        } else if (id == R.id.e4c) {
            m121057M();
        } else if (id == R.id.d6j) {
            m121064T();
        } else if (id == R.id.d6l) {
            m121101z();
        } else if (id == R.id.aoi) {
            m121046A();
        } else if (id == R.id.efz) {
            m121047B();
        } else if (id == R.id.cof) {
            m121048D();
        } else if (id == R.id.e7i) {
            m121049E();
        } else if (id == R.id.aem) {
            m121050F();
        } else if (id == R.id.i1) {
            m121070Z();
        } else {
            if (id != R.id.bo4) {
                if (id == R.id.aq4) {
                    m121067W();
                } else if (id == R.id.b3_) {
                    try {
                        C19991g.m65902a().mo53510b(getActivity(), 33);
                        C10761a.m31388a((Context) getActivity(), "红点展现成功", 1).mo25750a();
                    } catch (RedBadgerException unused) {
                        C10761a.m31388a((Context) getActivity(), "红点展现失败", 1).mo25750a();
                    }
                } else if (id == R.id.b3b) {
                    C43118fb.m136746a(10);
                } else if (id == R.id.ca1) {
                    m121092q();
                } else if (id == R.id.bxu) {
                    m121090o();
                } else if (id == R.id.b2c) {
                    m121093r();
                } else if (id == R.id.dew) {
                    m121096u();
                } else if (id == R.id.df1) {
                    m121098w();
                } else if (id == R.id.dex) {
                    m121088m();
                } else if (id == R.id.dey) {
                    m121099x();
                } else if (id == R.id.dev) {
                    m121100y();
                } else if (id == R.id.b55) {
                    m121065U();
                } else if (id == R.id.dt) {
                    m121066V();
                } else if (id == R.id.af0) {
                    AbTestSettingSearchActivity.m75423a((Context) getActivity());
                } else if (id == R.id.df5) {
                    m121097v();
                } else if (id == R.id.af5) {
                    startActivity(new Intent(getActivity(), SmartRouterTestActivity.class));
                } else if (id == R.id.c_o) {
                    m121087l();
                } else if (id == R.id.wn) {
                    m121091p();
                } else if (id == R.id.afa) {
                    m121089n();
                } else if (id == R.id.bta) {
                    C1983a.m9029b().mo7631a(true);
                } else if (id == R.id.aq2) {
                    m121074ab();
                } else if (id == R.id.eg4) {
                    m121073aa();
                } else if (id == R.id.y_) {
                    m121094s();
                } else if (id == R.id.aej) {
                    m121085j();
                } else if (id == R.id.aei) {
                    m121086k();
                } else if (id == R.id.dpp) {
                    m121075ac();
                } else if (id == R.id.edw) {
                    m121095t();
                }
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m121077c(view);
        m121081e();
        m121079d();
        C37531c.m120244a((ViewGroup) this.mSettingContainer);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95273a(DialogInterface dialogInterface, int i) {
        switch (i) {
            case 0:
                C37557aj.m120315a(Type.Ijk);
                this.mExoPlayerSwitch.setStartText("IJK");
                return;
            case 1:
                if (VERSION.SDK_INT >= 17) {
                    C37557aj.m120315a(Type.IjkHardware);
                    this.mExoPlayerSwitch.setStartText("IJK_HARDWARE");
                    return;
                }
                C10761a.m31404c((Context) getActivity(), "4.3以下版本默认不开启硬解", 0).mo25750a();
                return;
            case 2:
                C37557aj.m120315a(Type.EXO);
                this.mExoPlayerSwitch.setStartText("EXO");
                break;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rc, viewGroup, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo95276a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6 && i != 0) {
            return false;
        }
        m121083g();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo95281d(EditText editText, DialogInterface dialogInterface, int i) {
        C23563b.f62166a.mo61488a(getContext(), BulletContainerActivity.class, editText.getText().toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo95283e(EditText editText, DialogInterface dialogInterface, int i) {
        if (editText.getText() != null) {
            try {
                Long.parseLong(editText.getText().toString());
            } catch (Throwable unused) {
            }
            C9661a.m28558a().mo24004b();
            getActivity();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo95284f(EditText editText, DialogInterface dialogInterface, int i) {
        if (editText.getText() != null) {
            String obj = editText.getText().toString();
            Intent intent = new Intent(getActivity(), LivePlayActivity.class);
            intent.putExtra("room_id", Long.parseLong(obj));
            startActivity(intent);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!(i == 1001 && intent != null && intent.getExtras() == null) && i == 10005) {
            if (i2 != -1 || !C20098b.m66270a().mo53819a("flipchat")) {
                C10761a.m31403c((Context) getActivity(), "飞聊绑定失败").mo25750a();
            } else {
                this.itemUnbindFlipChat.setRightTxt("已绑定");
                C10761a.m31387a((Context) getActivity(), "飞聊绑定成功").mo25750a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95275a(EditText editText, DialogInterface dialogInterface, int i) {
        String str;
        Context context;
        String str2;
        String str3;
        String obj = editText.getText().toString();
        switch (i) {
            case 0:
                m121069Y().mo26213a("shadow_landing", null);
                return;
            case 1:
                if (TextUtils.isEmpty(obj)) {
                    context = getActivity();
                    str = "请输入site包channel数字";
                    break;
                } else {
                    C10873f X = m121068X();
                    StringBuilder sb = new StringBuilder("ad_landing_");
                    sb.append(obj);
                    X.mo26213a(sb.toString(), null);
                    return;
                }
            case 2:
                boolean b = m121069Y().mo26224b("shadow_landing");
                FragmentActivity activity = getActivity();
                if (b) {
                    str2 = "存在";
                } else {
                    str2 = "不存在";
                }
                C10761a.m31403c((Context) activity, str2).mo25750a();
                return;
            case 3:
                if (!TextUtils.isEmpty(obj)) {
                    C10873f X2 = m121068X();
                    StringBuilder sb2 = new StringBuilder("ad_landing_");
                    sb2.append(obj);
                    boolean b2 = X2.mo26224b(sb2.toString());
                    FragmentActivity activity2 = getActivity();
                    if (b2) {
                        str3 = "存在";
                    } else {
                        str3 = "不存在";
                    }
                    Context context2 = activity2;
                    str = str3;
                    context = context2;
                    break;
                } else {
                    context = getActivity();
                    str = "请输入site包channel数字";
                    break;
                }
            default:
        }
        C10761a.m31403c(context, str).mo25750a();
    }

    /* renamed from: a */
    static final /* synthetic */ void m121071a(Editor editor, EditText editText, EditText editText2, DialogInterface dialogInterface, int i) {
        editor.putBoolean("js_bundle_deltas", false);
        editor.putString("debug_http_host", editText.getText().toString());
        editor.putString("test_schema", editText2.getText().toString()).apply();
        String obj = editText2.getText().toString();
        C7195s.m22438a().mo18682a(Uri.parse(obj).buildUpon().appendQueryParameter("rn_schema", obj).toString());
    }
}
