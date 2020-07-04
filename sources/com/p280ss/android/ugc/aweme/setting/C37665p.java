package com.p280ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.C6600e;
import com.google.gson.C6709k;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.p1062f.C23338f;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25054b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.friends.p1282b.C30036a;
import com.p280ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.SettingsUtil;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import com.p280ss.android.ugc.aweme.main.p1382d.C32955d;
import com.p280ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.p280ss.android.ugc.aweme.setting.personalization.p1525c.C37686a.C37687a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41563o;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.setting.p */
public final class C37665p extends C37562ao {

    /* renamed from: a */
    C6600e f98136a;

    /* renamed from: a */
    public final void mo94853a(Object obj) {
        Object obj2 = obj;
        if (obj2 instanceof Exception) {
            m120490a((AwemeSettings) null, ((Exception) obj2).getMessage());
            C7208as.m22479a().mo18704a(1, false);
            return;
        }
        C7208as.m22479a().mo18704a(1, true);
        if (obj2 instanceof C6709k) {
            AtomicReference atomicReference = new AtomicReference();
            AtomicReference atomicReference2 = new AtomicReference();
            AtomicReference atomicReference3 = new AtomicReference();
            AtomicReference atomicReference4 = new AtomicReference();
            AtomicReference atomicReference5 = new AtomicReference();
            AtomicReference atomicReference6 = new AtomicReference();
            C37695q qVar = new C37695q(this, obj, atomicReference3, atomicReference, atomicReference2, atomicReference4, atomicReference5, atomicReference6);
            C1592h a = C1592h.m7855a((Callable<TResult>) qVar, (Executor) C7258h.m22730c());
            C37696r rVar = new C37696r(this, atomicReference4, atomicReference3, atomicReference, atomicReference5, atomicReference6, atomicReference2);
            a.mo6876a((C1591g<TResult, TContinuationResult>) rVar, C1592h.f5958b);
        }
    }

    /* renamed from: b */
    private static void m120491b(long j) {
        C1592h.m7855a((Callable<TResult>) new C37697s<TResult>(j), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m120487a(long j) throws Exception {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_duration", j);
            C6877n.m21444a("settings_response_cost_duration", 1, C6869c.m21382a(jSONObject).mo16888b());
        } catch (Exception unused) {
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo95006b(AwemeSettings awemeSettings) throws Exception {
        mo94852a(awemeSettings);
        C42961az.m136380a(new C32955d());
        return null;
    }

    /* renamed from: a */
    public final void mo94852a(AwemeSettings awemeSettings) {
        if (awemeSettings != null) {
            super.mo94852a(awemeSettings);
            m120490a(awemeSettings, (String) null);
        }
    }

    /* renamed from: a */
    public final void mo94850a(int i, Context context) {
        super.mo94850a(i, context);
    }

    /* renamed from: a */
    private static void m120490a(AwemeSettings awemeSettings, String str) {
        C1592h.m7855a((Callable<TResult>) new C37733t<TResult>(str, awemeSettings), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    static final /* synthetic */ Object m120488a(String str, AwemeSettings awemeSettings) throws Exception {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("error_log", str);
            }
            boolean z = true;
            if (awemeSettings != null) {
                i = 0;
            } else {
                i = 1;
            }
            if (awemeSettings != null) {
                jSONObject.put("can_be_live_podcast", awemeSettings.canLive);
                jSONObject.put("cpu_is_x86", C41563o.m132356a());
                String str2 = "is_5.0_device";
                if (VERSION.SDK_INT < 21) {
                    z = false;
                }
                jSONObject.put(str2, z);
            }
            C6893q.m21444a("service_setting_log", i, jSONObject);
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: a */
    public final void mo94826a(Editor editor, AwemeSettings awemeSettings) {
        if (awemeSettings != null) {
            C22345t.m73963b(awemeSettings.disableAgeGate);
            C22345t.m73966c(awemeSettings.enableFtcAgeGate);
            SharePrefCache.inst().getDeviceInfoUrl().mo59871a(awemeSettings.deviceInfoUrl);
            C6600e eVar = new C6600e();
            SharePrefCache.inst().getHttpRetryInterval().mo59871a(Long.valueOf(awemeSettings.httpRetryInterval));
            SharePrefCache.inst().getHttpTimeOut().mo59871a(Long.valueOf(awemeSettings.httpTimeOut));
            SharePrefCache.inst().getVideoBitrate().mo59871a(Float.valueOf(awemeSettings.videoBitrate));
            if (awemeSettings.videoCompose > 0) {
                SharePrefCache.inst().getVideoCompose().mo59871a(Integer.valueOf(awemeSettings.videoCompose));
            }
            if (awemeSettings.videoCommit > 0) {
                SharePrefCache.inst().getVideoCommit().mo59871a(Integer.valueOf(awemeSettings.videoCommit));
            }
            C23060u.m75742a().mo60062af().mo59871a(Integer.valueOf(awemeSettings.isShowGifButton));
            SharePrefCache.inst().getWeakNetPreLoadSwitch().mo59871a(Integer.valueOf(awemeSettings.weakNetPreLoadSwitch));
            SharePrefCache.inst().getSyntheticVideoBitrate().mo59871a(Float.valueOf(awemeSettings.syntheticVideoBitrate));
            SharePrefCache.inst().getIsPrivateAvailable().mo59871a(Boolean.valueOf(awemeSettings.isPrivateAvailable));
            SharePrefCache.inst().getLongVideoPermitted().mo59871a(Boolean.valueOf(awemeSettings.longVideoPermitted));
            SharePrefCache.inst().getLongVideoThreshold().mo59871a(Long.valueOf(awemeSettings.longVideoThreshold));
            SharePrefCache.inst().getProgressbarThreshold().mo59871a(Long.valueOf(awemeSettings.progressBarThreshold));
            SharePrefCache.inst().getUserResidence().mo59871a(awemeSettings.regionOfResidence);
            SharePrefCache.inst().getUserCurrentRegion().mo59871a(awemeSettings.currentRegion);
            SharePrefCache.inst().getAdLandingPageConfig().mo59871a(eVar.mo15979b((Object) awemeSettings.adLandingPageConfig));
            SharePrefCache.inst().getDownloadSdkConfig().mo59871a(eVar.mo15979b(awemeSettings.downloadSdkConfig));
            SharePrefCache.inst().getFollowUserThreshold().mo59871a(Integer.valueOf(awemeSettings.followPopularThreshold));
            SharePrefCache.inst().setShowInvitedContactsFriends(Boolean.valueOf(awemeSettings.mShowInviteFriends));
            SharePrefCache.inst().getShowPromoteLicense().mo59871a(Integer.valueOf(awemeSettings.showPromoteLicense));
            SharePrefCache.inst().getIsEuropeCountry().mo59871a(Boolean.valueOf(awemeSettings.isEuropeCountry));
            SharePrefCache.inst().getUseLiveWallpaper().mo59871a(Integer.valueOf(awemeSettings.useLiveWallpaper));
            SharePrefCache.inst().getIsEnableLocalMusicEntrance().mo59871a(Boolean.valueOf(awemeSettings.enableLocalMusicEntrance));
            SharePrefCache.inst().getReferralEntrance().mo59871a(awemeSettings.referralProgramUrl);
            C23060u.m75742a().mo60091u().mo59871a(awemeSettings.mGDPRCookiesUrl);
            C23060u.m75742a().mo60061ae().mo59871a(awemeSettings.mGDPRPrivacyUrl);
            C23060u.m75742a().mo60060ad().mo59871a(awemeSettings.isEEARegion);
            C37687a.m120535e(awemeSettings.isEEARegion.booleanValue());
            C22903bl M = C23060u.m75742a().mo60043M();
            boolean z = true;
            if (awemeSettings.commentSettingEnable != 1) {
                z = false;
            }
            M.mo59871a(Boolean.valueOf(z));
            C23060u.m75742a().mo60085o().mo59871a(Boolean.valueOf(awemeSettings.policyNoticeEnanble));
            if (awemeSettings.needChooseLanguages != null) {
                SharePrefCache.inst().getNeedChooseLanguages().mo59871a(eVar.mo15979b((Object) awemeSettings.needChooseLanguages));
            } else {
                SharePrefCache.inst().getNeedChooseLanguages().mo59871a("");
            }
            C25054b.m82490a();
            C25054b.m82492a(awemeSettings.awesomeSplashFilterEnable);
            C23060u.m75742a().mo60053W().mo59871a(awemeSettings.bindFGGuideTexts);
            C30036a.m98493b().mo76282a(awemeSettings.mInviteFriendsStrategy);
            if (awemeSettings.globalTips != null) {
                C23338f.m76567e().mo60632b("place_holder", this.f97973d.search_tips);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo95004a(Object obj, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4, AtomicReference atomicReference5, AtomicReference atomicReference6) throws Exception {
        try {
            C6709k kVar = (C6709k) obj;
            atomicReference.set(SettingsManagerProxy.inst().getGson().mo15970a(kVar, IESSettings.class));
            atomicReference2.set(kVar.toString());
            atomicReference3.set(obj.toString());
        } catch (Throwable th) {
            atomicReference4.set(th);
        }
        try {
            if (this.f98136a == null) {
                this.f98136a = C10944e.m32113a();
            }
            atomicReference5.set(this.f98136a.mo15970a((C6709k) obj, AwemeSettings.class));
        } catch (Throwable th2) {
            atomicReference6.set(th2);
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo95005a(AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, AtomicReference atomicReference4, AtomicReference atomicReference5, AtomicReference atomicReference6, C1592h hVar) throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        if (C6384b.m19835a().mo15292a(AsyncSettingsExperiment.class, true, "is_async_setting", C6384b.m19835a().mo15295d().is_async_setting, true)) {
            C1592h.m7855a((Callable<TResult>) new C37734u<TResult>(atomicReference, atomicReference2, atomicReference3), (Executor) C7258h.m22730c());
        } else {
            SettingsManagerProxy.inst().notifySettingsChange((Throwable) atomicReference.get(), (IESSettings) atomicReference2.get(), (String) atomicReference3.get());
        }
        AwemeSettings awemeSettings = (AwemeSettings) atomicReference4.get();
        if (atomicReference5.get() != null) {
            SettingsUtil.m98824a((Throwable) atomicReference5.get());
            SettingsUtil.m98826a((Throwable) atomicReference5.get(), "I18nSettingManager", (String) atomicReference6.get());
            return null;
        }
        SettingsUtil.m98826a((Throwable) null, "I18nSettingManager", (String) atomicReference6.get());
        if (awemeSettings == null) {
            return null;
        }
        if (C6384b.m19835a().mo15292a(AsyncSettingsExperiment.class, true, "is_async_setting", C6384b.m19835a().mo15295d().is_async_setting, true)) {
            C1592h.m7855a((Callable<TResult>) new C37937v<TResult>(this, awemeSettings), (Executor) C7258h.m22730c());
        } else {
            mo94852a(awemeSettings);
            C42961az.m136380a(new C32955d());
        }
        if (awemeSettings.globalTips != null) {
            this.f97973d = awemeSettings.globalTips;
        }
        m120491b(System.currentTimeMillis() - currentTimeMillis);
        return null;
    }
}
