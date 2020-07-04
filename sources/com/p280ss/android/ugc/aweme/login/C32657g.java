package com.p280ss.android.ugc.aweme.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.CookieManager;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22598e;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.p1058c.C23288g;
import com.p280ss.android.ugc.aweme.base.p1058c.C23289h;
import com.p280ss.android.ugc.aweme.bridgeservice.C23549b;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.compliance.C25789b;
import com.p280ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p280ss.android.ugc.aweme.feed.C28205ai;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.freeflowcard.C29971b;
import com.p280ss.android.ugc.aweme.freeflowcard.data.C29983a;
import com.p280ss.android.ugc.aweme.legoImp.task.RefreshYouTubeTask;
import com.p280ss.android.ugc.aweme.live.C32430a;
import com.p280ss.android.ugc.aweme.login.p1371a.C32645a;
import com.p280ss.android.ugc.aweme.login.p1372b.C32650a;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.newfollow.util.C34202f;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.qrcode.C37076f;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C37562ao;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41556j;
import com.p280ss.android.ugc.aweme.story.api.C41974f;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.login.g */
public final class C32657g {

    /* renamed from: a */
    public static boolean f85120a;

    /* renamed from: a */
    private static void m105753a() {
        if (C6399b.m19944t()) {
            new RefreshYouTubeTask().run(C6399b.m19921a());
        }
    }

    /* renamed from: b */
    private static void m105755b() {
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService != null) {
            iWalletService.clearWallet();
        }
    }

    /* renamed from: g */
    private static C1592h<Bundle> m105762g(Bundle bundle) {
        return C1592h.m7855a((Callable<TResult>) new C32659i<TResult>(bundle), C1592h.f5958b);
    }

    /* renamed from: i */
    private static C1592h<Bundle> m105764i(Bundle bundle) {
        return C1592h.m7855a((Callable<TResult>) new C32660j<TResult>(bundle), C1592h.f5958b);
    }

    /* renamed from: j */
    private static C1592h<Bundle> m105765j(Bundle bundle) {
        return C1592h.m7859b((Callable<TResult>) new C32661k<TResult>(bundle));
    }

    /* renamed from: h */
    private static void m105763h(Bundle bundle) {
        if (TimeLockRuler.isInTeenagerModeNewVersion() && bundle != null) {
            if (C6399b.m19944t()) {
                bundle.putBoolean("need_restart", true);
                return;
            }
            C42961az.m136380a(new C32645a());
        }
    }

    /* renamed from: a */
    public static C1592h<Bundle> m105752a(Bundle bundle) {
        int i;
        C1592h hVar;
        if (bundle == null) {
            bundle = new Bundle();
        }
        String string = bundle.getString("previous_uid");
        String curUserId = C6861a.m21337f().getCurUserId();
        boolean isNullUid = C6861a.m21337f().isNullUid(string);
        boolean isNullUid2 = C6861a.m21337f().isNullUid(curUserId);
        if (isNullUid && !isNullUid2) {
            i = 0;
        } else if (isNullUid || isNullUid2) {
            i = 2;
        } else {
            i = 1;
        }
        C7163a.m22363a();
        if (i == 0) {
            hVar = m105762g(bundle);
        } else if (i == 1) {
            hVar = m105764i(bundle);
        } else {
            hVar = m105765j(bundle);
        }
        C42961az.m136380a(new C23288g(i));
        return hVar.mo6885c(C32658h.f85121a);
    }

    /* renamed from: b */
    public static void m105756b(Bundle bundle) {
        Intent intent;
        if (C6399b.m19944t()) {
            intent = MainActivity.getMainActivityIntent(C6399b.m19921a());
        } else {
            intent = new Intent(C6399b.m19921a(), MainActivity.class);
        }
        intent.putExtras(bundle);
        intent.setFlags(268468224);
        Activity g = C6405d.m19984g();
        if (g != null) {
            g.startActivity(intent);
            if (!g.isFinishing()) {
                if (VERSION.SDK_INT >= 21) {
                    g.finishAndRemoveTask();
                } else {
                    g.finish();
                }
            }
        } else if (AwemeApplication.m21341a() != null) {
            AwemeApplication.m21341a().startActivity(intent);
        }
    }

    /* renamed from: c */
    static final /* synthetic */ Bundle m105758c(Bundle bundle) throws Exception {
        if (VERSION.SDK_INT >= 21 && !C6399b.m19944t()) {
            CookieManager.getInstance().removeAllCookies(null);
        }
        C6861a.m21332a().preLoadOrRequest();
        C22345t.m73985l(true);
        SharePrefCache.inst().clearCache();
        C34315c.m110983c();
        C23549b.m77335a().afterLogOut();
        C34202f.m110435a().mo86950c();
        C29983a.m98302a().mo76181d();
        C29971b.m98269a();
        C29971b.m98270b();
        C37562ao.m120324a().mo94849a(4);
        SearchHistoryManager.inst().clearForAccountChange();
        C7213d.m22500a().mo18707b();
        m105755b();
        TimeLockRuler.clearCache();
        C22598e.f60167a.mo59258h();
        TimeLockRuler.removeUserSetting();
        TimeLockRuler.removeUnLoginUserSetting();
        ParentalPlatformConfig.f60133a.mo59213a(null);
        C37076f.m119218c();
        C41556j.m132334a();
        bundle.putBoolean("restart_from_logout", true);
        C25789b.f68199a.mo66978c();
        new Handler().postDelayed(new C32662l(bundle), 500);
        C30553b.m99810g().refreshLoginState();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().clearUnlockedStickerIds();
        C30553b.m99810g().onFlipChatMsgUnbind(false);
        C28205ai.m92708d();
        C32430a.m105065c();
        ServiceManager.get().getService(C41974f.class);
        C42961az.m136380a(new C23289h());
        C43122ff.m136757a();
        C32650a.m105730a();
        C32650a.m105733b();
        AnchorListManager.m80516a();
        return bundle;
    }

    /* renamed from: e */
    static final /* synthetic */ Bundle m105760e(Bundle bundle) throws Exception {
        f85120a = true;
        bundle.putBoolean("is_start_by_switch_account", true);
        C22345t.m73985l(false);
        SharePrefCache.inst().clearCache();
        C34315c.m110983c();
        C34315c.m110980a(false, 5);
        C23549b.m77335a().afterSwitchAccount();
        C29983a.m98302a().mo76181d();
        C29971b.m98269a();
        C29971b.m98270b();
        C37562ao.m120324a().mo94851a(C32671m.f85135a);
        C37562ao.m120324a().mo94849a(3);
        SearchHistoryManager.inst().clearForAccountChange();
        C7213d.m22500a().mo18707b();
        C6861a.m21337f().checkIn();
        if (!C6861a.m21337f().isChildrenMode() || C6861a.m21337f().allUidList().size() <= 1) {
            bundle.putInt("switch_account_success_toast_res_id", R.string.e4i);
        } else {
            C6861a.m21337f().logoutAllBackgroundUser().mo19128a();
            bundle.putInt("switch_account_success_toast_res_id", R.string.b5t);
        }
        C30553b.m99810g().resetLoginState();
        m105755b();
        TimeLockRuler.clearCache();
        ParentalPlatformConfig.f60133a.mo59213a(null);
        C41556j.m132334a();
        bundle.putBoolean("need_restart", true);
        C32430a.m105065c();
        m105753a();
        AnchorListManager.m80516a();
        C25789b.f68199a.mo66978c();
        C43122ff.m136757a();
        C32650a.m105732a("switch_account");
        return bundle;
    }

    /* renamed from: f */
    static final /* synthetic */ Bundle m105761f(Bundle bundle) throws Exception {
        AppLog.setUserId(Long.parseLong(C6861a.m21337f().getCurUserId()));
        AppLog.setSessionKey(C6861a.m21337f().getSessionKey());
        C22345t.m73985l(false);
        C29983a.m98302a().mo76181d();
        C29971b.m98269a();
        C29971b.m98270b();
        C37562ao.m120324a().mo94851a(C32675n.f85143a);
        C37562ao.m120324a().mo94849a(3);
        C7213d.m22500a().mo18707b();
        C21115b.m71197a().checkIn();
        if (C6399b.m19944t()) {
            C23549b.m77335a().afterLogIn();
        }
        C30553b.m99810g().refreshLoginState();
        SharePrefCache.inst().getTodayVideoPlayTime().mo59871a(Long.valueOf(0));
        m105763h(bundle);
        if (((Boolean) SharePrefCache.inst().getIsFirstLaunch().mo59877d()).booleanValue()) {
            SharePrefCache.inst().getIsFirstLaunch().mo59871a(Boolean.valueOf(false));
        }
        C34315c.m110980a(false, 5);
        C32430a.m105065c();
        AnchorListManager.m80516a();
        m105753a();
        C25789b.f68199a.mo66978c();
        C43122ff.m136757a();
        C32650a.m105732a("log_in");
        return bundle;
    }
}
