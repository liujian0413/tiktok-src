package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.JsonSyntaxException;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commerce.CommerceInfo;
import com.p280ss.android.ugc.aweme.commerce.SmartPhone;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.PreloadData;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.model.C24990c;
import com.p280ss.android.ugc.aweme.commercialize.model.DouPlusLinkData;
import com.p280ss.android.ugc.aweme.commercialize.model.EasterEggInfo;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.p280ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p280ss.android.ugc.aweme.experiment.LinkMigrationExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p280ss.android.ugc.aweme.feed.model.CardStruct;
import com.p280ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.miniapp_api.C33447f;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.e */
public final class C25352e extends C25329c {
    /* renamed from: a */
    public static String m83320a() {
        return "";
    }

    /* renamed from: a */
    public static String m83321a(int i) {
        switch (i) {
            case 1:
                return "reviewing";
            case 2:
                return "review_reject";
            case 3:
                return "advertiser_confirming";
            case 4:
                return "advertiser_reject";
            case 6:
                return "advertiser_ready";
            case 7:
                return "advertiser_schedule";
            default:
                return "";
        }
    }

    /* renamed from: i */
    private static boolean m83371i(EasterEggInfo easterEggInfo) {
        return easterEggInfo == null;
    }

    /* renamed from: a */
    public static boolean m83328a(CardStruct cardStruct) {
        if (cardStruct == null) {
            return false;
        }
        if (cardStruct.getCardType() == 8 || cardStruct.getCardType() == 9) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m83327a(Challenge challenge) {
        if (!C6399b.m19944t() || challenge == null) {
            return false;
        }
        ChallengeDisclaimer challengeDisclaimer = challenge.getChallengeDisclaimer();
        if (challengeDisclaimer != null && !TextUtils.isEmpty(challengeDisclaimer.getTitle()) && !TextUtils.isEmpty(challengeDisclaimer.getContent())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m83326a(UrlModel urlModel) {
        if (urlModel != null && !C6307b.m19566a((Collection<T>) urlModel.getUrlList()) && !TextUtils.isEmpty((CharSequence) urlModel.getUrlList().get(0))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m83325a(String str, String str2) {
        return m83361c(str) ? str.replace("__back_url__", Uri.encode(str2)) : str;
    }

    /* renamed from: b */
    public static boolean m83352b() {
        try {
            return C30199h.m98861a().getBioSettings().getEnableBioUrl().booleanValue();
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m83364d() {
        if (!C6384b.m19835a().mo15292a(LinkMigrationExperiment.class, true, "enable_link_ad_migration", C6384b.m19835a().mo15295d().enable_link_ad_migration, true) || !C6399b.m19945u()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m83359c() {
        try {
            return C30199h.m98861a().getBioSettings().getEnableBioEmail().booleanValue();
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: T */
    public static boolean m83309T(Aweme aweme) {
        CardStruct w = m83240w(aweme);
        if (w == null || w.getCardType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: V */
    public static boolean m83311V(Aweme aweme) {
        if (m83312W(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: ah */
    public static int m83336ah(Aweme aweme) {
        AwemeRawAd l = m83229l(aweme);
        if (l == null) {
            return 2;
        }
        return l.getShowMaskTimes();
    }

    /* renamed from: ai */
    public static boolean m83337ai(Aweme aweme) {
        AwemeSplashInfo m = m83230m(aweme);
        if (m == null) {
            return false;
        }
        return m.adCardShownOnce;
    }

    /* renamed from: aj */
    public static void m83338aj(Aweme aweme) {
        AwemeSplashInfo m = m83230m(aweme);
        if (m != null) {
            m.adCardShownOnce = true;
        }
    }

    /* renamed from: ak */
    public static String m83339ak(Aweme aweme) {
        AwemeSplashInfo m = m83230m(aweme);
        if (m == null) {
            return null;
        }
        return m.getAwesomeSplashId();
    }

    /* renamed from: b */
    public static SmartPhone m83350b(User user) {
        if (user == null) {
            return null;
        }
        CommerceInfo commerceInfo = user.getCommerceInfo();
        if (commerceInfo == null) {
            return null;
        }
        return commerceInfo.getSmartPhone();
    }

    /* renamed from: c */
    public static String m83357c(EasterEggInfo easterEggInfo) {
        if (m83371i(easterEggInfo)) {
            return "";
        }
        return easterEggInfo.getId();
    }

    /* renamed from: f */
    public static String m83368f(EasterEggInfo easterEggInfo) {
        if (m83371i(easterEggInfo)) {
            return "";
        }
        return easterEggInfo.getOpenUrl();
    }

    /* renamed from: g */
    public static String m83369g(EasterEggInfo easterEggInfo) {
        if (m83371i(easterEggInfo)) {
            return "";
        }
        return easterEggInfo.getWebUrl();
    }

    /* renamed from: h */
    public static String m83370h(EasterEggInfo easterEggInfo) {
        if (m83371i(easterEggInfo)) {
            return "";
        }
        return easterEggInfo.getWebTitle();
    }

    /* renamed from: M */
    public static String m83302M(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getFormUrl();
    }

    /* renamed from: N */
    public static String m83303N(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getWebUrl();
    }

    /* renamed from: O */
    public static String m83304O(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getWebTitle();
    }

    /* renamed from: P */
    public static String m83305P(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getPackageName();
    }

    /* renamed from: R */
    public static boolean m83307R(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getPlayFunModel() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: S */
    public static boolean m83308S(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        SpecialSticker specialSticker = aweme.getSpecialSticker();
        if (specialSticker == null || specialSticker.getStickerType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public static DouPlusLinkData m83312W(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getDouPlusLinkData();
    }

    /* renamed from: Z */
    public static boolean m83315Z(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getButtonStyle() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: aa */
    public static boolean m83329aa(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getButtonStyle() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: ab */
    public static boolean m83330ab(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdHintData() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: af */
    public static String m83334af(Aweme aweme) {
        String str = "";
        AwemeRawAd l = m83229l(aweme);
        if (l == null) {
            return str;
        }
        Music music = l.getMusic();
        if (music == null) {
            return str;
        }
        String musicName = music.getMusicName();
        if (TextUtils.isEmpty(musicName)) {
            musicName = "";
        }
        return musicName;
    }

    /* renamed from: ag */
    public static String m83335ag(Aweme aweme) {
        String str = "";
        AwemeRawAd l = m83229l(aweme);
        if (l == null) {
            return str;
        }
        AwemeTextLabelModel label = l.getLabel();
        if (label == null) {
            return str;
        }
        String labelName = label.getLabelName();
        if (TextUtils.isEmpty(labelName)) {
            labelName = "";
        }
        return labelName;
    }

    /* renamed from: al */
    public static boolean m83340al(Aweme aweme) {
        AwemeSplashInfo m = m83230m(aweme);
        if (m != null && ((long) m.getEndTime()) >= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: ao */
    public static boolean m83343ao(Aweme aweme) {
        if (!C6399b.m19944t() || aweme == null || !aweme.isAd() || C6307b.m19566a((Collection<T>) aweme.getAwemeRawAd().getPlaybackSecondsTrackList())) {
            return false;
        }
        return true;
    }

    /* renamed from: aq */
    public static boolean m83345aq(Aweme aweme) {
        if (!C6399b.m19944t() || aweme == null || !aweme.isAd() || !aweme.getAwemeRawAd().isOpenSystemBrowser()) {
            return false;
        }
        return true;
    }

    /* renamed from: at */
    private static String m83348at(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getType();
    }

    /* renamed from: b */
    public static String m83351b(Challenge challenge) {
        if (!m83327a(challenge)) {
            return "";
        }
        return challenge.getChallengeDisclaimer().getTitle();
    }

    /* renamed from: c */
    public static int m83355c(List<DiscoverItemData> list) {
        if (list == null) {
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            if (((DiscoverItemData) list.get(i)).getType() == 5) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: d */
    public static boolean m83365d(Challenge challenge) {
        if (challenge != null && !TextUtils.isEmpty(challenge.getLinkText()) && !TextUtils.isEmpty(challenge.getLinkAction())) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static UrlModel m83367e(EasterEggInfo easterEggInfo) {
        if (m83371i(easterEggInfo)) {
            return new UrlModel();
        }
        return easterEggInfo.getSourceUrl();
    }

    /* renamed from: Q */
    public static boolean m83306Q(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!TextUtils.equals(awemeRawAd.getType(), "redpacket")) {
            return false;
        }
        UrlModel redImageUrl = awemeRawAd.getRedImageUrl();
        if (redImageUrl == null || C6307b.m19566a((Collection<T>) redImageUrl.getUrlList())) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public static CardStruct m83310U(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getCardInfos() == null || !aweme.getAwemeRawAd().getCardInfos().containsKey("5")) {
            return null;
        }
        return (CardStruct) aweme.getAwemeRawAd().getCardInfos().get("5");
    }

    /* renamed from: X */
    public static boolean m83313X(Aweme aweme) {
        if (C6399b.m19944t() || aweme == null || !aweme.isAd() || !TextUtils.equals(aweme.getAwemeRawAd().getType(), "app")) {
            return false;
        }
        return true;
    }

    /* renamed from: Y */
    public static boolean m83314Y(Aweme aweme) {
        if (!m83313X(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!C6776h.m20948b(C6399b.m19921a(), awemeRawAd.getPackageName()) && TextUtils.isEmpty(awemeRawAd.getQuickAppUrl()) && awemeRawAd.getDownloadMode() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: ae */
    public static Bundle m83333ae(Aweme aweme) {
        Bundle ac = m83331ac(aweme);
        CardStruct U = m83310U(aweme);
        if (U != null && !TextUtils.isEmpty(U.getCardUrl())) {
            ac.putString("url", U.getCardUrl());
            ac.putBoolean("use_css_injection", false);
        }
        if (C25384x.m83529a(aweme)) {
            ac.putBoolean("show_load_dialog", true);
        }
        return ac;
    }

    /* renamed from: am */
    public static boolean m83341am(Aweme aweme) {
        if (!C6399b.m19944t()) {
            return false;
        }
        AwemeRawAd l = m83229l(aweme);
        if (l == null || !l.isPopUps()) {
            return false;
        }
        String openUrl = l.getOpenUrl();
        if (TextUtils.isEmpty(openUrl)) {
            return false;
        }
        return C25371n.m83478c(openUrl);
    }

    /* renamed from: an */
    public static boolean m83342an(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (C33447f.m108191d(openUrl) || (C33447f.m108191d(microAppUrl) && !C25371n.m83473b(openUrl))) {
            return true;
        }
        return false;
    }

    /* renamed from: ap */
    public static boolean m83344ap(Aweme aweme) {
        if (!m83221d(aweme) || aweme.getAwemeRawAd().getSplashInfo() == null || !aweme.getAwemeRawAd().getSplashInfo().isDisableHotStartShow()) {
            return false;
        }
        return true;
    }

    /* renamed from: as */
    private static String m83347as(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getDefaultCardInfo() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getDefaultCardInfo().getCardUrl();
    }

    /* renamed from: c */
    public static String m83358c(Challenge challenge) {
        if (!m83327a(challenge)) {
            return "";
        }
        return challenge.getChallengeDisclaimer().getContent();
    }

    /* renamed from: d */
    public static String m83363d(EasterEggInfo easterEggInfo) {
        if (m83371i(easterEggInfo)) {
            return "";
        }
        if (easterEggInfo.getSourceUrl() == null) {
            return "";
        }
        if (C6307b.m19566a((Collection<T>) easterEggInfo.getSourceUrl().getUrlList())) {
            return "";
        }
        return (String) easterEggInfo.getSourceUrl().getUrlList().get(0);
    }

    /* renamed from: a */
    public static Bundle m83317a(C24990c cVar) {
        if (cVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("ad_id", cVar.f65887a);
        bundle.putLong("aweme_creative_id", cVar.f65887a);
        bundle.putString("bundle_download_app_log_extra", cVar.f65888b);
        bundle.putString("group_id", String.valueOf(cVar.f65889c));
        bundle.putString("ad_type", cVar.f65896j);
        bundle.putInt("ad_system_origin", cVar.f65897k);
        if (!TextUtils.isEmpty(cVar.f65893g)) {
            bundle.putString("bundle_download_url", cVar.f65893g);
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("aweme_package_name", cVar.f65894h);
            bundle.putString("bundle_download_app_name", cVar.f65895i);
        }
        bundle.putString("ad_js_url", (String) SharePrefCache.inst().getJsActlogUrl().mo59877d());
        if (cVar.f65898l != null) {
            bundle.putString("aweme_id", cVar.f65898l.getAid());
        }
        return bundle;
    }

    /* renamed from: ad */
    public static Bundle m83332ad(Aweme aweme) {
        Bundle ac = m83331ac(aweme);
        CardStruct F = m83204F(aweme);
        if (F != null && !TextUtils.isEmpty(F.getCardUrl()) && m83328a(F)) {
            ac.putString("url", Uri.parse(F.getCardUrl()).buildUpon().appendQueryParameter("type", "4").toString());
            ac.putBoolean("use_css_injection", false);
        } else if (F != null && !TextUtils.isEmpty(F.getCardUrl()) && F.getCardType() == 1001) {
            ac.putString("url", F.getCardUrl());
        }
        ac.putBoolean("show_load_dialog", true);
        return ac;
    }

    /* renamed from: ar */
    private static String m83346ar(Aweme aweme) {
        if (m83202D(aweme)) {
            String as = m83347as(aweme);
            if (!TextUtils.isEmpty(as)) {
                return as;
            }
        }
        if (TextUtils.equals(m83348at(aweme), "form")) {
            return m83302M(aweme);
        }
        if (TextUtils.equals(m83348at(aweme), "app")) {
            return m83241x(aweme);
        }
        if (TextUtils.equals(m83348at(aweme), "web")) {
            return m83303N(aweme);
        }
        return "";
    }

    /* renamed from: b */
    public static boolean m83353b(EasterEggInfo easterEggInfo) {
        String a = m83322a(easterEggInfo);
        if (TextUtils.equals(a, "web") || TextUtils.equals(a, "gif") || TextUtils.equals(a, "webp")) {
            return true;
        }
        return false;
    }

    /* renamed from: ac */
    public static Bundle m83331ac(Aweme aweme) {
        Bundle bundle = new Bundle();
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return bundle;
        }
        long longValue = aweme.getAwemeRawAd().getCreativeId().longValue();
        String logExtra = aweme.getAwemeRawAd().getLogExtra();
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        String quickAppUrl = aweme.getAwemeRawAd().getQuickAppUrl();
        String ar = m83346ar(aweme);
        if (m83328a(m83240w(aweme))) {
            ar = Uri.parse(ar).buildUpon().appendQueryParameter("type", "3").toString();
        }
        bundle.putString("url", ar);
        bundle.putLong("ad_id", longValue);
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putString("ad_js_url", (String) SharePrefCache.inst().getJsActlogUrl().mo59877d());
        bundle.putString("aweme_id", aweme.getAid());
        bundle.putBoolean("show_load_dialog", false);
        bundle.putString("bundle_download_app_log_extra", logExtra);
        bundle.putString("bundle_download_url", downloadUrl);
        bundle.putString("bundle_ad_quick_app_url", quickAppUrl);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putBoolean("bundle_show_download_status_bar", false);
        if (!TextUtils.equals("SM-G9550", Build.MODEL) || !TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            bundle.putBoolean("bundle_fix_webview", false);
        }
        PreloadData preloadData = aweme.getAwemeRawAd().getPreloadData();
        if (preloadData != null) {
            bundle.putString("preload_site_id", preloadData.getSiteId());
        }
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        return bundle;
    }

    /* renamed from: b */
    public static boolean m83354b(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("sslocal://showcaseh5") && str.contains("url=")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m83366d(User user) {
        if (user == null || user.getQuickShopInfo() == null || TextUtils.isEmpty(user.getQuickShopInfo().getQuickShopUrl()) || user.getQuickShopInfo().getSecondFloorInfo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m83322a(EasterEggInfo easterEggInfo) {
        if (m83371i(easterEggInfo)) {
            return "";
        }
        return easterEggInfo.getSourceType();
    }

    /* renamed from: c */
    public static boolean m83360c(User user) {
        if (user == null || user.getQuickShopInfo() == null || TextUtils.isEmpty(user.getQuickShopInfo().getQuickShopUrl()) || !user.getQuickShopInfo().isWithTextEntry()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m83323a(AwemeRawAd awemeRawAd) {
        if (TextUtils.isEmpty(awemeRawAd.getHomepageBottomTextual())) {
            return AwemeApplication.m21341a().getString(R.string.f124284do);
        }
        return awemeRawAd.getHomepageBottomTextual();
    }

    /* renamed from: c */
    public static boolean m83361c(String str) {
        if (str == null || !str.contains("__back_url__")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m83324a(User user) {
        SmartPhone b = m83350b(user);
        if (b == null) {
            return null;
        }
        return b.getEncryptKey();
    }

    /* renamed from: a */
    public static <T> T m83318a(String str, Class<T> cls) {
        try {
            return C10944e.m32113a().mo15974a(str, cls);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m83319a(String str, Type type) {
        try {
            return C10944e.m32113a().mo15975a(str, type);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Bundle m83362d(Bundle bundle, Aweme aweme, Context context) {
        if (context == null) {
            return bundle;
        }
        bundle.putInt("bundle_app_ad_from", 1);
        bundle.putBoolean("bundle_is_ad_fake", true);
        return bundle;
    }

    /* renamed from: a */
    public static Bundle m83316a(Bundle bundle, Aweme aweme, Context context) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return bundle;
        }
        bundle.putString("url", aweme.getAwemeRawAd().getWebUrl());
        bundle.putString("aweme_id", aweme.getAid());
        bundle.putBoolean("control_request_url", true);
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m83356c(Bundle bundle, Aweme aweme, Context context) {
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return bundle;
        }
        String webTitle = aweme.getAwemeRawAd().getWebTitle();
        if (C6399b.m19944t() && TextUtils.isEmpty(webTitle)) {
            webTitle = " ";
        }
        bundle.putString("bundle_web_title", webTitle);
        boolean z = true;
        bundle.putBoolean("bundle_nav_bar_status_padding", true);
        if (context == null || !aweme.getAwemeRawAd().isUseDefaultColor()) {
            bundle.putInt("bundle_webview_background", -1);
        } else {
            bundle.putInt("bundle_webview_background", context.getResources().getColor(R.color.a6c));
        }
        bundle.putBoolean("show_report", aweme.getAwemeRawAd().isReportEnable());
        bundle.putBoolean("use_ordinary_web", aweme.getAwemeRawAd().isUseOrdinaryWeb());
        if (aweme.getAwemeRawAd().getWebviewProgressBar() != 1) {
            z = false;
        }
        bundle.putBoolean("webview_progress_bar", z);
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m83349b(Bundle bundle, Aweme aweme, Context context) {
        String str;
        String str2;
        if (context == null || aweme == null || aweme.getAwemeRawAd() == null) {
            return bundle;
        }
        Long creativeId = aweme.getAwemeRawAd().getCreativeId();
        bundle.putString("bundle_download_app_extra", String.valueOf(aweme.getAwemeRawAd().getCreativeId()));
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        if (!TextUtils.isEmpty(downloadUrl)) {
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("bundle_download_url", downloadUrl);
            bundle.putString("bundle_ad_quick_app_url", aweme.getAwemeRawAd().getQuickAppUrl());
            bundle.putString("aweme_package_name", aweme.getAwemeRawAd().getPackageName());
            if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getAppName())) {
                bundle.putString("bundle_download_app_name", aweme.getAwemeRawAd().getAppName());
            }
            bundle.putInt("bundle_download_mode", aweme.getAwemeRawAd().getDownloadMode());
            bundle.putInt("bundle_link_mode", aweme.getAwemeRawAd().getLinkMode());
            bundle.putBoolean("bundle_support_multiple_download", aweme.getAwemeRawAd().isSupportMultiple());
            bundle.putString("bundle_open_url", aweme.getAwemeRawAd().getOpenUrl());
            bundle.putString("bundle_web_url", aweme.getAwemeRawAd().getWebUrl());
        }
        bundle.putString("bundle_download_app_log_extra", aweme.getAwemeRawAd().getLogExtra());
        String str3 = "bundle_download_app_name";
        if (!TextUtils.isEmpty(aweme.getAwemeRawAd().getSource())) {
            str = aweme.getAwemeRawAd().getSource();
        } else {
            str = aweme.getAwemeRawAd().getWebTitle();
        }
        bundle.putString(str3, str);
        bundle.putBoolean("bundle_disable_download_dialog", aweme.getAwemeRawAd().isDisableDownloadDialog());
        String packageName = aweme.getAwemeRawAd().getPackageName();
        if (!TextUtils.isEmpty(packageName)) {
            bundle.putString("aweme_package_name", packageName);
        }
        JSONObject s = C24976t.m82274s(context, aweme, "");
        String str4 = "aweme_json_extra";
        if (s == null) {
            str2 = "";
        } else {
            str2 = s.toString();
        }
        bundle.putString(str4, str2);
        Long groupId = aweme.getAwemeRawAd().getGroupId();
        if (!(groupId == null || groupId.longValue() == 0)) {
            bundle.putString("aweme_group_id", String.valueOf(groupId));
        }
        if (aweme.getAwemeRawAd().getCreativeId().longValue() != 0) {
            bundle.putString("aweme_creative_id", String.valueOf(creativeId));
        }
        bundle.putLong("ad_id", aweme.getAwemeRawAd().getCreativeId().longValue());
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putInt("web_type", aweme.getAwemeRawAd().getWebType());
        PreloadData preloadData = aweme.getAwemeRawAd().getPreloadData();
        if (preloadData != null) {
            bundle.putString("preload_site_id", preloadData.getSiteId());
        }
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putInt("preload_is_web_url", 1);
        bundle.putBoolean("enable_web_report", aweme.getAwemeRawAd().isEnableWebReport());
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putString("ad_js_url", (String) SharePrefCache.inst().getJsActlogUrl().mo59877d());
        return bundle;
    }
}
