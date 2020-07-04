package com.p280ss.android.ugc.aweme.i18n.language;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.utils.C23484l;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25223ae;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.i18n.language.p1303a.C30468e;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.language.C7120e;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.login.larksso.LarkSsoHelper;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.trill.language.C45026f.C45027a;
import com.p280ss.android.ugc.trill.p1764f.C44995c;
import com.p280ss.android.ugc.trill.p1765g.C45000d;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl */
public class I18nManagerServiceImpl implements I18nManagerService {
    public String getRNLanguage() {
        return null;
    }

    public int[] getZipBeautyFaceResIds() {
        return null;
    }

    public void switchLanguage(String str, Context context) {
    }

    public String getAppLogRegion() {
        return C30468e.m99516h();
    }

    public Locale getCountryLocale() {
        return C30468e.m99518l();
    }

    public Map<String, C7120e> getLocaleMap() {
        return C30468e.m99511a().f80055b;
    }

    public String getSimCountry() {
        return C30468e.m99514e();
    }

    public String getSysRegion() {
        return C30468e.m99515f();
    }

    public boolean isIndonesiaByMcc() {
        return C30468e.m99517i();
    }

    public String getAppLanguage() {
        return C30468e.m99511a().mo80143c();
    }

    public List<C7120e> getI18nItems() {
        return C30468e.m99511a().mo80142b();
    }

    public String getRegion() {
        return C30468e.m99511a().mo80145g();
    }

    public String getSysLanguage() {
        return C30468e.m99511a().mo80144d();
    }

    public boolean isKorean() {
        return C30468e.m99511a().mo80146j();
    }

    public void installCommonParams() {
        NetUtil.setExtraparams(new C30462a(this));
        NetUtil.addCustomParams("mcc_mnc", C23484l.m77112a());
        NetUtil.addCustomParams("is_my_cn", String.valueOf(C45000d.m141977a().f115670a));
        NetUtil.addCustomParams("app_type", "normal");
        NetUtil.addCustomParams("timezone_name", TimeZone.getDefault().getID());
        NetUtil.addCustomParams("current_region", (String) SharePrefCache.inst().getUserCurrentRegion().mo59877d());
        NetUtil.addCustomParams("residence", (String) SharePrefCache.inst().getUserResidence().mo59877d());
        NetUtil.addCustomParams("carrier_region_v2", (String) C44995c.m141967a().mo107511b());
        NetUtil.addCustomParams("sys_region", getSysRegion());
        NetUtil.addCustomParams("language", getSysLanguage());
        if (C6399b.m19947w() && C7212bb.m22493a()) {
            NetUtil.addCustomParams("app_skin", "white");
        }
        if (!((Boolean) SharePrefCache.inst().getTTRegion().mo59877d()).booleanValue()) {
            NetUtil.addCustomParams("pass-region", "1");
        }
        if (!((Boolean) SharePrefCache.inst().getTTRoute().mo59877d()).booleanValue()) {
            NetUtil.addCustomParams("pass-route", "1");
        }
        User curUser = C21115b.m71197a().getCurUser();
        if (curUser != null) {
            String accountRegion = curUser.getAccountRegion();
            if (accountRegion != null && !accountRegion.isEmpty()) {
                NetUtil.addCustomParams("account_region", accountRegion);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ HashMap lambda$installCommonParams$0$I18nManagerServiceImpl() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_language", getAppLanguage());
        hashMap.put("uoo", String.valueOf(C25223ae.m82934a() ? 1 : 0));
        hashMap.put("build_number", C6399b.m19940p());
        hashMap.put("locale", C30476b.m99553b());
        hashMap.put("timezone_offset", String.valueOf(TimeZone.getDefault().getRawOffset() / 1000));
        hashMap.put("carrier_region", C32326h.m104886h());
        hashMap.put("region", getRegion());
        hashMap.put("op_region", C32326h.m104872a());
        hashMap.put("ts", String.valueOf(NetworkUtils.getServerTime()));
        if (C7163a.m22363a()) {
            String r = C6399b.m19942r();
            if (TextUtils.equals("local_test", r) && ((IAVService) ServiceManager.get().getService(IAVService.class)).getUsingOnline()) {
                r = "default";
            }
            hashMap.put("effect_channel", r);
            hashMap.put("fake_region", C32326h.m104886h());
        }
        Map b = C32326h.m104878b();
        if (LarkSsoHelper.m105778b() && b != null && b.size() > 0) {
            hashMap.putAll(b);
        }
        hashMap.put("ac2", String.valueOf(com.bytedance.common.utility.NetworkUtils.m19551e(C6399b.m19921a())));
        hashMap.put("content_language", C45027a.m142034a().mo107547b());
        return hashMap;
    }

    public String getLanguage(Locale locale) {
        return C30468e.m99512a(locale);
    }

    public boolean isArabicLang(Context context) {
        return C30468e.m99513b(context);
    }

    public C7120e getCurrentI18nItem(Context context) {
        return C30468e.m99511a().mo80139a(context);
    }

    public Locale getLocale(String str) {
        return C30468e.m99511a().mo80140a(str);
    }
}
